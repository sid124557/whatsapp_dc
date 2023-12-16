package X;

import android.app.Activity;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.0JL  reason: invalid class name */
public class AnonymousClass0JL {
    public static void A00(Activity activity, View view, AnonymousClass33p r4, C183538qC r5) {
        if (((C614930z) r5.get()).A06() && !r4.A29()) {
            view.setVisibility(0);
            C005205m.A01(activity, R.id.banner_description).setText(R.string.f11nameremoved);
            C17760wC.A00(C005205m.A00(activity, R.id.close), view, 9);
            r4.A0w();
        }
    }
}
