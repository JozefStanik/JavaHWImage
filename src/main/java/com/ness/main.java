package com.ness;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import org.apache.commons.lang3.StringUtils;

import ij.IJ;
import ij.ImagePlus;
import ij.process.ImageProcessor;

public class main {

	public static void main(String[] args) {
		System.out.println(StringUtils.isEmpty(null));
		System.out.println(StringUtils.isEmpty("Cavky"));
		
		String imagePath = "C:\\Users\\P3503635\\Desktop\\Academy\\images.jpg";
		ImagePlus imp = IJ.openImage(imagePath);
		
		BufferedImage bufferedImage = imp.getBufferedImage();
		Graphics2D graphics = bufferedImage.createGraphics();
		
		String text = "Jozef Stanik";
		Font font = new Font("Arial", Font.BOLD, 20);
		graphics.setFont(font);
		graphics.setColor(Color.BLACK);
		graphics.drawString(text, 50, 50);
		
		String outputPath = "C:\\Users\\P3503635\\Desktop\\Academy\\output.jpg";
		ImagePlus outputImp = new ImagePlus(outputPath, bufferedImage);
		IJ.save(outputImp, outputPath);
	}

}
