public class FuncProducao extends Funcionario {
    private String turno;

    public FuncProducao(String nome, double salario, String turno) {
        super(nome, salario);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void operar() {
        System.out.println("Funcionario da producao " + nome + " operando no turno " + turno + ".");
    }

    @Override
    public void trabalhar() {
        operar();
    }
}
