package X;

import android.content.Context;
import com.whatsapp.webview.ui.WebViewWrapperView;

/* renamed from: X.15N  reason: invalid class name */
public final class AnonymousClass15N extends C19100yl {
    public AnonymousClass4FT A00;
    public final /* synthetic */ WebViewWrapperView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass15N(Context context, WebViewWrapperView webViewWrapperView) {
        super(context);
        this.A01 = webViewWrapperView;
    }

    public final void setWebViewDelegate$webview_consumerBeta(AnonymousClass4FT r1) {
        this.A00 = r1;
    }

    public final AnonymousClass4FT getWebViewDelegate$webview_consumerBeta() {
        return this.A00;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        AnonymousClass4FT r0 = this.A00;
        if (r0 != null) {
            r0.Bfl(i, i2, i3, i4);
        }
    }
}
