package X;

import android.view.View;
import com.whatsapp.HomeActivity;
import com.whatsapp.StickyHeadersRecyclerView;

/* renamed from: X.8zY  reason: invalid class name and case insensitive filesystem */
public class C188828zY extends C04640Qa {
    public Object A00;
    public final int A01;

    public C188828zY(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A02(int i, int i2) {
        if (1 - this.A01 != 0) {
            super.A02(i, i2);
        } else {
            C125406Hx.A00((C125406Hx) this.A00, i, i2);
        }
    }

    public void A03(int i, int i2, int i3) {
        if (1 - this.A01 != 0) {
            super.A03(i, i2, i3);
            return;
        }
        C125406Hx r0 = (C125406Hx) this.A00;
        C125406Hx.A00(r0, i, i3);
        C125406Hx.A00(r0, i2, i3);
    }

    public void A05() {
        switch (this.A01) {
            case 0:
                ((HomeActivity) this.A00).A7X();
                return;
            case 2:
                StickyHeadersRecyclerView stickyHeadersRecyclerView = (StickyHeadersRecyclerView) this.A00;
                stickyHeadersRecyclerView.A02 = -1;
                stickyHeadersRecyclerView.A00 = -1;
                return;
            case 3:
                ((AnonymousClass0R6) this.A00).A05();
                return;
            case 4:
                ((View) this.A00).requestLayout();
                return;
            default:
                super.A05();
                return;
        }
    }

    public void A06(int i, int i2) {
        if (1 - this.A01 != 0) {
            super.A06(i, i2);
        } else {
            C125406Hx.A00((C125406Hx) this.A00, i, i2);
        }
    }

    public void A07(int i, int i2) {
        if (1 - this.A01 != 0) {
            super.A07(i, i2);
        } else {
            C125406Hx.A00((C125406Hx) this.A00, i, i2);
        }
    }
}
