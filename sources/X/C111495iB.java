package X;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.5iB  reason: invalid class name and case insensitive filesystem */
public class C111495iB implements AnonymousClass4FP {
    public final C56972sr A00;
    public final Map A01 = AnonymousClass0x9.A1D();
    public final Map A02 = AnonymousClass0x9.A1D();
    public final TreeSet A03 = new TreeSet();

    public synchronized void Awm(C30331mH r14) {
        C117025rG r0;
        TreeSet treeSet;
        String str;
        if (!(r14 instanceof C30571mf)) {
            str = "Wrong message add on passed into MessageReactionsImpl";
        } else {
            C56972sr r4 = this.A00;
            C95814uZ A04 = C56972sr.A04(r4);
            if (A04 == null) {
                str = "myUserJid is null. User logged out?";
            } else {
                C30571mf r142 = (C30571mf) r14;
                Map map = this.A02;
                AnonymousClass2z0 r1 = r142.A1J;
                map.put(r1.A01, r142);
                if (!r1.A02) {
                    A04 = r142.A0o();
                    C626936e.A06(A04);
                }
                C117015rF r3 = new C117015rF(r4, A04, r142.A01, r142.A00, r142.A0K, r142.A02);
                String A002 = A00(r3.A05);
                if (!TextUtils.isEmpty(A002)) {
                    Map map2 = this.A01;
                    if (!map2.containsKey(A002)) {
                        r0 = new C117025rG(r4, r3, A002);
                        map2.put(A002, r0);
                        treeSet = this.A03;
                    } else {
                        r0 = (C117025rG) C18320x8.A0Z(map2, A002);
                        treeSet = this.A03;
                        treeSet.remove(r0);
                        r0.A01(r3);
                    }
                    treeSet.add(r0);
                }
            }
        }
        C626936e.A0D(false, str);
    }

    public synchronized C117025rG B4J(String str) {
        return (C117025rG) this.A01.get(str);
    }

    public synchronized Iterator B4K() {
        return this.A03.descendingIterator();
    }

    public synchronized int B4L() {
        return this.A03.size();
    }

    public synchronized Collection B4S() {
        return this.A02.values();
    }

    public synchronized int BBt() {
        int i;
        Iterator B4K = B4K();
        i = 0;
        while (B4K.hasNext()) {
            C117025rG r1 = (C117025rG) B4K.next();
            if (!TextUtils.isEmpty(r1.A02)) {
                i += r1.A00();
            }
        }
        return i;
    }

    public synchronized String BBu(C95814uZ r4, long j) {
        Iterator B4K = B4K();
        while (B4K.hasNext()) {
            C117015rF r0 = (C117015rF) ((C117025rG) B4K.next()).A03.get(AnonymousClass0x9.A0C(r4, Long.valueOf(j)));
            if (r0 != null) {
                return r0.A05;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r11.A1J.A02 != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void BjZ(X.C30331mH r11, X.C30331mH r12, boolean r13) {
        /*
            r10 = this;
            r9 = r10
            monitor-enter(r9)
            boolean r0 = r11 instanceof X.C30571mf     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x009b
            boolean r0 = r12 instanceof X.C30571mf     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x009b
            X.2z0 r0 = r12.A1J     // Catch:{ all -> 0x00a3 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x00a3 }
            if (r0 != 0) goto L_0x001a
            X.2z0 r0 = r11.A1J     // Catch:{ all -> 0x00a3 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x00a3 }
            if (r0 != 0) goto L_0x009b
            if (r13 != 0) goto L_0x0020
            goto L_0x009b
        L_0x001a:
            X.2z0 r0 = r11.A1J     // Catch:{ all -> 0x00a3 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x009b
        L_0x0020:
            X.1mf r11 = (X.C30571mf) r11     // Catch:{ all -> 0x00a3 }
            X.1mf r12 = (X.C30571mf) r12     // Catch:{ all -> 0x00a3 }
            X.2sr r0 = r10.A00     // Catch:{ all -> 0x0099 }
            com.whatsapp.jid.PhoneUserJid r8 = X.C56972sr.A04(r0)     // Catch:{ all -> 0x0099 }
            if (r8 != 0) goto L_0x0033
            java.lang.String r1 = "myUserJid is null. User logged out?"
            r0 = 0
            X.C626936e.A0D(r0, r1)     // Catch:{ all -> 0x0099 }
            goto L_0x0095
        L_0x0033:
            java.lang.String r0 = r11.A01     // Catch:{ all -> 0x0099 }
            java.lang.String r6 = A00(r0)     // Catch:{ all -> 0x0099 }
            java.util.Map r5 = r10.A01     // Catch:{ all -> 0x0099 }
            java.lang.Object r4 = r5.get(r6)     // Catch:{ all -> 0x0099 }
            X.5rG r4 = (X.C117025rG) r4     // Catch:{ all -> 0x0099 }
            if (r4 == 0) goto L_0x0095
            java.util.TreeSet r3 = r10.A03     // Catch:{ all -> 0x0099 }
            r3.remove(r4)     // Catch:{ all -> 0x0099 }
            X.2z0 r2 = r11.A1J     // Catch:{ all -> 0x0099 }
            boolean r0 = r2.A02     // Catch:{ all -> 0x0099 }
            if (r0 != 0) goto L_0x0055
            com.whatsapp.jid.UserJid r8 = r11.A0o()     // Catch:{ all -> 0x0099 }
            X.C626936e.A06(r8)     // Catch:{ all -> 0x0099 }
        L_0x0055:
            long r0 = r11.A02     // Catch:{ all -> 0x0099 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0099 }
            android.util.Pair r7 = X.AnonymousClass0x9.A0C(r8, r0)     // Catch:{ all -> 0x0099 }
            java.util.HashMap r0 = r4.A03     // Catch:{ all -> 0x0099 }
            java.lang.Object r1 = r0.get(r7)     // Catch:{ all -> 0x0099 }
            if (r1 == 0) goto L_0x007d
            r0.remove(r7)     // Catch:{ all -> 0x0099 }
            java.util.TreeSet r0 = r4.A04     // Catch:{ all -> 0x0099 }
            r0.remove(r1)     // Catch:{ all -> 0x0099 }
            X.2sr r0 = r4.A01     // Catch:{ all -> 0x0099 }
            boolean r0 = r0.A0a(r8)     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x007d
            int r0 = r4.A00     // Catch:{ all -> 0x0099 }
            int r0 = r0 + -1
            r4.A00 = r0     // Catch:{ all -> 0x0099 }
        L_0x007d:
            int r0 = r4.A00()     // Catch:{ all -> 0x0099 }
            if (r0 != 0) goto L_0x0091
            r3.remove(r4)     // Catch:{ all -> 0x0099 }
            r5.remove(r6)     // Catch:{ all -> 0x0099 }
        L_0x0089:
            java.util.Map r1 = r10.A02     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x0099 }
            r1.remove(r0)     // Catch:{ all -> 0x0099 }
            goto L_0x0095
        L_0x0091:
            r3.add(r4)     // Catch:{ all -> 0x0099 }
            goto L_0x0089
        L_0x0095:
            r10.Awm(r12)     // Catch:{ all -> 0x00a3 }
            goto L_0x00a1
        L_0x0099:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00a3 }
        L_0x009b:
            java.lang.String r1 = "Wrong message add on passed into MessageReactionsImpl"
            r0 = 0
            X.C626936e.A0D(r0, r1)     // Catch:{ all -> 0x00a3 }
        L_0x00a1:
            monitor-exit(r9)
            return
        L_0x00a3:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111495iB.BjZ(X.1mH, X.1mH, boolean):void");
    }

    public AnonymousClass4FP B0T() {
        return new C111495iB(this.A00, AnonymousClass002.A0J(B4S()));
    }

    public C111495iB(C56972sr r3, List list) {
        this.A00 = r3;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Awm((C30331mH) it.next());
        }
    }

    public static final String A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        C626936e.A06(str);
        if (!C106825aE.A01(str)) {
            return C157857j0.A00;
        }
        return C106655Zv.A01(C107425bI.A07(new C106655Zv(new C106655Zv(C106825aE.A03(new C106655Zv(str).A00)).toString()).A00));
    }
}
