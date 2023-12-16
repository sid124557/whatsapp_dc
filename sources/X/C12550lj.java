package X;

import androidx.car.app.IOnDoneCallback;

/* renamed from: X.0lj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C12550lj implements Runnable {
    public final /* synthetic */ IOnDoneCallback A00;
    public final /* synthetic */ C15650ri A01;
    public final /* synthetic */ String A02;

    public final void run() {
        IOnDoneCallback iOnDoneCallback = this.A00;
        String str = this.A02;
        try {
            Object B1v = this.A01.B1v();
            AnonymousClass0WP.A03(new C09900gw(iOnDoneCallback, B1v, str, 0), AnonymousClass000.A0X(" onSuccess", AnonymousClass000.A0l(str)));
        } catch (RuntimeException e) {
            AnonymousClass0WP.A02(iOnDoneCallback, str, e);
            throw new RuntimeException(e);
        } catch (AnonymousClass0GR e2) {
            AnonymousClass0WP.A02(iOnDoneCallback, str, e2);
        }
    }

    public /* synthetic */ C12550lj(IOnDoneCallback iOnDoneCallback, C15650ri r2, String str) {
        this.A00 = iOnDoneCallback;
        this.A02 = str;
        this.A01 = r2;
    }
}
