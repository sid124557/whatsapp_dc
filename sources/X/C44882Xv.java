package X;

import android.os.PowerManager;

/* renamed from: X.2Xv  reason: invalid class name and case insensitive filesystem */
public class C44882Xv {
    public final C620633i A00;
    public volatile Boolean A01;

    public C44882Xv(C620633i r1) {
        this.A00 = r1;
    }

    public boolean A00() {
        Boolean valueOf;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PowerSaveModeStateProvider/getPowerSaveMode: [recentPowerSaveMode: ");
        A0o.append(this.A01);
        C18260x0.A1J(A0o, "]");
        if (this.A01 == null) {
            PowerManager A0J = this.A00.A0J();
            if (A0J == null) {
                valueOf = Boolean.TRUE;
            } else {
                valueOf = Boolean.valueOf(A0J.isPowerSaveMode());
            }
            this.A01 = valueOf;
        }
        return this.A01.booleanValue();
    }
}
