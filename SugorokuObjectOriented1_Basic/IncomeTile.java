class IncomeTile extends Tile{

  int incomeAmount;

  /* コンストラクタ */
  IncomeTile(int incomeAmount){
    setType("収益");
    this.incomeAmount = incomeAmount;
  }

  /* イベント用メソッド */
  @Override
  void activateEvent(Player player){
    System.out.printf("「%s」タイルです。「%d」円獲得しました。\r\n" ,getType(), this.incomeAmount);
    player.money = player.money + this.incomeAmount;
  }
}
