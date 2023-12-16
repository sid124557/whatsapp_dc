package X;

import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5jX  reason: invalid class name and case insensitive filesystem */
public class C112315jX implements C184198rP, C184188rO, C1225664w {
    public AnonymousClass5ZO A00;
    public AnonymousClass5T3 A01;
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();
    public final C111525iE A03;
    public final C111545iG A04;
    public final C186048uf A05;
    public final C105705Wb A06;
    public final C147117Cw A07 = new C147117Cw(this);
    public final C147127Cx A08 = new C147127Cx(this);
    public final C150127Ph A09;
    public final C184258rV A0A = new AnonymousClass8FN(this);
    public final AnonymousClass1VX A0B;
    public final C105355Up A0C;
    public final C103805Om A0D;
    public final Map A0E = Collections.synchronizedMap(C18320x8.A0r());
    public final AnonymousClass4GP A0F = new C1896792f(this, 4);

    public static final boolean A00(AnonymousClass5ZO r3) {
        if (r3 == null) {
            return false;
        }
        String str = r3.A09;
        return "device".equals(str) || "pin_on_map".equals(str) || "manual".equals(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(int r7) {
        /*
            r6 = this;
            r5 = 0
            r1 = 39
            if (r7 == 0) goto L_0x000f
            r0 = 1
            r1 = 38
            if (r7 == r0) goto L_0x000f
            r0 = 2
            if (r7 == r0) goto L_0x0027
            r1 = 78
        L_0x000f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x0013:
            X.5iG r4 = r6.A04
            r3 = 0
            int r2 = r0.intValue()
            r1 = 2
            X.5ZO r0 = r6.A00
            if (r0 == 0) goto L_0x0023
            java.lang.Integer r5 = X.AnonymousClass5ZO.A03(r0)
        L_0x0023:
            X.C111545iG.A00(r4, r5, r3, r2, r1)
        L_0x0026:
            return
        L_0x0027:
            X.5Up r0 = r6.A0C
            boolean r1 = r0.A09()
            r0 = 5
            if (r1 == 0) goto L_0x0032
            r0 = 86
        L_0x0032:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0026
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112315jX.A08(int):void");
    }

    public final C135816lI A01(AnonymousClass7HB r5) {
        AnonymousClass6fW r1 = (AnonymousClass6fW) r5.A01;
        if (!r1.A00.isEmpty()) {
            List list = r1.A00;
            return new C135816lI(new AnonymousClass911(this, 0), new AnonymousClass74E(this, 0), list);
        }
        this.A03.A06(AnonymousClass5ZO.A03(this.A00), 83, 2);
        return null;
    }

    public final C135836lK A02() {
        AnonymousClass7HB r2 = (AnonymousClass7HB) AnonymousClass001.A0i(this.A0E, 3);
        if (r2 == null || r2.A00 != 1) {
            return null;
        }
        ArrayList arrayList = ((AnonymousClass5G4) r2.A01).A00;
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C135836lK(new AnonymousClass911(this, 1), new AnonymousClass74E(this, 1), new C171528Hk(this), arrayList);
    }

    public void A05() {
        synchronized (C112315jX.class) {
            C150127Ph r1 = this.A09;
            r1.A04 = null;
            r1.A06 = null;
            r1.A02 = 1;
        }
    }

    public void A06() {
        this.A02.A0G(this.A09);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fd, code lost:
        if (r0 != null) goto L_0x00ff;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07() {
        /*
            r7 = this;
            java.util.Map r5 = r7.A0E
            java.util.Iterator r2 = X.AnonymousClass001.A0v(r5)
        L_0x0006:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r2.next()
            X.7HB r0 = (X.AnonymousClass7HB) r0
            int r1 = r0.A00
            r0 = 2
            if (r1 != r0) goto L_0x0006
            return
        L_0x0018:
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            boolean r0 = r7.A0A()
            if (r0 != 0) goto L_0x0064
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            X.5Up r0 = r7.A0C
            X.1VX r1 = r0.A03
            r0 = 4610(0x1202, float:6.46E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0043
            r0 = 0
            X.6lv r1 = new X.6lv
            r1.<init>(r0)
        L_0x0038:
            r3.add(r1)
        L_0x003b:
            r2.addAll(r3)
            java.lang.Class<X.5jX> r3 = X.C112315jX.class
            monitor-enter(r3)
            goto L_0x015c
        L_0x0043:
            r1 = 16
            X.6lq r0 = new X.6lq
            r0.<init>(r1)
            r3.add(r0)
            X.6lW r0 = new X.6lW
            r0.<init>()
            r3.add(r0)
            X.6lW r0 = new X.6lW
            r0.<init>()
            r3.add(r0)
            r0 = 1
            X.6lo r1 = new X.6lo
            r1.<init>(r0)
            goto L_0x0038
        L_0x0064:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            X.5ZO r0 = r7.A00
            boolean r0 = A00(r0)
            if (r0 != 0) goto L_0x0083
            X.5Up r0 = r7.A0C
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0083
            r3 = 0
            X.8rV r1 = r7.A0A
            X.6lr r0 = new X.6lr
            r0.<init>(r1, r3)
            r4.add(r0)
        L_0x0083:
            r2.addAll(r4)
            X.5Up r0 = r7.A0C
            X.1VX r1 = r0.A03
            r0 = 4610(0x1202, float:6.46E-42)
            boolean r0 = r1.A0X(r0)
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            if (r0 == 0) goto L_0x00e8
            java.util.Iterator r6 = X.C18280x3.A0i(r5)
        L_0x009a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x013d
            java.lang.Object r0 = r6.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            java.lang.Object r1 = X.C18320x8.A0Z(r5, r0)
            X.7HB r1 = (X.AnonymousClass7HB) r1
            if (r3 == 0) goto L_0x00e0
            r0 = 1
            if (r3 == r0) goto L_0x00ca
            r0 = 2
            if (r3 == r0) goto L_0x00c5
            r0 = 3
            if (r3 != r0) goto L_0x009a
            X.6lK r1 = r7.A02()
            if (r1 == 0) goto L_0x009a
        L_0x00c1:
            r4.add(r1)
            goto L_0x009a
        L_0x00c5:
            X.6lI r1 = r7.A01(r1)
            goto L_0x00c1
        L_0x00ca:
            java.lang.Object r1 = r1.A01
            X.6fX r1 = (X.C132546fX) r1
            java.util.List r0 = r1.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00de
            java.util.List r0 = r1.A00
            X.6ld r1 = new X.6ld
            r1.<init>(r7, r0)
            goto L_0x00c1
        L_0x00de:
            r1 = 0
            goto L_0x00c1
        L_0x00e0:
            java.util.List r0 = r7.A03()
            r4.addAll(r0)
            goto L_0x009a
        L_0x00e8:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            r0 = 2
            java.lang.Object r1 = X.AnonymousClass001.A0i(r5, r0)
            X.7HB r1 = (X.AnonymousClass7HB) r1
            if (r1 == 0) goto L_0x0156
            java.lang.Object r0 = r1.A01
            if (r0 == 0) goto L_0x0156
            X.6lI r0 = r7.A01(r1)
            if (r0 == 0) goto L_0x0102
        L_0x00ff:
            r3.add(r0)
        L_0x0102:
            r4.addAll(r3)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            r0 = 1
            java.lang.Object r0 = X.AnonymousClass001.A0i(r5, r0)
            X.7HB r0 = (X.AnonymousClass7HB) r0
            if (r0 == 0) goto L_0x0150
            java.lang.Object r1 = r0.A01
            if (r1 == 0) goto L_0x0150
            X.6fX r1 = (X.C132546fX) r1
            java.util.List r0 = r1.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x012a
            java.util.List r0 = r1.A00
            X.6ld r1 = new X.6ld
            r1.<init>(r7, r0)
        L_0x0127:
            r3.add(r1)
        L_0x012a:
            r4.addAll(r3)
            java.util.List r0 = r7.A03()
            r4.addAll(r0)
            X.6lK r0 = r7.A02()
            if (r0 == 0) goto L_0x013d
            r4.add(r0)
        L_0x013d:
            r2.addAll(r4)
            X.6lS r0 = new X.6lS
            r0.<init>()
            r2.add(r0)
            X.5ZO r0 = r7.A00
            java.util.List r3 = r7.A04(r0)
            goto L_0x003b
        L_0x0150:
            X.6lW r1 = new X.6lW
            r1.<init>()
            goto L_0x0127
        L_0x0156:
            X.6lW r0 = new X.6lW
            r0.<init>()
            goto L_0x00ff
        L_0x015c:
            X.7Ph r1 = r7.A09     // Catch:{ all -> 0x016e }
            r0 = 1
            r1.A02 = r0     // Catch:{ all -> 0x016e }
            java.util.List r0 = r1.A08     // Catch:{ all -> 0x016e }
            r0.clear()     // Catch:{ all -> 0x016e }
            r0.addAll(r2)     // Catch:{ all -> 0x016e }
            r7.A06()     // Catch:{ all -> 0x016e }
            monitor-exit(r3)     // Catch:{ all -> 0x016e }
            return
        L_0x016e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x016e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112315jX.A07():void");
    }

    public final void A09(AnonymousClass7T4 r4, int i, int i2) {
        synchronized (C112315jX.class) {
            C150127Ph r1 = this.A09;
            r1.A02 = 4;
            r1.A00 = i;
            r1.A07 = r4;
            r1.A01 = i2;
            A06();
        }
    }

    public final boolean A0A() {
        Map map = this.A0E;
        if (!map.isEmpty()) {
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                if (((AnonymousClass7HB) A0w.getValue()).A00 != 0 || C18280x3.A06(A0w) == 3) {
                }
            }
            return true;
        }
        return false;
    }

    public void BNv(AnonymousClass7T4 r3, int i) {
        AnonymousClass7HB r1 = (AnonymousClass7HB) AnonymousClass001.A0i(this.A0E, 0);
        if (r1 != null) {
            r1.A00 = 2;
        }
        A09(r3, i, 1);
    }

    public void BNw(AnonymousClass5TI r9) {
        AnonymousClass5T3 r1 = this.A01;
        if (r1 != null) {
            r1.A00 = true;
            this.A01 = null;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(r9.A09);
        AnonymousClass5ZO r2 = this.A00;
        C626936e.A06(r2);
        String str = r9.A02;
        AnonymousClass5T3 r12 = new AnonymousClass5T3(r2, new AnonymousClass8F5(r9, this), r9.A01, str, A0s, 2);
        this.A01 = r12;
        this.A06.A00(r12);
    }

    public void BPw(AnonymousClass5G4 r5) {
        synchronized (C112315jX.class) {
            AnonymousClass7HB r1 = (AnonymousClass7HB) AnonymousClass001.A0i(this.A0E, 3);
            if (r1 != null) {
                r1.A00 = 1;
                r1.A01 = r5;
                if (!r5.A00.isEmpty()) {
                    A08(3);
                }
                if (A0A()) {
                    A07();
                }
            }
        }
    }

    public void BTL(AnonymousClass7T4 r5, int i) {
        Map map = this.A0E;
        AnonymousClass7HB r2 = (AnonymousClass7HB) AnonymousClass001.A0i(map, 1);
        AnonymousClass7HB r0 = (AnonymousClass7HB) AnonymousClass001.A0i(map, 2);
        if (r2 != null) {
            r2.A00 = 2;
        }
        if (r0 != null) {
            r0.A00 = 2;
        }
        A09(r5, i, 0);
    }

    public void BTM(List list) {
        synchronized (C112315jX.class) {
            Map map = this.A0E;
            AnonymousClass7HB r6 = (AnonymousClass7HB) AnonymousClass001.A0i(map, 1);
            AnonymousClass7HB r4 = (AnonymousClass7HB) AnonymousClass001.A0i(map, 2);
            if (list.isEmpty()) {
                C150127Ph r3 = this.A09;
                r3.A02 = 4;
                r3.A00 = 3;
                r3.A01 = 0;
                r3.A07 = new AnonymousClass7T4((Integer) null, (String) null, 7);
                if (r6 != null) {
                    r6.A00 = 2;
                }
                if (r4 != null) {
                    r4.A00 = 2;
                }
                Log.e("HomeWidgetsDelegate/onFetchWidgetsSuccess widgets list cannot be empty");
                A06();
            } else {
                if (r6 != null) {
                    r6.A00 = 1;
                    r6.A01 = list.get(0);
                    A08(1);
                }
                if (r4 != null) {
                    r4.A00 = 1;
                    r4.A01 = list.get(1);
                    A08(2);
                }
                A07();
            }
        }
    }

    public C112315jX(C111525iE r3, C111545iG r4, C186048uf r5, C105705Wb r6, AnonymousClass1VX r7, C105355Up r8, C103805Om r9) {
        this.A0B = r7;
        this.A0C = r8;
        this.A09 = new C150127Ph();
        this.A05 = r5;
        this.A0D = r9;
        C112275jT r52 = (C112275jT) r5;
        r52.A0B = this;
        r52.A0D = this;
        this.A03 = r3;
        this.A04 = r4;
        r52.A0C = this;
        this.A06 = r6;
    }

    public final List A03() {
        Object r3;
        Object obj;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass5ZO r2 = this.A00;
        AnonymousClass4GP r5 = this.A0F;
        A0s.add(new C136126lt(r2, r5, R.string.f11nameremoved));
        if (A00(this.A00)) {
            AnonymousClass7HB r0 = (AnonymousClass7HB) AnonymousClass001.A0i(this.A0E, 0);
            if (r0 == null || (obj = r0.A01) == null) {
                r3 = new C136076lo(false);
            } else {
                AnonymousClass5TI r1 = (AnonymousClass5TI) obj;
                if (r1.A09.isEmpty()) {
                    r3 = new C136066ln(r5);
                } else {
                    r3 = new C136136lu(this.A00, this.A08, r1.A09);
                }
            }
        } else {
            r3 = new C136056lm(this.A07);
        }
        A0s.add(r3);
        return A0s;
    }

    public List A04(AnonymousClass5ZO r4) {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new C135896lQ());
        if (r4 == null || (r4.A07() && !A00(this.A00) && this.A0C.A07())) {
            return A0s;
        }
        A0s.add(new C96294w8(new C109425eb(this, 39)));
        return A0s;
    }
}
