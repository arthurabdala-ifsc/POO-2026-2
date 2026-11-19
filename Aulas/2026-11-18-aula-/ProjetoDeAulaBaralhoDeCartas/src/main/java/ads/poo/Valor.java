package ads.poo;

public enum Valor {
    AS(1, "Ás", "A","1"),
    DOIS(2, "Dois", "2","2"),
    TRES(3, "Três", "3","3"),
    QUATRO(4, "Quatro", "4","4"),
    CINCO(5, "Cinco" ,"5","5"),
    SEIS(6, "Seis", "6","6"),
    SETE(7, "Sete", "7","7"),
    OITO(8, "Oito", "8","8"),
    NOVE(9, "Nove", "9","9"),
    DEZ(10, "Dez", "10","10"),
    VALETE(11, "Valete", "J","j"),
    DAMA(12, "Dama", "Q","q"),
    REI(13, "Rei", "K","k");

    public final int CODIGO;
    public final String EXTENSO;
    public final String SIMBOLO;
    public final String IDENTIFICADOR;

    Valor(int CODIGO, String EXTENSO, String SIMBOLO, String IDENTIFICADOR) {
        this.CODIGO = CODIGO;
        this.EXTENSO = EXTENSO;
        this.SIMBOLO = SIMBOLO;
        this.IDENTIFICADOR = IDENTIFICADOR;
    }

    @Override
    public String toString() {
        return IDENTIFICADOR;
    }
}
