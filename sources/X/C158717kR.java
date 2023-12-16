package X;

import java.io.IOException;

/* renamed from: X.7kR  reason: invalid class name and case insensitive filesystem */
public class C158717kR {
    public static final C161287pM A02 = C161287pM.A00();
    public volatile C172538Lp A00;
    public volatile C187848xu A01;

    public final C172538Lp A00() {
        C172538Lp r0;
        if (this.A00 != null) {
            return this.A00;
        }
        synchronized (this) {
            if (this.A00 != null) {
                C172538Lp r02 = this.A00;
                return r02;
            }
            if (this.A01 == null) {
                r0 = C172538Lp.A00;
            } else {
                C187848xu r5 = this.A01;
                try {
                    C128766Xj r2 = (C128766Xj) r5;
                    int i = r2.zzc;
                    if (i == -1) {
                        i = AnonymousClass6C9.A0U(r2).BtX(r2);
                        r2.zzc = i;
                    }
                    byte[] bArr = new byte[i];
                    C128856Xs r22 = new C128856Xs(bArr, i);
                    C186268v1 A0U = AnonymousClass6C9.A0U(r5);
                    AnonymousClass8B0 r03 = r22.A01;
                    if (r03 == null) {
                        r03 = new AnonymousClass8B0(r22);
                    }
                    A0U.BtS(r03, r5);
                    if (r22.A02 - r22.A00 == 0) {
                        r0 = new C128876Xu(bArr);
                    } else {
                        throw AnonymousClass001.A0e("Did not write as much data as expected.");
                    }
                } catch (IOException e) {
                    String A0O = AnonymousClass000.A0O(r5);
                    StringBuilder A0o = AnonymousClass6C7.A0o(A0O.length() + 62, "ByteString");
                    A0o.append("Serializing ");
                    A0o.append(A0O);
                    throw AnonymousClass6C7.A0f("ByteString", A0o, e);
                }
            }
            this.A00 = r0;
            C172538Lp r04 = this.A00;
            return r04;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C187848xu A01(X.C187848xu r2) {
        /*
            r1 = this;
            X.8xu r0 = r1.A01
            if (r0 != 0) goto L_0x001b
            monitor-enter(r1)
            X.8xu r0 = r1.A01     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x0016
            r1.A01 = r2     // Catch:{ 6ty -> 0x0010 }
            X.8Lp r0 = X.C172538Lp.A00     // Catch:{ 6ty -> 0x0010 }
            r1.A00 = r0     // Catch:{ 6ty -> 0x0010 }
            goto L_0x0016
        L_0x0010:
            r1.A01 = r2     // Catch:{ all -> 0x0018 }
            X.8Lp r0 = X.C172538Lp.A00     // Catch:{ all -> 0x0018 }
            r1.A00 = r0     // Catch:{ all -> 0x0018 }
        L_0x0016:
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            goto L_0x001b
        L_0x0018:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            throw r0
        L_0x001b:
            X.8xu r0 = r1.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158717kR.A01(X.8xu):X.8xu");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C158717kR)) {
            return false;
        }
        C158717kR r4 = (C158717kR) obj;
        C187848xu r2 = this.A01;
        C187848xu r1 = r4.A01;
        if (r2 == null) {
            if (r1 == null) {
                return A00().equals(r4.A00());
            }
            return A01(r1.BuK()).equals(r1);
        } else if (r1 != null) {
            return r2.equals(r1);
        } else {
            return r2.equals(r4.A01(r2.BuK()));
        }
    }

    public int hashCode() {
        return 1;
    }
}
