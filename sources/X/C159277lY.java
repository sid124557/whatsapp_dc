package X;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;

/* renamed from: X.7lY  reason: invalid class name and case insensitive filesystem */
public final class C159277lY {
    public static final C151307Uf A00(Context context, Uri uri, boolean z) {
        C162457s7.A0J(uri, 0);
        boolean z2 = true;
        if (uri.getPath() == null) {
            z2 = false;
        }
        C159297la.A02(z2, AnonymousClass000.A0P(uri, "Path cannot be null contentUri: ", AnonymousClass001.A0o()));
        if (C175738Zn.A0Y(AnonymousClass726.A00(C18310x6.A0a(uri).getPath(), "video/mp4"), "video", false)) {
            try {
                return new AnonymousClass85X(context, z).B2y(uri);
            } catch (IOException | RuntimeException unused) {
                return null;
            }
        } else {
            boolean z3 = true;
            if (uri.getPath() == null) {
                z3 = false;
            }
            C159297la.A02(z3, AnonymousClass000.A0P(uri, "Path cannot be null contentUri: ", AnonymousClass001.A0o()));
            try {
                return new AnonymousClass85V().B2y(uri);
            } catch (IOException unused2) {
                return null;
            }
        }
    }

    public static final C151307Uf A01(Context context, String str) {
        if (str == null) {
            return null;
        }
        try {
            Uri A01 = C624635d.A01(str);
            C162457s7.A0D(A01);
            return A00(context, A01, false);
        } catch (Exception e) {
            Object[] A0L = AnonymousClass002.A0L();
            A0L[0] = str;
            C162477s9.A0C("TranscodeUtil", "Exception in extractVideoMetadata for filePath: %s", e, A0L);
            return null;
        }
    }

    public static final boolean A02(AnonymousClass7QR r4) {
        if (r4.A04 != null) {
            return false;
        }
        long j = r4.A02;
        if (j == 0 || j == -1) {
            return true;
        }
        return false;
    }
}
