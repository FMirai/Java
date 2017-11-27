abstract class Tile{
  /** 双六に含まれる１つ１つのタイルを表現するクラス */
  /* フィールド */
  private Tile next;   /* 次のタイルへのポインタ */
  private String type; /* タイルのタイプ */

  /* セッター(setter) & ゲッター(getter) */
  public void setNext(Tile next){ this.next = next; }
  public Tile getNext(){ return this.next; }
  public void setType(String type){ this.type = type; }
  public String getType(){ return this.type; }

  /* 抽象メソッド */
  public abstract void activateEvent(Player player);
}
