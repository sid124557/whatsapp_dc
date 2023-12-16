package X;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.LinkedList;

/* renamed from: X.7hI  reason: invalid class name and case insensitive filesystem */
public final class C156837hI {
    public boolean A00;
    public boolean A01;
    public final Choreographer.FrameCallback A02;
    public final Runnable A03;
    public final LinkedList A04;
    public final AnonymousClass66R A05;

    public C156837hI(boolean z) {
        this.A05 = AnonymousClass8P7.A00(AnonymousClass8XE.A00);
        this.A04 = AnonymousClass0x9.A18();
        C1895591t r1 = new C1895591t(this, 2);
        this.A02 = r1;
        if (C161827qc.A04()) {
            Choreographer.getInstance().postFrameCallback(r1);
        } else {
            ((Handler) this.A05.getValue()).postAtTime(new C117645sG((Object) this, 0), SystemClock.uptimeMillis());
        }
        this.A03 = new C117645sG((Object) this, 1);
    }

    public C156837hI() {
        this(false);
    }
}
