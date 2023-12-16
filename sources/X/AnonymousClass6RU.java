package X;

import android.content.Context;
import android.os.Looper;
import android.util.Log;

/* renamed from: X.6RU  reason: invalid class name */
public final class AnonymousClass6RU extends C127196Ra {
    public AnonymousClass6RU(Context context, Looper looper, C183908qr r10, C180868ll r11, AnonymousClass7P4 r12) {
        super(context, looper, r10, r11, r12, 224);
    }

    public final void B1m(String str) {
        Log.w("GoogleAuthSvcClientImpl", "GoogleAuthServiceClientImpl disconnected with reason: ".concat(String.valueOf(str)));
        super.B1m(str);
    }

    public final int B9m() {
        return 17895000;
    }
}
