package X;

/* renamed from: X.1Hq  reason: invalid class name */
public class AnonymousClass1Hq extends AnonymousClass3OH {
    public final C56972sr A00;
    public final AnonymousClass1VX A01;

    public void AyD(C55032pg r10, C624134x r11) {
        AnonymousClass23B r0;
        if (r11 instanceof C30551md) {
            C30551md r112 = (C30551md) r11;
            AnonymousClass2z0 A1v = r112.A1v();
            C95814uZ A002 = C30331mH.A00(r112);
            int i = r112.A01;
            long j = r112.A02;
            AnonymousClass1A4 r4 = r10.A00;
            AnonymousClass1CA r02 = ((AnonymousClass1EU) r4.A00).keepInChatMessage_;
            if (r02 == null) {
                r02 = AnonymousClass1CA.DEFAULT_INSTANCE;
            }
            C130546c9 A0H = r02.A0H();
            AnonymousClass1ET r03 = ((AnonymousClass1CA) A0H.A00).key_;
            if (r03 == null) {
                r03 = AnonymousClass1ET.DEFAULT_INSTANCE;
            }
            AnonymousClass1A1 A0X = AnonymousClass0x9.A0X(r03);
            C626936e.A06(A1v);
            C33051sM.A02(A002, A0X, A1v, false);
            AnonymousClass1CA r1 = (AnonymousClass1CA) C18320x8.A0C(A0H);
            r1.key_ = C18290x4.A0V(A0X);
            r1.bitField0_ |= 1;
            if (i == 1) {
                r0 = AnonymousClass23B.KEEP_FOR_ALL;
            } else {
                r0 = AnonymousClass23B.UNDO_KEEP_FOR_ALL;
            }
            AnonymousClass1CA r12 = (AnonymousClass1CA) C18320x8.A0C(A0H);
            r12.keepType_ = r0.value;
            r12.bitField0_ |= 2;
            AnonymousClass1CA r13 = (AnonymousClass1CA) C18320x8.A0C(A0H);
            r13.bitField0_ |= 4;
            r13.timestampMs_ = j;
            AnonymousClass1CA r04 = (AnonymousClass1CA) A0H.A06();
            AnonymousClass1EU A0L = AnonymousClass0x2.A0L(r4, r04);
            A0L.keepInChatMessage_ = r04;
            A0L.bitField1_ |= 256;
            return;
        }
        throw AnonymousClass001.A0c("FMessageKeepInChatProtobuf/not supported message");
    }

    public AnonymousClass1Hq(C56972sr r1, AnonymousClass1VX r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
