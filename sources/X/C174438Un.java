package X;

import java.io.File;

/* renamed from: X.8Un  reason: invalid class name and case insensitive filesystem */
public final class C174438Un extends C174448Uo {
    public static final boolean A00(File file) {
        AnonymousClass8U7 r3 = new AnonymousClass8U7(new AnonymousClass8PK(file, C141646vu.BOTTOM_UP));
        while (true) {
            boolean z = true;
            while (true) {
                if (!r3.hasNext()) {
                    return z;
                }
                File file2 = (File) r3.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
        }
    }
}
