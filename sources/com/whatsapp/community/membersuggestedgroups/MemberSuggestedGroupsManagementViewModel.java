package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass001;
import X.AnonymousClass0IV;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass20D;
import X.AnonymousClass20S;
import X.AnonymousClass20T;
import X.AnonymousClass218;
import X.AnonymousClass274;
import X.AnonymousClass3Z6;
import X.AnonymousClass3ZH;
import X.AnonymousClass4C8;
import X.AnonymousClass4HI;
import X.AnonymousClass4HJ;
import X.AnonymousClass8PR;
import X.AnonymousClass8UF;
import X.C05550Ty;
import X.C154567dN;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C27991fJ;
import X.C29241iV;
import X.C29331ie;
import X.C29441ip;
import X.C370320r;
import X.C51382jj;
import X.C51392jk;
import X.C53402n2;
import X.C53782nf;
import X.C56152rV;
import X.C56942so;
import X.C56972sr;
import X.C56982ss;
import X.C58422vE;
import X.C616131n;
import X.C64773Ex;
import X.C72023d3;
import X.C73153f1;
import X.C73783g4;
import X.C73853gB;
import X.C832246p;
import X.C84814Du;
import X.C85504Gn;
import X.C85524Gp;
import X.C85564Gt;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

public final class MemberSuggestedGroupsManagementViewModel extends C05550Ty {
    public int A00 = -1;
    public final C56972sr A01;
    public final C56942so A02;
    public final MemberSuggestedGroupsManager A03;
    public final C29441ip A04;
    public final C64773Ex A05;
    public final C56982ss A06;
    public final C56152rV A07;
    public final AnonymousClass1VX A08;
    public final C29241iV A09;
    public final AnonymousClass4HJ A0A;
    public final AnonymousClass4HI A0B;
    public final C29331ie A0C;
    public final C27991fJ A0D;
    public final C73853gB A0E;
    public final C85504Gn A0F;
    public final AnonymousClass4C8 A0G;
    public final C85524Gp A0H;
    public final C85524Gp A0I;
    public final C85524Gp A0J;
    public final C85524Gp A0K;
    public final C85564Gt A0L;
    public final C85564Gt A0M;
    public final C85564Gt A0N;
    public final C85564Gt A0O;

    public MemberSuggestedGroupsManagementViewModel(C56972sr r6, C56942so r7, MemberSuggestedGroupsManager memberSuggestedGroupsManager, C29441ip r9, C64773Ex r10, C56982ss r11, C56152rV r12, AnonymousClass1VX r13, C29241iV r14, C29331ie r15, C27991fJ r16, C73853gB r17) {
        C27991fJ r1 = r16;
        C18260x0.A0a(r1, r13, memberSuggestedGroupsManager, 1);
        C162457s7.A0J(r7, 5);
        C18260x0.A0g(r10, r14, r15, r9, r11);
        C18270x1.A13(r12, r6);
        this.A0D = r1;
        this.A0E = r17;
        this.A08 = r13;
        this.A03 = memberSuggestedGroupsManager;
        this.A02 = r7;
        this.A05 = r10;
        this.A09 = r14;
        this.A0C = r15;
        this.A04 = r9;
        this.A06 = r11;
        this.A07 = r12;
        this.A01 = r6;
        C832246p r0 = new C832246p(C72023d3.A00);
        this.A0J = r0;
        this.A0N = r0;
        C832246p r02 = new C832246p(AnonymousClass3Z6.A01(0, r7.A0F.A0O(C58422vE.A02, 1238) + 1));
        this.A0I = r02;
        this.A0M = r02;
        AnonymousClass8PR r03 = new AnonymousClass8PR(0);
        this.A0F = r03;
        this.A0G = C154567dN.A01(r03);
        C832246p r04 = new C832246p(AnonymousClass20T.MEMBER);
        this.A0K = r04;
        this.A0O = r04;
        C832246p r05 = new C832246p(AnonymousClass20S.LOADING);
        this.A0H = r05;
        this.A0L = r05;
        AnonymousClass4HJ r2 = new AnonymousClass4HJ(this, 2);
        this.A0A = r2;
        AnonymousClass4HI r06 = new AnonymousClass4HI(this, 4);
        this.A0B = r06;
        r15.A06(r2);
        r14.A06(r06);
    }

    public final void A0H(C370320r r11, boolean z) {
        C370320r r6 = r11;
        C162457s7.A0J(r11, 0);
        ArrayList A0s = AnonymousClass001.A0s();
        for (C51382jj r0 : (Iterable) this.A0N.getValue()) {
            Object obj = r0.A01;
            if ((obj instanceof C53402n2) && obj != null) {
                A0s.add(obj);
            }
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((C53402n2) next).A00 == 0) {
                A0s2.add(next);
            }
        }
        ArrayList A0c = C73783g4.A0c(A0s2);
        Iterator it2 = A0s2.iterator();
        while (it2.hasNext()) {
            A0c.add(((C53402n2) it2.next()).A02);
        }
        if (AnonymousClass0x7.A1S(A0c)) {
            C616131n.A02(this.A0E, new MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1(this, r6, A0c, (C84814Du) null, z), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 2);
        }
    }

    public static final /* synthetic */ void A00(MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel) {
        Object value;
        C56942so r2;
        C85524Gp r5 = memberSuggestedGroupsManagementViewModel.A0I;
        do {
            value = r5.getValue();
            r2 = memberSuggestedGroupsManagementViewModel.A02;
        } while (!r5.AzD(value, AnonymousClass3Z6.A01(Integer.valueOf(r2.A0H.A03(memberSuggestedGroupsManagementViewModel.A0D).size()), r2.A0F.A0O(C58422vE.A02, 1238) + 1)));
    }

    public static final /* synthetic */ void A01(MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel, Map map) {
        int i;
        C85524Gp r2 = memberSuggestedGroupsManagementViewModel.A0J;
        Iterable<C51382jj> iterable = (Iterable) r2.getValue();
        ArrayList A0c = C73783g4.A0c(iterable);
        for (C51382jj r4 : iterable) {
            Object obj = r4.A01;
            if (obj instanceof C53402n2) {
                C53402n2 r3 = (C53402n2) obj;
                C53782nf r8 = r3.A02;
                Number A0q = AnonymousClass0x9.A0q(r8.A02, map);
                if (A0q != null) {
                    i = A0q.intValue();
                } else {
                    i = r3.A00;
                }
                r4 = new C51382jj(r4.A00, new C53402n2(r3.A01, r8, r3.A04, r3.A03, r3.A05, i));
            }
            A0c.add(r4);
        }
        do {
        } while (!r2.AzD(r2.getValue(), A0c));
    }

    public void A0C() {
        this.A0C.A07(this.A0A);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        if (((X.C85544Gr) r7).Az8(r5, r0) != r4) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0D(java.util.List r10, X.C84814Du r11, X.AnonymousClass4GQ r12, int r13) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C74403h4
            if (r0 == 0) goto L_0x0026
            r5 = r11
            X.3h4 r5 = (X.C74403h4) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r7 = r5.result
            X.218 r4 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r1 = r5.label
            r6 = 0
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 == r0) goto L_0x002c
            if (r1 == r3) goto L_0x0074
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0026:
            X.3h4 r5 = new X.3h4
            r5.<init>(r9, r11)
            goto L_0x0012
        L_0x002c:
            int r13 = r5.I$0
            java.lang.Object r2 = r5.L$0
            X.C57682u2.A01(r7)
            goto L_0x0061
        L_0x0034:
            X.C57682u2.A01(r7)
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$subgroupAction$2 r8 = new com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$subgroupAction$2
            r8.<init>(r6, r12)
            r5.L$0 = r9
            r5.I$0 = r13
            r5.label = r0
            r0 = 0
            java.lang.Integer r0 = X.AnonymousClass0x9.A0k(r0)
            java.util.Map r0 = X.C57692u3.A04(r0, r10)
            X.46p r7 = new X.46p
            r7.<init>(r0)
            X.4C6 r2 = X.AnonymousClass0IV.A00(r9)
            X.3gB r1 = r9.A0E
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$sendSubgroupActionRequest$2$1 r0 = new com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$sendSubgroupActionRequest$2$1
            r0.<init>(r10, r6, r8, r7)
            X.C616131n.A02(r1, r0, r2, r6, r3)
            if (r7 == r4) goto L_0x0073
            r2 = r9
        L_0x0061:
            X.4Gr r7 = (X.C85544Gr) r7
            r1 = 0
            X.4Ir r0 = new X.4Ir
            r0.<init>(r2, r13, r1)
            r5.L$0 = r6
            r5.label = r3
            java.lang.Object r0 = r7.Az8(r5, r0)
            if (r0 != r4) goto L_0x0077
        L_0x0073:
            return r4
        L_0x0074:
            X.C57682u2.A01(r7)
        L_0x0077:
            X.3f0 r0 = new X.3f0
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A0D(java.util.List, X.4Du, X.4GQ, int):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0E(java.util.Map r9, X.C84814Du r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C74393h3
            if (r0 == 0) goto L_0x0078
            r4 = r10
            X.3h3 r4 = (X.C74393h3) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0078
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L_0x006b
            if (r0 != r3) goto L_0x0081
            java.lang.Object r6 = r4.L$1
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r2 = r4.L$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r2 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel) r2
            X.C57682u2.A01(r1)
        L_0x0028:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x007e
            java.util.Map$Entry r7 = X.AnonymousClass001.A0w(r6)
            int r1 = X.C18280x3.A06(r7)
            r0 = 2
            if (r1 == r0) goto L_0x0061
            r0 = 3
            if (r1 == r0) goto L_0x0057
            r0 = 4
            if (r1 != r0) goto L_0x0028
            int r0 = X.C18290x4.A06(r7)
            X.1OI r1 = new X.1OI
            r1.<init>(r0)
        L_0x0048:
            X.4Gn r0 = r2.A0F
            r4.L$0 = r2
            r4.L$1 = r6
            r4.label = r3
            java.lang.Object r0 = r0.BlD(r1, r4)
            if (r0 != r5) goto L_0x0028
            return r5
        L_0x0057:
            int r0 = X.C18290x4.A06(r7)
            X.1OJ r1 = new X.1OJ
            r1.<init>(r0)
            goto L_0x0048
        L_0x0061:
            int r0 = X.C18290x4.A06(r7)
            X.1OH r1 = new X.1OH
            r1.<init>(r0)
            goto L_0x0048
        L_0x006b:
            X.C57682u2.A01(r1)
            java.util.Map r0 = X.C57272tN.A01(r9)
            java.util.Iterator r6 = X.AnonymousClass000.A0q(r0)
            r2 = r8
            goto L_0x0028
        L_0x0078:
            X.3h3 r4 = new X.3h3
            r4.<init>(r8, r10)
            goto L_0x0012
        L_0x007e:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0081:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A0E(java.util.Map, X.4Du):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0086, code lost:
        if (r0 != r2) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0F(java.util.Map r10, X.C84814Du r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C74123gc
            if (r0 == 0) goto L_0x002c
            r3 = r11
            X.3gc r3 = (X.C74123gc) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002c
            int r2 = r2 - r1
            r3.label = r2
        L_0x0012:
            java.lang.Object r1 = r3.result
            X.218 r2 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r3.label
            r4 = 0
            r7 = 4
            r8 = 3
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 == r6) goto L_0x0055
            if (r0 == r5) goto L_0x0089
            if (r0 == r8) goto L_0x0077
            if (r0 == r7) goto L_0x0089
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x002c:
            X.3gc r3 = new X.3gc
            r3.<init>(r9, r11)
            goto L_0x0012
        L_0x0032:
            X.C57682u2.A01(r1)
            X.1fJ r0 = r9.A0D
            java.lang.Object r1 = r10.get(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            boolean r0 = X.C162457s7.A0P(r1, r0)
            X.4Gp r1 = r9.A0H
            if (r0 == 0) goto L_0x0069
            X.20S r0 = X.AnonymousClass20S.LOADING
            r3.L$0 = r9
            r3.label = r6
            java.lang.Object r0 = r1.B2K(r0, r3)
            if (r0 == r2) goto L_0x0088
            r0 = r9
            goto L_0x005c
        L_0x0055:
            java.lang.Object r0 = r3.L$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel) r0
            X.C57682u2.A01(r1)
        L_0x005c:
            X.4Gp r1 = r0.A0J
            X.3d3 r0 = X.C72023d3.A00
            r3.L$0 = r4
            r3.label = r5
            java.lang.Object r0 = r1.B2K(r0, r3)
            goto L_0x0086
        L_0x0069:
            X.20S r0 = X.AnonymousClass20S.READY
            r3.L$0 = r9
            r3.label = r8
            java.lang.Object r0 = r1.B2K(r0, r3)
            if (r0 == r2) goto L_0x0088
            r0 = r9
            goto L_0x007e
        L_0x0077:
            java.lang.Object r0 = r3.L$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel) r0
            X.C57682u2.A01(r1)
        L_0x007e:
            r3.L$0 = r4
            r3.label = r7
            java.lang.Object r0 = r0.A0G(r3)
        L_0x0086:
            if (r0 != r2) goto L_0x008c
        L_0x0088:
            return r2
        L_0x0089:
            X.C57682u2.A01(r1)
        L_0x008c:
            X.2wD r0 = X.C59022wD.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A0F(java.util.Map, X.4Du):java.lang.Object");
    }

    public final Object A0G(C84814Du r13) {
        Object obj;
        C53402n2 r2;
        boolean A0Y = this.A08.A0Y(C58422vE.A02, 5078);
        SortedSet<C53782nf> A032 = this.A03.A03(this.A0D);
        if (A0Y) {
            ArrayList A0s = AnonymousClass001.A0s();
            ArrayList A0s2 = AnonymousClass001.A0s();
            HashMap A0t = AnonymousClass001.A0t();
            for (C53782nf r7 : A032) {
                if (this.A0K.getValue() != AnonymousClass20T.MEMBER || this.A01.A0a(r7.A04)) {
                    if (r7.A07) {
                        C27991fJ r3 = r7.A02;
                        if (!A0t.containsKey(r3)) {
                            A0t.put(r3, AnonymousClass8UF.A0p(r7.A04));
                            A0I(r7, A0s);
                        } else {
                            List list = (List) A0t.get(r3);
                            if (list != null) {
                                list.add(r7.A04);
                            }
                        }
                    } else {
                        A0I(r7, A0s2);
                    }
                }
            }
            ArrayList A0s3 = AnonymousClass001.A0s();
            if (A0s.size() > 0) {
                A0s3.add(new C51382jj(2, new C51392jk(R.string.f11nameremoved, A0s.size())));
                A0s3.addAll(A0s);
            }
            if (A0s2.size() > 0) {
                A0s3.add(new C51382jj(2, new C51392jk(R.string.f11nameremoved, A0s2.size())));
                A0s3.addAll(A0s2);
            }
            this.A00 = A0s2.size() + A0s.size();
            obj = AnonymousClass218.A00(this.A0J.B2K(A0s3, r13));
        } else {
            ArrayList A0c = C73783g4.A0c(A032);
            for (C53782nf r72 : A032) {
                C64773Ex r22 = this.A05;
                A0c.add(new C51382jj(1, new C53402n2((AnonymousClass20T) this.A0O.getValue(), r72, r22.A0A(r72.A02), r22.A0A(r72.A04), new AnonymousClass274(this, 1), 0)));
            }
            ArrayList A0s4 = AnonymousClass001.A0s();
            Iterator it = A0c.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C51382jj r1 = (C51382jj) next;
                int ordinal = ((AnonymousClass20T) this.A0K.getValue()).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        C56972sr r32 = this.A01;
                        Object obj2 = r1.A01;
                        UserJid userJid = null;
                        if ((obj2 instanceof C53402n2) && (r2 = (C53402n2) obj2) != null) {
                            userJid = r2.A02.A04;
                        }
                        if (!r32.A0a(userJid)) {
                        }
                    } else {
                        throw C73153f1.A00();
                    }
                }
                A0s4.add(next);
            }
            this.A00 = A0s4.size();
            obj = this.A0J.B2K(A0s4, r13);
        }
        return AnonymousClass218.A00(obj);
    }

    public final void A0I(C53782nf r10, List list) {
        C64773Ex r1 = this.A05;
        AnonymousClass3ZH A0A2 = r1.A0A(r10.A02);
        AnonymousClass3ZH A0A3 = r1.A0A(r10.A04);
        AnonymousClass274 r7 = new AnonymousClass274(this, 0);
        list.add(new C51382jj(1, new C53402n2((AnonymousClass20T) this.A0O.getValue(), r10, A0A2, A0A3, r7, 0)));
    }
}
