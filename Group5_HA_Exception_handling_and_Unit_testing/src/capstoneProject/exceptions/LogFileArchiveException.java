package capstoneProject.exceptions;


public class LogFileArchiveException extends Exception {

	private static final long serialVersionUID = -3883206292973439967L;

	public LogFileArchiveException() {
		super();
	}

	public LogFileArchiveException(String reason) {
		super(reason);
	}
}
