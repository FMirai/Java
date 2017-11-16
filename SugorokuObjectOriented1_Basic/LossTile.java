class LossTile extends Tile{

  int lossAmount;

  /* コンストラクタ */
  LossTile(int lossAmount){
    setType("減益");
    this.lossAmount = lossAmount;
  }

  /* イベント用メソッド */
  @Override
  void activateEvent(Player player){
    System.out.printf("「%s」タイルです。「%d」円失いました。\r\n" ,getType(), this.lossAmount);
    player.money = player.money - this.lossAmount;
  }

}
