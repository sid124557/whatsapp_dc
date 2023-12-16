package com.whatsapp.components;

import X.AnonymousClass4GJ;
import X.AnonymousClass549;
import X.AnonymousClass5R0;
import X.C02680He;
import X.C111685iW;
import X.C116855qy;
import X.C88864av;
import X.C89654ea;
import X.C95084sb;
import X.C95814uZ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.whatsapp.R;

public class InviteViaLinkView extends RelativeLayout implements AnonymousClass4GJ {
    public AnonymousClass5R0 A00;
    public C116855qy A01;
    public boolean A02;

    public void setupOnClick(C95814uZ r7, C89654ea r8, C95084sb r9) {
        setOnClickListener(new AnonymousClass549(this, r9, r7, r8, 0));
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public InviteViaLinkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = ((C88864av) ((C111685iW) generatedComponent())).A0I.ACU();
        }
        View.inflate(context, R.layout.f8nameremoved, this);
        if (attributeSet == null) {
            setId(R.id.invite_via_link_button);
            setLayoutParams(new RelativeLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.f6nameremoved)));
            setBackground(C02680He.A00(context.getTheme(), getResources(), R.drawable.selector_orange_gradient));
            setGravity(16);
        }
    }

    public InviteViaLinkView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InviteViaLinkView(Context context) {
        this(context, (AttributeSet) null);
    }
}
