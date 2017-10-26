public class LinkedList{
  Node first;
  Node last;

  public void delete(String delValue){
    Node prevNode = null;
    Node currentNode = this.first;

    if(currentNode != null && currentNode.value.equals(delValue)){
      this.first = this.first.next;
      return;
    }else{
      prevNode = this.first;
      currentNode = this.first.next;
    }

    while(currentNode != null){
      if(currentNode.value.equals(delValue)){
        prevNode.next = currentNode.next;
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
    while(currentNode != null){
      System.out.println(currentNode.value);
      currentNode = currentNode.next;
    }
  }
}
