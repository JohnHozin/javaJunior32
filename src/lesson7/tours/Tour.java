package lesson7.tours;

public class Tour {
    private int id;
    private String[] countries = new String[15];
    private int days;
    private String typeOfTransport;
    private int stars;
    private int price;
    private String service;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getCountries() {
        return countries;
    }

    public void setCountries(String[] countries) {
        this.countries = countries;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getTypeOfTransport() {
        return typeOfTransport;
    }

    public void setTypeOfTransport(String typeOfTransport) {
        this.typeOfTransport = typeOfTransport;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Tour() {

    }

    public Tour(int id, int days, String typeOfTransport,
                int stars, int price, String service) {
        this.id = id;
        this.days = days;
        this.typeOfTransport = typeOfTransport;
        this.stars = stars;
        this.price = price;
        this.service = service;
    }

    public void addCountry(String country) {
        // цуль - добавить в массив со странами В ПЕРВУЮ СВОБОДНУЮ ЯЧЕЙКУ данную страну
        // {"Италия", null, null, null, null, null, null, null, null, null, null, null, null, null, null}
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] == null) {
                countries[i] = country;
                break;
            }
        }
    }

    /**
     *  На все поля сделать методы set
     *  На все поля сделать методы get (вернуть значения поля)
     *
     */


}
