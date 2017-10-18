public class LinkedListString{
  Node first;

  public void add(String newValue){
    /* ノードの生成とノードの初期化 */
    Node newNode = new Node();
    newNode.value = newValue;
    newNode.next = null;

    /* 追加する前のリストの要素数が、0個の時と1以上の時で場合分け */
    if(this.first == null){
      this.first = newNode;
    }else{
      Node current = first;
      while(current.next != null){
        current = current.next;
      }
      current.next = newNode;
    }
  }
}

class Node{
  Node next;
  String value;
}
