package noteapp.ui;

import java.util.Scanner;

public class NoteInput {
    public String readNoteFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите заметку: ");
        return scanner.nextLine();
    }
}
