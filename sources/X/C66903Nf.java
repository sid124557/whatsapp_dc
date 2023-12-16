package X;

/* renamed from: X.3Nf  reason: invalid class name and case insensitive filesystem */
public class C66903Nf implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public void AyD(C55032pg r7, C624134x r8) {
        if (r8 instanceof C30881nM) {
            AnonymousClass1A4 r5 = r7.A00;
            C209419x A02 = AnonymousClass1A4.A02(r5);
            boolean z = ((C30881nM) r8).A00;
            AnonymousClass1AM r0 = ((AnonymousClass1EM) A02.A00).initialSecurityNotificationSettingSync_;
            if (r0 == null) {
                r0 = AnonymousClass1AM.DEFAULT_INSTANCE;
            }
            C130546c9 A0H = r0.A0H();
            AnonymousClass1AM r1 = (AnonymousClass1AM) C18320x8.A0C(A0H);
            r1.bitField0_ |= 1;
            r1.securityNotificationEnabled_ = z;
            A02.A09(AnonymousClass23O.INITIAL_SECURITY_NOTIFICATION_SETTING_SYNC);
            AnonymousClass1EM A0W = C18310x6.A0W(A02);
            AnonymousClass1AM r02 = (AnonymousClass1AM) A0H.A06();
            r02.getClass();
            A0W.initialSecurityNotificationSettingSync_ = r02;
            A0W.bitField0_ |= 128;
            r5.A0D(A02);
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        throw AnonymousClass001.A0c(AnonymousClass000.A0R(C18310x6.A0c(r8, "Message type is not supported ", A0o), A0o));
    }

    public C624134x BgW(C55962rC r5) {
        if (C385428c.A00(r5) != AnonymousClass23O.INITIAL_SECURITY_NOTIFICATION_SETTING_SYNC) {
            return null;
        }
        C30881nM r1 = new C30881nM(r5.A0D, r5.A05);
        AnonymousClass1AM r0 = C55962rC.A00(r5).initialSecurityNotificationSettingSync_;
        if (r0 == null) {
            r0 = AnonymousClass1AM.DEFAULT_INSTANCE;
        }
        r1.A00 = r0.securityNotificationEnabled_;
        return r1;
    }
}
