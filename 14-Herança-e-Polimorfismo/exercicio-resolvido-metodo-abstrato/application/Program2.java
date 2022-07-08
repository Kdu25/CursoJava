package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println();

			System.out.println("Shape #" + i + " data: ");

			System.out.print("Rectangle or Circle (r/c): ");
			char ch = sc.next().charAt(0);

			System.out.print("Color (BLACK/BLUE/RED):  ");
			Color color = Color.valueOf(sc.next());

			if (ch == 'r' || ch == 'R') {
				System.out.print("Width: ");
				double width = sc.nextDouble();

				System.out.print("Height: ");
				double height = sc.nextDouble();

				Shape rect = new Rectangle(color, width, height);

				list.add(rect);

			} else if (ch == 'c' || ch == 'C') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();

				Shape circle = new Circle(color, radius);

				list.add(circle);
			}

		}

		System.out.println();

		System.out.println("SHAPE AREAS: ");

		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}

		sc.close();
	}
}
