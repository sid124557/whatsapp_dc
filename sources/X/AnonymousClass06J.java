package X;

import android.view.View;
import android.view.Window;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.06J  reason: invalid class name */
public class AnonymousClass06J extends AnonymousClass06K {
    public void A04(boolean z) {
        if (z) {
            Window window = this.A01;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            AnonymousClass0QN.A00(window, DefaultCrypto.BUFFER_SIZE);
            return;
        }
        A06(DefaultCrypto.BUFFER_SIZE);
    }

    public boolean A05() {
        return AnonymousClass000.A1S(this.A01.getDecorView().getSystemUiVisibility() & DefaultCrypto.BUFFER_SIZE);
    }

    public AnonymousClass06J(View view, Window window) {
        super(view, window);
    }
}
