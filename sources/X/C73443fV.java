package X;

import java.util.TimerTask;

/* renamed from: X.3fV  reason: invalid class name and case insensitive filesystem */
public class C73443fV extends TimerTask {
    public final /* synthetic */ AnonymousClass331 A00;

    public C73443fV(AnonymousClass331 r1) {
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass331 r3 = this.A00;
        if (!r3.A00) {
            AnonymousClass331.A0M.remove(r3.A0K.toString());
            if (!r3.A01) {
                r3.A05.A0S(new C71273bq((Object) this, 11));
            }
            r3.A01(2);
        }
    }
}
