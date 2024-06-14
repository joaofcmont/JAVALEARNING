import entities.Aluno;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno x = new Aluno();

        x.name = sc.nextLine();
        x.nota1 = sc.nextDouble();
        x.nota2 = sc.nextDouble();
        x.nota3 = sc.nextDouble();

        System.out.println("FINAL GRADE = " + x.media());
        if (x.media() < 60){
            System.out.println("FAILED");
            x.missingPoints();
        }else{
            System.out.println("PASS");
        }
    }
}