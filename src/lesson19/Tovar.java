package lesson19;

public class Tovar implements Comparable<Tovar>{
    private String name;
    private int price;
    private int salePrice;
    private int buyCount;
    private double star;
    private int review;

    public Tovar() {
    }

    public Tovar(String name, int price, int salePrice, int buyCount, double star, int review) {
        this.name = name;
        this.price = price;
        this.salePrice = salePrice;
        this.buyCount = buyCount;
        this.star = star;
        this.review = review;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public int getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(int buyCount) {
        this.buyCount = buyCount;
    }

    public double getStar() {
        return star;
    }

    public void setStar(double star) {
        this.star = star;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tovar tovar = (Tovar) o;

        if (price != tovar.price) return false;
        if (salePrice != tovar.salePrice) return false;
        if (buyCount != tovar.buyCount) return false;
        if (Double.compare(tovar.star, star) != 0) return false;
        if (review != tovar.review) return false;
        return name != null ? name.equals(tovar.name) : tovar.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + salePrice;
        result = 31 * result + buyCount;
        temp = Double.doubleToLongBits(star);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + review;
        return result;
    }

    @Override
    public String toString() {
        return "Товар{" +
                "имя='" + name + '\'' +
                ", цена=" + price +
                ", цена со скидкой=" + salePrice +
                ", продано=" + buyCount +
                ", рейтинг=" + star +
                ", отзывы=" + review +
                '}';
    }

    @Override
    public int compareTo(Tovar o) {
        // this - первый товар
        // o - второй товар
        // по умолчанию сортируем от мин к  макс

        if (this.getPrice() != o.getPrice()){
            return this.getPrice() - o.getPrice();
        }
        if (this.getSalePrice() != o.getSalePrice()){
            return this.getSalePrice() - o.getSalePrice();
        }
        if (this.getBuyCount() != o.getBuyCount()){
            return this.getBuyCount() - o.getBuyCount();
        }
        if (!this.getName().equals(o.getName())){
            return this.getName().compareTo(o.getName());
        }
        if (this.getStar() != o.getStar()){
            return (int) (this.getStar() - o.getStar());
        }
        if (this.getReview() != o.getReview()){
            return this.getReview() - o.getReview();
        }
        return 0;
    }
}
