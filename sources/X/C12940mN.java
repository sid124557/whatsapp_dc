package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.0mN  reason: invalid class name and case insensitive filesystem */
public class C12940mN implements Runnable {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C010107z A02;
    public final /* synthetic */ AnonymousClass0WL A03;

    public C12940mN(Rect rect, View view, C010107z r3, AnonymousClass0WL r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = view;
        this.A00 = rect;
    }

    public void run() {
        AnonymousClass0WL.A01(this.A01, this.A00);
    }
}
