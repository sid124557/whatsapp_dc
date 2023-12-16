package com.whatsapp.ptv;

import X.AnonymousClass000;
import X.AnonymousClass1VX;
import X.AnonymousClass4GJ;
import X.C116855qy;
import X.C18320x8;
import X.C620633i;
import X.C620733j;
import X.C64333Db;
import X.C86634Kw;
import X.C86664Kz;
import X.C88864av;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public class PushToVideoRecordingCountdown extends FrameLayout implements AnonymousClass4GJ {
    public int A00;
    public long A01;
    public WaTextView A02;
    public C620633i A03;
    public C620733j A04;
    public AnonymousClass1VX A05;
    public C116855qy A06;
    public boolean A07;
    public final Handler A08;

    public void A00() {
        if (!this.A07) {
            this.A07 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A04 = C64333Db.A2t(A002);
            this.A05 = C64333Db.A4B(A002);
            this.A03 = C64333Db.A2o(A002);
        }
    }

    public final void A02(int i) {
        this.A00 = i;
        WaTextView waTextView = this.A02;
        int i2 = 8;
        if (i > 0) {
            i2 = 0;
        }
        waTextView.setVisibility(i2);
        C86634Kw.A1K(this.A02, this.A04.A0M(), (long) i);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A06;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public PushToVideoRecordingCountdown(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        this.A08 = AnonymousClass000.A0A();
        this.A00 = 0;
        this.A01 = 0;
        A01();
    }

    public final void A01() {
        WaTextView waTextView = new WaTextView(getContext());
        this.A02 = waTextView;
        waTextView.setVisibility(8);
        C18320x8.A11(getResources(), this.A02, R.color.f5nameremoved);
        this.A02.setShadowLayer(25.0f, 0.0f, 10.0f, getResources().getColor(R.color.f5nameremoved));
        this.A02.setTextSize(0, (float) Math.min(getResources().getDimensionPixelSize(R.dimen.f6nameremoved), C86664Kz.A0B(this)));
        WaTextView waTextView2 = this.A02;
        waTextView2.setTypeface(waTextView2.getTypeface(), 1);
        FrameLayout.LayoutParams A0p = C86664Kz.A0p();
        A0p.gravity = 17;
        this.A02.setLayoutParams(A0p);
        addView(this.A02);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.A02.setTextSize(0, (float) Math.min(getResources().getDimensionPixelSize(R.dimen.f6nameremoved), C86664Kz.A0B(this)));
    }

    public void setDelayOnFinishingCountdown(long j) {
        this.A01 = j;
    }

    public PushToVideoRecordingCountdown(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A08 = AnonymousClass000.A0A();
        this.A00 = 0;
        this.A01 = 0;
        A01();
    }

    public PushToVideoRecordingCountdown(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A00();
    }

    public PushToVideoRecordingCountdown(Context context) {
        super(context);
        A00();
        this.A08 = AnonymousClass000.A0A();
        this.A00 = 0;
        this.A01 = 0;
        A01();
    }
}
