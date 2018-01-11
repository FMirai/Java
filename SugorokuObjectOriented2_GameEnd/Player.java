import java.util.Random;

class Player{
  /** 双六のプレイヤーを表現するクラス */
  /* フィールド */
  private String name;      /* プレイヤー名 */
  private int money;        /* 所持金 */
  private Map currentMap; /* 現在マップ */
  private Tile currentPosition;/* プレイヤーが現在存在するタイル */

  /* コンストラクタ */
  Player(String name){
    this.name = name;
  }

  /* ゲッター(getter) & セッター(setter) */
  public String getName(){ return this.name; }
  public void setMoney(int money){ this.money = money; }
  public int getMoney(){ return this.money; }

  /* プレイヤーをマップに配置するメソッド */
  public void setCurrentMap(Map map){
    this.currentMap = map;
    this.currentPosition = map.getStart();
  }

  /* メソッド */
  public int rollDice(){
    /* サイコロを振るメソッド */
    Random random = new Random();
    int dice = random.nextInt(6) + 1;
    return dice;
  }

  /* 前に進むメソッド */
  public void moveForward(int stepCount){
    int movedCount = 0;
    while(movedCount < stepCount && !(this.currentPosition instanceof GoalTile)){
      this.currentPosition = this.currentPosition.getNext();
      movedCount += 1;
    }
    if(currentPosition != null){
      currentPosition.activateEvent(this);
    }
  }
}
