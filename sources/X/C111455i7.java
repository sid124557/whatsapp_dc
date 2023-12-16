package X;

/* renamed from: X.5i7  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C111455i7 implements AnonymousClass64K {
    public final /* synthetic */ C009707r A00;
    public final /* synthetic */ AnonymousClass64K A01;
    public final /* synthetic */ AnonymousClass5TE A02;

    public final void B29(boolean z) {
        AnonymousClass5TE r4 = this.A02;
        C009707r r3 = this.A00;
        AnonymousClass64K r2 = this.A01;
        AnonymousClass356.A03(AnonymousClass000.A0b("WfalLauncherProxy/launchInternal/callback: isLaunched:", AnonymousClass001.A0o(), z));
        r4.A00 = true;
        r4.A01.A0D();
        AnonymousClass356.A01("WfalLauncherProxy/onLoadingAttemptComplete");
        if (!z) {
            r4.A00(r3);
        }
        r2.B29(z);
    }

    public /* synthetic */ C111455i7(C009707r r1, AnonymousClass64K r2, AnonymousClass5TE r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
