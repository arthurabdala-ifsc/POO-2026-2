package ads.poo;


public class Disciplina {
    private String sigla;
    private DiaDaSemana[] dias;

    public Disciplina(String sigla, DiaDaSemana[] dias) {
        this.sigla = sigla;
        this.dias = dias;
    }

    public DiaDaSemana[] getDias() {
        return dias;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Disciplina: ").append(sigla).append("\nDias da semana:\n");

        for (DiaDaSemana e : DiaDaSemana.values()){
            sb.append(" - ").append(e.getEXTENSO());
        }

        return sb.toString();
    }
}
