package X;

import android.net.Uri;

/* renamed from: X.4tO  reason: invalid class name and case insensitive filesystem */
public final class C95334tO extends C114215mg implements C186308v5 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95334tO(Uri uri, C620633i r3, AnonymousClass1VX r4, C58392vB r5, String str, int i, boolean z) {
        super(uri, r3, r4, r5, str, i, z);
        C18260x0.A0a(r4, r5, uri, 1);
    }

    public final String A05() {
        StringBuilder A0A = C18330xA.A0A("media_type in (1, 3)");
        if (this.A09 != null) {
            A0A.append(" AND ");
            A0A.append("bucket_id=?");
        }
        if (this.A02 && C107385bE.A08()) {
            A0A.append(" AND ");
            A0A.append("is_favorite=1");
        }
        return C18290x4.A0o(A0A);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0066, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap B4t() {
        /*
            r12 = this;
            java.util.HashMap r5 = X.AnonymousClass001.A0t()
            android.net.Uri r0 = r12.A04
            android.net.Uri$Builder r2 = r0.buildUpon()
            java.lang.String r1 = "distinct"
            java.lang.String r0 = "true"
            android.net.Uri r7 = X.C18290x4.A0H(r2, r1, r0)
            X.5UR r6 = r12.A08
            java.lang.String r2 = "bucket_display_name"
            java.lang.String r1 = "bucket_id"
            java.lang.String[] r8 = new java.lang.String[]{r2, r1}
            java.lang.String r9 = r12.A05()
            java.lang.String r0 = r12.A09
            if (r0 != 0) goto L_0x002d
            r10 = 0
        L_0x0025:
            r11 = 0
            android.database.Cursor r4 = r6.A03(r7, r8, r9, r10, r11)
            if (r4 == 0) goto L_0x0067
            goto L_0x0032
        L_0x002d:
            java.lang.String[] r10 = X.C18270x1.A1b(r0)
            goto L_0x0025
        L_0x0032:
            int r3 = r4.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0060 }
            int r2 = r4.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0060 }
        L_0x003a:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x005c
            java.lang.String r1 = r4.getString(r2)     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x003a
            int r0 = r1.length()     // Catch:{ all -> 0x0060 }
            boolean r0 = X.AnonymousClass001.A1W(r0)
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r4.getString(r3)     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = ""
        L_0x0058:
            r5.put(r1, r0)     // Catch:{ all -> 0x0060 }
            goto L_0x003a
        L_0x005c:
            r4.close()
            return r5
        L_0x0060:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        L_0x0067:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95334tO.B4t():java.util.HashMap");
    }
}
