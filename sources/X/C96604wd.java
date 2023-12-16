package X;

import android.view.View;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4wd  reason: invalid class name and case insensitive filesystem */
public final class C96604wd extends AnonymousClass6mM {
    public final View A00;
    public final WaTextView A01;
    public final C96254w4 A02;

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        LatLng latLng;
        boolean z;
        C136136lu r3 = (C136136lu) obj;
        int i = 0;
        C162457s7.A0J(r3, 0);
        WaTextView waTextView = this.A01;
        List list = r3.A02;
        if (list.size() <= 3) {
            i = 8;
        }
        waTextView.setVisibility(i);
        C18300x5.A18(waTextView, r3, 7);
        C96254w4 r2 = this.A02;
        List A0J = C73723fy.A0J(list, 3);
        ArrayList A0c = C73783g4.A0c(A0J);
        Iterator it = A0J.iterator();
        while (it.hasNext()) {
            C109065e1 A0K = AnonymousClass4L0.A0K(it);
            AnonymousClass5ZO r6 = r3.A00;
            if (!C162457s7.A0P(r6.A09, "country_default")) {
                Double d = r6.A04;
                C162457s7.A0H(d);
                double doubleValue = d.doubleValue();
                Double d2 = r6.A05;
                C162457s7.A0H(d2);
                latLng = C86624Kv.A0H(d2, doubleValue);
            } else {
                latLng = null;
            }
            int A04 = r6.A04();
            if (r6.A09()) {
                z = true;
                if (A0K.A05()) {
                    C96414wK r8 = new C96414wK(latLng, new C112375jd(r3, A0K), new C159667mG(1), (C186368vB) null, A0K, 11, A04, z, false);
                    r8.A05 = false;
                    A0c.add(r8);
                }
            }
            z = false;
            C96414wK r82 = new C96414wK(latLng, new C112375jd(r3, A0K), new C159667mG(1), (C186368vB) null, A0K, 11, A04, z, false);
            r82.A05 = false;
            A0c.add(r82);
        }
        r2.A0L(A0c);
    }

    public C96604wd(View view, C96254w4 r3) {
        super(view);
        this.A00 = view;
        this.A02 = r3;
        this.A01 = C86604Kt.A0O(view, R.id.view_all_btn);
        C86654Ky.A0P(view, R.id.business_list).setAdapter(r3);
    }
}
