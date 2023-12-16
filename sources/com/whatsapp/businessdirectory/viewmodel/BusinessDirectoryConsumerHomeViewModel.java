package com.whatsapp.businessdirectory.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass08J;
import X.AnonymousClass08M;
import X.AnonymousClass08N;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass3ZH;
import X.AnonymousClass4FS;
import X.AnonymousClass4L0;
import X.AnonymousClass4UB;
import X.AnonymousClass4UC;
import X.AnonymousClass4w0;
import X.AnonymousClass5GZ;
import X.AnonymousClass5T3;
import X.AnonymousClass5TO;
import X.AnonymousClass5ZO;
import X.AnonymousClass6C6;
import X.AnonymousClass7H6;
import X.AnonymousClass7HB;
import X.AnonymousClass7T4;
import X.C06270Wx;
import X.C105085Tn;
import X.C105355Up;
import X.C107695bk;
import X.C109065e1;
import X.C111525iE;
import X.C111545iG;
import X.C112225jO;
import X.C112275jT;
import X.C112315jX;
import X.C114395my;
import X.C118065sw;
import X.C118075sx;
import X.C1223564b;
import X.C1224064g;
import X.C123946Aj;
import X.C136086lp;
import X.C150967Sx;
import X.C166447yh;
import X.C179118id;
import X.C181988ng;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C184238rT;
import X.C184258rV;
import X.C185878uO;
import X.C186048uf;
import X.C54292oU;
import X.C55682qk;
import X.C59722xN;
import X.C620733j;
import X.C64333Db;
import X.C86624Kv;
import X.C90614hv;
import X.C95224sp;
import X.C96304w9;
import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BusinessDirectoryConsumerHomeViewModel extends AnonymousClass08N implements C185878uO, C184258rV, C184238rT, C181988ng, C179118id {
    public C166447yh A00;
    public C109065e1 A01;
    public AnonymousClass3ZH A02;
    public boolean A03;
    public final C06270Wx A04;
    public final AnonymousClass08J A05;
    public final C111525iE A06;
    public final C111545iG A07;
    public final AnonymousClass4w0 A08;
    public final C105085Tn A09;
    public final AnonymousClass5TO A0A;
    public final C112315jX A0B;
    public final C112225jO A0C;
    public final C105355Up A0D;
    public final AnonymousClass4UC A0E;
    public final AnonymousClass4UC A0F = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0G;

    public void BOv(int i) {
        AnonymousClass4UC r2;
        int i2;
        if (i == 0 || i == 7 || i == 6) {
            this.A07.A09(this.A09.A03(), 7, (Map) null, 0, 50, 1);
            r2 = this.A0F;
            i2 = 8;
        } else if (i == 3) {
            this.A07.A09(this.A09.A03(), 7, (Map) null, 0, 50, 1);
            r2 = this.A0F;
            i2 = 5;
        } else {
            return;
        }
        r2.A0G(AnonymousClass0x9.A0C(Integer.valueOf(i2), A0D()));
    }

    public void Bac() {
        this.A03 = true;
        A0E();
    }

    public void A0C() {
        C112225jO r2 = this.A0C;
        AnonymousClass4UB r0 = r2.A00;
        r0.A02.removeCallbacks(r0.A0B);
        r2.A07.A00();
        r2.A01 = null;
        C112315jX r22 = this.A0B;
        AnonymousClass5T3 r1 = r22.A01;
        if (r1 != null) {
            r1.A00 = true;
            r22.A01 = null;
        }
        C112275jT r02 = (C112275jT) r22.A05;
        r02.A0B = null;
        r02.A0D = null;
        r02.A0C = null;
        C18290x4.A1L(r22.A0D.A00);
    }

    public final AnonymousClass5ZO A0D() {
        AnonymousClass5ZO A012 = this.A09.A01();
        if (A012 != null) {
            return A012;
        }
        AnonymousClass5TO r1 = this.A0A;
        AnonymousClass5ZO r0 = r1.A00;
        if (r0 == null) {
            return r1.A01();
        }
        return r0;
    }

    public final void A0E() {
        C90614hv r4;
        C112225jO r1 = this.A0C;
        if (r1.A0A()) {
            C112315jX r0 = this.A0B;
            boolean z = this.A03;
            r0.A00 = r1.A00.A01;
            if (z) {
                C105355Up r8 = r0.A0C;
                AnonymousClass1VX r7 = r8.A03;
                if (r7.A0X(4610)) {
                    r0.A0E.clear();
                    C186048uf r12 = r0.A05;
                    AnonymousClass5ZO r82 = r0.A00;
                    C112275jT r13 = (C112275jT) r12;
                    r13.A00();
                    C114395my r132 = new C114395my(r13);
                    r13.A08 = r132;
                    C1223564b r42 = r13.A0Q;
                    C59722xN r14 = r13.A0T.A00;
                    C123946Aj r43 = (C123946Aj) r42;
                    int i = r43.A01;
                    Object obj = r43.A00;
                    if (i != 0) {
                        C64333Db r44 = ((C118065sw) obj).A02;
                        AnonymousClass1VX A4B = C64333Db.A4B(r44);
                        C55682qk A012 = C64333Db.A01(r44);
                        AnonymousClass4FS A8y = C64333Db.A8y(r44);
                        C54292oU A2q = C64333Db.A2q(r44);
                        C620733j A2t = C64333Db.A2t(r44);
                        C107695bk r3 = r44.A00;
                        r4 = new C90614hv(A012, r3.AIq(), C107695bk.A0d(r3), r82, A2q, C86624Kv.A0R(r44), A2t, A4B, r132, r14, C107695bk.A2m(r3), (AnonymousClass5GZ) r3.A2w.get(), A8y);
                    } else {
                        C64333Db r45 = ((C118075sx) obj).A03;
                        AnonymousClass1VX A4B2 = C64333Db.A4B(r45);
                        C55682qk A013 = C64333Db.A01(r45);
                        AnonymousClass4FS A8y2 = C64333Db.A8y(r45);
                        C54292oU A2q2 = C64333Db.A2q(r45);
                        C620733j A2t2 = C64333Db.A2t(r45);
                        C107695bk r32 = r45.A00;
                        r4 = new C90614hv(A013, r32.AIq(), C107695bk.A0d(r32), r82, A2q2, C86624Kv.A0R(r45), A2t2, A4B2, r132, r14, C107695bk.A2m(r32), (AnonymousClass5GZ) r32.A2w.get(), A8y2);
                    }
                    r4.A08();
                    r13.A00 = r4;
                } else {
                    Map map = r0.A0E;
                    map.put(AnonymousClass001.A0f(), new AnonymousClass7HB(0));
                    map.put(C18280x3.A0S(), new AnonymousClass7HB(0));
                    C186048uf r9 = r0.A05;
                    r9.B33(r0.A00);
                    AnonymousClass7HB r2 = (AnonymousClass7HB) map.get(0);
                    if (r2 != null && r2.A01 != null && r2.A00 != 2) {
                        r0.A06();
                    } else if (C112315jX.A00(r0.A00)) {
                        map.put(0, new AnonymousClass7HB(0));
                        int A0N = r0.A0B.A0N(1895);
                        r9.B35(new AnonymousClass7H6(A0N, (String) null), (C150967Sx) null, r0.A00, (String) null);
                    } else {
                        map.put(0, new AnonymousClass7HB(1));
                        r0.A07();
                    }
                    if (r8.A04() && r7.A0X(3948)) {
                        map.put(3, new AnonymousClass7HB(0));
                        r0.A0D.A00(r0, 3);
                    }
                }
                r0.A07();
                return;
            }
            r0.A06();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        if (r3 != 1) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        if (r3 != 1) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(X.C150127Ph r7) {
        /*
            r6 = this;
            X.7T4 r2 = r7.A07
            if (r2 == 0) goto L_0x0038
            X.5iG r5 = r6.A07
            int r1 = r7.A01
            if (r1 == 0) goto L_0x0048
            r0 = 1
            if (r1 == r0) goto L_0x0045
            java.lang.String r0 = "unified_home"
        L_0x000f:
            java.util.Map r4 = r2.A00(r0)
            int r3 = r7.A01
            X.7T4 r0 = r7.A07
            int r2 = r0.A00
            if (r2 == 0) goto L_0x0042
            r1 = 1
            if (r2 == r1) goto L_0x0039
            r0 = 4
            if (r2 == r0) goto L_0x0039
            r0 = 7
            if (r2 == r0) goto L_0x0039
            if (r3 == 0) goto L_0x002a
            r0 = 41
            if (r3 == r1) goto L_0x002c
        L_0x002a:
            r0 = 40
        L_0x002c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r0.intValue()
            r0 = 0
            r5.BK9(r4, r0, r1)
        L_0x0038:
            return
        L_0x0039:
            if (r3 == 0) goto L_0x003f
            r0 = 44
            if (r3 == r1) goto L_0x002c
        L_0x003f:
            r0 = 43
            goto L_0x002c
        L_0x0042:
            r0 = 28
            goto L_0x002c
        L_0x0045:
            java.lang.String r0 = "businesses"
            goto L_0x000f
        L_0x0048:
            java.lang.String r0 = "home"
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryConsumerHomeViewModel.A0F(X.7Ph):void");
    }

    public void BMN() {
        if (this.A0D.A07()) {
            C111525iE r2 = this.A06;
            Integer A002 = C112225jO.A00(this.A0C);
            C95224sp A003 = C95224sp.A00(3);
            A003.A09 = A002;
            r2.A04(A003);
            this.A08.A02(true);
        }
        C06270Wx.A04(this.A0E, 3);
    }

    public void BOe() {
        this.A0C.A03();
        this.A0F.A0H(AnonymousClass0x9.A0C(AnonymousClass0x7.A0g(), A0D()));
    }

    public void BP0() {
    }

    public void BVm() {
        C06270Wx.A03(this.A0G, 10);
    }

    public void BVr() {
        C06270Wx.A04(this.A0E, 0);
        this.A07.A09(this.A09.A03(), C18310x6.A0e(), (Map) null, 0, 48, 1);
    }

    public void Bab() {
        C112225jO r0 = this.A0C;
        r0.A02();
        r0.A00.A0K();
        C06270Wx.A04(this.A0E, 1);
        this.A07.A09(this.A09.A03(), (Integer) null, (Map) null, 0, 49, 1);
    }

    public void Bb2() {
        C06270Wx.A04(this.A0G, 8);
    }

    public BusinessDirectoryConsumerHomeViewModel(Application application, C111525iE r6, C111545iG r7, AnonymousClass4w0 r8, C105085Tn r9, AnonymousClass5TO r10, C112315jX r11, C1224064g r12, C105355Up r13) {
        super(application);
        this.A0D = r13;
        AnonymousClass08J A0E2 = AnonymousClass4L0.A0E();
        this.A05 = A0E2;
        this.A0G = AnonymousClass0x9.A0b();
        this.A0E = AnonymousClass0x9.A0b();
        this.A09 = r9;
        this.A08 = r8;
        this.A0A = r10;
        this.A06 = r6;
        this.A07 = r7;
        C112225jO B0L = r12.B0L(this, this, this);
        this.A0C = B0L;
        this.A0B = r11;
        AnonymousClass08M r1 = r11.A02;
        this.A04 = r1;
        this.A03 = true;
        AnonymousClass6C6.A03(r1, A0E2, this, 45);
        AnonymousClass6C6.A03(B0L.A00, A0E2, this, 46);
    }

    public final void A0G(List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new C136086lp(this));
        ArrayList A0s2 = AnonymousClass001.A0s();
        AnonymousClass4UB r2 = this.A0C.A00;
        if (r2.A07() != null && r2.A00 == 4) {
            A0s2.addAll(this.A0B.A04(r2.A01));
        }
        A0s.addAll(A0s2);
        A0s.addAll(list);
        this.A05.A0G(A0s);
    }

    public void BUT(AnonymousClass7T4 r3, int i) {
        ArrayList A0s = AnonymousClass001.A0s();
        C96304w9.A00(this, A0s, 2);
        A0G(A0s);
    }

    public void BWm() {
        BOe();
    }
}
