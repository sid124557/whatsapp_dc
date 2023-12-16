package X;

import android.os.Handler;
import android.os.Message;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;

/* renamed from: X.0yk  reason: invalid class name and case insensitive filesystem */
public final class C19090yk extends WebMessagePort.WebMessageCallback {
    public final /* synthetic */ C628837c A00;

    public C19090yk(C628837c r1) {
        this.A00 = r1;
    }

    public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
        Handler handler = this.A00.A03;
        handler.dispatchMessage(Message.obtain(handler, 0, webMessage));
    }
}
