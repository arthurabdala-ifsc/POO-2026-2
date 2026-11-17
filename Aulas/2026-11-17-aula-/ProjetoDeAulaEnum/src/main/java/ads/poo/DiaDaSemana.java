package ads.poo;

public enum DiaDaSemana {

    DOMINGO(1,"Domingo"),
    SEGUNDA(2,"Segunda"),
    TERÇA(3,"Terça"),
    QUARTA(4,"Quarta"),
    QUINTA(5,"Quinta"),
    SEXTA(6,"Sexta"),
    SABADO(7,"Sábado");

    private final int CODIGO;
    private final String EXTENSO;

    DiaDaSemana(int CODIGO, String EXTENSO) {
        this.CODIGO = CODIGO;
        this.EXTENSO = EXTENSO;
    }

    public String getEXTENSO() {
        return EXTENSO;
    }
}
