package JavaOOP.Lections.Lesson2_adstr_interface.ex5.Applications;

import java.util.ArrayList;
import java.util.List;

import JavaOOP.Lections.Lesson2_adstr_interface.ex5.Document.TextDocument;
import JavaOOP.Lections.Lesson2_adstr_interface.ex5.Format.TextFormat;

public class Notepad {
    private List<TextDocument> documents;
    private int index;

    public Notepad() {
        documents = new ArrayList<>();
        index = -1;
    }

    public void newFile() {
        documents.add(new TextDocument());
        index++;
    }

    public TextDocument currentDocument() {
        return documents.get(index);
    }

    public void SaveAs(String path, TextFormat format) {
        format.SaveAs(documents.get(index), path);
    }
}
