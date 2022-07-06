package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data: ");

			System.out.print("Common, used or imported? (c/u/i)? ");
			char ch = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Price: ");
			double price = sc.nextInt();

			if (ch == 'i' || ch == 'I') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				
				Product impPdc = new ImportedProduct(name, price, customsFee);
				list.add(impPdc);
				
			} 
			
			else if (ch == 'u' || ch == 'U') {
				System.out.print("Manufacture date (DD/MM/YYY): ");
				Date manufactureDate = sdf.parse(sc.next());

				Product usedPdc = new UsedProduct(name, price, manufactureDate);
				list.add(usedPdc);

			} else {

				Product pdc = new Product(name, price);
				list.add(pdc);

			}

		}

		System.out.println();

		System.out.println("PRICE TAGS: ");

		for (Product pdc : list) {

			System.out.println(pdc.priceTag());

		}

		sc.close();
	}

}
