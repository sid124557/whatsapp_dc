package X;

/* renamed from: X.3OI  reason: invalid class name */
public class AnonymousClass3OI implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final AnonymousClass3NX A00;
    public final C59542x5 A01;
    public final C54472om A02;

    public final C209519y A00(C55032pg r11, C31961pA r12) {
        C374122n r0;
        boolean A022 = r11.A02();
        C209519y A012 = this.A02.A01((C209519y) AnonymousClass0x7.A0X(r11.A00).A0H(), r11.A01, r12, r11.A09, A022, r11.A03, r11.A02);
        AnonymousClass33C r3 = r12.A01;
        boolean A0C = AnonymousClass2z0.A0C(r12);
        if (r3 != null && ((A0C || A022 || r3.A0W != null) && A012 != null)) {
            AnonymousClass1ED A0S = C18290x4.A0S(A012);
            A0S.bitField0_ |= 128;
            A0S.gifPlayback_ = true;
            int i = r3.A05;
            if (i == 1) {
                r0 = C374122n.GIPHY;
            } else if (i != 2) {
                r0 = C374122n.NONE;
            } else {
                r0 = C374122n.TENOR;
            }
            AnonymousClass1ED r2 = (AnonymousClass1ED) C18320x8.A0C(A012);
            r2.gifAttribution_ = r0.value;
            r2.bitField0_ |= 65536;
        }
        return A012;
    }

    public void AyD(C55032pg r4, C624134x r5) {
        C624134x.A0W(r5, "FMessageGifProtobuf: message type is not supported ", AnonymousClass001.A0o(), r5 instanceof C31961pA);
        C31961pA r52 = (C31961pA) r5;
        if (C624134x.A0d(r52)) {
            AnonymousClass3NX.A00(new C85674He(this, 1), r4, r52);
            return;
        }
        C209519y A002 = A00(r4, r52);
        AnonymousClass33C r1 = r52.A01;
        boolean A0C = AnonymousClass2z0.A0C(r52);
        if (r1 == null || ((!A0C && !r4.A02() && r1.A0W == null) || A002 == null)) {
            C624134x.A0U(r52, "FMessageGif/unable to send encrypted media message due to missing mediaKey; media_wa_type=", AnonymousClass001.A0o());
        } else {
            r4.A00.A0I(A002);
        }
    }

    public C624134x BgW(C55962rC r10) {
        AnonymousClass1EU r1 = r10.A0B;
        if ((r1.bitField0_ & 256) == 0) {
            return null;
        }
        AnonymousClass1ED r0 = r1.videoMessage_;
        AnonymousClass1ED r4 = r0;
        if (r0 == null) {
            r0 = AnonymousClass1ED.DEFAULT_INSTANCE;
        }
        if (!r0.gifPlayback_) {
            return null;
        }
        if (r4 == null) {
            r4 = AnonymousClass1ED.DEFAULT_INSTANCE;
        }
        AnonymousClass2z0 r2 = r10.A0D;
        C31961pA r5 = new C31961pA(r2, r10.A05);
        boolean z = r2.A00 instanceof C95804uY;
        this.A02.A04(r4, r5, r10.A01, r10.A04(), r10.A0O);
        int i = r10.A01;
        boolean z2 = r10.A0N;
        if (i != 1 || z2) {
            AnonymousClass33C A002 = C30471mV.A00(r5);
            if ((r4.bitField0_ & 32) != 0) {
                A002.A05 = C626635z.A04(r4);
            }
        }
        AnonymousClass33C A003 = C30471mV.A00(r5);
        if (z || (r4.bitField0_ & 32) != 0) {
            A003.A05 = C626635z.A04(r4);
        }
        return r5;
    }

    public AnonymousClass3OI(AnonymousClass3NX r1, C59542x5 r2, C54472om r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
