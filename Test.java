// Test.java

// Scannerを使うための読み込み
import java.util.Scanner;
// ランダムな数値を使うための読み込み
import java.util.Random;

class Test {
  public static void main(String[] args) {

    String language = "Java";
    System.out.println("Hello " + language );
    System.out.println("Hello " + language + " again!");

    System.out.print("Tell me your name? ");
    // 変数（文字列）の代入
    String name = new Scanner(System.in).next();

    System.out.println("Hello " + name );
    // System.out.println("Ok " + name + ". Now, can you guess the correct number?");

    // Integer correct_answer = 4;固定の数値だと面白くないのでランダムに変更
    // new Random().nextInt(10)の表記は０から１０未満の整数がランダムで生成なので、
    // +1して１〜１０がランダムに選ばれるように設定
    Integer correct_answer = new Random().nextInt(10) + 1;

    while (true) {
      System.out.println("Ok " + name + ". Now, can you guess the correct number?");
      Integer number = new Scanner(System.in).nextInt();
    
      if (correct_answer == number) {
        System.out.println("Bingo! You did it!");
        break;
      } else if (correct_answer > number) {
        System.out.println("Your number is " + number + ", isn't it? The correct number is bigger.");
      } else {
        System.out.println("Your number is " + number + ", isn't it? The correct number is smaller. Sorry. Try again.");
      }
    }
  
  }
}