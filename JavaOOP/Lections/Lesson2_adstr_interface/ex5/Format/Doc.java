package JavaOOP.Lections.Lesson2_adstr_interface.ex5.Format;

import java.io.FileWriter;
import java.io.IOException;

import JavaOOP.Lections.Lesson2_adstr_interface.ex5.Document.TextDocument;

public class Doc extends TextFormat {

    @Override
    public void SaveAs(TextDocument document, String path) {
        try (FileWriter writer = new FileWriter(path + ".doc", false)) {
            writer.write("<?Doc Format>\n");
            writer.write(document.getData());
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
