package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.9jg  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201199jg implements Runnable {
    public final /* synthetic */ AnonymousClass9SG A00;
    public final /* synthetic */ Exception A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ boolean A03;

    public final void run() {
        boolean z = this.A03;
        AnonymousClass9SG r2 = this.A00;
        Object obj = this.A02;
        Exception exc = this.A01;
        if (z) {
            r2.A01(obj);
            return;
        }
        if (!(exc instanceof CancellationException)) {
            exc.getClass();
        }
        r2.A00(exc);
    }

    public /* synthetic */ C201199jg(AnonymousClass9SG r1, Exception exc, Object obj, boolean z) {
        this.A03 = z;
        this.A00 = r1;
        this.A02 = obj;
        this.A01 = exc;
    }
}
