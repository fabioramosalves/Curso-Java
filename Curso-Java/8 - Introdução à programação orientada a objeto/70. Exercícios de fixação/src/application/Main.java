package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.Rectangle;
import entities.Student;

public class Main {

    public static void main(String[] args) {
        
        //Exercicio 1:

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");     

        rectangle.width = scanner.nextDouble();
        rectangle.height = scanner.nextDouble();

        System.out.printf("AREA: %.2f%nPERIMETER: %.2f%nDIAGONAL: %.2f%n ", rectangle.area(),rectangle.perimeter(), rectangle.diagonal());

        //Exercicio 2

        System.out.println("Enter with data employee!");

        Employee  employee = new Employee();

        employee.name = scanner.next();
        employee.grossSalary = scanner.nextDouble();
        employee.tax  = scanner.nextDouble();

        System.out.println(employee);

        System.out.println("Which percentage to increase salary?");

        double percentage = scanner.nextDouble();

        employee.increaseSalary(percentage);

        System.out.println(employee);


        //exercicio 3

        
        System.out.println("Enter with data student!");

        Student student = new Student();

        student.name = scanner.next();
        student.addNone(scanner.nextDouble());
        student.addNone(scanner.nextDouble());
        student.addNone(scanner.nextDouble());

        System.out.println(student);
        scanner.close();
    }  
}
