package X;

import android.net.Uri;
import java.util.HashMap;

/* renamed from: X.4tN  reason: invalid class name and case insensitive filesystem */
public class C95324tN extends C114215mg {
    public static final Uri A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C95324tN(X.C620633i r9, X.AnonymousClass1VX r10, X.C58392vB r11, java.lang.String r12, int r13) {
        /*
            r8 = this;
            android.net.Uri r0 = A00
            android.net.Uri$Builder r1 = r0.buildUpon()
            java.lang.String r0 = "bucketId"
            r5 = r12
            android.net.Uri$Builder r2 = r1.appendQueryParameter(r0, r12)
            r0 = 1
            java.lang.String r1 = "include"
            if (r13 == r0) goto L_0x002e
            r0 = 2
            if (r13 == r0) goto L_0x002b
            r0 = 4
            if (r13 != r0) goto L_0x001d
            java.lang.String r0 = "video"
        L_0x001a:
            r2.appendQueryParameter(r1, r0)
        L_0x001d:
            android.net.Uri r1 = r2.build()
            r6 = 2
            r7 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x002b:
            java.lang.String r0 = "gif"
            goto L_0x001a
        L_0x002e:
            java.lang.String r0 = "images"
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95324tN.<init>(X.33i, X.1VX, X.2vB, java.lang.String, int):void");
    }

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("content://");
        A0o.append("com.whatsapp");
        A00 = Uri.parse(AnonymousClass000.A0X(".provider.media/items", A0o));
    }

    public HashMap B4t() {
        return AnonymousClass001.A0t();
    }
}
