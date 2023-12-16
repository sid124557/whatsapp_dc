package com.whatsapp.mediacomposer.doodle.shapepicker;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0R6;
import X.AnonymousClass0UY;
import X.AnonymousClass6HL;
import X.AnonymousClass6Hm;
import X.AnonymousClass6JA;
import X.C04690Qg;
import X.C18290x4;
import X.C188818zX;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.R;
import com.whatsapp.media.GridLayoutManagerNonPredictiveAnimations;

public class ShapePickerRecyclerView extends AnonymousClass6JA {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C04690Qg A04;
    public GridLayoutManagerNonPredictiveAnimations A05;

    public final void A14() {
        if (this.A01 == -1) {
            int measuredWidth = getMeasuredWidth();
            int i = this.A02;
            int i2 = i + this.A03;
            int i3 = measuredWidth / i2;
            if ((i2 * i3) + i <= getMeasuredWidth()) {
                i3++;
            }
            this.A01 = Math.max(1, i3);
        }
    }

    public final void A16(GridLayoutManager gridLayoutManager, AnonymousClass0R6 r4) {
        if (r4 instanceof AnonymousClass6Hm) {
            AnonymousClass6Hm r42 = (AnonymousClass6Hm) r4;
            gridLayoutManager.A01 = new AnonymousClass6HL(gridLayoutManager, r42, this);
            int i = this.A01;
            if (r42.A00 != i) {
                r42.A00 = i;
                if (r42.A02 == null) {
                    r42.A0M();
                }
            }
        }
    }

    public int getActualShapeSpacing() {
        int i = this.A00;
        if (i == -1) {
            A14();
            if (this.A01 > 1) {
                int measuredWidth = getMeasuredWidth();
                int i2 = this.A01;
                i = (measuredWidth - (this.A02 * i2)) / (i2 - 1);
            } else {
                i = 0;
            }
            this.A00 = i;
        }
        return i;
    }

    public int getAdapterItemCount() {
        AnonymousClass0R6 r0 = this.A0N;
        if (r0 != null) {
            return r0.A0G();
        }
        throw AnonymousClass001.A0e("Must set adapter first");
    }

    public ShapePickerRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A15(context);
    }

    public final void A15(Context context) {
        this.A02 = context.getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
        boolean A1U = AnonymousClass000.A1U(C18290x4.A0G(this).getConfiguration().orientation, 1);
        Resources A0G = C18290x4.A0G(this);
        int i = R.dimen.f6nameremoved;
        if (A1U) {
            i = R.dimen.f6nameremoved;
        }
        this.A03 = A0G.getDimensionPixelSize(i);
        this.A00 = -1;
        this.A01 = -1;
        this.A0h = true;
        this.A04 = new C188818zX(context, this, 2);
    }

    public void A17(boolean z, boolean z2) {
        int i;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        Resources resources = getResources();
        int i2 = R.dimen.f6nameremoved;
        if (z) {
            i2 = R.dimen.f6nameremoved;
        }
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i2);
        if (z2) {
            Resources resources2 = getResources();
            int i3 = R.dimen.f6nameremoved;
            if (z) {
                i3 = R.dimen.f6nameremoved;
            }
            i = resources2.getDimensionPixelSize(i3);
        } else {
            i = 0;
        }
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, i);
    }

    public int getColumnCount() {
        A14();
        return this.A01;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean A1T = AnonymousClass001.A1T(configuration.orientation);
        Resources A0G = C18290x4.A0G(this);
        int i = R.dimen.f6nameremoved;
        if (A1T) {
            i = R.dimen.f6nameremoved;
        }
        this.A03 = A0G.getDimensionPixelSize(i);
        this.A00 = -1;
        this.A01 = -1;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.A00 = -1;
        this.A01 = -1;
        A14();
        GridLayoutManager gridLayoutManager = (GridLayoutManager) getLayoutManager();
        int i3 = this.A01;
        gridLayoutManager.A1o(i3 * i3);
        A16(gridLayoutManager, this.A0N);
        A0P();
    }

    public void setAdapter(AnonymousClass0R6 r4) {
        super.setAdapter(r4);
        this.A00 = -1;
        this.A01 = -1;
        A14();
        Context context = getContext();
        int i = this.A01;
        this.A05 = new GridLayoutManagerNonPredictiveAnimations(context, i * i);
        setItemAnimator((AnonymousClass0UY) null);
        A16(this.A05, r4);
        setLayoutManager(this.A05);
    }

    public ShapePickerRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A15(context);
    }

    public ShapePickerRecyclerView(Context context) {
        super(context);
        A15(context);
    }
}
