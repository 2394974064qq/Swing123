import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("输入一个数字：");
        while (true){
            int number= scanner.nextInt();
            int x=(int)(Math.random()*100);
            int y=(int)(Math.random()*100);
            System.out.println("随机坐标： ("+x+","+y+")");
        }

    }
}
