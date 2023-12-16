package X;

import java.util.Enumeration;

/* renamed from: X.8dM  reason: invalid class name and case insensitive filesystem */
public class C176658dM extends C176778dY {
    public final C176778dY[] A00;

    public Enumeration A0U() {
        int i;
        if (this.A00 == null) {
            i = 2;
        } else {
            i = 3;
        }
        return new C1894891m(this, i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C176658dM(X.C176778dY[] r4) {
        /*
            r3 = this;
            java.io.ByteArrayOutputStream r2 = X.AnonymousClass0x9.A0e()
            r1 = 0
        L_0x0005:
            int r0 = r4.length
            if (r1 == r0) goto L_0x0021
            r0 = r4[r1]     // Catch:{ IOException -> 0x0012 }
            byte[] r0 = r0.A00     // Catch:{ IOException -> 0x0012 }
            r2.write(r0)     // Catch:{ IOException -> 0x0012 }
            int r1 = r1 + 1
            goto L_0x0005
        L_0x0012:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "exception converting octets "
            X.C18270x1.A1H(r1, r0, r2)
            java.lang.IllegalArgumentException r0 = X.C18310x6.A0d(r1)
            throw r0
        L_0x0021:
            byte[] r0 = r2.toByteArray()
            r3.<init>(r0)
            r3.A00 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176658dM.<init>(X.8dY[]):void");
    }

    public C176658dM(byte[] bArr) {
        super(bArr);
        this.A00 = null;
    }
}
