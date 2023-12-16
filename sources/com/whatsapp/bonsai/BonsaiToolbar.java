package com.whatsapp.bonsai;

import X.C107405bG;
import X.C162457s7;
import X.C88894ay;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import com.whatsapp.R;

public final class BonsaiToolbar extends C88894ay {
    public Activity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BonsaiToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Activity activity = this.A00;
        if (activity != null) {
            C107405bG.A08(activity, R.color.f5nameremoved);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BonsaiToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BonsaiToolbar(Context context) {
        super(context);
        C162457s7.A0J(context, 1);
    }
}
