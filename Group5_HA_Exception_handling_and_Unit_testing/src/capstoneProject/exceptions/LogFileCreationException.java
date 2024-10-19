package capstoneProject.exceptions;

public class LogFileCreationException extends Exception {

	private static final long serialVersionUID = 7498145587714938369L;

	public LogFileCreationException() {
		super();
	}

	public LogFileCreationException(String reason) {
		super(reason);
	}
}
