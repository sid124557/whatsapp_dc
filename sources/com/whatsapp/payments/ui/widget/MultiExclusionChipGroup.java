package com.whatsapp.payments.ui.widget;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass4GJ;
import X.C116855qy;
import X.C202189lW;
import X.C204199oy;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.chip.ChipGroup;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MultiExclusionChipGroup extends ChipGroup implements AnonymousClass4GJ {
    public C202189lW A00;
    public C116855qy A01;
    public Map A02;
    public Set A03;
    public boolean A04;

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public MultiExclusionChipGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
        this.A03 = AnonymousClass002.A0K();
        this.A02 = AnonymousClass001.A0t();
    }

    public void A00(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MultiExclusionChip multiExclusionChip = (MultiExclusionChip) it.next();
            this.A02.put(multiExclusionChip, list);
            multiExclusionChip.setCheckable(true);
            multiExclusionChip.setClickable(true);
            super.addView(multiExclusionChip);
            multiExclusionChip.A00 = new C204199oy(multiExclusionChip, 1, this);
        }
    }

    public void setOnSelectionChangedListener(C202189lW r1) {
        this.A00 = r1;
    }

    public MultiExclusionChipGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
    }

    public MultiExclusionChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
        this.A03 = AnonymousClass002.A0K();
        this.A02 = AnonymousClass001.A0t();
    }

    public MultiExclusionChipGroup(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
        this.A03 = AnonymousClass002.A0K();
        this.A02 = AnonymousClass001.A0t();
    }
}
