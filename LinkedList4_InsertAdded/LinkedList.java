public class LinkedList{
  Node first;
  Node last;

  public boolean insert(String newValue, int insertPosition){
    boolean succeeded = false;

    /* 要素が一つもない場合は、挿入操作をしない */
    if(this.first == null){
      return succeeded;
    }

    Node newNode = new Node();
    newNode.value = newValue;

    Node currentNode = first;
    int currentPosition = 1;
    /* 挿入位置の探索 */
    while(currentNode != null && currentPosition < insertPosition){
      currentNode = currentNode.next;
      currentPosition += 1;
    }
    /* 挿入可能である場合は、挿入処理 */
    if(currentNode != null && currentPosition == insertPosition){
      if(currentNode == this.last){
        this.last = newNode;
      }
      newNode.next = currentNode.next;
      currentNode.next = newNode;
      succeeded = true;
    }
    return succeeded;
  }

  public void delete(String delValue){
    Node prevNode;
    Node currentNode;

    if(this.first == null){
      return;
    }

    if(this.first.value.equals(delValue)){
      if(this.first == this.last){
        this.first = null;
        this.last = null;

      }else{
        this.first = this.first.next;
      }
      return;
    }else{
      prevNode = this.first;
      currentNode = this.first.next;
    }

    while(currentNode != null){
      if(currentNode.value.equals(delValue)){
        prevNode.next = currentNode.next;
        /* 削除対象ノードが末尾ノードであった場合 */
        if(currentNode == this.last){
          /* 削除対象ノードの前ノードが新たに末尾となる */
          this.last = prevNode;
        }
        break;
      }
      prevNode = currentNode;
      currentNode = currentNode.next;
    }
  }

  public void add(String newValue){
    /* ノードの生成とノードの初期化 */
    Node newNode = new Node();
    newNode.value = newValue;
    newNode.next = null;

    /* 追加する前のリストの要素数が、0個の時と1以上の時で場合分け */
    if(this.first == null){
      this.first = newNode;
      this.last = newNode;
    }else{
      this.last.next = newNode;
      this.last = newNode;
    }
  }

  public void show(){
    Node currentNode = this.first;
    int currentPosition = 1;
    while(currentNode != null){
      System.out.print(currentPosition + ":");
      System.out.println(currentNode.value);
      currentNode = currentNode.next;
      currentPosition = currentPosition + 1;
    }
  }
}
