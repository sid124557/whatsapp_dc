package com.whatsapp.wds.components.banners;

import X.AnonymousClass4GP;
import X.AnonymousClass56Y;
import X.AnonymousClass56Z;
import X.AnonymousClass56h;
import X.AnonymousClass5K0;
import X.AnonymousClass5KM;
import X.AnonymousClass5OR;
import X.C107295b4;
import X.C1462679k;
import X.C162457s7;
import X.C18320x8;
import X.C86614Ku;
import X.C86634Kw;
import X.C86644Kx;
import X.C86664Kz;
import X.C995156a;
import X.C995256b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public final class WDSBanner extends ConstraintLayout {
    public WaImageView A00 = C86664Kz.A11(this, R.id.dismiss_icon);
    public WaImageView A01 = C86664Kz.A11(this, R.id.banner_icon);
    public WaTextView A02 = C86644Kx.A0O(this, R.id.banner_description);
    public WaTextView A03 = C86644Kx.A0O(this, R.id.banner_header);
    public AnonymousClass5K0 A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.style.f12nameremoved);
        WaImageView waImageView;
        C162457s7.A0J(context, 1);
        AnonymousClass5K0 r5 = AnonymousClass56Y.A00;
        this.A04 = r5;
        View.inflate(context, R.layout.f8nameremoved, this);
        if (attributeSet != null) {
            TypedArray A0X = C86664Kz.A0X(context, attributeSet, C1462679k.A01);
            AnonymousClass5OR r4 = new AnonymousClass5OR();
            int resourceId = A0X.getResourceId(0, 0);
            if (resourceId != 0) {
                r5 = new C995256b(new AnonymousClass56h(resourceId));
            } else {
                int i = A0X.getInt(1, 0);
                if (i != 0) {
                    if (i == 1) {
                        r5 = C995156a.A00;
                    } else if (i == 2) {
                        r5 = AnonymousClass56Z.A00;
                    }
                }
            }
            this.A04 = r5;
            r4.A02 = r5;
            int resourceId2 = A0X.getResourceId(4, 0);
            if (resourceId2 != 0) {
                r4.A01 = resourceId2;
            } else {
                r4.A04 = A0X.getString(4);
            }
            int resourceId3 = A0X.getResourceId(2, 0);
            if (resourceId3 != 0) {
                r4.A00 = resourceId3;
            } else {
                r4.A03 = A0X.getString(2);
            }
            setDismissible(A0X.getBoolean(3, false));
            AnonymousClass5KM A002 = r4.A00();
            if (!(A002.A03 == null && A002.A00 == 0)) {
                setState(A002);
            }
            float dimension = A0X.getDimension(5, -1.0f);
            if (!(dimension == -1.0f || (waImageView = this.A01) == null)) {
                ViewGroup.LayoutParams layoutParams = waImageView.getLayoutParams();
                int i2 = (int) dimension;
                layoutParams.width = i2;
                layoutParams.height = i2;
            }
            A0X.recycle();
        }
        WaImageView waImageView2 = this.A00;
        if (waImageView2 != null) {
            C107295b4.A02(waImageView2);
        }
        C86614Ku.A15(getResources(), this, R.dimen.f6nameremoved);
        requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0101, code lost:
        if (r5.getVisibility() != 8) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0129, code lost:
        if (r5 != null) goto L_0x012b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setState(X.AnonymousClass5KM r8) {
        /*
            r7 = this;
            r0 = 0
            X.C162457s7.A0J(r8, r0)
            X.5K0 r0 = r8.A02
            r7.A04 = r0
            java.lang.String r2 = r8.A04
            if (r2 == 0) goto L_0x0017
            int r0 = r8.A01
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = "Both id and string values are set for headlineText. Please specify one of them"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0017:
            int r1 = r8.A01
            if (r1 == 0) goto L_0x0031
            com.whatsapp.WaTextView r0 = r7.A03
            if (r0 == 0) goto L_0x0022
            r0.setText(r1)
        L_0x0022:
            java.lang.CharSequence r2 = r8.A03
            if (r2 == 0) goto L_0x003b
            int r0 = r8.A00
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "Both id and string values are set for descriptionText. Please specify one of them"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0031:
            if (r2 == 0) goto L_0x0022
            com.whatsapp.WaTextView r0 = r7.A03
            if (r0 == 0) goto L_0x0022
            r0.setText(r2)
            goto L_0x0022
        L_0x003b:
            int r1 = r8.A00
            if (r1 == 0) goto L_0x0148
            com.whatsapp.WaTextView r0 = r7.A02
            if (r0 == 0) goto L_0x0046
            r0.setText(r1)
        L_0x0046:
            boolean r0 = r8.A05
            r7.setDismissible(r0)
            android.content.Context r2 = r7.getContext()
            X.5K0 r0 = r7.A04
            int r1 = r0.A02
            int r0 = r0.A03
            int r4 = X.AnonymousClass5Yj.A02(r2, r1, r0)
            X.5K0 r0 = r7.A04
            X.5CN r3 = r0.A04
            boolean r0 = r3 instanceof X.AnonymousClass56h
            r2 = 0
            if (r0 == 0) goto L_0x013e
            android.content.res.Resources r1 = r7.getResources()
            X.56h r3 = (X.AnonymousClass56h) r3
            int r0 = r3.A00
            android.graphics.drawable.Drawable r0 = X.C02680He.A00(r2, r1, r0)
        L_0x006e:
            if (r0 == 0) goto L_0x008d
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.graphics.drawable.Drawable r1 = X.C06130Wj.A01(r0)
            X.C162457s7.A0D(r1)
            android.content.res.Resources r0 = r7.getResources()
            int r0 = X.C06400Xn.A00(r2, r0, r4)
            X.AnonymousClass0YG.A06(r1, r0)
            com.whatsapp.WaImageView r0 = r7.A01
            if (r0 == 0) goto L_0x008d
            r0.setImageDrawable(r1)
        L_0x008d:
            X.7jd r2 = new X.7jd
            r2.<init>()
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131168767(0x7f070dff, float:1.7951845E38)
            float r0 = r1.getDimension(r0)
            r2.A02(r0)
            X.7ql r0 = new X.7ql
            r0.<init>(r2)
            X.6D7 r2 = new X.6D7
            r2.<init>((X.C161877ql) r0)
            android.content.Context r3 = r7.getContext()
            X.5K0 r0 = r7.A04
            int r1 = r0.A00
            int r0 = r0.A01
            int r1 = X.AnonymousClass5Yj.A02(r3, r1, r0)
            android.content.Context r0 = r7.getContext()
            android.content.res.ColorStateList r0 = X.AnonymousClass0Y8.A07(r0, r1)
            r2.A06(r0)
            X.5K0 r1 = r7.A04
            X.56Z r0 = X.AnonymousClass56Z.A00
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x00ed
            android.content.Context r1 = r7.getContext()
            r0 = 2131102951(0x7f060ce7, float:1.7818354E38)
            android.content.res.ColorStateList r0 = X.AnonymousClass0Y8.A07(r1, r0)
            r2.A07(r0)
            android.content.res.Resources r1 = X.C18290x4.A0G(r7)
            r0 = 2131168700(0x7f070dbc, float:1.795171E38)
            float r1 = r1.getDimension(r0)
            X.6Cs r0 = r2.A03
            r0.A04 = r1
            r2.invalidateSelf()
        L_0x00ed:
            r7.setBackground(r2)
            X.0XZ r6 = new X.0XZ
            r6.<init>()
            com.whatsapp.WaTextView r5 = r7.A03
            r4 = 8
            r2 = 0
            if (r5 == 0) goto L_0x0103
            int r1 = r5.getVisibility()
            r0 = 1
            if (r1 == r4) goto L_0x0104
        L_0x0103:
            r0 = 0
        L_0x0104:
            r3 = 7
            if (r0 != 0) goto L_0x0129
            if (r5 == 0) goto L_0x0118
            java.lang.CharSequence r0 = r5.getText()
            if (r0 == 0) goto L_0x0115
            boolean r0 = X.C175738Zn.A0V(r0)
            if (r0 == 0) goto L_0x012b
        L_0x0115:
            r5.setVisibility(r4)
        L_0x0118:
            r6.A0B(r7)
            r2 = 2131427902(0x7f0b023e, float:1.8477433E38)
            r1 = 2131429497(0x7f0b0879, float:1.8480668E38)
            r0 = 6
            r6.A08(r2, r3, r1, r0)
        L_0x0125:
            r6.A09(r7)
        L_0x0128:
            return
        L_0x0129:
            if (r5 == 0) goto L_0x0134
        L_0x012b:
            int r0 = r5.getVisibility()
            if (r0 == 0) goto L_0x0128
            r5.setVisibility(r2)
        L_0x0134:
            r6.A0B(r7)
            r0 = 2131427902(0x7f0b023e, float:1.8477433E38)
            r6.A08(r0, r3, r2, r3)
            goto L_0x0125
        L_0x013e:
            boolean r0 = r3 instanceof X.AnonymousClass56g
            if (r0 == 0) goto L_0x0153
            X.56g r3 = (X.AnonymousClass56g) r3
            android.graphics.drawable.BitmapDrawable r0 = r3.A00
            goto L_0x006e
        L_0x0148:
            if (r2 == 0) goto L_0x0046
            com.whatsapp.WaTextView r0 = r7.A02
            if (r0 == 0) goto L_0x0046
            r0.setText(r2)
            goto L_0x0046
        L_0x0153:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.banners.WDSBanner.setState(X.5KM):void");
    }

    public final void setDescriptionSelected(boolean z) {
        WaTextView waTextView = this.A02;
        if (waTextView != null) {
            waTextView.setSelected(z);
        }
    }

    public final void setDismissible(boolean z) {
        WaImageView waImageView = this.A00;
        if (waImageView != null) {
            waImageView.setVisibility(C86614Ku.A01(z ? 1 : 0));
        }
    }

    public final void setOnDismissListener(AnonymousClass4GP r3) {
        WaImageView waImageView = this.A00;
        if (r3 == null) {
            if (waImageView != null) {
                waImageView.setOnClickListener((View.OnClickListener) null);
            }
        } else if (waImageView != null) {
            C18320x8.A14(waImageView, r3, 17);
        }
    }

    public final void A05() {
        ViewGroup.MarginLayoutParams layoutParams;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        if (getLayoutParams() != null) {
            layoutParams = C86634Kw.A0O(this);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        }
        layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
        requestLayout();
    }

    public final void A06() {
        ViewGroup.MarginLayoutParams layoutParams;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        if (getLayoutParams() != null) {
            layoutParams = C86634Kw.A0O(this);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        }
        layoutParams.setMargins(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        requestLayout();
    }

    public static final void setOnDismissListener$lambda$4(AnonymousClass4GP r0, View view) {
        r0.invoke();
    }

    public final void setOnDismissListener(View.OnClickListener onClickListener) {
        WaImageView waImageView = this.A00;
        if (waImageView != null) {
            waImageView.setOnClickListener(onClickListener);
        }
    }
}
