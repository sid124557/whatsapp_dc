package X;

import java.util.List;

/* renamed from: X.1eR  reason: invalid class name and case insensitive filesystem */
public final class C27721eR extends AnonymousClass3PA {
    public final C56972sr A00;
    public final C57082t3 A01;
    public final AnonymousClass32U A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27721eR(C56972sr r2, C57082t3 r3, C66383Le r4, AnonymousClass32U r5) {
        super(r4);
        C18270x1.A11(r2, 1, r4);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r5;
    }

    public C624134x A01(C50972j4 r3, AnonymousClass1ES r4, C624134x r5) {
        C30461mU r0;
        if (!(r5 instanceof C30461mU) || (r0 = (C30461mU) r5) == null) {
            throw AnonymousClass24W.A00(0);
        }
        A03(r0, r4);
        return r5;
    }

    public final void A02(C30461mU r9, AnonymousClass1A3 r10) {
        C373922i r0;
        C162457s7.A0J(r9, 0);
        List<C30601mi> A1v = r9.A1v();
        if (A1v != null) {
            for (C30601mi r4 : A1v) {
                C130546c9 A0G = C21681Ct.DEFAULT_INSTANCE.A0G();
                C130546c9 A0G2 = AnonymousClass1BE.DEFAULT_INSTANCE.A0G();
                C372421m r02 = r4.A01;
                if (r02 != null) {
                    int ordinal = r02.ordinal();
                    if (ordinal == 1) {
                        r0 = C373922i.GOING;
                    } else if (ordinal == 2) {
                        r0 = C373922i.NOT_GOING;
                    } else if (ordinal == 0) {
                        r0 = C373922i.UNKNOWN;
                    } else {
                        throw C73153f1.A00();
                    }
                    AnonymousClass1BE r1 = (AnonymousClass1BE) C18320x8.A0C(A0G2);
                    r1.response_ = r0.value;
                    r1.bitField0_ |= 1;
                    long j = r4.A00;
                    AnonymousClass1BE r12 = (AnonymousClass1BE) C18320x8.A0C(A0G2);
                    r12.bitField0_ |= 2;
                    r12.timestampMs_ = j;
                    AnonymousClass1A1 A002 = C57082t3.A00(r4);
                    C21681Ct r13 = (C21681Ct) C18320x8.A0C(A0G);
                    r13.eventResponseMessageKey_ = C18290x4.A0V(A002);
                    r13.bitField0_ |= 1;
                    long j2 = r4.A0K;
                    C21681Ct r14 = (C21681Ct) C18320x8.A0C(A0G);
                    r14.bitField0_ |= 2;
                    r14.timestampMs_ = j2;
                    boolean A1X = AnonymousClass001.A1X(r4.A0D, 17);
                    C21681Ct r15 = (C21681Ct) C18320x8.A0C(A0G);
                    r15.bitField0_ |= 8;
                    r15.unread_ = A1X;
                    C21681Ct r16 = (C21681Ct) C18320x8.A0C(A0G);
                    AnonymousClass1BE r03 = (AnonymousClass1BE) A0G2.A06();
                    r03.getClass();
                    r16.eventResponseMessage_ = r03;
                    r16.bitField0_ |= 4;
                    AnonymousClass1ES A0X = C18310x6.A0X(r10);
                    C130786cX A06 = A0G.A06();
                    A06.getClass();
                    C188248ya r17 = A0X.eventResponses_;
                    if (!((AnonymousClass8T6) r17).A00) {
                        r17 = C130786cX.A07(r17);
                        A0X.eventResponses_ = r17;
                    }
                    r17.add(A06);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0086 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C30461mU r14, X.AnonymousClass1ES r15) {
        /*
            r13 = this;
            r0 = 1
            X.C162457s7.A0J(r14, r0)
            X.8ya r0 = r15.eventResponses_
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00b9
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            com.whatsapp.jid.UserJid r2 = r14.A0o()
            X.2z0 r0 = r14.A1J
            X.2kn r8 = new X.2kn
            r8.<init>(r2, r0)
            X.8ya r0 = r15.eventResponses_
            java.util.Iterator r4 = r0.iterator()
        L_0x0021:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r3 = r4.next()
            X.1Ct r3 = (X.C21681Ct) r3
            X.1ET r0 = r3.eventResponseMessageKey_
            if (r0 != 0) goto L_0x0033
            X.1ET r0 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x0033:
            X.C162457s7.A0D(r0)
            X.2z0 r7 = X.AnonymousClass32U.A01(r0)
            long r9 = r3.timestampMs_
            X.1BE r2 = r3.eventResponseMessage_
            r0 = r2
            if (r2 != 0) goto L_0x0043
            X.1BE r2 = X.AnonymousClass1BE.DEFAULT_INSTANCE
        L_0x0043:
            long r11 = r2.timestampMs_
            if (r0 != 0) goto L_0x0049
            X.1BE r0 = X.AnonymousClass1BE.DEFAULT_INSTANCE
        L_0x0049:
            int r2 = r0.response_
            if (r2 == 0) goto L_0x0093
            r0 = 1
            if (r2 == r0) goto L_0x0090
            r0 = 2
            if (r2 != r0) goto L_0x0093
            X.22i r0 = X.C373922i.NOT_GOING
        L_0x0055:
            X.C162457s7.A0D(r0)
            int r2 = r0.ordinal()
            r0 = 1
            if (r2 == r0) goto L_0x008d
            r0 = 2
            if (r2 == r0) goto L_0x008a
            r0 = 0
            if (r2 != r0) goto L_0x0096
            X.21m r6 = X.C372421m.UNKNOWN
        L_0x0067:
            X.1mi r5 = new X.1mi
            r5.<init>((X.C372421m) r6, (X.AnonymousClass2z0) r7, (X.C52042kn) r8, (long) r9, (long) r11)
            X.5Yw r2 = X.C95814uZ.A00
            X.1ET r0 = r3.eventResponseMessageKey_
            if (r0 != 0) goto L_0x0074
            X.1ET r0 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x0074:
            java.lang.String r0 = r0.participant_
            X.4uZ r0 = r2.A05(r0)
            r5.A1J(r0)
            boolean r0 = r3.unread_
            if (r0 != 0) goto L_0x0086
            r0 = 17
            r5.A1G(r0)
        L_0x0086:
            r1.add(r5)
            goto L_0x0021
        L_0x008a:
            X.21m r6 = X.C372421m.NOT_GOING
            goto L_0x0067
        L_0x008d:
            X.21m r6 = X.C372421m.GOING
            goto L_0x0067
        L_0x0090:
            X.22i r0 = X.C373922i.GOING
            goto L_0x0055
        L_0x0093:
            X.22i r0 = X.C373922i.UNKNOWN
            goto L_0x0055
        L_0x0096:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x009b:
            java.util.List r1 = X.C73723fy.A0F(r1)
            X.2sr r2 = r13.A00
            r0 = 1
            X.C162457s7.A0J(r2, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x00a9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r0 = r1.next()
            X.1mi r0 = (X.C30601mi) r0
            r14.A1w(r2, r0)
            goto L_0x00a9
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27721eR.A03(X.1mU, X.1ES):void");
    }

    public void AyB(C52952mJ r3, AnonymousClass1A3 r4, C624134x r5) {
        C30461mU r0;
        C162457s7.A0J(r5, 0);
        C18260x0.A0Q(r4, r3);
        if (!(r5 instanceof C30461mU) || (r0 = (C30461mU) r5) == null) {
            throw AnonymousClass24A.A00(0);
        }
        super.AyB(r3, r4, r5);
        A02(r0, r4);
    }
}
