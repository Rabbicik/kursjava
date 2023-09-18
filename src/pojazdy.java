public abstract class pojazdy {

    private int kola;
    private String color;

    public pojazdy(int kola, String color) {
    this.kola = kola;
    this.color = color;
    }

    public int getKola() { return kola; }
    public String getColor() { return color; }

    public int calculate() {
        return kola * 2;

    }

    public abstract void activaceBreake();
}
