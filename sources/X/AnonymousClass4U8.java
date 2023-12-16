package X;

import android.os.Build;
import android.os.Bundle;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4U8  reason: invalid class name */
public final class AnonymousClass4U8 extends AnonymousClass08N implements C185648u1, C184158rL, C184178rN {
    public int A00;
    public Bundle A01;
    public AnonymousClass08M A02;
    public C166477yk A03;
    public C108965dr A04;
    public AnonymousClass5ZO A05;
    public AnonymousClass5T3 A06;
    public C109075e2 A07;
    public AnonymousClass5UT A08;
    public String A09;
    public ArrayList A0A;
    public HashSet A0B;
    public List A0C;
    public boolean A0D;
    public final C06270Wx A0E;
    public final AnonymousClass08J A0F;
    public final AnonymousClass08J A0G;
    public final AnonymousClass08M A0H;
    public final AnonymousClass0XV A0I;
    public final C69263Wi A0J;
    public final C111545iG A0K;
    public final AnonymousClass5QV A0L;
    public final C186048uf A0M;
    public final C105085Tn A0N;
    public final C105705Wb A0O;
    public final C1223764d A0P;
    public final C112305jW A0Q;
    public final C182038nl A0R;
    public final C105375Ur A0S;
    public final C166447yh A0T;
    public final C54292oU A0U;
    public final AnonymousClass5ZR A0V;
    public final C620733j A0W;
    public final C105355Up A0X;
    public final AnonymousClass4UC A0Y;
    public final AnonymousClass4UC A0Z;
    public final AnonymousClass4UC A0a;
    public final AnonymousClass4UC A0b;
    public final AnonymousClass4FS A0c;
    public final List A0d;

    public final void A0G() {
        String str;
        this.A07 = null;
        this.A08.A01();
        C06270Wx.A03(this.A0b, 12);
        C112305jW r0 = this.A0Q;
        r0.A0E((String) null);
        AnonymousClass5LW r2 = r0.A0B;
        r2.A0I = false;
        r2.A0G = AnonymousClass001.A0s();
        r2.A02 = 0;
        r2.A03 = 9;
        AnonymousClass08J r1 = this.A0G;
        C105375Ur r22 = this.A0S;
        r1.A0H(r22.A03(this, 77));
        C186048uf r12 = this.A0M;
        C166447yh r6 = this.A0T;
        AnonymousClass5ZO r5 = this.A05;
        if (r22.A0B()) {
            str = "all_descendents";
        } else {
            str = "current";
        }
        C150967Sx A012 = r22.A01();
        AnonymousClass7H6 r3 = new AnonymousClass7H6(150, (String) null);
        C112275jT r13 = (C112275jT) r12;
        r13.A00();
        C114425n1 r7 = new C114425n1(r5, r13, (Jid) null);
        r13.A04 = r7;
        C90694i3 B0D = r13.A0J.B0D(r3, A012, r5, r6, r7, r13.A0T.A00, (AnonymousClass5ZI) null, "all_descendents", str, (String) null, "map_view_serp");
        B0D.A08();
        r13.A00 = B0D;
        C06270Wx.A03(this.A02, 2);
    }

    public void BNq(List list, int i) {
        this.A00 = 3;
    }

    public void BNr(Map map) {
        AnonymousClass3Z6 r0;
        C109075e2 r02;
        C162457s7.A0J(map, 0);
        Iterator it = this.A0A.iterator();
        while (it.hasNext()) {
            C109055e0 r1 = ((C109075e2) it.next()).A0B;
            C109065e1 r03 = (C109065e1) map.get(r1.A0A);
            if (r03 != null) {
                r1.A03 = r03;
            }
        }
        List list = this.A0C;
        if (!(list == null || (r0 = this.A08.A06) == null || (r02 = (C109075e2) r0.first) == null)) {
            A0J(r02, list);
        }
        this.A08.A02();
        this.A00 = 2;
    }

    public void BUV(AnonymousClass5ZO r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
        A0G();
    }

    public void A0C() {
        AnonymousClass5T3 r1 = this.A06;
        if (r1 != null) {
            r1.A00 = true;
        }
        this.A08.A01();
        this.A0Q.A04();
        C112275jT r12 = (C112275jT) this.A0M;
        r12.A0A = null;
        r12.A0C = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r10.A05() == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C90744iF A0D(X.C109075e2 r9, X.C109065e1 r10, int r11) {
        /*
            r8 = this;
            X.8FI r3 = new X.8FI
            r3.<init>(r8, r11)
            X.5ZO r0 = r8.A05
            int r6 = r0.A04()
            boolean r0 = r0.A09()
            r5 = r10
            if (r0 == 0) goto L_0x0019
            boolean r0 = r10.A05()
            r7 = 1
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r7 = 0
        L_0x001a:
            X.5ZO r0 = r8.A05
            java.lang.Double r0 = r0.A04
            X.C162457s7.A0H(r0)
            double r0 = r0.doubleValue()
            X.5ZO r2 = r8.A05
            java.lang.Double r2 = r2.A05
            X.C162457s7.A0H(r2)
            com.google.android.gms.maps.model.LatLng r2 = X.C86624Kv.A0H(r2, r0)
            r0 = 2
            X.7mG r4 = new X.7mG
            r4.<init>(r0)
            X.4iF r1 = new X.4iF
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r1.A00 = r9
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4U8.A0D(X.5e2, X.5e1, int):X.4iF");
    }

    public final Set A0E() {
        ArrayList arrayList = this.A0A;
        if (arrayList.isEmpty()) {
            return C72063d7.A00;
        }
        if (arrayList.size() > 1) {
            C73753g1.A0a(arrayList, new AnonymousClass91S(29));
        }
        float f = ((C109075e2) AnonymousClass0x9.A0t(arrayList)).A06;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            C109075e2 r1 = (C109075e2) next;
            if (i >= 30 && r1.A06 != f) {
                break;
            }
            i++;
            A0s.add(next);
        }
        return C73723fy.A0P(A0s);
    }

    public final void A0F() {
        AnonymousClass4Zh r0;
        AnonymousClass5UT r1 = this.A08;
        AnonymousClass3Z6 r02 = r1.A06;
        if (!(r02 == null || (r0 = (AnonymousClass4Zh) r02.second) == null)) {
            r0.A0D();
        }
        r1.A06 = null;
        C06270Wx.A03(this.A0b, 12);
    }

    public final void A0H() {
        int i = this.A00;
        if (i == 0 || i == 3) {
            C186048uf r3 = this.A0M;
            ArrayList arrayList = this.A0A;
            ArrayList A0c2 = C73783g4.A0c(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                A0c2.add(((C109075e2) it.next()).A0B.A0A);
            }
            r3.B34((String) null, A0c2, this.A0d);
            this.A00 = 1;
        }
    }

    public final void A0I(C109075e2 r14, AnonymousClass4Zh r15, Integer num) {
        int i = 67;
        if (r15.A00 == 1) {
            i = 66;
        }
        C111545iG r6 = this.A0K;
        C109055e0 r0 = r14.A0B;
        int i2 = r0.A01;
        boolean z = r14.A0A;
        int i3 = r0.A02;
        float f = this.A08.A08.A02().A02;
        boolean z2 = r14.A09;
        Integer A032 = AnonymousClass5ZO.A03(this.A05);
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put("ranked_position", Integer.valueOf(i2));
        A0r.put("has_title", Boolean.valueOf(z));
        A0r.put("is_selected", Boolean.valueOf(z2));
        A0r.put("zoom_level", Float.valueOf(f));
        A0r.put("segment_index", Integer.valueOf(i3));
        r6.A09(A032, num, A0r, 11, i, 1);
    }

    public final void A0K(boolean z) {
        AnonymousClass4UC r1;
        int A012;
        if (Build.VERSION.SDK_INT >= 31) {
            AnonymousClass5ZR r12 = this.A0V;
            if (r12.A05() && r12.A02("android.permission.ACCESS_FINE_LOCATION") != 0) {
                r1 = this.A0b;
                A012 = 8;
                C06270Wx.A03(r1, A012);
            }
        }
        r1 = this.A0b;
        A012 = C86654Ky.A01(z ? 1 : 0);
        C06270Wx.A03(r1, A012);
    }

    public void BOb() {
        AnonymousClass7HE A022 = this.A0S.A02();
        if (A022 != null) {
            this.A0a.A0G(A022);
        }
    }

    public void BOy() {
        this.A0S.A07();
        this.A0K.A04((Boolean) null, this.A0N.A03(), (String) null, 76);
        A0G();
    }

    public void BRP(boolean z) {
        this.A0S.A02 = z;
        A0G();
    }

    public void BUG(boolean z) {
        this.A0S.A03 = z;
        this.A0K.A04(Boolean.valueOf(z), this.A0N.A03(), (String) null, 77);
        A0G();
    }

    public void BUU(AnonymousClass7T4 r1, int i) {
    }

    public void BXM(boolean z) {
        this.A0S.A04 = z;
        this.A0K.A04(Boolean.valueOf(z), this.A0N.A03(), (String) null, 74);
        A0G();
    }

    public final void A0J(C109075e2 r12, List list) {
        Object A0D2;
        Object A0D3;
        ArrayList A0c2 = C73783g4.A0c(list);
        int i = -1;
        int i2 = 0;
        for (Object next : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                throw C18280x3.A0X();
            }
            C109075e2 r5 = (C109075e2) next;
            C109055e0 r0 = r5.A0B;
            C109065e1 r2 = r0.A03;
            if (r2 == null) {
                A0D3 = new C136046ll(r5);
            } else {
                if (C162457s7.A0P(r0.A0A, r12.A0B.A0A)) {
                    i = i2;
                }
                A0D3 = A0D(r5, r2, i2);
            }
            A0c2.add(A0D3);
            i2 = i3;
        }
        ArrayList A0J2 = AnonymousClass002.A0J(A0c2);
        if (i == -1 || !AnonymousClass0x7.A1S(A0J2)) {
            C109065e1 r02 = r12.A0B.A03;
            if (r02 != null) {
                A0D2 = A0D(r12, r02, 0);
            }
            this.A0K.A06(AnonymousClass5ZO.A03(this.A05), 1, A0J2.size(), AnonymousClass000.A1W(r12.A0B.A03));
            this.A0H.A0G(A0J2);
        }
        A0D2 = A0J2.remove(i);
        A0J2.add(0, A0D2);
        this.A0K.A06(AnonymousClass5ZO.A03(this.A05), 1, A0J2.size(), AnonymousClass000.A1W(r12.A0B.A03));
        this.A0H.A0G(A0J2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4U8(android.app.Application r36, android.os.Bundle r37, X.AnonymousClass0XV r38, X.AnonymousClass5MD r39, X.C69263Wi r40, X.C111525iE r41, X.C111545iG r42, X.C108965dr r43, X.AnonymousClass5ZO r44, X.C186048uf r45, X.C105085Tn r46, X.C105705Wb r47, X.C1223764d r48, X.C182038nl r49, X.AnonymousClass5UT r50, X.C166447yh r51, X.C54292oU r52, X.AnonymousClass5ZR r53, X.C620733j r54, X.C105355Up r55, X.AnonymousClass8E9 r56, X.AnonymousClass4FS r57, java.lang.String r58, java.util.ArrayList r59) {
        /*
            r35 = this;
            r8 = r45
            r7 = 1
            r13 = r40
            r0 = r57
            int r16 = X.C18300x5.A05(r13, r0, r7)
            r6 = 3
            r9 = r52
            X.C162457s7.A0J(r9, r6)
            r5 = 4
            r3 = r54
            r14 = r36
            X.AnonymousClass0x2.A1A(r14, r5, r3)
            r32 = 11
            r2 = 13
            r17 = r55
            r1 = r17
            X.C162457s7.A0J(r1, r2)
            r1 = 14
            r4 = r53
            X.C162457s7.A0J(r4, r1)
            r1 = 16
            r10 = r49
            X.C162457s7.A0J(r10, r1)
            r2 = 17
            r33 = r46
            r1 = r33
            X.C162457s7.A0J(r1, r2)
            r18 = r48
            r11 = r47
            r34 = r42
            r2 = r18
            r1 = r34
            X.C18290x4.A1N(r1, r11, r2)
            r12 = r41
            r15 = r39
            r1 = r56
            X.C86604Kt.A1T(r12, r1, r15)
            r2 = r35
            r2.<init>(r14)
            r2.A0J = r13
            r2.A0c = r0
            r2.A0U = r9
            r2.A0W = r3
            r0 = r58
            r2.A09 = r0
            r0 = r37
            r2.A01 = r0
            r0 = r43
            r2.A04 = r0
            r0 = r44
            r2.A05 = r0
            r13 = r51
            r2.A0T = r13
            r3 = r38
            r2.A0I = r3
            r2.A0M = r8
            r0 = r17
            r2.A0X = r0
            r2.A0V = r4
            r0 = r50
            r2.A08 = r0
            r2.A0R = r10
            r0 = r33
            r2.A0N = r0
            r0 = r59
            r2.A0A = r0
            r0 = r34
            r2.A0K = r0
            r2.A0O = r11
            r0 = r18
            r2.A0P = r0
            X.5QV r0 = r15.A00(r1, r12)
            r2.A0L = r0
            java.lang.String r0 = "arg_business_marker_data"
            java.lang.Object r0 = r3.A04(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L_0x00a8
            r2.A0A = r0
        L_0x00a8:
            java.lang.String r0 = "arg_filter_state"
            java.lang.Object r0 = r3.A04(r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            if (r0 == 0) goto L_0x00b4
            r2.A01 = r0
        L_0x00b4:
            X.4UC r0 = X.AnonymousClass0x9.A0b()
            r2.A0Y = r0
            X.5UT r0 = r2.A08
            X.08M r0 = r0.A07
            r2.A02 = r0
            X.08M r0 = X.AnonymousClass08M.A01()
            r2.A0H = r0
            java.util.HashSet r1 = X.AnonymousClass002.A0K()
            java.util.Set r0 = r2.A0E()
            r1.addAll(r0)
            r2.A0B = r1
            java.lang.String r0 = "arg_business_info_state"
            java.lang.Object r0 = r3.A04(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            r9 = 0
            int r0 = X.C18310x6.A06(r0)
            r2.A00 = r0
            X.08J r1 = X.AnonymousClass4L0.A0E()
            java.util.ArrayList r0 = r2.A0A
            r1.A0H(r0)
            r2.A0F = r1
            X.4UC r0 = X.AnonymousClass0x9.A0b()
            r2.A0Z = r0
            X.4UC r0 = X.AnonymousClass0x9.A0b()
            r2.A0b = r0
            X.4UC r0 = X.AnonymousClass0x9.A0b()
            r2.A0a = r0
            X.8FG r0 = new X.8FG
            r0.<init>()
            X.5Ur r0 = r10.Azy(r0)
            android.os.Bundle r4 = r2.A01
            r0.A08(r4)
            r2.A0S = r0
            r21 = 0
            X.92M r10 = new X.92M
            r10.<init>(r2, r7)
            X.91F r4 = new X.91F
            r4.<init>(r2, r9)
            X.8FD r23 = new X.8FD
            r23.<init>()
            X.8FF r26 = new X.8FF
            r26.<init>()
            X.8FM r30 = new X.8FM
            r30.<init>()
            r22 = r18
            r24 = r10
            r25 = r4
            r27 = r0
            r28 = r21
            r29 = r2
            r31 = r16
            X.5jW r10 = r22.B0G(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r2.A0Q = r10
            X.08M r4 = r10.A06
            r2.A0E = r4
            android.app.Application r11 = r2.A00
            android.content.Context r11 = r11.getApplicationContext()
            android.content.res.Resources r12 = r11.getResources()
            r11 = 2131166231(0x7f070417, float:1.7946702E38)
            int r12 = r12.getDimensionPixelSize(r11)
            X.7Qp[] r11 = new X.C150407Qp[r5]
            X.6fZ r5 = new X.6fZ
            r5.<init>(r12, r12)
            r11[r9] = r5
            java.lang.String r9 = "description"
            X.6fb r5 = new X.6fb
            r5.<init>(r9)
            r11[r7] = r5
            X.6fY r5 = new X.6fY
            r5.<init>(r12, r12)
            r11[r16] = r5
            java.lang.String r7 = "full_details"
            X.6fa r5 = new X.6fa
            r5.<init>(r7)
            r11[r6] = r5
            java.util.List r5 = X.AnonymousClass8UF.A0p(r11)
            r2.A0d = r5
            java.lang.String r5 = "saved_selected_multiple_choice_category"
            java.lang.Object r5 = r3.A04(r5)
            if (r5 == 0) goto L_0x0186
            r0.A09(r3)
        L_0x0186:
            X.5jT r8 = (X.C112275jT) r8
            r8.A0A = r2
            r8.A0C = r10
            java.util.List r7 = X.C86644Kx.A0h(r1)
            if (r7 == 0) goto L_0x01e9
            X.5UT r6 = r2.A08
            X.5ZO r5 = r2.A05
            r6.A04(r5, r7)
            X.5UT r5 = r2.A08
            r5.A06(r7)
            X.5UT r5 = r2.A08
            X.5hC r5 = r5.A08
            X.7yk r5 = r5.A02()
            float r8 = r5.A02
            java.lang.String r7 = r13.A00
            java.lang.String r24 = r0.A06()
            r5 = r17
            X.1VX r6 = r5.A03
            r5 = 4461(0x116d, float:6.251E-42)
            java.lang.String r25 = X.C56952sp.A08(r6, r5)
            X.5UT r5 = r2.A08
            int r6 = r5.A01
            int r5 = r5.A00
            boolean r9 = r0.A04
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r9)
            java.lang.Boolean r19 = r0.A05()
            boolean r9 = r0.A03
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r9)
            java.lang.Integer r9 = r33.A03()
            int r30 = r9.intValue()
            r31 = 65
            r26 = r21
            r22 = r21
            r27 = r8
            r28 = r6
            r29 = r5
            r17 = r34
            r23 = r7
            r17.A01(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
        L_0x01e9:
            r5 = 13
            X.59q r6 = X.C1001359q.A00(r2, r5)
            r5 = 105(0x69, float:1.47E-43)
            X.C86604Kt.A1O(r4, r1, r6, r5)
            int r4 = r2.A00
            r1 = r16
            if (r4 == r1) goto L_0x01fd
            r2.A0H()
        L_0x01fd:
            java.lang.String r1 = "arg_should_animate_on_gps_change"
            java.lang.Object r1 = r3.A04(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x020d
            boolean r1 = r1.booleanValue()
            r2.A0D = r1
        L_0x020d:
            X.08J r3 = X.AnonymousClass4L0.A0E()
            r1 = 77
            X.6lz r0 = r0.A03(r2, r1)
            r3.A0H(r0)
            r2.A0G = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4U8.<init>(android.app.Application, android.os.Bundle, X.0XV, X.5MD, X.3Wi, X.5iE, X.5iG, X.5dr, X.5ZO, X.8uf, X.5Tn, X.5Wb, X.64d, X.8nl, X.5UT, X.7yh, X.2oU, X.5ZR, X.33j, X.5Up, X.8E9, X.4FS, java.lang.String, java.util.ArrayList):void");
    }
}
