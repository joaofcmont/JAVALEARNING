package entities;

public class Aluno {

    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double media(){
        return (nota1+nota2+nota3);
    }

    public void missingPoints(){
        double missingPoints = 60-media();
        System.out.printf("MISSING %.2f POINTS", missingPoints);
    }

}
