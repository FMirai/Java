class GoalTile extends Tile{

  /* コンストラクタ */
  GoalTile(){
    setType("ゴール");
  }

  /* イベント用メソッド */
  @Override
  public void activateEvent(Player player){
    //player.setGoaled(true);   //プレイヤーをゴールしたことにする。
    Sugoroku.notifyPlayerGoaled();
    System.out.println("ゴールマスです。");
    System.out.printf("最終的な所持金は、「%d」円でした。\r\n", player.getMoney());
    System.out.printf("「%s」さん、お疲れ様でした。\r\n",player.getName());

  }
}
