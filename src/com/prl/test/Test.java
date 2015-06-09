/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.test;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;





/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2014-1-13
 */
public class Test {

	/**
	 * @param args
	 */
	public static final Pattern SMS_ADDR_PATTERN = Pattern.compile("((13[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}");
	// 允许时段
	static final Map<Integer, Integer> ALLOW_HOURS = new LinkedHashMap<Integer, Integer>();
	static {
	    int index = 0;
	    for (int h = 0; h < 24; h++) {
	        if (h <= 1 || h >= 6) {  // 0,1,6-23
	            ALLOW_HOURS.put(h, index++);
	        }
	    }
	}
	public static void main(String[] args) throws Exception {
//		String text = "IT科技 	互联网/电子商务 	1nnIT科技 	IT软件与服务 	2nnIT科技 	IT硬件与设备 	3nnIT科技 	电子技术 	4nnIT科技 	通信与运营商 	5nnIT科技 	网络游戏 	6nn金融业 	银行 	7nn金融业 	基金|理财|信托 	8nn金融业 	保险 	9nn餐饮 	餐饮 	10nn酒店旅游 	酒店 	11nn酒店旅游 	旅游 	12nn运输与仓储 	快递 	13nn运输与仓储 	物流 	14nn运输与仓储 	仓储 	15nn教育 	培训 	16nn教育 	院校 	17nn政府与公共事业 	学术科研 	18nn政府与公共事业 	交警 	19nn政府与公共事业 	博物馆 	20nn政府与公共事业 	公共事业|非盈利机构 	21nn医药护理 	医药医疗 	22nn医药护理 	护理美容 	23nn医药护理 	保健与卫生 	24nn交通工具 	汽车相关 	25nn交通工具 	摩托车相关 	26nn交通工具 	火车相关 	27nn交通工具 	飞机相关 	28nn房地产 	建筑 	29nn房地产 	物业 	30nn消费品 	消费品 	31nn商业服务 	法律 	32nn商业服务 	会展 	33nn商业服务 	中介服务 	34nn商业服务 	认证 	35nn商业服务 	审计 	36nn文体娱乐 	传媒 	37nn文体娱乐 	体育 	38nn文体娱乐 	娱乐休闲 	39nn印刷 	印刷 	40nn其它 	其它 	41 ";
//		String[] tt = text.split("nn");
//		Set<String> lst = new HashSet<String>();
//		for (String t : tt) {
//			t = t.replace(" 	", " ").replace(" 	", " ");
//			String[] ss = t.split(" ");
//			if (!lst.contains(ss[0])) {
//				
//			}
//		}
		
//		Random random = new Random();
//		for (int i = 0; i < 100; i++) {
//			System.out.println(random.nextInt(100));
//		}
		
		String data = "A、收水电费我B、额问问额外C.我额额问问";
		Matcher m = Pattern.compile("([ABCD]{1}[．、，.]{0,1})").matcher(data);
		while (m.find())
			System.out.println(m.group() + "----" + m.group());
		if (m.find())
			System.out.println(m.group());
		System.out.println(data.replaceAll("([ABCD]{1}[．、，.]{0,1})", "$1"));
	}
	
	public static String getUUID() {
		UUID uuid = UUID.randomUUID();
		String str = uuid.toString();
		// 去掉"-"符号
		String temp = str.substring(0, 8) + str.substring(9, 13)
				+ str.substring(14, 18) + str.substring(19, 23)
				+ str.substring(24);
		return str + "," + temp;
	}
	
	static final String JPG = "jpeg";
	public static File imgFomart(File imgFile) throws IOException {
		String fileName = imgFile.getName();
		String name = fileName.substring(0, fileName.lastIndexOf("."));
		String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
		if (!suffix.equalsIgnoreCase("png") && !suffix.equalsIgnoreCase("bmp") && !suffix.equalsIgnoreCase("gif")) {
			return imgFile;
		}

		File newImg = new File(imgFile.getParent(), name + ".jpg");
		BufferedImage bIMG = ImageIO.read(imgFile);
		BufferedImage b2 = new BufferedImage(bIMG.getWidth(), bIMG.getHeight(), BufferedImage.TYPE_INT_RGB);
		b2.getGraphics().drawImage(bIMG.getScaledInstance(bIMG.getWidth(), bIMG.getHeight(), Image.SCALE_SMOOTH), 0, 0, null);
//		FileOutputStream os = new FileOutputStream(newImg);
//		JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(os);
//		encoder.encode(b2);
//		os.close();
//		fixBadJPEG(bIMG);
		ImageIO.write(b2, JPG, newImg);
		return newImg;
    }
	
	private static String mobileAuth(String mobile) {
	    Matcher m = SMS_ADDR_PATTERN.matcher(mobile);
	    if (m.find()) {
	    	mobile = m.group();
	    	return mobile;
	    }
		return null;
	}
	
	private static void fixBadJPEG(BufferedImage img)
    {
        int[] ary = new int[img.getWidth() * img.getHeight()];
        img.getRGB(0, 0, img.getWidth(), img.getHeight(), ary, 0, img.getWidth());
        for (int i = ary.length - 1; i >= 0; i--)
        {
            int y = ary[i] >> 16 & 0xFF; // Y
            int b = (ary[i] >> 8 & 0xFF) - 128; // Pb
            int r = (ary[i] & 0xFF) - 128; // Pr

            int g = (y << 8) + -88 * b + -183 * r >> 8; //
            b = (y << 8) + 454 * b >> 8;
            r = (y << 8) + 359 * r >> 8;

            if (r > 255)
                r = 255;
            else if (r < 0) r = 0;
            if (g > 255)
                g = 255;
            else if (g < 0) g = 0;
            if (b > 255)
                b = 255;
            else if (b < 0) b = 0;

            ary[i] = 0xFF000000 | (r << 8 | g) << 8 | b;
        }
        img.setRGB(0, 0, img.getWidth(), img.getHeight(), ary, 0, img.getWidth());
    }
	
	public static String convert(String str)
	{
	str = (str == null ? "" : str);
	String tmp;
	StringBuffer sb = new StringBuffer(1000);
	char c;
	int i, j;
	sb.setLength(0);
	for (i = 0; i < str.length(); i++)
	{
	c = str.charAt(i);
	sb.append("\\u");
	j = (c >>>8); //取出高8位
	tmp = Integer.toHexString(j);
	if (tmp.length() == 1)
	sb.append("0");
	sb.append(tmp);
	j = (c & 0xFF); //取出低8位
	tmp = Integer.toHexString(j);
	if (tmp.length() == 1)
	sb.append("0");
	sb.append(tmp);

	}
	return (new String(sb));
	} 
}
