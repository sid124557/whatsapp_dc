package com.whatsapp.conversation.ui;

import X.AnonymousClass001;
import X.AnonymousClass4GJ;
import X.AnonymousClass79H;
import X.C06560Yg;
import X.C107555bV;
import X.C111685iW;
import X.C116855qy;
import X.C18300x5;
import X.C620733j;
import X.C86664Kz;
import X.C88864av;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

public class AudioPlayerMetadataView extends LinearLayout implements AnonymousClass4GJ {
    public TextView A00;
    public C620733j A01;
    public C116855qy A02;
    public boolean A03;

    public void A00() {
        if (!this.A03) {
            this.A03 = true;
            this.A01 = C88864av.A02((C111685iW) generatedComponent());
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A02;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void setDescription(String str) {
        this.A00.setText(str);
    }

    public AudioPlayerMetadataView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A00();
    }

    public final void A01(Context context, AttributeSet attributeSet) {
        ViewGroup A0l;
        View.inflate(context, R.layout.f8nameremoved, this);
        setOrientation(0);
        setGravity(17);
        View A022 = C06560Yg.A02(this, R.id.date_wrapper);
        View A023 = C06560Yg.A02(this, R.id.status);
        this.A00 = C18300x5.A0G(this, R.id.description);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass79H.A00);
            boolean z = obtainStyledAttributes.getBoolean(2, true);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
            C107555bV.A05(A022, this.A01, A022.getPaddingLeft(), dimensionPixelSize2);
            C107555bV.A03(A022, dimensionPixelSize, AnonymousClass001.A0U(A022).rightMargin);
            if (!z && (A0l = C86664Kz.A0l(A023)) != null) {
                A0l.removeView(A023);
            }
        }
    }

    public AudioPlayerMetadataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        A01(context, attributeSet);
    }

    public AudioPlayerMetadataView(Context context) {
        super(context);
        A00();
        A01(context, (AttributeSet) null);
    }
}
