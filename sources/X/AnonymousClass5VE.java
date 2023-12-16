package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.5VE  reason: invalid class name */
public class AnonymousClass5VE {
    public static C88694ab A00(Activity activity, Intent intent, View view, int i) {
        C88694ab A00 = C88694ab.A00(view, R.string.f11nameremoved, 0);
        A00.A0E(new AnonymousClass54H(activity, intent, i, 1), R.string.f11nameremoved);
        A00.A0D(AnonymousClass5Yj.A03(view.getContext(), view.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        return A00;
    }

    public static boolean A01(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(AnonymousClass27O.A00(Uri.parse(str)))) {
            return false;
        }
        return true;
    }
}
