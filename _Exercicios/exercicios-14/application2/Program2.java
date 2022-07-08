package application2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities2.LegalPerson;
import entities2.NaturalPerson;
import entities2.Person;

public class Program2 {
	

		public static void main(String[] args) throws ParseException {

			Scanner sc = new Scanner(System.in);

			List<Person> list = new ArrayList<>();
			
			Double sum = 0.0;

			System.out.print("Enter the number of payers: ");
			int n = sc.nextInt();

			for (int i = 1; i <= n; i++) {
				
				System.out.println();
				
				System.out.println("Tax payer #" + i + " data: ");

				System.out.print("Individual or company? (i/c)? ");
				char ch = sc.next().charAt(0);

				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();

				System.out.print("Anual incomme: ");
				double anualIncomme = sc.nextInt();

				if (ch == 'i' || ch == 'I') {
					System.out.print("Health expenditures: ");
					double heathExpenses = sc.nextDouble();
					
					Person ntrPrs = new NaturalPerson(name, anualIncomme, heathExpenses);
					list.add(ntrPrs);
					
				} 
				
				else if (ch == 'c' || ch == 'C') {
					System.out.print("Number of employyes: ");
					int employees = sc.nextInt();

					Person lglPrs = new LegalPerson(name, anualIncomme, employees);
					list.add(lglPrs);

				}

			}

			System.out.println();

			System.out.println("TAXES PAID: ");

			for (Person prs : list) {

				 sum = sum += prs.fee();
				
				System.out.println(prs.toString());

			}
			
			System.out.println();
			
			System.out.println("TOTAL TAXES: $" + sum);

			sc.close();
		}

	}
