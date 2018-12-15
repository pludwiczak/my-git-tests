package pl.sda.ludwiczak.stream.home_work;

public class Product {

    private String discount;
    private String ingredient;

    public Product(String discount, String ingredient) {
        this.discount = discount;
        this.ingredient = ingredient;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public String toString() {
        return "Product{" +
                "discount='" + discount + '\'' +
                ", ingredient='" + ingredient + '\'' +
                '}';
    }

}
