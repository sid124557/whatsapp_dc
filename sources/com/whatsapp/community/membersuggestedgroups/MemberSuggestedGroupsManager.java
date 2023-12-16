package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass000;
import X.AnonymousClass20D;
import X.AnonymousClass218;
import X.AnonymousClass2MO;
import X.AnonymousClass31C;
import X.AnonymousClass4C6;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18290x4;
import X.C27991fJ;
import X.C29331ie;
import X.C33131sU;
import X.C380625j;
import X.C39802Dj;
import X.C39812Dk;
import X.C50852is;
import X.C53782nf;
import X.C616131n;
import X.C64333Db;
import X.C64773Ex;
import X.C69263Wi;
import X.C70193a6;
import X.C71823cj;
import X.C72043d5;
import X.C73723fy;
import X.C73813g7;
import X.C832246p;
import X.C84814Du;
import X.C85494Gl;
import X.C85524Gp;
import X.C85564Gt;
import com.whatsapp.community.iq.GetSuggestedGroupsProtocolHelper;
import com.whatsapp.community.iq.SubgroupSuggestionActionProtocolHelper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public final class MemberSuggestedGroupsManager {
    public final C39812Dk A00;
    public final C69263Wi A01;
    public final C33131sU A02;
    public final GetSuggestedGroupsProtocolHelper A03;
    public final SubgroupSuggestionActionProtocolHelper A04;
    public final C71823cj A05 = new C71823cj();
    public final C50852is A06;
    public final C64773Ex A07;
    public final C29331ie A08;
    public final AnonymousClass4C6 A09;
    public final C85524Gp A0A;
    public final C85564Gt A0B;

    public final SortedSet A03(C27991fJ r5) {
        C162457s7.A0J(r5, 0);
        C33131sU r3 = this.A02;
        SortedSet sortedSet = (SortedSet) r3.A06(r5);
        if (sortedSet != null) {
            return sortedSet;
        }
        List A002 = this.A06.A00(r5);
        TreeSet treeSet = new TreeSet(this.A05);
        C73723fy.A0T(A002, treeSet);
        r3.A09(r5, treeSet);
        return treeSet;
    }

    public final void A04(C53782nf r4, C27991fJ r5) {
        C18270x1.A14(r5, r4);
        this.A07.A0W(r5, false);
        this.A06.A02(C18290x4.A12(r4));
        if (A03(r5).add(r4)) {
            this.A01.A0S(new C70193a6(this, 15, r5));
        }
    }

    public final void A05(C27991fJ r9, C27991fJ r10, boolean z) {
        C18260x0.A0O(r9, r10);
        AnonymousClass4C6 r1 = this.A09;
        C616131n.A02((C85494Gl) null, new MemberSuggestedGroupsManager$fetchSuggestedGroups$1(this, r9, r10, (C84814Du) null, z), r1, (AnonymousClass20D) null, 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.AnonymousClass2A8.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.C27991fJ r10, java.lang.Iterable r11) {
        /*
            r9 = this;
            r3 = 0
            X.C18270x1.A14(r10, r11)
            java.util.SortedSet r0 = r9.A03(r10)
            java.util.Set r2 = X.C73723fy.A0P(r0)
            java.util.Set r0 = X.C73723fy.A0P(r11)
            X.C18270x1.A14(r2, r0)
            java.util.Set r1 = X.C73823g8.A00(r0, r2)
            java.util.Set r0 = X.C73823g8.A00(r2, r0)
            java.util.Set r0 = X.C73823g8.A01(r0, r1)
            boolean r0 = X.C18310x6.A1X(r0)
            if (r0 == 0) goto L_0x002a
            X.3Ex r0 = r9.A07
            r0.A0W(r10, r3)
        L_0x002a:
            X.2is r8 = r9.A06
            X.1RI r0 = r8.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083 }
            X.4Fq r6 = r0.A0C()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083 }
            X.3Yo r7 = r6.Axl()     // Catch:{ all -> 0x007c }
            java.util.List r1 = r8.A00(r10)     // Catch:{ all -> 0x0075 }
            java.util.Set r0 = X.C73723fy.A0P(r11)     // Catch:{ all -> 0x0075 }
            java.util.Set r0 = X.C73723fy.A0Q(r1, r0)     // Catch:{ all -> 0x0075 }
            java.util.ArrayList r5 = X.C73783g4.A0c(r0)     // Catch:{ all -> 0x0075 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x0075 }
        L_0x004a:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0065
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x0075 }
            X.2nf r0 = (X.C53782nf) r0     // Catch:{ all -> 0x0075 }
            X.1fJ r3 = r0.A03     // Catch:{ all -> 0x0075 }
            X.1fJ r2 = r0.A02     // Catch:{ all -> 0x0075 }
            com.whatsapp.jid.UserJid r1 = r0.A04     // Catch:{ all -> 0x0075 }
            X.2lC r0 = new X.2lC     // Catch:{ all -> 0x0075 }
            r0.<init>(r3, r2, r1)     // Catch:{ all -> 0x0075 }
            r5.add(r0)     // Catch:{ all -> 0x0075 }
            goto L_0x004a
        L_0x0065:
            r8.A01(r10, r5)     // Catch:{ all -> 0x0075 }
            r8.A02(r11)     // Catch:{ all -> 0x0075 }
            r7.A00()     // Catch:{ all -> 0x0075 }
            r7.close()     // Catch:{ all -> 0x007c }
            r6.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083 }
            goto L_0x0087
        L_0x0075:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r7, r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007e }
        L_0x007e:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083 }
        L_0x0083:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0087:
            X.1sU r2 = r9.A02
            X.3cj r1 = r9.A05
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>(r1)
            X.C73723fy.A0T(r11, r0)
            r2.A09(r10, r0)
            X.3Wi r2 = r9.A01
            r1 = 14
            X.3a6 r0 = new X.3a6
            r0.<init>(r9, r1, r10)
            r2.A0S(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager.A06(X.1fJ, java.lang.Iterable):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0104, code lost:
        if (r6.A02(r14, r5, false) == r4) goto L_0x0106;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00db A[Catch:{ 24M -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C27991fJ r14, X.C27991fJ r15, X.C84814Du r16) {
        /*
            r13 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C74423h6
            if (r0 == 0) goto L_0x011c
            r5 = r3
            X.3h6 r5 = (X.C74423h6) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x011c
            int r2 = r2 - r1
            r5.label = r2
        L_0x0014:
            java.lang.Object r1 = r5.result
            X.218 r4 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 3
            r7 = 2
            r2 = 0
            r12 = 1
            if (r0 == 0) goto L_0x0042
            if (r0 == r12) goto L_0x0038
            if (r0 == r7) goto L_0x002c
            if (r0 != r3) goto L_0x0123
            X.C57682u2.A01(r1)
        L_0x0029:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x002c:
            java.lang.Object r14 = r5.L$1
            X.1fJ r14 = (X.C27991fJ) r14
            java.lang.Object r6 = r5.L$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r6 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager) r6
            X.C57682u2.A01(r1)     // Catch:{ 24M -> 0x00dc }
            goto L_0x0029
        L_0x0038:
            java.lang.Object r14 = r5.L$1
            X.1fJ r14 = (X.C27991fJ) r14
            java.lang.Object r6 = r5.L$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r6 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager) r6
            goto L_0x00c7
        L_0x0042:
            X.C57682u2.A01(r1)
            X.2Dk r0 = r13.A00     // Catch:{ 24M -> 0x00de }
            X.3dX r0 = r0.A00     // Catch:{ 24M -> 0x00de }
            X.3Db r0 = r0.A01     // Catch:{ 24M -> 0x00de }
            X.2gi r0 = r0.Anh()     // Catch:{ 24M -> 0x00de }
            X.2Pe r8 = new X.2Pe     // Catch:{ 24M -> 0x00de }
            r8.<init>(r0, r14, r15)     // Catch:{ 24M -> 0x00de }
            r5.L$0 = r13     // Catch:{ 24M -> 0x00de }
            r5.L$1 = r14     // Catch:{ 24M -> 0x00de }
            r5.label = r12     // Catch:{ 24M -> 0x00de }
            X.3dl r9 = X.C57702u4.A02(r5)     // Catch:{ 24M -> 0x00de }
            X.2FL r0 = new X.2FL     // Catch:{ 24M -> 0x00de }
            r0.<init>(r9)     // Catch:{ 24M -> 0x00de }
            r8.A00 = r0     // Catch:{ 24M -> 0x00de }
            X.2gi r11 = r8.A01     // Catch:{ 24M -> 0x00de }
            com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsQueryImpl$Builder r6 = new com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsQueryImpl$Builder     // Catch:{ 24M -> 0x00de }
            r6.<init>()     // Catch:{ 24M -> 0x00de }
            X.1fJ r0 = r8.A03     // Catch:{ 24M -> 0x00de }
            java.lang.String r1 = r0.getRawString()     // Catch:{ 24M -> 0x00de }
            X.2ie r10 = r6.A00     // Catch:{ 24M -> 0x00de }
            java.lang.String r0 = "id"
            r10.A02(r0, r1)     // Catch:{ 24M -> 0x00de }
            boolean r0 = X.AnonymousClass000.A1W(r1)
            r6.A01 = r0     // Catch:{ 24M -> 0x00de }
            X.1fJ r0 = r8.A02     // Catch:{ 24M -> 0x00de }
            java.lang.String r1 = r0.getRawString()     // Catch:{ 24M -> 0x00de }
            java.lang.String r0 = "sub_group_hint_id"
            r10.A02(r0, r1)     // Catch:{ 24M -> 0x00de }
            boolean r0 = X.AnonymousClass000.A1W(r1)
            r6.A03 = r0     // Catch:{ 24M -> 0x00de }
            java.lang.String r1 = "INTERACTIVE"
            java.lang.String r0 = "query_context"
            r10.A02(r0, r1)     // Catch:{ 24M -> 0x00de }
            r6.A02 = r12     // Catch:{ 24M -> 0x00de }
            boolean r0 = r6.A01     // Catch:{ 24M -> 0x00de }
            X.C162187rP.A06(r0)     // Catch:{ 24M -> 0x00de }
            boolean r0 = r6.A03     // Catch:{ 24M -> 0x00de }
            X.C162187rP.A06(r0)     // Catch:{ 24M -> 0x00de }
            boolean r0 = r6.A02     // Catch:{ 24M -> 0x00de }
            X.C162187rP.A06(r0)     // Catch:{ 24M -> 0x00de }
            java.lang.String r6 = "QuerySuggestedGroups"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl> r1 = com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl.class
            X.7J9 r0 = new X.7J9     // Catch:{ 24M -> 0x00de }
            r0.<init>(r10, r1, r6)     // Catch:{ 24M -> 0x00de }
            X.2fG r1 = r11.A01(r0)     // Catch:{ 24M -> 0x00de }
            X.41X r0 = new X.41X     // Catch:{ 24M -> 0x00de }
            r0.<init>(r8)     // Catch:{ 24M -> 0x00de }
            r1.A01(r0)     // Catch:{ 24M -> 0x00de }
            java.lang.Object r1 = r9.A00()     // Catch:{ 24M -> 0x00de }
            if (r1 == r4) goto L_0x0106
            r6 = r13
            goto L_0x00ca
        L_0x00c7:
            X.C57682u2.A01(r1)     // Catch:{ 24M -> 0x00dc }
        L_0x00ca:
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ 24M -> 0x00dc }
            r6.A06(r14, r1)     // Catch:{ 24M -> 0x00dc }
            r5.L$0 = r6     // Catch:{ 24M -> 0x00dc }
            r5.L$1 = r14     // Catch:{ 24M -> 0x00dc }
            r5.label = r7     // Catch:{ 24M -> 0x00dc }
            java.lang.Object r0 = r6.A02(r14, r5, r2)     // Catch:{ 24M -> 0x00dc }
            if (r0 != r4) goto L_0x0029
            goto L_0x0128
        L_0x00dc:
            r0 = move-exception
            goto L_0x00e0
        L_0x00de:
            r0 = move-exception
            r6 = r13
        L_0x00e0:
            int r7 = r0.errorCode
            r0 = -1
            if (r7 == r0) goto L_0x0116
            r0 = 400(0x190, float:5.6E-43)
            if (r7 == r0) goto L_0x0116
            r0 = 403(0x193, float:5.65E-43)
            if (r7 == r0) goto L_0x0116
            r0 = 404(0x194, float:5.66E-43)
            if (r7 == r0) goto L_0x0116
            r0 = 500(0x1f4, float:7.0E-43)
            if (r0 > r7) goto L_0x0107
            r0 = 600(0x258, float:8.41E-43)
            if (r7 >= r0) goto L_0x010c
        L_0x00f9:
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.label = r3
            java.lang.Object r0 = r6.A02(r14, r5, r2)
            if (r0 != r4) goto L_0x0029
        L_0x0106:
            return r4
        L_0x0107:
            r0 = 429(0x1ad, float:6.01E-43)
            if (r7 != r0) goto L_0x010c
            goto L_0x00f9
        L_0x010c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MemberSuggestedGroupsManager/fetchSuggestedGroups/unknown error: "
            X.C18260x0.A0x(r0, r1, r7)
            goto L_0x00f9
        L_0x0116:
            X.3d3 r0 = X.C72023d3.A00
            r6.A06(r14, r0)
            goto L_0x00f9
        L_0x011c:
            X.3h6 r5 = new X.3h6
            r5.<init>(r13, r3)
            goto L_0x0014
        L_0x0123:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0128:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager.A00(X.1fJ, X.1fJ, X.4Du):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        if (r0 != r3) goto L_0x0094;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C27991fJ r8, X.C27991fJ r9, X.C84814Du r10, boolean r11) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C74593hN
            if (r0 == 0) goto L_0x0028
            r4 = r10
            X.3hN r4 = (X.C74593hN) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0028
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.218 r3 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r4.label
            r6 = 3
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 == r2) goto L_0x002e
            if (r0 == r5) goto L_0x0091
            if (r0 == r6) goto L_0x0091
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0028:
            X.3hN r4 = new X.3hN
            r4.<init>(r7, r10)
            goto L_0x0012
        L_0x002e:
            boolean r11 = r4.Z$0
            java.lang.Object r9 = r4.L$2
            X.1fJ r9 = (X.C27991fJ) r9
            java.lang.Object r8 = r4.L$1
            X.1fJ r8 = (X.C27991fJ) r8
            java.lang.Object r2 = r4.L$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r2 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager) r2
            X.C57682u2.A01(r1)
            goto L_0x006d
        L_0x0040:
            X.C57682u2.A01(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MemberSuggestedGroupsManager/fetch/parent: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", hint: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", mex: "
            X.C18260x0.A1E(r0, r1, r11)
            r4.L$0 = r7
            r4.L$1 = r8
            r4.L$2 = r9
            r4.Z$0 = r11
            r4.label = r2
            java.lang.Object r0 = r7.A02(r8, r4, r2)
            if (r0 == r3) goto L_0x007e
            r2 = r7
        L_0x006d:
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.L$2 = r0
            if (r11 == 0) goto L_0x007f
            r4.label = r5
            java.lang.Object r0 = r2.A00(r8, r9, r4)
        L_0x007c:
            if (r0 != r3) goto L_0x0094
        L_0x007e:
            return r3
        L_0x007f:
            r4.label = r6
            com.whatsapp.community.iq.GetSuggestedGroupsProtocolHelper r1 = r2.A03
            X.7SH r0 = new X.7SH
            r0.<init>(r2, r8)
            java.lang.Object r0 = r1.A00(r0, r8, r9, r4)
            if (r0 == r3) goto L_0x007e
            X.2wD r0 = X.C59022wD.A00
            goto L_0x007c
        L_0x0091:
            X.C57682u2.A01(r1)
        L_0x0094:
            X.2wD r0 = X.C59022wD.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager.A01(X.1fJ, X.1fJ, X.4Du, boolean):java.lang.Object");
    }

    public final Object A02(C27991fJ r4, C84814Du r5, boolean z) {
        C85524Gp r2 = this.A0A;
        Map map = (Map) r2.getValue();
        C162457s7.A0J(map, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        AnonymousClass000.A1C(r4, linkedHashMap, z);
        return AnonymousClass218.A00(r2.B2K(C73813g7.A0D(linkedHashMap), r5));
    }

    public MemberSuggestedGroupsManager(C39802Dj r6, C39812Dk r7, C69263Wi r8, C50852is r9, C64773Ex r10, C29331ie r11, AnonymousClass31C r12, AnonymousClass4C6 r13) {
        C18260x0.A0f(r12, r6, r7, r8, r9);
        C18260x0.A0U(r11, r10);
        C64333Db r2 = r6.A00.A01;
        C33131sU r22 = new C33131sU((C380625j) r2.ASN.get(), (AnonymousClass2MO) r2.AaQ.get(), "MemberSuggestedGroupsManager", 50);
        GetSuggestedGroupsProtocolHelper getSuggestedGroupsProtocolHelper = new GetSuggestedGroupsProtocolHelper(r12);
        SubgroupSuggestionActionProtocolHelper subgroupSuggestionActionProtocolHelper = new SubgroupSuggestionActionProtocolHelper(r12);
        this.A02 = r22;
        this.A03 = getSuggestedGroupsProtocolHelper;
        this.A00 = r7;
        this.A04 = subgroupSuggestionActionProtocolHelper;
        this.A01 = r8;
        this.A06 = r9;
        this.A08 = r11;
        this.A07 = r10;
        this.A09 = r13;
        C832246p r0 = new C832246p(C72043d5.A00());
        this.A0A = r0;
        this.A0B = r0;
    }
}
