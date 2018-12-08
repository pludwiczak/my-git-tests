package pl.sda.ludwiczak.polimorfizm;

public class Main {

    public static void main(String[] args) {

        Computer mainframe = new Mainframe(); // pamiętaj, aby typ po lewej i prawej stronie "=" nie zawsze był taki samŁ
        Computer pc = new PC();
        Computer laptop = new Laptop();

        changeDisc(mainframe);
        changeDisc(pc);
        changeDisc(laptop);

        print(mainframe);
        print(pc);
        print(laptop);



    }


    public static void changeDisc (Computer computer1) {
        System.out.println("from Main");
        computer1.changeDiscComputer();
        System.out.println();
    }


    public static void print (Computer computer) {
        System.out.println("from Main");
        computer.print();
        System.out.println();
    }


}
