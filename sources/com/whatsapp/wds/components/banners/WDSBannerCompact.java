package com.whatsapp.wds.components.banners;

import X.AnonymousClass0YG;
import X.AnonymousClass4GP;
import X.AnonymousClass56e;
import X.AnonymousClass56f;
import X.AnonymousClass5IA;
import X.C06400Xn;
import X.C1235868z;
import X.C1462679k;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C18320x8;
import X.C86614Ku;
import X.C86664Kz;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.text.ReadMoreTextView;

public final class WDSBannerCompact extends LinearLayout {
    public WaImageView A00 = C86664Kz.A11(this, R.id.dismiss_icon);
    public WaImageView A01 = C86664Kz.A11(this, R.id.banner_icon);
    public ReadMoreTextView A02 = ((ReadMoreTextView) findViewById(R.id.banner_text));
    public AnonymousClass5IA A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSBannerCompact(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        AnonymousClass5IA r2 = AnonymousClass56e.A00;
        this.A03 = r2;
        View.inflate(context, R.layout.f8nameremoved, this);
        C86614Ku.A15(getResources(), this, R.dimen.f6nameremoved);
        if (attributeSet != null) {
            TypedArray A0X = C86664Kz.A0X(context, attributeSet, C1462679k.A02);
            int i = A0X.getInt(2, 0);
            if (i != 0 && i == 1) {
                r2 = AnonymousClass56f.A00;
            }
            Drawable drawable = A0X.getDrawable(0);
            if (drawable != null) {
                WaImageView waImageView = this.A01;
                if (waImageView != null) {
                    waImageView.setVisibility(0);
                }
                WaImageView waImageView2 = this.A01;
                if (waImageView2 != null) {
                    waImageView2.setImageDrawable(drawable);
                }
            }
            ReadMoreTextView readMoreTextView = this.A02;
            if (readMoreTextView != null) {
                int resourceId = A0X.getResourceId(1, 0);
                if (resourceId != 0) {
                    readMoreTextView.setText(resourceId);
                } else {
                    readMoreTextView.setText(A0X.getText(1));
                }
                readMoreTextView.setLinesLimit(A0X.getInt(3, 0));
                String string = A0X.getString(4);
                if (string != null) {
                    readMoreTextView.A04 = string;
                }
            }
            A0X.recycle();
        }
        setStyle(r2);
    }

    public final void setText(CharSequence charSequence) {
        C162457s7.A0J(charSequence, 0);
        ReadMoreTextView readMoreTextView = this.A02;
        if (readMoreTextView != null) {
            readMoreTextView.setText(charSequence);
        }
    }

    private final void setStyle(AnonymousClass5IA r5) {
        Drawable drawable;
        this.A03 = r5;
        setBackgroundColor(C06400Xn.A00((Resources.Theme) null, getResources(), r5.A00));
        ReadMoreTextView readMoreTextView = this.A02;
        if (readMoreTextView != null) {
            readMoreTextView.setTextColor(C06400Xn.A00((Resources.Theme) null, getResources(), r5.A01));
        }
        if (r5 instanceof AnonymousClass56f) {
            C18270x1.A0p(this.A00);
            if (readMoreTextView != null) {
                readMoreTextView.setGravity(17);
                return;
            }
            return;
        }
        WaImageView waImageView = this.A01;
        if (waImageView != null && (drawable = waImageView.getDrawable()) != null) {
            AnonymousClass0YG.A06(drawable, C06400Xn.A00((Resources.Theme) null, C18290x4.A0G(this), R.color.f5nameremoved));
        }
    }

    public final TextPaint getTextPaint() {
        ReadMoreTextView readMoreTextView = this.A02;
        if (readMoreTextView != null) {
            return readMoreTextView.getPaint();
        }
        return null;
    }

    public final void setOnDismissListener(AnonymousClass4GP r3) {
        WaImageView waImageView = this.A00;
        if (r3 == null) {
            if (waImageView != null) {
                waImageView.setOnClickListener((View.OnClickListener) null);
            }
        } else if (waImageView != null) {
            C18320x8.A14(waImageView, r3, 18);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        C1235868z r0;
        super.setOnClickListener(onClickListener);
        ReadMoreTextView readMoreTextView = this.A02;
        if (readMoreTextView != null && readMoreTextView.A00 != 0) {
            if (onClickListener != null) {
                r0 = new C1235868z(onClickListener, 1, this);
            } else {
                r0 = null;
            }
            readMoreTextView.A02 = r0;
        }
    }

    public static final void setOnDismissListener$lambda$5(AnonymousClass4GP r0, View view) {
        r0.invoke();
    }

    public final void setOnDismissListener(View.OnClickListener onClickListener) {
        WaImageView waImageView = this.A00;
        if (waImageView != null) {
            waImageView.setOnClickListener(onClickListener);
        }
    }

    public final void setText(int i) {
        ReadMoreTextView readMoreTextView = this.A02;
        if (readMoreTextView != null) {
            readMoreTextView.setText(i);
        }
    }
}
