package X;

import android.text.TextUtils;

/* renamed from: X.3Ns  reason: invalid class name and case insensitive filesystem */
public class C67033Ns implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final C59542x5 A00;

    public void AyD(C55032pg r8, C624134x r9) {
        if (r9 instanceof C30801n8) {
            C30801n8 r92 = (C30801n8) r9;
            C614630w A0y = r92.A0y();
            AnonymousClass1A4 r5 = r8.A00;
            C21921Dr r0 = ((AnonymousClass1EU) r5.A00).liveLocationMessage_;
            if (r0 == null) {
                r0 = C21921Dr.DEFAULT_INSTANCE;
            }
            AnonymousClass172 r4 = (AnonymousClass172) r0.A0H();
            double d = r92.A00;
            C21921Dr r3 = (C21921Dr) C18320x8.A0C(r4);
            r3.bitField0_ |= 1;
            r3.degreesLatitude_ = d;
            double d2 = r92.A01;
            C21921Dr r32 = (C21921Dr) C18320x8.A0C(r4);
            r32.bitField0_ |= 2;
            r32.degreesLongitude_ = d2;
            boolean z = r8.A03;
            if (!z && A0y.A09() != null) {
                C172548Lq A09 = C18270x1.A09(r4, A0y.A09());
                C21921Dr r1 = (C21921Dr) r4.A00;
                r1.bitField0_ |= 256;
                r1.jpegThumbnail_ = A09;
            }
            AnonymousClass3Z2 r2 = r8.A01;
            byte[] bArr = r8.A09;
            if (C59542x5.A01(r2, r92, bArr)) {
                AnonymousClass1EF A02 = this.A00.A02(r2, r92, bArr, z);
                C21921Dr r12 = (C21921Dr) C18320x8.A0C(r4);
                A02.getClass();
                r12.contextInfo_ = A02;
                r12.bitField0_ |= 512;
            }
            if (!TextUtils.isEmpty(r92.A03)) {
                String str = r92.A03;
                C21921Dr r13 = (C21921Dr) C18320x8.A0C(r4);
                str.getClass();
                r13.bitField0_ |= 32;
                r13.caption_ = str;
            }
            long j = r92.A01;
            C21921Dr r14 = (C21921Dr) C18320x8.A0C(r4);
            r14.bitField0_ |= 64;
            r14.sequenceNumber_ = j;
            AnonymousClass1EU A0T = C18290x4.A0T(r5);
            C21921Dr r02 = (C21921Dr) r4.A06();
            r02.getClass();
            A0T.liveLocationMessage_ = r02;
            A0T.bitField0_ |= 65536;
            return;
        }
        throw AnonymousClass001.A0c("FMessageLiveLocationSerializer/not supported message");
    }

    public C624134x BgW(C55962rC r6) {
        AnonymousClass1EU r2 = r6.A0B;
        if ((r2.bitField0_ & 65536) == 0) {
            return null;
        }
        C21921Dr r4 = r2.liveLocationMessage_;
        if (r4 == null) {
            r4 = C21921Dr.DEFAULT_INSTANCE;
        }
        C626936e.A06(r4);
        C30801n8 r3 = new C30801n8(r6.A0D, r6.A05);
        r3.A02 = 1;
        r3.A00 = r4.degreesLatitude_;
        r3.A01 = r4.degreesLongitude_;
        if ((r4.bitField0_ & 256) != 0) {
            r3.A0y().A04(r4.jpegThumbnail_.A07(), r6.A0O);
        }
        if ((r4.bitField0_ & 32) != 0) {
            r3.A03 = r4.caption_;
        }
        r3.A01 = r4.sequenceNumber_;
        r3.A00 = r6.A00;
        return r3;
    }

    public C67033Ns(C59542x5 r1) {
        this.A00 = r1;
    }
}
