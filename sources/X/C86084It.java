package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.4It  reason: invalid class name and case insensitive filesystem */
public class C86084It implements FilenameFilter {
    public final int A00;

    public C86084It(int i) {
        this.A00 = i;
    }

    public final boolean accept(File file, String str) {
        String str2;
        switch (this.A00) {
            case 0:
                str2 = ".stacktrace";
                break;
            case 1:
                return str.startsWith("HIST_SYNC");
            default:
                str2 = ".log";
                break;
        }
        return str.endsWith(str2);
    }
}
