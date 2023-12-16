package X;

/* renamed from: X.9Ah  reason: invalid class name and case insensitive filesystem */
public class C190909Ah extends C196559b6 implements AnonymousClass4AG {
    public void AyD(C55032pg r5, C624134x r6) {
        if (r6 instanceof C30831nH) {
            C30291mD r62 = (C30291mD) r6;
            AnonymousClass1A4 r2 = r5.A00;
            AnonymousClass1AK r0 = ((AnonymousClass1EU) r2.A00).declinePaymentRequestMessage_;
            if (r0 == null) {
                r0 = AnonymousClass1AK.DEFAULT_INSTANCE;
            }
            C130546c9 A0H = r0.A0H();
            AnonymousClass1ET r02 = ((AnonymousClass1AK) A0H.A00).key_;
            if (r02 == null) {
                r02 = AnonymousClass1ET.DEFAULT_INSTANCE;
            }
            AnonymousClass1A1 r03 = (AnonymousClass1A1) r02.A0H();
            A00(r03, r62);
            AnonymousClass1AK r1 = (AnonymousClass1AK) C18320x8.A0C(A0H);
            AnonymousClass1ET r04 = (AnonymousClass1ET) r03.A06();
            r04.getClass();
            r1.key_ = r04;
            r1.bitField0_ |= 1;
            AnonymousClass1EU r22 = (AnonymousClass1EU) C18320x8.A0C(r2);
            AnonymousClass1AK r05 = (AnonymousClass1AK) A0H.A06();
            r05.getClass();
            r22.declinePaymentRequestMessage_ = r05;
            r22.bitField0_ |= 262144;
            return;
        }
        throw AnonymousClass001.A0c("FMessagePaymentRequestDeclinedProtobuf/not supported message");
    }

    public C624134x BgW(C55962rC r6) {
        AnonymousClass1EU r2 = r6.A0B;
        if ((r2.bitField0_ & 262144) == 0) {
            return null;
        }
        AnonymousClass1AK r0 = r2.declinePaymentRequestMessage_;
        if (r0 == null) {
            r0 = AnonymousClass1AK.DEFAULT_INSTANCE;
        }
        C626936e.A06(r0);
        AnonymousClass2z0 r4 = r6.A0D;
        long j = r6.A05;
        AnonymousClass1ET r02 = r0.key_;
        if (r02 == null) {
            r02 = AnonymousClass1ET.DEFAULT_INSTANCE;
        }
        String str = r02.id_;
        C30831nH r03 = new C30831nH(r4, j);
        r03.A00 = str;
        return r03;
    }
}
