package X;

import java.util.List;

/* renamed from: X.9jK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200979jK implements Runnable {
    public final /* synthetic */ AnonymousClass9D7 A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ boolean A02;

    public final void run() {
        AnonymousClass9D7 r4 = this.A00;
        boolean z = this.A02;
        Runnable runnable = this.A01;
        List A0B = r4.A04.A0B();
        r4.A0G = A0B;
        r4.A03 = AnonymousClass8EA.A01(A0B);
        r4.A05.A0S(new C200969jJ(r4, runnable, z));
    }

    public /* synthetic */ C200979jK(AnonymousClass9D7 r1, Runnable runnable, boolean z) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = runnable;
    }
}
