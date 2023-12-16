package com.whatsapp.textstatuscomposer.voice;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x7;
import X.AnonymousClass4GJ;
import X.AnonymousClass5YI;
import X.C116855qy;
import X.C183188pd;
import X.C56612sH;
import X.C64333Db;
import X.C86614Ku;
import X.C86664Kz;
import X.C88864av;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

public class VoiceStatusRecordingVisualizer extends View implements AnonymousClass4GJ {
    public long A00;
    public long A01;
    public C56612sH A02;
    public C183188pd A03;
    public C116855qy A04;
    public boolean A05;
    public boolean A06;
    public final float A07;
    public final float A08;
    public final Paint A09;
    public final Paint A0A;
    public final List A0B;

    public final Object generatedComponent() {
        C116855qy r0 = this.A04;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        Paint paint;
        double pow;
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        long j = this.A00;
        if (j != 0) {
            f = ((float) AnonymousClass0x7.A0E(j)) / ((float) this.A01);
            if (f > 1.0f) {
                this.A06 = false;
                f = 1.0f;
            }
        } else {
            f = 0.0f;
        }
        int A052 = AnonymousClass000.A05(this, canvas2.getHeight());
        int totalSegmentsCount = getTotalSegmentsCount();
        for (int i = 0; i < totalSegmentsCount; i++) {
            List list = this.A0B;
            float f3 = 1.0f;
            if (i < list.size()) {
                f2 = AnonymousClass001.A05(list.get(i));
                if (i == AnonymousClass002.A03(list)) {
                    f3 = f;
                }
            } else {
                f2 = 0.006f;
                if (i != list.size()) {
                    paint = this.A0A;
                    pow = 1.0d - (Math.pow((double) ((f3 * -2.0f) + 2.0f), 3.0d) / 2.0d);
                    float f4 = this.A08;
                    float f5 = (f4 / 2.0f) + (this.A07 * ((float) i));
                    float f6 = (float) A052;
                    float max = Math.max(0.006f, f2) * f6 * ((float) pow);
                    float paddingTop = ((float) getPaddingTop()) + ((f6 - max) / 2.0f);
                    paint.setStrokeWidth(f4);
                    canvas2.drawLine(f5, paddingTop, f5, paddingTop + max, paint);
                }
            }
            paint = this.A09;
            if (f3 < 0.5f) {
                pow = (double) (4.0f * f3 * f3 * f3);
                float f42 = this.A08;
                float f52 = (f42 / 2.0f) + (this.A07 * ((float) i));
                float f62 = (float) A052;
                float max2 = Math.max(0.006f, f2) * f62 * ((float) pow);
                float paddingTop2 = ((float) getPaddingTop()) + ((f62 - max2) / 2.0f);
                paint.setStrokeWidth(f42);
                canvas2.drawLine(f52, paddingTop2, f52, paddingTop2 + max2, paint);
            }
            pow = 1.0d - (Math.pow((double) ((f3 * -2.0f) + 2.0f), 3.0d) / 2.0d);
            float f422 = this.A08;
            float f522 = (f422 / 2.0f) + (this.A07 * ((float) i));
            float f622 = (float) A052;
            float max22 = Math.max(0.006f, f2) * f622 * ((float) pow);
            float paddingTop22 = ((float) getPaddingTop()) + ((f622 - max22) / 2.0f);
            paint.setStrokeWidth(f422);
            canvas2.drawLine(f522, paddingTop22, f522, paddingTop22 + max22, paint);
        }
        if (this.A06) {
            invalidate();
        }
    }

    public void setListener(C183188pd r2) {
        this.A03 = r2;
        if (getWidth() > 0 && r2 != null) {
            r2.Bb7(getTotalSegmentsCount());
        }
    }

    public VoiceStatusRecordingVisualizer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A05) {
            this.A05 = true;
            this.A02 = C64333Db.A2p(C88864av.A00(generatedComponent()));
        }
        this.A0B = AnonymousClass001.A0s();
        Paint A0a = C86664Kz.A0a(5);
        this.A09 = A0a;
        this.A00 = 0;
        this.A01 = 750;
        this.A07 = AnonymousClass5YI.A01(context, 4.3f);
        this.A08 = AnonymousClass5YI.A01(context, 2.5f);
        A0a.setStrokeCap(Paint.Cap.ROUND);
        C86614Ku.A10(context, A0a, R.color.f5nameremoved);
        Paint paint = new Paint(A0a);
        this.A0A = paint;
        C86614Ku.A10(context, paint, R.color.f5nameremoved);
    }

    private int getTotalSegmentsCount() {
        return ((int) Math.floor((double) ((((float) AnonymousClass001.A0I(this)) - this.A08) / this.A07))) + 1;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C183188pd r1 = this.A03;
        if (r1 != null) {
            r1.Bb7(getTotalSegmentsCount());
        }
    }

    public VoiceStatusRecordingVisualizer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceStatusRecordingVisualizer(Context context) {
        this(context, (AttributeSet) null);
    }
}
