package X;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: X.943  reason: invalid class name */
public class AnonymousClass943 extends OrientationEventListener {
    public final /* synthetic */ C195579Yl A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass943(Context context, C195579Yl r2) {
        super(context);
        this.A00 = r2;
    }

    public void onOrientationChanged(int i) {
        int i2 = ((((i + 45) + 360) / 90) % 4) * 90;
        C195579Yl r2 = this.A00;
        int A01 = r2.A01();
        if (r2.A03 != i2 || r2.A04 != A01) {
            r2.A03 = i2;
            r2.A0Q.BXV(i2);
            r2.A03(r2.A0C);
        }
    }
}
