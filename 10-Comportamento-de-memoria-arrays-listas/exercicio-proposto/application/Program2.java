package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Employee> listaEmployees = new ArrayList<>();

        System.out.print("Quantos funcionários vão ser registrados? ");
        int employee = scanner.nextInt();

        for (int i = 0; i < employee; i++) {

            System.out.println("Funcionário #" + i + ":");

            System.out.print("Id: ");
            int id = scanner.nextInt();
            while (temId(listaEmployees, id)) {
                System.out.println("Id já existe. Tente novamente:");
                id = scanner.nextInt();
            }

            System.out.print("Nome: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Salário: ");
            double salario = scanner.nextDouble();

            listaEmployees.add(new Employee(id, name, salario));
        }

        System.out.println();
        System.out.print("Insira o ID do funcionário que deseja aumentar o salário: ");
        int id = scanner.nextInt();
        Employee buscaId = listaEmployees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (buscaId == null) {
            System.out.println("Esse id não existe");
        } else {
            System.out.print("Insira a porcentagem: ");
            double porcentagem = scanner.nextDouble();
            buscaId.aumentaSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de employee: ");
        for (Employee x : listaEmployees) {
            System.out.println(x.toString());
        }
        scanner.close();
    }

    public static boolean temId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}