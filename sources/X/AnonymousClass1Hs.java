package X;

/* renamed from: X.1Hs  reason: invalid class name */
public class AnonymousClass1Hs extends AnonymousClass3OH {
    public final C56972sr A00;
    public final AnonymousClass1VX A01;

    public void AyD(C55032pg r8, C624134x r9) {
        AnonymousClass22Y r0;
        if (r9 instanceof C30581mg) {
            C30581mg r92 = (C30581mg) r9;
            AnonymousClass2z0 A1v = r92.A1v();
            C95814uZ A002 = C30331mH.A00(r92);
            int i = r92.A00;
            AnonymousClass1A4 r3 = r8.A00;
            AnonymousClass1BP r02 = ((AnonymousClass1EU) r3.A00).scheduledCallEditMessage_;
            if (r02 == null) {
                r02 = AnonymousClass1BP.DEFAULT_INSTANCE;
            }
            C130546c9 A0H = r02.A0H();
            AnonymousClass1ET r03 = ((AnonymousClass1BP) A0H.A00).key_;
            if (r03 == null) {
                r03 = AnonymousClass1ET.DEFAULT_INSTANCE;
            }
            AnonymousClass1A1 A0X = AnonymousClass0x9.A0X(r03);
            C626936e.A06(A1v);
            C33051sM.A02(A002, A0X, A1v, false);
            AnonymousClass1BP r1 = (AnonymousClass1BP) C18320x8.A0C(A0H);
            r1.key_ = C18290x4.A0V(A0X);
            r1.bitField0_ |= 1;
            if (i == 1) {
                r0 = AnonymousClass22Y.CANCEL;
            } else {
                r0 = AnonymousClass22Y.UNKNOWN;
            }
            AnonymousClass1BP r12 = (AnonymousClass1BP) C18320x8.A0C(A0H);
            r12.editType_ = r0.value;
            r12.bitField0_ |= 2;
            AnonymousClass1BP r04 = (AnonymousClass1BP) A0H.A06();
            AnonymousClass1EU A0L = AnonymousClass0x2.A0L(r3, r04);
            A0L.scheduledCallEditMessage_ = r04;
            A0L.bitField1_ |= 1048576;
            return;
        }
        throw AnonymousClass001.A0c("FMessageScheduledCallEditProtobuf/not supported message");
    }

    public AnonymousClass1Hs(C56972sr r1, AnonymousClass1VX r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
