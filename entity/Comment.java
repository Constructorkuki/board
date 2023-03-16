package board.entity;

import java.sql.Date;

/*댓글
댓글 작성자 프로필 사진 (문자열)
댓글 작성자 닉네임 (문자열)
댓글 작성 지난 시간 (날짜)
댓글 내용 (문자열)*/

public class Comment {
	private String writerProfileImageUrl;
	private String writerNickname;
	private Date writerDateTime;
	private String content;
	
	public Comment() {}

	public Comment(String writerProfileImageUrl, String writerNickname, Date writerDateTime, String content) {
		this.writerProfileImageUrl = writerProfileImageUrl;
		this.writerNickname = writerNickname;
		this.writerDateTime = writerDateTime;
		this.content = content;
	}

	public String getWriterProfileImageUrl() {
		return this.writerProfileImageUrl;
	}

	public void setWriterProfileImageUrl(String writerProfileImageUrl) {
		this.writerProfileImageUrl = writerProfileImageUrl;
	}

	public String getWriterNickname() {
		return this.writerNickname;
	}

	public void setWriterNickname(String writerNickname) {
		this.writerNickname = writerNickname;
	}

	public Date getWriterDateTime() {
		return this.writerDateTime;
	}

	public void setWriterDateTime(Date writerDateTime) {
		this.writerDateTime = writerDateTime;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Comment [writerProfileImageUrl=" + this.writerProfileImageUrl + ", writerNickname=" + this.writerNickname
				+ ", writerDateTime=" + this.writerDateTime + ", content=" + this.content + "]";
	}
	
	
	
	
	
}
