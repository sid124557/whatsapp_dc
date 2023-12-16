package X;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.7i5  reason: invalid class name and case insensitive filesystem */
public class C157307i5 {
    public final AnonymousClass7TV A00;
    public final Object A01;

    public static final C159957ml A00(String str, C181468mo[] r7) {
        String A02;
        ReentrantLock reentrantLock;
        C179008iS r3 = AnonymousClass77R.A00;
        if (r7.length == 0) {
            A02 = str;
        } else {
            A02 = C160947oi.A02(str, Arrays.toString(r7));
        }
        C170588Dt r32 = (C170588Dt) r3;
        Map map = r32.A01;
        C159957ml r2 = (C159957ml) map.get(A02);
        if (r2 != null) {
            r32.A00(A02);
        } else if (str.length() != 0) {
            r2 = new C159957ml(str, r7);
            if (map.put(A02, r2) != null) {
                r32.A00(A02);
            } else {
                reentrantLock = r32.A02;
                reentrantLock.lock();
                try {
                    r32.A00.addFirst(A02);
                } finally {
                    reentrantLock.unlock();
                }
            }
            if (map.size() > 400) {
                reentrantLock = r32.A02;
                reentrantLock.lock();
                String str2 = (String) r32.A00.removeLast();
                reentrantLock.unlock();
                map.remove(str2);
                return r2;
            }
        } else {
            throw AnonymousClass001.A0c("json can not be null or empty");
        }
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a6, code lost:
        if (r7 != false) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A01(java.lang.String r12, X.C181468mo... r13) {
        /*
            r11 = this;
            java.lang.String r1 = "path can not be null or empty"
            if (r12 == 0) goto L_0x00ef
            int r0 = r12.length()
            if (r0 == 0) goto L_0x00ef
            X.7ml r4 = A00(r12, r13)
            java.lang.String r0 = "path can not be null"
            X.C160947oi.A03(r4, r0)
            java.lang.Object r10 = r11.A01
            X.7TV r5 = r11.A00
            X.6wM r9 = X.C141926wM.AS_PATH_LIST
            java.util.Set r1 = r5.A03
            boolean r8 = r1.contains(r9)
            X.6wM r3 = X.C141926wM.ALWAYS_RETURN_LIST
            boolean r7 = r1.contains(r3)
            X.6wM r0 = X.C141926wM.SUPPRESS_EXCEPTIONS
            boolean r2 = r1.contains(r0)
            X.7Vo r1 = r4.A00
            X.6ds r6 = r1.A00
            X.7bf r0 = r6.A01
            boolean r0 = r0 instanceof X.C131606dr
            r4 = 0
            if (r0 == 0) goto L_0x007d
            if (r8 != 0) goto L_0x005b
            if (r7 != 0) goto L_0x005b
            X.7kI r1 = r1.A00(r5, r10, r10)
            if (r2 == 0) goto L_0x00c5
            java.util.List r0 = r1.A01()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00c5
        L_0x004a:
            boolean r0 = r6.A06()
            if (r0 != 0) goto L_0x005a
            X.8wL r0 = r5.A00
            X.8Du r0 = (X.C170598Du) r0
            X.7bN r0 = r0.A00
            java.lang.Object r4 = r0.A01()
        L_0x005a:
            return r4
        L_0x005b:
            if (r2 != 0) goto L_0x004a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Options "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " and "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " are not allowed when using path functions!"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.8Re r1 = new X.8Re
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x007d:
            X.7kI r3 = r1.A00(r5, r10, r10)
            if (r8 == 0) goto L_0x009a
            if (r2 == 0) goto L_0x00ca
            java.util.List r0 = r3.A01()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00ca
        L_0x008f:
            X.8wL r0 = r5.A00
            X.8Du r0 = (X.C170598Du) r0
            X.7bN r0 = r0.A00
            java.lang.Object r3 = r0.A01()
        L_0x0099:
            return r3
        L_0x009a:
            if (r2 == 0) goto L_0x00a9
            java.util.List r0 = r3.A01()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00a9
            if (r7 == 0) goto L_0x004a
            goto L_0x008f
        L_0x00a9:
            r2 = 0
            java.lang.Object r3 = r3.A00()
            if (r7 == 0) goto L_0x0099
            boolean r0 = r6.A06()
            if (r0 == 0) goto L_0x0099
            X.8wL r1 = r5.A00
            r0 = r1
            X.8Du r0 = (X.C170598Du) r0
            X.7bN r0 = r0.A00
            java.lang.Object r4 = r0.A01()
            r1.Bli(r4, r2, r3)
            return r4
        L_0x00c5:
            java.lang.Object r3 = r1.A00()
            return r3
        L_0x00ca:
            int r0 = r3.A00
            if (r0 != 0) goto L_0x00ec
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x00d4
            r3 = 0
            return r3
        L_0x00d4:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "No results for path: "
            r1.append(r0)
            X.7Vo r0 = r3.A02
            X.AnonymousClass000.A1B(r0, r1)
            java.lang.String r0 = r1.toString()
            X.6dK r1 = new X.6dK
            r1.<init>(r0)
            throw r1
        L_0x00ec:
            java.lang.Object r3 = r3.A03
            return r3
        L_0x00ef:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C157307i5.A01(java.lang.String, X.8mo[]):java.lang.Object");
    }

    public C157307i5(AnonymousClass7TV r2, Object obj) {
        C160947oi.A03(obj, "json can not be null");
        C160947oi.A03(r2, "configuration can not be null");
        this.A00 = r2;
        this.A01 = obj;
    }
}
