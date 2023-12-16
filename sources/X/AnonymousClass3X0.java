package X;

/* renamed from: X.3X0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3X0 implements C84134Bd {
    public final /* synthetic */ C29031iA A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public final void AwB(Object obj) {
        C29031iA r1 = this.A00;
        String str = this.A01;
        boolean z = this.A02;
        if (str == null) {
            str = "user_initiated";
        }
        C29041iB r3 = r1.A0e;
        AnonymousClass3H4 r2 = new AnonymousClass3H4(r1, z);
        C18260x0.A0s("companion-device-manager/logoutDeviceInCompanionModeWithCallback: , removalReason ", str, AnonymousClass001.A0o());
        new AnonymousClass3TN(r2, C64333Db.A5u(r3.A08.A00.A01), str).A00(C56972sr.A03(r3.A0A));
    }

    public /* synthetic */ AnonymousClass3X0(C29031iA r1, String str, boolean z) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = z;
    }
}
