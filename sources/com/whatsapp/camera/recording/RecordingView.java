package com.whatsapp.camera.recording;

import X.C06560Yg;
import X.C18300x5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;

public class RecordingView extends RelativeLayout {
    public TextView A00;
    public CircularProgressBar A01;
    public final Context A02;

    public RecordingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = context;
        A00();
    }

    public void A00() {
        View.inflate(getContext(), R.layout.f8nameremoved, this);
        this.A01 = (CircularProgressBar) C06560Yg.A02(this, R.id.recording_progress);
        this.A00 = C18300x5.A0G(this, R.id.recording_time);
        this.A01.setMax(100);
    }

    public RecordingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A02 = context;
        A00();
    }

    public RecordingView(Context context) {
        super(context, (AttributeSet) null);
        this.A02 = context;
        A00();
    }
}
