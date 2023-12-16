package com.whatsapp.preference;

import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass5Yj;
import X.C011409i;
import X.C107335b8;
import X.C107405bG;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public class ChatHistoryPreference extends WaPreference {
    public int A00;
    public int A01;

    public ChatHistoryPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = C107405bG.A00(context, R.attr.f3nameremoved, R.color.f5nameremoved);
        this.A01 = C107405bG.A00(context, R.attr.f3nameremoved, AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved));
    }

    public void A0T(C011409i r4) {
        super.A0T(r4);
        View view = r4.A0H;
        C107335b8.A0E(AnonymousClass0x9.A0F(view, 16908294), this.A00);
        AnonymousClass002.A09(view, 16908310).setTextColor(this.A01);
    }

    public ChatHistoryPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChatHistoryPreference(Context context) {
        this(context, (AttributeSet) null);
    }
}
