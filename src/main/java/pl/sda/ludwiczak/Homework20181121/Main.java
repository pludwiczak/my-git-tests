package pl.sda.ludwiczak.Homework20181121;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        // J
        Letter j = new Letter(4, 6);

        j.setRow(0, true);
        j.setColumn(3, true);
        j.setCell(5,3, false);
        j.setCell(5,2, true);
        j.setCell(5,1, true);
        j.setCell(4,0, true);

//        printLetter(j);

        // A
        Letter a = new Letter(4, 6);

        a.setCell(0,1, true);
        a.setCell(0,2, true);
        a.setCell(1,1, true);
        a.setCell(1,2, true);
        a.setCell(2,0, true);
        a.setCell(2,3, true);
        a.setRow(3, true);
        a.setCell(4,0, true);
        a.setCell(4,3, true);
        a.setCell(5,0, true);
        a.setCell(5,3, true);

//        printLetter(a);

        // V
        Letter v = new Letter(5,6);

        v.setCell(0,0, true);
        v.setCell(0,4, true);
        v.setCell(1,0, true);
        v.setCell(1,4, true);
        v.setCell(2,1,true);
        v.setCell(2,3,true);
        v.setCell(3,1,true);
        v.setCell(3,3, true);
        v.setCell(4,2, true);
        v.setCell(5,2, true);


//        printLetter(v);

        // i
        Letter i = new Letter(4,6);
        i.setColumn(1, true);
        i.setColumn(2, true);
        i.setRow(0, true);
        i.setRow(5, true);


        // s
        Letter s = new Letter(5,6);

        s.setCell(0, 1, true);
        s.setCell(0, 2, true);
        s.setCell(0, 3, true);
        s.setCell(1, 0, true);
        s.setCell(1, 4, true);
        s.setCell(2, 1, true);
        s.setCell(2, 2, true);
        s.setCell(3, 2, true);
        s.setCell(3, 3, true);
        s.setCell(4, 0, true);
        s.setCell(4, 4, true);
        s.setCell(5, 1, true);
        s.setCell(5, 2, true);
        s.setCell(5, 3, true);

        // F
        Letter f = new Letter(4,6);


        f.setRow(0, true);
        f.setRow(1, true);
        f.setRow(3, true);
        f.setCell(3,3, false);
        f.setColumn(0, true);
//        f.setColumn(1, true);

        // U
        Letter u = new Letter(4,6);

        u.setColumn(0, true);
        u.setColumn(3, true);
        u.setRow(5, true);
        u.setCell(5,0, false);
        u.setCell(5,3, false);

        // N
        Letter n = new Letter(5,6);

        n.setColumn(0, true);
        n.setColumn(4, true);
        n.setCell(1,1, true);
        n.setCell(2,1, true);
        n.setCell(2,2, true);
        n.setCell(3,2, true);
        n.setCell(3,3, true);
        n.setCell(4,3, true);

        // ! ! !

        Letter marks = new Letter(5,6);
        marks.setColumn(0, true);
        marks.setColumn(2, true);
        marks.setColumn(4, true);
        marks.setRow(4,false);

        List<Letter> letters = new ArrayList<>();
        letters.add(j);
        letters.add(a);
        letters.add(v);
        letters.add(a);
        letters.add(new Letter(4,6));
        letters.add(i);
        letters.add(s);
        letters.add(new Letter(4,6));
        letters.add(f);
        letters.add(u);
        letters.add(n);
        letters.add(new Letter(2,6));
        letters.add(marks);


        printString(letters, " ");
    }

    public static void printLetter(Letter l){

        int[] size = l.getSzie();
        List<List<String>> grid = l.getLetter();

        for (int i = 0 ; i < size[1] ; i++){
            List<String> content = grid.get(i);
            String line = "";

            for (int j = 0 ; j < size[0] ; j++){
                line += content.get(j);
            }

            System.out.println(line);

        }
        System.out.println("");
    }

    public static void printString(List<Letter> l, String spacing){
        int height = l.get(0).getSzie()[1];
        for (int i = 0 ; i < height ; i++){
            String line = "";

            for (Letter letter : l){
                if (letter.getSzie()[1] != height){
                    System.out.println("Letter have different height!");
                    return;
                }else{
                    for (String s : letter.getLetter().get(i)){
                        line += s;
                    }
                    line += spacing;
                }
            }
            System.out.println(line);
        }
    }

}