package X;

/* renamed from: X.3R8  reason: invalid class name */
public class AnonymousClass3R8 implements AnonymousClass4DC {
    public final /* synthetic */ C50592iR A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ Runnable A02;
    public final /* synthetic */ boolean A03;

    public AnonymousClass3R8(C50592iR r1, Runnable runnable, Runnable runnable2, boolean z) {
        this.A00 = r1;
        this.A03 = z;
        this.A02 = runnable;
        this.A01 = runnable2;
    }

    public void BRy() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("fpm/ExportHelper/setIntentToMigrateFlag()/failure, value: ");
        C18260x0.A1V(A0o, this.A03);
        Runnable runnable = this.A01;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void onSuccess() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("fpm/ExportHelper/setIntentToMigrateFlag()/success, value: ");
        C18260x0.A1V(A0o, this.A03);
        this.A02.run();
    }
}
