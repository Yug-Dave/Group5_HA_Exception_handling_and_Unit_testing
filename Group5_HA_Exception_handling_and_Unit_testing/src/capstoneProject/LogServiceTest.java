package capstoneProject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import capstoneProject.exceptions.LogFileCreationException;
import capstoneProject.exceptions.LogFileDoesNotExistException;
import capstoneProject.exceptions.LogFileReadException;
import capstoneProject.exceptions.LogNotFoundException;

public class LogServiceTest {
	private LogService logService;

	LogServiceTest() throws LogFileCreationException {
		this.logService = new LogService("temp-logs");
	}

	@Test
	public void testCreateLogFile()
			throws LogFileCreationException, LogFileReadException, LogFileDoesNotExistException, LogNotFoundException {

		final String EQUIPMENT_NAME = "random-eName";
		final LogMetadata logMetadata = new LogMetadata("eachDay", EQUIPMENT_NAME, "eSource");

		this.logService.createLogFile(logMetadata, "random-content-here");
		List<String> equipments = this.logService.getLogFilesByEquipment(EQUIPMENT_NAME);

		assertTrue(equipments.contains(logMetadata.getLogFileName()));
	}

	@Test
	public void testCreateLogFileException() {
		LogMetadata logMetadata = new LogMetadata("eachDay", "/../../../../../../../../../eName", "eSource");
		try {
			this.logService.createLogFile(logMetadata, "random-content-here");
		} catch (Exception e) {
			assertEquals(e.getClass(), LogFileCreationException.class);
		}
	}

	@Test
	public void testCreateArchiveLogFileException() {
		final String LOG_FILE_ARCHIVE_NAME = "/../../../../../../../../random-archive-file-name";
		try {
			this.logService.archiveLogFile(LOG_FILE_ARCHIVE_NAME);
		} catch (Exception e) {
			assertEquals(e.getClass(), LogFileCreationException.class);
		}
	}

	@Test
	public void testDeleteLogException() {

		final String NOT_EXIST_LOG_FILE_NAME = "random-log-file-name";

		try {
			this.logService.deleteLogFile(NOT_EXIST_LOG_FILE_NAME);
		} catch (Exception e) {
			assertEquals(e.getClass(), LogFileDoesNotExistException.class);
		}
	}

	@Test
	public void testListEmptyLogEquipmentException() {

		final String NO_EXIST_LOG_FILE_NAME = "random-log-file-name";

		try {
			this.logService.getLogFilesByEquipment(NO_EXIST_LOG_FILE_NAME);
		} catch (Exception e) {
			assertEquals(e.getClass(), LogNotFoundException.class);
		}
	}

}
