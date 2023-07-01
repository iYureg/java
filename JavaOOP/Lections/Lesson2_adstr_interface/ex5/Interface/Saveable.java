package JavaOOP.Lections.Lesson2_adstr_interface.ex5.Interface;

import JavaOOP.Lections.Lesson2_adstr_interface.ex5.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
