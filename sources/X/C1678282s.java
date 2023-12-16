package X;

import android.os.SystemClock;
import java.util.Map;

/* renamed from: X.82s  reason: invalid class name and case insensitive filesystem */
public final class C1678282s implements C183748qZ {
    public final /* synthetic */ C1678182q A00;
    public final /* synthetic */ AnonymousClass7FQ A01;
    public final /* synthetic */ AnonymousClass4GP A02;

    public C1678282s(C1678182q r1, AnonymousClass7FQ r2, AnonymousClass4GP r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void BSi() {
        C1678182q r1 = this.A00;
        r1.A06.clear();
        r1.A09.set(false);
    }

    public void BdH(Map map) {
        C1678182q r4 = this.A00;
        if (!r4.A06.BMR(map)) {
            r4.A00 = SystemClock.uptimeMillis() + ((long) 500);
        }
        C155277eb.A01.execute(r4.A00(this.A01, this.A02));
    }
}
