package X;

import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.06K  reason: invalid class name */
public class AnonymousClass06K extends AnonymousClass0QN {
    public final View A00;
    public final Window A01;

    public void A01(int i) {
        int i2 = 1;
        while (true) {
            int i3 = 4;
            while (true) {
                Window window = this.A01;
                AnonymousClass0QN.A00(window, i3);
                while (true) {
                    i2 <<= 1;
                    if (i2 > 256) {
                        return;
                    }
                    if ((i2 & 1) != 0) {
                        if (i2 != 1) {
                            i3 = 2;
                            if (i2 != 2) {
                                if (i2 == 8) {
                                    ((InputMethodManager) window.getContext().getSystemService("input_method")).hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void A02(int i) {
        int i2 = 1;
        while (true) {
            A06(4);
            Window window = this.A01;
            window.clearFlags(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
            while (true) {
                i2 <<= 1;
                if (i2 > 256) {
                    return;
                }
                if ((i2 & 1) != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            A06(2);
                        } else if (i2 == 8) {
                            View view = this.A00;
                            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                                view.requestFocus();
                            } else {
                                view = window.getCurrentFocus();
                                if (view == null && (view = window.findViewById(16908290)) == null) {
                                }
                            }
                            if (view.hasWindowFocus()) {
                                view.post(new C10910ii(view));
                            }
                        }
                    }
                }
            }
        }
    }

    public void A06(int i) {
        View decorView = this.A01.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    public AnonymousClass06K(View view, Window window) {
        this.A01 = window;
        this.A00 = view;
    }
}
