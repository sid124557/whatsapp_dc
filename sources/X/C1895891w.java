package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.91w  reason: invalid class name and case insensitive filesystem */
public class C1895891w implements FilenameFilter {
    public final int A00;

    public C1895891w(int i) {
        this.A00 = i;
    }

    public boolean accept(File file, String str) {
        String str2;
        int i = this.A00;
        boolean startsWith = str.startsWith("override-");
        if (i != 0) {
            if (!startsWith) {
                return false;
            }
            str2 = ".log";
        } else if (startsWith) {
            return false;
        } else {
            if (str.endsWith(".log") || str.endsWith(".zip")) {
                return true;
            }
            str2 = ".tmp";
        }
        if (str.endsWith(str2)) {
            return true;
        }
        return false;
    }
}
