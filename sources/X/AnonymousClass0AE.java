package X;

import android.view.ViewGroup;

/* renamed from: X.0AE  reason: invalid class name */
public class AnonymousClass0AE extends C08750f0 {
    public boolean A00 = false;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ AnonymousClass0A8 A02;

    public AnonymousClass0AE(ViewGroup viewGroup, AnonymousClass0A8 r3) {
        this.A02 = r3;
        this.A01 = viewGroup;
    }

    public void Bee(C10560i8 r3) {
        C05180Si.A01(this.A01, false);
        this.A00 = true;
    }

    public void Bef(C10560i8 r3) {
        if (!this.A00) {
            C05180Si.A01(this.A01, false);
        }
        r3.A0C(this);
    }

    public void Beg(C10560i8 r3) {
        C05180Si.A01(this.A01, false);
    }

    public void Beh(C10560i8 r3) {
        C05180Si.A01(this.A01, true);
    }
}
