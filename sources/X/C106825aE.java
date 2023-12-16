package X;

import android.view.View;
import android.widget.PopupWindow;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.5aE  reason: invalid class name and case insensitive filesystem */
public class C106825aE {
    public static void A00(View view, View view2, PopupWindow popupWindow) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getRootView().getLocationOnScreen(iArr2);
        popupWindow.showAtLocation(view2, 51, ((iArr[0] - Math.max(0, iArr2[0])) + (view.getMeasuredWidth() / 2)) - (popupWindow.getContentView().getMeasuredWidth() / 2), C86664Kz.A09(C18290x4.A0G(view), R.dimen.f6nameremoved, AnonymousClass4L0.A05(popupWindow.getContentView(), iArr[1] - Math.max(0, iArr2[1]))));
    }

    public static boolean A02(String str, String[] strArr) {
        for (String contains : strArr) {
            if (str.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    public static int[] A03(int[] iArr) {
        ArrayList A0I = AnonymousClass002.A0I(r5);
        for (int i : iArr) {
            if (i != 65039) {
                C18270x1.A1K(A0I, i);
            }
        }
        int size = A0I.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = C86614Ku.A07(A0I, i2);
        }
        return iArr2;
    }

    public static boolean A01(CharSequence charSequence) {
        C94284qs r5 = new C94284qs(charSequence);
        long A0N = C86664Kz.A0N(r5);
        if (!AnonymousClass000.A1S((A0N > -1 ? 1 : (A0N == -1 ? 0 : -1))) || r5.A02(0, A0N) != r5.A01().length) {
            return false;
        }
        return true;
    }
}
