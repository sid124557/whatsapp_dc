package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7kl  reason: invalid class name and case insensitive filesystem */
public abstract class C158917kl {
    public static final AnonymousClass8NM A06 = new AnonymousClass8NM(false);
    public static final AnonymousClass8NM A07 = new AnonymousClass8NM(true);
    public long A00 = Long.MAX_VALUE;
    public final long A01;
    public final C151367Um A02;
    public final List A03 = AnonymousClass001.A0s();
    public final Queue A04 = new PriorityQueue(16, A07);
    public final Set A05;

    public C158917kl(C151367Um r8, Map map) {
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            this.A03.add(new AnonymousClass7W9((C153247av) A0w.getValue(), C18310x6.A0q(A0w)));
        }
        this.A01 = TimeUnit.MILLISECONDS.toMicros(0);
        this.A05 = AnonymousClass002.A0K();
        this.A02 = r8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:77:0x0014 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(long r21) {
        /*
            r20 = this;
            r8 = r20
            long r4 = r8.A00
            r2 = r21
            int r0 = (r21 > r4 ? 1 : (r21 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            java.util.Queue r1 = r8.A04
            r1.clear()
            java.util.List r0 = r8.A03
            r1.addAll(r0)
        L_0x0014:
            java.util.Queue r10 = r8.A04
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x00cf
            long r6 = r8.A01
            long r6 = r6 + r21
            java.lang.Object r0 = r10.peek()
            X.7W9 r0 = (X.AnonymousClass7W9) r0
            X.7av r4 = r0.A00
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r0 = r4.A01
            java.util.concurrent.TimeUnit r4 = r4.A02
            long r4 = r9.convert(r0, r4)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00cf
            java.lang.Object r6 = r10.poll()
            X.7W9 r6 = (X.AnonymousClass7W9) r6
            X.7av r0 = r6.A00
            long r4 = r0.A00
            java.util.concurrent.TimeUnit r0 = r0.A02
            long r4 = r9.convert(r4, r0)
            int r0 = (r21 > r4 ? 1 : (r21 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            java.util.Set r1 = r8.A05
            boolean r0 = r1.contains(r6)
            if (r0 != 0) goto L_0x0014
            r1.add(r6)
            java.lang.String r1 = r6.A01
            boolean r0 = r8 instanceof X.AnonymousClass6O5
            if (r0 == 0) goto L_0x0014
            r0 = r8
            X.6O5 r0 = (X.AnonymousClass6O5) r0
            X.7kj r5 = r0.A00
            int r4 = java.lang.Integer.parseInt(r1)
            X.7QR r0 = r5.A08
            X.7bV r6 = r0.A05
            if (r6 == 0) goto L_0x00bd
            java.util.Map r9 = r5.A0L
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            boolean r0 = r9.containsKey(r7)
            if (r0 != 0) goto L_0x00b1
            X.8lL r10 = r5.A0G
            X.6x5 r0 = X.C142366x5.AUDIO
            X.7aW r0 = r6.A00(r0, r4)
            java.util.List r0 = r0.A02
            java.util.Iterator r11 = X.AnonymousClass6C7.A0u(r0)
        L_0x0084:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r1 = r11.next()
            X.7aw r1 = (X.C153257aw) r1
            boolean r0 = r1.A01()
            if (r0 != 0) goto L_0x0084
            java.io.File r0 = r1.A02     // Catch:{ Exception -> 0x00a9 }
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ Exception -> 0x00a9 }
            X.7Uf r0 = r10.B2y(r0)     // Catch:{ Exception -> 0x00a9 }
            if (r0 == 0) goto L_0x00a9
            goto L_0x00a5
        L_0x00a3:
            r0 = 0
            goto L_0x00aa
        L_0x00a5:
            boolean r0 = r0.A0K
            if (r0 == 0) goto L_0x0084
        L_0x00a9:
            r0 = 1
        L_0x00aa:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.put(r7, r0)
        L_0x00b1:
            java.lang.Object r0 = r9.get(r7)
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r0 != 0) goto L_0x00bd
            goto L_0x0014
        L_0x00bd:
            java.util.concurrent.ExecutorService r1 = r5.A0M
            X.8OX r0 = new X.8OX
            r0.<init>(r5, r6, r4)
            java.util.concurrent.Future r1 = r1.submit(r0)
            java.util.Map r0 = r5.A0K
            X.AnonymousClass6C9.A12(r1, r0, r4)
            goto L_0x0014
        L_0x00cf:
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            java.util.Set r6 = r8.A05
            java.util.Iterator r19 = r6.iterator()
        L_0x00e1:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0124
            java.lang.Object r10 = r19.next()
            X.7W9 r10 = (X.AnonymousClass7W9) r10
            X.7av r14 = r10.A00
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MICROSECONDS
            boolean r1 = r14.A01(r2, r13)
            boolean r0 = r10.A02
            if (r1 != 0) goto L_0x011e
            if (r0 == 0) goto L_0x00fe
            r11.add(r10)
        L_0x00fe:
            long r4 = r8.A01
            long r17 = r21 - r4
            long r0 = r14.A00
            java.util.concurrent.TimeUnit r12 = r14.A02
            long r15 = r13.convert(r0, r12)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x011a
            long r4 = r4 + r21
            long r0 = r14.A01
            long r12 = r13.convert(r0, r12)
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e1
        L_0x011a:
            r7.add(r10)
            goto L_0x00e1
        L_0x011e:
            if (r0 != 0) goto L_0x00fe
            r9.add(r10)
            goto L_0x00fe
        L_0x0124:
            X.8NM r5 = A06
            java.util.Collections.sort(r11, r5)
            java.util.Iterator r4 = r11.iterator()
        L_0x012d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0142
            java.lang.Object r1 = r4.next()
            X.7W9 r1 = (X.AnonymousClass7W9) r1
            r0 = 0
            r1.A02 = r0
            java.lang.String r0 = r1.A01
            r8.A01(r0)
            goto L_0x012d
        L_0x0142:
            X.8NM r0 = A07
            java.util.Collections.sort(r9, r0)
            java.util.Iterator r9 = r9.iterator()
        L_0x014b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01ac
            java.lang.Object r1 = r9.next()
            X.7W9 r1 = (X.AnonymousClass7W9) r1
            r0 = 1
            r1.A02 = r0
            java.lang.String r1 = r1.A01
            boolean r0 = r8 instanceof X.AnonymousClass6O5
            if (r0 == 0) goto L_0x0173
            r0 = r8
            X.6O5 r0 = (X.AnonymousClass6O5) r0
            X.7kj r0 = r0.A00
            X.7Wp r0 = r0.A0F
            int r4 = java.lang.Integer.parseInt(r1)
            X.7nM r0 = r0.A02
            boolean[] r1 = r0.A03
            r0 = 1
            r1[r4] = r0
            goto L_0x014b
        L_0x0173:
            X.6O4 r8 = (X.AnonymousClass6O4) r8
            java.util.Map r0 = r8.A01
            java.lang.Object r0 = r0.get(r1)
            r0.getClass()
            X.7B3 r0 = (X.AnonymousClass7B3) r0
            java.lang.Integer r4 = r0.A00
            r3 = 0
            int r2 = r4.intValue()
            r0 = -1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r2 != r0) goto L_0x0199
            java.lang.String r0 = "MediaEffect: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r3, r0, r1)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass002.A0G(r0)
            throw r0
        L_0x0199:
            java.lang.String r0 = "Track Index: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", MediaEffect: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r3, r0, r1)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass002.A0G(r0)
            throw r0
        L_0x01ac:
            java.util.Collections.sort(r7, r5)
            java.util.Iterator r1 = r7.iterator()
        L_0x01b3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01c5
            java.lang.Object r0 = r1.next()
            X.7W9 r0 = (X.AnonymousClass7W9) r0
            java.lang.String r0 = r0.A01
            r8.A02(r0)
            goto L_0x01b3
        L_0x01c5:
            r6.removeAll(r7)
            r8.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158917kl.A00(long):void");
    }

    public void A01(String str) {
        if (this instanceof AnonymousClass6O5) {
            C151867Wp r0 = ((AnonymousClass6O5) this).A00.A0F;
            r0.A02.A03[Integer.parseInt(str)] = false;
            return;
        }
        Object obj = ((AnonymousClass6O4) this).A01.get(str);
        obj.getClass();
        int intValue = ((AnonymousClass7B3) obj).A00.intValue();
        throw C18320x8.A0m();
    }

    public void A02(String str) {
        if (this instanceof AnonymousClass6O5) {
            C158897kj r5 = ((AnonymousClass6O5) this).A00;
            Object remove = r5.A0K.remove(Integer.valueOf(Integer.parseInt(str)));
            if (remove != null) {
                r5.A0J.add(r5.A0M.submit(new AnonymousClass91I(r5, 0, remove)));
            }
        }
    }
}
