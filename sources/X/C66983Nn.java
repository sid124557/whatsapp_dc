package X;

/* renamed from: X.3Nn  reason: invalid class name and case insensitive filesystem */
public class C66983Nn implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final AnonymousClass1VX A00;

    public void AyD(C55032pg r6, C624134x r7) {
        if (r7 instanceof C30311mF) {
            C30311mF r72 = (C30311mF) r7;
            AnonymousClass2z0 r1 = r72.A1J;
            int i = r72.A00;
            AnonymousClass1A4 r3 = r6.A00;
            C209419x A02 = AnonymousClass1A4.A02(r3);
            AnonymousClass1ET r0 = ((AnonymousClass1EM) A02.A00).key_;
            if (r0 == null) {
                r0 = AnonymousClass1ET.DEFAULT_INSTANCE;
            }
            AnonymousClass1A1 A0X = AnonymousClass0x9.A0X(r0);
            AnonymousClass1A1.A00(A0X, r1);
            A02.A0A(A0X);
            AnonymousClass1EM A0W = C18310x6.A0W(A02);
            A0W.bitField0_ |= 4;
            A0W.ephemeralExpiration_ = i;
            A02.A09(AnonymousClass23O.EPHEMERAL_SETTING);
            if (C56952sp.A0G(this.A00)) {
                C209019t r12 = (C209019t) AnonymousClass1EP.DEFAULT_INSTANCE.A0G();
                r12.A0A(C57472th.A00(r72.A04));
                Boolean bool = r72.A0o;
                if (bool != null) {
                    r12.A0B(bool.booleanValue());
                }
                AnonymousClass1EP r02 = (AnonymousClass1EP) r12.A06();
                AnonymousClass1EM A0W2 = C18310x6.A0W(A02);
                r02.getClass();
                A0W2.disappearingMode_ = r02;
                A0W2.bitField0_ |= 512;
            }
            r3.A0D(A02);
            return;
        }
        throw AnonymousClass001.A0c("FMessageEphemeralSettingChangeProtobuf not supported message");
    }

    public C66983Nn(AnonymousClass1VX r1) {
        this.A00 = r1;
    }

    public C624134x BgW(C55962rC r6) {
        if (C385428c.A00(r6) != AnonymousClass23O.EPHEMERAL_SETTING) {
            return null;
        }
        AnonymousClass1EM A002 = C55962rC.A00(r6);
        C30311mF r2 = new C30311mF(r6.A0D, r6.A05);
        int i = A002.ephemeralExpiration_;
        r2.A1v(Integer.valueOf(i));
        if (i > 0 && C56952sp.A0G(this.A00)) {
            AnonymousClass1EP r0 = A002.disappearingMode_;
            if (r0 == null) {
                r0 = AnonymousClass1EP.DEFAULT_INSTANCE;
            }
            r2.A04 = C18300x5.A02(C18320x8.A02(r0.A0N(), 0));
            AnonymousClass1EP r02 = A002.disappearingMode_;
            if (r02 == null) {
                r02 = AnonymousClass1EP.DEFAULT_INSTANCE;
            }
            boolean z = r02.initiatedByMe_;
            if (Boolean.valueOf(z) != null) {
                boolean z2 = r2.A1J.A02;
                r2.A0o = Boolean.valueOf(AnonymousClass000.A1U(z2 ? 1 : 0, z ? 1 : 0));
            }
        }
        return r2;
    }
}
