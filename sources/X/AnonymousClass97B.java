package X;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: X.97B  reason: invalid class name */
public class AnonymousClass97B extends AnonymousClass4Rn {
    public int A00 = this.A01.getMeasuredHeight();
    public NumberEntryKeyboard A01;
    public C97014xU A02;
    public List A03;

    public AnonymousClass97B(Activity activity, C55682qk r13, C181568my r14, C620633i r15, AnonymousClass33p r16, C184508rw r17, C97014xU r18, C105895Wv r19, List list) {
        super(activity, r13, r14, r15, r16, r19);
        C97014xU r1 = r18;
        this.A02 = r1;
        List list2 = list;
        this.A03 = list2;
        NumberEntryKeyboard numberEntryKeyboard = new NumberEntryKeyboard(activity);
        this.A01 = numberEntryKeyboard;
        numberEntryKeyboard.A06 = r1;
        numberEntryKeyboard.setCustomKey(r17);
        this.A02.setCustomCursorEnabled(true);
        setContentView(this.A01);
        setTouchable(true);
        setOutsideTouchable(true);
        setInputMethodMode(2);
        setAnimationStyle(0);
        setBackgroundDrawable(new ColorDrawable(-1));
        setTouchInterceptor(new AnonymousClass9Y1(this, list2));
        this.A01.measure(View.MeasureSpec.makeMeasureSpec(C86664Kz.A0f(activity).getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void dismiss() {
        this.A02.setHasFocus(false);
        super.dismiss();
    }

    public void A09() {
        if (!isShowing()) {
            super.A09();
            Iterator it = this.A03.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                View view = (View) it.next();
                if (C105895Wv.A00(view)) {
                    if (view != null) {
                        C181568my r7 = this.A05;
                        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) r7;
                        keyboardPopupLayout.A07 = true;
                        InputMethodManager A0Q = this.A06.A0Q();
                        Objects.requireNonNull(A0Q);
                        if (!A0Q.hideSoftInputFromWindow(view.getWindowToken(), 0, new C86894Mg(AnonymousClass000.A0A(), new C198799fV(this), this.A0A))) {
                            keyboardPopupLayout.A07 = false;
                            ((View) r7).requestLayout();
                            return;
                        }
                        return;
                    }
                }
            }
            A0A();
        }
    }

    public final void A0A() {
        if (!isShowing()) {
            Activity activity = this.A03;
            if (activity.getCurrentFocus() != null) {
                activity.getCurrentFocus().clearFocus();
            }
            setHeight(this.A00);
            setWidth(-1);
            C181568my r4 = this.A05;
            r4.setKeyboardPopup(this);
            KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) r4;
            if (keyboardPopupLayout.A07) {
                View view = (View) r4;
                view.getViewTreeObserver().addOnGlobalLayoutListener(new C204929q9(this, 0));
                keyboardPopupLayout.A07 = false;
                view.requestLayout();
            } else if (!isShowing()) {
                showAtLocation((View) r4, 48, 0, 1000000);
            }
            this.A02.setHasFocus(true);
        }
    }

    public int A08(int i) {
        return this.A00;
    }
}
