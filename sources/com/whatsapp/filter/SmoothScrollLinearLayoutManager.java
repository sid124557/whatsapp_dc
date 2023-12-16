package com.whatsapp.filter;

import X.AnonymousClass0Q1;
import X.C188818zX;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class SmoothScrollLinearLayoutManager extends LinearLayoutManager {
    public void A0z(AnonymousClass0Q1 r4, RecyclerView recyclerView, int i) {
        C188818zX r0 = new C188818zX(recyclerView.getContext(), this, 1);
        r0.A00 = i;
        A0x(r0);
    }

    public SmoothScrollLinearLayoutManager(int i) {
        super(i);
    }
}
