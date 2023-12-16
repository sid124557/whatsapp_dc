package X;

import android.content.res.Resources;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.ArrayList;

/* renamed from: X.5Ma  reason: invalid class name and case insensitive filesystem */
public abstract class C103225Ma {
    public AnonymousClass65F A00;

    public void A00(AnonymousClass65F r6, AnonymousClass5OF r7, ArrayList arrayList) {
        WaTextView waTextView;
        int i;
        if (this instanceof C95634u0) {
            C95634u0 r1 = (C95634u0) this;
            r1.A00 = r6;
            String str = ((C114545nD) r6).A00;
            if (TextUtils.isEmpty(str)) {
                waTextView = r1.A00;
                i = R.string.f11nameremoved;
            } else {
                r1.A00.setText(C86604Kt.A0m(r1.A01, str, R.string.f11nameremoved));
                return;
            }
        } else {
            C95624tz r12 = (C95624tz) this;
            r12.A00 = r6;
            if (r6 instanceof C114525nB) {
                int i2 = ((C114525nB) r6).A00;
                WaTextView waTextView2 = r12.A00;
                Resources resources = r12.A01.getResources();
                Object[] A0L = AnonymousClass002.A0L();
                C18270x1.A1Q(A0L, i2);
                C86614Ku.A16(resources, waTextView2, A0L, R.plurals.f9nameremoved, i2);
                return;
            } else if (r6 instanceof C114515nA) {
                waTextView = r12.A00;
                i = R.string.f11nameremoved;
            } else {
                return;
            }
        }
        waTextView.setText(i);
    }
}
