package com.tradeshift.shapechallenge.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.tradeshift.shapechallenge.shapes.Shape;
import com.tradeshift.shapechallenge.shapes.factory.ShapeFactory;

public class Main {
	public static void main(String[] args) throws IOException {
		System.out.print("Enter shape sides separated by spaces: " + System.lineSeparator());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Shape newShape = ShapeFactory.createShape(br.readLine().split(" "));
		System.out.println("Received shape: " + newShape.getType());
	}
}
