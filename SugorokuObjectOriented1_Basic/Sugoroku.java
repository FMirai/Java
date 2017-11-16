import java.lang.Math;
import java.util.Scanner;
import java.util.Random;

public class Sugoroku{
  public static void main(String[] args){

    /* スキャナーとランダムの用意 */
    Scanner scan = new Scanner(System.in);
    Random random = new Random();

    /* マップの生成 */
    Map map = new Map();
    createMap(map);

    /* プレイヤー作成 */
    System.out.print("プレイヤー名を入力してください。>");
    String playerName = scan.next();
    Player player = new Player(playerName);
    player.currentPosition = map.start;

    /* ゲームのメインループ */
    int dice = random.nextInt(2) + 1;
    System.out.println(dice);

  }

  static void createMap(Map map){
    map.add(new IncomeTile(100));
    map.add(new IncomeTile(200));
    map.add(new LossTile(100));
    map.add(new IncomeTile(100));
    map.add(new LossTile(200));
    map.add(new IncomeTile(300));
    map.add(new IncomeTile(500));
  }
}
