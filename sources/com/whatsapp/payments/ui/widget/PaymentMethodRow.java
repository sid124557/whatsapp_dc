package com.whatsapp.payments.ui.widget;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass4GJ;
import X.AnonymousClass5Yj;
import X.C06560Yg;
import X.C107235av;
import X.C116855qy;
import X.C18280x3;
import X.C18300x5;
import X.C86614Ku;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.CopyableTextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public class PaymentMethodRow extends LinearLayout implements AnonymousClass4GJ {
    public View A00;
    public ImageView A01;
    public RadioButton A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public ShimmerFrameLayout A06;
    public CopyableTextView A07;
    public WaImageView A08;
    public C116855qy A09;
    public boolean A0A;

    public void A00() {
        this.A02.setVisibility(0);
        this.A08.setVisibility(8);
        C107235av.A02(this.A00);
    }

    public void A02() {
        if (!this.A0A) {
            this.A0A = true;
            generatedComponent();
        }
    }

    public void A03(int i) {
        WaImageView waImageView;
        int i2;
        if (i == 0) {
            waImageView = this.A08;
            i2 = 8;
        } else {
            this.A08.setImageResource(i);
            waImageView = this.A08;
            i2 = 0;
        }
        waImageView.setVisibility(i2);
    }

    public void A04(int i) {
        this.A01.setImageResource(i);
    }

    public void A06(String str) {
        this.A05.setText(str);
    }

    public void A07(boolean z) {
        TextView textView = this.A05;
        Context context = getContext();
        if (!z) {
            AnonymousClass0x2.A0q(context, textView, R.color.f5nameremoved);
            this.A00.setBackground((Drawable) null);
            return;
        }
        AnonymousClass0x2.A0q(context, textView, AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
    }

    public void A09(boolean z) {
        ShimmerFrameLayout shimmerFrameLayout = this.A06;
        if (!z) {
            shimmerFrameLayout.A00();
        } else {
            shimmerFrameLayout.A01();
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A09;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public void setAccountId(String str) {
        this.A07.setText(str);
        this.A07.setVisibility(C86614Ku.A01(TextUtils.isEmpty(str) ? 1 : 0));
    }

    public void setIconBackground(Drawable drawable) {
        this.A01.setBackground(drawable);
    }

    public void setIconScaleType(ImageView.ScaleType scaleType) {
        this.A01.setScaleType(scaleType);
    }

    public void setRadioButtonChecked(boolean z) {
        this.A02.setChecked(z);
    }

    public PaymentMethodRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        A01();
    }

    public void A01() {
        C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this, true);
        setOrientation(1);
        this.A00 = C06560Yg.A02(this, R.id.payment_method_row_container);
        this.A01 = AnonymousClass0x9.A0E(this, R.id.payment_method_provider_icon);
        this.A05 = C18300x5.A0G(this, R.id.payment_method_bank_name);
        this.A07 = (CopyableTextView) C06560Yg.A02(this, R.id.payment_method_account_id);
        this.A04 = C18300x5.A0G(this, R.id.payment_method_provider_name);
        this.A08 = AnonymousClass0x9.A0L(this, R.id.payment_method_decorate_icon);
        this.A02 = (RadioButton) C06560Yg.A02(this, R.id.payment_method_radio_button);
        this.A03 = C18300x5.A0G(this, R.id.payment_branding);
        this.A06 = (ShimmerFrameLayout) C06560Yg.A02(this, R.id.payment_method_name_shimmer);
        this.A07.setVisibility(8);
        this.A04.setVisibility(8);
        this.A08.setVisibility(8);
        this.A03.setVisibility(8);
        this.A06.A00();
    }

    public void A05(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A04.setVisibility(8);
            this.A04.setText("");
            return;
        }
        boolean contains = str.contains("\n");
        TextView textView = this.A04;
        if (contains) {
            textView.setSingleLine(false);
        } else {
            textView.setSingleLine(true);
            this.A04.setEllipsize(TextUtils.TruncateAt.END);
        }
        this.A04.setText(str);
        this.A04.setVisibility(0);
    }

    public void A08(boolean z) {
        C06560Yg.A02(this, R.id.account_number_divider).setVisibility(AnonymousClass001.A08(z ? 1 : 0));
    }

    public int getLayoutRes() {
        return R.layout.f8nameremoved;
    }

    public ImageView getMethodIconView() {
        return this.A01;
    }

    public PaymentMethodRow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A02();
        A01();
    }

    public PaymentMethodRow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
        A01();
    }

    public PaymentMethodRow(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }

    public PaymentMethodRow(Context context) {
        super(context);
        A02();
        A01();
    }
}
