package pl.sda.ludwiczak.stream.home_work;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Product one = new Product("yes", "nut");
        Product two = new Product("no", "nut");
        Product three = new Product("yes", "nut");
        Product four = new Product("no", "nut");
        Product five = new Product("yes", "sugar");
        Product six = new Product("no", "salt");
        Product seven = new Product("yes", "pepper");
        Product eight = new Product("no", "carrot");

        List<Product> productList = new ArrayList<>();
        productList.add(one);
        productList.add(two);
        productList.add(three);
        productList.add(four);
        productList.add(five);
        productList.add(six);
        productList.add(seven);
        productList.add(eight);

//        List<Product> filteredProductList = new ArrayList<>();
//        filteredProductList = productList.stream().filter(product -> product.getIngredient() != "nut" && product.getDiscount() == "yes").collect(Collectors.toList());
//        System.out.println(filteredProductList);

        List<Product> filteredProductList = new ArrayList<>();
        filteredProductList = productList.stream().filter(product -> !product.getIngredient().equals("nut") && product.getDiscount().equals("yes")).collect(Collectors.toList());
        System.out.println(filteredProductList);

    }

}