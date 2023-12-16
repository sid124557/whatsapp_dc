package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.0wd  reason: invalid class name and case insensitive filesystem */
public class C18030wd implements FilenameFilter {
    public final int A00;

    public C18030wd(int i) {
        this.A00 = i;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith("msgstore");
    }
}
