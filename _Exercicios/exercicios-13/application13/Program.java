package application13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities13.Client;
import entities13.Order;
import entities13.OrderItem;
import entities13.Product;
import entities13.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		// CLIENTE
		
		System.out.println("Enter client data: ");

		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();

		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		
		//PEDIDO
		
		System.out.println("Enter order data: ");
		
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		
		System.out.print("How many items to this order: ");
		int n = sc.nextInt();
		
		//PRODUTOS
		
		for (int i = 1; i <= n; i++ ) {

			System.out.println("Enter #" + i + " item data: ");
			
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			
			System.out.print("Product price : R$ ");
			Double price = sc.nextDouble();
			
			Product product = new Product(productName, price);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem orederItem = new OrderItem(quantity, price, product);
			
			order.addItem(orederItem);
			
		}
		
		System.out.println();
		System.out.println("Order sumary:");
		System.out.println(order);
		
		sc.close();
		
	}

}
