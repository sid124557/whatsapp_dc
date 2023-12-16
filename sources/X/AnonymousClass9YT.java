package X;

import java.util.List;

/* renamed from: X.9YT  reason: invalid class name */
public class AnonymousClass9YT implements C202249ld {
    public final C202249ld A00;
    public final C202249ld A01;
    public final List A02;
    public final /* synthetic */ C195639Yw A03;

    public AnonymousClass9YT(C195639Yw r1, C202249ld r2, C202249ld r3, List list) {
        this.A03 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = list;
    }

    public boolean cancel() {
        boolean z;
        synchronized (this.A03.A0A) {
            C202249ld r0 = this.A01;
            z = false;
            if (r0 != null) {
                z = false | r0.cancel();
            }
            C202249ld r02 = this.A00;
            if (r02 != null) {
                z |= r02.cancel();
            }
        }
        return z;
    }
}
