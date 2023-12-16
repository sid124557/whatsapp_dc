package X;

import java.io.File;
import java.io.FileInputStream;

/* renamed from: X.26u  reason: invalid class name and case insensitive filesystem */
public class C382926u {
    public static byte[] A00(File file) {
        FileInputStream A0g = AnonymousClass0x9.A0g(file);
        try {
            byte[] A05 = C624535b.A05(A0g);
            A0g.close();
            return A05;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}
