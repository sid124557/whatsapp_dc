package com.whatsapp.extensions.webview.view;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C18270x1;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C69903Yy;
import X.C75003pT;
import X.C84814Du;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.extensions.bloks.viewmodel.WaFlowsViewModel;
import com.whatsapp.extensions.bloks.viewmodel.WaFlowsViewModel$processFlowDataForWebView$2;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer$initialiseMetadataForWebView$3", f = "FlowsWebBottomSheetContainer.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsWebBottomSheetContainer$initialiseMetadataForWebView$3 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C69903Yy $bizJid;
    public int label;
    public final /* synthetic */ FlowsWebBottomSheetContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsWebBottomSheetContainer$initialiseMetadataForWebView$3(FlowsWebBottomSheetContainer flowsWebBottomSheetContainer, C84814Du r3, C69903Yy r4) {
        super(r3, 2);
        this.this$0 = flowsWebBottomSheetContainer;
        this.$bizJid = r4;
    }

    public final Object A09(Object obj) {
        Bundle extras;
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            Intent intent = this.this$0.A0R().getIntent();
            if (!(intent == null || (extras = intent.getExtras()) == null)) {
                FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = this.this$0;
                C69903Yy r0 = this.$bizJid;
                WaFlowsViewModel waFlowsViewModel = flowsWebBottomSheetContainer.A0C;
                if (waFlowsViewModel == null) {
                    throw C18270x1.A0S("waFlowsViewModel");
                }
                this.label = 1;
                if (C616131n.A00(this, waFlowsViewModel.A0J, new WaFlowsViewModel$processFlowDataForWebView$2(extras, waFlowsViewModel, (UserJid) r0.element, (C84814Du) null)) == r6 || C59022wD.A00 == r6) {
                    return r6;
                }
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new FlowsWebBottomSheetContainer$initialiseMetadataForWebView$3(this.this$0, r5, this.$bizJid);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
