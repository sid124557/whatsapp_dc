package X;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: X.6EQ  reason: invalid class name */
public class AnonymousClass6EQ extends OrientationEventListener {
    public int A00;
    public final /* synthetic */ C132906gD A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6EQ(Context context, C132906gD r3) {
        super(context);
        this.A01 = r3;
        this.A00 = r3.A0U.getRotation();
    }

    public void onOrientationChanged(int i) {
        int i2;
        C132906gD r3 = this.A01;
        int rotation = r3.A0U.getRotation();
        if (!(rotation == -1 || rotation == (i2 = this.A00) || AnonymousClass001.A0A(i2, rotation) % 2 != 0)) {
            r3.surfaceChanged(r3.A0V, 0, 0, 0);
        }
        this.A00 = rotation;
    }

    public void enable() {
        super.enable();
        this.A00 = this.A01.A0U.getRotation();
    }
}
