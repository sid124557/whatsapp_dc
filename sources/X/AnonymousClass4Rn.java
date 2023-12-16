package X;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.PopupWindow;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.WaEditText;
import java.util.Set;

/* renamed from: X.4Rn  reason: invalid class name */
public abstract class AnonymousClass4Rn extends PopupWindow {
    public int A00 = 0;
    public int A01 = -1;
    public boolean A02;
    public final Activity A03;
    public final C55682qk A04;
    public final C181568my A05;
    public final C620633i A06;
    public final AnonymousClass33p A07;
    public final C105895Wv A08;
    public final Runnable A09;
    public final Set A0A;

    public static void A00(PopupWindow popupWindow) {
        popupWindow.setWidth(-1);
        popupWindow.setHeight(-2);
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        popupWindow.setTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setInputMethodMode(2);
        popupWindow.setAnimationStyle(0);
    }

    public void A03() {
        this.A01 = A08(-1);
    }

    public void A06(WaEditText waEditText) {
        this.A02 = true;
        A04();
        dismiss();
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) this.A05;
        if (keyboardPopupLayout.A04 != null) {
            keyboardPopupLayout.A04 = null;
            keyboardPopupLayout.requestLayout();
        }
        A05(new AnonymousClass92R(waEditText, 0), waEditText, new C117645sG((Object) this, 45));
    }

    public void A09() {
        this.A02 = false;
    }

    public void A04() {
        C181568my r2 = this.A05;
        ((View) r2).getHandler().removeCallbacks(this.A09);
        ((KeyboardPopupLayout) r2).A07 = true;
    }

    public final void A05(C181578mz r5, WaEditText waEditText, Runnable runnable) {
        InputMethodManager A0Q = this.A06.A0Q();
        if (waEditText != null) {
            waEditText.requestFocus();
        }
        Handler A0A2 = AnonymousClass000.A0A();
        Set set = this.A0A;
        if (!r5.AyN(new C86894Mg(A0A2, runnable, set), A0Q)) {
            C181568my r2 = this.A05;
            ((KeyboardPopupLayout) r2).A07 = false;
            ((View) r2).requestLayout();
            set.remove(runnable);
        }
    }

    public boolean A07() {
        if (Build.VERSION.SDK_INT < 24 || !this.A03.isInMultiWindowMode()) {
            return false;
        }
        return true;
    }

    public int A08(int i) {
        SharedPreferences sharedPreferences;
        String str;
        int A022;
        int i2;
        SharedPreferences.Editor A032;
        String str2;
        SharedPreferences sharedPreferences2;
        String str3;
        int A023;
        int i3;
        SharedPreferences.Editor A033;
        String str4;
        if (this instanceof C89224c7) {
            Point A072 = AnonymousClass4L0.A07();
            Activity activity = this.A03;
            C86604Kt.A0x(activity, A072);
            int i4 = A072.y;
            int A024 = C86604Kt.A02(activity);
            if (A024 == 1) {
                sharedPreferences2 = AnonymousClass0x2.A0F(this.A07);
                str3 = "keyboard_height_portrait";
                A023 = C18280x3.A02(sharedPreferences2, str3);
            } else if (A024 != 2) {
                A023 = 0;
            } else {
                sharedPreferences2 = AnonymousClass0x2.A0F(this.A07);
                str3 = "keyboard_height_landscape";
                A023 = C18280x3.A02(sharedPreferences2, str3);
            }
            if (this.A00 == 1 && i > 0 && !A07()) {
                i3 = Math.min(i4 / 2, i);
            } else if (A023 > 0) {
                i3 = Math.min(i4 / 2, A023);
            } else {
                i3 = (i4 * 3) / 8;
            }
            int A025 = C86604Kt.A02(activity);
            if (A025 != 1) {
                if (A025 == 2) {
                    A033 = C18270x1.A03(this.A07);
                    str4 = "keyboard_height_landscape";
                }
                return i3;
            }
            A033 = C18270x1.A03(this.A07);
            str4 = "keyboard_height_portrait";
            C18270x1.A0h(A033, str4, i3);
            return i3;
        }
        C89214c6 r2 = (C89214c6) this;
        Point A073 = AnonymousClass4L0.A07();
        Activity activity2 = r2.A03;
        C86604Kt.A0x(activity2, A073);
        int i5 = A073.y;
        int A026 = C86604Kt.A02(activity2);
        if (A026 == 1) {
            sharedPreferences = AnonymousClass0x2.A0F(r2.A07);
            str = "keyboard_height_portrait";
            A022 = C18280x3.A02(sharedPreferences, str);
        } else if (A026 != 2) {
            A022 = 0;
        } else {
            sharedPreferences = AnonymousClass0x2.A0F(r2.A07);
            str = "keyboard_height_landscape";
            A022 = C18280x3.A02(sharedPreferences, str);
        }
        if (i > 0 && !r2.A07()) {
            i2 = Math.min(i5 / 2, i);
        } else if (A022 > 0) {
            i2 = Math.min(i5 / 2, A022);
        } else {
            i2 = (i5 * 3) / 8;
        }
        int A027 = C86604Kt.A02(activity2);
        if (A027 != 1) {
            if (A027 == 2) {
                A032 = C18270x1.A03(r2.A07);
                str2 = "keyboard_height_landscape";
            }
            return Math.max(i2, r2.A03.A09.getMeasuredHeight());
        }
        A032 = C18270x1.A03(r2.A07);
        str2 = "keyboard_height_portrait";
        C18270x1.A0h(A032, str2, i2);
        return Math.max(i2, r2.A03.A09.getMeasuredHeight());
    }

    public AnonymousClass4Rn(Activity activity, C55682qk r4, C181568my r5, C620633i r6, AnonymousClass33p r7, C105895Wv r8) {
        super(activity);
        this.A03 = activity;
        this.A08 = r8;
        this.A04 = r4;
        this.A06 = r6;
        this.A07 = r7;
        this.A05 = r5;
        this.A0A = AnonymousClass002.A0K();
        this.A09 = new C117645sG((Object) r5, 44);
    }

    public static boolean A01(Point point, View view) {
        int i;
        int i2;
        int[] A1Z = C86664Kz.A1Z();
        view.getLocationOnScreen(A1Z);
        int i3 = point.x;
        int i4 = A1Z[0];
        if (i3 < i4 || i3 > i4 + view.getWidth() || (i = point.y) < (i2 = A1Z[1]) || i > C86664Kz.A0C(view, i2)) {
            return false;
        }
        return true;
    }

    public void dismiss() {
        if (isShowing()) {
            A03();
            super.dismiss();
            C181568my r2 = this.A05;
            KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) r2;
            if (keyboardPopupLayout.A04 != null) {
                keyboardPopupLayout.A04 = null;
                keyboardPopupLayout.requestLayout();
            }
            ((View) r2).requestLayout();
        }
    }
}
