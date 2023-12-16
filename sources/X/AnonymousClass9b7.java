package X;

/* renamed from: X.9b7  reason: invalid class name */
public class AnonymousClass9b7 implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final AnonymousClass1VX A00;

    public void AyD(C55032pg r8, C624134x r9) {
        if (r9 instanceof C30431mR) {
            C30431mR r92 = (C30431mR) r9;
            AnonymousClass1A4 r5 = r8.A00;
            AnonymousClass1BM r0 = ((AnonymousClass1EU) r5.A00).paymentInviteMessage_;
            if (r0 == null) {
                r0 = AnonymousClass1BM.DEFAULT_INSTANCE;
            }
            C130546c9 A0H = r0.A0H();
            AnonymousClass23D A002 = AnonymousClass23D.A00(r92.A00);
            AnonymousClass1BM r1 = (AnonymousClass1BM) C18320x8.A0C(A0H);
            r1.serviceType_ = A002.value;
            r1.bitField0_ |= 1;
            long j = r92.A01;
            if (j > 0) {
                long A0B = C18290x4.A0B(j);
                AnonymousClass1BM r12 = (AnonymousClass1BM) C18320x8.A0C(A0H);
                r12.bitField0_ |= 2;
                r12.expiryTimestamp_ = A0B;
            }
            AnonymousClass1EU r13 = (AnonymousClass1EU) C18320x8.A0C(r5);
            AnonymousClass1BM r02 = (AnonymousClass1BM) A0H.A06();
            r02.getClass();
            r13.paymentInviteMessage_ = r02;
            r13.bitField1_ |= 4;
            return;
        }
        throw AnonymousClass001.A0c("FMessagePaymentInviteProtobuf/not supported message");
    }

    public C624134x BgW(C55962rC r7) {
        AnonymousClass1EU r2 = r7.A0B;
        if ((r2.bitField1_ & 4) == 0) {
            return null;
        }
        AnonymousClass1BM r0 = r2.paymentInviteMessage_;
        if (r0 == null) {
            r0 = AnonymousClass1BM.DEFAULT_INSTANCE;
        }
        AnonymousClass23D A002 = AnonymousClass23D.A00(r0.serviceType_);
        if (A002 == null) {
            A002 = AnonymousClass23D.UNKNOWN;
        }
        AnonymousClass23D r5 = AnonymousClass23D.UNKNOWN;
        if (A002 != r5) {
            AnonymousClass1VX r1 = this.A00;
            if (r1.A0X(423) || r1.A0X(544)) {
                AnonymousClass1BM r3 = r2.paymentInviteMessage_;
                if (r3 == null) {
                    r3 = AnonymousClass1BM.DEFAULT_INSTANCE;
                }
                C626936e.A06(r3);
                C30431mR r4 = new C30431mR(r7.A0D, r7.A05);
                AnonymousClass23D A003 = AnonymousClass23D.A00(r3.serviceType_);
                if (A003 == null) {
                    A003 = r5;
                }
                r4.A00 = A003.value;
                if ((r3.bitField0_ & 2) != 0) {
                    r4.A01 = r3.expiryTimestamp_ * 1000;
                }
                return r4;
            }
        }
        return r7.A03(0);
    }

    public AnonymousClass9b7(AnonymousClass1VX r1) {
        this.A00 = r1;
    }
}
