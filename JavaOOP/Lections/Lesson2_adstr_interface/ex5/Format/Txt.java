package JavaOOP.Lections.Lesson2_adstr_interface.ex5.Format;

import java.io.FileWriter;
import java.io.IOException;

import JavaOOP.Lections.Lesson2_adstr_interface.ex5.Document.TextDocument;

public class Txt extends TextFormat {

    @Override
    public void SaveAs(TextDocument document, String path) {
        try (FileWriter writer = new FileWriter(path + ".txt", false)) {
            writer.write("Txt Format\n");
            writer.write(document.getData());
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
