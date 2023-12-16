package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3Ga  reason: invalid class name and case insensitive filesystem */
public class C65053Ga implements AnonymousClass4FW {
    public final C621233o A00;

    public /* synthetic */ void BRi(C624134x r1) {
    }

    public /* synthetic */ void BVB(C95814uZ r1) {
    }

    public /* synthetic */ void BWW(C624134x r1) {
    }

    public /* synthetic */ void BWY(C624134x r1) {
    }

    public void BWf(C95814uZ r7) {
        C621233o r5 = this.A00;
        synchronized (r5.A0R) {
            AnonymousClass2QE r0 = (AnonymousClass2QE) r5.A0C().get(r7);
            if (r0 != null) {
                if (AnonymousClass0x9.A0M(r5.A0M).A0x(r0.A02)) {
                    r5.A0Q(r7);
                }
            }
        }
        synchronized (r5.A0Q) {
            Map A0B = r5.A0B();
            if (A0B.containsKey(r7)) {
                Map A1B = AnonymousClass0x9.A1B(r7, A0B);
                C626936e.A06(A1B);
                Iterator it = C18300x5.A0v(A1B).iterator();
                while (it.hasNext()) {
                    AnonymousClass2OP r2 = (AnonymousClass2OP) it.next();
                    if (AnonymousClass0x9.A0M(r5.A0M).A0x(r2.A02)) {
                        r5.A0R(r7, r2.A01);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        r1 = X.C18300x5.A0T(r8);
        r4 = r1.A1J;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BWg(java.util.Collection r10, java.util.Map r11) {
        /*
            r9 = this;
            X.33o r7 = r9.A00
            java.lang.Object r6 = r7.A0R
            monitor-enter(r6)
            java.util.Map r5 = r7.A0C()     // Catch:{ all -> 0x008b }
            java.util.Iterator r4 = r10.iterator()     // Catch:{ all -> 0x008b }
        L_0x000d:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x0039
            X.34x r3 = X.C18300x5.A0T(r4)     // Catch:{ all -> 0x008b }
            X.2z0 r2 = r3.A1J     // Catch:{ all -> 0x008b }
            X.4uZ r1 = r2.A00     // Catch:{ all -> 0x008b }
            if (r1 == 0) goto L_0x000d
            boolean r0 = r2.A02     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x000d
            boolean r0 = r3 instanceof X.C30801n8     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r5.get(r1)     // Catch:{ all -> 0x008b }
            X.2QE r0 = (X.AnonymousClass2QE) r0     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x000d
            X.2z0 r0 = r0.A02     // Catch:{ all -> 0x008b }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x000d
            r7.A0Q(r1)     // Catch:{ all -> 0x008b }
            goto L_0x000d
        L_0x0039:
            monitor-exit(r6)     // Catch:{ all -> 0x008b }
            java.lang.Object r6 = r7.A0Q
            monitor-enter(r6)
            java.util.Map r5 = r7.A0B()     // Catch:{ all -> 0x0088 }
            java.util.Iterator r8 = r10.iterator()     // Catch:{ all -> 0x0088 }
        L_0x0045:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0086
            X.34x r1 = X.C18300x5.A0T(r8)     // Catch:{ all -> 0x0088 }
            X.2z0 r4 = r1.A1J     // Catch:{ all -> 0x0088 }
            X.4uZ r3 = r4.A00     // Catch:{ all -> 0x0088 }
            if (r3 == 0) goto L_0x0086
            boolean r0 = r4.A02     // Catch:{ all -> 0x0088 }
            if (r0 != 0) goto L_0x0086
            boolean r0 = r1 instanceof X.C30801n8     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0086
            java.util.Map r2 = X.AnonymousClass0x9.A1B(r3, r5)     // Catch:{ all -> 0x0088 }
            if (r2 == 0) goto L_0x0086
            X.4uZ r0 = r1.A0n()     // Catch:{ all -> 0x0088 }
            if (r0 != 0) goto L_0x0081
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A03(r3)     // Catch:{ all -> 0x0088 }
        L_0x006d:
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x0088 }
            X.2OP r0 = (X.AnonymousClass2OP) r0     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0045
            X.2z0 r0 = r0.A02     // Catch:{ all -> 0x0088 }
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0045
            r7.A0R(r3, r1)     // Catch:{ all -> 0x0088 }
            goto L_0x0045
        L_0x0081:
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A03(r0)     // Catch:{ all -> 0x0088 }
            goto L_0x006d
        L_0x0086:
            monitor-exit(r6)     // Catch:{ all -> 0x0088 }
            return
        L_0x0088:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0088 }
            throw r0
        L_0x008b:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x008b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65053Ga.BWg(java.util.Collection, java.util.Map):void");
    }

    public /* synthetic */ void BWj(Collection collection) {
    }

    public /* synthetic */ void BX3(C95804uY r1) {
    }

    public /* synthetic */ void BX4(C624134x r1) {
    }

    public /* synthetic */ void BX6(C95804uY r1) {
    }

    public C65053Ga(C621233o r1) {
        this.A00 = r1;
    }

    public /* synthetic */ void BXI() {
    }

    public /* synthetic */ void BNb(C624134x r1, int i) {
    }

    public /* synthetic */ void BWS(C624134x r1, int i) {
    }

    public /* synthetic */ void BWU(C624134x r1, int i) {
    }

    public /* synthetic */ void BWX(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BWe(Collection collection, int i) {
        C381525x.A00(this, collection, i);
    }

    public /* synthetic */ void BWh(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BWi(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BX5(C95804uY r1, boolean z) {
    }

    public /* synthetic */ void BY8(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BY9(C624134x r1, C624134x r2) {
    }
}
