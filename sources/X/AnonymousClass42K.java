package X;

import android.webkit.ValueCallback;
import com.whatsapp.extensions.webview.view.FlowsWebViewFragment;

/* renamed from: X.42K  reason: invalid class name */
public final class AnonymousClass42K extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ FlowsWebViewFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass42K(FlowsWebViewFragment flowsWebViewFragment) {
        super(1);
        this.this$0 = flowsWebViewFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C19100yl r2 = this.this$0.A00;
        if (r2 != null) {
            r2.evaluateJavascript("window.navigateBack()", (ValueCallback) null);
        }
        return C59022wD.A00;
    }
}
