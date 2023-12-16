package com.whatsapp.biz.catalog.view;

import X.AnonymousClass4GJ;
import X.AnonymousClass6D6;
import X.C116855qy;
import X.C626936e;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class CarouselScrollbarView extends View implements AnonymousClass4GJ {
    public RecyclerView A00;
    public C116855qy A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass6D6 A04;

    public final void A00() {
        boolean z;
        C626936e.A04(this.A00);
        int computeHorizontalScrollExtent = this.A00.computeHorizontalScrollExtent();
        int computeHorizontalScrollOffset = this.A00.computeHorizontalScrollOffset();
        int computeHorizontalScrollRange = this.A00.computeHorizontalScrollRange();
        if (computeHorizontalScrollExtent < computeHorizontalScrollRange) {
            int width = (getWidth() * computeHorizontalScrollExtent) / computeHorizontalScrollRange;
            int width2 = ((getWidth() - width) * computeHorizontalScrollOffset) / (computeHorizontalScrollRange - computeHorizontalScrollExtent);
            AnonymousClass6D6 r1 = this.A04;
            if (!(r1.A01 == width2 && r1.A00 == width)) {
                r1.A00 = width;
                r1.A01 = width2;
                r1.A00();
            }
            z = true;
        } else {
            AnonymousClass6D6 r12 = this.A04;
            z = false;
            if (!(r12.A01 == 0 && r12.A00 == 0)) {
                r12.A00 = 0;
                r12.A01 = 0;
                r12.A00();
            }
        }
        this.A03 = z;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        if (this.A03) {
            this.A04.draw(canvas);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.A04.setBounds(0, 0, i, i2);
        A00();
    }

    public CarouselScrollbarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        AnonymousClass6D6 r0 = new AnonymousClass6D6(context);
        this.A04 = r0;
        r0.setCallback(this);
        this.A03 = false;
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || this.A04 == drawable) {
            return true;
        }
        return false;
    }

    public CarouselScrollbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CarouselScrollbarView(Context context) {
        this(context, (AttributeSet) null);
    }
}
