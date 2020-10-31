import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	HashMap<String,String> amp=new HashMap<String,String>();
    	String title="";
    	String content="";
    	
 
    	while(true) {
    		System.out.print("명령어를 입력해주세요:");
            String str1=sc.nextLine();
            if(str1.equals("exit")) {
            	System.out.println("프로그램을 종료 합니다.");
            	break;
            }
            if(str1.equals("add")) {
            	System.out.println("게시물 제목을 입력해주세요:");
            	title=sc.nextLine();
            	System.out.println("게시물 내용을 입력해주세요:");
            	content=sc.nextLine();
            	amp.put(title,content);
            	System.out.println("게시물이 등록되었습니다.");
            }
            if(str1.equals("list")) {
            	Set set=amp.keySet();
            	Iterator it=set.iterator();
            	while(it.hasNext()) {
            		System.out.println(it.next());
            	}
            }
    	}	
    }
}
