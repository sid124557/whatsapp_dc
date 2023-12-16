package X;

import android.net.Uri;

/* renamed from: X.4tM  reason: invalid class name and case insensitive filesystem */
public class C95314tM extends C114215mg {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95314tM(Uri uri, C620633i r3, AnonymousClass1VX r4, C58392vB r5, String str, int i, boolean z) {
        super(uri, r3, r4, r5, str, i, z);
        C18260x0.A0a(r4, r5, uri, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap B4t() {
        /*
            r8 = this;
            android.net.Uri r0 = r8.A04
            android.net.Uri$Builder r2 = r0.buildUpon()
            java.lang.String r1 = "distinct"
            java.lang.String r0 = "true"
            android.net.Uri r3 = X.C18290x4.A0H(r2, r1, r0)
            X.5UR r0 = r8.A08
            android.content.ContentResolver r2 = r0.A00
            java.lang.String r1 = "bucket_display_name"
            java.lang.String r0 = "bucket_id"
            java.lang.String[] r4 = new java.lang.String[]{r1, r0}
            java.lang.String r5 = r8.A05()
            r6 = 0
            java.lang.String r7 = r8.A04()
            android.database.Cursor r5 = android.provider.MediaStore.Images.Media.query(r2, r3, r4, r5, r6, r7)
            java.util.HashMap r4 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x0054 }
            if (r5 == 0) goto L_0x004e
            int r3 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0054 }
            int r2 = r5.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0054 }
        L_0x0035:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x004e
            java.lang.String r1 = r5.getString(r3)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = r5.getString(r2)     // Catch:{ all -> 0x0054 }
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = ""
        L_0x0047:
            X.C162457s7.A0H(r1)     // Catch:{ all -> 0x0054 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0054 }
            goto L_0x0035
        L_0x004e:
            if (r5 == 0) goto L_0x0053
            r5.close()
        L_0x0053:
            return r4
        L_0x0054:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95314tM.B4t():java.util.HashMap");
    }

    public final String A05() {
        StringBuilder A0o = AnonymousClass001.A0o();
        String str = this.A09;
        if (str != null) {
            A0o.append("bucket_id = '");
            A0o.append(str);
            A0o.append("'");
        }
        if (this.A02 && C107385bE.A08()) {
            if (A0o.length() > 0) {
                A0o.append(" AND ");
            }
            A0o.append("is_favorite=1");
        }
        return C18290x4.A0o(A0o);
    }
}
