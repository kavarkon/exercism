package log.levels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogLevelsTest {

    @Test
    void messageTest() {
        assertEquals("Invalid operation", LogLevels.message("[ERROR]: Invalid operation"));
        assertEquals("Disk almost full", LogLevels.message("[WARNING]:  Disk almost full\r\n"));
    }

    @Test
    void logLevelTest() {
        assertEquals("error", LogLevels.logLevel("[ERROR]: Invalid operation"));
        assertEquals("warning", LogLevels.logLevel("[WARNING]:  Disk almost full\r\n"));
    }

    @Test
    void reformatTest() {
        assertEquals("Operation completed (info)", LogLevels.reformat("[INFO]: Operation completed"));
        assertEquals("Invalid operation (error)", LogLevels.reformat("[ERROR]: Invalid operation"));
    }
}