abstract class Tile{
  /**
  * 双六に含まれる１つ１つのタイルを表現するクラス
  */

  /* フィールド */
  Tile next;   /* 次のタイルへのポインタ */
  String type; /* タイルのタイプ */

  void setType(String type){
    this.type = type;
  }

  String getType(){
    return this.type;
  }


  /* タイルに止まった場合の出力メッセージ */
  String message;

  abstract void activateEvent(Player player);
}
