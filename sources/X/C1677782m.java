package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.82m  reason: invalid class name and case insensitive filesystem */
public final class C1677782m implements C186188ut {
    public C172258Kh A00;
    public final AnonymousClass7R7 A01;
    public final AnonymousClass7AP A02;
    public final AnonymousClass7NO A03;
    public final String A04;

    public C1677782m(AnonymousClass7R7 r3, AnonymousClass7AP r4, AnonymousClass7NO r5) {
        C162457s7.A0J(r5, 3);
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
        String valueOf = String.valueOf(r4.A00.hashCode());
        this.A04 = valueOf;
        C162457s7.A0J(valueOf, 0);
        this.A00 = r5.A03.B3z(valueOf);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r2 == null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized X.AnonymousClass8KS A00() {
        /*
            r4 = this;
            monitor-enter(r4)
            X.8Kh r2 = r4.A00     // Catch:{ all -> 0x002b }
            r0 = 0
            if (r2 != 0) goto L_0x0015
            X.7NO r3 = r4.A03     // Catch:{ all -> 0x002b }
            java.lang.String r2 = r4.A04     // Catch:{ all -> 0x002b }
            r1 = 0
            X.C162457s7.A0J(r2, r1)     // Catch:{ all -> 0x002b }
            X.83g r1 = r3.A03     // Catch:{ all -> 0x002b }
            X.8Kh r2 = r1.B3z(r2)     // Catch:{ all -> 0x002b }
            goto L_0x0024
        L_0x0015:
            monitor-enter(r2)     // Catch:{ all -> 0x002b }
            boolean r1 = r2.A04()     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0022
            java.lang.Object r0 = r2.A03()     // Catch:{ all -> 0x0028 }
            X.8KS r0 = (X.AnonymousClass8KS) r0     // Catch:{ all -> 0x0028 }
        L_0x0022:
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            goto L_0x0026
        L_0x0024:
            if (r2 != 0) goto L_0x0015
        L_0x0026:
            monitor-exit(r4)
            return r0
        L_0x0028:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ all -> 0x002b }
        L_0x002b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1677782m.A00():X.8KS");
    }

    public C172258Kh B7Z(int i) {
        return null;
    }

    public void clear() {
        ArrayList A032;
        ArrayList A033;
        AnonymousClass7NO r1 = this.A03;
        String str = this.A04;
        C162457s7.A0J(str, 0);
        C1679083g r4 = r1.A03;
        AnonymousClass7AR r12 = new AnonymousClass7AR(str);
        synchronized (r4) {
            A032 = r4.A04.A03(r12);
            A033 = r4.A03.A03(r12);
            r4.A06(A033);
        }
        Iterator it = A033.iterator();
        while (it.hasNext()) {
            C172258Kh A022 = r4.A02((AnonymousClass7NX) it.next());
            if (A022 != null) {
                A022.close();
            }
        }
        Iterator it2 = A032.iterator();
        while (it2.hasNext()) {
            C1679083g.A00((AnonymousClass7NX) it2.next());
        }
        r4.A04();
        r4.A03();
        A033.size();
        this.A00 = null;
    }

    public boolean Aza(int i) {
        return AnonymousClass000.A1W(B54(i));
    }

    public C172258Kh B54(int i) {
        Object obj;
        AnonymousClass8KS A002 = A00();
        if (A002 == null) {
            return null;
        }
        Map map = A002.A01;
        if (map.isEmpty()) {
            obj = C18290x4.A0j(A002.A02, i);
        } else {
            Object A0i = AnonymousClass001.A0i(map, i);
            if (A0i != null) {
                obj = A002.A02.get(A0i);
            }
            return null;
        }
        C172258Kh r1 = (C172258Kh) obj;
        if (r1 == null || !r1.A04() || C172258Kh.A00(r1).isRecycled()) {
            return null;
        }
        return r1;
    }

    public boolean BH1() {
        Map A0A;
        AnonymousClass8KS A002 = A00();
        if (A002 != null) {
            A0A = A002.A00();
        } else {
            A0A = C73813g7.A0A();
        }
        if (A0A.size() <= 1) {
            return false;
        }
        return true;
    }

    public boolean BMR(Map map) {
        Map A0A;
        AnonymousClass8KS A002 = A00();
        if (A002 != null) {
            A0A = A002.A00();
        } else {
            A0A = C73813g7.A0A();
        }
        if (map.size() < A0A.size()) {
            return true;
        }
        C186338v8 r9 = this.A02.A00;
        int duration = r9.getDuration();
        int frameCount = r9.getFrameCount();
        if (frameCount < 1) {
            frameCount = 1;
        }
        int i = duration / frameCount;
        long millis = TimeUnit.SECONDS.toMillis(1);
        if (i < 1) {
            i = 1;
        }
        int i2 = (int) (millis / ((long) i));
        C172258Kh r2 = null;
        while (true) {
            if (i2 <= 1) {
                break;
            }
            Map A003 = this.A01.A00(r9.getDuration(), map.size(), i2);
            LinkedHashMap A0r = C18320x8.A0r();
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                int A06 = C18280x3.A06(A0w);
                Object value = A0w.getValue();
                Object A0i = AnonymousClass001.A0i(A003, A06);
                if (A0i != null) {
                    if (A0r.containsKey(A0i)) {
                        A0s.add(value);
                    } else {
                        A0r.put(A0i, value);
                    }
                }
            }
            AnonymousClass8KS r5 = new AnonymousClass8KS(A0r, A003);
            AnonymousClass7NO r1 = this.A03;
            String str = this.A04;
            C162457s7.A0J(str, 0);
            r2 = r1.A03.AyG(new C172258Kh(C172258Kh.A04, C172258Kh.A05, (Object) r5), (AnonymousClass7AQ) null, str);
            if (r2 != null) {
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    ((C172258Kh) it.next()).close();
                }
            } else {
                i2--;
            }
        }
        this.A00 = r2;
        if (r2 == null) {
            return false;
        }
        return true;
    }

    public C172258Kh B4f(int i, int i2, int i3) {
        return null;
    }

    public void BTq(C172258Kh r1, int i, int i2) {
    }

    public void BTs(C172258Kh r1, int i, int i2) {
    }
}
