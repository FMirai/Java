public class LinkedListString{
  /* 2_LinkedList1_Basic に Tailフィールドを追加し、add操作を変更 */

  Node first;
  Node tail;

  public void add(String newValue){
    /* ノードの生成とノードの初期化 */
    Node newNode = new Node();
    newNode.value = newValue;
    newNode.next = null;

    /* 追加する前のリストの要素数が、0個の時と1以上の時で場合分け */
    if(this.first == null){
      this.first = newNode;
      this.tail = newNode;
    }else{
      tail.next = newNode;
      tail = newNode;
    }
  }
}

class Node{
  Node next;
  String value;
}
