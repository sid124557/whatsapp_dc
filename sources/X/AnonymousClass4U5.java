package X;

import android.app.Application;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/* renamed from: X.4U5  reason: invalid class name */
public class AnonymousClass4U5 extends AnonymousClass08N implements C185878uO, C185648u1, C184258rV, C184238rT, C181988ng {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass5TI A03;
    public Jid A04;
    public Stack A05;
    public boolean A06;
    public boolean A07;
    public final C06270Wx A08;
    public final C06270Wx A09;
    public final C06270Wx A0A;
    public final AnonymousClass08J A0B;
    public final AnonymousClass08J A0C;
    public final AnonymousClass0XV A0D;
    public final C620433g A0E;
    public final C111525iE A0F;
    public final C111545iG A0G;
    public final C186048uf A0H;
    public final AnonymousClass4w0 A0I;
    public final C105085Tn A0J;
    public final C150977Sy A0K;
    public final C157167hq A0L;
    public final C112305jW A0M;
    public final C105375Ur A0N;
    public final AnonymousClass7HD A0O;
    public final C149347Mc A0P;
    public final C112225jO A0Q;
    public final C105355Up A0R;
    public final AnonymousClass5PS A0S;
    public final AnonymousClass4UC A0T;
    public final AnonymousClass4UC A0U;
    public final AnonymousClass4UC A0V;
    public final AnonymousClass4UC A0W;
    public final AnonymousClass4UC A0X = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0Y = AnonymousClass0x9.A0b();
    public final Set A0Z;

    public final void A0Q(int i) {
        int i2;
        ArrayList arrayList;
        if (i == -1) {
            arrayList = AnonymousClass002.A0J(A0F());
            i2 = 1;
        } else if (i == 1 || i == 2 || i == 3) {
            arrayList = AnonymousClass002.A0J(A0F());
            i2 = 2;
        } else if (i == 4) {
            A0O();
            return;
        } else {
            return;
        }
        C96304w9.A00(this, arrayList, i2);
        A0V(arrayList);
        this.A0F.A06(C112225jO.A00(this.A0Q), 28, i2);
    }

    public final void A0S(AnonymousClass5TI r14) {
        this.A02 = 1;
        this.A0W.A0H(this.A0V.A07());
        C112305jW r1 = this.A0M;
        r1.A0E((String) null);
        List emptyList = Collections.emptyList();
        C162457s7.A0J(emptyList, 0);
        List list = r14.A06;
        List list2 = r14.A09;
        List list3 = r14.A08;
        String str = r14.A03;
        String str2 = r14.A05;
        r1.BNw(new AnonymousClass5TI(r14.A00, r14.A01, str, str2, r14.A04, r14.A02, emptyList, list, list2, list3));
        A0L();
    }

    public final void A0Z(boolean z) {
        this.A02 = 4;
        this.A00 = 4;
        this.A0B.A0G("nearby_business");
        A0W(z);
        C186048uf r4 = this.A0H;
        AnonymousClass5ZO r3 = this.A0Q.A00.A01;
        String str = this.A0M.A0P;
        r4.B35(A0D(), this.A0N.A01(), r3, str);
    }

    public void Bac() {
        A0Y(true);
        this.A0F.A06(C112225jO.A00(this.A0Q), 30, 1);
    }

    public static Integer A00(AnonymousClass4U5 r0) {
        return r0.A0J.A03();
    }

    public void A0C() {
        C112225jO r2 = this.A0Q;
        AnonymousClass4UB r0 = r2.A00;
        r0.A02.removeCallbacks(r0.A0B);
        r2.A07.A00();
        r2.A01 = null;
        this.A0M.A04();
        C112275jT r02 = (C112275jT) this.A0H;
        r02.A0F = null;
        r02.A0G = null;
        r02.A0C = null;
    }

    public final AnonymousClass7H6 A0D() {
        C06270Wx r1 = this.A08;
        if (r1.A07() != null) {
            return ((AnonymousClass5LW) r1.A07()).A04;
        }
        return new AnonymousClass7H6(150, (String) null);
    }

    public C166447yh A0E() {
        AnonymousClass4UC r1 = this.A0V;
        if (r1.A07() == null) {
            return null;
        }
        C166447yh r3 = (C166447yh) r1.A07();
        C166447yh r2 = (C166447yh) this.A0W.A07();
        if (r2 != null) {
            Stack stack = this.A05;
            if (stack.isEmpty() || AnonymousClass001.A0K(stack.peek()) != 2) {
                return r3;
            }
            return r2;
        }
        return r3;
    }

    public final List A0F() {
        AnonymousClass5LW r1 = (AnonymousClass5LW) this.A08.A07();
        if (C157167hq.A00(this.A0Q.A00.A01) && r1 != null) {
            List list = r1.A0J;
            if (!list.isEmpty()) {
                return list;
            }
        }
        return AnonymousClass001.A0s();
    }

    public void A0H() {
        int i = this.A02;
        if (i != 0) {
            if (i == 1) {
                AnonymousClass4UB r3 = this.A0Q.A00;
                int i2 = r3.A00;
                if (!(i2 == 4 || i2 == 3 || i2 == 6 || i2 == 5)) {
                    if (A0c()) {
                        this.A05.pop();
                        A0U(3);
                        this.A0G.A05(A00(this), 3, 3);
                        C105375Ur r0 = this.A0N;
                        r0.A07();
                        r0.A00 = null;
                        this.A02 = 2;
                        if (!this.A07 && this.A0A.A07() != null) {
                            C149347Mc r02 = this.A0P;
                            r02.A00.A0H(r02.A01);
                        } else if (r3.A01 != null) {
                            A0K();
                        }
                        this.A0W.A0G((Object) null);
                        C86634Kw.A1L(this.A0V);
                        return;
                    }
                    A0b(this.A06, true, true);
                    return;
                }
            } else if (i == 2) {
                int i3 = this.A0Q.A00.A00;
                if (!(i3 == 4 || i3 == 3 || i3 == 6 || i3 == 5)) {
                    A0b(this.A06, true, false);
                    return;
                }
            } else if (i != 3) {
                if (i != 4) {
                    return;
                }
            }
            A0U((Integer) null);
            C06270Wx.A03(this.A0Y, 2);
            return;
        }
        A0U(0);
        A0N();
    }

    public void A0I() {
        C112305jW r5 = this.A0M;
        AnonymousClass5LW r3 = (AnonymousClass5LW) r5.A06.A07();
        if (r5.A0B.A03 != 9 && r3 != null && r3.A05 != null) {
            AnonymousClass4UB r2 = this.A0Q.A00;
            if (r2.A01 != null) {
                r5.A05();
                AnonymousClass5ZO r4 = r2.A01;
                if (C157167hq.A00(r4) && !r3.A0H) {
                    int i = this.A02;
                    if (i == 1) {
                        A0R(A0D());
                    } else if (i != 3) {
                        if (i == 4) {
                            C186048uf r32 = this.A0H;
                            String str = r5.A0P;
                            r32.B35(A0D(), this.A0N.A01(), r4, str);
                        }
                    } else if (A0d()) {
                        C186048uf r33 = this.A0H;
                        Jid jid = this.A04;
                        AnonymousClass5ZO r6 = r2.A01;
                        String str2 = r5.A0P;
                        r33.B3B(A0D(), this.A0N.A01(), r6, jid, str2);
                    }
                }
            }
        }
    }

    public final void A0J() {
        this.A0B.A0H("all_categories");
        A0V(C18300x5.A0s(new AnonymousClass6lV()));
        this.A02 = 0;
        C186048uf r2 = this.A0H;
        AnonymousClass5ZO r1 = this.A0Q.A00.A01;
        C626936e.A07(r1, "Trying to fetch the categories, but the search location is null");
        r2.B39(r1, 2);
    }

    public final void A0K() {
        C166447yh r7 = (C166447yh) this.A0V.A07();
        if (r7 != null) {
            AnonymousClass4UB r1 = this.A0Q.A00;
            if (r1.A01 != null) {
                A0V(C18300x5.A0s(new AnonymousClass6lV()));
                this.A02 = 2;
                C186048uf r2 = this.A0H;
                AnonymousClass5ZO r6 = r1.A01;
                String str = this.A0M.A0P;
                AnonymousClass7H6 r4 = null;
                if (C157167hq.A00(r6)) {
                    r4 = new AnonymousClass7H6(150, (String) null);
                }
                C112275jT r22 = (C112275jT) r2;
                r22.A00();
                C114415n0 r8 = new C114415n0(r6, r22);
                r22.A07 = r8;
                C90694i3 B0D = r22.A0J.B0D(r4, (C150967Sx) null, r6, r7, r8, r22.A0T.A00, (AnonymousClass5ZI) null, "current", "immediate_children", str, (String) null);
                B0D.A08();
                r22.A00 = B0D;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r2 == 2) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0L() {
        /*
            r4 = this;
            X.5iG r3 = r4.A0G
            int r2 = r4.A02
            if (r2 == 0) goto L_0x000a
            r0 = 2
            r1 = 2
            if (r2 != r0) goto L_0x000b
        L_0x000a:
            r1 = 3
        L_0x000b:
            java.lang.Integer r0 = A00(r4)
            r3.A05(r0, r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4U5.A0L():void");
    }

    public final void A0M() {
        int i = this.A02;
        if (i == 1) {
            A0X(false);
        } else if (i != 3) {
            if (i == 4) {
                A0Z(false);
            }
        } else if (A0d()) {
            A0a(false);
        }
    }

    public final void A0N() {
        AnonymousClass4UC r1;
        int i;
        int i2 = this.A01;
        if (i2 == 0) {
            this.A0B.A0G("product_name");
            r1 = this.A0Y;
            i = 4;
        } else if (i2 == 1) {
            r1 = this.A0Y;
            i = 7;
        } else {
            return;
        }
        C06270Wx.A03(r1, i);
    }

    public final void A0O() {
        this.A0C.A0G(AnonymousClass001.A0s());
        C06270Wx.A03(this.A0Y, 3);
        this.A0F.A06(C112225jO.A00(this.A0Q), 28, 6);
    }

    public void A0P(int i) {
        String str;
        String str2;
        AnonymousClass5TI r0 = this.A03;
        if (r0 != null) {
            C111525iE r8 = this.A0F;
            long size = (long) r0.A09.size();
            C105375Ur r1 = this.A0N;
            long A082 = (long) C86614Ku.A08(r1.A00);
            C112225jO r02 = this.A0Q;
            int A012 = r02.A01();
            int i2 = this.A00;
            int A0I2 = r02.A00.A0I();
            String str3 = this.A03.A04;
            Boolean A052 = r1.A05();
            if (r1.A03) {
                str = "has_catalog";
            } else {
                str = null;
            }
            if (r1.A04) {
                str2 = "open_now";
            } else {
                str2 = null;
            }
            String A062 = r1.A06();
            C95224sp A002 = C95224sp.A00(i);
            A002.A0K = Long.valueOf(size);
            C95224sp.A02(A002, A012, i2, A082);
            if (A0I2 == 0) {
                A0I2 = 2;
            }
            A002.A0F = Integer.valueOf(A0I2);
            A002.A0Q = str3;
            A002.A00 = A052;
            A002.A0R = str;
            A002.A0S = str2;
            A002.A0T = A062;
            A002.A0U = r8.A01;
            A002.A0C = Integer.valueOf(r8.A00);
            A002.A0J = AnonymousClass0x2.A0U();
            r8.A05.BhD(A002);
        }
    }

    public final void A0R(AnonymousClass7H6 r16) {
        String str;
        String str2;
        boolean z;
        List list;
        C166447yh r7 = (C166447yh) this.A0W.A07();
        AnonymousClass4UB r3 = this.A0Q.A00;
        if (r3.A01 != null && r7 != null) {
            AnonymousClass7H6 r4 = r16;
            if (r16 == null || r4.A01 == null) {
                C105375Ur r1 = this.A0N;
                if (!r1.A01.isEmpty() || ((list = r1.A00) != null && !list.isEmpty())) {
                    z = false;
                } else {
                    z = true;
                }
                A0V(C18300x5.A0s(new C96314wA(z, A0e())));
            }
            this.A02 = 1;
            if (r16 == null || r4.A01 == null) {
                AnonymousClass5LW r2 = this.A0M.A0B;
                r2.A0I = false;
                r2.A0G = AnonymousClass001.A0s();
                r2.A02 = 0;
            }
            if (A0e()) {
                str = "map_view_serp";
            } else {
                str = null;
            }
            C186048uf r12 = this.A0H;
            AnonymousClass5ZO r6 = r3.A01;
            C105375Ur r22 = this.A0N;
            if (r22.A0B()) {
                str2 = "all_descendents";
            } else {
                str2 = "current";
            }
            String str3 = this.A0M.A0P;
            C150967Sx A012 = r22.A01();
            C112275jT r13 = (C112275jT) r12;
            r13.A00();
            C114425n1 r8 = new C114425n1(r6, r13, (Jid) null);
            r13.A04 = r8;
            C90694i3 B0D = r13.A0J.B0D(r4, A012, r6, r7, r8, r13.A0T.A00, (AnonymousClass5ZI) null, "all_descendents", str2, str3, str);
            B0D.A08();
            r13.A00 = B0D;
        }
    }

    public final void A0T(AnonymousClass5LW r15) {
        String str;
        long j;
        if (r15.A05 != null) {
            C111545iG r2 = this.A0G;
            Integer A022 = this.A0M.A02();
            int size = r15.A05.A06.size();
            String str2 = r15.A0F;
            int i = this.A02;
            if (i == 4 || i == 1) {
                str = "businesses";
            } else {
                str = "recommendations";
            }
            C105375Ur r1 = this.A0N;
            List list = r1.A00;
            if (list != null) {
                j = (long) list.size();
            } else {
                j = 0;
            }
            r2.A02(r1.A05(), Boolean.valueOf(r1.A03), Boolean.valueOf(r1.A04), A022, str2, str, r1.A06(), size, A00(this).intValue(), j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == 2) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U(java.lang.Integer r10) {
        /*
            r9 = this;
            X.5iG r2 = r9.A0G
            int r1 = r9.A02
            if (r1 == 0) goto L_0x000c
            r0 = 2
            r6 = 2
            r7 = 30
            if (r1 != r0) goto L_0x000f
        L_0x000c:
            r6 = 3
            r7 = 63
        L_0x000f:
            r8 = 1
            java.lang.Integer r3 = A00(r9)
            r5 = 0
            r4 = r10
            r2.A09(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4U5.A0U(java.lang.Integer):void");
    }

    public final void A0W(boolean z) {
        if (!z || A0D() == null || A0D().A01 == null) {
            this.A0M.A0E((String) null);
            A0V(C18300x5.A0s(new C96314wA(false, A0e())));
        } else if (C157167hq.A00(this.A0Q.A00.A01)) {
            C112305jW r4 = this.A0M;
            AnonymousClass5LW r3 = r4.A0B;
            List list = r3.A0J;
            if (!list.isEmpty()) {
                list.add(new C136146lv(0));
                r3.A03 = 2;
                r4.A06();
            }
        }
    }

    public final void A0Y(boolean z) {
        int i = this.A02;
        if (i == 0) {
            A0J();
        } else if (i == 1) {
            A0X(z);
        } else if (i == 2) {
            A0K();
        } else if (i == 3) {
            A0a(z);
        } else if (i == 4) {
            A0Z(z);
        }
    }

    public final void A0a(boolean z) {
        Jid jid;
        AnonymousClass7H6 r4;
        C105355Up r2 = this.A0R;
        if (r2.A03.A0X(1616) && r2.A04() && (jid = this.A04) != null) {
            AnonymousClass4UB r22 = this.A0Q.A00;
            if (r22.A01 != null) {
                this.A02 = 3;
                this.A00 = 3;
                this.A0B.A0G("business_chaining");
                A0W(z);
                C150967Sx A012 = this.A0N.A01();
                if (A012.A01 == null) {
                    this.A0E.A06(new C116935r6(A012, 4, this), AnonymousClass32Y.A03(jid));
                    return;
                }
                C186048uf r3 = this.A0H;
                AnonymousClass5ZO r6 = r22.A01;
                String str = this.A0M.A0P;
                if (C157167hq.A00(r6)) {
                    r4 = A0D();
                } else {
                    r4 = null;
                }
                r3.B3B(r4, A012, r6, jid, str);
            }
        }
    }

    public final void A0b(boolean z, boolean z2, boolean z3) {
        boolean z4 = this.A07;
        Integer A0a = C18290x4.A0a();
        if (!z4) {
            C06270Wx r3 = this.A09;
            if (r3.A07() != null && !((C149337Mb) r3.A07()).A03.isEmpty()) {
                if (z2) {
                    A0U(A0a);
                }
                if (z3) {
                    this.A0G.A05(A00(this), 3, 3);
                }
                AnonymousClass7HD r0 = this.A0O;
                r0.A00.A0G(r0.A01);
                C111525iE r7 = this.A0F;
                long size = (long) ((C149337Mb) r3.A07()).A03.size();
                C112225jO r02 = this.A0Q;
                int A012 = r02.A01();
                int A0I2 = r02.A00.A0I();
                C95224sp r1 = new C95224sp();
                r1.A0E = AnonymousClass0x7.A0g();
                r1.A0L = Long.valueOf(size);
                r1.A09 = Integer.valueOf(A012);
                if (A0I2 == 0) {
                    A0I2 = 2;
                }
                r1.A0F = Integer.valueOf(A0I2);
                r7.A04(r1);
                this.A0V.A0G((Object) null);
                this.A0B.A0G("all_categories");
                C105375Ur r12 = this.A0N;
                r12.A07();
                r12.A00 = null;
                this.A02 = 0;
            }
        }
        if (this.A0Q.A00.A01 != null) {
            if (A0c()) {
                this.A05.pop();
            }
            if (z) {
                if (z2) {
                    A0U(A0a);
                }
                if (z3) {
                    this.A0G.A05(A00(this), 3, 3);
                }
                A0J();
            } else {
                if (z2) {
                    A0U(0);
                }
                A0N();
                return;
            }
        }
        this.A0V.A0G((Object) null);
        this.A0B.A0G("all_categories");
        C105375Ur r122 = this.A0N;
        r122.A07();
        r122.A00 = null;
        this.A02 = 0;
    }

    public final boolean A0c() {
        Stack stack = this.A05;
        if (stack.isEmpty() || AnonymousClass001.A0K(stack.peek()) != 2) {
            return false;
        }
        return true;
    }

    public final boolean A0d() {
        C105355Up r2 = this.A0R;
        if (!r2.A03.A0X(2192) || !r2.A04() || this.A04 == null || this.A02 != 3) {
            return false;
        }
        return true;
    }

    public final boolean A0e() {
        AnonymousClass5ZO r2 = this.A0Q.A00.A01;
        if (r2 == null || r2.A07()) {
            return false;
        }
        int i = r2.A00;
        if (i == -1) {
            Double d = r2.A06;
            if (d == null || d.doubleValue() > 9000.0d) {
                return false;
            }
        } else if (i < 12 || i > 14) {
            return false;
        }
        if (this.A02 != 1) {
            return false;
        }
        C105355Up r1 = this.A0R;
        if (!r1.A04() || !r1.A03.A0X(4236)) {
            return false;
        }
        return true;
    }

    public void BMN() {
        if (this.A0R.A07()) {
            C111525iE r2 = this.A0F;
            Integer A002 = C112225jO.A00(this.A0Q);
            C95224sp A003 = C95224sp.A00(3);
            A003.A09 = A002;
            r2.A04(A003);
            this.A0I.A02(true);
        }
        C06270Wx.A04(this.A0T, 3);
    }

    public void BOb() {
        AnonymousClass7HE A022 = this.A0N.A02();
        if (A022 != null) {
            this.A0U.A0G(A022);
        }
    }

    public void BOe() {
        AnonymousClass4UC r2;
        Integer num;
        int i;
        C112225jO r0 = this.A0Q;
        r0.A03();
        AnonymousClass4UB r4 = r0.A00;
        int i2 = r4.A00;
        if (i2 != 0) {
            int i3 = 7;
            i = 2;
            if (i2 == 2) {
                r2 = this.A0X;
                if (this.A02 == 0) {
                    i3 = 6;
                }
                num = Integer.valueOf(i3);
                r2.A0H(AnonymousClass0x9.A0C(num, r4.A01));
            } else if (i2 == 4) {
                r2 = this.A0X;
                num = Integer.valueOf(i);
                r2.A0H(AnonymousClass0x9.A0C(num, r4.A01));
            } else if (i2 != 7) {
                return;
            }
        }
        r2 = this.A0X;
        i = 1;
        if (this.A02 == 0) {
            i = 0;
        }
        num = Integer.valueOf(i);
        r2.A0H(AnonymousClass0x9.A0C(num, r4.A01));
    }

    public void BOv(int i) {
        C112225jO r3;
        AnonymousClass4UC r2;
        int i2;
        if (i == 0 || i == 7 || i == 6) {
            C111525iE r22 = this.A0F;
            r3 = this.A0Q;
            r22.A06(C112225jO.A00(r3), 29, 0);
            r2 = this.A0X;
            i2 = 8;
        } else if (i == 3) {
            C111525iE r1 = this.A0F;
            r3 = this.A0Q;
            r1.A06(C112225jO.A00(r3), 29, 3);
            r2 = this.A0X;
            i2 = 5;
        } else {
            return;
        }
        r2.A0H(AnonymousClass0x9.A0C(Integer.valueOf(i2), r3.A00.A01));
    }

    public void BOy() {
        this.A0N.A07();
        this.A0G.A03((Boolean) null, A00(this), (String) null, 24);
        A0M();
    }

    public void BP0() {
        C105375Ur r1 = this.A0N;
        r1.A07();
        r1.A00 = null;
        A0M();
        this.A0F.A06(C112225jO.A00(this.A0Q), 32, 5);
    }

    public void BRP(boolean z) {
        this.A0N.A02 = z;
        this.A0G.A03(Boolean.valueOf(z), A00(this), (String) null, 21);
        A0M();
    }

    public void BUG(boolean z) {
        this.A0N.A03 = z;
        this.A0G.A03(Boolean.valueOf(z), A00(this), (String) null, 22);
        A0M();
    }

    public void BVm() {
        C06270Wx.A03(this.A0Y, 5);
    }

    public void BVr() {
        C06270Wx.A03(this.A0T, 0);
        this.A0F.A06(C112225jO.A00(this.A0Q), 34, 0);
    }

    public void BXM(boolean z) {
        this.A0N.A04 = z;
        this.A0G.A03(Boolean.valueOf(z), A00(this), (String) null, 9);
        A0M();
    }

    public void Bab() {
        C112225jO r2 = this.A0Q;
        r2.A02();
        r2.A00.A0K();
        C06270Wx.A03(this.A0T, 1);
        this.A0F.A06(C112225jO.A00(r2), 31, 0);
    }

    public void Bb2() {
        this.A0V.A0G((Object) null);
        this.A0B.A0G("product_name");
        C06270Wx.A03(this.A0Y, 4);
        this.A0F.A06(C112225jO.A00(this.A0Q), 33, 5);
    }

    public final List A0G() {
        int i;
        C136186lz A032;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass4UB r2 = this.A0Q.A00;
        Object A072 = r2.A07();
        this.A08.A07();
        if (A072 != null) {
            A0s.add(A072);
            Integer[] numArr = new Integer[2];
            List A1A = AnonymousClass0x9.A1A(Integer.valueOf(C18300x5.A1Y(numArr, 2) ? 1 : 0), numArr, 1);
            int i2 = this.A02;
            if ((i2 == 1 || i2 == 4 || A0d()) && AnonymousClass0x7.A1U(A1A, r2.A00)) {
                C105375Ur r1 = this.A0N;
                if (!(r1.A00 == null || (A032 = r1.A03(this, 76)) == null)) {
                    A0s.add(A032);
                }
            }
        }
        if (this.A02 == 0 && r2.A00 != 4) {
            Iterator it = this.A0Z.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0g("restartVisibilityState");
            }
        }
        int i3 = r2.A00;
        if (this.A0R.A03.A0X(1806) && (((i = this.A02) == 2 || i == 0) && i3 != 4)) {
            LinkedList A18 = AnonymousClass0x9.A18();
            A18.add(new C152287Yh((Object) null, "-1", this.A00.getString(R.string.f11nameremoved)));
            if (this.A02 == 2) {
                AnonymousClass4UC r12 = this.A0V;
                if (r12.A07() != null) {
                    C166447yh r3 = (C166447yh) r12.A07();
                    A18.add(new C152287Yh(r3, r3.A00, r3.A01));
                }
            }
            A0s.add(new C135986lf(new AnonymousClass8F4(this), A18));
        }
        return A0s;
    }

    public final void A0V(List list) {
        List A0G2 = A0G();
        A0G2.addAll(list);
        this.A0C.A0G(A0G2);
    }

    public final void A0X(boolean z) {
        AnonymousClass7H6 r0;
        A0W(z);
        if (C157167hq.A00(this.A0Q.A00.A01)) {
            r0 = A0D();
        } else {
            r0 = null;
        }
        A0R(r0);
    }

    public void BWm() {
        BOe();
    }

    public void BUT(AnonymousClass7T4 r1, int i) {
        A0O();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4U5(Application application, AnonymousClass0XV r30, AnonymousClass7C6 r31, C620433g r32, C111525iE r33, C111545iG r34, C186048uf r35, AnonymousClass4w0 r36, C105085Tn r37, C150977Sy r38, C157167hq r39, C1223764d r40, C182038nl r41, AnonymousClass7HD r42, C1224064g r43, C166447yh r44, Jid jid, C105355Up r46, AnonymousClass5PS r47, String str, Set set, boolean z, boolean z2) {
        super(application);
        int i;
        int i2 = z2;
        boolean z3 = z;
        C186048uf r11 = r35;
        AnonymousClass08J A0E2 = AnonymousClass4L0.A0E();
        this.A0B = A0E2;
        AnonymousClass4UC A0b = AnonymousClass0x9.A0b();
        this.A0V = A0b;
        AnonymousClass4UC A0b2 = AnonymousClass0x9.A0b();
        this.A0W = A0b2;
        this.A0T = AnonymousClass0x9.A0b();
        AnonymousClass08J A0E3 = AnonymousClass4L0.A0E();
        this.A0C = A0E3;
        this.A0U = AnonymousClass0x9.A0b();
        this.A05 = new Stack();
        AnonymousClass0XV r13 = r30;
        this.A0D = r13;
        this.A0R = r46;
        C105375Ur Azy = r41.Azy(new AnonymousClass927(this, 1));
        this.A0N = Azy;
        this.A0F = r33;
        this.A0L = r39;
        this.A0Z = set;
        this.A0H = r11;
        this.A0E = r32;
        this.A0J = r37;
        this.A0I = r36;
        this.A0K = r38;
        AnonymousClass7HD r27 = r42;
        this.A0O = r27;
        this.A0S = r47;
        this.A0G = r34;
        C112225jO B0L = r43.B0L(this, this, this);
        this.A0Q = B0L;
        AnonymousClass92M r14 = new AnonymousClass92M(this, 2);
        AnonymousClass91F r4 = new AnonymousClass91F(this, 1);
        C112305jW B0G = r40.B0G(new AnonymousClass926(this, 1), r14, r4, new C1894691k(this, 1), Azy, B0L, this, this, 1);
        this.A0M = B0G;
        this.A01 = r13.A04("saved_consumer_home_type") != null ? AnonymousClass001.A0K(r13.A04("saved_consumer_home_type")) : i2;
        this.A06 = r13.A04("saved_force_root_category") != null ? AnonymousClass001.A1Z(r13.A04("saved_force_root_category")) : z3;
        C149347Mc r3 = new C149347Mc(new AnonymousClass7D0(this), C64333Db.A2q(r31.A00.A04));
        this.A0P = r3;
        AnonymousClass08M r142 = r27.A00;
        this.A09 = r142;
        AnonymousClass08M r2 = B0G.A06;
        this.A08 = r2;
        AnonymousClass08M r1 = r3.A00;
        this.A0A = r1;
        Azy.A09(r13);
        if (r13.A04("saved_parent_category") != null) {
            A0b.A0H(r13.A04("saved_parent_category"));
        }
        if (r13.A04("saved_second_level_category") != null) {
            A0b2.A0H(r13.A04("saved_second_level_category"));
        }
        if (r13.A04("saved_search_state_stack") != null) {
            Stack stack = new Stack();
            this.A05 = stack;
            stack.addAll((Collection) r13.A04("saved_search_state_stack"));
        }
        if (r13.A04("saved_search_state") != null) {
            i = AnonymousClass001.A0K(r13.A04("saved_search_state"));
        } else {
            i = 0;
        }
        this.A02 = i;
        if (A0b2.A07() == null) {
            C166447yh r5 = r44;
            if (r44 != null) {
                this.A0V.A0H(r5);
                this.A00 = 2;
                if (C142686xb.A00(r5.A00)) {
                    this.A02 = 2;
                } else {
                    this.A0W.A0H(r5);
                    this.A02 = 1;
                }
            }
        }
        Jid jid2 = jid;
        if (jid != null) {
            this.A04 = jid2;
            this.A02 = 3;
        }
        if ("nearby_business".equals(str)) {
            this.A02 = 4;
        }
        AnonymousClass6C6.A03(r142, A0E3, this, 54);
        AnonymousClass6C6.A03(r2, A0E3, this, 51);
        AnonymousClass6C6.A03(r1, A0E3, this, 52);
        C86604Kt.A1O(A0b, A0E2, this, 106);
        C86604Kt.A1O(A0b2, A0E2, this, 106);
        C112275jT r112 = (C112275jT) r11;
        r112.A0F = r27;
        r112.A0G = r3;
        r112.A0C = B0G;
        AnonymousClass6C6.A03(B0L.A00, A0E3, this, 53);
    }
}
