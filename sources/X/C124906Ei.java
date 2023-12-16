package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.6Ei  reason: invalid class name and case insensitive filesystem */
public class C124906Ei extends View {
    public final int[] A00 = new int[2];
    public final int[] A01 = new int[2];
    public final /* synthetic */ AnonymousClass5ZS A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C124906Ei(Context context, AnonymousClass5ZS r4) {
        super(context);
        this.A02 = r4;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass5ZS r2 = this.A02;
        View view = r2.A08;
        if (view == null) {
            return super.onTouchEvent(motionEvent);
        }
        view.getLocationOnScreen(this.A00);
        getLocationOnScreen(this.A01);
        return r2.A08.dispatchTouchEvent(motionEvent);
    }
}
