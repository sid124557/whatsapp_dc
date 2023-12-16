package X;

import android.os.Bundle;
import android.widget.LinearLayout;
import com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer;
import com.whatsapp.extensions.webview.view.FlowsWebViewFragment;

/* renamed from: X.42I  reason: invalid class name */
public final class AnonymousClass42I extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ FlowsWebBottomSheetContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass42I(FlowsWebBottomSheetContainer flowsWebBottomSheetContainer) {
        super(1);
        this.this$0 = flowsWebBottomSheetContainer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = this.this$0;
        Bundle bundle = flowsWebBottomSheetContainer.A06;
        if (bundle != null) {
            String string = bundle.getString("flow_id");
            C08240dc r4 = new C08240dc(flowsWebBottomSheetContainer.A0T());
            String A0e = AnonymousClass0x2.A0e(string, AnonymousClass000.A0l("https://flows.whatsapp.net/flows"), '/');
            C162457s7.A0J(A0e, 0);
            FlowsWebViewFragment flowsWebViewFragment = new FlowsWebViewFragment();
            flowsWebViewFragment.A0u(AnonymousClass0x7.A0F("url", A0e));
            LinearLayout linearLayout = flowsWebBottomSheetContainer.A00;
            if (linearLayout != null) {
                r4.A0E(flowsWebViewFragment, "WEB_FRAGMENT", linearLayout.getId());
            }
            r4.A01();
        }
        return C59022wD.A00;
    }
}
