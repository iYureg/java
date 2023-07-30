package Exceptions.Seminars.sem3;

import java.io.IOException;

public class Counter implements AutoCloseable {

    private Integer count;

    public Counter() {
        this.count = 0;
    }

    public int getCount() throws IOException {
        checkClose();
        return this.count;
    }

    public void upCount() throws IOException {
        checkClose();
        this.count++;
    }

    @Override
    public void close() throws IOException {
        checkClose();
        this.count = null;
    }

    private void checkClose() throws IOException {
        if (count == null) {
            throw new IOException("counter closed");
        }
    }
}
