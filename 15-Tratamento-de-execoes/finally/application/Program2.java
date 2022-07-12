package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program2 {


	@SuppressWarnings("resource")
	public static void main(String[] args) {

		File file = new File("E:\\Cursos\\Documentos\\teste.txt");
		Scanner sc = new Scanner(System.in);

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error opening file " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
