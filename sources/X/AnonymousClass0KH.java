package X;

import android.content.Context;
import java.util.Objects;

/* renamed from: X.0KH  reason: invalid class name */
public final class AnonymousClass0KH {
    public final C06270Wx A00;

    public AnonymousClass0KH(Context context) {
        C06270Wx r0;
        Objects.requireNonNull(context);
        Objects.requireNonNull(context);
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            r0 = new AnonymousClass08G();
        } else {
            r0 = new AnonymousClass08H(context);
        }
        this.A00 = r0;
    }
}
