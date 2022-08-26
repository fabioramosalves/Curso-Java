public class Util {

    private int baseA;
    private int baseB;
    private int altura;

    public void setBaseA(int baseA) {
        this.baseA = baseA;
    }

    public void setBaseB(int baseB) {
        this.baseB = baseB;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    //get
    public int getBaseA() {
        return this.baseA;
    }

    public int getBaseB(int baseB) {
        return this.baseB;
    }

    public int getAltura(int altura) {
        return this.altura;
    }

    //methods

    public double CalculoAreaTrapezio() {
        return (baseA + baseB) / 2 * altura;
    }
}
