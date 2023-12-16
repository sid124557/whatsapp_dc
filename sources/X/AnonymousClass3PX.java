package X;

/* renamed from: X.3PX  reason: invalid class name */
public final class AnonymousClass3PX implements AnonymousClass4D2 {
    public final AnonymousClass32U A00;

    public static final void A00(AnonymousClass1A3 r6, C624134x r7) {
        AnonymousClass23B r0;
        C30551md r4 = r7.A1S;
        if (r4 != null) {
            C130546c9 A0G = AnonymousClass1DX.DEFAULT_INSTANCE.A0G();
            if (r7.A0j() == 1) {
                r0 = AnonymousClass23B.KEEP_FOR_ALL;
            } else {
                r0 = AnonymousClass23B.UNDO_KEEP_FOR_ALL;
            }
            AnonymousClass1DX r1 = (AnonymousClass1DX) C18320x8.A0C(A0G);
            r1.keepType_ = r0.value;
            r1.bitField0_ |= 1;
            long j = r4.A0K;
            AnonymousClass1DX r12 = (AnonymousClass1DX) C18320x8.A0C(A0G);
            r12.bitField0_ |= 2;
            r12.serverTimestamp_ = j;
            long j2 = r4.A0K;
            AnonymousClass1DX r13 = (AnonymousClass1DX) C18320x8.A0C(A0G);
            r13.bitField0_ |= 32;
            r13.serverTimestampMs_ = j2;
            long j3 = r4.A02;
            AnonymousClass1DX r14 = (AnonymousClass1DX) C18320x8.A0C(A0G);
            r14.bitField0_ |= 16;
            r14.clientTimestampMs_ = j3;
            AnonymousClass1A1 A0Q = C18320x8.A0Q();
            AnonymousClass2z0 r02 = r4.A1J;
            AnonymousClass1A1.A00(A0Q, r02);
            A0Q.A0A(r02.A01);
            AnonymousClass1ET r03 = (AnonymousClass1ET) A0Q.A06();
            AnonymousClass1DX r15 = (AnonymousClass1DX) C18320x8.A0C(A0G);
            r03.getClass();
            r15.key_ = r03;
            r15.bitField0_ |= 4;
            AnonymousClass1ES A0X = C18310x6.A0X(r6);
            AnonymousClass1DX r04 = (AnonymousClass1DX) A0G.A06();
            r04.getClass();
            A0X.keepInChat_ = r04;
            A0X.bitField1_ |= 8;
        }
    }

    public final void A01(AnonymousClass1ES r12, C624134x r13) {
        if ((r12.bitField1_ & 8) != 0) {
            long A002 = AnonymousClass32U.A00(r12);
            C52042kn A003 = C52042kn.A00(r13);
            long j = r13.A1L;
            AnonymousClass1DX r1 = r12.keepInChat_;
            if (r1 == null) {
                r1 = AnonymousClass1DX.DEFAULT_INSTANCE;
            }
            AnonymousClass23B A004 = AnonymousClass23B.A00(r1.keepType_);
            if (A004 == null) {
                A004 = AnonymousClass23B.UNKNOWN;
            }
            boolean A1U = AnonymousClass000.A1U(A004.ordinal(), 1);
            AnonymousClass1ET r0 = r1.key_;
            if (r0 == null) {
                r0 = AnonymousClass1ET.DEFAULT_INSTANCE;
            }
            C162457s7.A0D(r0);
            C30551md r14 = new C30551md(AnonymousClass32U.A01(r0), A003, A1U ? 1 : 0, A002, j, r1.clientTimestampMs_);
            r13.A1S = r14;
            r13.A07 = r14.A01;
            C624134x.A0K(r13, 4);
        }
    }

    public AnonymousClass3PX(AnonymousClass32U r1) {
        this.A00 = r1;
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
