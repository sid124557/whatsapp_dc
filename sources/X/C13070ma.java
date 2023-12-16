package X;

import android.view.View;

/* renamed from: X.0ma  reason: invalid class name and case insensitive filesystem */
public final class C13070ma implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C05390Td A02;
    public final /* synthetic */ C153427bI A03;
    public final /* synthetic */ C151767Wf A04;

    public C13070ma(View view, C05390Td r2, C153427bI r3, C151767Wf r4, int i) {
        this.A04 = r4;
        this.A01 = view;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = i;
    }

    public final void run() {
        this.A04.A00(this.A01, this.A02.A01(this.A03, this.A00));
    }
}
