package ads.poo;

public enum Situacao {
    INATIVO(0,"Inativo"),
    ATIVO(1,"Ativo");

    private final int ID;
    private final String DESCRICAO;

    Situacao(int ID, String DESCRICAO) {
        this.ID = ID;
        this.DESCRICAO = DESCRICAO;
    }



    @Override
    public String toString() {
        return DESCRICAO;
    }
}
