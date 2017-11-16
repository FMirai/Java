class Map{
  /**
  * 双六のマップを表現するクラス
  */

  /* 最初と最後のタイルへのポインタ */
  Tile start;
  Tile end;

  /* 総タイル数を数える変数 */
  int tile_count = 0;

  /* タイルを追加するメソッド */
  void add(Tile newTile){

    if(start == null){
      this.start = newTile;
    }else{
      this.end.next = newTile;
    }
    this.end = newTile;
  }
}
