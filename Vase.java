package com.company;

public class Vase {
    private double volume = 1;
    private double mass = 1;
    private String material = "Porcelain";
    private String color = "Red";
    private String size = "Small";
    private double price = 1;
    private String originCountry = "Ukraine";
    private int id = 0;
    private static int numberOfObj = 0;
    protected String discount = "15%";
    protected double height = 15;

    public Vase() {
        numberOfObj += 1;
    }

    public Vase(double volume, double mass, String material, String color) {
        this.volume = volume;
        this.mass = mass;
        this.material = material;
        this.color = color;
        numberOfObj += 1;
    }

    public Vase(double volume, double mass, String material, String color, String size,
                double price, String originCountry, int id, String discount, double height) {
        this(volume, mass, material, color);
        this.size = size;
        this.price = price;
        this.originCountry = originCountry;
        this.id = id;
        this.discount = discount;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Vase{"
                + "Volume:" + volume
                + ", Mass:" + mass
                + ", Material:" + material
                + ", Color:" + color
                + ", Size:" + size
                + ", Price:" + price
                + ", Origin Country:" + originCountry
                + ", Id:" + id
                + ", Discount:" + discount
                + ", Height:" + height
                + "}";
    }

    public static void printStaticNumberOfObj() {
        System.out.println(numberOfObj);
    }

    public void printNumberOfObj() {
        System.out.println(numberOfObj);
    }

    public void resetValues(double volume, double mass, String material, String color, String size,
                            double price, String originCountry, int id, String discount, double height) {
        this.volume = volume;
        this.mass = mass;
        this.material = material;
        this.color = color;
        this.size = size;
        this.price = price;
        this.originCountry = originCountry;
        this.id = id;
        this.discount = discount;
        this.height = height;
    }

    public double getVolume() {
        return this.volume;
    }

    public double getMass() {
        return this.mass;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getColor() {
        return this.color;
    }

    public String getSize() {
        return this.size;
    }

    public double getPrice() {
        return this.price;
    }

    public String getOriginCountry() {
        return this.originCountry;
    }

    public int getId() {
        return this.id;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public void setId(int id) {
        this.id = id;
    }
}
