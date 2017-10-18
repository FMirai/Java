import java.lang.Math;
import java.util.Scanner;

public class Sugoroku{
  public static void main(String[] args){

    /* イベントの定義 */
    int end = 0;       //スタート、またはエンドイベント
    int gainMoney = 1; //所持金アップイベント
    int loseMoney = 2; //所持金ダウンイベント

    /* 双方向連結リストの生成 */
    DoublyLinkedList dll = new DoublyLinkedList();

    /* マップの追加 */
    dll.add("START", end);
    dll.add("1", gainMoney);
    dll.add("2", loseMoney);
    dll.add("3", gainMoney);
    dll.add("4", gainMoney);
    dll.add("5", gainMoney);
    dll.add("END", end);

    /* ゲームのメインループ */
    int money = 0;
    boolean running = true;
    Node currentNode = dll.first;
    Scanner scan = new Scanner(System.in);

    while(running){
      System.out.printf("現在位置は、「%s」:、所持金は「%d」\n", currentNode.tile, money);
      System.out.print("サイコロを振ります。何か入力。>");
      scan.next();
      int dice = 1 + (int)(Math.random() * 2);
      System.out.printf("「%d」進みます。\n", dice);
      int moved = 0;
      while(!currentNode.tile.equals("END") && moved < dice){
        currentNode = currentNode.next;
        moved += 1;
      }
      System.out.printf("「%s」に着きました。\n", currentNode.tile);
      int currentEvent = currentNode.event;
      switch(currentEvent){
        case 0:
          System.out.println("ゴールです。ゲームを終了します。");
          running = false;
          break;
        case 1:
          System.out.println("収入マスです。所持金を増やします。 +100");
          money += 100;
          break;
        case 2:
          System.out.println("支出マスです。所持金を減らします。 -50");
          money -= 50;
          break;
      }
    }

    System.out.printf("最終的な所持金は、「%d」でした。\n", money);

  }



}
