package board.repository;

import java.util.ArrayList;
import java.util.List;

import board.entity.User;

// DB대신 쓰는 메모리 저장소.
public class UserRepository {
	
	private static List<User> userTable = new ArrayList<>(); 
	// 이메일 중복 확인.
	// userTable에 같은 이메일 있으면...
	public boolean existsByEmail(String email) {
		boolean result = false;
		for (User user: userTable) {
			if (user.getEmail().equals(email)) {
				result = true;
				break;
			}
		}
		return result;
	}
	
	public User save(User user) {
		userTable.add(user);
		return user;
	}
}
