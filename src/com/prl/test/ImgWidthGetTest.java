/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2014-3-11
 */
public class ImgWidthGetTest {

	public static void main(String[] args) throws IOException {
		File file = new File("C://temp//37UJjb97J_2cj7uoOXpx_D525D6D48F84D0B3F8F393AF-(1).jpg");
		BufferedImage image = ImageIO.read(file);
		System.out.println(image.getHeight());
	}
}
