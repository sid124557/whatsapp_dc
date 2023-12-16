package com.google.android.material.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0WH;
import X.AnonymousClass0X3;
import X.AnonymousClass0Y9;
import X.AnonymousClass0YG;
import X.AnonymousClass4L0;
import X.C02680He;
import X.C06560Yg;
import X.C07910d1;
import X.C1463179t;
import X.C161837qd;
import X.C16480tT;
import X.C188778zT;
import X.C86614Ku;
import X.C86634Kw;
import X.C86644Kx;
import X.C86664Kz;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;

public class NavigationMenuItemView extends LinearLayoutCompat implements C16480tT {
    public static final int[] A0G = {16842912};
    public int A00;
    public int A01;
    public ColorStateList A02;
    public Drawable A03;
    public Drawable A04;
    public FrameLayout A05;
    public C07910d1 A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Rect A0C;
    public final Rect A0D;
    public final CheckedTextView A0E;
    public final AnonymousClass0WH A0F;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0D = AnonymousClass001.A0N();
        this.A0C = AnonymousClass001.A0N();
        this.A00 = 119;
        this.A0A = true;
        this.A08 = false;
        TypedArray A002 = C161837qd.A00(context, attributeSet, C1463179t.A0F, new int[0], i, 0);
        this.A00 = A002.getInt(1, this.A00);
        Drawable drawable = A002.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.A0A = A002.getBoolean(2, true);
        A002.recycle();
        C188778zT r2 = new C188778zT(this, 9);
        this.A0F = r2;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.A0E = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C06560Yg.A0O(checkedTextView, r2);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.A09) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C86634Kw.A0G(drawable);
                AnonymousClass0YG.A01(this.A02, drawable);
            }
            int i = this.A01;
            drawable.setBounds(0, 0, i, i);
        } else if (this.A0B) {
            if (this.A03 == null) {
                Drawable A002 = C02680He.A00(C86614Ku.A0C(this), getResources(), R.drawable.navigation_empty_icon);
                this.A03 = A002;
                if (A002 != null) {
                    int i2 = this.A01;
                    A002.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.A03;
        }
        AnonymousClass0X3.A02(drawable, (Drawable) null, (Drawable) null, (Drawable) null, this.A0E);
    }

    private void setActionView(View view) {
        if (view != null) {
            FrameLayout frameLayout = this.A05;
            if (frameLayout == null) {
                frameLayout = (FrameLayout) C86664Kz.A0n(this, R.id.design_menu_item_action_area_stub).inflate();
                this.A05 = frameLayout;
            }
            frameLayout.removeAllViews();
            this.A05.addView(view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009a, code lost:
        if (r5.A06.getActionView() == null) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BGB(X.C07910d1 r6, int r7) {
        /*
            r5 = this;
            r5.A06 = r6
            int r0 = r6.getItemId()
            if (r0 <= 0) goto L_0x000b
            r5.setId(r0)
        L_0x000b:
            boolean r0 = r6.isVisible()
            int r0 = X.AnonymousClass001.A08(r0)
            r5.setVisibility(r0)
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            if (r0 != 0) goto L_0x004d
            android.util.TypedValue r4 = X.AnonymousClass4L0.A0B()
            android.content.res.Resources$Theme r2 = X.C86614Ku.A0C(r5)
            r1 = 2130968996(0x7f0401a4, float:1.7546661E38)
            r0 = 1
            boolean r0 = r2.resolveAttribute(r1, r4, r0)
            if (r0 == 0) goto L_0x00c5
            android.graphics.drawable.StateListDrawable r3 = new android.graphics.drawable.StateListDrawable
            r3.<init>()
            int[] r2 = A0G
            int r1 = r4.data
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r3.addState(r2, r0)
            int[] r2 = android.view.ViewGroup.EMPTY_STATE_SET
            r1 = 0
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r3.addState(r2, r0)
        L_0x004a:
            X.AnonymousClass0YY.A04(r3, r5)
        L_0x004d:
            boolean r0 = r6.isCheckable()
            r5.setCheckable(r0)
            boolean r0 = r6.isChecked()
            r5.setChecked(r0)
            boolean r0 = r6.isEnabled()
            r5.setEnabled(r0)
            java.lang.CharSequence r0 = r6.getTitle()
            r5.setTitle(r0)
            android.graphics.drawable.Drawable r0 = r6.getIcon()
            r5.setIcon(r0)
            android.view.View r0 = r6.getActionView()
            r5.setActionView(r0)
            java.lang.CharSequence r0 = r6.getContentDescription()
            r5.setContentDescription(r0)
            java.lang.CharSequence r0 = r6.getTooltipText()
            X.C02550Gr.A00(r5, r0)
            X.0d1 r1 = r5.A06
            java.lang.CharSequence r0 = r1.getTitle()
            if (r0 != 0) goto L_0x009c
            android.graphics.drawable.Drawable r0 = r1.getIcon()
            if (r0 != 0) goto L_0x009c
            X.0d1 r0 = r5.A06
            android.view.View r1 = r0.getActionView()
            r0 = 1
            if (r1 != 0) goto L_0x009d
        L_0x009c:
            r0 = 0
        L_0x009d:
            android.widget.CheckedTextView r1 = r5.A0E
            if (r0 == 0) goto L_0x00b7
            r0 = 8
            r1.setVisibility(r0)
            android.widget.FrameLayout r0 = r5.A05
            if (r0 == 0) goto L_0x00b6
            android.widget.LinearLayout$LayoutParams r1 = X.AnonymousClass001.A0U(r0)
            r0 = -1
        L_0x00af:
            r1.width = r0
            android.widget.FrameLayout r0 = r5.A05
            r0.setLayoutParams(r1)
        L_0x00b6:
            return
        L_0x00b7:
            r0 = 0
            r1.setVisibility(r0)
            android.widget.FrameLayout r0 = r5.A05
            if (r0 == 0) goto L_0x00b6
            android.widget.LinearLayout$LayoutParams r1 = X.AnonymousClass001.A0U(r0)
            r0 = -2
            goto L_0x00af
        L_0x00c5:
            r3 = 0
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.NavigationMenuItemView.BGB(X.0d1, int):void");
    }

    public Drawable getForeground() {
        return this.A04;
    }

    public int getForegroundGravity() {
        return this.A00;
    }

    public C07910d1 getItemData() {
        return this.A06;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C07910d1 r1 = this.A06;
        if (r1 != null && r1.isCheckable() && r1.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0G);
        }
        return onCreateDrawableState;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.A04;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.A04);
            }
            this.A04 = drawable;
            this.A08 = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                AnonymousClass000.A0t(drawable, this);
                if (this.A00 == 119) {
                    drawable.getPadding(AnonymousClass001.A0N());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.A00 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.A00 = i;
            if (i == 119 && this.A04 != null) {
                this.A04.getPadding(AnonymousClass001.A0N());
            }
            requestLayout();
        }
    }

    public void setIconPadding(int i) {
        this.A0E.setCompoundDrawablePadding(i);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.A02 = colorStateList;
        this.A09 = AnonymousClass000.A1W(colorStateList);
        C07910d1 r0 = this.A06;
        if (r0 != null) {
            setIcon(r0.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.A0E.setMaxLines(i);
    }

    public void setTextAppearance(int i) {
        AnonymousClass0Y9.A06(this.A0E, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.A0E.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.A0E.setText(charSequence);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.A04;
        if (drawable != null) {
            if (this.A08) {
                this.A08 = false;
                Rect rect = this.A0D;
                Rect rect2 = this.A0C;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.A0A) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), AnonymousClass4L0.A03(this, right), bottom - getPaddingBottom());
                }
                Gravity.apply(this.A00, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.A04;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A04;
        if (drawable != null && drawable.isStateful()) {
            this.A04.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A04;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A08 = z | this.A08;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.A08 = true;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.A07 != z) {
            this.A07 = z;
            this.A0F.A05(this.A0E, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.A0E;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        C86644Kx.A0z(this, i);
    }

    public void setIconSize(int i) {
        this.A01 = i;
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.A0B = z;
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A04) {
            return true;
        }
        return false;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }
}
