package pl.sda.ludwiczak.anonymous_classes.lambda.method_reference;

public class ModelSorter {

    static int modelOrder(String model1, String model2) {
//        return -1 * model1.compareTo(model2); // ta linia i linia poniżej ma taki sam sens
        return model2.compareTo(model1);

    }

}
