package com.whatsapp.payments.ui.widget;

import X.AnonymousClass002;
import X.AnonymousClass0Y9;
import X.AnonymousClass1VX;
import X.AnonymousClass974;
import X.AnonymousClass9M9;
import X.C1001059l;
import X.C18280x3;
import X.C192299Ja;
import X.C620733j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public class PayToolbar extends AnonymousClass974 {
    public View A00;
    public FrameLayout A01;
    public TextView A02;
    public WaImageView A03;
    public C620733j A04;
    public AnonymousClass1VX A05;
    public C192299Ja A06;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        if (r4 == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0047, code lost:
        if (r4 == false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setLockIconVisibility(boolean r6) {
        /*
            r5 = this;
            android.view.View r1 = r5.A00
            r3 = 0
            int r0 = X.AnonymousClass001.A08(r6)
            r1.setVisibility(r0)
            X.33j r0 = r5.A04
            boolean r4 = r0.A0T()
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            r0 = 3
            if (r4 == 0) goto L_0x001a
            r0 = 5
        L_0x001a:
            r0 = r0 | 16
            r2.gravity = r0
            android.content.res.Resources r1 = X.C18290x4.A0G(r5)
            r0 = 2131166538(0x7f07054a, float:1.7947324E38)
            int r1 = r1.getDimensionPixelOffset(r0)
            r0 = 0
            if (r4 != 0) goto L_0x002e
            r0 = r1
            r1 = 0
        L_0x002e:
            r2.setMargins(r0, r3, r1, r3)
            android.widget.FrameLayout r0 = r5.A01
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            android.content.res.Resources r1 = X.C18290x4.A0G(r5)
            r0 = 2131166539(0x7f07054b, float:1.7947326E38)
            int r1 = r1.getDimensionPixelOffset(r0)
            if (r6 == 0) goto L_0x0049
            r0 = r1
            if (r4 != 0) goto L_0x004e
        L_0x0049:
            r0 = 0
            if (r6 == 0) goto L_0x004e
            if (r4 == 0) goto L_0x004f
        L_0x004e:
            r1 = 0
        L_0x004f:
            r2.setMargins(r1, r3, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.widget.PayToolbar.setLockIconVisibility(boolean):void");
    }

    public void setLogo(int i) {
        this.A02.setVisibility(8);
        if (i != R.id.fbpay_logo) {
            this.A03.setVisibility(0);
        }
        this.A03.setImageResource(i);
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i = 8;
        if (charSequence == null || !getContext().getString(R.string.f11nameremoved).equalsIgnoreCase(charSequence.toString())) {
            this.A03.setVisibility(8);
            textView = this.A02;
            textView.setText(charSequence);
            i = 0;
        } else {
            textView = this.A02;
        }
        textView.setVisibility(i);
    }

    public PayToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C192299Ja r1;
        C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this, true);
        if (attributeSet != null && !isInEditMode()) {
            int i = 0;
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass9M9.A01, 0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId != 0) {
                setContentDescription(context.getString(resourceId));
            }
            findViewById(R.id.back).setVisibility(!obtainStyledAttributes.getBoolean(0, false) ? 8 : i);
            int i2 = obtainStyledAttributes.getInt(3, -1);
            if (i2 >= 0) {
                C192299Ja[] values = C192299Ja.values();
                int length = values.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        r1 = null;
                        break;
                    }
                    r1 = values[i3];
                    if (r1.ordinal() == i2) {
                        break;
                    }
                    i3++;
                }
                this.A06 = r1;
            }
            this.A02 = AnonymousClass002.A09(this, R.id.title);
            this.A01 = (FrameLayout) findViewById(R.id.title_layout);
            this.A03 = (WaImageView) findViewById(R.id.fbpay_logo);
            this.A00 = findViewById(R.id.lock);
            setLockIconVisibility(obtainStyledAttributes.getBoolean(1, true));
            if (C1001059l.A07) {
                AnonymousClass0Y9.A06(this.A02, R.style.f12nameremoved);
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C192299Ja r2;
        int i5;
        int i6;
        int i7;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        FrameLayout frameLayout = this.A01;
        if (frameLayout != null && frameLayout.getVisibility() != 8 && (r2 = this.A06) != null) {
            int width = getWidth();
            int height = getHeight();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            int i9 = width - paddingRight;
            int i10 = height - paddingBottom;
            int measuredWidth = frameLayout.getMeasuredWidth();
            if (frameLayout.getLayoutParams() != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
                i5 = marginLayoutParams.leftMargin;
                i6 = marginLayoutParams.rightMargin;
            } else {
                i5 = 0;
                i6 = 0;
            }
            int i11 = measuredWidth + i5 + i6;
            int measuredHeight = frameLayout.getMeasuredHeight();
            if (frameLayout.getLayoutParams() != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
                i7 = marginLayoutParams2.topMargin;
                i8 = marginLayoutParams2.bottomMargin;
            } else {
                i7 = 0;
                i8 = 0;
            }
            int i12 = measuredHeight + i7 + i8;
            if (r2.ordinal() == 1) {
                int i13 = height / 2;
                int i14 = i12 / 2;
                int i15 = paddingLeft - currentContentInsetLeft;
                paddingLeft = Math.max(i15, ((width / 2) + i15) - (i11 / 2));
                i9 = Math.min(i9 - currentContentInsetRight, i11 + paddingLeft);
                paddingTop = Math.max(paddingTop, i13 - i14);
                i10 = Math.min(i10, i13 + i14);
            }
            frameLayout.layout(paddingLeft, paddingTop, i9, i10);
        }
    }

    public void setOnLockClicked(View.OnClickListener onClickListener) {
    }

    public PayToolbar(Context context) {
        super(context);
        C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this, true);
    }

    public void setLogo(Drawable drawable) {
        this.A02.setVisibility(8);
        WaImageView waImageView = this.A03;
        waImageView.setVisibility(0);
        waImageView.setImageDrawable(drawable);
    }

    public PayToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this, true);
    }
}
