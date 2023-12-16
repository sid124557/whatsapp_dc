package com.whatsapp.conversation.conversationrow.carousel;

import X.AnonymousClass001;
import X.AnonymousClass0Y8;
import X.AnonymousClass4GJ;
import X.C116855qy;
import X.C162457s7;
import X.C18270x1;
import X.C378924l;
import X.C54292oU;
import X.C64333Db;
import X.C86604Kt;
import X.C86624Kv;
import X.C86634Kw;
import X.C86664Kz;
import X.C88864av;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public final class CarouselItemSelectionView extends View implements AnonymousClass4GJ {
    public C54292oU A00;
    public C116855qy A01;
    public boolean A02;
    public boolean A03;
    public final Paint A04;
    public final Rect A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CarouselItemSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C64333Db.A2q(C88864av.A00(generatedComponent()));
        }
        this.A05 = AnonymousClass001.A0N();
        Paint A0Z = C86664Kz.A0Z();
        this.A04 = A0Z;
        C86604Kt.A0u(AnonymousClass0Y8.A04(getWaContext().A00, R.color.f5nameremoved), A0Z);
        A0Z.setAntiAlias(true);
    }

    public void onDraw(Canvas canvas) {
        C162457s7.A0J(canvas, 0);
        super.onDraw(canvas);
        if (this.A03) {
            Rect rect = this.A05;
            getDrawingRect(rect);
            canvas.drawRect(rect, this.A04);
        }
    }

    public final void setWaContext(C54292oU r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final C54292oU getWaContext() {
        C54292oU r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waContext");
    }

    public boolean isSelected() {
        return this.A03;
    }

    public final void setRowSelected(boolean z) {
        if (this.A03 != z) {
            this.A03 = z;
            setSelected(z);
            invalidate();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CarouselItemSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    public /* synthetic */ CarouselItemSelectionView(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), C86634Kw.A02(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CarouselItemSelectionView(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
