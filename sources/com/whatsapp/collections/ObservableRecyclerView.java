package com.whatsapp.collections;

import X.AnonymousClass5RN;
import X.AnonymousClass5RR;
import X.C162457s7;
import X.C378924l;
import X.C86624Kv;
import X.C86634Kw;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

public final class ObservableRecyclerView extends RecyclerView {
    public final AnonymousClass5RN A00;
    public final AnonymousClass5RR A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ObservableRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        this.A00 = new AnonymousClass5RN();
        this.A01 = new AnonymousClass5RR();
    }

    public void draw(Canvas canvas) {
        C162457s7.A0J(canvas, 0);
        AnonymousClass5RR r0 = this.A01;
        r0.A00();
        super.draw(canvas);
        r0.A01();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AnonymousClass5RN r0 = this.A00;
        r0.A01();
        super.onLayout(z, i, i2, i3, i4);
        r0.A00();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ObservableRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    public /* synthetic */ ObservableRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), C86634Kw.A02(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ObservableRecyclerView(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
