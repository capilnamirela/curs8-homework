package org.fasttrackIT.won14.homework8.ex1;

public class Electronics extends Product {
    private String type;
    private Integer length;
    private Integer width;
    private Integer height;
    private Integer weight;

    public Electronics(Integer price, String name, String description, Integer quantity, String type, Integer length, Integer width, Integer height, Integer weight) {
        super(price, name, description, quantity);
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public Integer getLength() {
        return length;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWeight() {
        return weight;
    }


}
