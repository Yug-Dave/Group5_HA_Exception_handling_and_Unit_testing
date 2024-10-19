package capstoneProject.exceptions;


public class LogFileDoesNotExistException extends Exception {

	private static final long serialVersionUID = 5693545710245129606L;

	public LogFileDoesNotExistException() {
		super();
	}

	public LogFileDoesNotExistException(String reason) {
		super(reason);
	}
}
