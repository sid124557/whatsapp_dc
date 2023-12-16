package X;

import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.extensions.bloks.viewmodel.WaFlowsViewModel;
import com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer;
import com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer$initialiseMetadataForWebView$3;

/* renamed from: X.42H  reason: invalid class name */
public final class AnonymousClass42H extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ FlowsWebBottomSheetContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass42H(FlowsWebBottomSheetContainer flowsWebBottomSheetContainer) {
        super(1);
        this.this$0 = flowsWebBottomSheetContainer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        C162457s7.A0H(bool);
        boolean booleanValue = bool.booleanValue();
        FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = this.this$0;
        if (booleanValue) {
            C69903Yy r6 = new C69903Yy();
            Bundle bundle = flowsWebBottomSheetContainer.A06;
            if (bundle != null) {
                r6.element = AnonymousClass32Y.A08(bundle.getString("chat_id"));
                str2 = bundle.getString("flow_id");
            } else {
                str2 = null;
            }
            if (r6.element == null || str2 == null) {
                str = C08310eF.A09(flowsWebBottomSheetContainer).getString(R.string.f11nameremoved);
                C162457s7.A0D(str);
            } else {
                WaFlowsViewModel waFlowsViewModel = flowsWebBottomSheetContainer.A0C;
                if (waFlowsViewModel == null) {
                    throw C18270x1.A0S("waFlowsViewModel");
                }
                AnonymousClass4K2.A00(flowsWebBottomSheetContainer.A0V(), waFlowsViewModel.A05, new AnonymousClass42G(flowsWebBottomSheetContainer), 117);
                C616131n.A02((C85494Gl) null, new FlowsWebBottomSheetContainer$initialiseMetadataForWebView$3(flowsWebBottomSheetContainer, (C84814Du) null, r6), AnonymousClass0IT.A00(flowsWebBottomSheetContainer), (AnonymousClass20D) null, 3);
                return C59022wD.A00;
            }
        } else {
            str = C08310eF.A09(flowsWebBottomSheetContainer).getString(R.string.f11nameremoved);
        }
        flowsWebBottomSheetContainer.A1a(str);
        return C59022wD.A00;
    }
}
