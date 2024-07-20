package entities;

public class PessoaJuridica extends  Person {

    private int numeroFuncionarios;

    public PessoaJuridica(String name, double rendaAnual, int numeroFuncionarios) {
        super(name, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

   @Override
    public double impostoRenda(){
        double imposto = 0;
        if(numeroFuncionarios>10){
            imposto=rendaAnual*0.14;
        }else{
            imposto = rendaAnual*0.16;
        }
        return imposto;
   }
}
