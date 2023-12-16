package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0R4;
import X.AnonymousClass4ZW;
import X.AnonymousClass6JF;
import X.C131926eP;
import X.C181598n1;
import X.C620733j;
import android.content.Context;
import android.util.AttributeSet;

public class WaViewPager extends AnonymousClass4ZW {
    public C620733j A00;

    public void A0P(int i) {
        super.A0F(A0O(i), true);
    }

    public static int A00(C620733j r1, int i, int i2) {
        if (i < 0 || i >= i2) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Item index ");
            A0o.append(i);
            A0o.append(" is out of range [0, ");
            A0o.append(i2);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0e(A0o));
        } else if (!C620733j.A04(r1)) {
            return (i2 - i) - 1;
        } else {
            return i;
        }
    }

    private int getItemCount() {
        AnonymousClass0R4 r0 = this.A0V;
        if (r0 == null) {
            return 0;
        }
        return r0.A0C();
    }

    public int A0O(int i) {
        return A00(this.A00, i, getItemCount());
    }

    public AnonymousClass0R4 getAdapter() {
        return this.A0V;
    }

    @Deprecated
    public int getCurrentItem() {
        return this.A0A;
    }

    public AnonymousClass0R4 getRealAdapter() {
        AnonymousClass0R4 r1 = this.A0V;
        if (r1 instanceof AnonymousClass6JF) {
            return ((AnonymousClass6JF) r1).A00;
        }
        return null;
    }

    public void setAdapter(AnonymousClass0R4 r4) {
        AnonymousClass0R4 r2;
        if (r4 == null) {
            r2 = null;
        } else {
            boolean z = r4 instanceof C181598n1;
            C620733j r1 = this.A00;
            if (z) {
                r2 = new C131926eP(r4, (C181598n1) r4, r1);
            } else {
                r2 = new AnonymousClass6JF(r4, r1);
            }
        }
        super.setAdapter(r2);
        if (r4 != null && r4.A0C() > 0) {
            setCurrentLogicalItem(0);
        }
    }

    public WaViewPager(Context context) {
        super(context);
    }

    public int getCurrentLogicalItem() {
        if (getItemCount() == 0) {
            return -1;
        }
        return A0O(this.A0A);
    }

    @Deprecated
    public void setCurrentItem(int i) {
        super.setCurrentItem(i);
    }

    public void setCurrentLogicalItem(int i) {
        super.setCurrentItem(A0O(i));
    }

    public WaViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
