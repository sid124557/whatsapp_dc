package com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix;

import X.AnonymousClass001;
import X.AnonymousClass3M3;
import X.AnonymousClass4B3;
import X.AnonymousClass4DQ;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C18300x5;
import X.C23401Sx;
import X.C53832nk;
import X.C54052o6;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines$downloadPslAndStart$2", f = "PhoenixExtensionFlowManagerWithCoroutines.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PhoenixExtensionFlowManagerWithCoroutines$downloadPslAndStart$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C53832nk $extensionIdLink;
    public final /* synthetic */ C54052o6 $extensionsContextParams;
    public final /* synthetic */ AnonymousClass4B3 $flowReadyCallback;
    public final /* synthetic */ AnonymousClass4DQ $flowTerminationCallback;
    public int label;
    public final /* synthetic */ PhoenixExtensionFlowManagerWithCoroutines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoenixExtensionFlowManagerWithCoroutines$downloadPslAndStart$2(C54052o6 r2, PhoenixExtensionFlowManagerWithCoroutines phoenixExtensionFlowManagerWithCoroutines, C53832nk r4, AnonymousClass4B3 r5, AnonymousClass4DQ r6, C84814Du r7) {
        super(r7, 2);
        this.this$0 = phoenixExtensionFlowManagerWithCoroutines;
        this.$extensionsContextParams = r2;
        this.$extensionIdLink = r4;
        this.$flowReadyCallback = r5;
        this.$flowTerminationCallback = r6;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            C23401Sx r2 = this.this$0.A0K;
            String str = this.$extensionsContextParams.A05;
            C53832nk r0 = this.$extensionIdLink;
            String str2 = r0.A05;
            if (str2 != null) {
                r2.A0F(new AnonymousClass3M3(this.$extensionsContextParams, this.this$0, this.$extensionIdLink, this.$flowReadyCallback, this.$flowTerminationCallback), str, str2, r0.A06, C162457s7.A0P(r0.A00, "DRAFT"), false);
                return C59022wD.A00;
            }
            throw C18300x5.A0X();
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r9) {
        return new PhoenixExtensionFlowManagerWithCoroutines$downloadPslAndStart$2(this.$extensionsContextParams, this.this$0, this.$extensionIdLink, this.$flowReadyCallback, this.$flowTerminationCallback, r9);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
