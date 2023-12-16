package com.whatsapp.biz.catalog.view;

import X.AnonymousClass001;
import X.AnonymousClass4GJ;
import X.AnonymousClass4L0;
import X.C116855qy;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.R;

public class CatalogListImageFrame extends FrameLayout implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;
    public final Drawable A02;
    public final Drawable A03;

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        Drawable drawable = this.A03;
        drawable.setBounds(0, AnonymousClass4L0.A02(drawable, getPaddingTop()), getWidth(), getPaddingTop());
        drawable.draw(canvas);
        Drawable drawable2 = this.A02;
        drawable2.setBounds(0, AnonymousClass001.A0H(this), getWidth(), AnonymousClass001.A0H(this) + drawable2.getIntrinsicHeight());
        drawable2.draw(canvas);
        super.onDraw(canvas);
    }

    public CatalogListImageFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A03 = getResources().getDrawable(R.drawable.album_card_top);
        this.A02 = getResources().getDrawable(R.drawable.album_card_bottom);
        setWillNotDraw(false);
    }

    public CatalogListImageFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CatalogListImageFrame(Context context) {
        this(context, (AttributeSet) null);
    }
}
