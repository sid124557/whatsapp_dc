package X;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.5Yb  reason: invalid class name and case insensitive filesystem */
public class C106215Yb {
    public static int A00(int i, boolean z) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 11;
            case 2:
                return 14;
            case 3:
                return 10;
            case 4:
                return 8;
            case 5:
                if (z) {
                    return 12;
                }
                return 4;
            case 6:
                return 13;
            case 7:
                return 9;
            default:
                return 15;
        }
    }

    public static void A01(Activity activity, View view, int i) {
        View view2;
        Window window = activity.getWindow();
        if (view != null) {
            view2 = view;
        } else if (window == null || window.getDecorView() == null || (view2 = window.getDecorView()) == null) {
            return;
        }
        C88694ab A00 = C88694ab.A00(view2, i, -1);
        AnonymousClass6FH r3 = A00.A0J;
        if (view == null) {
            r3.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass6BO((Object) activity, 4, (Object) r3));
        }
        TextView A09 = AnonymousClass002.A09(r3, R.id.snackbar_text);
        if (A09 != null) {
            A09.setSingleLine(false);
        }
        A00.A05();
    }

    public static boolean A02(C624134x r1) {
        if (1 != r1.A0j()) {
            return false;
        }
        return true;
    }
}
