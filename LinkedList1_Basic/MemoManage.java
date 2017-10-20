import java.util.Scanner;

public class MemoManage{
  public static void main(String[] args){
    LinkedList ll = new LinkedList();

    /* コマンドを表示 */
    Scanner scan = new Scanner(System.in);
    while(true){
      System.out.print("コマンドを入力してください。([1]:追加、[2]：表示、[9]：終了)>");
      int command = scan.nextInt();
      if(command == 1){
        /* 追加が選択された時の処理 */
        System.out.print("メモに追加する内容を入力してください。>");
        String memo = scan.next();
        ll.add(memo);
        System.out.println("「" + memo + "」をメモに追加しました。");

      }else if(command == 2){
        /* 表示が選択された時の処理 */
        ll.show();
      }else if(command == 9){
        /* 終了が選択された時の処理 */
        System.out.println("終了します。");
        break;
      }
    }
  }
}
