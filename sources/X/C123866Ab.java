package X;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Locale;

/* renamed from: X.6Ab  reason: invalid class name and case insensitive filesystem */
public class C123866Ab implements FilenameFilter {
    public final int A00;

    public C123866Ab(int i) {
        this.A00 = i;
    }

    public final boolean accept(File file, String str) {
        String str2;
        int i;
        switch (this.A00) {
            case 0:
                return str.endsWith(".pack");
            case 1:
                return str.toLowerCase(Locale.US).endsWith(".dmp");
            case 2:
                C162457s7.A0H(str);
                str2 = ".json";
                i = 0;
                break;
            default:
                str2 = ".json";
                i = 2;
                break;
        }
        C162457s7.A0J(str, i);
        return str.endsWith(str2);
    }
}
