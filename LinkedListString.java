public class LinkedListString{
  /* 追加課題:完全一致ではなく、部分一致で検索 */
  /* 追加課題:部分一致するものを、すべて表示 */

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
      if(currentNode == tail){
        tail = newNode;
      }
      newNode.next = currentNode.next;
      currentNode.next = newNode;
      success = true;
    }
    return success;
  }

  public int search(String searchValue){
    Node currentNode = first;
    int currentPosition = 1;
    while(currentNode != null && !currentNode.value.equals(searchValue)){
      currentNode = currentNode.next;
      currentPosition += 1;
    }
    if(currentNode == null){
      currentPosition = -1;
    }
    return currentPosition;
  }
}

class Node{
  Node next;
  String value;
}
