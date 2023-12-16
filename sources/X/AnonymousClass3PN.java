package X;

/* renamed from: X.3PN  reason: invalid class name */
public final class AnonymousClass3PN implements AnonymousClass4D2 {
    public final C57082t3 A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass32U A02;

    public AnonymousClass3PN(C57082t3 r2, AnonymousClass1VX r3, AnonymousClass32U r4) {
        C162457s7.A0J(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass1ES r11, X.C624134x r12) {
        /*
            r10 = this;
            r8 = 1
            int r0 = r11.bitField1_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0080
            r7 = 0
            X.1VX r2 = r10.A01
            r1 = 3139(0xc43, float:4.399E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0080
            X.2kn r6 = X.C52042kn.A00(r12)
            long r2 = r12.A1L
            X.1DN r5 = r11.pinInChat_
            if (r5 != 0) goto L_0x0020
            X.1DN r5 = X.AnonymousClass1DN.DEFAULT_INSTANCE
        L_0x0020:
            long r0 = X.AnonymousClass32U.A00(r11)
            X.1ET r4 = r5.key_
            if (r4 != 0) goto L_0x002a
            X.1ET r4 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x002a:
            X.C162457s7.A0D(r4)
            X.2z0 r9 = X.AnonymousClass32U.A01(r4)
            X.1me r4 = new X.1me
            r4.<init>(r9, r0)
            int r1 = r5.type_
            if (r1 == 0) goto L_0x0084
            if (r1 == r8) goto L_0x0081
            r0 = 2
            if (r1 != r0) goto L_0x0084
            X.22u r0 = X.C374822u.UNPIN_FOR_ALL
        L_0x0041:
            int r0 = r0.ordinal()
            if (r0 != r8) goto L_0x0048
            r7 = 1
        L_0x0048:
            r4.A00 = r7
            long r0 = r5.senderTimestampMs_
            r4.A01 = r0
            long r0 = r5.serverTimestampMs_
            r4.A1x(r0)
            r4.A05 = r6
            r4.A02 = r2
            int r0 = r5.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0079
            X.1Ax r1 = r5.messageAddOnContextInfo_
            if (r1 != 0) goto L_0x0063
            X.1Ax r1 = X.C21201Ax.DEFAULT_INSTANCE
        L_0x0063:
            X.C162457s7.A0D(r1)
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0079
            int r1 = r1.messageAddOnDurationInSecs_
            if (r1 <= 0) goto L_0x0079
            boolean r0 = r4 instanceof X.C30561me
            if (r0 == 0) goto L_0x0079
            r4.A00 = r1
            r4.A1w()
        L_0x0079:
            r12.A1T = r4
            r0 = 8
            X.C624134x.A0K(r12, r0)
        L_0x0080:
            return
        L_0x0081:
            X.22u r0 = X.C374822u.PIN_FOR_ALL
            goto L_0x0041
        L_0x0084:
            X.22u r0 = X.C374822u.UNKNOWN_TYPE
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3PN.A01(X.1ES, X.34x):void");
    }

    public final void A00(AnonymousClass1A3 r7, C624134x r8) {
        C30561me r4;
        C374822u r0;
        if (AnonymousClass000.A1U(r8.A08 & 8, 8) && this.A01.A0Y(C58422vE.A02, 3139) && (r4 = r8.A1T) != null) {
            C130546c9 A0G = AnonymousClass1DN.DEFAULT_INSTANCE.A0G();
            AnonymousClass1A1 A002 = C57082t3.A00(r4);
            AnonymousClass1DN r1 = (AnonymousClass1DN) C18320x8.A0C(A0G);
            r1.key_ = C18290x4.A0V(A002);
            r1.bitField0_ |= 2;
            if (r4.A00 == 1) {
                r0 = C374822u.PIN_FOR_ALL;
            } else {
                r0 = C374822u.UNPIN_FOR_ALL;
            }
            AnonymousClass1DN r12 = (AnonymousClass1DN) C18320x8.A0C(A0G);
            r12.type_ = r0.value;
            r12.bitField0_ |= 1;
            long j = r4.A01;
            AnonymousClass1DN r13 = (AnonymousClass1DN) C18320x8.A0C(A0G);
            r13.bitField0_ |= 4;
            r13.senderTimestampMs_ = j;
            long j2 = r4.A03;
            AnonymousClass1DN r14 = (AnonymousClass1DN) C18320x8.A0C(A0G);
            r14.bitField0_ |= 8;
            r14.serverTimestampMs_ = j2;
            if (r4.A00 > 0) {
                C130546c9 A0G2 = C21201Ax.DEFAULT_INSTANCE.A0G();
                int i = r4.A00;
                C21201Ax r15 = (C21201Ax) C18320x8.A0C(A0G2);
                r15.bitField0_ |= 1;
                r15.messageAddOnDurationInSecs_ = i;
                AnonymousClass1DN r16 = (AnonymousClass1DN) C18320x8.A0C(A0G);
                C21201Ax r02 = (C21201Ax) A0G2.A06();
                r02.getClass();
                r16.messageAddOnContextInfo_ = r02;
                r16.bitField0_ |= 16;
            }
            AnonymousClass1ES A0X = C18310x6.A0X(r7);
            AnonymousClass1DN r03 = (AnonymousClass1DN) A0G.A06();
            r03.getClass();
            A0X.pinInChat_ = r03;
            A0X.bitField1_ |= 128;
        }
    }

    public void BYV(C52952mJ r1, AnonymousClass1A3 r2, C624134x r3) {
        C18260x0.A0O(r3, r2);
        A00(r2, r3);
    }

    public void BYW(C50972j4 r1, AnonymousClass1ES r2, C624134x r3) {
        C18260x0.A0O(r2, r3);
        A01(r2, r3);
    }
}
