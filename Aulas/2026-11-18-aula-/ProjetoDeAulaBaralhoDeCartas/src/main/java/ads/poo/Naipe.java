package ads.poo;

public enum Naipe {
    OURO(1,"Ouro","\u2662", 'o'),
    ESPADA(2,"Espada", "\u2660", 'e'),
    COPAS(3,"Copas", "\u2661",'c'),
    PAUS(4,"Paus", "\u2663", 'p');

    public final int CODIGO;
    public final String EXTENSO;
    public final String SIMBOLO;
    public final char IDENTIFICADOR;

    Naipe(int CODIGO, String EXTENSO, String SIMBOLO, char IDENTIFICADOR) {
        this.CODIGO = CODIGO;
        this.EXTENSO = EXTENSO;
        this.SIMBOLO = SIMBOLO;
        this.IDENTIFICADOR = IDENTIFICADOR;
    }

    @Override
    public String toString() {
        return SIMBOLO;
    }
}
