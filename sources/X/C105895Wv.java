package X;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.whatsapp.R;

/* renamed from: X.5Wv  reason: invalid class name and case insensitive filesystem */
public class C105895Wv {
    public final C620633i A00;

    public static boolean A01(C113245l7 r1) {
        r1.A2z.getImeUtils();
        return A00(r1.A0D);
    }

    public void A02(View view) {
        InputMethodManager A0Q = this.A00.A0Q();
        C626936e.A06(A0Q);
        C86644Kx.A14(view, A0Q);
    }

    public void A03(View view) {
        InputMethodManager A0Q = this.A00.A0Q();
        C626936e.A06(A0Q);
        A0Q.showSoftInput(view, 0);
    }

    public C105895Wv(C620633i r1) {
        this.A00 = r1;
    }

    public static boolean A00(View view) {
        Rect A0N = AnonymousClass001.A0N();
        view.getRootView().getWindowVisibleDisplayFrame(A0N);
        WindowManager A01 = C620633i.A01(view.getContext());
        C626936e.A06(A01);
        return C18280x3.A1U(A01.getDefaultDisplay().getHeight() - A0N.bottom, view.getRootView().getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
    }
}
