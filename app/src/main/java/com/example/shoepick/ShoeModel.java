package com.example.shoepick;

public class ShoeModel {



    public ShoeModel(int id, String name, int type, int durability, int material, int use, int sport, int price, double rating) {
        this.rating = rating;
        this.id = id;
        this.type = type;
        this.durability = durability;
        this.material = material;
        this.use = use;
        this.sport = sport;
        this.name = name;
        this.price = price;
    }
    private int price;
    private double rating;
    private int id;
    private int type;
    private int durability;
    private int material;
    private int use;
    private int sport;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getMaterial() {
        return material;
    }

    public void setMaterial(int material) {
        this.material = material;
    }

    public int getUse() {
        return use;
    }

    public void setUse(int use) {
        this.use = use;
    }

    public int getSport() {
        return sport;
    }

    public void setSport(int sport) {
        this.sport = sport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "ShoeModel{" +
                "id=" + id +
                ", type=" + type +
                ", durability=" + durability +
                ", material=" + material +
                ", use=" + use +
                ", sport=" + sport +
                ", name='" + name + '\'' +
                '}';
    }
}
