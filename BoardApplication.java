package board;

import java.util.Scanner;

import board.controller.UserController;
import board.dto.request.user.SignUpDto;

public class BoardApplication {
	
	private static UserController usercontroller = new UserController();

	public static void main(String[] args) {
		
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("URL End point : ");
			String endPoint = scanner.nextLine();
			
			switch(endPoint) {
			case "POST /sign-up":
				SignUpDto dto = new SignUpDto();
				System.out.println("이메일 주소 : ");
				dto.setEmail(scanner.nextLine());
				System.out.println("비밀번호 : ");
				dto.setPassword(scanner.nextLine());
				System.out.println("비밀번호 확인 : ");
				dto.setPasswordCheck(scanner.nextLine());
				System.out.println("닉네임 : ");
				dto.setNickname(scanner.nextLine());
				System.out.println("휴대전화 번호 : ");
				dto.setPhoneNumber(scanner.nextLine());
				System.out.println("주소 : ");
				dto.setAddress(scanner.nextLine());
				System.out.println("상세 주소 : ");
				dto.setAddressDetail(scanner.nextLine());
				
				//System.out.println(dto.toString()); // SignUpDto Class에 입력된 데이터 할당 확인
				usercontroller.signUp(dto);
				break;
				default:
					// 찾을수 없는 리소스인 경우 404 반환.
					System.out.println("404 Not Found");
			}
		}
	}

}
