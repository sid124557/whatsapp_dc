package X;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.06L  reason: invalid class name */
public class AnonymousClass06L extends AnonymousClass0QN {
    public Window A00;
    public final WindowInsetsController A01;
    public final C06290Wz A02 = new C06290Wz();
    public final AnonymousClass0KN A03;

    public void A01(int i) {
        this.A01.hide(1);
    }

    public void A02(int i) {
        this.A01.show(1);
    }

    public void A03(boolean z) {
        Window window = this.A00;
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            this.A01.setSystemBarsAppearance(16, 16);
            return;
        }
        View decorView2 = window.getDecorView();
        decorView2.setSystemUiVisibility((~16) & decorView2.getSystemUiVisibility());
        this.A01.setSystemBarsAppearance(0, 16);
    }

    public void A04(boolean z) {
        Window window = this.A00;
        if (z) {
            AnonymousClass0QN.A00(window, DefaultCrypto.BUFFER_SIZE);
            this.A01.setSystemBarsAppearance(8, 8);
            return;
        }
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility((~DefaultCrypto.BUFFER_SIZE) & decorView.getSystemUiVisibility());
        this.A01.setSystemBarsAppearance(0, 8);
    }

    public boolean A05() {
        return AnonymousClass000.A1S(this.A01.getSystemBarsAppearance() & 8);
    }

    public AnonymousClass06L(Window window, AnonymousClass0KN r4) {
        WindowInsetsController insetsController = window.getInsetsController();
        this.A01 = insetsController;
        this.A03 = r4;
        this.A00 = window;
    }
}
