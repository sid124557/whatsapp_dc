package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0YH;
import X.AnonymousClass4GJ;
import X.AnonymousClass5T2;
import X.AnonymousClass6GR;
import X.C06560Yg;
import X.C111685iW;
import X.C116855qy;
import X.C188778zT;
import X.C620733j;
import X.C88864av;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;

public class WaTabLayout extends TabLayout implements AnonymousClass4GJ {
    public C620733j A00;
    public C116855qy A01;
    public boolean A02;

    public void setTabsClickable(boolean z) {
        for (int i = 0; i < this.A0k.size(); i++) {
            AnonymousClass5T2 A05 = A05(i);
            if (A05 != null) {
                A05.A02.setClickable(z);
            }
        }
    }

    public final int A0I(int i, boolean z) {
        int size = (z ? 1 : 0) + this.A0k.size();
        if (i < 0 || i >= size) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Tab index ");
            A0o.append(i);
            A0o.append(" is out of range [0, ");
            A0o.append(size);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0e(A0o));
        } else if (!C620733j.A04(this.A00)) {
            return (size - i) - 1;
        } else {
            return i;
        }
    }

    public AnonymousClass5T2 A0J(int i) {
        if (i < 0 || i >= this.A0k.size()) {
            return null;
        }
        return super.A05(A0I(i, false));
    }

    public void A0K() {
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C88864av.A02((C111685iW) generatedComponent());
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setupTabsForAccessibility(View view) {
        View view2;
        C06560Yg.A0O(this, new C188778zT(this, 13));
        ArrayList arrayList = this.A0k;
        int size = arrayList.size() + 1;
        View[] viewArr = new View[size];
        viewArr[arrayList.size()] = view;
        for (int i = 0; i < arrayList.size(); i++) {
            AnonymousClass5T2 A0J = A0J(i);
            if (A0J != null) {
                viewArr[i] = A0J.A02;
            }
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 == 0) {
                view2 = null;
            } else {
                view2 = viewArr[i2 - 1];
            }
            C06560Yg.A0O(viewArr[i2], new AnonymousClass6GR(view2, this, i2));
        }
    }

    public void setupWithViewPager(ViewPager viewPager) {
        if (viewPager != null) {
            boolean z = viewPager instanceof WaViewPager;
            if (!z) {
                throw AnonymousClass001.A0c("WaTabLayout should only be setup with WaViewPager");
            } else if (!z) {
                throw AnonymousClass001.A0c("WaTabLayout should only be setup with WaViewPager");
            }
        }
        A0C(viewPager, false);
    }

    public WaTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0K();
        AnonymousClass0YH.A06(this, 0);
    }

    public WaTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0K();
        AnonymousClass0YH.A06(this, 0);
    }

    public WaTabLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A0K();
    }

    public WaTabLayout(Context context) {
        super(context, (AttributeSet) null);
        A0K();
        AnonymousClass0YH.A06(this, 0);
    }
}
