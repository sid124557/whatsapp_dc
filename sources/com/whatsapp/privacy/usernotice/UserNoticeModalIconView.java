package com.whatsapp.privacy.usernotice;

import X.AnonymousClass1kS;
import X.C64333Db;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.whatsapp.R;

public class UserNoticeModalIconView extends AnonymousClass1kS {
    public ImageView A00;
    public boolean A01;

    public void A05() {
        if (!this.A01) {
            this.A01 = true;
            this.A01 = C64333Db.A8y(C64333Db.A02(this));
        }
    }

    public void setDefaultIconView(ImageView imageView) {
        this.A00 = imageView;
    }

    public UserNoticeModalIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
    }

    public int getTargetIconSize() {
        return getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public UserNoticeModalIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
    }

    public UserNoticeModalIconView(Context context) {
        super(context);
        A05();
    }

    public UserNoticeModalIconView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A05();
    }
}
