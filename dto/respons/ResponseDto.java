package board.dto.respons;
// 사용자에게 반환해주는 포멧.
public class ResponseDto<D> {
	
	private boolean status;
	private String message;
	private D data;
	
	public ResponseDto() {}
	
	public ResponseDto(boolean status, String message, D data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public D getData() {
		return this.data;
	}

	public void setData(D data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResponseDto [status=" + this.status + ", message=" + this.message + ", data=" + this.data + "]";
	}
	
	
}
