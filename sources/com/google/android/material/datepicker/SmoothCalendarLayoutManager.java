package com.google.android.material.datepicker;

import X.AnonymousClass0Q1;
import X.C188818zX;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class SmoothCalendarLayoutManager extends LinearLayoutManager {
    public void A0z(AnonymousClass0Q1 r4, RecyclerView recyclerView, int i) {
        C188818zX r0 = new C188818zX(recyclerView.getContext(), this, 0);
        r0.A00 = i;
        A0x(r0);
    }

    public SmoothCalendarLayoutManager(int i) {
        super(i);
    }
}
