package X;

import android.net.Uri;

/* renamed from: X.4tP  reason: invalid class name */
public class AnonymousClass4tP extends C114215mg implements C186308v5 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4tP(Uri uri, C620633i r3, AnonymousClass1VX r4, C58392vB r5, String str, int i, boolean z) {
        super(uri, r3, r4, r5, str, i, z);
        C18260x0.A0a(r4, r5, uri, 1);
    }

    public final String A05() {
        String str;
        if (this.A09 == null) {
            str = "(mime_type in (?))";
        } else {
            str = "(mime_type in (?)) AND bucket_id = ?";
        }
        StringBuilder A0A = C18330xA.A0A(str);
        if (this.A02 && C107385bE.A08()) {
            A0A.append(" AND ");
            A0A.append("is_favorite=1");
        }
        return C18290x4.A0o(A0A);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap B4t() {
        /*
            r14 = this;
            android.net.Uri r0 = r14.A04
            android.net.Uri$Builder r2 = r0.buildUpon()
            java.lang.String r1 = "distinct"
            java.lang.String r0 = "true"
            android.net.Uri r9 = X.C18290x4.A0H(r2, r1, r0)
            X.5UR r0 = r14.A08
            android.content.ContentResolver r8 = r0.A00
            java.lang.String r7 = "bucket_display_name"
            java.lang.String r6 = "bucket_id"
            java.lang.String[] r10 = new java.lang.String[]{r7, r6}
            java.lang.String r11 = r14.A05()
            java.lang.String r3 = r14.A09
            if (r3 == 0) goto L_0x0035
            java.lang.String[] r2 = X.C1460678l.A00
            int r1 = r2.length
            int r0 = r1 + 1
            java.lang.String[] r12 = new java.lang.String[r0]
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r12, r0, r1)
            r12[r1] = r3
        L_0x002f:
            r13 = 0
            android.database.Cursor r5 = android.provider.MediaStore.Images.Media.query(r8, r9, r10, r11, r12, r13)
            goto L_0x0038
        L_0x0035:
            java.lang.String[] r12 = X.C1460678l.A00
            goto L_0x002f
        L_0x0038:
            java.util.HashMap r4 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x005f
            int r3 = r5.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x0065 }
            int r2 = r5.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0065 }
        L_0x0046:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x005f
            java.lang.String r1 = r5.getString(r3)     // Catch:{ all -> 0x0065 }
            if (r1 != 0) goto L_0x0054
            java.lang.String r1 = ""
        L_0x0054:
            java.lang.String r0 = r5.getString(r2)     // Catch:{ all -> 0x0065 }
            X.C162457s7.A0H(r0)     // Catch:{ all -> 0x0065 }
            r4.put(r0, r1)     // Catch:{ all -> 0x0065 }
            goto L_0x0046
        L_0x005f:
            if (r5 == 0) goto L_0x0064
            r5.close()
        L_0x0064:
            return r4
        L_0x0065:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4tP.B4t():java.util.HashMap");
    }
}
