package board.controller;

import board.dto.request.user.SignUpDto;
import board.dto.respons.ResponseDto;
import board.service.UserService;

// 회원가입 기능
// Controller : 입력에 대한 검증.
public class UserController {
	// main에서 입력 받음 => DTO Class에 Setter로 데이터 할당 => signUp메서드에서 매개변수로 DTO받아서
	// 할당된 데이터 사용.
	private UserService userService;
	
	public UserController() {
		userService = new UserService();
	}
	
	public void signUp(SignUpDto dto) {
		// dto.valiate() 가 true면.
		if (dto.validate()) {
			System.out.println("400 Bad Request");
			System.out.println("모든 값을 입력하세요.");
			return;
		}
		ResponseDto<Boolean> response = userService.signUp(dto);
		System.out.println(response.toString());
	}
}
