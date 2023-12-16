package com.google.android.material.timepicker;

import X.C109415ea;
import X.C154187ck;
import X.C169998Bl;
import X.C188718zN;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;

public class TimePickerView extends ConstraintLayout {
    public final View.OnClickListener A00;
    public final MaterialButtonToggleGroup A01;
    public final Chip A02;
    public final Chip A03;
    public final ClockFaceView A04;
    public final ClockHandView A05;

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = new C109415ea(this, 8);
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this);
        this.A04 = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.A01 = materialButtonToggleGroup;
        materialButtonToggleGroup.A08.add(new C169998Bl(this));
        this.A03 = (Chip) findViewById(R.id.material_minute_tv);
        this.A02 = (Chip) findViewById(R.id.material_hour_tv);
        this.A05 = (ClockHandView) findViewById(R.id.material_clock_hand);
        C154187ck r1 = new C154187ck(new GestureDetector(getContext(), new C188718zN(this, 0)), 0, this);
        this.A03.setOnTouchListener(r1);
        this.A02.setOnTouchListener(r1);
        Chip chip = this.A03;
        chip.setTag(R.id.selection_type, 12);
        Chip chip2 = this.A02;
        chip2.setTag(R.id.selection_type, 10);
        View.OnClickListener onClickListener = this.A00;
        chip.setOnClickListener(onClickListener);
        chip2.setOnClickListener(onClickListener);
        chip.A08 = "android.view.View";
        chip2.A08 = "android.view.View";
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.A02.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context) {
        this(context, (AttributeSet) null);
    }
}
