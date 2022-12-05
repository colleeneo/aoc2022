import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class Day02{

    public static int evaluate(String strategy) {
        int score = 0;
        String[] choices = strategy.split(" ");
        int otherChoice = choices[0].compareTo("A");
        int result = choices[1].compareTo("X");
        switch(result){
            case 0: score += 3; break;
            case 1: break;
            case 2: score += 6; break;
        } 

        return score;
    }

    public static int evaluate2(String strategy) {
        int score = 0;
        String[] choices = strategy.split(" ");
        int otherChoice = choices[0].compareTo("A");
        int result = choices[1].compareTo("X");
        switch(result){
            case 0: score += Math.floorMod(otherChoice-1,3) + 1; break;
            case 1: score += (otherChoice + 1) + 3; break;
            case 2: score += Math.floorMod(otherChoice + 1,3) + 6 + 1; break;
        } 

        return score;
    }


    public static void part1() throws IOException{
        Scanner in = new Scanner(new File("sample.txt"));

        int total = 0;

        while(in.hasNext()) {
            String line = in.nextLine();
            total += evaluate(line);
        }

        System.out.println(total);

    }

    public static void part2() throws IOException {
        Scanner in = new Scanner(new File("input.txt"));
        int total = 0;

        while(in.hasNext()) {
            String line = in.nextLine();
            total += evaluate2(line);
        }

        System.out.println(total);

    }

    public static void main(String[] args) {
        try {
            part2();
        } catch (Exception e){
            System.out.println(e);
        }
    }

}