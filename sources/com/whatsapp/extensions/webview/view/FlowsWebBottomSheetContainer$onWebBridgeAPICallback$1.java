package com.whatsapp.extensions.webview.view;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C18270x1;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import android.webkit.WebMessagePort;
import com.whatsapp.extensions.bloks.viewmodel.WaFlowsViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONObject;

@DebugMetadata(c = "com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer$onWebBridgeAPICallback$1", f = "FlowsWebBottomSheetContainer.kt", i = {}, l = {408}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsWebBottomSheetContainer$onWebBridgeAPICallback$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ JSONObject $inputJson;
    public final /* synthetic */ WebMessagePort $sendPort;
    public int label;
    public final /* synthetic */ FlowsWebBottomSheetContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsWebBottomSheetContainer$onWebBridgeAPICallback$1(WebMessagePort webMessagePort, FlowsWebBottomSheetContainer flowsWebBottomSheetContainer, C84814Du r4, JSONObject jSONObject) {
        super(r4, 2);
        this.this$0 = flowsWebBottomSheetContainer;
        this.$sendPort = webMessagePort;
        this.$inputJson = jSONObject;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            WaFlowsViewModel waFlowsViewModel = this.this$0.A0C;
            if (waFlowsViewModel == null) {
                throw C18270x1.A0S("waFlowsViewModel");
            }
            WebMessagePort webMessagePort = this.$sendPort;
            JSONObject jSONObject = this.$inputJson;
            this.label = 1;
            if (waFlowsViewModel.A0D(webMessagePort, this, jSONObject) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new FlowsWebBottomSheetContainer$onWebBridgeAPICallback$1(this.$sendPort, this.this$0, r6, this.$inputJson);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
