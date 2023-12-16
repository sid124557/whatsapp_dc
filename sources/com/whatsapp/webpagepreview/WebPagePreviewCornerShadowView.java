package com.whatsapp.webpagepreview;

import X.AnonymousClass001;
import X.AnonymousClass4GJ;
import X.AnonymousClass4L0;
import X.AnonymousClass5JY;
import X.C116855qy;
import X.C131666dx;
import X.C620733j;
import X.C626936e;
import X.C64333Db;
import X.C88864av;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;

public class WebPagePreviewCornerShadowView extends FrameLayout implements AnonymousClass4GJ {
    public C620733j A00;
    public AnonymousClass5JY A01;
    public C116855qy A02;
    public boolean A03;

    public void A00() {
        if (!this.A03) {
            this.A03 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A00 = C64333Db.A2t(A002);
            this.A01 = (AnonymousClass5JY) A002.A00.A3o.get();
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

    public WebPagePreviewCornerShadowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        setWillNotDraw(false);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode()) {
            int paddingLeft = getPaddingLeft();
            int A0I = AnonymousClass001.A0I(this);
            int A0H = AnonymousClass001.A0H(this);
            Context context = getContext();
            C626936e.A06(context);
            AnonymousClass5JY r4 = this.A01;
            Drawable drawable = r4.A01;
            if (drawable == null) {
                drawable = new C131666dx(context.getResources().getDrawable(R.drawable.corner_overlay), r4.A03);
                r4.A01 = drawable;
            }
            if (C620733j.A04(this.A00)) {
                drawable.setBounds(A0I - drawable.getIntrinsicWidth(), AnonymousClass4L0.A02(drawable, A0H), A0I, A0H);
            } else {
                drawable.setBounds(paddingLeft, AnonymousClass4L0.A02(drawable, A0H), drawable.getIntrinsicWidth() + paddingLeft, A0H);
            }
            drawable.draw(canvas);
        }
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
    }

    public WebPagePreviewCornerShadowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        setWillNotDraw(false);
    }

    public WebPagePreviewCornerShadowView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A00();
    }

    public WebPagePreviewCornerShadowView(Context context) {
        super(context);
        A00();
        setWillNotDraw(false);
    }
}
