package X;

import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.11H  reason: invalid class name */
public class AnonymousClass11H extends C05550Ty {
    public int A00;
    public long A01;
    public C64633Eh A02;
    public AnonymousClass31A A03;
    public AnonymousClass3ZH A04;
    public Integer A05;
    public String A06;
    public String A07;
    public AnonymousClass4GP A08;
    public boolean A09;
    public boolean A0A = true;
    public final AnonymousClass08J A0B;
    public final AnonymousClass08M A0C;
    public final AnonymousClass08M A0D = AnonymousClass08M.A01();
    public final AnonymousClass08M A0E;
    public final AnonymousClass08M A0F;
    public final AnonymousClass08M A0G;
    public final AnonymousClass08M A0H;
    public final AnonymousClass08M A0I;
    public final C55682qk A0J;
    public final C39552Ck A0K;
    public final C69263Wi A0L;
    public final C56972sr A0M;
    public final C44272Vj A0N;
    public final C56942so A0O;
    public final C112675k7 A0P;
    public final C41342Jw A0Q;
    public final C71893cq A0R;
    public final MemberSuggestedGroupsManager A0S;
    public final C71833ck A0T;
    public final C64773Ex A0U;
    public final C56602sG A0V;
    public final C29421in A0W;
    public final AnonymousClass5ZU A0X;
    public final C56612sH A0Y;
    public final AnonymousClass33p A0Z;
    public final C56982ss A0a;
    public final AnonymousClass4FI A0b;
    public final C28891hw A0c;
    public final C66543Lv A0d;
    public final C56892sj A0e;
    public final C56152rV A0f;
    public final AnonymousClass1VX A0g;
    public final C66493Lq A0h;
    public final AnonymousClass4AQ A0i;
    public final C50932j0 A0j;
    public final C55702qm A0k;
    public final C29241iV A0l;
    public final C66503Lr A0m;
    public final C56252rg A0n;
    public final C29331ie A0o;
    public final AnonymousClass2UY A0p;
    public final AnonymousClass2WQ A0q;
    public final C52472lX A0r;
    public final C27991fJ A0s;
    public final AnonymousClass31C A0t;
    public final AnonymousClass33S A0u;
    public final C56452s0 A0v;
    public final C55832qz A0w;
    public final AnonymousClass107 A0x;
    public final AnonymousClass107 A0y;
    public final AnonymousClass107 A0z;
    public final AnonymousClass107 A10;
    public final AnonymousClass107 A11;
    public final C72173dI A12;
    public final AnonymousClass4UC A13;
    public final AnonymousClass4UC A14;
    public final AnonymousClass4UC A15;
    public final AnonymousClass4UC A16;
    public final AnonymousClass4FS A17;
    public final List A18;
    public final List A19;
    public final List A1A;
    public final List A1B;
    public final Set A1C;
    public final AnonymousClass4GP A1D;
    public final AnonymousClass4GP A1E;
    public final AnonymousClass4C6 A1F;

    public static AnonymousClass11H A00(C15940sD r2, C39542Cj r3, C105965Xc r4, C27991fJ r5) {
        return (AnonymousClass11H) new AnonymousClass0XL((C17190ui) new C86124Ix(r5, r3, r4, 0), r2).A01(AnonymousClass11H.class);
    }

    public void A0H(C27991fJ r8, String str) {
        if (str != null) {
            this.A07 = str;
        }
        AnonymousClass0x7.A18(this.A10);
        this.A0m.A0A(new C27531dy(this, this.A0c, this.A0h, r8, this.A07));
    }

    public void A0C() {
        this.A0o.A07(this.A0n);
        this.A0W.A07(this.A0V);
        this.A0c.A07(this.A0b);
        this.A0j.A01(this.A0i);
        this.A0l.A07(this.A0k);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0147, code lost:
        if (r4.Bqc(12, r5) == false) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0153, code lost:
        if (r9.isEmpty() == false) goto L_0x0155;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E() {
        /*
            r13 = this;
            java.util.List r7 = r13.A19
            r7.clear()
            java.util.List r6 = r13.A1B
            X.3cq r0 = r13.A0R
            java.util.Collections.sort(r6, r0)
            r0 = 1
            X.1fJ r5 = r13.A0s
            r13.A0G(r5, r5, r0)
            X.33p r0 = r13.A0Z
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "dismissed_invite_member_row"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 != 0) goto L_0x0045
            X.2sj r0 = r13.A0e
            boolean r0 = r0.A0H(r5)
            if (r0 == 0) goto L_0x0045
            X.2lX r1 = r13.A0r
            X.3ZH r0 = r13.A04
            boolean r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x0045
            X.2Vj r0 = r13.A0N
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0045
            X.4GP r0 = r13.A08
            X.2jm r1 = new X.2jm
            r1.<init>(r5, r0)
            r0 = 2
            r13.A0G(r5, r1, r0)
        L_0x0045:
            X.1VX r0 = r13.A0g
            boolean r0 = X.C56952sp.A0D(r0)
            if (r0 == 0) goto L_0x0072
            java.lang.Integer r0 = r13.A05
            if (r0 == 0) goto L_0x0072
            int r3 = r0.intValue()
            if (r3 <= 0) goto L_0x0072
            r0 = 1
            X.4Jv r1 = new X.4Jv
            r1.<init>(r13, r0)
            X.2sj r0 = r13.A0e
            boolean r0 = r0.A0D(r5)
            if (r0 == 0) goto L_0x0132
            X.20T r0 = X.AnonymousClass20T.ADMIN
        L_0x0067:
            X.5SR r2 = new X.5SR
            r2.<init>(r0, r5, r1, r3)
            r1 = 0
            r0 = 19
            r13.A0G(r1, r2, r0)
        L_0x0072:
            X.2sj r0 = r13.A0e
            boolean r0 = r0.A0D(r5)
            if (r0 == 0) goto L_0x007f
            r0 = 15
            r13.A0G(r5, r5, r0)
        L_0x007f:
            r0 = 16
            r13.A0G(r5, r5, r0)
            X.5k7 r4 = r13.A0P
            X.5Xc r3 = r4.A01
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x00be
            r0 = 3
            X.4Jv r8 = new X.4Jv
            r8.<init>(r13, r0)
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            java.util.Iterator r2 = r6.iterator()
        L_0x009a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x012f
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r8.invoke(r1)
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r0 == 0) goto L_0x009a
        L_0x00ae:
            X.2mC r1 = (X.C52882mC) r1
            if (r1 == 0) goto L_0x00be
            com.whatsapp.jid.GroupJid r2 = r1.A02
            r0 = 2
            X.4zQ r1 = new X.4zQ
            r1.<init>(r2, r0)
            r0 = 4
            r13.A0G(r2, r1, r0)
        L_0x00be:
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x01ed
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0136
            java.util.Iterator r12 = r6.iterator()
            r11 = 0
            r10 = 0
        L_0x00ce:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0136
            X.2mC r9 = X.AnonymousClass0x7.A0O(r12)
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x00e2
            int r1 = r9.A00
            r0 = 3
            if (r1 != r0) goto L_0x00e2
            goto L_0x00ce
        L_0x00e2:
            if (r11 != 0) goto L_0x00fc
            boolean r8 = r3.A0D
            r0 = 2131891665(0x7f1215d1, float:1.9418056E38)
            if (r8 == 0) goto L_0x00ee
            r0 = 2131891664(0x7f1215d0, float:1.9418054E38)
        L_0x00ee:
            r2 = 0
            r1 = 3
            if (r8 == 0) goto L_0x00f4
            r1 = 14
        L_0x00f4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13.A0G(r2, r0, r1)
            r11 = 1
        L_0x00fc:
            boolean r0 = r13.A09
            if (r0 != 0) goto L_0x0122
            X.2ss r1 = r13.A0a
            com.whatsapp.jid.GroupJid r0 = r9.A02
            boolean r0 = r1.A0M(r0)
            if (r0 == 0) goto L_0x0122
            if (r10 != 0) goto L_0x00ce
            boolean r1 = r13.A09
            X.4GP r0 = r13.A1E
            X.5Rf r8 = new X.5Rf
            r8.<init>(r0, r1)
            r2 = 0
            r1 = 20
            X.5Pt r0 = new X.5Pt
            r0.<init>(r2, r8, r1)
            r7.add(r0)
            r10 = 1
            goto L_0x00ce
        L_0x0122:
            com.whatsapp.jid.GroupJid r2 = r9.A02
            r0 = 2
            X.4zQ r1 = new X.4zQ
            r1.<init>(r2, r0)
            r0 = 4
            r13.A0G(r2, r1, r0)
            goto L_0x00ce
        L_0x012f:
            r1 = 0
            goto L_0x00ae
        L_0x0132:
            X.20T r0 = X.AnonymousClass20T.MEMBER
            goto L_0x0067
        L_0x0136:
            X.2so r0 = r13.A0O
            boolean r0 = r0.A0F(r5)
            r10 = 12
            r12 = 0
            r8 = 1
            if (r0 == 0) goto L_0x0149
            boolean r0 = r4.Bqc(r10, r5)
            r11 = 1
            if (r0 != 0) goto L_0x014a
        L_0x0149:
            r11 = 0
        L_0x014a:
            r2 = 0
            if (r11 != 0) goto L_0x0155
            java.util.List r9 = r13.A1A
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x01d7
        L_0x0155:
            boolean r4 = r3.A0D
            r0 = 2131891247(0x7f12142f, float:1.9417209E38)
            r1 = 3
            if (r4 == 0) goto L_0x0162
            r0 = 2131891246(0x7f12142e, float:1.9417207E38)
            r1 = 14
        L_0x0162:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13.A0G(r2, r0, r1)
            if (r11 == 0) goto L_0x016e
            r13.A0G(r5, r5, r10)
        L_0x016e:
            java.util.List r9 = r13.A1A
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x01d7
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            java.util.Iterator r10 = r9.iterator()
        L_0x017e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0199
            X.2mC r4 = X.AnonymousClass0x7.A0O(r10)
            java.util.Set r1 = r13.A1C
            com.whatsapp.jid.GroupJid r0 = r4.A02
            boolean r1 = r1.contains(r0)
            X.2lD r0 = new X.2lD
            r0.<init>(r4, r5, r1)
            r11.add(r0)
            goto L_0x017e
        L_0x0199:
            int r1 = r13.A00
            int r0 = r11.size()
            int r10 = java.lang.Math.min(r1, r0)
            r0 = -1
            if (r10 != r0) goto L_0x01aa
            int r10 = r11.size()
        L_0x01aa:
            X.3ck r0 = r13.A0T
            java.util.Collections.sort(r11, r0)
        L_0x01af:
            if (r12 >= r10) goto L_0x01c2
            java.lang.Object r4 = r11.get(r12)
            X.2lD r4 = (X.C52272lD) r4
            X.2mC r0 = r4.A00
            com.whatsapp.jid.GroupJid r1 = r0.A02
            r0 = 5
            r13.A0G(r1, r4, r0)
            int r12 = r12 + 1
            goto L_0x01af
        L_0x01c2:
            int r0 = r11.size()
            if (r0 <= r10) goto L_0x01d7
            int r4 = X.AnonymousClass0x9.A03(r11, r10)
            X.4GP r0 = r13.A1D
            X.5Re r1 = new X.5Re
            r1.<init>(r0, r4)
            r0 = 6
            r13.A0G(r2, r1, r0)
        L_0x01d7:
            int r1 = r6.size()
            r0 = 2
            if (r1 > r0) goto L_0x01ed
            X.4Jv r4 = new X.4Jv
            r4.<init>(r13, r0)
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x020d
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x020d
        L_0x01ed:
            r0 = 17
            r13.A0G(r5, r5, r0)
            r0 = 11
            r13.A0G(r5, r5, r0)
            X.107 r2 = r13.A0x
            int r1 = r6.size()
            java.util.List r0 = r13.A1A
            int r0 = r0.size()
            int r1 = r1 + r0
            X.C06270Wx.A04(r2, r1)
            X.107 r0 = r13.A11
            r0.A0G(r7)
            return
        L_0x020d:
            java.util.Iterator r1 = r6.iterator()
        L_0x0211:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ed
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r4.invoke(r0)
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r0 == 0) goto L_0x0211
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x01ed
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x01ed
            int r0 = r6.size()
            if (r0 != r8) goto L_0x0241
            r0 = 2131888899(0x7f120b03, float:1.9412446E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 14
            r13.A0G(r2, r1, r0)
        L_0x0241:
            java.lang.Integer r1 = X.AnonymousClass0x9.A0l(r6)
            r0 = 18
            r13.A0G(r2, r1, r0)
            goto L_0x01ed
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11H.A0E():void");
    }

    public final void A0F() {
        List list = this.A18;
        list.clear();
        list.addAll(this.A1B);
        list.addAll(this.A1A);
        this.A0y.A0G(list);
    }

    public final void A0G(C95814uZ r3, Object obj, int i) {
        if (this.A0P.Bqc(i, obj) && this.A02.Bqc(i, obj)) {
            this.A19.add(new C104125Pt(r3, obj, i));
        }
    }

    public final void A0I(C624134x r4, long j) {
        Set A20;
        if (r4 instanceof C31581oW) {
            C31581oW r42 = (C31581oW) r4;
            if (r42.A00 == 88 && r42.A0K > j) {
                A20 = r42.A03;
            } else {
                return;
            }
        } else if (r4 instanceof C31741om) {
            C31841ow r43 = (C31841ow) r4;
            if (r43.A0K > j) {
                A20 = r43.A20();
            } else {
                return;
            }
        } else {
            return;
        }
        if (A20 != null) {
            Iterator it = A20.iterator();
            while (it.hasNext()) {
                this.A1C.add(AnonymousClass0x7.A0O(it).A02);
            }
        }
    }

    public void A0D() {
        C18260x0.A1R(AnonymousClass001.A0o(), "CommunitySubgroupsViewModel/updateActivitySeen: ", this);
        C71553cI.A00(this.A12, this, 46);
    }

    public AnonymousClass11H(C55682qk r20, C39552Ck r21, C69263Wi r22, C56972sr r23, C44272Vj r24, C56942so r25, C112675k7 r26, C41342Jw r27, MemberSuggestedGroupsManager memberSuggestedGroupsManager, C64773Ex r29, C29421in r30, AnonymousClass5ZU r31, C56612sH r32, AnonymousClass33p r33, C56982ss r34, C28891hw r35, C66543Lv r36, C56892sj r37, C56152rV r38, AnonymousClass1VX r39, C66493Lq r40, C50932j0 r41, C29241iV r42, C66503Lr r43, C29331ie r44, AnonymousClass2UY r45, AnonymousClass2WQ r46, C52472lX r47, C27991fJ r48, AnonymousClass31C r49, AnonymousClass33S r50, C56452s0 r51, C55832qz r52, AnonymousClass4FS r53, AnonymousClass4C6 r54) {
        AnonymousClass08M A012;
        Boolean bool = Boolean.FALSE;
        AnonymousClass107 r8 = new AnonymousClass107(bool);
        this.A0z = r8;
        AnonymousClass107 r7 = new AnonymousClass107(bool);
        this.A10 = r7;
        this.A0C = AnonymousClass08M.A01();
        this.A0E = AnonymousClass08M.A01();
        AnonymousClass08J r6 = new AnonymousClass08J();
        this.A0B = r6;
        this.A0H = AnonymousClass08M.A01();
        this.A0I = AnonymousClass08M.A01();
        this.A11 = new AnonymousClass107(AnonymousClass001.A0s());
        this.A0y = new AnonymousClass107(AnonymousClass001.A0s());
        this.A0x = new AnonymousClass107(0);
        this.A16 = AnonymousClass0x9.A0b();
        this.A15 = AnonymousClass0x9.A0b();
        this.A14 = AnonymousClass0x9.A0b();
        this.A0G = AnonymousClass08M.A01();
        this.A13 = new AnonymousClass4UC((Object) null);
        this.A1E = new C86374Jw(this, 0);
        this.A19 = new CopyOnWriteArrayList();
        this.A18 = new CopyOnWriteArrayList();
        this.A1B = AnonymousClass001.A0s();
        this.A1A = AnonymousClass001.A0s();
        this.A1C = AnonymousClass002.A0K();
        this.A05 = null;
        this.A09 = false;
        this.A00 = -1;
        AnonymousClass4H9 r5 = new AnonymousClass4H9(this, 2);
        this.A0V = r5;
        C85864Hx r4 = new C85864Hx(this, 0);
        this.A0i = r4;
        AnonymousClass4HI r3 = new AnonymousClass4HI(this, 2);
        this.A0k = r3;
        AnonymousClass4HJ r2 = new AnonymousClass4HJ(this, 0);
        this.A0n = r2;
        AnonymousClass4IC r1 = new AnonymousClass4IC(this, 3);
        this.A0b = r1;
        this.A0T = new C71833ck();
        this.A08 = new C86374Jw(this, 1);
        this.A1D = new C86374Jw(this, 2);
        this.A0Y = r32;
        this.A0g = r39;
        this.A0L = r22;
        this.A0J = r20;
        this.A0M = r23;
        AnonymousClass4FS r10 = r53;
        this.A17 = r10;
        C56982ss r16 = r34;
        this.A0a = r16;
        this.A0u = r50;
        this.A0t = r49;
        C64773Ex r18 = r29;
        this.A0U = r18;
        this.A1F = r54;
        this.A0X = r31;
        C29421in r17 = r30;
        this.A0W = r17;
        this.A0q = r46;
        this.A0d = r36;
        this.A0w = r52;
        this.A0h = r40;
        this.A0m = r43;
        this.A0r = r47;
        this.A0v = r51;
        this.A0Z = r33;
        this.A0O = r25;
        C29331ie r15 = r44;
        this.A0o = r15;
        C28891hw r14 = r35;
        this.A0c = r14;
        this.A0N = r24;
        C50932j0 r13 = r41;
        this.A0j = r13;
        this.A0e = r37;
        this.A0Q = r27;
        C29241iV r12 = r42;
        this.A0l = r12;
        this.A0S = memberSuggestedGroupsManager;
        this.A0p = r45;
        this.A0K = r21;
        this.A0P = r26;
        C27991fJ r11 = r48;
        this.A0s = r11;
        this.A0f = r38;
        AnonymousClass3ZH A072 = r18.A07(r11);
        this.A04 = A072;
        if (A072 == null) {
            A012 = AnonymousClass08M.A01();
        } else {
            A012 = C18330xA.A01(A072);
        }
        this.A0F = A012;
        r15.A06(r2);
        r17.A06(r5);
        r14.A06(r1);
        r13.A00(r4);
        r12.A06(r3);
        C18260x0.A1R(AnonymousClass001.A0o(), "CommunitySubgroupsViewModel/init/Creating serialExecutor: ", this);
        this.A12 = new C72173dI(r10, false);
        this.A0R = new C71893cq(r16);
        AnonymousClass4K2.A01(r7, r6, this, 32);
        AnonymousClass4K2.A01(r8, r6, this, 32);
    }
}
