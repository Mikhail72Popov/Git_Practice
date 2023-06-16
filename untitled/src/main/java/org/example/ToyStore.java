package org.example;

public class ToyStore {
    private Integer id;
    private String name;
    private Integer quantity;

    private Integer weight;

    public ToyStore(int id, String name, int quantity, int weight) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String info() {
        return
                "id = " + this.getId() +
                ", название игрушки: " + this.getName() +
                ", количество в наличии = " + this.getQuantity() +
                ", вес = " + this.getWeight();
    }
}

