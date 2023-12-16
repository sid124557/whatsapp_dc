package X;

import java.io.IOException;

/* renamed from: X.7kQ  reason: invalid class name and case insensitive filesystem */
public class C158707kQ {
    public static final C160007ms A02;
    public volatile C172528Lo A00;
    public volatile C187818xr A01;

    static {
        C160007ms r0;
        Class cls = C1456576t.A00;
        if (cls != null) {
            try {
                r0 = (C160007ms) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke((Object) null, new Object[0]);
            } catch (Exception unused) {
            }
            A02 = r0;
        }
        r0 = C160007ms.A01;
        A02 = r0;
    }

    public final C172528Lo A00() {
        C172528Lo r0;
        if (this.A00 != null) {
            return this.A00;
        }
        synchronized (this) {
            if (this.A00 != null) {
                C172528Lo r02 = this.A00;
                return r02;
            }
            if (this.A01 == null) {
                r0 = C172528Lo.A00;
            } else {
                C187818xr r5 = this.A01;
                try {
                    int BtV = r5.BtV();
                    byte[] bArr = new byte[BtV];
                    C128326Vq r2 = new C128326Vq(bArr, 0, BtV);
                    C186258v0 A0Y = AnonymousClass6C8.A0Y(r5);
                    C169658Ad r03 = r2.A00;
                    if (r03 == null) {
                        r03 = new C169658Ad(r2);
                    }
                    A0Y.BtU(r03, r5);
                    if (r2.A01 - r2.A00 == 0) {
                        r0 = new C128286Vm(bArr);
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
            C172528Lo r04 = this.A00;
            return r04;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C187818xr A01(X.C187818xr r2) {
        /*
            r1 = this;
            X.8xr r0 = r1.A01
            if (r0 != 0) goto L_0x001b
            monitor-enter(r1)
            X.8xr r0 = r1.A01     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x0016
            r1.A01 = r2     // Catch:{ 6tx -> 0x0010 }
            X.8Lo r0 = X.C172528Lo.A00     // Catch:{ 6tx -> 0x0010 }
            r1.A00 = r0     // Catch:{ 6tx -> 0x0010 }
            goto L_0x0016
        L_0x0010:
            r1.A01 = r2     // Catch:{ all -> 0x0018 }
            X.8Lo r0 = X.C172528Lo.A00     // Catch:{ all -> 0x0018 }
            r1.A00 = r0     // Catch:{ all -> 0x0018 }
        L_0x0016:
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            goto L_0x001b
        L_0x0018:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            throw r0
        L_0x001b:
            X.8xr r0 = r1.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158707kQ.A01(X.8xr):X.8xr");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C158707kQ)) {
            return false;
        }
        C158707kQ r4 = (C158707kQ) obj;
        C187818xr r2 = this.A01;
        C187818xr r1 = r4.A01;
        if (r2 == null) {
            if (r1 == null) {
                return A00().equals(r4.A00());
            }
            return A01(r1.Btj()).equals(r1);
        } else if (r1 != null) {
            return r2.equals(r1);
        } else {
            return r2.equals(r4.A01(r2.Btj()));
        }
    }

    public int hashCode() {
        return 1;
    }
}
