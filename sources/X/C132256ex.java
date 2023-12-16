package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.biz.catalog.view.AspectRatioFrameLayout;

/* renamed from: X.6ex  reason: invalid class name and case insensitive filesystem */
public abstract class C132256ex extends AspectRatioFrameLayout {
    public int A00;
    public C624134x A01;

    public abstract void setMessage(C30471mV r1);

    public void A03() {
    }

    public void A04(View view, View view2) {
        C624134x r0 = this.A01;
        if (r0 != null) {
            if (r0.A1F) {
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
            }
            if (C106215Yb.A02(this.A01)) {
                view2.setVisibility(0);
            } else {
                view2.setVisibility(8);
            }
        }
    }

    public boolean A05() {
        return false;
    }

    public void setRadius(int i) {
        this.A00 = i;
    }

    public void setScrolling(boolean z) {
    }

    public void setShouldPlay(boolean z) {
    }

    public C132256ex(Context context) {
        super(context);
    }
}
