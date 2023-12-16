package com.whatsapp.storage;

import X.AnonymousClass4GJ;
import X.C116855qy;
import X.C86604Kt;
import X.C86624Kv;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public class StorageUsageMediaPreviewOverflowOverlayView extends View implements AnonymousClass4GJ {
    public Drawable A00;
    public C116855qy A01;
    public boolean A02;

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setFrameDrawable(Drawable drawable) {
        this.A00 = drawable;
        invalidate();
    }

    public StorageUsageMediaPreviewOverflowOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        C86604Kt.A0z(context, this, R.color.f5nameremoved);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.A00;
        if (drawable != null) {
            C86624Kv.A0n(drawable, this);
            this.A00.draw(canvas);
        }
    }

    public StorageUsageMediaPreviewOverflowOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StorageUsageMediaPreviewOverflowOverlayView(Context context) {
        this(context, (AttributeSet) null);
    }
}
