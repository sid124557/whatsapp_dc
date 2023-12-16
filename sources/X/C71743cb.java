package X;

import com.whatsapp.Mp4Ops;
import com.whatsapp.R;
import java.io.File;

/* renamed from: X.3cb  reason: invalid class name and case insensitive filesystem */
public class C71743cb implements Runnable, AnonymousClass495 {
    public final C55682qk A00;
    public final C153407bG A01;
    public final C54292oU A02;
    public final C149087Kz A03;
    public volatile boolean A04 = false;

    public synchronized void cancel() {
        this.A04 = true;
    }

    public void run() {
        C135506km r1;
        C149087Kz r3 = this.A03;
        File file = r3.A02;
        try {
            Mp4Ops.A04(this.A01, file, false);
            r1 = new C135506km(file, AnonymousClass000.A1T(this.A04 ? 1 : 0));
        } catch (AnonymousClass6z0 e) {
            Mp4Ops.A00(this.A02.A00, this.A00, this.A01, file, e, "process video document");
            if (!this.A04) {
                r3.A01.B1x(R.string.f11nameremoved);
            }
            r1 = new C135506km(file, false);
        }
        r3.A00.BTX(r1);
    }

    public C71743cb(C55682qk r2, C153407bG r3, C54292oU r4, C149087Kz r5) {
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
    }
}
