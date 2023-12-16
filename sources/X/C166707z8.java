package X;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: X.7z8  reason: invalid class name and case insensitive filesystem */
public class C166707z8 implements TextWatcher {
    public Runnable A00;
    public final long A01;
    public final Handler A02 = AnonymousClass000.A0A();
    public final C153427bI A03;
    public final AnonymousClass84O A04;
    public final C170338Cu A05;

    public void afterTextChanged(Editable editable) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A05.A05 = charSequence.toString();
        AnonymousClass84O r7 = this.A04;
        C835248t A0L = r7.A0L(56);
        if (A0L != null) {
            long j = this.A01;
            if (j <= 0) {
                C159377lj.A01(this.A03, r7, C152057Xj.A00(new C152057Xj(), charSequence.toString(), 0), A0L);
                return;
            }
            Runnable runnable = this.A00;
            if (runnable != null) {
                this.A02.removeCallbacks(runnable);
            }
            C172708Mj r1 = new C172708Mj(this, A0L, charSequence, 47);
            this.A00 = r1;
            this.A02.postDelayed(r1, j);
        }
    }

    public C166707z8(C153427bI r2, AnonymousClass84O r3, C170338Cu r4, long j) {
        this.A04 = r3;
        this.A03 = r2;
        this.A05 = r4;
        this.A01 = j;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
