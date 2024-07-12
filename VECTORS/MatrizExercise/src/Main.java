import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //linhas
        int m = sc.nextInt();
        //colunas
        int n = sc.nextInt();

        int [][] mat = new int[m][n];

        for(int i=0; i< mat.length;i++){
            for(int j=0; j<mat[i].length;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int choosedNumber = sc.nextInt();
        for(int i=0; i< mat.length;i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == choosedNumber) {
                    System.out.println("Position " + i + "," + j + ":");
                    // check Left
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }

                    // check Right
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }

                    // check Down
                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }

                    // check Up
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                }
            }
        }
        sc.close();
        }

    }
