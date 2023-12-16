package X;

import android.content.SharedPreferences;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5jW  reason: invalid class name and case insensitive filesystem */
public class C112305jW implements C184198rP, C184168rM, C184178rN {
    public AnonymousClass5T3 A00;
    public AnonymousClass5T3 A01;
    public List A02;
    public AnonymousClass4GP A03 = new C1896792f(this, 3);
    public boolean A04;
    public final int A05;
    public final AnonymousClass08M A06 = AnonymousClass08M.A01();
    public final AnonymousClass5HK A07;
    public final AnonymousClass5IL A08;
    public final C184178rN A09;
    public final C105705Wb A0A;
    public final AnonymousClass5LW A0B;
    public final C181998nh A0C;
    public final C182008ni A0D;
    public final C182018nj A0E;
    public final C182028nk A0F;
    public final AnonymousClass5WC A0G;
    public final C103545Nk A0H;
    public final AnonymousClass5IN A0I;
    public final C101695Ft A0J;
    public final C105375Ur A0K;
    public final C112225jO A0L;
    public final C185648u1 A0M;
    public final C184258rV A0N;
    public final C105355Up A0O;
    public final String A0P;
    public final AnonymousClass4GP A0Q;
    public final boolean A0R;

    public static final List A00(String str, List list) {
        C162457s7.A0J(list, 0);
        ArrayList A0c = C73783g4.A0c(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C109065e1 A0K2 = AnonymousClass4L0.A0K(it);
            if (C162457s7.A0P(str, A0K2.A03)) {
                A0K2 = C109065e1.A01(A0K2);
                A0K2.A01 = 2;
            }
            A0c.add(A0K2);
        }
        return A0c;
    }

    public void BNq(List list, int i) {
        A0B(2);
        A0A();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        if (r9.A05() == false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C96414wK A01(X.AnonymousClass5ZO r26, java.util.List r27, int r28) {
        /*
            r25 = this;
            r4 = r27
            r3 = r28
            java.lang.Object r9 = r4.get(r3)
            X.5e1 r9 = (X.C109065e1) r9
            boolean r0 = r26.A07()
            if (r0 != 0) goto L_0x0065
            com.google.android.gms.maps.model.LatLng r5 = X.AnonymousClass5ZO.A00(r26)
        L_0x0014:
            int r18 = r28 + 1
            r15 = r25
            X.5LW r0 = r15.A0B
            java.lang.String r2 = r0.A0D
            java.lang.String r1 = r0.A0E
            int r11 = r26.A04()
            boolean r0 = r26.A09()
            if (r0 == 0) goto L_0x002f
            boolean r0 = r9.A05()
            r12 = 1
            if (r0 != 0) goto L_0x0030
        L_0x002f:
            r12 = 0
        L_0x0030:
            boolean r13 = r15.A0R
            X.8FJ r6 = new X.8FJ
            r14 = r6
            r16 = r9
            r19 = r3
            r17 = r4
            r14.<init>(r15, r16, r17, r18, r19)
            r0 = 0
            X.93f r7 = new X.93f
            r7.<init>(r15, r0)
            X.5jf r8 = new X.5jf
            r19 = r8
            r20 = r15
            r21 = r9
            r22 = r2
            r23 = r1
            r24 = r18
            r19.<init>(r20, r21, r22, r23, r24)
            r10 = 11
            X.4wK r4 = new X.4wK
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.8nj r0 = r15.A0E
            java.lang.String r0 = r0.BCg()
            r4.A02 = r0
            return r4
        L_0x0065:
            r5 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112305jW.A01(X.5ZO, java.util.List, int):X.4wK");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r4.A05 == 0) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Integer A02() {
        /*
            r4 = this;
            X.5LW r3 = r4.A0B
            X.5TI r0 = r3.A05
            if (r0 != 0) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            X.8nh r0 = r4.A0C
            boolean r0 = r0.BII()
            if (r0 == 0) goto L_0x0026
            boolean r0 = r3.A0H
            if (r0 == 0) goto L_0x0021
            X.5TI r0 = r3.A05
            java.util.List r0 = r0.A09
            int r0 = r0.size()
        L_0x001c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x0021:
            int r0 = r4.A05
            r2 = 5
            if (r0 != 0) goto L_0x0028
        L_0x0026:
            r2 = 14
        L_0x0028:
            int r0 = r3.A00
            int r1 = r0 + 1
            int r1 = r1 * r2
            X.5TI r0 = r3.A05
            java.util.List r0 = r0.A09
            int r0 = X.C86654Ky.A06(r0, r1)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112305jW.A02():java.lang.Integer");
    }

    public void A04() {
        C186048uf r0 = this.A0H.A00;
        r0.AyZ();
        C112275jT r02 = (C112275jT) r0;
        r02.A09 = null;
        r02.A0A = null;
        ((C112275jT) this.A0I.A00).A0A = null;
    }

    public void A05() {
        if (this.A0C.BII()) {
            AnonymousClass5LW r1 = this.A0B;
            if (!r1.A0H) {
                r1.A03 = 9;
                A06();
            }
        }
        AnonymousClass5LW r12 = this.A0B;
        r12.A03 = 7;
        r12.A00++;
        if (this.A05 == 1) {
            AnonymousClass1VX r13 = this.A0O.A03;
            if (C86634Kw.A1a(r13) && r13.A0X(4844)) {
                A09();
            }
        }
        A06();
    }

    public void A06() {
        C112225jO r0 = this.A0L;
        if (r0 == null || r0.A0A()) {
            this.A06.A0H(this.A0B);
        }
    }

    public void A07() {
        AnonymousClass5LW r3 = this.A0B;
        List list = r3.A0J;
        if (!list.isEmpty()) {
            int A032 = AnonymousClass002.A03(list);
            if (list.get(A032) instanceof C136146lv) {
                list.remove(A032);
                r3.A03 = 2;
                A06();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09() {
        /*
            r10 = this;
            X.5Nk r3 = r10.A0H
            java.util.concurrent.atomic.AtomicInteger r6 = r3.A03
            int r5 = r6.get()
            r4 = 14
            X.5LW r2 = r10.A0B
            X.5TI r0 = r2.A05
            if (r0 == 0) goto L_0x004c
            java.util.List r1 = r0.A09
            int r0 = r1.size()
            if (r5 >= r0) goto L_0x004c
            int r4 = r4 + r5
            int r0 = X.C86654Ky.A06(r1, r4)
            java.util.List r1 = r1.subList(r5, r0)
        L_0x0021:
            java.lang.String r7 = r2.A0F
            boolean r0 = X.AnonymousClass0x7.A1T(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x007b
            int r0 = r1.size()
            r6.addAndGet(r0)
            X.8uf r2 = r3.A00
            java.util.ArrayList r8 = X.C73783g4.A0c(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x003c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0051
            X.5e1 r0 = X.AnonymousClass4L0.A0K(r1)
            java.lang.String r0 = r0.A0E
            r8.add(r0)
            goto L_0x003c
        L_0x004c:
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x0021
        L_0x0051:
            java.util.List r0 = r3.A02
            java.util.ArrayList r9 = X.C86624Kv.A0d(r0)
            java.lang.String r1 = "full_details"
            X.6fa r0 = new X.6fa
            r0.<init>(r1)
            r9.add(r0)
            X.5jT r2 = (X.C112275jT) r2
            X.64Y r3 = r2.A0N
            X.5GG r0 = r2.A0T
            X.2xN r5 = r0.A00
            r6 = 0
            X.8Gs r4 = new X.8Gs
            r4.<init>(r2, r8)
            X.4i0 r1 = r3.B0E(r4, r5, r6, r7, r8, r9)
            r1.A08()
            java.util.Set r0 = r2.A0W
            r0.add(r1)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112305jW.A09():void");
    }

    public final void A0A() {
        AnonymousClass5TI r1;
        Object r6;
        AnonymousClass5LW r3 = this.A0B;
        List list = r3.A0J;
        list.clear();
        C182008ni r4 = this.A0D;
        AnonymousClass5ZO BCV = r4.BCV();
        if (BCV != null && (r1 = r3.A05) != null) {
            if (this.A05 == 0) {
                C136186lz A042 = this.A0K.A04(this.A0M, r1.A08);
                if (A042 != null) {
                    list.add(A042);
                }
                List list2 = r3.A05.A06;
                A0C(BCV, list2, Math.min(2, list2.size()));
                if (list2.size() >= 2) {
                    list.add(new C135906lR());
                    list.add(new AnonymousClass6lZ(new C109425eb(this, 38)));
                }
                if (!r3.A05.A09.isEmpty()) {
                    list.add(new C136126lt(BCV, this.A0Q, R.string.f11nameremoved));
                }
            }
            int i = r3.A02;
            if (r3.A0I) {
                if (i != 3) {
                    r6 = new C136026lj();
                } else if (!(r3.A05 == null || r4.BCV() == null)) {
                    r6 = new C96384wH(r3.A05.A00.A00, r4.BCV(), r3.A0G, this.A03, new AnonymousClass8PD(this));
                }
                list.add(r6);
            }
            AnonymousClass5TI r7 = r3.A05;
            int i2 = r3.A02;
            boolean z = true;
            if (i2 == 1 || i2 == 3) {
                List list3 = r7.A09;
                for (int i3 = 0; i3 < list3.size(); i3++) {
                    list.add(A01(BCV, list3, i3));
                    list.add(new C135906lR());
                }
                if (!list.isEmpty()) {
                    list.remove(AnonymousClass002.A04(list, 1));
                }
            } else {
                if (i2 == 2) {
                    z = false;
                }
                list.add(new C96314wA(false, z));
            }
            if (r3.A0H) {
                list.addAll(A03());
            } else {
                list.add(new C136146lv(0));
            }
            r3.A03 = 2;
            A06();
        }
    }

    public final void A0B(int i) {
        AnonymousClass5LW r1 = this.A0B;
        int i2 = r1.A02;
        if (!(i2 == 0 || i2 == i)) {
            i = 3;
        }
        r1.A02 = i;
    }

    public final void A0D(AnonymousClass5TI r5) {
        String str;
        String str2;
        int i = this.A05;
        if (i == 1) {
            AnonymousClass1VX r1 = this.A0O.A03;
            if (C86634Kw.A1a(r1) && r1.A0X(4844)) {
                A09();
                return;
            }
        }
        if (this.A0O.A03() && (str = r5.A05) != null && !str.isEmpty() && !r5.A09.isEmpty()) {
            if (i == 0) {
                str2 = this.A0B.A0F;
            } else {
                str2 = null;
            }
            this.A0H.A00(str, str2);
        }
    }

    public void A0E(String str) {
        AnonymousClass5LW r5 = this.A0B;
        r5.A05 = null;
        r5.A0H = false;
        r5.A00 = 0;
        r5.A0F = str;
        r5.A04 = new AnonymousClass7H6(150, (String) null);
        r5.A03 = 0;
        r5.A0J.clear();
        AnonymousClass5WC r2 = this.A0G;
        AnonymousClass5T3 r1 = r2.A00;
        if (r1 != null) {
            r1.A00 = true;
            r2.A00 = null;
        }
        r2.A04.clear();
        r2.A01.clear();
        this.A02 = null;
        r5.A08 = null;
        AnonymousClass5T3 r12 = this.A00;
        if (r12 != null) {
            r12.A00 = true;
            this.A00 = null;
        }
        AnonymousClass5T3 r13 = this.A01;
        if (r13 != null) {
            r13.A00 = true;
            this.A01 = null;
        }
        this.A0H.A03.set(0);
        A06();
    }

    public void BMD(int i, String str) {
        if (this.A0C.BII()) {
            AnonymousClass5LW r4 = this.A0B;
            if (r4.A05 != null) {
                AnonymousClass5WC r3 = this.A0G;
                List list = r3.A04;
                List A002 = A00(str, list);
                list.clear();
                list.addAll(A002);
                List A003 = A00(str, r3.A01);
                r3.A01.clear();
                r3.A01.addAll(A003);
                List list2 = r4.A05.A09;
                list2.clear();
                list2.addAll(list);
                A0A();
                return;
            }
            return;
        }
        AnonymousClass5LW r2 = this.A0B;
        AnonymousClass5TI r0 = r2.A05;
        if (r0 != null) {
            List A004 = A00(str, r0.A09);
            List list3 = r2.A05.A09;
            list3.clear();
            list3.addAll(A004);
            r2.A0J.clear();
            A08();
        }
    }

    public void BME(Map map) {
        if (this.A0C.BII()) {
            AnonymousClass5LW r3 = this.A0B;
            if (r3.A05 != null) {
                AnonymousClass5WC r2 = this.A0G;
                List list = r2.A04;
                List A002 = AnonymousClass5WC.A00(list, map);
                list.clear();
                list.addAll(A002);
                r2.A01 = AnonymousClass5WC.A00(r2.A01, map);
                List list2 = r3.A05.A09;
                list2.clear();
                list2.addAll(A002);
                A0A();
                return;
            }
            return;
        }
        AnonymousClass5LW r7 = this.A0B;
        AnonymousClass5TI r0 = r7.A05;
        if (r0 != null) {
            List list3 = r0.A09;
            C162457s7.A0J(map, 1);
            ArrayList A0c = C73783g4.A0c(list3);
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                C109065e1 A0K2 = AnonymousClass4L0.A0K(it);
                if (A0K2.A01 != 1) {
                    AnonymousClass7ZB r02 = (AnonymousClass7ZB) map.get(A0K2.A0F);
                    if (r02 != null) {
                        List list4 = r02.A02;
                        List list5 = r02.A03;
                        String str = r02.A01;
                        A0K2 = C109065e1.A01(A0K2);
                        A0K2.A06 = list4;
                        A0K2.A05 = list5;
                        A0K2.A04 = str;
                        A0K2.A01 = 1;
                    }
                    C162457s7.A0H(A0K2);
                }
                A0c.add(A0K2);
            }
            List list6 = r7.A05.A09;
            list6.clear();
            list6.addAll(A0c);
            r7.A0J.clear();
            A08();
        }
    }

    public void BNr(Map map) {
        AnonymousClass5LW r4 = this.A0B;
        ArrayList A0J2 = AnonymousClass002.A0J(r4.A0G);
        Map map2 = map;
        C162457s7.A0J(map2, 1);
        ArrayList A0c = C73783g4.A0c(A0J2);
        Iterator it = A0J2.iterator();
        while (it.hasNext()) {
            C109075e2 r10 = (C109075e2) it.next();
            C109055e0 r12 = r10.A0B;
            if (r12.A03 == null) {
                String str = r12.A0A;
                C109065e1 r13 = (C109065e1) map2.get(str);
                if (r13 != null) {
                    double d = r12.A07;
                    double d2 = r12.A08;
                    boolean z = r12.A0B;
                    double d3 = r12.A06;
                    double d4 = d;
                    C91824lC r19 = r12.A09;
                    String str2 = str;
                    C109065e1 r18 = r13;
                    C109055e0 r17 = new C109055e0(r18, r19, str2, d4, d2, d3, z);
                    r17.A00 = r12.A00;
                    r17.A01 = r12.A01;
                    r17.A02 = r12.A02;
                    r17.A04 = r12.A04;
                    r17.A05 = r12.A05;
                    C109075e2 r1 = new C109075e2(r17, r10.A06, r10.A05, r10.A09);
                    r1.A07 = r10.A07;
                    r1.A08 = r10.A08;
                    r1.A02 = r10.A02;
                    r1.A01 = r10.A01;
                    r1.A00 = r10.A00;
                    r1.A0A = r10.A0A;
                    r1.A04 = r10.A04;
                    r1.A03 = r10.A03;
                    r10 = r1;
                }
            }
            A0c.add(r10);
        }
        r4.A0G = C86624Kv.A0d(C86654Ky.A0q(A0c, 25));
        A0B(2);
        A0A();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0105, code lost:
        if (r0.A09.isEmpty() != false) goto L_0x0107;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BNw(X.AnonymousClass5TI r21) {
        /*
            r20 = this;
            r1 = r20
            X.5LW r2 = r1.A0B
            X.5TI r0 = r2.A05
            if (r0 != 0) goto L_0x000f
            X.5Nk r0 = r1.A0H
            X.8uf r0 = r0.A00
            r0.AyZ()
        L_0x000f:
            X.5TI r3 = r2.A05
            r0 = r21
            if (r3 == 0) goto L_0x0022
            java.lang.String r4 = r3.A03
            if (r4 == 0) goto L_0x0022
            java.lang.String r3 = r0.A03
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0022
            return
        L_0x0022:
            boolean r3 = r1.A04
            if (r3 == 0) goto L_0x003c
            X.8ni r3 = r1.A0D
            X.5ZO r4 = r3.BCV()
            java.util.List r3 = r0.A06
            int r0 = r3.size()
            r1.A0C(r4, r3, r0)
            r0 = 2
        L_0x0036:
            r2.A03 = r0
            r1.A06()
            return
        L_0x003c:
            int r7 = r1.A05
            r3 = 1
            if (r7 == r3) goto L_0x0044
            r3 = 2
            if (r7 != r3) goto L_0x0094
        L_0x0044:
            X.7jr r4 = r0.A00
            X.5dr r3 = r4.A00
            if (r3 == 0) goto L_0x0094
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()
            java.util.List r3 = r4.A01
            r13.add(r3)
            r5 = 0
            java.lang.Object r3 = r13.get(r5)
            java.util.List r3 = (java.util.List) r3
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ 1
            r2.A0I = r3
            X.7Oa r4 = new X.7Oa
            r4.<init>()
            r2.A06 = r4
            java.lang.Object r3 = r13.get(r5)
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.size()
            r4.A01 = r3
            X.8ni r3 = r1.A0D
            X.5ZO r9 = r3.BCV()
            X.C626936e.A06(r9)
            java.lang.String r12 = r0.A02
            r14 = 2
            java.lang.Double r11 = r0.A01
            X.5jP r10 = new X.5jP
            r10.<init>(r0, r1)
            X.5T3 r8 = new X.5T3
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r1.A01 = r8
            X.5Wb r3 = r1.A0A
            r3.A00(r8)
        L_0x0094:
            X.8ni r8 = r1.A0D
            X.5ZO r3 = r8.BCV()
            if (r3 == 0) goto L_0x00e5
            X.5ZO r3 = r8.BCV()
            boolean r3 = r3.A0A()
            if (r3 == 0) goto L_0x00e5
            java.util.List r3 = r0.A09
            X.5ZO r11 = r8.BCV()
            java.util.ListIterator r10 = r3.listIterator()
        L_0x00b0:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x00e5
            java.lang.Object r4 = r10.next()
            X.5e1 r4 = (X.C109065e1) r4
            boolean r3 = r4.A06()
            if (r3 == 0) goto L_0x00b0
            java.util.List r3 = r4.A0K
            java.lang.Object r9 = X.C18290x4.A0k(r3)
            X.5dW r9 = (X.C108765dW) r9
            double r5 = r9.A00
            double r3 = r9.A01
            com.google.android.gms.maps.model.LatLng r4 = X.AnonymousClass4L0.A0H(r5, r3)
            com.google.android.gms.maps.model.LatLng r3 = X.AnonymousClass5ZO.A00(r11)
            float r4 = X.AnonymousClass5ZZ.A01(r4, r3)
            int r3 = r9.A02
            float r3 = (float) r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b0
            r10.remove()
            goto L_0x00b0
        L_0x00e5:
            X.8nh r3 = r1.A0C
            boolean r3 = r3.BII()
            if (r3 == 0) goto L_0x01da
            java.lang.String r12 = r0.A03
            r4 = 150(0x96, float:2.1E-43)
            X.7H6 r3 = new X.7H6
            r3.<init>(r4, r12)
            r2.A04 = r3
            boolean r3 = android.text.TextUtils.isEmpty(r12)
            if (r3 != 0) goto L_0x0107
            java.util.List r3 = r0.A09
            boolean r4 = r3.isEmpty()
            r3 = 0
            if (r4 == 0) goto L_0x0108
        L_0x0107:
            r3 = 1
        L_0x0108:
            r2.A0H = r3
            X.5TI r3 = r2.A05
            if (r3 != 0) goto L_0x0149
            r9 = r0
        L_0x010f:
            r2.A05 = r9
            X.5Ur r3 = r1.A0K
            boolean r3 = r3.A02
            if (r3 == 0) goto L_0x0186
            java.util.List r11 = r1.A02
            if (r11 != 0) goto L_0x0121
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            r1.A02 = r11
        L_0x0121:
            X.5Ft r10 = r1.A0J
            java.util.List r0 = r0.A09
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()
            java.util.Iterator r13 = r0.iterator()
        L_0x012d:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0169
            X.5e1 r9 = X.AnonymousClass4L0.A0K(r13)
            double r3 = r9.A00
            double r5 = r10.A00
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x012d
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x012d
            r12.add(r9)
            goto L_0x012d
        L_0x0149:
            java.util.List r6 = r3.A06
            X.7jr r10 = r3.A00
            java.util.List r5 = r0.A07
            java.util.List r4 = r0.A09
            java.util.List r3 = r0.A08
            java.lang.String r13 = r0.A05
            java.lang.Double r11 = r0.A01
            java.lang.String r14 = r0.A04
            java.lang.String r15 = r0.A02
            X.5TI r9 = new X.5TI
            r17 = r6
            r18 = r4
            r19 = r3
            r16 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x010f
        L_0x0169:
            r11.addAll(r12)
            java.util.List r0 = r1.A02
            int r3 = r0.size()
            X.5WC r0 = r1.A0G
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            int r3 = r3 + r0
            r0 = 5
            if (r3 >= r0) goto L_0x0189
            boolean r0 = r2.A0H
            if (r0 != 0) goto L_0x0189
            r0 = 10
            goto L_0x0036
        L_0x0186:
            java.util.List r4 = r0.A09
            goto L_0x018b
        L_0x0189:
            java.util.List r4 = r1.A02
        L_0x018b:
            X.5TI r0 = r2.A05
            X.5WC r13 = r1.A0G
            X.5ZO r5 = r8.BCV()
            X.C626936e.A06(r5)
            java.lang.String r8 = r0.A02
            boolean r3 = r2.A0H
            r10 = 2
            if (r7 != 0) goto L_0x019e
            r10 = 1
        L_0x019e:
            X.7H9 r12 = new X.7H9
            r12.<init>(r0, r1)
            java.lang.Double r7 = r0.A01
            java.util.List r0 = r13.A01
            java.util.ArrayList r14 = X.AnonymousClass002.A0J(r0)
            r14.addAll(r4)
            java.util.List r0 = r13.A01
            r0.addAll(r4)
            X.5T3 r2 = r13.A00
            if (r2 == 0) goto L_0x01bd
            r0 = 1
            r2.A00 = r0
            r0 = 0
            r13.A00 = r0
        L_0x01bd:
            java.util.ArrayList r9 = X.C18300x5.A0s(r14)
            X.5jS r6 = new X.5jS
            r11 = r6
            r15 = r10
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            X.5T3 r4 = new X.5T3
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r13.A00 = r4
            X.5Wb r0 = r13.A02
            r0.A00(r4)
            r0 = 0
            r1.A02 = r0
            return
        L_0x01da:
            java.util.List r2 = r0.A09
            java.util.ArrayList r2 = X.AnonymousClass002.A0J(r2)
            java.util.ArrayList r9 = X.C18300x5.A0s(r2)
            X.5ZO r5 = r8.BCV()
            X.C626936e.A06(r5)
            java.lang.String r8 = r0.A02
            r10 = 2
            if (r7 != 0) goto L_0x01f1
            r10 = 1
        L_0x01f1:
            java.lang.Double r7 = r0.A01
            X.8F6 r6 = new X.8F6
            r6.<init>(r0, r1, r2)
            X.5T3 r4 = new X.5T3
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r1.A00 = r4
            X.5Wb r0 = r1.A0A
            r0.A00(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112305jW.BNw(X.5TI):void");
    }

    public final List A03() {
        Object r1;
        ArrayList A0s = AnonymousClass001.A0s();
        if (this.A05 != 0) {
            C182008ni r12 = this.A0D;
            if (r12.BCV() != null && r12.BCV().A07() && !this.A0O.A07()) {
                r1 = new C136106lr(this.A0N, this.A0E.BCg());
                A0s.add(r1);
                return A0s;
            }
        }
        r1 = new C136166lx((String) null);
        A0s.add(r1);
        return A0s;
    }

    public final void A08() {
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass5ZO BCV = this.A0D.BCV();
        if (BCV != null) {
            AnonymousClass5LW r3 = this.A0B;
            C626936e.A07(r3.A05, "BusinessListItemDelegate/addNextBusinessProfilesPage Current search results cannot be null");
            List list = r3.A05.A09;
            int size = list.size();
            int i = this.A05;
            boolean A072 = BCV.A07();
            if (i == 0) {
                if (A072 && this.A0O.A07()) {
                    r3.A0J.add(new C136106lr(this.A0N, this.A0E.BCg()));
                }
                C136186lz A042 = this.A0K.A04(this.A0M, r3.A05.A08);
                if (A042 != null) {
                    r3.A0J.add(A042);
                }
                List list2 = r3.A05.A06;
                A0C(BCV, list2, Math.min(2, list2.size()));
                if (!r3.A05.A09.isEmpty()) {
                    r3.A0J.add(new C136126lt(BCV, this.A0Q, R.string.f11nameremoved));
                }
            } else if (A072 && this.A0O.A07()) {
                A0s.add(new C136126lt(BCV, this.A0Q, R.string.f11nameremoved));
            }
            for (int i2 = 0; i2 < size; i2++) {
                A0s.add(A01(BCV, list, i2));
                A0s.add(new C135906lR());
            }
            A0s.remove(A0s.size() - 1);
            List list3 = r3.A0J;
            list3.addAll(A0s);
            list3.addAll(A03());
            r3.A0H = true;
            r3.A03 = 2;
            A06();
        }
    }

    public final void A0C(AnonymousClass5ZO r4, List list, int i) {
        if (!list.isEmpty()) {
            List list2 = this.A0B.A0J;
            list2.add(new C136176ly(2));
            for (int i2 = 0; i2 < i; i2++) {
                list2.add(A01(r4, list, i2));
            }
        }
    }

    public void BNv(AnonymousClass7T4 r3, int i) {
        A07();
        AnonymousClass5LW r1 = this.A0B;
        r1.A01 = i;
        r1.A03 = 8;
        A06();
    }

    public C112305jW(AnonymousClass5HK r13, AnonymousClass5IL r14, C105705Wb r15, C181998nh r16, C182008ni r17, C182018nj r18, C182028nk r19, AnonymousClass5WC r20, C103545Nk r21, AnonymousClass5IN r22, C101695Ft r23, C105375Ur r24, C112225jO r25, C185648u1 r26, C184258rV r27, C105355Up r28, int i) {
        SharedPreferences.Editor putInt;
        C112295jV r1 = new C112295jV(this);
        this.A09 = r1;
        this.A05 = i;
        C105355Up r5 = r28;
        this.A0O = r5;
        this.A0K = r24;
        this.A0L = r25;
        this.A0D = r17;
        this.A08 = r14;
        this.A0J = r23;
        this.A0E = r18;
        this.A0C = r16;
        AnonymousClass5IN r2 = r22;
        this.A0I = r2;
        this.A0F = r19;
        this.A0G = r20;
        C103545Nk r3 = r21;
        this.A0H = r3;
        this.A0M = r26;
        C184258rV r6 = r27;
        this.A0N = r6;
        this.A07 = r13;
        ((C112275jT) r2.A00).A0A = this;
        this.A0B = new AnonymousClass5LW();
        C112275jT r0 = (C112275jT) r3.A00;
        r0.A09 = this;
        r0.A0A = r1;
        this.A0A = r15;
        C96204vy r10 = r14.A02;
        String A0Z = C18280x3.A0Z(r10.A01(), "pref_saved_search_session_id");
        if (!(A0Z == null || A0Z.length() == 0)) {
            long j = r10.A01().getLong("pref_saved_search_session_ts", 0);
            if (j != 0 && AnonymousClass0x9.A05(j) < 1800000) {
                putInt = AnonymousClass5NA.A00(r10).putLong("pref_saved_search_session_ts", System.currentTimeMillis());
                putInt.apply();
                this.A0P = A0Z;
                this.A0R = r5.A03();
                this.A0Q = new C1896792f(r6, 2);
            }
        }
        A0Z = C86604Kt.A0k();
        C18270x1.A0j(AnonymousClass5NA.A00(r10), "pref_saved_search_session_id", A0Z);
        C18270x1.A0i(AnonymousClass5NA.A00(r10), "pref_saved_search_session_ts", System.currentTimeMillis());
        putInt = AnonymousClass5NA.A00(r10).putInt("pref_saved_search_session_action_order", 0);
        putInt.apply();
        this.A0P = A0Z;
        this.A0R = r5.A03();
        this.A0Q = new C1896792f(r6, 2);
    }
}
