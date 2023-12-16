package X;

import android.content.ContentValues;

/* renamed from: X.2we  reason: invalid class name and case insensitive filesystem */
public final class C59272we {
    public final C72303dV A00;
    public final AnonymousClass1VX A01;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C60512yg A01(long r7) {
        /*
            r6 = this;
            X.3dV r0 = r6.A00
            X.4GK r5 = r0.get()
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0051 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = "SELECT display_name, username FROM lid_display_name WHERE lid_row_id = ?"
            java.lang.String[] r1 = X.C18260x0.A1b(r7)     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "LidDisplayNameStore/GET_DISPLAY_NAME"
            android.database.Cursor r4 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "username"
            int r2 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x004a }
            java.lang.String r0 = "display_name"
            int r3 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x004a }
            r1 = 0
            if (r3 < 0) goto L_0x0043
            if (r2 < 0) goto L_0x0043
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0043
            java.lang.String r2 = r4.getString(r2)     // Catch:{ all -> 0x004a }
            java.lang.String r1 = r4.getString(r3)     // Catch:{ all -> 0x004a }
            X.2yg r0 = new X.2yg     // Catch:{ all -> 0x004a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x004a }
            r4.close()     // Catch:{ all -> 0x0051 }
            r5.close()
            return r0
        L_0x0043:
            r4.close()     // Catch:{ all -> 0x0051 }
            r5.close()
            return r1
        L_0x004a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ all -> 0x0051 }
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59272we.A01(long):X.2yg");
    }

    public C59272we(C72303dV r1, AnonymousClass1VX r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public static final void A00(C85284Fq r9, String str, long j) {
        ContentValues A06 = AnonymousClass0x9.A06();
        C18270x1.A0c(A06, "lid_row_id", j);
        C56862sg A03 = AnonymousClass3H0.A03(A06, r9, "display_name", str);
        String[] A1Y = AnonymousClass0x9.A1Y();
        C18270x1.A1S(A1Y, j);
        if (((long) A03.A05(A06, "lid_display_name", "lid_row_id = ?", "LidDisplayNameStore/INSERT_DISPLAY_NAME", A1Y)) <= 0) {
            A03.A0C("lid_display_name", "LidDisplayNameStore/INSERT_DISPLAY_NAME", A06, 5);
        }
    }
}
