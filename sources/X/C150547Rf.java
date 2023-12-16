package X;

import java.util.Iterator;
import javax.net.ssl.SSLException;

/* renamed from: X.7Rf  reason: invalid class name and case insensitive filesystem */
public class C150547Rf {
    public final AnonymousClass7L9 A00;

    public synchronized void A00(AnonymousClass7EH r7) {
        C143806zV r0;
        C143686zJ r1;
        C150447Qt r12;
        C150447Qt r13;
        try {
            AnonymousClass7L9 r5 = this.A00;
            AnonymousClass7LA r14 = r5.A02;
            AnonymousClass7N5 r2 = r5.A00;
            C179548jK r4 = r5.A01;
            if (r14.A02) {
                Iterator it = ((AnonymousClass7VJ) r14.A01.get(r2)).A00.iterator();
                while (it.hasNext()) {
                    C149817Nz r3 = (C149817Nz) it.next();
                    if (r3.A03.isInstance(r7)) {
                        AnonymousClass7N5 r22 = r3.A01;
                        AnonymousClass7N5 r02 = r5.A00;
                        if (!(r22 == r02 || (r13 = r02.A01) == null)) {
                            r13.A03(r4, r7, r3, 1);
                        }
                        C150447Qt r15 = r3.A00;
                        if (r15 != null) {
                            r15.A03(r4, r7, r3, 2);
                        }
                        if (!(r22 == r5.A00 || (r12 = r22.A00) == null)) {
                            r12.A03(r4, r7, r3, 3);
                        }
                        r5.A00 = r22;
                    }
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("No valid transition from state: ");
                r1 = new C143686zJ(AnonymousClass000.A0X(r2.A03, A0o));
            } else {
                r1 = new C143686zJ("State machine map is not initialized - call build()");
            }
            throw r1;
        } catch (C143686zJ e) {
            if (!(e.getCause() instanceof C143806zV)) {
                r0 = new C143806zV(new SSLException("Internal Error", AnonymousClass6C8.A0h(e)), (byte) 80);
            } else {
                r0 = (C143806zV) e.getCause();
            }
            throw r0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        r6 = X.C1463079s.A0V;
        r5 = r6.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        if (r7 >= r5) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        r4 = r6[r7];
        r2 = r3.A01;
        r1 = (X.AnonymousClass7VJ) r2.get(r4.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        if (r1 == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        if (r2.get(r4.A01) == null) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        r1.A00.add(r4);
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0083, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("Cannot find input state for transition ");
        r1 = new X.C143686zJ(X.AnonymousClass000.A0X(r4.A04, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009b, code lost:
        if (r3.A00 == null) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009d, code lost:
        r6 = r3.A01;
        r1 = X.C18290x4.A11(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a8, code lost:
        if (r1.hasNext() == false) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00aa, code lost:
        r0 = ((X.AnonymousClass7N5) r1.next()).A02;
        r7 = X.C141566vm.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b4, code lost:
        if (r0 != r7) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b6, code lost:
        r5 = X.AnonymousClass002.A0K();
        r8 = X.AnonymousClass001.A0u(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c2, code lost:
        if (r8.hasNext() == false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c4, code lost:
        r2 = X.AnonymousClass001.A0w(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d4, code lost:
        if (((X.AnonymousClass7VJ) r2.getValue()).A00.size() != 0) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00de, code lost:
        if (((X.AnonymousClass7N5) r2.getKey()).A02 == r7) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e0, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("Non-end state with no outbound transitions: ");
        r1 = new X.C143686zJ(X.AnonymousClass000.A0X(((X.AnonymousClass7N5) r2.getKey()).A03, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fc, code lost:
        r2 = X.AnonymousClass002.A0K();
        r1 = ((X.AnonymousClass7VJ) r2.getValue()).A00.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0110, code lost:
        if (r1.hasNext() == false) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0112, code lost:
        r2.add(((X.C149817Nz) r1.next()).A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011e, code lost:
        r5.addAll(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012d, code lost:
        if ((r6.size() - r5.size()) > 1) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0138, code lost:
        if ((r6.size() - r5.size()) != 1) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0140, code lost:
        if (r5.contains(r3.A00) == false) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0142, code lost:
        r1 = new X.C143686zJ("Non-start state(s) with no incoming transitions exist(s)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0148, code lost:
        r3.A02 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014a, code lost:
        r10.A00 = new X.AnonymousClass7L9(r11, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0151, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r1 = new X.C143686zJ("Non-start state(s) with no incoming transitions exist(s)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0158, code lost:
        r1 = new X.C143686zJ("State machine must have an end state");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0160, code lost:
        r1 = new X.C143686zJ("State machine must have a start state");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0168, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("Cannot find output state for transition ");
        r1 = new X.C143686zJ(X.AnonymousClass000.A0X(r4.A04, r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C150547Rf(X.C171558Hn r11) {
        /*
            r10 = this;
            r10.<init>()
            X.7LA r3 = new X.7LA
            r3.<init>()
            X.7N5[] r9 = X.C1462579j.A0C     // Catch:{ 6zJ -> 0x017d }
            int r8 = r9.length     // Catch:{ 6zJ -> 0x017d }
            r7 = 0
            r6 = 0
        L_0x000d:
            if (r6 >= r8) goto L_0x0060
            r5 = r9[r6]     // Catch:{ 6zJ -> 0x017d }
            java.util.HashMap r4 = r3.A01     // Catch:{ 6zJ -> 0x017d }
            java.lang.Object r0 = r4.get(r5)     // Catch:{ 6zJ -> 0x017d }
            if (r0 != 0) goto L_0x004a
            X.6vm r2 = r5.A02     // Catch:{ 6zJ -> 0x017d }
            X.6vm r0 = X.C141566vm.START     // Catch:{ 6zJ -> 0x017d }
            r1 = 0
            if (r2 != r0) goto L_0x003b
            r1 = 1
            X.7N5 r0 = r3.A00     // Catch:{ 6zJ -> 0x017d }
            if (r0 == 0) goto L_0x003b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6zJ -> 0x017d }
            java.lang.String r0 = "Start state already exists, new state invalid: "
            r1.append(r0)     // Catch:{ 6zJ -> 0x017d }
            java.lang.String r0 = r5.A03     // Catch:{ 6zJ -> 0x017d }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ 6zJ -> 0x017d }
            X.6zJ r1 = new X.6zJ     // Catch:{ 6zJ -> 0x017d }
            r1.<init>(r0)     // Catch:{ 6zJ -> 0x017d }
            goto L_0x017c
        L_0x003b:
            X.7VJ r0 = new X.7VJ     // Catch:{ 6zJ -> 0x017d }
            r0.<init>()     // Catch:{ 6zJ -> 0x017d }
            r4.put(r5, r0)     // Catch:{ 6zJ -> 0x017d }
            if (r1 == 0) goto L_0x0047
            r3.A00 = r5     // Catch:{ 6zJ -> 0x017d }
        L_0x0047:
            int r6 = r6 + 1
            goto L_0x000d
        L_0x004a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6zJ -> 0x017d }
            java.lang.String r0 = "State already added: "
            r1.append(r0)     // Catch:{ 6zJ -> 0x017d }
            java.lang.String r0 = r5.A03     // Catch:{ 6zJ -> 0x017d }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ 6zJ -> 0x017d }
            X.6zJ r1 = new X.6zJ     // Catch:{ 6zJ -> 0x017d }
            r1.<init>(r0)     // Catch:{ 6zJ -> 0x017d }
            goto L_0x017c
        L_0x0060:
            X.7Nz[] r6 = X.C1463079s.A0V     // Catch:{ 6zJ -> 0x017d }
            int r5 = r6.length     // Catch:{ 6zJ -> 0x017d }
        L_0x0063:
            if (r7 >= r5) goto L_0x0099
            r4 = r6[r7]     // Catch:{ 6zJ -> 0x017d }
            java.util.HashMap r2 = r3.A01     // Catch:{ 6zJ -> 0x017d }
            X.7N5 r0 = r4.A02     // Catch:{ 6zJ -> 0x017d }
            java.lang.Object r1 = r2.get(r0)     // Catch:{ 6zJ -> 0x017d }
            X.7VJ r1 = (X.AnonymousClass7VJ) r1     // Catch:{ 6zJ -> 0x017d }
            if (r1 == 0) goto L_0x0083
            X.7N5 r0 = r4.A01     // Catch:{ 6zJ -> 0x017d }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ 6zJ -> 0x017d }
            if (r0 == 0) goto L_0x0168
            java.util.Vector r0 = r1.A00     // Catch:{ 6zJ -> 0x017d }
            r0.add(r4)     // Catch:{ 6zJ -> 0x017d }
            int r7 = r7 + 1
            goto L_0x0063
        L_0x0083:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6zJ -> 0x017d }
            java.lang.String r0 = "Cannot find input state for transition "
            r1.append(r0)     // Catch:{ 6zJ -> 0x017d }
            java.lang.String r0 = r4.A04     // Catch:{ 6zJ -> 0x017d }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ 6zJ -> 0x017d }
            X.6zJ r1 = new X.6zJ     // Catch:{ 6zJ -> 0x017d }
            r1.<init>(r0)     // Catch:{ 6zJ -> 0x017d }
            goto L_0x017c
        L_0x0099:
            X.7N5 r0 = r3.A00     // Catch:{ 6zJ -> 0x017d }
            if (r0 == 0) goto L_0x0160
            java.util.HashMap r6 = r3.A01     // Catch:{ 6zJ -> 0x017d }
            java.util.Iterator r1 = X.C18290x4.A11(r6)     // Catch:{ 6zJ -> 0x017d }
        L_0x00a3:
            boolean r0 = r1.hasNext()     // Catch:{ 6zJ -> 0x017d }
            r4 = 1
            if (r0 == 0) goto L_0x0158
            java.lang.Object r0 = r1.next()     // Catch:{ 6zJ -> 0x017d }
            X.7N5 r0 = (X.AnonymousClass7N5) r0     // Catch:{ 6zJ -> 0x017d }
            X.6vm r0 = r0.A02     // Catch:{ 6zJ -> 0x017d }
            X.6vm r7 = X.C141566vm.END     // Catch:{ 6zJ -> 0x017d }
            if (r0 != r7) goto L_0x00a3
            java.util.HashSet r5 = X.AnonymousClass002.A0K()     // Catch:{ 6zJ -> 0x017d }
            java.util.Iterator r8 = X.AnonymousClass001.A0u(r6)     // Catch:{ 6zJ -> 0x017d }
        L_0x00be:
            boolean r0 = r8.hasNext()     // Catch:{ 6zJ -> 0x017d }
            if (r0 == 0) goto L_0x0122
            java.util.Map$Entry r2 = X.AnonymousClass001.A0w(r8)     // Catch:{ 6zJ -> 0x017d }
            java.lang.Object r0 = r2.getValue()     // Catch:{ 6zJ -> 0x017d }
            X.7VJ r0 = (X.AnonymousClass7VJ) r0     // Catch:{ 6zJ -> 0x017d }
            java.util.Vector r0 = r0.A00     // Catch:{ 6zJ -> 0x017d }
            int r0 = r0.size()     // Catch:{ 6zJ -> 0x017d }
            if (r0 != 0) goto L_0x00fc
            java.lang.Object r0 = r2.getKey()     // Catch:{ 6zJ -> 0x017d }
            X.7N5 r0 = (X.AnonymousClass7N5) r0     // Catch:{ 6zJ -> 0x017d }
            X.6vm r0 = r0.A02     // Catch:{ 6zJ -> 0x017d }
            if (r0 == r7) goto L_0x00fc
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6zJ -> 0x017d }
            java.lang.String r0 = "Non-end state with no outbound transitions: "
            r1.append(r0)     // Catch:{ 6zJ -> 0x017d }
            java.lang.Object r0 = r2.getKey()     // Catch:{ 6zJ -> 0x017d }
            X.7N5 r0 = (X.AnonymousClass7N5) r0     // Catch:{ 6zJ -> 0x017d }
            java.lang.String r0 = r0.A03     // Catch:{ 6zJ -> 0x017d }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ 6zJ -> 0x017d }
            X.6zJ r1 = new X.6zJ     // Catch:{ 6zJ -> 0x017d }
            r1.<init>(r0)     // Catch:{ 6zJ -> 0x017d }
            goto L_0x017c
        L_0x00fc:
            java.lang.Object r0 = r2.getValue()     // Catch:{ 6zJ -> 0x017d }
            X.7VJ r0 = (X.AnonymousClass7VJ) r0     // Catch:{ 6zJ -> 0x017d }
            java.util.HashSet r2 = X.AnonymousClass002.A0K()     // Catch:{ 6zJ -> 0x017d }
            java.util.Vector r0 = r0.A00     // Catch:{ 6zJ -> 0x017d }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ 6zJ -> 0x017d }
        L_0x010c:
            boolean r0 = r1.hasNext()     // Catch:{ 6zJ -> 0x017d }
            if (r0 == 0) goto L_0x011e
            java.lang.Object r0 = r1.next()     // Catch:{ 6zJ -> 0x017d }
            X.7Nz r0 = (X.C149817Nz) r0     // Catch:{ 6zJ -> 0x017d }
            X.7N5 r0 = r0.A01     // Catch:{ 6zJ -> 0x017d }
            r2.add(r0)     // Catch:{ 6zJ -> 0x017d }
            goto L_0x010c
        L_0x011e:
            r5.addAll(r2)     // Catch:{ 6zJ -> 0x017d }
            goto L_0x00be
        L_0x0122:
            int r1 = r6.size()     // Catch:{ 6zJ -> 0x017d }
            int r0 = r5.size()     // Catch:{ 6zJ -> 0x017d }
            int r1 = r1 - r0
            java.lang.String r2 = "Non-start state(s) with no incoming transitions exist(s)"
            if (r1 > r4) goto L_0x0152
            int r1 = r6.size()     // Catch:{ 6zJ -> 0x017d }
            int r0 = r5.size()     // Catch:{ 6zJ -> 0x017d }
            int r1 = r1 - r0
            if (r1 != r4) goto L_0x0148
            X.7N5 r0 = r3.A00     // Catch:{ 6zJ -> 0x017d }
            boolean r0 = r5.contains(r0)     // Catch:{ 6zJ -> 0x017d }
            if (r0 == 0) goto L_0x0148
            X.6zJ r1 = new X.6zJ     // Catch:{ 6zJ -> 0x017d }
            r1.<init>(r2)     // Catch:{ 6zJ -> 0x017d }
            goto L_0x017c
        L_0x0148:
            r3.A02 = r4     // Catch:{ 6zJ -> 0x017d }
            X.7L9 r0 = new X.7L9
            r0.<init>(r11, r3)
            r10.A00 = r0
            return
        L_0x0152:
            X.6zJ r1 = new X.6zJ     // Catch:{ 6zJ -> 0x017d }
            r1.<init>(r2)     // Catch:{ 6zJ -> 0x017d }
            goto L_0x017c
        L_0x0158:
            java.lang.String r0 = "State machine must have an end state"
            X.6zJ r1 = new X.6zJ     // Catch:{ 6zJ -> 0x017d }
            r1.<init>(r0)     // Catch:{ 6zJ -> 0x017d }
            goto L_0x017c
        L_0x0160:
            java.lang.String r0 = "State machine must have a start state"
            X.6zJ r1 = new X.6zJ     // Catch:{ 6zJ -> 0x017d }
            r1.<init>(r0)     // Catch:{ 6zJ -> 0x017d }
            goto L_0x017c
        L_0x0168:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6zJ -> 0x017d }
            java.lang.String r0 = "Cannot find output state for transition "
            r1.append(r0)     // Catch:{ 6zJ -> 0x017d }
            java.lang.String r0 = r4.A04     // Catch:{ 6zJ -> 0x017d }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ 6zJ -> 0x017d }
            X.6zJ r1 = new X.6zJ     // Catch:{ 6zJ -> 0x017d }
            r1.<init>(r0)     // Catch:{ 6zJ -> 0x017d }
        L_0x017c:
            throw r1     // Catch:{ 6zJ -> 0x017d }
        L_0x017d:
            r0 = move-exception
            java.lang.Throwable r1 = X.AnonymousClass6C8.A0h(r0)
            java.lang.String r0 = "Failed to init finite state machine."
            javax.net.ssl.SSLException r2 = new javax.net.ssl.SSLException
            r2.<init>(r0, r1)
            r1 = 80
            X.6zV r0 = new X.6zV
            r0.<init>(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C150547Rf.<init>(X.8Hn):void");
    }
}
