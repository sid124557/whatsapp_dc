package com.whatsapp.wds.components.util;

import X.AnonymousClass0Y6;
import X.AnonymousClass4Sm;
import X.AnonymousClass578;
import X.AnonymousClass57u;
import X.AnonymousClass75X;
import X.C1001059l;
import X.C1462679k;
import X.C162457s7;
import X.C389229y;
import X.C73153f1;
import X.C86664Kz;
import X.C88884ax;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.util.Log;

public final class WDSComponentInflater extends AnonymousClass0Y6 {
    @Deprecated
    public static final String COMPONENT_TOOLBAR = "androidx.appcompat.widget.Toolbar";
    public static final AnonymousClass75X Companion = new AnonymousClass75X();

    public View createView(Context context, String str, AttributeSet attributeSet) {
        if (context == null) {
            return null;
        }
        try {
            if (!C162457s7.A0P(str, COMPONENT_TOOLBAR)) {
                return null;
            }
            C389229y.A01(context).Avy();
            AnonymousClass57u r4 = AnonymousClass57u.BIDI;
            if (attributeSet != null) {
                TypedArray A0X = C86664Kz.A0X(context, attributeSet, C1462679k.A0D);
                AnonymousClass57u[] values = AnonymousClass57u.values();
                int i = A0X.getInt(4, -1);
                if (i >= 0) {
                    C162457s7.A0J(values, 0);
                    if (i <= values.length - 1) {
                        r4 = values[i];
                    }
                }
                A0X.recycle();
            }
            if (r4 != AnonymousClass57u.ANDROIDX) {
                if (C1001059l.A07) {
                    return new AnonymousClass578(context, attributeSet);
                }
                int ordinal = r4.ordinal();
                if (ordinal == 2) {
                    return new AnonymousClass4Sm(context, attributeSet);
                }
                if (ordinal == 1) {
                    return new C88884ax(context, attributeSet);
                }
                if (ordinal == 0) {
                    Log.d("Should not hit here but we'll still inflate the variant type");
                } else {
                    throw C73153f1.A00();
                }
            }
            return new Toolbar(context, attributeSet);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
