package X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.0i1  reason: invalid class name and case insensitive filesystem */
public class C10490i1 implements FileFilter {
    public final /* synthetic */ C10460hy A00;

    public C10490i1(C10460hy r1) {
        this.A00 = r1;
    }

    public boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}
