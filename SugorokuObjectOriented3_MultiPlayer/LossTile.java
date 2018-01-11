class LossTile extends Tile{
  /** 減益タイルを表現するクラス */
  /* フィールド */
  int lossAmount; /* 減益量 */

  /* コンストラクタ */
  LossTile(int lossAmount){
    setType("減益");
    this.lossAmount = lossAmount;
  }

  /* メソッド */
  @Override
  public void activateEvent(Player player){
    /* イベント用メソッド */
    System.out.printf("「%s」タイルです。「%d」円失いました。\r\n" ,getType(), this.lossAmount);
    player.setMoney(player.getMoney() - this.lossAmount);
  }
}
