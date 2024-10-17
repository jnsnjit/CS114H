package projects;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
//import java.io.PrintWriter;
import java.lang.reflect.Array;
//project 1, maze solution
public class MazePathfinder {
    public static char[][] myArray;
    public static void main(String[] args) {
        File in = new File("C:\\CS114H\\projects\\maze.dat");
        int x = 0;
        try (Scanner s = new Scanner(in)) {
                while (s.hasNextLine()){
                    s.nextLine();
                    x++;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
            }
        myArray = new char[x][];
        x = 0;
        try (Scanner s = new Scanner(in)) {
            s.nextLine();
            while (s.hasNextLine()){
                myArray[x] = s.nextLine().toCharArray();
                x++;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }   
        System.out.println(maze(myArray));
        for(int i = 0;i<myArray.length-1;i++){
            for(int j = 0;j<myArray[i].length;j++){
                System.out.print(myArray[i][j]);
            }
            System.out.println("");
        }
        }
    public static boolean maze(char[][] array){
        int row = -1;
        int col = -1;
        for(int i = 0;i<array.length-1;i++){
            for(int j = 0;j<array[i].length;j++){
                if(array[i][j] == '+'){
                    row = i;
                    col = j;
                }
            }
        }
        if (array[row][col] == '-'){
            System.out.println("found end");
            myArray = array;
            return true;
        }else if(row == -1 || col == -1){
            System.out.println("cant find start position");
            myArray = array;
            return false;
        }
        return maze(array,row,col);
    }
    public static boolean maze(char[][] array, int r, int c){
        if(array[r][c] =='-'){
            return true;
        }
        try{
            if(array[r][c+1] == ' '){
                array[r][c] = '+';
                if(maze(array,r,c+1)){
                    return true;
                }
            }
            if(array[r][c-1]==' '){
                array[r][c] = '+';
                if(maze(array,r,c-1)){
                    return true;
                }
            }
            if(array[r+1][c]==' '){
                array[r][c] = '+';
                if(maze(array,r+1,c)){
                    return true;
                }
            }
            if(array[r-1][c]==' '){
                array[r][c] = '+';
                if(maze(array,r-1,c)){
                    return true;
                }
            }
        }catch(ArrayIndexOutOfBoundsException e){}
        try{
            if(array[r][c+1] == '-' ||array[r][c-1] == '-' ||array[r+1][c] == '-' ||array[r-1][c] == '-' ){
                array[r][c] = '+';
                return true;
            }
        }catch(ArrayIndexOutOfBoundsException e){}
        array[r][c] = '.';
        return false;
    }
}
