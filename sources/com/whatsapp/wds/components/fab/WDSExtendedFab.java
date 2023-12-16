package com.whatsapp.wds.components.fab;

import X.C1462679k;
import X.C162457s7;
import X.C18300x5;
import X.C378924l;
import X.C86624Kv;
import X.C86664Kz;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.whatsapp.R;

public final class WDSExtendedFab extends MaterialButton {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSExtendedFab(Context context) {
        this(context, (AttributeSet) null);
        C162457s7.A0J(context, 1);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, C86664Kz.A05(getResources().getDimensionPixelSize(R.dimen.f6nameremoved)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSExtendedFab(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f3nameremoved);
        C162457s7.A0J(context, 1);
        if (attributeSet != null) {
            TypedArray A0X = C86664Kz.A0X(context, attributeSet, C1462679k.A07);
            int resourceId = A0X.getResourceId(4, 0);
            if (resourceId != 0) {
                C18300x5.A13(context, this, resourceId);
            }
            int resourceId2 = A0X.getResourceId(2, 0);
            if (resourceId2 != 0) {
                setHint(resourceId2);
            }
            int resourceId3 = A0X.getResourceId(3, 0);
            if (resourceId3 != 0) {
                setImeActionLabel(context.getString(resourceId3), getImeActionId());
            }
            int resourceId4 = A0X.getResourceId(1, 0);
            if (resourceId4 != 0) {
                setText(resourceId4);
            }
            A0X.recycle();
        }
    }

    public /* synthetic */ WDSExtendedFab(Context context, AttributeSet attributeSet, int i, C378924l r5) {
        this(context, C86624Kv.A09(attributeSet, i));
    }
}
