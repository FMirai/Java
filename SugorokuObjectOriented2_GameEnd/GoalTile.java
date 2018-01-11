class GoalTile extends Tile{

  /* コンストラクタ */
  GoalTile(){
    setType("ゴール");
  }

  /* イベント用メソッド */
  @Override
  public void activateEvent(Player player){
    Sugoroku.notifyPlayerGoaled();
    System.out.printf("「%s」タイルです。\r\n",  this.getType());
    System.out.printf("「%s」さん、お疲れ様でした。\r\n", player.getName());
  }
}
