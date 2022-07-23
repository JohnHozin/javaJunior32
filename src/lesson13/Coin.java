package lesson13;

public class Coin {
     private int nominal;
     private int year;
     private double diametr;
     private String metal;

    public Coin() {
    }

    public Coin(int nominal, int year, double diametr, String metal) {
        this.nominal = nominal;
        this.year = year;
        this.diametr = diametr;
        this.metal = metal;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (nominal != coin.nominal) return false;
        if (year != coin.year) return false;
        if (Double.compare(coin.diametr, diametr) != 0) return false;
        return metal != null ? metal.equals(coin.metal) : coin.metal == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nominal;
        result = 31 * result + year;
        temp = Double.doubleToLongBits(diametr);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (metal != null ? metal.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Монета {" +
                "номинал = " + nominal +
                ", год выпуска " + year +
                ", диаметр = " + diametr +
                ", металл = '" + metal + '\'' +
                '}';
    }
}
