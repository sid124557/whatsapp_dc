package X;

import android.os.Handler;

/* renamed from: X.2hS  reason: invalid class name and case insensitive filesystem */
public class C49992hS {
    public C33591tN A00;
    public String A01;
    public final AnonymousClass5ZU A02;
    public final C836149c A03;
    public final C28011fL A04;
    public final AnonymousClass4FS A05;

    public void A00() {
        C33591tN r2 = this.A00;
        if (r2 != null) {
            r2.A0D(false);
            Handler handler = r2.A00;
            if (handler != null) {
                handler.removeCallbacks(r2.A01);
            }
            r2.A00 = null;
            r2.A01 = null;
            this.A00 = null;
        }
    }

    public void A01() {
        C33591tN r2 = this.A00;
        boolean z = true;
        if (r2 != null) {
            z = false;
            r2.A0D(false);
            Handler handler = r2.A00;
            if (handler != null) {
                handler.removeCallbacks(r2.A01);
            }
            r2.A00 = null;
            r2.A01 = null;
            this.A00 = null;
        }
        C33591tN r1 = new C33591tN(this.A02, this, this.A04, z);
        this.A00 = r1;
        AnonymousClass0x7.A1B(r1, this.A05);
    }

    public C49992hS(AnonymousClass5ZU r1, C836149c r2, C28011fL r3, AnonymousClass4FS r4) {
        this.A05 = r4;
        this.A02 = r1;
        this.A04 = r3;
        this.A03 = r2;
    }
}
