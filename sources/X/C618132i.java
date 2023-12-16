package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.32i  reason: invalid class name and case insensitive filesystem */
public class C618132i {
    public final C56972sr A00;
    public final C56352rq A01;
    public final AnonymousClass1VX A02;
    public final C66833My A03;
    public final AnonymousClass2WV A04;
    public final C55732qp A05;
    public final C989053r A06;
    public final C33141sV A07;

    public static boolean A01(C30471mV r4, boolean z) {
        synchronized (r4) {
            AnonymousClass33C A002 = C30471mV.A00(r4);
            if (r4.A0D != 1) {
                return false;
            }
            r4.A1A();
            A002.A0c = false;
            A002.A0R = false;
            A002.A0M = z;
            A002.A0C = 0;
            return true;
        }
    }

    public C618132i(C56972sr r1, C56352rq r2, AnonymousClass1VX r3, C66833My r4, AnonymousClass2WV r5, C55732qp r6, C989053r r7, C33141sV r8) {
        this.A02 = r3;
        this.A00 = r1;
        this.A06 = r7;
        this.A05 = r6;
        this.A04 = r5;
        this.A07 = r8;
        this.A03 = r4;
        this.A01 = r2;
    }

    public static final boolean A00(AnonymousClass30M r4, C83884Ae r5, Object obj) {
        AtomicBoolean A0l = C18280x3.A0l();
        Iterator A0x = AnonymousClass0x7.A0x(r4.A02);
        while (A0x.hasNext()) {
            C30471mV A0S = C18320x8.A0S(A0x);
            synchronized (A0S) {
                if (r5.AxF(C30471mV.A00(A0S), A0S, obj)) {
                    A0l.set(true);
                }
            }
        }
        return A0l.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        if (r0 != false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r0 != false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass33C r4, X.C56752sV r5, X.C30471mV r6) {
        /*
            r3 = this;
            java.lang.String r0 = r5.A05()
            if (r0 != 0) goto L_0x000c
            monitor-enter(r5)
            boolean r0 = r5.A0G     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x0012
        L_0x000c:
            java.lang.String r0 = r5.A05()
            r6.A03 = r0
        L_0x0012:
            java.lang.String r0 = r5.A06()
            if (r0 != 0) goto L_0x001e
            monitor-enter(r5)
            boolean r0 = r5.A0H     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x0024
        L_0x001e:
            java.lang.String r0 = r5.A06()
            r6.A04 = r0
        L_0x0024:
            monitor-enter(r5)
            java.lang.String r0 = r5.A0B     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x0030
            monitor-enter(r5)
            java.lang.String r0 = r5.A0B     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            r6.A05 = r0
        L_0x0030:
            monitor-enter(r5)
            X.2Lt r0 = r5.A02     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x0050
            X.30d r2 = r6.A1v()
            X.C626936e.A06(r2)
            byte[] r1 = r0.A00
            int[] r0 = r0.A01
            r2.A03(r1, r0)
            X.30d r1 = r6.A1v()
            X.1VX r0 = r3.A02
            boolean r0 = X.C624234y.A01(r0, r6)
            r1.A05 = r0
        L_0x0050:
            if (r4 == 0) goto L_0x00d0
            monitor-enter(r5)
            byte[] r0 = r5.A0I     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x005e
            monitor-enter(r5)
            byte[] r0 = r5.A0I     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            r4.A0S = r0
        L_0x005e:
            monitor-enter(r5)
            byte[] r0 = r5.A0K     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x006a
            monitor-enter(r5)
            byte[] r0 = r5.A0K     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            r4.A0U = r0
        L_0x006a:
            monitor-enter(r5)
            byte[] r0 = r5.A0L     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x0076
            monitor-enter(r5)
            byte[] r0 = r5.A0L     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            r4.A0V = r0
        L_0x0076:
            X.32B r0 = r5.A00()
            if (r0 == 0) goto L_0x008c
            X.32B r0 = r5.A00()
            byte[] r0 = r0.A01
            r4.A0W = r0
            X.32B r0 = r5.A00()
            long r0 = r0.A00
            r4.A0B = r0
        L_0x008c:
            java.lang.Integer r0 = r5.A01()
            if (r0 == 0) goto L_0x009c
            java.lang.Integer r0 = r5.A01()
            int r0 = r0.intValue()
            r4.A06 = r0
        L_0x009c:
            java.lang.Integer r0 = r5.A02()
            if (r0 == 0) goto L_0x00ac
            java.lang.Integer r0 = r5.A02()
            int r0 = r0.intValue()
            r4.A08 = r0
        L_0x00ac:
            monitor-enter(r5)
            java.lang.String r0 = r5.A0D     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x00b8
            monitor-enter(r5)
            java.lang.String r0 = r5.A0D     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            r4.A0L = r0
        L_0x00b8:
            monitor-enter(r5)
            byte[] r0 = r5.A0J     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x00c4
            monitor-enter(r5)
            byte[] r0 = r5.A0J     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            r4.A0T = r0
        L_0x00c4:
            boolean r0 = X.AnonymousClass2z0.A0C(r6)
            if (r0 == 0) goto L_0x00d0
            java.lang.String r0 = r5.A04()
            r4.A0J = r0
        L_0x00d0:
            return
        L_0x00d1:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C618132i.A02(X.33C, X.2sV, X.1mV):void");
    }
}
