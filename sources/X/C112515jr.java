package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5jr  reason: invalid class name and case insensitive filesystem */
public class C112515jr implements AnonymousClass660 {
    public final Handler A00;
    public final C54292oU A01;
    public final C54622p1 A02;
    public final AtomicBoolean A03 = new AtomicBoolean();

    public void A00(C106645Zu r3) {
        C18290x4.A1C(this.A00, r3, 1);
    }

    public void BcH(boolean z) {
        this.A03.set(true);
    }

    public void Bcs() {
        this.A03.set(false);
    }

    public C112515jr(C54292oU r3, C54622p1 r4) {
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = new C86864Md(Looper.getMainLooper(), this);
    }
}
