package X;

/* renamed from: X.1Hr  reason: invalid class name */
public final class AnonymousClass1Hr extends AnonymousClass3OH {
    public final C56972sr A00;
    public final AnonymousClass1VX A01;

    public AnonymousClass1Hr(C56972sr r1, AnonymousClass1VX r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public void AyD(C55032pg r8, C624134x r9) {
        AnonymousClass22l r0;
        boolean A1U = C18270x1.A1U(r9, r8);
        if (r9 instanceof C30561me) {
            C30561me r92 = (C30561me) r9;
            AnonymousClass1A4 r4 = r8.A00;
            AnonymousClass1CE r02 = ((AnonymousClass1EU) r4.A00).pinInChatMessage_;
            if (r02 == null) {
                r02 = AnonymousClass1CE.DEFAULT_INSTANCE;
            }
            C130546c9 A0H = r02.A0H();
            AnonymousClass1ET r03 = ((AnonymousClass1CE) A0H.A00).key_;
            if (r03 == null) {
                r03 = AnonymousClass1ET.DEFAULT_INSTANCE;
            }
            AnonymousClass1A1 A0X = AnonymousClass0x9.A0X(r03);
            AnonymousClass2z0 A1v = r92.A1v();
            C626936e.A06(A1v);
            C33051sM.A02(C30331mH.A00(r92), A0X, A1v, false);
            AnonymousClass1CE r1 = (AnonymousClass1CE) C18320x8.A0C(A0H);
            r1.key_ = C18290x4.A0V(A0X);
            r1.bitField0_ |= 1;
            if (r92.A00 == A1U) {
                r0 = AnonymousClass22l.PIN_FOR_ALL;
            } else {
                r0 = AnonymousClass22l.UNPIN_FOR_ALL;
            }
            AnonymousClass1CE r12 = (AnonymousClass1CE) C18320x8.A0C(A0H);
            r12.type_ = r0.value;
            r12.bitField0_ |= 2;
            long j = r92.A01;
            AnonymousClass1CE r13 = (AnonymousClass1CE) C18320x8.A0C(A0H);
            r13.bitField0_ |= 4;
            r13.senderTimestampMs_ = j;
            AnonymousClass1CE r04 = (AnonymousClass1CE) A0H.A06();
            AnonymousClass1EU A0L = AnonymousClass0x2.A0L(r4, r04);
            A0L.pinInChatMessage_ = r04;
            A0L.bitField1_ |= 262144;
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        C18260x0.A1T(A0o, "FMessagePinInChatProtobuf not supported message: ", r9);
        throw C18310x6.A0d(A0o);
    }
}
