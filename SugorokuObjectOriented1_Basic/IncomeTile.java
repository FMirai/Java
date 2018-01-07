class IncomeTile extends Tile{
  /** 収益タイルを表現するクラス */
  /* フィールド */
  int incomeAmount; /* 収益量 */

  /* コンストラクタ */
  IncomeTile(int incomeAmount){
    this.setType("収益");
    this.incomeAmount = incomeAmount;
  }

  /* メソッド */
  @Override
  public void activateEvent(Player player){
    /* イベント用メソッド */
    System.out.printf("「%s」タイルです。\r\n," this.getType());
    System.out.printf("「%d」円獲得しました。\r\n," this.incomeAmount());

    //プレイヤーの所持金を増やす処理
    player.setMoney(player.getMoney() + this.incomeAmount);
  }
}
