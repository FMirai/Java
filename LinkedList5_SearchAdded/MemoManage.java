import java.util.Scanner;

public class MemoManage{
  public static void main(String[] args){
    LinkedListString lls = new LinkedListString();

    /* コマンドを表示 */
    Scanner scan = new Scanner(System.in);
    boolean running = true;
    while(running){
      System.out.print("コマンドを入力してください。([1]:追加(末尾)、" +
                                            "[2]：表示、" +
                                            "[3]:削除、" +
                                            "[4]:追加(先頭)、" +
                                            "[5]:挿入、" +
                                            "[6]:探索、" +
                                            "[9]：終了)>");
      int command = scan.nextInt();
      int position;
      String memo;
      switch(command){
        case 1:
          /* 追加が選択された時の処理 */
          System.out.print("メモに追加する内容を入力してください。>");
          memo = scan.next();
          lls.add(memo);
          System.out.println("「" + memo + "」をメモに追加しました。");
          break;
        case 2:
          /* 表示が選択された時の処理 */
          Node currentNode = lls.first;
          int memoCount = 1;
          while(currentNode != null){
            System.out.printf("%d: ", memoCount++);
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
          }
          break;
        case 3:
          /* 削除が選択された時の処理 */
          System.out.print("メモから削除したい内容を入力してください。>");
          memo = scan.next();
          lls.delete(memo);
          break;
        case 4:
          /* 追加(末尾)が選択された時の処理 */
          System.out.print("メモ(先頭)に追加する内容を入力してください。>");
          memo = scan.next();
          lls.addFirst(memo);
          break;
        case 5:
          /* 挿入が選択された時の処理 */
          System.out.print("メモに挿入する内容を入力してください。>");
          memo = scan.next();
          System.out.print("メモを挿入する位置を入力してください。(1以上)>");
          position = scan.nextInt();
          boolean success = lls.insert(memo, position);
          if(success){
            System.out.println("挿入に成功しました。");
          }else{
            System.out.println("挿入に失敗しました。");
          }
          break;
        case 6:
          /* 探索が選択された場合 */
          System.out.print("探索したいメモの内容を入力してください。>");
          memo = scan.next();
          position = lls.search(memo);
          if(position != -1){
            System.out.printf("探しているメモは、%d番目にあります。\n", position);
          }else{
            System.out.println("探しているメモは、存在しません。");
          }
          break;
        case 9:
          /* 終了が選択された時の処理 */
          System.out.println("終了します。");
          running = false;
          break;
        default:
          System.out.println("想定されていないコマンドです。");

      }
    }
  }
}
