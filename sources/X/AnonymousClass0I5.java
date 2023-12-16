package X;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.MenuItem;

/* renamed from: X.0I5  reason: invalid class name */
public final class AnonymousClass0I5 {
    public static void A00(ColorStateList colorStateList, MenuItem menuItem) {
        if (menuItem instanceof C17230vB) {
            ((C17230vB) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C06470Xv.A01(colorStateList, menuItem);
        }
    }
}
