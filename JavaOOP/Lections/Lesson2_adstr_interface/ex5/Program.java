package JavaOOP.Lections.Lesson2_adstr_interface.ex5;

import JavaOOP.Lections.Lesson2_adstr_interface.ex5.Applications.Notepad;
import JavaOOP.Lections.Lesson2_adstr_interface.ex5.Format.*;

public class Program {
    public static void main(String[] args) {

        Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText("text1");
        notes.currentDocument().addAllText("text2");
        notes.currentDocument().addAllText("text3");
        notes.SaveAs("file1", new Txt());
        notes.SaveAs("file2", new Md());
        notes.SaveAs("file3", new Doc());

    }
}
