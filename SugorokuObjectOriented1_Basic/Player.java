class Player{
  /**
  * 双六のプレイヤーを表現するクラス
  */

  /* フィールド */
  String name;   /* プレイヤー名 */
  int money;     /* 所持金 */

  /* プレイヤークラスのコンストラクタ */
  Player(String name){
    this.name = name;
  }

  /* プレイヤーが現在存在するタイル */
  Tile currentPosition;

  /* 前に進むメソッド */
  void moveForward(int stepCount){
    int movedCount = 0;
    while(movedCount < stepCount && this.currentPosition != null){
      this.currentPosition = this.currentPosition.next;
      movedCount += 1;
    }

    if(currentPosition != null){
      currentPosition.activateEvent(this);
    }
  }


}
