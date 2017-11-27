class Map{
  /** 双六のマップを表現するクラス */
  /* フィールド */
  private Tile start; /* 先頭タイルへのポインタ */
  private Tile end;   /* 末尾タイルへのポインタ */

  /* ゲッター(getter) */
  public Tile getStart(){
    return this.start;
  }

  /* メソッド */
  void add(Tile newTile){
    /* タイルを追加するメソッド */
    if(start == null){
      this.start = newTile;
    }else{
      this.end.setNext(newTile);
    }
    this.end = newTile;
  }
}
