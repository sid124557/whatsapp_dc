package com.whatsapp.privacy.usernotice;

import X.AnonymousClass1kS;
import X.C64333Db;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;

public class UserNoticeBannerIconView extends AnonymousClass1kS {
    public boolean A00;

    public void A05() {
        if (!this.A00) {
            this.A00 = true;
            this.A01 = C64333Db.A8y(C64333Db.A02(this));
        }
    }

    public UserNoticeBannerIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
    }

    public int getTargetIconSize() {
        return getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public UserNoticeBannerIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
    }

    public UserNoticeBannerIconView(Context context) {
        super(context);
        A05();
    }

    public UserNoticeBannerIconView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A05();
    }
}
