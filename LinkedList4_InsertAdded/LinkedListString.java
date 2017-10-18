public class LinkedListString{
  /* 2_LinkedList1_Basic に Tailフィールドを追加し、add操作を変更 */
  /* 3 deleteメソッドを追加 */
  /* 追加課題：探索Searchを追加 */

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

  public void addFirst(String newValue){
    /* リストの先頭に要素を追加する。 */
    Node newNode = new Node();
    newNode.value = newValue;
    newNode.next = this.first;
    first = newNode;
  }

  public void delete(String delValue){
    Node prevNode = null;
    Node currentNode = first;

    while(currentNode != null){
      /* 先頭の要素を削除することになった場合 */
      if(currentNode.value.equals(delValue)){
        if(currentNode == first){
          first = first.next;
        }else{
          prevNode.next = currentNode.next;
        }
        break;
      }
      prevNode = currentNode;
      currentNode = currentNode.next;
    }
  }

  public boolean insert(String newValue, int position){
    Node newNode = new Node();
    newNode.value = newValue;
    boolean success = false;

    Node currentNode = first;
    int currentPosition = 1;
    while(currentNode != null && currentPosition < position){
      currentNode = currentNode.next;
      currentPosition += 1;
    }
    if(currentNode != null && currentPosition == position){
      newNode.next = currentNode.next;
      currentNode.next = newNode;
      success = true;
    }
    return success;
  }
}

class Node{
  Node next;
  String value;
}
