package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;

/* renamed from: X.9cy  reason: invalid class name and case insensitive filesystem */
public class C197349cy implements C185498tm {
    public final /* synthetic */ AnonymousClass9Cu A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public C197349cy(AnonymousClass9Cu r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = z2;
    }

    public View B4D(LayoutInflater layoutInflater) {
        AnonymousClass9Cu r3 = this.A00;
        if (r3.A0i.size() == 0) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, (ViewGroup) null);
        C1899593h.A0m(inflate, R.id.check_balance_icon, AnonymousClass0Y8.A04(r3, R.color.f5nameremoved));
        if (inflate == null) {
            return inflate;
        }
        C86604Kt.A1B(inflate, R.id.check_balance_divider);
        C204249p3.A02(inflate, this, 50);
        return inflate;
    }

    public String B7U() {
        AnonymousClass9Cu r1;
        int i;
        if (this.A02 || this.A01) {
            r1 = this.A00;
            i = R.string.f11nameremoved;
        } else {
            r1 = this.A00;
            i = R.string.f11nameremoved;
        }
        return r1.getString(i);
    }

    public View B7m(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        this.A00.BKD((AnonymousClass303) null, 0, (Integer) null, "payment_method_prompt");
        return layoutInflater.inflate(R.layout.f8nameremoved, frameLayout, false);
    }

    public String B9i(C166587yw r3) {
        if ((r3 instanceof C133696hn) || AnonymousClass9W6.A01(this.A00.A0i)) {
            return "";
        }
        return null;
    }
}
