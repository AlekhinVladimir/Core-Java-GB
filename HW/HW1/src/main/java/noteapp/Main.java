package noteapp;

import noteapp.logic.NoteWriter;
import noteapp.ui.NoteInput;

public class Main {
    public static void main(String[] args) {
        NoteInput noteInput = new NoteInput();
        String note = noteInput.readNoteFromUser();

        NoteWriter noteWriter = new NoteWriter();
        noteWriter.writeNoteToFile(note);
    }
}

