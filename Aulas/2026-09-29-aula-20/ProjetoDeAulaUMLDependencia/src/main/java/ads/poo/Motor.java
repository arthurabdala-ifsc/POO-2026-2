package ads.poo;

public class Motor {
    private boolean estado = false;
    private String tipoMotor;

    public Motor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public boolean ligarMotor(boolean estado){
        if (estado){
            IO.println("Motor já está ligado");
        } else {
            estado = true;
        }
        return estado;
    }

    public boolean desligarMotor(boolean estado){
        if (!estado){
            IO.println("Motor já está desligado");
        } else {
            estado = false;
        }
        return estado;
    }
}
