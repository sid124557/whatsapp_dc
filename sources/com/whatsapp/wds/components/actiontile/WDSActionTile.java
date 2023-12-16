package com.whatsapp.wds.components.actiontile;

import X.AnonymousClass0RP;
import X.AnonymousClass0VX;
import X.AnonymousClass0Y8;
import X.AnonymousClass0Y9;
import X.AnonymousClass4Qp;
import X.AnonymousClass5Yj;
import X.AnonymousClass7ZP;
import X.C05040Rr;
import X.C1462679k;
import X.C147547Es;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C86614Ku;
import X.C86644Kx;
import X.C86664Kz;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Space;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public final class WDSActionTile extends AnonymousClass4Qp {
    public int A00;
    public int A01;
    public Space A02;
    public WaImageView A03;
    public WaTextView A04;
    public C147547Es A05;
    public boolean A06 = true;
    public boolean A07 = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSActionTile(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        if (attributeSet != null) {
            TypedArray A0X = C86664Kz.A0X(context, attributeSet, C1462679k.A00);
            int resourceId = A0X.getResourceId(3, 0);
            if (resourceId != 0) {
                this.A01 = resourceId;
            }
            this.A00 = A0X.getResourceId(0, 0);
            this.A06 = A0X.getBoolean(1, true);
            super.setOrientation(A0X.getInt(2, 1));
            A0X.recycle();
        }
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this);
        this.A03 = C86664Kz.A11(this, R.id.action_tile_icon);
        this.A04 = C86644Kx.A0O(this, R.id.action_tile_label);
        this.A02 = (Space) findViewById(R.id.action_tile_spacing);
        setClickable(this.A06);
        setFocusable(this.A06);
        A00();
    }

    public final void A00() {
        if (this.A07) {
            this.A05 = new C147547Es(C18290x4.A0F(this));
            WaTextView waTextView = this.A04;
            if (waTextView != null) {
                waTextView.setText(this.A01);
                waTextView.setEnabled(this.A06);
            }
            A02();
            A05();
            A06();
            WaImageView waImageView = this.A03;
            if (waImageView != null) {
                waImageView.setEnabled(this.A06);
                waImageView.setImageResource(this.A00);
                C147547Es r8 = this.A05;
                if (r8 == null) {
                    throw C18270x1.A0S("style");
                }
                int[] iArr = new int[2];
                Context context = r8.A00;
                iArr[0] = C18300x5.A03(context, R.attr.f3nameremoved, R.color.f5nameremoved);
                C05040Rr.A00(C86664Kz.A0W(iArr, new int[][]{new int[]{16842910}, new int[0]}, C18300x5.A03(context, R.attr.f3nameremoved, R.color.f5nameremoved), 1), waImageView);
            }
            A04();
            A01();
            A03();
        }
    }

    public final void A01() {
        C147547Es r0 = this.A05;
        if (r0 == null) {
            throw C18270x1.A0S("style");
        }
        boolean z = this.A06;
        Context context = r0.A00;
        Drawable A002 = AnonymousClass0RP.A00(context, R.drawable.wds_action_list_background);
        if (z) {
            int[] iArr = new int[2];
            iArr[0] = C18300x5.A03(context, R.attr.f3nameremoved, R.color.f5nameremoved);
            A002 = new RippleDrawable(C86664Kz.A0W(iArr, new int[][]{new int[]{16842919}, new int[0]}, AnonymousClass0Y8.A04(context, R.color.f5nameremoved), 1), A002, AnonymousClass0RP.A00(context, R.drawable.wds_action_tile_background_mask));
        }
        setBackground(A002);
    }

    public final void A02() {
        WaTextView waTextView = this.A04;
        if (waTextView == null) {
            return;
        }
        if (this.A05 == null) {
            throw C18270x1.A0S("style");
        }
        int orientation = getOrientation();
        int i = R.style.f12nameremoved;
        if (orientation == 1) {
            i = R.style.f12nameremoved;
        }
        AnonymousClass0Y9.A06(waTextView, i);
    }

    public final void A03() {
        AnonymousClass7ZP r4;
        C147547Es r2 = this.A05;
        if (r2 == null) {
            throw C18270x1.A0S("style");
        }
        int orientation = getOrientation();
        Context context = r2.A00;
        if (orientation == 1) {
            r4 = new AnonymousClass7ZP(context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), C18320x8.A00(context, R.dimen.f6nameremoved), C18320x8.A00(context, R.dimen.f6nameremoved));
        } else {
            r4 = new AnonymousClass7ZP(context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), C18320x8.A00(context, R.dimen.f6nameremoved), C18320x8.A00(context, R.dimen.f6nameremoved), C18320x8.A00(context, R.dimen.f6nameremoved));
        }
        setPadding(r4.A01, r4.A03, r4.A02, r4.A00);
    }

    public final void A04() {
        if (this.A05 == null) {
            throw C18270x1.A0S("style");
        }
        int orientation = getOrientation();
        int i = R.dimen.f6nameremoved;
        if (orientation == 1) {
            i = R.dimen.f6nameremoved;
        }
        Space space = this.A02;
        if (space != null) {
            ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = C86614Ku.A05(this, i);
            }
            space.requestLayout();
        }
    }

    public final void A05() {
        WaTextView waTextView = this.A04;
        if (waTextView != null) {
            C147547Es r0 = this.A05;
            if (r0 == null) {
                throw C18270x1.A0S("style");
            }
            boolean z = this.A06;
            Context context = r0.A00;
            int i = R.attr.f3nameremoved;
            int i2 = R.color.f5nameremoved;
            if (z) {
                i = R.attr.f3nameremoved;
                i2 = R.color.f5nameremoved;
            }
            AnonymousClass5Yj.A0B(context, waTextView, i, i2);
        }
    }

    public final void A06() {
        WaTextView waTextView = this.A04;
        if (waTextView == null) {
            return;
        }
        if (this.A05 == null) {
            throw C18270x1.A0S("style");
        }
        int i = 1;
        if (getOrientation() != 1) {
            i = 8388611;
        }
        waTextView.setGravity(i);
    }

    public final void setIcon(int i) {
        WaImageView waImageView = this.A03;
        if (waImageView != null) {
            waImageView.setImageDrawable(AnonymousClass0VX.A01(getContext(), i));
        }
    }

    public final void setText(int i) {
        this.A01 = i;
        WaTextView waTextView = this.A04;
        if (waTextView != null) {
            waTextView.setText(i);
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.A06 = z;
        A05();
        A01();
        setClickable(z);
        setFocusable(z);
    }

    public void setOrientation(int i) {
        super.setOrientation(i);
        if (!this.A07) {
            return;
        }
        if (this.A05 == null) {
            A00();
            return;
        }
        A02();
        A06();
        A04();
        A03();
    }

    public final void setIcon(Drawable drawable) {
        WaImageView waImageView = this.A03;
        if (waImageView != null) {
            waImageView.setImageDrawable(drawable);
        }
    }

    public final void setText(CharSequence charSequence) {
        WaTextView waTextView = this.A04;
        if (waTextView != null) {
            waTextView.setText(charSequence);
        }
    }
}
