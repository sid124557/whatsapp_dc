package X;

import android.os.Handler;
import java.lang.ref.WeakReference;

/* renamed from: X.5OI  reason: invalid class name */
public final class AnonymousClass5OI {
    public WeakReference A00;
    public final Handler A01 = new Handler();
    public final C54292oU A02;
    public final C620733j A03;
    public final AnonymousClass4FS A04;
    public final Runnable A05 = new C117125rQ(this, 23);

    public final void A00(C184208rQ r11, double d, double d2) {
        this.A00 = AnonymousClass0x9.A14(r11);
        this.A01.postDelayed(this.A05, 5000);
        this.A04.BkM(new C117225ra(r11, this, d, d2));
    }

    public AnonymousClass5OI(C54292oU r3, C620733j r4, AnonymousClass4FS r5) {
        C18260x0.A0V(r3, r5, r4);
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
    }
}
