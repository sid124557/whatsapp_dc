package X;

import com.whatsapp.util.Log;

/* renamed from: X.2fy  reason: invalid class name and case insensitive filesystem */
public final class C49092fy {
    public final C55682qk A00;
    public final C51532jy A01;
    public final C55832qz A02;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass2z0 A00(X.AnonymousClass2z0 r4) {
        /*
            r3 = this;
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            X.2qz r1 = r3.A02
            X.34x r0 = r1.A05(r4)
            if (r0 != 0) goto L_0x002b
            X.2jy r0 = r3.A01
            android.database.Cursor r2 = r0.A00(r4)
            if (r2 == 0) goto L_0x0031
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x002e
            X.34x r0 = r1.A03(r2)     // Catch:{ all -> 0x001f }
            goto L_0x0026
        L_0x001f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)
            throw r0
        L_0x0026:
            r2.close()
            if (r0 == 0) goto L_0x0031
        L_0x002b:
            X.2z0 r0 = r0.A1J
            return r0
        L_0x002e:
            r2.close()
        L_0x0031:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49092fy.A00(X.2z0):X.2z0");
    }

    public final AnonymousClass2z0 A01(AnonymousClass2z0 r5) {
        C624134x A05 = this.A02.A05(r5);
        if (A05 == null) {
            return null;
        }
        if (!C624134x.A0d(A05)) {
            return r5;
        }
        C42602Ou A11 = A05.A11();
        if (A11 == null) {
            this.A01.A01(A05);
            if (A05.A11() == null) {
                Log.e("ReferentialKeyUtil/getOriginalKey/editInfo is null for an edited message");
                this.A00.A0A("ReferentialKeyUtil/getOriginalKey/editInfo is null for an edited message", true, (String) null);
                return null;
            }
            A11 = A05.A11();
            if (A11 == null) {
                return null;
            }
        }
        return A11.A02;
    }

    public C49092fy(C55682qk r1, C51532jy r2, C55832qz r3) {
        C18260x0.A0V(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
