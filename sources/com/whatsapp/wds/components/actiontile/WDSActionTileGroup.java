package com.whatsapp.wds.components.actiontile;

import X.AnonymousClass4GJ;
import X.AnonymousClass691;
import X.C116855qy;
import X.C162457s7;
import X.C378924l;
import X.C86624Kv;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public final class WDSActionTileGroup extends LinearLayout implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public WDSActionTileGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSActionTileGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        addOnLayoutChangeListener(new AnonymousClass691((Object) this, 13));
    }

    public /* synthetic */ WDSActionTileGroup(Context context, AttributeSet attributeSet, int i, C378924l r5) {
        this(context, C86624Kv.A09(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSActionTileGroup(Context context) {
        this(context, (AttributeSet) null);
        C162457s7.A0J(context, 1);
    }
}
