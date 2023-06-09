package board.service;

import board.dto.request.user.SignUpDto;
import board.dto.respons.ResponseDto;
import board.entity.User;
import board.repository.UserRepository;

// 데이터 보관
public class UserService {
	
	private UserRepository userRepository;
	
	public UserService() {
		userRepository = new UserRepository();
	}
	
	public ResponseDto<Boolean> signUp(SignUpDto dto) {
		String email = dto.getEmail();
		String password = dto.getPassword();
		String passwordCheck = dto.getPasswordCheck();
		
		boolean hasEmail = userRepository.existsByEmail(email);
		if (hasEmail)
			return new ResponseDto<Boolean>(false, "존재하는 이메일입니다.", false);
		
		if (!password.equals(passwordCheck))
			return new ResponseDto<Boolean>(false, "비밀번호가 서로 다릅니다.", false);
		
		User user = new User(dto);
		userRepository.save(user);
		
		return new ResponseDto<Boolean>(true, "성공", true);
	}
}
