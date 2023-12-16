package X;

import android.view.View;

/* renamed from: X.1ry  reason: invalid class name and case insensitive filesystem */
public class C32961ry extends C166677z5 {
    public Runnable A00;
    public final View A01;
    public final View A02;
    public final C125226Gy A03;

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Runnable runnable = this.A00;
        if (runnable != null) {
            this.A02.removeCallbacks(runnable);
        }
        C71353by r3 = new C71353by(this, 40, charSequence);
        this.A00 = r3;
        this.A02.postDelayed(r3, 500);
    }

    public C32961ry(View view, View view2, C125226Gy r3) {
        this.A02 = view;
        this.A01 = view2;
        this.A03 = r3;
    }
}
