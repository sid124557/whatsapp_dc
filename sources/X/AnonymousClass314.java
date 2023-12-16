package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.314  reason: invalid class name */
public class AnonymousClass314 {
    public final AnonymousClass3ZV A00 = new AnonymousClass3ZV();
    public final AnonymousClass3ZV A01 = new AnonymousClass3ZV();
    public final C56982ss A02;
    public final C40532Gt A03;

    public int A01() {
        int i;
        C56982ss r4 = this.A02;
        r4.A0G();
        AnonymousClass3ZV r3 = this.A01;
        synchronized (r3) {
            Iterator it = r3.iterator();
            i = 0;
            while (it.hasNext()) {
                if (r4.A0M(C51482jt.A00(it))) {
                    i++;
                }
            }
        }
        return i;
    }

    public int A02() {
        int size;
        this.A02.A0G();
        AnonymousClass3ZV r1 = this.A01;
        synchronized (r1) {
            size = r1.A01.size();
        }
        return size;
    }

    public int A03() {
        int i;
        C56982ss r5 = this.A02;
        r5.A0G();
        AnonymousClass3ZV r4 = this.A01;
        synchronized (r4) {
            Iterator it = r4.iterator();
            i = 0;
            while (it.hasNext()) {
                C95814uZ A002 = C51482jt.A00(it);
                if (!r5.A0M(A002) && !r5.A0P(A002)) {
                    i++;
                }
            }
        }
        return i;
    }

    public ArrayList A04() {
        ArrayList A0s;
        this.A02.A0G();
        AnonymousClass3ZV r4 = this.A01;
        synchronized (r4) {
            A0s = AnonymousClass001.A0s();
            Iterator it = r4.iterator();
            while (it.hasNext()) {
                C95814uZ A002 = C51482jt.A00(it);
                if (A002 instanceof UserJid) {
                    A0s.add((UserJid) A002);
                }
            }
        }
        return A0s;
    }

    public List A05() {
        ArrayList A0y;
        this.A02.A0G();
        AnonymousClass3ZV r3 = this.A01;
        synchronized (r3) {
            A0y = C18290x4.A0y(r3.A01);
            Iterator it = r3.iterator();
            while (it.hasNext()) {
                A0y.add(C51482jt.A00(it));
            }
        }
        return A0y;
    }

    public List A06() {
        C56982ss r5 = this.A02;
        r5.A0G();
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass3ZV r3 = this.A01;
        synchronized (r3) {
            Iterator it = r3.iterator();
            while (it.hasNext()) {
                C95814uZ A002 = C51482jt.A00(it);
                if (r5.A0M(A002)) {
                    A0s.add(A002);
                }
            }
        }
        return A0s;
    }

    public List A07() {
        ArrayList A0s;
        this.A02.A0G();
        AnonymousClass3ZV r4 = this.A01;
        synchronized (r4) {
            A0s = AnonymousClass001.A0s();
            Iterator it = r4.iterator();
            while (it.hasNext()) {
                C95814uZ A002 = C51482jt.A00(it);
                if (C627336j.A0K(A002) || (A002 instanceof AnonymousClass1fI)) {
                    A0s.add((C28011fL) A002);
                }
            }
        }
        return A0s;
    }

    public List A08() {
        C56982ss r5 = this.A02;
        r5.A0G();
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass3ZV r3 = this.A01;
        synchronized (r3) {
            Iterator it = r3.iterator();
            while (it.hasNext()) {
                C95814uZ A002 = C51482jt.A00(it);
                if (r5.A0P(A002)) {
                    A0s.add(A002);
                }
            }
        }
        return A0s;
    }

    public List A09() {
        C56982ss r5 = this.A02;
        r5.A0G();
        AnonymousClass3ZV r4 = this.A01;
        ArrayList A0y = C18290x4.A0y(r4.A01);
        synchronized (r4) {
            Iterator it = r4.iterator();
            while (it.hasNext()) {
                C95814uZ A002 = C51482jt.A00(it);
                if (!r5.A0M(A002) && !r5.A0P(A002)) {
                    A0y.add(A002);
                }
            }
        }
        return A0y;
    }

    public List A0A(AnonymousClass1R1 r9) {
        C56982ss r7 = this.A02;
        r7.A0G();
        AnonymousClass3ZV r6 = this.A01;
        ArrayList A0y = C18290x4.A0y(r6.A01);
        Set A0R = r9.A0R();
        ArrayList A0s = AnonymousClass001.A0s();
        synchronized (r6) {
            Iterator it = r6.iterator();
            while (it.hasNext()) {
                C95814uZ A002 = C51482jt.A00(it);
                if (!r7.A0P(A002)) {
                    A0s.add(A002);
                }
            }
        }
        A0R.retainAll(A0s);
        A0y.addAll(A0R);
        Iterator it2 = A0s.iterator();
        while (it2.hasNext()) {
            C95814uZ A0P = C18300x5.A0P(it2);
            if (!r7.A0M(A0P) && !A0R.contains(A0P)) {
                A0y.add(A0P);
            }
        }
        return A0y;
    }

    public Set A0B() {
        HashSet A0r;
        this.A02.A0G();
        AnonymousClass3ZV r3 = this.A01;
        synchronized (r3) {
            A0r = C18310x6.A0r(r3.A01);
            Iterator it = r3.iterator();
            while (it.hasNext()) {
                A0r.add(C51482jt.A00(it));
            }
        }
        return A0r;
    }

    public void A0C(C95814uZ r4) {
        if (r4 != null) {
            this.A02.A0G();
            AnonymousClass3ZV r2 = this.A01;
            synchronized (r2) {
                if (r2.A00) {
                    r2.A03.remove(r4);
                }
                int A002 = r2.A00(r4);
                if (A002 >= 0) {
                    r2.A01.remove(A002);
                }
            }
        }
    }

    public boolean A0D(C95814uZ r3) {
        boolean A1U;
        if (r3 == null) {
            return false;
        }
        this.A02.A0G();
        AnonymousClass3ZV r1 = this.A01;
        synchronized (r1) {
            A1U = AnonymousClass001.A1U(r1.A00(r3));
        }
        return A1U;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r4 = r9.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0E(X.C95814uZ r10, X.C95814uZ r11, long r12) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C95804uY
            r2 = 0
            if (r0 != 0) goto L_0x0012
            X.2ss r4 = r9.A02
            X.31A r0 = r4.A0A(r10, r2)
            if (r0 == 0) goto L_0x0013
            int r1 = r0.A02
            r0 = 5
            if (r1 != r0) goto L_0x0013
        L_0x0012:
            return r2
        L_0x0013:
            X.31A r1 = r4.A0A(r10, r2)
            if (r1 == 0) goto L_0x0028
            boolean r0 = r1.A0o
            if (r0 != 0) goto L_0x0012
            X.4uZ r0 = r1.A05()
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0028
            return r2
        L_0x0028:
            X.3ZV r3 = r9.A01
            monitor-enter(r3)
            com.whatsapp.jid.GroupJid r0 = X.AnonymousClass32V.A00(r11)     // Catch:{ all -> 0x00b5 }
            int r1 = r4.A07(r0)     // Catch:{ all -> 0x00b5 }
            r0 = 1
            if (r1 != r0) goto L_0x0052
            boolean r0 = r3.A00     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x003f
            java.util.HashMap r0 = r3.A03     // Catch:{ all -> 0x00b5 }
            r0.remove(r10)     // Catch:{ all -> 0x00b5 }
        L_0x003f:
            int r1 = r3.A00(r10)     // Catch:{ all -> 0x00b5 }
            if (r1 < 0) goto L_0x0050
            java.util.ArrayList r0 = r3.A01     // Catch:{ all -> 0x00b5 }
            java.lang.Object r0 = r0.remove(r1)     // Catch:{ all -> 0x00b5 }
            X.2jt r0 = (X.C51482jt) r0     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x0050
            r2 = 1
        L_0x0050:
            monitor-exit(r3)     // Catch:{ all -> 0x00b5 }
            return r2
        L_0x0052:
            int r5 = r3.A00(r10)     // Catch:{ all -> 0x00b5 }
            if (r5 < 0) goto L_0x0071
            java.util.ArrayList r0 = r3.A01     // Catch:{ all -> 0x00b5 }
            java.lang.Object r4 = r0.remove(r5)     // Catch:{ all -> 0x00b5 }
            X.2jt r4 = (X.C51482jt) r4     // Catch:{ all -> 0x00b5 }
        L_0x0060:
            boolean r0 = r3.A00     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x0076
            java.util.HashMap r0 = r3.A03     // Catch:{ all -> 0x00b5 }
            r0.remove(r10)     // Catch:{ all -> 0x00b5 }
            java.lang.Long r8 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x00b5 }
            r0.put(r11, r8)     // Catch:{ all -> 0x00b5 }
            goto L_0x0073
        L_0x0071:
            r4 = 0
            goto L_0x0060
        L_0x0073:
            if (r4 == 0) goto L_0x00a5
            goto L_0x007c
        L_0x0076:
            X.2jt r4 = new X.2jt     // Catch:{ all -> 0x00b5 }
            r4.<init>(r11, r12)     // Catch:{ all -> 0x00b5 }
            goto L_0x008f
        L_0x007c:
            long r6 = r8.longValue()     // Catch:{ all -> 0x00b5 }
            long r0 = r4.A00     // Catch:{ all -> 0x00b5 }
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00a5
            X.4uZ r2 = r4.A01     // Catch:{ all -> 0x00b5 }
            if (r11 == r2) goto L_0x008f
            X.2jt r4 = new X.2jt     // Catch:{ all -> 0x00b5 }
            r4.<init>(r11, r0)     // Catch:{ all -> 0x00b5 }
        L_0x008f:
            java.util.ArrayList r6 = r3.A01     // Catch:{ all -> 0x00b5 }
            java.util.Comparator r0 = r3.A02     // Catch:{ all -> 0x00b5 }
            int r2 = java.util.Collections.binarySearch(r6, r4, r0)     // Catch:{ all -> 0x00b5 }
            r1 = 1
            boolean r0 = X.AnonymousClass001.A1V(r2)
            X.C626936e.A0B(r0)     // Catch:{ all -> 0x00b5 }
            int r0 = -r2
            int r0 = r0 - r1
            r6.add(r0, r4)     // Catch:{ all -> 0x00b5 }
            goto L_0x00af
        L_0x00a5:
            long r0 = r8.longValue()     // Catch:{ all -> 0x00b5 }
            X.2jt r4 = new X.2jt     // Catch:{ all -> 0x00b5 }
            r4.<init>(r11, r0)     // Catch:{ all -> 0x00b5 }
            goto L_0x008f
        L_0x00af:
            boolean r0 = X.AnonymousClass001.A1X(r5, r0)
            monitor-exit(r3)     // Catch:{ all -> 0x00b5 }
            return r0
        L_0x00b5:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00b5 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass314.A0E(X.4uZ, X.4uZ, long):boolean");
    }

    public AnonymousClass314(C56982ss r2, C40532Gt r3) {
        this.A02 = r2;
        this.A03 = r3;
    }

    public static List A00(Collection collection) {
        ArrayList A0J = AnonymousClass002.A0J(collection);
        AnonymousClass4IU.A00(A0J, 33);
        return A0J;
    }
}
