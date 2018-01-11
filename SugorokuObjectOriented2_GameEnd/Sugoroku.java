import java.lang.Math;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Sugoroku{
  static private int playerCount = 0;
  static private int goaledPlayerCount = 0;

  public static void main(String[] args){

    /* スキャナーの用意 */
    Scanner scan = new Scanner(System.in);

    /* マップの生成 */
    Map map = createMap();

    /* プレイヤー作成 */
    System.out.print("プレイヤー名を入力してください。>");
    String playerName = scan.next();
    Player player = new Player(playerName);
    player.setCurrentMap(map);        /* マップへの配置 */
    Sugoroku.playerCount += 1;

    /* ゲームのメインループ */
    while(playerCount != goaledPlayerCount){
        System.out.print("コマンドを選択してください。" +
                           "[1]：ダイス、" +
                           "[9]：終了>");
        int command = scan.nextInt();

        if(command == 1){
          /* ダイス */
          int dice = player.rollDice();
          System.out.printf("「%d」がでました、「%d」マス進みます。\r\n", dice, dice);
          player.moveForward(dice);
        }else if(command == 9){
          /* 終了 */
          System.out.println("終了します。");
          break;
        }
    }
    System.out.printf("プレイヤー「%s」の最終的な所持金は、" +
                "「%d円」でした。\r\n", player.getName(), player.getMoney());
  }

  static Map createMap(){
    Map map = new Map();
    map.add(new IncomeTile(0));   //0
    map.add(new IncomeTile(100)); //1
    map.add(new IncomeTile(200)); //2
    map.add(new IncomeTile(300)); //3
    map.add(new IncomeTile(400)); //4
    map.add(new IncomeTile(500)); //5
    map.add(new IncomeTile(600)); //6
    map.add(new GoalTile());      //7
    return map;
  }

  public static void notifyPlayerGoaled(){
    Sugoroku.goaledPlayerCount++;
  }
}
