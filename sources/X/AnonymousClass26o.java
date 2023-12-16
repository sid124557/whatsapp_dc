package X;

import android.os.Build;
import com.whatsapp.util.Log;

/* renamed from: X.26o  reason: invalid class name */
public final class AnonymousClass26o {
    public static final void A00(AnonymousClass4GP r2) {
        if (Build.VERSION.SDK_INT >= 23) {
            r2.invoke();
        } else {
            Log.e("ExtensionsLogger/FlowsWebBridgeCallable/checkApi() -- Api check failed");
        }
    }
}
