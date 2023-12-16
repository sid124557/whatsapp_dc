package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.0a7  reason: invalid class name and case insensitive filesystem */
public class C06970a7 implements View.OnApplyWindowInsetsListener {
    public AnonymousClass0XY A00 = null;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C15830s0 A02;

    public C06970a7(View view, C15830s0 r3) {
        this.A01 = view;
        this.A02 = r3;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        AnonymousClass0XY BMX;
        AnonymousClass0XY A012 = AnonymousClass0XY.A01(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            AnonymousClass0YZ.A0D(this.A01, windowInsets);
            if (A012.equals(this.A00)) {
                BMX = this.A02.BMX(view, A012);
                return BMX.A06();
            }
        }
        this.A00 = A012;
        BMX = this.A02.BMX(view, A012);
        if (i < 30) {
            AnonymousClass0V0.A02(view);
        }
        return BMX.A06();
    }
}
