package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2nS  reason: invalid class name and case insensitive filesystem */
public final class C53662nS {
    public final int A00;
    public final C49852hC A01;
    public final AnonymousClass2Q7 A02;
    public final AnonymousClass66R A03;
    public final C85424Ge A04;
    public final AnonymousClass48B[] A05;
    public final Boolean[] A06;

    public final AnonymousClass48B A02(int i) {
        AnonymousClass48B r1;
        synchronized (this) {
            if (i >= 0) {
                if (i <= this.A00) {
                    AnonymousClass48B[] r3 = this.A05;
                    r1 = r3[i];
                    if (r1 == null) {
                        AnonymousClass4C1 A002 = this.A01.A00(this.A04, i);
                        if (A002 == null) {
                            this.A06[i] = Boolean.FALSE;
                            r1 = (AnonymousClass48B) this.A03.getValue();
                        } else {
                            this.A06[i] = Boolean.TRUE;
                            r1 = (AnonymousClass48B) A002.get();
                        }
                        r3[i] = r1;
                    }
                    C162457s7.A0K(r1, "null cannot be cast to non-null type IP of com.whatsapp.fmessage.platform.core.FMessageSubsystemApi.getIntegrationPoint$lambda$0");
                }
            }
            r1 = (AnonymousClass48B) this.A03.getValue();
            C162457s7.A0D(r1);
        }
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(int r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r3 = 1
            r1 = 0
            if (r5 < 0) goto L_0x002e
            int r0 = r4.A00     // Catch:{ all -> 0x002b }
            if (r5 > r0) goto L_0x002e
            java.lang.Boolean[] r2 = r4.A06     // Catch:{ all -> 0x002b }
            r0 = r2[r5]     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002b }
            goto L_0x0029
        L_0x0014:
            X.2hC r1 = r4.A01     // Catch:{ all -> 0x002b }
            X.4Ge r0 = r4.A04     // Catch:{ all -> 0x002b }
            X.4C1 r0 = r1.A00(r0, r5)     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x001f
            r3 = 0
        L_0x001f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x002b }
            r2[r5] = r0     // Catch:{ all -> 0x002b }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r4)
            return r0
        L_0x002b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x002e:
            monitor-exit(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53662nS.A04(int):boolean");
    }

    public C53662nS(C49852hC r3, AnonymousClass2Q7 r4, C85424Ge r5) {
        this.A04 = r5;
        this.A01 = r3;
        this.A02 = r4;
        r3.A01();
        AnonymousClass2RE r0 = r3.A00;
        if (r0 == null) {
            throw C18270x1.A0S("metadata");
        }
        int i = r0.A00;
        this.A00 = i;
        int i2 = i + 1;
        this.A05 = new AnonymousClass48B[i2];
        this.A06 = new Boolean[i2];
        this.A03 = C154517dI.A01(new C78493v6(this));
    }

    public static AnonymousClass48B A00(AnonymousClass66R r0, int i) {
        return ((C53662nS) r0.getValue()).A02(i);
    }

    public static boolean A01(AnonymousClass66R r0, int i) {
        return ((C53662nS) r0.getValue()).A04(i);
    }

    public final Map A03() {
        LinkedHashMap A0r = C18320x8.A0r();
        synchronized (this) {
            int i = this.A00;
            if (i >= 0) {
                int i2 = 0;
                while (true) {
                    if (A04(i2)) {
                        A0r.put(Integer.valueOf(i2), A02(i2));
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return A0r;
    }
}
