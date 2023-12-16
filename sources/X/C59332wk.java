package X;

import java.util.Timer;

/* renamed from: X.2wk  reason: invalid class name and case insensitive filesystem */
public abstract class C59332wk {
    public static Timer A02 = new Timer();
    public boolean A00;
    public final C73433fU A01;

    public C59332wk() {
        C73433fU r1 = new C73433fU(this);
        this.A01 = r1;
        A02.schedule(r1, 20000);
    }
}
