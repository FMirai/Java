import java.util.Scanner;

public class MemoManage{
  public static void main(String[] args){
    /* リストの生成 */
    LinkedList list = new LinkedList();

    /* スキャナーの生成 */
    Scanner scan = new Scanner(System.in);
    while(true){
      /* コマンド入力 */
      System.out.print("コマンドを入力してください。([1]:追加(末尾)、" +
                                            "[2]：表示、" +
                                            "[3]:削除、" +
                                            "[4]:挿入、" +
                                            "[9]：終了)>");
      int command = scan.nextInt();
      /* コマンドによる分岐 */
      if(command == 1){
        /* 追加が選択された時の処理 */
        System.out.print("メモに追加する内容を入力してください。>");
        String memo = scan.next();
        list.add(memo);
        System.out.println("「" + memo + "」をメモに追加しました。");
      }else if(command == 2){
        /* 表示が選択された時の処理 */
        list.show();
      }else if(command == 3){
        /* 削除が選択された時の処理 */
        System.out.print("メモから削除したい内容を入力してください。>");
        String delMemo = scan.next();
        list.delete(delMemo);
      }else if(command == 4){
        /* 挿入が選択された時の処理 */
        System.out.print("メモに挿入する内容を入力してください。>");
        String memo = scan.next();
        System.out.print("メモを挿入する位置を入力してください。(1以上)>");
        int position = scan.nextInt();
        boolean succeeded = list.insert(memo, position);
        if(succeeded){
          System.out.println("挿入に成功しました。");
        }else{
          System.out.println("挿入に失敗しました。");
        }

      }else if(command == 9){
        /* 終了が選択された時の処理 */
        System.out.println("終了します。");
        break;
      }
    }
  }
}
