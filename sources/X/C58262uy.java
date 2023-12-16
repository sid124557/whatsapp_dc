package X;

import android.net.Uri;

/* renamed from: X.2uy  reason: invalid class name and case insensitive filesystem */
public class C58262uy {
    public final Uri A00;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        if (r0 != false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C58262uy A00(java.lang.String r6) {
        /*
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r6.toLowerCase(r2)
            java.lang.String r3 = "https://wa.me/"
            boolean r0 = r1.startsWith(r3)
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = "http://wa.me/"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = "wa.me/"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = "/"
            boolean r0 = r6.startsWith(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r0 == 0) goto L_0x00a4
            java.lang.String r0 = "https://wa.me"
        L_0x002d:
            java.lang.String r6 = X.AnonymousClass000.A0V(r0, r6, r1)
        L_0x0031:
            java.lang.String r1 = r6.toLowerCase(r2)
            boolean r0 = r1.startsWith(r3)
            if (r0 != 0) goto L_0x004d
            java.lang.String r0 = "http://wa.me/"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x004d
            java.lang.String r0 = "wa.me/"
            boolean r0 = r1.startsWith(r0)
            r1 = 0
            if (r0 == 0) goto L_0x004e
        L_0x004d:
            r1 = 1
        L_0x004e:
            r5 = 0
            if (r1 == 0) goto L_0x009a
            java.lang.String r4 = "wa.me"
            boolean r0 = r6.startsWith(r4)
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = "https://wa.me"
            java.lang.String r6 = r6.replace(r4, r0)
        L_0x0060:
            android.net.Uri r3 = android.net.Uri.parse(r6)
            java.lang.String r0 = r3.getHost()
            if (r0 != 0) goto L_0x009b
            r1 = r5
        L_0x006b:
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L_0x009a
            android.net.Uri$Builder r0 = X.C18300x5.A0C()
            android.net.Uri$Builder r1 = r0.encodedAuthority(r1)
            java.lang.String r0 = r3.getEncodedPath()
            android.net.Uri$Builder r1 = r1.encodedPath(r0)
            java.lang.String r0 = r3.getEncodedQuery()
            android.net.Uri$Builder r1 = r1.encodedQuery(r0)
            java.lang.String r0 = r3.getEncodedFragment()
            android.net.Uri$Builder r0 = r1.encodedFragment(r0)
            android.net.Uri r0 = r0.build()
            X.2uy r5 = new X.2uy
            r5.<init>(r0)
        L_0x009a:
            return r5
        L_0x009b:
            java.lang.String r0 = r3.getHost()
            java.lang.String r1 = r0.toLowerCase(r2)
            goto L_0x006b
        L_0x00a4:
            r0 = r3
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58262uy.A00(java.lang.String):X.2uy");
    }

    public C58262uy(Uri uri) {
        this.A00 = uri;
    }
}
