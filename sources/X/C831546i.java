package X;

/* renamed from: X.46i  reason: invalid class name and case insensitive filesystem */
public final class C831546i extends AnonymousClass46A implements C84824Dv {
    public final String A00;
    public final Throwable A01;

    public final void A05() {
        String str;
        Throwable th = this.A01;
        if (th != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Module with the Main dispatcher had failed to initialize");
            String str2 = this.A00;
            if (str2 == null || (str = AnonymousClass000.A0V(". ", str2, AnonymousClass001.A0o())) == null) {
                str = "";
            }
            throw new IllegalStateException(AnonymousClass000.A0X(str, A0o), th);
        }
        throw AnonymousClass001.A0e("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public C831546i(String str, Throwable th) {
        this.A01 = th;
        this.A00 = str;
    }

    public AnonymousClass4C7 BGx(Runnable runnable, C85494Gl r3, long j) {
        A05();
        throw AnonymousClass000.A0L();
    }

    public /* bridge */ /* synthetic */ void Bkq(AnonymousClass4GW r2, long j) {
        A05();
        throw AnonymousClass000.A0L();
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Dispatchers.Main[missing");
        Throwable th = this.A01;
        if (th != null) {
            str = AnonymousClass000.A0P(th, ", cause=", AnonymousClass001.A0o());
        } else {
            str = "";
        }
        A0o.append(str);
        return AnonymousClass0x2.A0f(A0o);
    }
}
