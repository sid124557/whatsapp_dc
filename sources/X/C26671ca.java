package X;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;

/* renamed from: X.1ca  reason: invalid class name and case insensitive filesystem */
public final class C26671ca extends AnonymousClass3OX {
    public Bitmap Bqg(int i) {
        File A0B;
        String str = this.A05;
        if (str == null) {
            A0B = null;
        } else {
            A0B = AnonymousClass002.A0B(str);
        }
        return C107085af.A01(A0B);
    }

    public int getType() {
        return 2;
    }

    public C26671ca(Uri uri, AnonymousClass5UR r2, String str, String str2, long j, long j2, long j3) {
        super(uri, r2, str, str2, j, j2, j3);
    }
}
