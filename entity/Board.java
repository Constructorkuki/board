package board.entity;

import java.util.List;

/*게시물
게시물 번호 (정수) / 이미지 (문자열) / 작성자 이메일 (문자열) / 작성자 닉네임 (문자열) / 작성자프로필 사진 (문자열)
작성일 (문자열) / 제목 (문자열) / 내용 (문자열) / 조회 수 (정수)
좋아요 리스트 / 댓글 리스트*/

public class Board {
	private int boardNumber;
	private String boardImageUrl;
	private String witerEmail;
	private String witerNickname;
	private String witerProfileImageUrl;
	private String writeDate;
	private String title;
	private String content;
	private int viewCount;
	private List<Like> likeList;
	private List<Comment> commentList;
	
	public Board() {}

	public Board(int boardNumber, String boardImageUrl, String witerEmail, String witerNickname,
			String witerProfileImageUrl, String writeDate, String title, String content, int viewCount,
			List<Like> likeList, List<Comment> commentList) {
		this.boardNumber = boardNumber;
		this.boardImageUrl = boardImageUrl;
		this.witerEmail = witerEmail;
		this.witerNickname = witerNickname;
		this.witerProfileImageUrl = witerProfileImageUrl;
		this.writeDate = writeDate;
		this.title = title;
		this.content = content;
		this.viewCount = viewCount;
		this.likeList = likeList;
		this.commentList = commentList;
	}

	public int getBoardNumber() {
		return this.boardNumber;
	}

	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}

	public String getBoardImageUrl() {
		return this.boardImageUrl;
	}

	public void setBoardImageUrl(String boardImageUrl) {
		this.boardImageUrl = boardImageUrl;
	}

	public String getWiterEmail() {
		return this.witerEmail;
	}

	public void setWiterEmail(String witerEmail) {
		this.witerEmail = witerEmail;
	}

	public String getWiterNickname() {
		return this.witerNickname;
	}

	public void setWiterNickname(String witerNickname) {
		this.witerNickname = witerNickname;
	}

	public String getWiterProfileImageUrl() {
		return this.witerProfileImageUrl;
	}

	public void setWiterProfileImageUrl(String witerProfileImageUrl) {
		this.witerProfileImageUrl = witerProfileImageUrl;
	}

	public String getWriteDate() {
		return this.writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getViewCount() {
		return this.viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public List<Like> getLikeList() {
		return this.likeList;
	}

	public void setLikeList(List<Like> likeList) {
		this.likeList = likeList;
	}

	public List<Comment> getCommentList() {
		return this.commentList;
	}

	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}

	@Override
	public String toString() {
		return "Board [boardNumber=" + this.boardNumber + ", boardImageUrl=" + this.boardImageUrl + ", witerEmail=" + this.witerEmail
				+ ", witerNickname=" + this.witerNickname + ", witerProfileImageUrl=" + this.witerProfileImageUrl + ", writeDate="
				+this.writeDate + ", title=" + this.title + ", content=" + this.content + ", viewCount=" + this.viewCount + ", likeList="
				+ this.likeList + ", commentList=" + this.commentList + "]";
	}
	
	
	
}
