package X;

import android.os.SystemClock;
import android.view.View;

/* renamed from: X.5ej  reason: invalid class name and case insensitive filesystem */
public final class C109505ej implements View.OnClickListener {
    public long A00;
    public final View.OnClickListener A01;
    public final C56612sH A02;

    public C109505ej(View.OnClickListener onClickListener, C56612sH r3) {
        C162457s7.A0J(r3, 1);
        this.A02 = r3;
        this.A01 = onClickListener;
    }

    public void onClick(View view) {
        C162457s7.A0J(view, 0);
        if (SystemClock.elapsedRealtime() - this.A00 >= 1000) {
            this.A00 = SystemClock.elapsedRealtime();
            this.A01.onClick(view);
        }
    }
}
