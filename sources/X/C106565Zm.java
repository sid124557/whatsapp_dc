package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;

/* renamed from: X.5Zm  reason: invalid class name and case insensitive filesystem */
public class C106565Zm {
    public static final int[][] A00 = {new int[]{R.string.f11nameremoved, R.string.f11nameremoved}, new int[]{R.string.f11nameremoved, R.string.f11nameremoved}, new int[]{R.string.f11nameremoved, R.string.f11nameremoved}};

    public static boolean A02(C624134x r6, C41862Lw r7) {
        boolean z = false;
        if (r7 != null) {
            long j = r6.A0K;
            if (r6 instanceof C30441mS) {
                j = ((C30441mS) r6).A00;
            }
            if (r7.A01.A0K > j) {
                z = true;
            }
        }
        if (z) {
            if (r7 == null) {
                return true;
            }
            C30331mH r2 = r7.A01;
            if (!(r2 instanceof C30571mf)) {
                return true;
            }
            C30571mf r22 = (C30571mf) r2;
            if (TextUtils.isEmpty(r22.A01) || C157857j0.A00.equals(r22.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static void A00(Drawable drawable, TextView textView) {
        int intrinsicHeight;
        int textSize = (int) textView.getTextSize();
        if (drawable.getIntrinsicHeight() == 0) {
            intrinsicHeight = 1;
        } else {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        drawable.setBounds(0, 0, (drawable.getIntrinsicWidth() * textSize) / intrinsicHeight, textSize);
    }

    public static void A01(DialogFragment dialogFragment, AnonymousClass3ZH r4) {
        Bundle A08 = AnonymousClass002.A08();
        A08.putString("jid", C627336j.A07(r4.A0H));
        dialogFragment.A0u(A08);
    }
}
