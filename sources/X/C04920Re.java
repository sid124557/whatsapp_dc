package X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.0Re  reason: invalid class name and case insensitive filesystem */
public class C04920Re {
    public static AnonymousClass0XY A00(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        AnonymousClass0XY A01 = AnonymousClass0XY.A01((View) null, rootWindowInsets);
        C05640Uh r1 = A01.A00;
        r1.A0G(A01);
        r1.A0F(view.getRootView());
        return A01;
    }

    public static void A01(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
