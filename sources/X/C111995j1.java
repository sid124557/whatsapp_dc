package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.biz.cart.view.fragment.CartFragment;

/* renamed from: X.5j1  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C111995j1 implements C181858nS {
    public final /* synthetic */ C181718nD A00;
    public final /* synthetic */ C90314h4 A01;
    public final /* synthetic */ CartFragment A02;

    public final void BV4(long j) {
        C90314h4 r0 = this.A01;
        C181718nD r2 = this.A00;
        CartFragment cartFragment = this.A02;
        r2.B76(r0.A01());
        View A0J = cartFragment.A0J();
        C620733j r3 = cartFragment.A0n;
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1Q(A0L, 0, j);
        C86644Kx.A16(A0J, r3.A0L(A0L, R.plurals.f9nameremoved, j), -1);
    }

    public /* synthetic */ C111995j1(C181718nD r1, C90314h4 r2, CartFragment cartFragment) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = cartFragment;
    }
}
