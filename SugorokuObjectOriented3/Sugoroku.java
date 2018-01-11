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
    Player newPlayer = new Player(playerName);
    newPlayer.setCurrentMap(map);        /* マップへの配置 */

    /* プレイヤーの管理 */
    //ArrayList<Player> players = new ArrayList<Player>();
    //players.add(newplayer);         /* リストへの追加 */
    playerCount += 1;
    Player player = newPlayer;


    /* ゲームのメインループ */
    while(playerCount != goaledPlayerCount){

      //for(Player player: players){
        /*if(player.isGoaled()){
          continue;
        }*/
        System.out.printf("%sさんの番です。\r\n", player.getName());
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
          goaledPlayerCount = playerCount;
          break;
        }
      //}
    }
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
    goaledPlayerCount++;
  }
}
