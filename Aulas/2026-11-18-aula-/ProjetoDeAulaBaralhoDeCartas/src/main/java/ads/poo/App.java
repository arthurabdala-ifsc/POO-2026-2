package ads.poo;


import edu.princeton.cs.algs4.Draw;

public class App {
    static void main() {
        Baralho baralho = new Baralho();

//        IO.println(baralho);
//        IO.println(baralho.getFirst().getIdentificadorImagem());

        Draw draw = new Draw();
        draw.setCanvasSize(800,800);
        draw.setXscale(0,800);;
        draw.setYscale(0,800);

//        draw.text(.5,.5,"POO");
//        draw.picture(.5,.5,"cartas/1o.png");

        CartaGrafica c = new CartaGrafica(Naipe.COPAS, Valor.TRES, 400, 400);
        c.desenhar(draw);
    }
}
