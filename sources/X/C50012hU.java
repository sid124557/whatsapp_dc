package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.2hU  reason: invalid class name and case insensitive filesystem */
public class C50012hU {
    public final Handler A00;
    public final Handler A01;
    public final Handler A02;
    public final C28871hu A03;
    public final C29431io A04;
    public final C29271iY A05;

    public C50012hU(C28871hu r8, C56982ss r9, C28891hw r10, C29431io r11, C620233e r12, C29271iY r13) {
        this.A03 = r8;
        this.A04 = r11;
        this.A05 = r13;
        this.A00 = new C18820yJ(Looper.getMainLooper(), r8, this, r11);
        this.A02 = new C18830yK(Looper.getMainLooper(), r10, this, r11);
        Looper mainLooper = Looper.getMainLooper();
        this.A01 = new C18850yM(mainLooper, r8, r9, this, r11, r12);
    }

    public void A00(C624134x r4, int i) {
        this.A02.post(new C71733ca((Object) r4, (Object) this, i, 43));
    }

    public final void A01(C624134x r4, int i) {
        this.A04.A0C(r4, i);
        this.A03.A0A(AnonymousClass2z0.A00(r4), false);
        C624034w r1 = r4.A0P;
        if (r1 != null) {
            this.A05.A08(r1);
        }
    }
}
