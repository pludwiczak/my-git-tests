package pl.sda.ludwiczak.Homework20181121;

import java.util.ArrayList;
import java.util.List;

public class Letter {

    private int width;
    private int height;
    private String emptyMark = " ";         // used to fill letter cells
    private String occupiedMark = "*";      // used to fill letter cells when set to occupied

    private List<List<String>> grid;

    public Letter(int width, int height){
        this.width = width;
        this.height = height;

        this.grid = new ArrayList<>();

        initialize();

    }

    // adds emptyMark in every cell of a letter
    private void initialize(){
        for (int i = 0 ; i < height ; i++){
            List<String> content = new ArrayList<>();

            for (int j = 0 ; j < width ; j++){
                content.add(emptyMark);
            }
            this.grid.add(content);
        }
    }

    // returns letter content
    public List<List<String>> getLetter(){
        return this.grid;
    }

    // returns array of letter dimensions
    public int[] getSzie(){
        int[] size = {width, height};
        return size;
    }

    // sets given row in letter to emptyMark or occupiedMark
    public void setRow(int rowIndex, boolean active){
        if (rowIndex >= height){
            System.out.println("Wrong rowIndex!");
            return;
        }

        List<String> content = new ArrayList<>();

        for (int i = 0 ; i < width ; i++){
            if (active == true){
                content.add(occupiedMark);
            }else{
                content.add(emptyMark);
            }
        }
        this.grid.set(rowIndex, content);
    }

    public void setColumn(int columnIndex, boolean active){
        if (columnIndex >= width){
            System.out.println("Wrong columnIndex!");
            return;
        }


        for (int i = 0 ; i < height ; i++){
            List<String> content = grid.get(i);
            if (active == true){
                content.set(columnIndex, occupiedMark);
            }else{
                content.set(columnIndex, emptyMark);
            }
            grid.set(i, content);
        }
    }

    public void setCell(int rowIndex, int columnIndex, boolean active){
        if (rowIndex >= height || columnIndex >= width){
            System.out.println("Wrong index!");
            return;
        }
        List<String> content = grid.get(rowIndex);
        if (active == true){
            content.set(columnIndex, occupiedMark);
        }else{
            content.set(columnIndex, emptyMark);
        }
        grid.set(rowIndex, content);
    }

}
