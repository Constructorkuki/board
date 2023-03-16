package board.entity;

/*좋아요
좋아요한 사용자 이메일(문자열)
좋아요한 사용자 프로필 사진(문자열)
좋아요 한 사용자 닉네임(문자열)*/

public class Like {
	private String userEmail;
	private String userProfileImageUrl;
	private String userNickname;
	
	public Like() {}

	public Like(String userEmail, String userProfileImageUrl, String userNickname) {
		this.userEmail = userEmail;
		this.userProfileImageUrl = userProfileImageUrl;
		this.userNickname = userNickname;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserProfileImageUrl() {
		return this.userProfileImageUrl;
	}

	public void setUserProfileImageUrl(String userProfileImageUrl) {
		this.userProfileImageUrl = userProfileImageUrl;
	}

	public String getUserNickname() {
		return this.userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	@Override
	public String toString() {
		return "Like [userEmail=" + this.userEmail + ", userProfileImageUrl=" + this.userProfileImageUrl + ", userNickname="
				+ this.userNickname + "]";
	}
	
	
}
