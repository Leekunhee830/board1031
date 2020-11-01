

import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    
    	String[] titles=new String[10];
    	String[] bodys=new String[10];
    	int[] ids=new int[10];
    	int index=0;
    	int id=1;
 
    	while(true) {
    		System.out.print("명령어를 입력해주세요:");
            String str1=sc.nextLine();
            if(str1.equals("exit")) {
            	System.out.println("프로그램을 종료 합니다.");
            	break;
            }
            if(str1.equals("add")) {
            	System.out.println("게시물 제목을 입력해주세요:");
            	titles[index]=sc.nextLine();
            	System.out.println("게시물 내용을 입력해주세요:");
            	bodys[index]=sc.nextLine();
            	System.out.println("게시물이 등록되었습니다.");
            	ids[index]=id;
            	
            	index++;
                id++;
            }
            if(str1.equals("list")) {
            	for(int i=0;i<index;i++) {
            	System.out.println("번호 : "+ids[i]);
            	System.out.println("제목 : "+titles[i]);
            	System.out.println("=======================");
            	}
            } 
    	}	
    }
}

class Information{
	private int ids;
	private String title;
	private String body;
	
	
}
