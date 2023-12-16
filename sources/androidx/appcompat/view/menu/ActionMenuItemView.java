package androidx.appcompat.view.menu;

import X.AnonymousClass001;
import X.AnonymousClass03n;
import X.C003604a;
import X.C02530Gp;
import X.C02550Gr;
import X.C07190aT;
import X.C07890cz;
import X.C07910d1;
import X.C15560rZ;
import X.C16480tT;
import X.C16490tU;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class ActionMenuItemView extends AnonymousClass03n implements View.OnClickListener, C16480tT, C16490tU {
    public int A00;
    public int A01;
    public int A02;
    public Drawable A03;
    public C02530Gp A04;
    public C15560rZ A05;
    public C07910d1 A06;
    public C07190aT A07;
    public CharSequence A08;
    public boolean A09;
    public boolean A0A;

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public final void A00() {
        CharSequence charSequence;
        CharSequence title;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.A08);
        if (this.A03 != null && ((this.A06.A06 & 4) != 4 || (!this.A09 && !this.A0A))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        if (z3) {
            charSequence = this.A08;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence contentDescription = this.A06.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                title = null;
            } else {
                title = this.A06.getTitle();
            }
            setContentDescription(title);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.A06.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.A06.getTitle();
            }
            C02550Gr.A00(this, charSequence2);
            return;
        }
        C02550Gr.A00(this, tooltipText);
    }

    public void BGB(C07910d1 r2, int i) {
        this.A06 = r2;
        setIcon(r2.getIcon());
        setTitle(r2.getTitleCondensed());
        setId(r2.getItemId());
        setVisibility(AnonymousClass001.A08(r2.isVisible() ? 1 : 0));
        setEnabled(r2.isEnabled());
        if (r2.hasSubMenu() && this.A07 == null) {
            this.A07 = new C003604a(this);
        }
    }

    public C07910d1 getItemData() {
        return this.A06;
    }

    public void onClick(View view) {
        C15560rZ r1 = this.A05;
        if (r1 != null) {
            r1.BGr(this.A06);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C07190aT r0;
        if (!this.A06.hasSubMenu() || (r0 = this.A07) == null || !r0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setExpandedFormat(boolean z) {
        if (this.A0A != z) {
            this.A0A = z;
            C07910d1 r0 = this.A06;
            if (r0 != null) {
                C07890cz r1 = r0.A0E;
                r1.A0D = true;
                r1.A0F(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.A03 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.A00;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        A00();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.A02 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setTitle(CharSequence charSequence) {
        this.A08 = charSequence;
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r2.orientation == 2) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionMenuItemView(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            r4 = this;
            r4.<init>(r5, r6, r7)
            android.content.res.Resources r3 = r5.getResources()
            android.content.Context r0 = r4.getContext()
            android.content.res.Configuration r2 = X.AnonymousClass001.A0M(r0)
            int r1 = r2.screenWidthDp
            r0 = 480(0x1e0, float:6.73E-43)
            if (r1 >= r0) goto L_0x001b
            int r2 = r2.orientation
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            r4.A09 = r0
            int[] r0 = X.AnonymousClass0KC.A02
            r2 = 0
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r0, r7, r2)
            int r0 = r1.getDimensionPixelSize(r2, r2)
            r4.A01 = r0
            r1.recycle()
            android.util.DisplayMetrics r0 = r3.getDisplayMetrics()
            float r1 = r0.density
            r0 = 1107296256(0x42000000, float:32.0)
            int r0 = X.AnonymousClass001.A06(r1, r0)
            r4.A00 = r0
            r4.setOnClickListener(r4)
            r0 = -1
            r4.A02 = r0
            r4.setSaveEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public boolean BLP() {
        return !TextUtils.isEmpty(getText());
    }

    public boolean BLQ() {
        if (!(!TextUtils.isEmpty(getText())) || this.A06.getIcon() != null) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r2.orientation == 2) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConfigurationChanged(android.content.res.Configuration r4) {
        /*
            r3 = this;
            super.onConfigurationChanged(r4)
            android.content.Context r0 = r3.getContext()
            android.content.res.Configuration r2 = X.AnonymousClass001.A0M(r0)
            int r1 = r2.screenWidthDp
            r0 = 480(0x1e0, float:6.73E-43)
            if (r1 >= r0) goto L_0x0017
            int r2 = r2.orientation
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            r3.A09 = r0
            r3.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.onConfigurationChanged(android.content.res.Configuration):void");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z = !TextUtils.isEmpty(getText());
        if (z && (i5 = this.A02) >= 0) {
            super.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i4 = this.A01;
            i3 = Math.min(size, i4);
        } else {
            i3 = this.A01;
            i4 = i3;
        }
        if (mode != 1073741824 && i4 > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!z && this.A03 != null) {
            super.setPadding((getMeasuredWidth() - this.A03.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setItemInvoker(C15560rZ r1) {
        this.A05 = r1;
    }

    public void setPopupCallback(C02530Gp r1) {
        this.A04 = r1;
    }

    public ActionMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
