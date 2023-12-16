package com.whatsapp.calling.controls.view;

import X.AnonymousClass0x2;
import X.AnonymousClass4GJ;
import X.AnonymousClass5UY;
import X.C116855qy;
import X.C18280x3;
import X.C86614Ku;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public final class CallControlHeader extends LinearLayout implements AnonymousClass4GJ {
    public TextView A00;
    public C116855qy A01;
    public boolean A02;
    public final View A03;
    public final TextView A04;
    public final AnonymousClass5UY A05;
    public final WDSButton A06;

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public CallControlHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        View.inflate(getContext(), R.layout.f8nameremoved, this);
        this.A04 = AnonymousClass0x2.A0I(this, R.id.title);
        this.A03 = C18280x3.A0E(this, R.id.e2ee_container);
        this.A06 = C86614Ku.A0p(this, R.id.add_participant_button);
        this.A05 = AnonymousClass0x2.A0M(this, R.id.participant_count_container_stub);
    }

    public CallControlHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        View.inflate(getContext(), R.layout.f8nameremoved, this);
        this.A04 = AnonymousClass0x2.A0I(this, R.id.title);
        this.A03 = C18280x3.A0E(this, R.id.e2ee_container);
        this.A06 = C86614Ku.A0p(this, R.id.add_participant_button);
        this.A05 = AnonymousClass0x2.A0M(this, R.id.participant_count_container_stub);
    }

    public CallControlHeader(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public CallControlHeader(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        View.inflate(getContext(), R.layout.f8nameremoved, this);
        this.A04 = AnonymousClass0x2.A0I(this, R.id.title);
        this.A03 = C18280x3.A0E(this, R.id.e2ee_container);
        this.A06 = C86614Ku.A0p(this, R.id.add_participant_button);
        this.A05 = AnonymousClass0x2.A0M(this, R.id.participant_count_container_stub);
    }
}
