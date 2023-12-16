package X;

import com.whatsapp.R;
import com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer;

/* renamed from: X.42G  reason: invalid class name */
public final class AnonymousClass42G extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ FlowsWebBottomSheetContainer this$0;

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = this.this$0;
        String string = C08310eF.A09(flowsWebBottomSheetContainer).getString(R.string.f11nameremoved);
        C162457s7.A0D(string);
        if (str != null) {
            C60032xt r3 = flowsWebBottomSheetContainer.A08;
            if (r3 != null) {
                C003203q A0Q = flowsWebBottomSheetContainer.A0Q();
                C66543Lv r6 = flowsWebBottomSheetContainer.A0A;
                if (r6 != null) {
                    C56422rx r5 = flowsWebBottomSheetContainer.A06;
                    if (r5 != null) {
                        C50312hy r7 = flowsWebBottomSheetContainer.A0D;
                        if (r7 != null) {
                            r3.A01(A0Q, r5, r6, r7, str, (String) null);
                        } else {
                            throw C18270x1.A0S("wamExtensionsStructuredMessageInteractionReporter");
                        }
                    } else {
                        throw C18270x1.A0S("verifiedNameManager");
                    }
                } else {
                    throw C18270x1.A0S("coreMessageStore");
                }
            } else {
                throw C18270x1.A0S("extensionsDataUtil");
            }
        }
        flowsWebBottomSheetContainer.A1a(string);
        return C59022wD.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass42G(FlowsWebBottomSheetContainer flowsWebBottomSheetContainer) {
        super(1);
        this.this$0 = flowsWebBottomSheetContainer;
    }
}
