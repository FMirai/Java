public class DoublyLinkedList{

  Node first;
  Node tail;

  public void add(String newTile, int newEvent){
    /* ノードの生成とノードの初期化 */
    Node newNode = new Node();
    newNode.event = newEvent;
    newNode.tile = newTile;

    /* 追加する前のリストの要素数が0個の時と1以上の時で場合分け */
    if(first == null){
      first = newNode;
      tail = newNode;
    }else{
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }
  }
}

class Node{
  Node next;
  Node prev;
  int event;
  String tile;
}
