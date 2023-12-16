package X;

/* renamed from: X.3Nw  reason: invalid class name and case insensitive filesystem */
public class C67073Nw implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final C59322wj A00;

    public void AyD(C55032pg r8, C624134x r9) {
        if (r9 instanceof C30711mt) {
            C30811nC r1 = (C30811nC) r9;
            AnonymousClass1A4 r5 = r8.A00;
            AnonymousClass1AL r0 = ((AnonymousClass1EU) r5.A00).viewOnceMessageV2Extension_;
            if (r0 == null) {
                r0 = AnonymousClass1AL.DEFAULT_INSTANCE;
            }
            C209119u r6 = (C209119u) r0.A0H();
            C130546c9 A0H = r6.A09().A0H();
            AnonymousClass16H A02 = this.A00.A02(r8, r1);
            if (A02 == null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                C624134x.A0S(r9, "FMessageViewOnceAudio/unable to send encrypted media message due to missing mediaKey; key=", A0o);
                C624134x.A0U(r9, "; media_wa_type=", A0o);
                return;
            }
            AnonymousClass1E5 r2 = (AnonymousClass1E5) C18320x8.A0C(A02);
            r2.bitField0_ |= 16384;
            r2.viewOnce_ = true;
            AnonymousClass1EU A0T = C18290x4.A0T(A0H);
            AnonymousClass1E5 r02 = (AnonymousClass1E5) A02.A06();
            r02.getClass();
            A0T.audioMessage_ = r02;
            A0T.bitField0_ |= 128;
            AnonymousClass1AL A002 = C209119u.A00(A0H, r6);
            AnonymousClass1EU A0L = AnonymousClass0x2.A0L(r5, A002);
            A0L.viewOnceMessageV2Extension_ = A002;
            A0L.bitField1_ |= 16384;
            return;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        C624134x.A0T(r9, "FMessageViewOnceAudioProtobuf not support: ", A0o2);
        throw C18310x6.A0d(A0o2);
    }

    public C624134x BgW(C55962rC r7) {
        AnonymousClass1EU r1 = r7.A0B;
        if ((r1.bitField0_ & 128) == 0) {
            return null;
        }
        AnonymousClass1E5 r12 = r1.audioMessage_;
        AnonymousClass1E5 r5 = r12;
        if (r12 == null) {
            r12 = AnonymousClass1E5.DEFAULT_INSTANCE;
        }
        if ((r12.bitField0_ & 16384) == 0 || !r12.viewOnce_) {
            return null;
        }
        if (r5 == null) {
            r5 = AnonymousClass1E5.DEFAULT_INSTANCE;
        }
        AnonymousClass2z0 r4 = r7.A0D;
        C30711mt r13 = new C30711mt(r4, r7.A05);
        C59322wj.A01(r5, r4, r13, r7.A04());
        return r13;
    }

    public C67073Nw(C59322wj r1) {
        this.A00 = r1;
    }
}
