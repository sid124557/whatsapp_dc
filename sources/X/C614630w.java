package X;

import android.graphics.BitmapFactory;
import android.util.Base64;

/* renamed from: X.30w  reason: invalid class name and case insensitive filesystem */
public class C614630w {
    public Float A00;
    public boolean A01;
    public boolean A02;
    public byte[] A03;
    public final C624134x A04;

    public static boolean A00(byte b) {
        return b == 1 || b == 3 || b == 81 || b == 13 || b == 9 || b == 5 || b == 16 || b == 23 || b == 37 || b == 24 || b == 44 || b == 20 || b == 25 || b == 26 || b == 28 || b == 29 || b == 30 || b == 42 || b == 43 || b == 45 || b == 52 || b == 54 || b == 55 || b == 57 || b == 62 || b == 63 || b == 85 || b == 94;
    }

    public synchronized void A01() {
        this.A02 = false;
    }

    public synchronized void A02(byte[] bArr) {
        if (!this.A01) {
            this.A03 = bArr;
            this.A01 = true;
        }
    }

    public synchronized void A03(byte[] bArr) {
        A04(bArr, false);
    }

    public synchronized void A04(byte[] bArr, boolean z) {
        AnonymousClass33C r4;
        float f;
        int i;
        C624134x r5 = this.A04;
        if ((r5 instanceof C30471mV) && (r4 = ((C30471mV) r5).A01) != null) {
            if (bArr != null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                int i2 = options.outWidth;
                if (i2 > 0 && (i = options.outHeight) > 0) {
                    f = ((float) i) / ((float) i2);
                    r4.A00 = f;
                }
            }
            f = -1.0f;
            r4.A00 = f;
        }
        if (z) {
            r5.A1j(bArr);
            this.A02 = false;
        } else {
            r5.A1j((byte[]) null);
            this.A02 = true;
        }
        this.A00 = null;
        this.A01 = true;
        this.A03 = bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0053, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A05() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.A01     // Catch:{ all -> 0x0056 }
            r3 = 1
            if (r0 == 0) goto L_0x000b
            byte[] r0 = r4.A03     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x000b
            goto L_0x0052
        L_0x000b:
            X.34x r2 = r4.A04     // Catch:{ all -> 0x0056 }
            int r0 = r2.A0i()     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = r2.A13()     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = r2.A13()     // Catch:{ all -> 0x0056 }
            int r0 = r0.length()     // Catch:{ all -> 0x0056 }
            if (r0 <= 0) goto L_0x0024
            goto L_0x0052
        L_0x0024:
            byte[] r0 = r2.A1u()     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0032
            byte[] r0 = r2.A1u()     // Catch:{ all -> 0x0056 }
            int r0 = r0.length     // Catch:{ all -> 0x0056 }
            if (r0 <= 0) goto L_0x0032
            goto L_0x0052
        L_0x0032:
            boolean r0 = r2 instanceof X.C30361mK     // Catch:{ all -> 0x0056 }
            r1 = 0
            if (r0 == 0) goto L_0x003f
            X.1mK r2 = (X.C30361mK) r2     // Catch:{ all -> 0x0056 }
            int r1 = r2.A02     // Catch:{ all -> 0x0056 }
            r0 = 2
            if (r1 != r0) goto L_0x0051
            goto L_0x0052
        L_0x003f:
            boolean r0 = r2 instanceof X.C30471mV     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0054
            X.1mV r2 = (X.C30471mV) r2     // Catch:{ all -> 0x0056 }
            X.33C r0 = r2.A01     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0051
            float r1 = r0.A00     // Catch:{ all -> 0x0056 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r3 = 0
        L_0x0052:
            monitor-exit(r4)
            return r3
        L_0x0054:
            monitor-exit(r4)
            return r1
        L_0x0056:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C614630w.A05():boolean");
    }

    public synchronized boolean A06() {
        return this.A01;
    }

    public synchronized boolean A07() {
        return this.A02;
    }

    public synchronized byte[] A09() {
        if (this.A01) {
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("thumbnail not loaded, key=");
            throw AnonymousClass001.A0e(AnonymousClass000.A0R(this.A04.A1J, A0o));
        }
        return this.A03;
    }

    public byte[] A08() {
        byte[] A1u;
        String A13;
        C624134x r3 = this.A04;
        if (r3.A0i() == 0 && (A13 = r3.A13()) != null && A13.length() > 0) {
            try {
                return Base64.decode(r3.A13(), 0);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } else if (r3.A0i() != 1 || (A1u = r3.A1u()) == null || A1u.length <= 0) {
            return null;
        } else {
            return A1u;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r0 != null) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            if (r3 != r4) goto L_0x0004
            r0 = 1
            return r0
        L_0x0004:
            r2 = 0
            if (r4 == 0) goto L_0x0029
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r0 = r4.getClass()
            if (r1 != r0) goto L_0x0029
            X.30w r4 = (X.C614630w) r4
            X.34x r0 = r3.A04
            X.2z0 r1 = r0.A1J
            X.34x r0 = r4.A04
            X.2z0 r0 = r0.A1J
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0029
            byte[] r1 = r3.A03
            byte[] r0 = r4.A03
            if (r1 != 0) goto L_0x002a
            if (r0 == 0) goto L_0x0031
        L_0x0029:
            return r2
        L_0x002a:
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x0031
            return r2
        L_0x0031:
            java.lang.Float r1 = r3.A00
            java.lang.Float r0 = r4.A00
            boolean r0 = X.AnonymousClass75J.A00(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C614630w.equals(java.lang.Object):boolean");
    }

    public C614630w(C624134x r2) {
        if (A00(r2.A1I)) {
            this.A04 = r2;
            return;
        }
        throw AnonymousClass001.A0e("this message should not have a thumbnail");
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = this.A04.A1J;
        A1X[1] = this.A03;
        return C18310x6.A08(this.A00, A1X, 2);
    }
}
