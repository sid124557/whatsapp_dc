package X;

import android.os.Handler;

/* renamed from: X.7VZ  reason: invalid class name */
public final class AnonymousClass7VZ {
    public final Handler A00;
    public final C186238uy A01;

    public void A00(C150277Pz r3) {
        synchronized (r3) {
        }
        Handler handler = this.A00;
        if (handler != null) {
            AnonymousClass8MF.A00(handler, this, r3, 26);
        }
    }

    public AnonymousClass7VZ(Handler handler, C186238uy r2) {
        if (r2 != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.A00 = handler;
        this.A01 = r2;
    }
}
