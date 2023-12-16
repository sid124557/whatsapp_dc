package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.5A5  reason: invalid class name */
public class AnonymousClass5A5 {
    public static File A00(Context context) {
        File A0A = AnonymousClass002.A0A(context.getCacheDir(), "minidumps");
        if (!A0A.exists() || !A0A.isDirectory()) {
            if (A0A.exists()) {
                A0A.delete();
            }
            if (!A0A.mkdirs()) {
                throw new RuntimeException(AnonymousClass000.A0P(A0A, "Breakpad init failed to create crash directory: ", AnonymousClass001.A0o()));
            }
        }
        return A0A;
    }
}
