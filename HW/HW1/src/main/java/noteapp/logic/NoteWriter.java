package noteapp.logic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NoteWriter {
    public void writeNoteToFile(String note) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("notes.txt", true))) {
            String currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            writer.write(currentTime + " -> " + note);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
