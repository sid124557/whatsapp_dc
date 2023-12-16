package X;

/* renamed from: X.3Np  reason: invalid class name and case insensitive filesystem */
public class C67003Np implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final C59322wj A00;

    public void AyD(C55032pg r4, C624134x r5) {
        C624134x.A0W(r5, "FMessageAudioProtobuf: message type is not supported ", AnonymousClass001.A0o(), r5 instanceof C30721mu);
        C30811nC r52 = (C30811nC) r5;
        AnonymousClass16H A02 = this.A00.A02(r4, r52);
        if (A02 != null) {
            AnonymousClass1EU A0T = C18290x4.A0T(r4.A00);
            AnonymousClass1E5 r0 = (AnonymousClass1E5) A02.A06();
            r0.getClass();
            A0T.audioMessage_ = r0;
            A0T.bitField0_ |= 128;
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        C624134x.A0S(r52, "FMessageAudio/unable to send encrypted media message due to missing mediaKey; key=", A0o);
        C624134x.A0U(r52, "; media_wa_type=", A0o);
    }

    public C624134x BgW(C55962rC r6) {
        AnonymousClass1EU r1 = r6.A0B;
        if ((r1.bitField0_ & 128) == 0) {
            return null;
        }
        AnonymousClass1E5 r12 = r1.audioMessage_;
        AnonymousClass1E5 r4 = r12;
        if (r12 == null) {
            r12 = AnonymousClass1E5.DEFAULT_INSTANCE;
        }
        if ((r12.bitField0_ & 16384) != 0 && r12.viewOnce_) {
            return null;
        }
        if (r4 == null) {
            r4 = AnonymousClass1E5.DEFAULT_INSTANCE;
        }
        AnonymousClass2z0 r2 = r6.A0D;
        C30721mu r3 = new C30721mu(r2, r6.A05);
        C59322wj.A01(r4, r2, r3, r6.A04());
        return r3;
    }

    public C67003Np(C59322wj r1) {
        this.A00 = r1;
    }
}
