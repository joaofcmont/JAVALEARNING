package entities;

public class PessoaFisica extends Person {

    private double gastosSaude;

    public PessoaFisica(String name, double rendaAnual, double gastosSaude) {
        super(name, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }


    @Override
    public double impostoRenda() {
        double imposto = 0;
        if (rendaAnual < 20000.00) {
            if (gastosSaude > 0) {
                imposto = 0.15 * rendaAnual - gastosSaude * 0.5;
            } else {
                imposto = 0.15 * rendaAnual;
            }
        } else if (rendaAnual >= 20000.00) {
            if (gastosSaude > 0) {
                imposto = 0.25 * rendaAnual - gastosSaude * 0.5;
            } else {
                imposto = 0.25 * rendaAnual;
            }
        }
        return imposto;
    }
}
