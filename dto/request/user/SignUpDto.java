package board.dto.request.user;

public class SignUpDto {
	
	private String email;
	private String password;
	private String passwordCheck;
	private String nickname;
	private String phoneNumber;
	private String address;
	private String addressDetail;
	
	public SignUpDto() {}

	public SignUpDto(String email, String password, String passwordCheck, String nickname, String phoneNumber,
			String address, String addressDetail) {
		this.email = email;
		this.password = password;
		this.passwordCheck = passwordCheck;
		this.nickname = nickname;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.addressDetail = addressDetail;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordCheck() {
		return this.passwordCheck;
	}

	public void setPasswordCheck(String passwordCheck) {
		this.passwordCheck = passwordCheck;
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

	@Override
	public String toString() {
		return "SignUpDto [email=" + this.email + ", password=" + this.password + ", passwordCheck=" + this.passwordCheck
				+ ", nickname=" + this.nickname + ", phoneNumber=" + this.phoneNumber + ", address=" + this.address
				+ ", addressDetail=" + this.addressDetail + "]";
	}
	
	public boolean validate() {
		boolean result = this.email.isBlank() || 
						 this.password.isBlank() ||
						 this.passwordCheck.isBlank() ||
						 this.nickname.isBlank() ||
						 this.phoneNumber.isBlank() ||
						 this.address.isBlank() ||
						 this.addressDetail.isBlank();
		return result;
	}
	
}
