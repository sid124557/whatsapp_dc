package X;

import android.os.SystemClock;
import android.view.View;

/* renamed from: X.39j  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C634739j implements View.OnClickListener {
    public final /* synthetic */ View.OnClickListener A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C380625j A02;
    public final /* synthetic */ C69893Yx A03;

    public final void onClick(View view) {
        C69893Yx r11 = this.A03;
        View.OnClickListener onClickListener = this.A00;
        View view2 = this.A01;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - r11.element > 1000) {
            r11.element = elapsedRealtime;
            onClickListener.onClick(view2);
        }
    }

    public /* synthetic */ C634739j(View.OnClickListener onClickListener, View view, C380625j r3, C69893Yx r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = onClickListener;
        this.A01 = view;
    }
}
