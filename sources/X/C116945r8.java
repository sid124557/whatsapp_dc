package X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.5r8  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C116945r8 implements FileFilter {
    public final boolean accept(File file) {
        if (!file.isFile() || C107655bf.A0X(C627536m.A08(file.getAbsolutePath())) == null) {
            return false;
        }
        return true;
    }
}
