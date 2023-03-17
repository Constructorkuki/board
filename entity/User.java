package board.entity;

import board.dto.request.user.SignUpDto;

/*회원
이메일 주소 (문자열) / 비밀번호 (문자열)
닉네임 (문자열) / 핸드폰 번호 (문자열) / 주소 (문자열) / 상세 주소 (문자열) 
프로필 사진 (문자열)*/
// 유저 클래스는 계속 쓰임. 보관하고 관리하면셔. ( 지속적인 관리용 ) 그렇기 때문에 필드도 지속적으로 관리될만한 얘들로 구성.
// entity에서는 Setter을 사용하지 않기로 정함. 여기서는 DB없이 구현하기 때문에 Setter 사용.
public class User {
	private String email;
	private String password;
	private String nickname;
	private String phoneNumber;
	private String address;
	private String addressDetail;
	private String profileImageUrl;
	
	public User() {}

	public User(String email, String password, String nickname, String phoneNumber, String address,
			String addressDetail, String profileImageUrl) {
		this.email = email;
		this.password = password;
		this.nickname = nickname;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.addressDetail = addressDetail;
		this.profileImageUrl = profileImageUrl;
	}
	
	public User(SignUpDto dto) {
		this.email = dto.getEmail();
		this.password = dto.getPassword();
		this.nickname = dto.getNickname();
		this.phoneNumber = dto.getPhoneNumber();
		this.address = dto.getAddress();
		this.addressDetail = dto.getAddressDetail();
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressDetail() {
		return this.addressDetail;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public String getProfileImageUrl() {
		return this.profileImageUrl;
	}

	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	@Override
	public String toString() {
		return "User [email=" + this.email + ", password=" + this.password + ", nickname=" + this.nickname + ", phoneNumber="
				+ this.phoneNumber + ", address=" + this.address + ", addressDetail=" + this.addressDetail + ", profileImageUrl="
				+this. profileImageUrl + "]";
	}
	
}
