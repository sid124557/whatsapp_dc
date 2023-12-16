package com.whatsapp.biz;

import X.AnonymousClass0x9;
import X.AnonymousClass4GJ;
import X.C106185Xy;
import X.C116855qy;
import X.C18280x3;
import X.C18290x4;
import X.C56612sH;
import X.C620733j;
import X.C64333Db;
import X.C88864av;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.whatsapp.R;

public class BusinessHoursView extends LinearLayout implements AnonymousClass4GJ {
    public ImageView A00;
    public BusinessHoursContentView A01;
    public C106185Xy A02;
    public C56612sH A03;
    public C620733j A04;
    public C116855qy A05;
    public boolean A06;
    public boolean A07;

    public void A00() {
        if (!this.A07) {
            this.A07 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A03 = C64333Db.A2p(A002);
            this.A04 = C64333Db.A2t(A002);
            this.A02 = (C106185Xy) A002.A00.A1j.get();
        }
    }

    public final void A02() {
        this.A01.setFullView(this.A06);
        ImageView imageView = this.A00;
        Context context = getContext();
        boolean z = this.A06;
        int i = R.drawable.ic_chevron_down;
        if (z) {
            i = R.drawable.ic_chevron_up;
        }
        C18290x4.A1A(context, imageView, i);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A05;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public BusinessHoursView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        this.A06 = false;
        A01();
    }

    public final void A01() {
        View inflate = C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this, true);
        setFocusable(true);
        this.A01 = (BusinessHoursContentView) inflate.findViewById(R.id.business_hours_content_view);
        this.A00 = AnonymousClass0x9.A0F(inflate, R.id.business_hours_chevron_icon);
    }

    public BusinessHoursView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A06 = false;
        A01();
    }

    public BusinessHoursView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
        this.A06 = false;
        A01();
    }

    public BusinessHoursView(Context context) {
        super(context);
        A00();
        this.A06 = false;
        A01();
    }

    public BusinessHoursView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
