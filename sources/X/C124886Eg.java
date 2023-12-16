package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.6Eg  reason: invalid class name and case insensitive filesystem */
public final class C124886Eg extends View {
    public final /* synthetic */ int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C124886Eg(Activity activity, int i) {
        super(activity);
        this.A00 = i;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, C86664Kz.A05(this.A00));
    }
}
