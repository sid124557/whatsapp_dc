package com.whatsapp.businessdirectory.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass08J;
import X.AnonymousClass08M;
import X.AnonymousClass08N;
import X.AnonymousClass0XV;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass4GP;
import X.AnonymousClass4L0;
import X.AnonymousClass4UB;
import X.AnonymousClass4UC;
import X.AnonymousClass4w0;
import X.AnonymousClass5AA;
import X.AnonymousClass5IL;
import X.AnonymousClass5LW;
import X.AnonymousClass5MC;
import X.AnonymousClass5OG;
import X.AnonymousClass5PS;
import X.AnonymousClass5TI;
import X.AnonymousClass5TO;
import X.AnonymousClass5W7;
import X.AnonymousClass5ZI;
import X.AnonymousClass5ZO;
import X.AnonymousClass63Y;
import X.AnonymousClass6C6;
import X.AnonymousClass7H6;
import X.AnonymousClass7HD;
import X.AnonymousClass7HE;
import X.AnonymousClass7T4;
import X.AnonymousClass7Y3;
import X.AnonymousClass8E9;
import X.AnonymousClass8FE;
import X.AnonymousClass8FL;
import X.AnonymousClass926;
import X.AnonymousClass927;
import X.AnonymousClass92M;
import X.C06270Wx;
import X.C104755Sf;
import X.C105085Tn;
import X.C105355Up;
import X.C105375Ur;
import X.C105955Xb;
import X.C109035dy;
import X.C109065e1;
import X.C111525iE;
import X.C111545iG;
import X.C112225jO;
import X.C112275jT;
import X.C112305jW;
import X.C112385je;
import X.C113885m9;
import X.C117125rQ;
import X.C117715sN;
import X.C1223764d;
import X.C1224064g;
import X.C124366Bz;
import X.C135936la;
import X.C136016li;
import X.C136106lr;
import X.C136166lx;
import X.C136176ly;
import X.C149337Mb;
import X.C150967Sx;
import X.C150977Sy;
import X.C157167hq;
import X.C158377js;
import X.C162457s7;
import X.C166447yh;
import X.C179118id;
import X.C181988ng;
import X.C182038nl;
import X.C18270x1;
import X.C184238rT;
import X.C184258rV;
import X.C185648u1;
import X.C185878uO;
import X.C186048uf;
import X.C1894691k;
import X.C1896792f;
import X.C1899393f;
import X.C56612sH;
import X.C69263Wi;
import X.C86604Kt;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C90754iG;
import X.C95224sp;
import X.C96304w9;
import X.C96314wA;
import X.C96394wI;
import X.C989453v;
import android.app.Application;
import android.os.Handler;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BusinessDirectoryContextualSearchViewModel extends AnonymousClass08N implements C185878uO, C185648u1, C184258rV, C184238rT, C181988ng, C179118id {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C166447yh A05;
    public Runnable A06;
    public Runnable A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Handler A0B;
    public final Handler A0C;
    public final C06270Wx A0D;
    public final AnonymousClass08J A0E;
    public final AnonymousClass08J A0F;
    public final AnonymousClass08M A0G;
    public final AnonymousClass08M A0H;
    public final AnonymousClass0XV A0I;
    public final AnonymousClass5MC A0J;
    public final C69263Wi A0K;
    public final AnonymousClass5IL A0L;
    public final C111525iE A0M;
    public final C111545iG A0N;
    public final C186048uf A0O;
    public final AnonymousClass5OG A0P;
    public final AnonymousClass4w0 A0Q;
    public final C105085Tn A0R;
    public final AnonymousClass5TO A0S;
    public final C150977Sy A0T;
    public final C157167hq A0U;
    public final AnonymousClass5AA A0V;
    public final C112305jW A0W;
    public final C105955Xb A0X;
    public final C105375Ur A0Y;
    public final AnonymousClass7HD A0Z;
    public final C112225jO A0a;
    public final C56612sH A0b;
    public final C105355Up A0c;
    public final AnonymousClass8E9 A0d;
    public final AnonymousClass5PS A0e;
    public final AnonymousClass4UC A0f;
    public final AnonymousClass4UC A0g;
    public final AnonymousClass4UC A0h;
    public final AnonymousClass4UC A0i;
    public final AnonymousClass4UC A0j = AnonymousClass0x9.A0b();
    public final LinkedList A0k;
    public final AnonymousClass4GP A0l;

    public void A0K() {
        AnonymousClass7H6 r6;
        if (this.A04 == 1) {
            C112305jW r2 = this.A0W;
            AnonymousClass08M r3 = r2.A06;
            AnonymousClass5LW r4 = (AnonymousClass5LW) r3.A07();
            if (r2.A0B.A03 != 9 && r4 != null && r4.A0F != null) {
                r2.A05();
                if (C157167hq.A00(A0E()) && !r4.A0H) {
                    String str = r4.A0F;
                    int i = this.A04;
                    AnonymousClass5ZO A0E2 = A0E();
                    if (C157167hq.A00(A0E())) {
                        AnonymousClass5LW r0 = (AnonymousClass5LW) r3.A07();
                        if (r0 != null) {
                            r6 = r0.A04;
                        } else {
                            r6 = new AnonymousClass7H6(150, (String) null);
                        }
                    } else {
                        r6 = null;
                    }
                    A0Q(r6, this.A0Y.A01(), A0E2, str, r2.A0P, i, 1);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessDirectoryContextualSearchViewModel(Application application, AnonymousClass0XV r19, AnonymousClass5MC r20, C69263Wi r21, AnonymousClass5IL r22, C111525iE r23, C111545iG r24, C186048uf r25, AnonymousClass5OG r26, AnonymousClass4w0 r27, C105085Tn r28, AnonymousClass5TO r29, C150977Sy r30, C157167hq r31, AnonymousClass5AA r32, C1223764d r33, C105955Xb r34, C182038nl r35, AnonymousClass7HD r36, C1224064g r37, C56612sH r38, C105355Up r39, AnonymousClass8E9 r40, AnonymousClass5PS r41) {
        super(application);
        C186048uf r6 = r25;
        AnonymousClass08J A0E2 = AnonymousClass4L0.A0E();
        this.A0F = A0E2;
        this.A0i = AnonymousClass0x9.A0b();
        this.A0f = AnonymousClass0x9.A0b();
        this.A0g = AnonymousClass0x9.A0b();
        AnonymousClass08J A0E3 = AnonymousClass4L0.A0E();
        this.A0E = A0E3;
        this.A06 = new C117125rQ(this, 33);
        this.A0l = new C1896792f(this, 5);
        this.A0b = r38;
        this.A0K = r21;
        AnonymousClass0XV r8 = r19;
        this.A0I = r8;
        this.A0C = new Handler();
        this.A0k = AnonymousClass0x9.A18();
        this.A0c = r39;
        this.A0B = new Handler();
        this.A0U = r31;
        C105955Xb r3 = r34;
        this.A0X = r3;
        this.A0h = AnonymousClass0x9.A0b();
        this.A0O = r6;
        AnonymousClass5IL r9 = r22;
        this.A0L = r9;
        this.A0d = r40;
        this.A0V = r32;
        this.A0R = r28;
        AnonymousClass5OG r1 = r26;
        this.A0P = r1;
        this.A0Q = r27;
        this.A0e = r41;
        this.A0T = r30;
        this.A0S = r29;
        this.A0M = r23;
        this.A0N = r24;
        C112275jT r62 = (C112275jT) r6;
        r62.A0H = this;
        r1.A00 = this;
        boolean z = false;
        this.A04 = 0;
        C105375Ur Azy = r35.Azy(new AnonymousClass927(this, 0));
        this.A0Y = Azy;
        this.A0J = r20;
        C162457s7.A0J(r8, 0);
        r9.A00 = (String) r8.A04("saved_state_query_id");
        this.A08 = r8.A04("saved_search_session_started") != null ? AnonymousClass001.A1Z(r8.A04("saved_search_session_started")) : z;
        Azy.A09(r8);
        C112225jO B0L = r37.B0L(this, this, this);
        this.A0a = B0L;
        C112305jW B0G = r33.B0G(new AnonymousClass926(this, 0), new AnonymousClass92M(this, 0), new AnonymousClass8FE(), new C1894691k(this, 0), Azy, B0L, this, this, 0);
        this.A0W = B0G;
        AnonymousClass7HD r7 = r36;
        this.A0Z = r7;
        AnonymousClass08M r12 = r7.A00;
        this.A0D = r12;
        this.A09 = true;
        r62.A0F = r7;
        AnonymousClass6C6.A03(r12, A0E2, this, 47);
        AnonymousClass6C6.A03(B0G.A06, A0E2, this, 48);
        AnonymousClass6C6.A03(B0L.A00, A0E2, this, 49);
        this.A0G = r3.A02;
        this.A0H = r3.A01;
        C86604Kt.A1O(r3.A00, A0E3, this, 103);
    }

    public void A0C() {
        this.A0W.A04();
        this.A0P.A00 = null;
        C112275jT r0 = (C112275jT) this.A0O;
        r0.A0H = null;
        r0.A0F = null;
    }

    public final int A0D(String str) {
        AnonymousClass1VX r1 = this.A0c.A03;
        if (C86634Kw.A1a(r1) && r1.A0X(2762) && str.length() >= 2) {
            C105375Ur r12 = this.A0Y;
            if (!r12.A0B() || r12.A02) {
                return 1;
            }
            return 0;
        }
        return 1;
    }

    public final AnonymousClass5ZO A0E() {
        AnonymousClass5ZO A012 = this.A0R.A01();
        if (A012 != null) {
            return A012;
        }
        AnonymousClass5TO r1 = this.A0S;
        AnonymousClass5ZO r0 = r1.A00;
        if (r0 == null) {
            return r1.A01();
        }
        return r0;
    }

    public final String A0F() {
        AnonymousClass5LW r0 = (AnonymousClass5LW) this.A0W.A06.A07();
        if (r0 != null) {
            return r0.A0F;
        }
        return null;
    }

    public final List A0G() {
        AnonymousClass5LW r2 = (AnonymousClass5LW) this.A0W.A06.A07();
        if (C157167hq.A00(A0E()) && r2 != null && this.A04 == 1) {
            List list = r2.A0J;
            if (!list.isEmpty()) {
                return list;
            }
        }
        return AnonymousClass001.A0s();
    }

    public final void A0L() {
        this.A0M.A06(AnonymousClass5ZO.A03(A0E()), 28, 7);
    }

    public final void A0O() {
        AnonymousClass0XV r3 = this.A0I;
        String str = (String) r3.A04("saved_search_query");
        int i = 0;
        if (TextUtils.isEmpty(str) || !str.equals(A0F())) {
            if (this.A0A) {
                this.A04 = 1;
                this.A0A = false;
                r3.A06("saved_search_state", (Object) null);
                r3.A06("saved_search_query", (Object) null);
            } else if (this.A04 == 1) {
                this.A0N.A09(C105085Tn.A00(this), (Integer) null, (Map) null, 1, 1, 0);
            }
        } else if (r3.A04("saved_search_state") != null) {
            i = AnonymousClass001.A0K(r3.A04("saved_search_state"));
        }
        this.A04 = i;
        r3.A06("saved_search_state", (Object) null);
        r3.A06("saved_search_query", (Object) null);
    }

    public void A0P(int i) {
        int i2;
        long j;
        String str;
        String str2;
        C111525iE r8 = this.A0M;
        AnonymousClass5TI r0 = this.A0W.A0B.A05;
        if (r0 != null) {
            i2 = r0.A09.size();
        } else {
            i2 = 0;
        }
        long j2 = (long) i2;
        C105375Ur r1 = this.A0Y;
        List list = r1.A00;
        if (list != null) {
            j = (long) list.size();
        } else {
            j = 0;
        }
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
        Integer A002 = C105085Tn.A00(this);
        String A062 = r1.A06();
        C95224sp A003 = C95224sp.A00(i);
        A003.A09 = A002;
        A003.A0K = Long.valueOf(j2);
        A003.A0R = str;
        A003.A0M = Long.valueOf(j);
        A003.A00 = A052;
        A003.A0S = str2;
        A003.A0T = A062;
        A003.A0U = r8.A01;
        A003.A0C = Integer.valueOf(r8.A00);
        A003.A0J = AnonymousClass0x2.A0U();
        r8.A05.BhD(A003);
    }

    public final void A0Q(AnonymousClass7H6 r25, C150967Sx r26, AnonymousClass5ZO r27, String str, String str2, int i, int i2) {
        AnonymousClass5OG r3 = this.A0P;
        String str3 = this.A0L.A00;
        AnonymousClass5MC r1 = this.A0J;
        int i3 = 871826611;
        int i4 = i;
        if (i == 0) {
            i3 = 871830404;
        }
        AnonymousClass5ZI A002 = r1.A00(i3);
        AnonymousClass5ZO r6 = r27;
        String str4 = str;
        C18270x1.A10(str4, 0, r6);
        A002.A00 = Integer.valueOf(AnonymousClass5ZI.A04.getAndIncrement());
        A002.A08();
        AnonymousClass7H6 r4 = r25;
        C150967Sx r5 = r26;
        String str5 = str2;
        int i5 = i2;
        if (i == 0) {
            AnonymousClass5W7 r2 = r3.A05;
            C117715sN.A00(r2.A03, r2, new AnonymousClass63Y(r4, r5, r6, r3, A002, str4, str3, str5, i5), str4, 19);
        } else if (i4 == 1) {
            r3.A00(r4, r5, r6, new C104755Sf((AnonymousClass7Y3) null, str4, 30), A002, str4, str3, C86604Kt.A0k(), str5, i5, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r10.isEmpty() == false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0R(X.AnonymousClass7Y3 r42, X.C158377js r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.util.List r47, java.util.List r48, java.util.List r49, boolean r50) {
        /*
            r41 = this;
            r2 = r41
            java.util.LinkedList r3 = r2.A0k
            monitor-enter(r3)
            android.os.Handler r1 = r2.A0B     // Catch:{ all -> 0x0240 }
            java.lang.Runnable r0 = r2.A06     // Catch:{ all -> 0x0240 }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x0240 }
            r4 = r44
            boolean r0 = r3.contains(r4)     // Catch:{ all -> 0x0240 }
            if (r0 != 0) goto L_0x0017
        L_0x0014:
            monitor-exit(r3)     // Catch:{ all -> 0x0240 }
            goto L_0x023f
        L_0x0017:
            java.lang.Object r0 = r3.peek()     // Catch:{ all -> 0x0240 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0240 }
            if (r0 != 0) goto L_0x0025
            r3.poll()     // Catch:{ all -> 0x0240 }
            goto L_0x0017
        L_0x0025:
            r7 = 0
            r1 = 1
            r15 = r48
            r10 = r49
            if (r50 != 0) goto L_0x0040
            boolean r0 = r47.isEmpty()     // Catch:{ all -> 0x0240 }
            if (r0 == 0) goto L_0x0040
            boolean r0 = r15.isEmpty()     // Catch:{ all -> 0x0240 }
            if (r0 == 0) goto L_0x0040
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x0240 }
            r5 = 0
            if (r0 != 0) goto L_0x0041
        L_0x0040:
            r5 = 1
        L_0x0041:
            java.util.List r0 = r2.A0H()     // Catch:{ all -> 0x0240 }
            if (r5 != 0) goto L_0x0071
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0240 }
            if (r5 != 0) goto L_0x0071
            int r5 = r2.A01     // Catch:{ all -> 0x0240 }
            int r5 = r5 + 1
            r2.A01 = r5     // Catch:{ all -> 0x0240 }
            r8 = 2131886709(0x7f120275, float:1.9408005E38)
            X.5ZO r7 = r2.A0E()     // Catch:{ all -> 0x0240 }
            X.4GP r6 = r2.A0l     // Catch:{ all -> 0x0240 }
            X.6lt r5 = new X.6lt     // Catch:{ all -> 0x0240 }
            r5.<init>(r7, r6, r8)     // Catch:{ all -> 0x0240 }
            r0.add(r5)     // Catch:{ all -> 0x0240 }
            r5 = r43
            java.util.List r5 = r2.A0I(r5, r4)     // Catch:{ all -> 0x0240 }
            r0.addAll(r5)     // Catch:{ all -> 0x0240 }
            if (r50 != 0) goto L_0x0238
            goto L_0x01a1
        L_0x0071:
            int r5 = r2.A02     // Catch:{ all -> 0x0240 }
            int r5 = r5 + 1
            r2.A02 = r5     // Catch:{ all -> 0x0240 }
            r14 = r42
            if (r42 == 0) goto L_0x008c
            java.util.List r6 = r14.A01     // Catch:{ all -> 0x0240 }
            boolean r5 = r6.isEmpty()     // Catch:{ all -> 0x0240 }
            if (r5 != 0) goto L_0x008c
            X.5Xb r5 = r2.A0X     // Catch:{ all -> 0x0240 }
            java.util.List r5 = r5.A01(r6, r7)     // Catch:{ all -> 0x0240 }
            r0.addAll(r5)     // Catch:{ all -> 0x0240 }
        L_0x008c:
            boolean r5 = r47.isEmpty()     // Catch:{ all -> 0x0240 }
            if (r5 != 0) goto L_0x00d3
            r15.size()     // Catch:{ all -> 0x0240 }
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0240 }
            java.util.Iterator r16 = r47.iterator()     // Catch:{ all -> 0x0240 }
        L_0x009d:
            boolean r5 = r16.hasNext()     // Catch:{ all -> 0x0240 }
            if (r5 == 0) goto L_0x00d0
            java.lang.Object r5 = r16.next()     // Catch:{ all -> 0x0240 }
            X.4lC r5 = (X.C91824lC) r5     // Catch:{ all -> 0x0240 }
            r6 = 19
            X.543 r12 = new X.543     // Catch:{ all -> 0x0240 }
            r12.<init>(r5, r6, r2)     // Catch:{ all -> 0x0240 }
            X.C162457s7.A0J(r5, r7)     // Catch:{ all -> 0x0240 }
            boolean r11 = r5.A01     // Catch:{ all -> 0x0240 }
            java.lang.String r9 = r5.A01     // Catch:{ all -> 0x0240 }
            java.lang.String r8 = r5.A00     // Catch:{ all -> 0x0240 }
            java.lang.String r6 = r5.A03     // Catch:{ all -> 0x0240 }
            X.4wG r5 = new X.4wG     // Catch:{ all -> 0x0240 }
            r20 = r8
            r21 = r6
            r22 = r11
            r19 = r9
            r18 = r12
            r17 = r5
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0240 }
            r13.add(r5)     // Catch:{ all -> 0x0240 }
            goto L_0x009d
        L_0x00d0:
            r0.addAll(r13)     // Catch:{ all -> 0x0240 }
        L_0x00d3:
            if (r42 == 0) goto L_0x0154
            java.util.List r8 = r14.A00     // Catch:{ all -> 0x0240 }
            boolean r5 = r8.isEmpty()     // Catch:{ all -> 0x0240 }
            if (r5 != 0) goto L_0x0154
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0240 }
            java.util.Iterator r14 = r8.iterator()     // Catch:{ all -> 0x0240 }
        L_0x00e5:
            boolean r5 = r14.hasNext()     // Catch:{ all -> 0x0240 }
            if (r5 == 0) goto L_0x0149
            java.lang.Object r5 = r14.next()     // Catch:{ all -> 0x0240 }
            X.5dy r5 = (X.C109035dy) r5     // Catch:{ all -> 0x0240 }
            java.lang.String r9 = r5.A03     // Catch:{ all -> 0x0240 }
            java.lang.String r8 = r5.A01     // Catch:{ all -> 0x0240 }
            java.lang.String r11 = r5.A02     // Catch:{ all -> 0x0240 }
            java.lang.String r23 = ""
            r12 = 0
            java.lang.Double r18 = java.lang.Double.valueOf(r12)     // Catch:{ all -> 0x0240 }
            r17 = 0
            boolean r5 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0240 }
            if (r5 == 0) goto L_0x0142
            java.util.ArrayList r30 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0240 }
        L_0x010b:
            r35 = 3
            java.util.ArrayList r31 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0240 }
            java.util.ArrayList r32 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0240 }
            X.5e1 r5 = new X.5e1     // Catch:{ all -> 0x0240 }
            r21 = r17
            r22 = r17
            r26 = r23
            r28 = r17
            r29 = r17
            r33 = r17
            r34 = r17
            r37 = r7
            r38 = r7
            r39 = r7
            r40 = r7
            r19 = r18
            r20 = r17
            r24 = r9
            r25 = r23
            r27 = r8
            r36 = r7
            r16 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0240 }
            r6.add(r5)     // Catch:{ all -> 0x0240 }
            goto L_0x00e5
        L_0x0142:
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch:{ all -> 0x0240 }
            java.util.List r30 = X.AnonymousClass0x9.A1A(r11, r5, r7)     // Catch:{ all -> 0x0240 }
            goto L_0x010b
        L_0x0149:
            r5 = 0
            r47.size()     // Catch:{ all -> 0x0240 }
            java.util.List r5 = r2.A0J(r5, r5, r6, r1)     // Catch:{ all -> 0x0240 }
            r0.addAll(r5)     // Catch:{ all -> 0x0240 }
        L_0x0154:
            boolean r5 = r10.isEmpty()     // Catch:{ all -> 0x0240 }
            if (r5 != 0) goto L_0x0165
            r5 = 0
            r47.size()     // Catch:{ all -> 0x0240 }
            java.util.List r5 = r2.A0J(r5, r5, r10, r7)     // Catch:{ all -> 0x0240 }
            r0.addAll(r5)     // Catch:{ all -> 0x0240 }
        L_0x0165:
            boolean r5 = r15.isEmpty()     // Catch:{ all -> 0x0240 }
            if (r5 != 0) goto L_0x0179
            r47.size()     // Catch:{ all -> 0x0240 }
            r6 = r45
            r5 = r46
            java.util.List r5 = r2.A0J(r6, r5, r15, r7)     // Catch:{ all -> 0x0240 }
            r0.addAll(r5)     // Catch:{ all -> 0x0240 }
        L_0x0179:
            if (r50 != 0) goto L_0x0230
            int r5 = r4.length()     // Catch:{ all -> 0x0240 }
            if (r5 <= r1) goto L_0x018f
            r5 = 3
            X.5ee r6 = new X.5ee     // Catch:{ all -> 0x0240 }
            r6.<init>(r5, r4, r2)     // Catch:{ all -> 0x0240 }
            X.6lZ r5 = new X.6lZ     // Catch:{ all -> 0x0240 }
            r5.<init>(r6)     // Catch:{ all -> 0x0240 }
            r0.add(r5)     // Catch:{ all -> 0x0240 }
        L_0x018f:
            boolean r5 = r15.isEmpty()     // Catch:{ all -> 0x0240 }
            if (r5 == 0) goto L_0x01a1
            boolean r5 = r10.isEmpty()     // Catch:{ all -> 0x0240 }
            if (r5 == 0) goto L_0x01a1
            int r5 = r2.A03     // Catch:{ all -> 0x0240 }
            int r5 = r5 + 1
            r2.A03 = r5     // Catch:{ all -> 0x0240 }
        L_0x01a1:
            X.5iG r13 = r2.A0N     // Catch:{ all -> 0x0240 }
            int r12 = r47.size()     // Catch:{ all -> 0x0240 }
            int r11 = r15.size()     // Catch:{ all -> 0x0240 }
            int r10 = r10.size()     // Catch:{ all -> 0x0240 }
            java.lang.Integer r14 = X.C105085Tn.A00(r2)     // Catch:{ all -> 0x0240 }
            r18 = 4
            java.util.LinkedHashMap r7 = X.C18320x8.A0r()     // Catch:{ all -> 0x0240 }
            int r5 = r4.length()     // Catch:{ all -> 0x0240 }
            long r5 = (long) r5     // Catch:{ all -> 0x0240 }
            r8 = 2
            X.3Z6[] r8 = new X.AnonymousClass3Z6[r8]     // Catch:{ all -> 0x0240 }
            java.lang.String r9 = "length"
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0240 }
            X.AnonymousClass3Z6.A04(r9, r5, r8)     // Catch:{ all -> 0x0240 }
            r9 = 0
            java.lang.String r5 = X.AnonymousClass2AB.A00(r4)     // Catch:{ all -> 0x0240 }
            int r6 = r5.length()     // Catch:{ all -> 0x0240 }
            r5 = 0
            if (r6 == 0) goto L_0x01ec
            java.lang.String r6 = X.AnonymousClass2AB.A00(r4)     // Catch:{ all -> 0x0240 }
            java.lang.String r5 = "\\s+"
            X.5rB r4 = new X.5rB     // Catch:{ all -> 0x0240 }
            r4.<init>((java.lang.String) r5)     // Catch:{ all -> 0x0240 }
            java.util.List r5 = r4.A01(r6, r9)     // Catch:{ all -> 0x0240 }
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch:{ all -> 0x0240 }
            java.lang.Object[] r4 = r5.toArray(r4)     // Catch:{ all -> 0x0240 }
            int r5 = r4.length     // Catch:{ all -> 0x0240 }
        L_0x01ec:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0240 }
            java.lang.String r4 = "words"
            X.AnonymousClass3Z6.A09(r4, r5, r8, r1)     // Catch:{ all -> 0x0240 }
            java.util.Map r5 = X.C73813g7.A0G(r8)     // Catch:{ all -> 0x0240 }
            java.lang.String r4 = "query"
            r7.put(r4, r5)     // Catch:{ all -> 0x0240 }
            java.util.LinkedHashMap r6 = X.C18320x8.A0r()     // Catch:{ all -> 0x0240 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0240 }
            java.lang.String r4 = "category_count"
            r6.put(r4, r5)     // Catch:{ all -> 0x0240 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0240 }
            java.lang.String r4 = "local_biz_count"
            r6.put(r4, r5)     // Catch:{ all -> 0x0240 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0240 }
            java.lang.String r4 = "api_biz_count"
            r6.put(r4, r5)     // Catch:{ all -> 0x0240 }
            java.lang.String r4 = "result"
            r7.put(r4, r6)     // Catch:{ all -> 0x0240 }
            r19 = 2
            java.lang.Integer r15 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0240 }
            r16 = r7
            r17 = r1
            r13.A09(r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0240 }
            goto L_0x0238
        L_0x0230:
            X.6lv r4 = new X.6lv     // Catch:{ all -> 0x0240 }
            r4.<init>(r1)     // Catch:{ all -> 0x0240 }
            r0.add(r4)     // Catch:{ all -> 0x0240 }
        L_0x0238:
            X.08J r1 = r2.A0F     // Catch:{ all -> 0x0240 }
            r1.A0G(r0)     // Catch:{ all -> 0x0240 }
            goto L_0x0014
        L_0x023f:
            return
        L_0x0240:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0240 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A0R(X.7Y3, X.7js, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, boolean):void");
    }

    public final void A0S(AnonymousClass5LW r15) {
        long j;
        if (r15.A05 != null) {
            C111545iG r2 = this.A0N;
            Integer A022 = this.A0W.A02();
            int size = r15.A05.A06.size();
            String str = r15.A0F;
            C105375Ur r1 = this.A0Y;
            List list = r1.A00;
            if (list != null) {
                j = (long) list.size();
            } else {
                j = 0;
            }
            r2.A02(r1.A05(), Boolean.valueOf(r1.A03), Boolean.valueOf(r1.A04), A022, str, "query", r1.A06(), size, C105085Tn.A00(this).intValue(), j);
        }
    }

    public final void A0T(C109065e1 r10) {
        this.A0X.A02(new C109035dy(System.currentTimeMillis(), r10.A0I, TextUtils.join(",", r10.A0L), r10.A0F));
    }

    public final void A0U(C109065e1 r14, String str, String str2, String str3, String str4, int i) {
        AnonymousClass1VX r1 = this.A0c.A03;
        if (C86634Kw.A1a(r1) && r1.A0X(2313)) {
            C150977Sy r2 = this.A0T;
            String str5 = r14.A0F;
            String str6 = this.A0W.A0P;
            String str7 = r14.A0H;
            Double d = r14.A02;
            C162457s7.A0J(str5, 0);
            r2.A00();
            C113885m9 r12 = new C113885m9(r2, d, str5, str, str2, str6, str7, str3, str4, i, 1);
            r2.A00 = r12;
            r2.A02.A06(r12);
        }
    }

    public final void A0X(String str, int i) {
        this.A0N.A09(C105085Tn.A00(this), (Integer) null, (Map) null, 2, 2, 0);
        AnonymousClass7H6 r10 = null;
        this.A05 = null;
        LinkedList linkedList = this.A0k;
        synchronized (linkedList) {
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                C112305jW r3 = this.A0W;
                r3.A0E(A0F());
                boolean z = true;
                this.A04 = 1;
                C06270Wx.A04(this.A0j, 3);
                linkedList.clear();
                if (A0G().isEmpty()) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    A0Y(A0s);
                    A0s.addAll(A0H());
                    boolean z2 = true;
                    if (this.A04 != 1) {
                        z2 = false;
                    }
                    A0s.add(new C96314wA(z2, false));
                    this.A0F.A0G(A0s);
                }
                r3.A0B.A03 = 9;
                int i2 = i;
                if (i2 != 2) {
                    z = false;
                }
                r3.A04 = z;
                int i3 = this.A04;
                AnonymousClass5ZO A0E2 = A0E();
                if (C157167hq.A00(A0E())) {
                    AnonymousClass5LW r0 = (AnonymousClass5LW) r3.A06.A07();
                    if (r0 != null) {
                        r10 = r0.A04;
                    } else {
                        r10 = new AnonymousClass7H6(150, (String) null);
                    }
                }
                A0Q(r10, this.A0Y.A01(), A0E2, str2, r3.A0P, i3, i2);
            }
        }
    }

    public final void A0Y(List list) {
        if (this.A0a.A00.A00 == 7 && this.A0c.A07()) {
            list.add(new C136106lr(this, (String) null));
        }
    }

    public final void A0Z(List list) {
        C105955Xb r2 = this.A0X;
        List A012 = r2.A01(C86644Kx.A0h(r2.A00), true);
        if (!A012.isEmpty()) {
            list.add(new C135936la(new C989453v(this, 43)));
        }
        list.addAll(A012);
    }

    public final void A0a(List list) {
        C112225jO r4 = this.A0a;
        AnonymousClass4UB r2 = r4.A00;
        int i = r2.A00;
        if (i == 1 || i == 3 || i == 5 || i == 6 || i == 4) {
            if (r2.A07() != null) {
                list.add(r2.A07());
            }
            this.A0M.A07(C112225jO.A00(r4), 25, r2.A0I());
        }
    }

    public final boolean A0b() {
        AnonymousClass5LW r0 = (AnonymousClass5LW) this.A0W.A06.A07();
        if (r0 == null || TextUtils.isEmpty(r0.A0F)) {
            return false;
        }
        return true;
    }

    public void BMN() {
        if (this.A0c.A07()) {
            C111525iE r2 = this.A0M;
            Integer A002 = C112225jO.A00(this.A0a);
            C95224sp A003 = C95224sp.A00(3);
            A003.A09 = A002;
            r2.A04(A003);
            this.A0Q.A02(true);
        }
        C06270Wx.A04(this.A0f, 3);
    }

    public void BOb() {
        AnonymousClass7HE A022 = this.A0Y.A02();
        if (A022 != null) {
            this.A0g.A0G(A022);
        }
    }

    public void BOe() {
        this.A0i.A0H(AnonymousClass0x9.A0C(AnonymousClass0x7.A0g(), A0E()));
        this.A0a.A03();
    }

    public void BOv(int i) {
        AnonymousClass4UC r2;
        int i2;
        if (i == 0 || i == 7 || i == 6) {
            this.A0M.A06(C112225jO.A00(this.A0a), 29, 0);
            r2 = this.A0i;
            i2 = 8;
        } else if (i == 3) {
            this.A0M.A06(C112225jO.A00(this.A0a), 29, 3);
            r2 = this.A0i;
            i2 = 5;
        } else {
            return;
        }
        r2.A0G(AnonymousClass0x9.A0C(Integer.valueOf(i2), A0E()));
    }

    public void BOy() {
        this.A0Y.A07();
        this.A0N.A03((Boolean) null, C105085Tn.A00(this), (String) null, 24);
        String A0F2 = A0F();
        if (A0F2 == null) {
            A0F2 = "";
        }
        String A0F3 = A0F();
        if (A0F3 == null) {
            A0F3 = "";
        }
        A0X(A0F2, A0D(A0F3));
    }

    public void BP0() {
        Log.e("BusinessDirectoryContextualSearchViewModel/onRetryNetworkClicked Should not reach here - no filters on this screen");
    }

    public void BRP(boolean z) {
        this.A0Y.A02 = z;
        this.A0N.A03(Boolean.valueOf(z), C105085Tn.A00(this), (String) null, 21);
        String A0F2 = A0F();
        if (A0F2 == null) {
            A0F2 = "";
        }
        A0X(A0F2, 1);
    }

    public void BUG(boolean z) {
        this.A0Y.A03 = z;
        this.A0N.A03(Boolean.valueOf(z), C105085Tn.A00(this), (String) null, 22);
        String A0F2 = A0F();
        if (A0F2 == null) {
            A0F2 = "";
        }
        A0X(A0F2, 1);
    }

    public void BVm() {
    }

    public void BVr() {
        C06270Wx.A04(this.A0f, 0);
        this.A0M.A06(C112225jO.A00(this.A0a), 34, 0);
    }

    public void BXM(boolean z) {
        this.A0Y.A04 = z;
        this.A0N.A03(Boolean.valueOf(z), C105085Tn.A00(this), (String) null, 9);
        String A0F2 = A0F();
        if (A0F2 == null) {
            A0F2 = "";
        }
        A0X(A0F2, 1);
    }

    public void Bab() {
        C112225jO r2 = this.A0a;
        r2.A02();
        r2.A00.A0K();
        C06270Wx.A04(this.A0f, 1);
        this.A0M.A06(C112225jO.A00(r2), 31, 0);
    }

    public void Bac() {
        synchronized (this.A0k) {
            A0N();
        }
    }

    public void Bb2() {
        Log.e("BusinessDirectoryContextualSearchViewModel/onSeeAllCategoriesClicked Should not reach here, no category screen view");
    }

    public final List A0H() {
        ArrayList A0s = AnonymousClass001.A0s();
        if (this.A0a.A00.A07() != null) {
            C86644Kx.A1L(this, A0s);
        }
        return A0s;
    }

    public final List A0I(C158377js r6, String str) {
        ArrayList A0s = AnonymousClass001.A0s();
        if (r6 != null) {
            ArrayList A0s2 = AnonymousClass001.A0s();
            A0s2.add(new C136166lx(str));
            List list = r6.A01;
            if (list != null && !list.isEmpty()) {
                A0s2.add(new C96394wI(list, new C124366Bz(this, 3)));
            }
            C06270Wx r2 = this.A0D;
            if (r2.A07() != null && !((C149337Mb) r2.A07()).A03.isEmpty()) {
                A0s2.add(new C136176ly(0));
                A0s2.addAll(((C149337Mb) r2.A07()).A03);
            }
            A0s.addAll(A0s2);
            return A0s;
        }
        A0s.add(new C136016li(this, str, 0));
        return A0s;
    }

    public final List A0J(String str, String str2, List list, boolean z) {
        String str3;
        ArrayList A0s = AnonymousClass001.A0s();
        int i = 0;
        while (true) {
            List list2 = list;
            if (i >= list2.size()) {
                return A0s;
            }
            AnonymousClass5ZO A0E2 = A0E();
            C109065e1 r6 = (C109065e1) list2.get(i);
            list2.size();
            String str4 = null;
            if (i > 0) {
                str3 = ((C109065e1) list2.get(i - 1)).A0H;
            } else {
                str3 = null;
            }
            if (i < AnonymousClass002.A03(list2)) {
                str4 = ((C109065e1) list2.get(i + 1)).A0H;
            }
            String str5 = str;
            String str6 = str2;
            boolean z2 = z;
            C112385je r4 = new C112385je(this, r6, str5, str6, str3, str4, i, z2);
            C1899393f r1 = new C1899393f(this, 1);
            AnonymousClass8FL r13 = new AnonymousClass8FL(this, r6, str5, str6, str3, str4, i);
            C86624Kv.A1O(A0E2, 1, r6);
            A0s.add(new C90754iG(r4, r1, r13, r6, A0E2.A04(), z2));
            i++;
        }
    }

    public final void A0M() {
        if (!A0b()) {
            ArrayList A0s = AnonymousClass001.A0s();
            A0a(A0s);
            if (this.A0a.A0A()) {
                A0Y(A0s);
                C86644Kx.A1L(this, A0s);
                A0Z(A0s);
            }
            this.A0E.A0G(A0s);
        }
    }

    public final void A0N() {
        if (!A0b() || !this.A0a.A0A()) {
            A0M();
            return;
        }
        String str = ((AnonymousClass5LW) this.A0W.A06.A07()).A0F;
        synchronized (this.A0k) {
            A0W(str);
        }
    }

    public void A0V(String str) {
        if (!TextUtils.isEmpty(str) && (this.A04 == 1 || TextUtils.isEmpty(A0F()))) {
            C111545iG r2 = this.A0N;
            int i = 1;
            if (this.A04 == 1) {
                i = 2;
            }
            r2.A09(C105085Tn.A00(this), 1, (Map) null, i, 7, 4);
        }
        synchronized (this.A0k) {
            AnonymousClass5IL r1 = this.A0L;
            C162457s7.A0J(str, 0);
            if (str.length() == 0 || r1.A00 == null) {
                r1.A00 = C86604Kt.A0k();
            }
            A0W(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        if (((X.C149337Mb) r1.A07()).A03.isEmpty() == false) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0W(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r4 = r6.trim()
            X.5jW r0 = r5.A0W
            r0.A0E(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r5.A0O()
            if (r0 != 0) goto L_0x008e
            java.util.LinkedList r0 = r5.A0k
            r0.add(r4)
            boolean r0 = r5.A08
            r3 = 1
            if (r0 != 0) goto L_0x0035
            X.8E9 r2 = r5.A0d
            java.util.Random r0 = r2.A01
            if (r0 != 0) goto L_0x0029
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r2.A01 = r0
        L_0x0029:
            long r0 = r0.nextLong()
            java.lang.String r0 = java.lang.Long.toHexString(r0)
            r2.A00 = r0
            r5.A08 = r3
        L_0x0035:
            int r0 = r5.A04
            if (r0 != r3) goto L_0x0041
            int r0 = r5.A0D(r6)
            r5.A0X(r4, r0)
            return
        L_0x0041:
            android.os.Handler r3 = r5.A0B
            java.lang.Runnable r2 = r5.A06
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)
            java.lang.Runnable r1 = r5.A07
            if (r1 == 0) goto L_0x0053
            android.os.Handler r0 = r5.A0C
            r0.removeCallbacks(r1)
        L_0x0053:
            r1 = 15
            X.3bv r0 = new X.3bv
            r0.<init>(r1, r4, r5)
            r5.A07 = r0
            boolean r0 = r5.A09
            if (r0 != 0) goto L_0x0076
            X.0Wx r1 = r5.A0D
            java.lang.Object r0 = r1.A07()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r1.A07()
            X.7Mb r0 = (X.C149337Mb) r0
            java.util.List r0 = r0.A03
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0084
        L_0x0076:
            X.5jO r0 = r5.A0a
            X.4UB r0 = r0.A00
            X.5ZO r2 = r0.A01
            if (r2 == 0) goto L_0x0084
            X.8uf r1 = r5.A0O
            r0 = 2
            r1.B39(r2, r0)
        L_0x0084:
            android.os.Handler r3 = r5.A0C
            java.lang.Runnable r2 = r5.A07
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x008e:
            java.util.LinkedList r2 = r5.A0k
            monitor-enter(r2)
            r2.clear()     // Catch:{ all -> 0x00a0 }
            android.os.Handler r1 = r5.A0B     // Catch:{ all -> 0x00a0 }
            java.lang.Runnable r0 = r5.A06     // Catch:{ all -> 0x00a0 }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x00a0 }
            r5.A0N()     // Catch:{ all -> 0x00a0 }
            monitor-exit(r2)     // Catch:{ all -> 0x00a0 }
            return
        L_0x00a0:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00a0 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A0W(java.lang.String):void");
    }

    public void BUT(AnonymousClass7T4 r5, int i) {
        ArrayList A0s = AnonymousClass001.A0s();
        C96304w9.A00(this, A0s, 2);
        this.A0E.A0G(A0s);
        this.A0M.A06(C112225jO.A00(this.A0a), 28, 2);
    }

    public void BWm() {
        BOe();
    }
}
