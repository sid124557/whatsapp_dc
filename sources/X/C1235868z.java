package X;

import android.view.View;
import com.whatsapp.wds.components.banners.WDSBannerCompact;

/* renamed from: X.68z  reason: invalid class name and case insensitive filesystem */
public class C1235868z implements C183168pb {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1235868z(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final boolean BP3() {
        if (this.A02 != 0) {
            ((View.OnClickListener) this.A00).onClick(((WDSBannerCompact) this.A01).A02);
            return true;
        }
        AnonymousClass51x r2 = (AnonymousClass51x) this.A00;
        ((AnonymousClass5LV) this.A01).A0F.setExpanded(true);
        r2.A0B();
        r2.A0F();
        return true;
    }
}
