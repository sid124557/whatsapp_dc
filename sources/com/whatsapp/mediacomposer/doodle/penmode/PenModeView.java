package com.whatsapp.mediacomposer.doodle.penmode;

import X.AnonymousClass001;
import X.AnonymousClass928;
import X.C06560Yg;
import X.C109485eh;
import X.C179468jC;
import X.C182668on;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import java.util.List;

public class PenModeView extends FrameLayout {
    public C179468jC A00;
    public final List A01 = AnonymousClass001.A0s();

    public void setOnSelectedListener(C179468jC r1) {
        this.A00 = r1;
    }

    public PenModeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public final void A00() {
        View.inflate(getContext(), R.layout.f8nameremoved, this);
        A01(new AnonymousClass928(0), R.id.pen_mode_thin);
        A01(new AnonymousClass928(1), R.id.pen_mode_medium);
        A01(new AnonymousClass928(2), R.id.pen_mode_thick);
        A01(new AnonymousClass928(3), R.id.pen_mode_blur);
    }

    public final void A01(C182668on r4, int i) {
        View A02 = C06560Yg.A02(this, i);
        this.A01.add(A02);
        A02.setOnClickListener(new C109485eh(this, 26, r4));
    }

    public PenModeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public PenModeView(Context context) {
        super(context);
        A00();
    }
}
