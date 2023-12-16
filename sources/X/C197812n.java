package X;

import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.12n  reason: invalid class name and case insensitive filesystem */
public class C197812n extends C05570Ua {
    public final C19170ys A00;

    public C197812n(C19170ys r1) {
        super(r1);
        this.A00 = r1;
    }

    public static C197812n A00(ViewGroup viewGroup) {
        C19170ys r4 = new C19170ys(viewGroup.getContext());
        C06560Yg.A02(r4, R.id.divider).setBackground(C02680He.A00(r4.getContext().getTheme(), r4.getResources(), R.drawable.divider_gray));
        return new C197812n(r4);
    }
}
