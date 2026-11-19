package ads.poo;

import java.util.ArrayList;

public class Baralho {
    private ArrayList<Carta> baralho = new ArrayList<>();

    public Baralho() {
        for (Naipe n : Naipe.values()){
            for (Valor v : Valor.values()){
                baralho.add(new Carta(n,v));
            }
        }
    }

    public Carta getFirst(){
        return baralho.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Carta c : baralho){
            sb.append(c.toString());
            sb.append(" ");
        }

        return sb.toString();
    }
}
