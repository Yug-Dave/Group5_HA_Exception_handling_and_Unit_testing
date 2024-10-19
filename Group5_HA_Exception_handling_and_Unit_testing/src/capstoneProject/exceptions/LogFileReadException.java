package capstoneProject.exceptions;

public class LogFileReadException extends Exception {

	private static final long serialVersionUID = -3891279592447815901L;

	public LogFileReadException() {
		super();
	}

	public LogFileReadException(String reason) {
		super(reason);
	}
}
