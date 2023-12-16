package com.whatsapp.biz;

import X.AnonymousClass4GJ;
import X.AnonymousClass5Y0;
import X.AnonymousClass5Yj;
import X.C06560Yg;
import X.C100895Cr;
import X.C107345b9;
import X.C116855qy;
import X.C18280x3;
import X.C18290x4;
import X.C620733j;
import X.C64333Db;
import X.C86614Ku;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C88864av;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel;
import java.util.List;

public class BusinessProfileFieldView extends LinearLayout implements AnonymousClass4GJ {
    public int A00;
    public ColorStateList A01;
    public ColorStateList A02;
    public EllipsizedTextEmojiLabel A03;
    public EllipsizedTextEmojiLabel A04;
    public C620733j A05;
    public AnonymousClass5Y0 A06;
    public C116855qy A07;
    public String A08;
    public boolean A09;
    public boolean A0A;

    public void A01(AttributeSet attributeSet) {
        Drawable drawable;
        TextUtils.TruncateAt truncateAt = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = C86614Ku.A0C(this).obtainStyledAttributes(attributeSet, C100895Cr.A02, 0, 0);
            try {
                drawable = obtainStyledAttributes.getDrawable(2);
                this.A00 = obtainStyledAttributes.getInteger(0, 0);
                this.A0A = obtainStyledAttributes.getBoolean(3, false);
                ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(4);
                this.A01 = colorStateList;
                if (colorStateList == null) {
                    this.A01 = C86664Kz.A0W(new int[1], new int[][]{new int[0]}, AnonymousClass5Yj.A03(getContext(), getContext(), R.attr.f3nameremoved, R.color.f5nameremoved), 0);
                }
                ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(5);
                this.A02 = colorStateList2;
                if (colorStateList2 == null) {
                    this.A02 = this.A01;
                }
                this.A08 = this.A05.A0G(obtainStyledAttributes, 1);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            drawable = null;
        }
        View inflate = C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this, true);
        setIcon(drawable);
        this.A04 = (EllipsizedTextEmojiLabel) C06560Yg.A02(inflate, R.id.field_textview);
        this.A03 = (EllipsizedTextEmojiLabel) C06560Yg.A02(inflate, R.id.sub_field_textview);
        this.A04.setSingleLine(this.A0A);
        this.A03.setSingleLine(this.A0A);
        int i = this.A00;
        if (i == 1) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            truncateAt = TextUtils.TruncateAt.END;
        } else if (i == 4) {
            truncateAt = TextUtils.TruncateAt.MARQUEE;
        }
        this.A04.setEllipsize(truncateAt);
        this.A03.setEllipsize(truncateAt);
        this.A04.A00 = AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
        this.A03.A00 = AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
        this.A04.setTextColor(this.A01);
    }

    private void setIcon(Drawable drawable) {
        if (drawable != null) {
            C86654Ky.A15(this, C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved), getPaddingTop(), C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved));
        }
    }

    public void A00() {
        if (!this.A09) {
            this.A09 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A05 = C64333Db.A2t(A002);
            this.A06 = C64333Db.A3o(A002);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A07;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public TextView getSubTextView() {
        return this.A03;
    }

    public String getText() {
        return C86614Ku.A0u(this.A04);
    }

    public TextView getTextView() {
        return this.A04;
    }

    public void setTextColor(int i) {
        this.A04.setTextColor(i);
        this.A01 = C86664Kz.A0W(new int[1], new int[][]{new int[0]}, i, 0);
    }

    public BusinessProfileFieldView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        A01(attributeSet);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.A04.setEnabled(z);
        this.A03.setEnabled(z);
    }

    public void setSubText(CharSequence charSequence) {
        EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel;
        int i;
        if (TextUtils.isEmpty(charSequence)) {
            C86634Kw.A1I(this.A03);
            ellipsizedTextEmojiLabel = this.A03;
            i = 8;
        } else {
            this.A03.A0J(C107345b9.A03(getContext(), this.A04.getPaint(), this.A06, charSequence), (List) null, 180, true);
            ellipsizedTextEmojiLabel = this.A03;
            i = 0;
        }
        ellipsizedTextEmojiLabel.setVisibility(i);
    }

    public void setText(CharSequence charSequence, View.OnClickListener onClickListener) {
        int i;
        if (!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(this.A08)) {
            this.A04.setTextColor(this.A01);
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = this.A08;
                this.A04.setTextColor(this.A02);
            }
            EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel = this.A04;
            ellipsizedTextEmojiLabel.A01 = onClickListener;
            ellipsizedTextEmojiLabel.setContentDescription(charSequence);
            this.A04.A0J(C107345b9.A03(getContext(), this.A04.getPaint(), this.A06, charSequence), (List) null, 180, true);
            i = 0;
        } else {
            C86634Kw.A1I(this.A04);
            i = 8;
        }
        setVisibility(i);
    }

    public int getLayoutRes() {
        return R.layout.f8nameremoved;
    }

    public BusinessProfileFieldView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        A01(attributeSet);
    }

    public void setIcon(int i) {
        setIcon(C86644Kx.A0C(this, i));
    }

    public BusinessProfileFieldView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
        A01(attributeSet);
    }

    public BusinessProfileFieldView(Context context) {
        super(context);
        A00();
        A01((AttributeSet) null);
    }

    public BusinessProfileFieldView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
