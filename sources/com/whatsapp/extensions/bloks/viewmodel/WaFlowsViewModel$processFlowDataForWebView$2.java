package com.whatsapp.extensions.bloks.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass218;
import X.AnonymousClass26n;
import X.AnonymousClass4GR;
import X.C23681Ug;
import X.C23691Uh;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C78383uv;
import X.C84814Du;
import android.os.Bundle;
import com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.extensions.bloks.viewmodel.WaFlowsViewModel$processFlowDataForWebView$2", f = "WaFlowsViewModel.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
public final class WaFlowsViewModel$processFlowDataForWebView$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ Bundle $bundle;
    public Object L$0;
    public int label;
    public final /* synthetic */ WaFlowsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaFlowsViewModel$processFlowDataForWebView$2(Bundle bundle, WaFlowsViewModel waFlowsViewModel, UserJid userJid, C84814Du r5) {
        super(r5, 2);
        this.$bizJid = userJid;
        this.this$0 = waFlowsViewModel;
        this.$bundle = bundle;
    }

    public final Object A09(Object obj) {
        WaFlowsViewModel waFlowsViewModel;
        AnonymousClass08M r1;
        Object obj2;
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            UserJid userJid = this.$bizJid;
            if (userJid == null) {
                return new C78383uv(this.this$0);
            }
            waFlowsViewModel = this.this$0;
            Bundle bundle = this.$bundle;
            FlowsWebViewDataRepository flowsWebViewDataRepository = waFlowsViewModel.A0G;
            this.L$0 = waFlowsViewModel;
            this.label = 1;
            obj = flowsWebViewDataRepository.A01(bundle, userJid, this);
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            waFlowsViewModel = (WaFlowsViewModel) this.L$0;
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        AnonymousClass26n r7 = (AnonymousClass26n) obj;
        if (r7 instanceof C23691Uh) {
            r1 = waFlowsViewModel.A04;
            obj2 = C59022wD.A00;
        } else {
            if (r7 instanceof C23681Ug) {
                r1 = waFlowsViewModel.A05;
                obj2 = ((C23681Ug) r7).A00;
            }
            return C59022wD.A00;
        }
        r1.A0G(obj2);
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        UserJid userJid = this.$bizJid;
        return new WaFlowsViewModel$processFlowDataForWebView$2(this.$bundle, this.this$0, userJid, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
