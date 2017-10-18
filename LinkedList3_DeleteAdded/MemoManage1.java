import java.util.Scanner;
/*
 *追加問題案
 *1:最初に出現するものを１つ削除する仕様だが、複数回出現する場合は、すべて削除するよう変更
 *2:削除した個数を表示する
*/
public class MemoManage1{
  public static void main(String[] args){
    LinkedListString1 lls = new LinkedListString1();

    /* コマンドを表示 */
    Scanner scan = new Scanner(System.in);
    while(true){
      System.out.print("コマンドを入力してください。([1]:追加、[2]：表示、[3]:削除、[9]：終了)>");
      int command = scan.nextInt();
      if(command == 1){
        /* 追加が選択された時の処理 */
        System.out.print("メモに追加する内容を入力してください。>");
        String memo = scan.next();
        lls.add(memo);
        System.out.println("「" + memo + "」をメモに追加しました。");

      }else if(command == 2){
        /* 表示が選択された時の処理 */
        Node currentNode = lls.first;
        while(currentNode != null){
          System.out.println(currentNode.value);
          currentNode = currentNode.next;
        }
      }else if(command == 3){
        /* 削除が選択された時の処理 */
        System.out.print("メモから削除したい内容を入力してください。>");
        String delMemo = scan.next();
        int numDeleted = lls.delete(delMemo);
        System.out.printf("%d件のメモを削除しました。\n", numDeleted);

      }else if(command == 9){
        /* 終了が選択された時の処理 */
        System.out.println("終了します。");
        break;
      }
    }
  }
}
