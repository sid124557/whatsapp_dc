package X;

import java.util.Set;

/* renamed from: X.3PD  reason: invalid class name */
public final class AnonymousClass3PD implements AnonymousClass4G3, AnonymousClass4D3 {
    public final AnonymousClass32U A00;

    public void AyB(C52952mJ r6, AnonymousClass1A3 r7, C624134x r8) {
        C30351mJ r4;
        C18270x1.A14(r8, r7);
        if (!(r8 instanceof C30351mJ) || (r4 = (C30351mJ) r8) == null) {
            throw AnonymousClass24A.A00(0);
        } else if (r4.A00 != 1000) {
            byte[] A1u = r4.A1u();
            r7.A0C(AnonymousClass23Q.A1i);
            if (A1u != null) {
                C172548Lq A09 = C18270x1.A09(r7, A1u);
                AnonymousClass1ES r2 = (AnonymousClass1ES) r7.A00;
                r2.bitField0_ |= 536870912;
                r2.futureproofData_ = A09;
            }
            AnonymousClass1A3.A01(r7, r4.A01);
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A0m(C624134x.A08(r8, "FMessageFutureHistorySync/buildHistorySyncProtobuf/skipFutureBotMessage key=", A0o), A0o);
            throw new AnonymousClass24A(69, "SkipFutureBotMessage");
        }
    }

    public Set B80() {
        return C18290x4.A13(AnonymousClass23Q.A1i);
    }

    public C624134x BgV(C50972j4 r5, AnonymousClass1ES r6) {
        C30351mJ r2 = new C30351mJ(this.A00.A02(r6), AnonymousClass32U.A00(r6));
        if ((r6.bitField0_ & 16) != 0) {
            AnonymousClass32Y.A0D(r6, r2);
        }
        if ((r6.bitField0_ & 536870912) != 0) {
            r2.A1j(r6.futureproofData_.A07());
        }
        if (C18310x6.A05(r6) > 0) {
            String A0n = AnonymousClass001.A0n(r6.messageStubParameters_, 0);
            C162457s7.A0D(A0n);
            r2.A01 = Integer.parseInt(A0n);
        }
        return r2;
    }

    public AnonymousClass3PD(AnonymousClass32U r1) {
        this.A00 = r1;
    }

    public AnonymousClass21E B88() {
        return AnonymousClass21E.STUB_MESSAGE;
    }
}
