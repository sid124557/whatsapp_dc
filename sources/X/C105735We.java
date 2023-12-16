package X;

import android.text.TextUtils;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5We  reason: invalid class name and case insensitive filesystem */
public class C105735We {
    public final int A00;
    public final int A01;
    public final C54942pX A02;
    public final String A03;
    public final List A04;

    public LatLng A00() {
        List<C54942pX> list = this.A04;
        double d = 0.0d;
        double d2 = 0.0d;
        for (C54942pX r6 : list) {
            d += r6.A00;
            d2 += r6.A01;
        }
        return AnonymousClass4L0.A0H(d / ((double) list.size()), d2 / ((double) list.size()));
    }

    public C105735We(C622534h r6, List list, int i) {
        this.A04 = AnonymousClass002.A0J(list);
        C54942pX r0 = (C54942pX) C18290x4.A0k(list);
        this.A02 = r0;
        this.A01 = AnonymousClass001.A1U(((r6.A04.A0H() - r0.A05) > 600000 ? 1 : ((r6.A04.A0H() - r0.A05) == 600000 ? 0 : -1))) ? 1 : 0;
        this.A00 = i;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0s.add(((C54942pX) it.next()).A06.getRawString());
        }
        this.A03 = TextUtils.join("|", A0s);
    }

    public C105735We(C54942pX r2, int i) {
        this.A04 = Collections.singletonList(r2);
        this.A02 = r2;
        this.A01 = 2;
        this.A00 = i;
        this.A03 = r2.A06.getRawString();
    }
}
