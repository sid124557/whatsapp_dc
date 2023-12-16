package com.whatsapp.calling.views;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass4GJ;
import X.AnonymousClass4Rs;
import X.C107295b4;
import X.C107565bW;
import X.C111685iW;
import X.C116855qy;
import X.C18290x4;
import X.C18300x5;
import X.C86614Ku;
import X.C86634Kw;
import X.C88864av;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public class VoipReturnToCallBanner extends AnonymousClass4Rs implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;
    public final TextView A02;
    public final TextView A03;
    public final WaImageView A04;

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void setCallNotificationTimer(long j) {
        TextView textView = this.A02;
        textView.setVisibility(0);
        C107565bW.A0I(textView, this.A07, C18290x4.A0B(j));
        textView.setTag(Long.valueOf(j));
    }

    public VoipReturnToCallBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            ((C88864av) ((C111685iW) generatedComponent())).A4S(this);
        }
    }

    public VoipReturnToCallBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            ((C88864av) ((C111685iW) generatedComponent())).A4S(this);
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        TextView A0G = C18300x5.A0G(inflate, R.id.call_notification_timer);
        this.A02 = A0G;
        this.A03 = C18300x5.A0G(inflate, R.id.call_notification_title);
        this.A04 = AnonymousClass0x9.A0L(inflate, R.id.call_notification_icon);
        A0G.setFocusable(true);
        C86614Ku.A1H(A0G, this, 3);
        setBannerClickListener(context, this);
        C107295b4.A02(this);
        setVisibility(AnonymousClass001.A08(this.A01.A01() ? 1 : 0));
        C86634Kw.A1I(A0G);
        A0G.setTag((Object) null);
    }

    public VoipReturnToCallBanner(Context context) {
        this(context, (AttributeSet) null);
    }
}
