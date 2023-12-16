package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.webkit.WebMessagePort;
import com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer;

/* renamed from: X.37b  reason: invalid class name and case insensitive filesystem */
public final class C628737b implements Handler.Callback {
    public WebMessagePort A00;
    public C19100yl A01;
    public final Handler A02;
    public final FlowsWebBottomSheetContainer A03;

    public boolean handleMessage(Message message) {
        C162457s7.A0J(message, 0);
        if (message.what != 0) {
            return true;
        }
        AnonymousClass26o.A00(new C80613yW(message, this));
        return true;
    }

    public C628737b(FlowsWebBottomSheetContainer flowsWebBottomSheetContainer) {
        Handler handler;
        this.A03 = flowsWebBottomSheetContainer;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            handler = new Handler(myLooper, this);
        } else {
            handler = null;
        }
        this.A02 = handler;
    }
}
