import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import codssyi.SuppliesInSurplus;

public class Acceptance {
    private static String readInput(String filename) throws IOException {
        return Files.readString(Paths.get(filename));
    }

    @Test
    public void acceptance() throws IOException {
        String input = readInput("src/inputs/test_input.txt");

        SuppliesInSurplus suppliesInSurplus = new SuppliesInSurplus();
        int result = suppliesInSurplus.boxCount(input);

        int expected_result = 43;

        assertEquals(expected_result, result);
    }
}
