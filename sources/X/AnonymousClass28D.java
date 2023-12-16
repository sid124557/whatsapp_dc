package X;

import android.webkit.ValueCallback;
import com.whatsapp.util.Log;

/* renamed from: X.28D  reason: invalid class name */
public class AnonymousClass28D implements ValueCallback {
    public final int A00;

    public AnonymousClass28D(int i) {
        this.A00 = i;
    }

    public final void onReceiveValue(Object obj) {
        if (2 - this.A00 != 0) {
            Log.e((String) obj);
        } else if (!AnonymousClass001.A1Z(obj)) {
            Log.e("WebViewWrapperView/configWebView: Safe browsing is not enabled");
        }
    }
}
