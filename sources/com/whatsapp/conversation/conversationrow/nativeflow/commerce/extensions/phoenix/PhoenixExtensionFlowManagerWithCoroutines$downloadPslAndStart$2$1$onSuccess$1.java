package com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix;

import X.AnonymousClass4B3;
import X.AnonymousClass4DQ;
import X.AnonymousClass4GR;
import X.C53832nk;
import X.C54052o6;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines$downloadPslAndStart$2$1$onSuccess$1", f = "PhoenixExtensionFlowManagerWithCoroutines.kt", i = {}, l = {598, 607}, m = "invokeSuspend", n = {}, s = {})
public final class PhoenixExtensionFlowManagerWithCoroutines$downloadPslAndStart$2$1$onSuccess$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C53832nk $extensionIdLink;
    public final /* synthetic */ C54052o6 $extensionsContextParams;
    public final /* synthetic */ AnonymousClass4B3 $flowReadyCallback;
    public final /* synthetic */ AnonymousClass4DQ $flowTerminationCallback;
    public int label;
    public final /* synthetic */ PhoenixExtensionFlowManagerWithCoroutines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoenixExtensionFlowManagerWithCoroutines$downloadPslAndStart$2$1$onSuccess$1(C54052o6 r2, PhoenixExtensionFlowManagerWithCoroutines phoenixExtensionFlowManagerWithCoroutines, C53832nk r4, AnonymousClass4B3 r5, AnonymousClass4DQ r6, C84814Du r7) {
        super(r7, 2);
        this.this$0 = phoenixExtensionFlowManagerWithCoroutines;
        this.$extensionsContextParams = r2;
        this.$extensionIdLink = r4;
        this.$flowReadyCallback = r5;
        this.$flowTerminationCallback = r6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r12) {
        /*
            r11 = this;
            X.218 r3 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r11.label
            r5 = 1
            r4 = 2
            if (r0 == 0) goto L_0x0012
            if (r0 == r5) goto L_0x002a
            if (r0 != r4) goto L_0x0064
            X.C57682u2.A01(r12)
        L_0x000f:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0012:
            X.C57682u2.A01(r12)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r0 = r11.this$0
            X.2fC r2 = r0.A0J
            X.2o6 r0 = r11.$extensionsContextParams
            java.lang.String r1 = r0.A05
            int r0 = r1.hashCode()
            r11.label = r5
            java.lang.Object r12 = r2.A01(r1, r11, r0)
            if (r12 != r3) goto L_0x002d
            return r3
        L_0x002a:
            X.C57682u2.A01(r12)
        L_0x002d:
            X.3Z6 r12 = (X.AnonymousClass3Z6) r12
            java.lang.Object r0 = r12.first
            boolean r6 = X.AnonymousClass001.A1Z(r0)
            java.lang.Object r10 = r12.second
            java.lang.String r10 = (java.lang.String) r10
            r5 = 3
            if (r6 == 0) goto L_0x003d
            r5 = 2
        L_0x003d:
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r0 = r11.this$0
            X.1Ub r2 = r0.A0N
            X.2o6 r0 = r11.$extensionsContextParams
            java.lang.String r0 = r0.A05
            int r1 = r0.hashCode()
            short r0 = (short) r5
            r2.A06(r1, r0)
            if (r6 == 0) goto L_0x000f
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r5 = r11.this$0
            X.2o6 r6 = r11.$extensionsContextParams
            if (r10 == 0) goto L_0x0069
            X.2nk r7 = r11.$extensionIdLink
            X.4B3 r8 = r11.$flowReadyCallback
            X.4DQ r9 = r11.$flowTerminationCallback
            r11.label = r4
            java.lang.Object r0 = r5.A02(r6, r7, r8, r9, r10, r11)
            if (r0 != r3) goto L_0x000f
            return r3
        L_0x0064:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0069:
            java.lang.IllegalArgumentException r0 = X.C18300x5.A0X()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines$downloadPslAndStart$2$1$onSuccess$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r9) {
        return new PhoenixExtensionFlowManagerWithCoroutines$downloadPslAndStart$2$1$onSuccess$1(this.$extensionsContextParams, this.this$0, this.$extensionIdLink, this.$flowReadyCallback, this.$flowTerminationCallback, r9);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
