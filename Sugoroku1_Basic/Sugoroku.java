public class Sugoroku{
  public static void main(String[] args){

    /* イベントの定義 */
    int end = 0;       //スタート、またはエンドイベント
    int gainMoney = 1; //所持金アップイベント
    int loseMoney = 2; //所持金ダウンイベント

    /* 双方向連結リストの生成 */
    DoublyLinkedList dll = new DoublyLinkedList();

    /* マップの追加 */
    dll.add("0(START)", 0);
    dll.add("1", gainMoney);
    dll.add("2", loseMoney);

    /* マップの表示 */
    Node currentNode = dll.first;
    while(currentNode != null){
      System.out.printf("タイル:%s、イベント:%d\n", currentNode.floorNum, currentNode.event);
      currentNode = currentNode.next;

    }

  }



}
