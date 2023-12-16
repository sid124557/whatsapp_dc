package X;

import androidx.car.app.IOnDoneCallback;

/* renamed from: X.0mL  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C12920mL implements Runnable {
    public final /* synthetic */ IOnDoneCallback A00;
    public final /* synthetic */ C15650ri A01;
    public final /* synthetic */ AnonymousClass0O9 A02;
    public final /* synthetic */ String A03;

    public final void run() {
        AnonymousClass0O9 r0 = this.A02;
        IOnDoneCallback iOnDoneCallback = this.A00;
        String str = this.A03;
        C15650ri r2 = this.A01;
        if (r0 == null || !AnonymousClass001.A1U(((AnonymousClass08A) r0).A02.compareTo(AnonymousClass0GC.CREATED))) {
            AnonymousClass0WP.A02(iOnDoneCallback, str, AnonymousClass000.A0H(r2, "Lifecycle is not at least created when dispatching ", AnonymousClass001.A0o()));
        } else {
            AnonymousClass0WP.A01(iOnDoneCallback, r2, str);
        }
    }

    public /* synthetic */ C12920mL(IOnDoneCallback iOnDoneCallback, C15650ri r2, AnonymousClass0O9 r3, String str) {
        this.A02 = r3;
        this.A00 = iOnDoneCallback;
        this.A03 = str;
        this.A01 = r2;
    }
}
