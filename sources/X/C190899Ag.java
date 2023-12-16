package X;

/* renamed from: X.9Ag  reason: invalid class name and case insensitive filesystem */
public class C190899Ag extends C196559b6 implements AnonymousClass4AG {
    public void AyD(C55032pg r5, C624134x r6) {
        if (r6 instanceof AnonymousClass1nG) {
            C30291mD r62 = (C30291mD) r6;
            AnonymousClass1A4 r2 = r5.A00;
            AnonymousClass1AJ r0 = ((AnonymousClass1EU) r2.A00).cancelPaymentRequestMessage_;
            if (r0 == null) {
                r0 = AnonymousClass1AJ.DEFAULT_INSTANCE;
            }
            C130546c9 A0H = r0.A0H();
            AnonymousClass1ET r02 = ((AnonymousClass1AJ) A0H.A00).key_;
            if (r02 == null) {
                r02 = AnonymousClass1ET.DEFAULT_INSTANCE;
            }
            AnonymousClass1A1 r03 = (AnonymousClass1A1) r02.A0H();
            A00(r03, r62);
            AnonymousClass1AJ r1 = (AnonymousClass1AJ) C18320x8.A0C(A0H);
            AnonymousClass1ET r04 = (AnonymousClass1ET) r03.A06();
            r04.getClass();
            r1.key_ = r04;
            r1.bitField0_ |= 1;
            AnonymousClass1EU r22 = (AnonymousClass1EU) C18320x8.A0C(r2);
            AnonymousClass1AJ r05 = (AnonymousClass1AJ) A0H.A06();
            r05.getClass();
            r22.cancelPaymentRequestMessage_ = r05;
            r22.bitField0_ |= 524288;
            return;
        }
        throw AnonymousClass001.A0c("FMessagePaymentRequestCancelledProtobuf/not supported message");
    }

    public C624134x BgW(C55962rC r6) {
        AnonymousClass1EU r2 = r6.A0B;
        if ((r2.bitField0_ & 524288) == 0) {
            return null;
        }
        AnonymousClass1AJ r0 = r2.cancelPaymentRequestMessage_;
        if (r0 == null) {
            r0 = AnonymousClass1AJ.DEFAULT_INSTANCE;
        }
        C626936e.A06(r0);
        AnonymousClass2z0 r4 = r6.A0D;
        long j = r6.A05;
        AnonymousClass1ET r02 = r0.key_;
        if (r02 == null) {
            r02 = AnonymousClass1ET.DEFAULT_INSTANCE;
        }
        String str = r02.id_;
        AnonymousClass1nG r03 = new AnonymousClass1nG(r4, j);
        r03.A00 = str;
        return r03;
    }
}
