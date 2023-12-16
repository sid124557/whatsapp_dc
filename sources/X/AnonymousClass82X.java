package X;

import android.view.Choreographer;

/* renamed from: X.82X  reason: invalid class name */
public class AnonymousClass82X implements C183738qX {
    public long A00 = -1;
    public long A01 = -1;
    public boolean A02 = false;
    public final Choreographer.FrameCallback A03;
    public final Choreographer A04;
    public final AnonymousClass7AH A05;

    public void B1e() {
        this.A02 = false;
        this.A04.removeFrameCallback(this.A03);
    }

    public void B2L() {
        if (!this.A02) {
            this.A00 = -1;
        }
        this.A02 = true;
        this.A04.postFrameCallback(this.A03);
    }

    public AnonymousClass82X(Choreographer choreographer, AnonymousClass7AH r4) {
        this.A04 = choreographer;
        this.A05 = r4;
        this.A03 = new C166727zA(choreographer, this);
    }
}
