package X;

import android.os.Handler;
import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* renamed from: X.1tN  reason: invalid class name and case insensitive filesystem */
public class C33591tN extends AnonymousClass5ZM {
    public Handler A00;
    public Runnable A01;
    public final long A02 = SystemClock.uptimeMillis();
    public final AnonymousClass5ZU A03;
    public final C28011fL A04;
    public final WeakReference A05;
    public final boolean A06;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A03.A0U(this.A04, 1, true);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Handler A0A = AnonymousClass000.A0A();
        this.A00 = A0A;
        C71323bv r4 = new C71323bv(30, (String) obj, this);
        this.A01 = r4;
        if (this.A06) {
            A0A.postAtTime(r4, this.A02 + 3000);
        } else {
            r4.run();
        }
    }

    public C33591tN(AnonymousClass5ZU r3, C49992hS r4, C28011fL r5, boolean z) {
        this.A03 = r3;
        this.A05 = AnonymousClass0x9.A14(r4);
        this.A04 = r5;
        this.A06 = z;
    }
}
