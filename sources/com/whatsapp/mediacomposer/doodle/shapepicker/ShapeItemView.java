package com.whatsapp.mediacomposer.doodle.shapepicker;

import X.AnonymousClass4GJ;
import X.C116855qy;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

public class ShapeItemView extends AppCompatImageView implements AnonymousClass4GJ {
    public C116855qy A00;
    public String A01;
    public boolean A02;

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public ShapeItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        setMeasuredDimension(defaultSize, defaultSize);
    }

    public ShapeItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public ShapeItemView(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public ShapeItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }
}
