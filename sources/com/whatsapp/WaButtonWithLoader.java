package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass0Y8;
import X.AnonymousClass4GJ;
import X.C06560Yg;
import X.C116855qy;
import X.C141606vq;
import X.C142006wU;
import X.C18280x3;
import X.C86624Kv;
import X.C86664Kz;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.whatsapp.wds.components.button.WDSButton;

public class WaButtonWithLoader extends RelativeLayout implements AnonymousClass4GJ {
    public View.OnClickListener A00;
    public Button A01;
    public ProgressBar A02;
    public C116855qy A03;
    public String A04;
    public boolean A05;
    public boolean A06;

    public final void A00() {
        String str;
        Button button = this.A01;
        if (this.A06) {
            str = null;
        } else {
            str = this.A04;
        }
        button.setText(str);
        this.A02.setVisibility(AnonymousClass001.A08(this.A06 ? 1 : 0));
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A03;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public void setEnabled(boolean z) {
        this.A01.setEnabled(z);
        super.setEnabled(z);
    }

    public void setSize(C141606vq r3) {
        Button button = this.A01;
        if (button instanceof WDSButton) {
            ((WDSButton) button).setSize(r3);
        }
    }

    public void setVariant(C142006wU r4) {
        Drawable indeterminateDrawable;
        Button button = this.A01;
        if (button instanceof WDSButton) {
            ((WDSButton) button).setVariant(r4);
        }
        if (r4 == C142006wU.TONAL && (indeterminateDrawable = this.A02.getIndeterminateDrawable()) != null) {
            indeterminateDrawable.setColorFilter(AnonymousClass0Y8.A04(getContext(), R.color.f5nameremoved), PorterDuff.Mode.SRC_IN);
        }
    }

    public WaButtonWithLoader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        this.A04 = null;
        A01(context);
    }

    public void A01(Context context) {
        View A0h = C86664Kz.A0h(LayoutInflater.from(context), this, R.layout.f8nameremoved);
        this.A01 = (Button) C06560Yg.A02(A0h, R.id.button_view);
        ProgressBar progressBar = (ProgressBar) C06560Yg.A02(A0h, R.id.loader_view);
        this.A02 = progressBar;
        progressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
        C18280x3.A0p(this.A01, this, 23);
        A00();
    }

    public void setButtonText(int i) {
        setButtonText(C86624Kv.A0b(this, i));
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }

    public WaButtonWithLoader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        this.A04 = null;
        A01(context);
    }

    public void setButtonText(String str) {
        this.A04 = str;
        A00();
    }

    public WaButtonWithLoader(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
    }

    public WaButtonWithLoader(Context context) {
        super(context);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        this.A04 = null;
        A01(context);
    }
}
