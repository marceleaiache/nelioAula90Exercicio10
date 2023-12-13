package application;

import entities.Students;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qntStudents;

        System.out.println("Quantos alunos serão digitados?");
        qntStudents = sc.nextInt();
        sc.nextLine();

        Students[] vect = new Students[qntStudents];
        int n = 0;

        for (int i=0; i< vect.length; i++) {
            n++;
            System.out.printf("Digite o nome, a primeira e segunda nota do %do aluno: ", n);
            String name = sc.nextLine();
            double grade1 = sc.nextDouble();
            sc.nextLine();
            double grade2 = sc.nextDouble();
            sc.nextLine();

            vect[i] = new Students(name, grade1, grade2);
        }

        System.out.println("Alunos aprovados: ");
        for (int i=0; i<vect.length; i++) {
            if(vect[i].average() >= 6) {
                System.out.println(vect[i].getName());
            }
        }

        sc.close();
    }
}
