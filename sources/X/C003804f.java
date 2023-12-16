package X;

import android.content.Context;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: X.04f  reason: invalid class name and case insensitive filesystem */
public class C003804f extends C07540bC implements C16500tV {
    public static Method A01;
    public C16500tV A00;

    public C003804f(Context context, int i, int i2) {
        super(context, (AttributeSet) null, i, i2);
    }

    public void A05() {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = A01;
            if (method != null) {
                try {
                    PopupWindow popupWindow = this.A0B;
                    Object[] A0L = AnonymousClass002.A0L();
                    A0L[0] = false;
                    method.invoke(popupWindow, A0L);
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.A0B.setTouchModal(false);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                A01 = AnonymousClass002.A0H(PopupWindow.class, Boolean.TYPE, "setTouchModal", new Class[1], 0);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C002803e A01(Context context, boolean z) {
        AnonymousClass04Z r0 = new AnonymousClass04Z(context, z);
        r0.A01 = this;
        return r0;
    }

    public void A03() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.A0B.setEnterTransition((Transition) null);
        }
    }

    public void A04() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.A0B.setExitTransition((Transition) null);
        }
    }

    public void BUr(MenuItem menuItem, C07890cz r3) {
        C16500tV r0 = this.A00;
        if (r0 != null) {
            r0.BUr(menuItem, r3);
        }
    }

    public void BUs(MenuItem menuItem, C07890cz r3) {
        C16500tV r0 = this.A00;
        if (r0 != null) {
            r0.BUs(menuItem, r3);
        }
    }
}
