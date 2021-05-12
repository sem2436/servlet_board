import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
//	List<Article> articles = new ArrayList<>();
	public static void main(String[] args) {
		int articleNum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("==프로그램 시작==");
		
		while(true) {
			System.out.println("명령어)");
			String command = sc.nextLine().trim();
			if(command.length() == 0) {
				System.out.println("명령어를 입력해주세요.");
				continue;
			}
			if(command.equals("system exit")) {
				System.out.println("==프로그램 종료==");
				break;
			}
			else if(command.equals("article list")) {
				System.out.println("게시물이 없습니다.");
			}
			else if(command.equals("article write")) {
				System.out.println("제목 : ");
				String title = sc.nextLine();
				System.out.println("내용 : ");
				String body = sc.nextLine();
				System.out.println(articleNum+1 + "번 게시물이 2021-05-12  09:27:00에 작성되었습니다.");
				articleNum++;
			}
			else {
				System.out.println(command + "는 없는 명령어 입니다.");
				continue;
			}
		}
		sc.close();
	}
}
//class Article {
//	
//}