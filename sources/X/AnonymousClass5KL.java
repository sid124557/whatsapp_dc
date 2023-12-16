package X;

import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5KL  reason: invalid class name */
public final class AnonymousClass5KL {
    public long A00;
    public AnonymousClass4GP A01 = AnonymousClass8XZ.A00;
    public final long A02;
    public final Handler A03;
    public final C56612sH A04;
    public final Runnable A05;

    public AnonymousClass5KL(C56612sH r4, TimeUnit timeUnit) {
        C162457s7.A0J(r4, 1);
        this.A04 = r4;
        this.A02 = timeUnit.toMillis(500);
        this.A03 = AnonymousClass000.A0A();
        this.A05 = new C117095rN(this, 25);
    }
}
