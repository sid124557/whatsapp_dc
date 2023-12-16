package com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix;

import X.AnonymousClass4B3;
import X.AnonymousClass4DQ;
import X.AnonymousClass4GR;
import X.C54052o6;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines$startExtensionFlow$1", f = "PhoenixExtensionFlowManagerWithCoroutines.kt", i = {}, l = {283, 294, 303}, m = "invokeSuspend", n = {}, s = {})
public final class PhoenixExtensionFlowManagerWithCoroutines$startExtensionFlow$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C54052o6 $extensionsContextParams;
    public final /* synthetic */ AnonymousClass4B3 $flowReadyCallback;
    public final /* synthetic */ AnonymousClass4DQ $flowTerminationCallback;
    public int label;
    public final /* synthetic */ PhoenixExtensionFlowManagerWithCoroutines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoenixExtensionFlowManagerWithCoroutines$startExtensionFlow$1(C54052o6 r2, PhoenixExtensionFlowManagerWithCoroutines phoenixExtensionFlowManagerWithCoroutines, AnonymousClass4B3 r4, AnonymousClass4DQ r5, C84814Du r6) {
        super(r6, 2);
        this.this$0 = phoenixExtensionFlowManagerWithCoroutines;
        this.$flowTerminationCallback = r5;
        this.$extensionsContextParams = r2;
        this.$flowReadyCallback = r4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: X.2nk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: X.2nk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: X.2nk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: X.2nk} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01ad A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r17) {
        /*
            r16 = this;
            X.218 r3 = X.AnonymousClass218.COROUTINE_SUSPENDED
            r15 = r16
            int r4 = r15.label
            r2 = 3
            r1 = 2
            r0 = 1
            if (r4 == 0) goto L_0x001a
            if (r4 == r0) goto L_0x0016
            if (r4 == r1) goto L_0x0016
            if (r4 == r2) goto L_0x0016
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0016:
            X.C57682u2.A01(r17)
            goto L_0x0044
        L_0x001a:
            X.C57682u2.A01(r17)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r4 = r15.this$0
            X.1VX r5 = r4.A0P
            r4 = 5333(0x14d5, float:7.473E-42)
            X.2vE r6 = X.C58422vE.A02
            boolean r4 = r5.A0Y(r6, r4)
            if (r4 == 0) goto L_0x0047
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r4 = r15.this$0
            X.1VX r5 = r4.A0P
            r4 = 1319(0x527, float:1.848E-42)
            boolean r4 = r5.A0Y(r6, r4)
            if (r4 == 0) goto L_0x0047
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r3 = r15.this$0
            X.4DQ r2 = r15.$flowTerminationCallback
            X.2o6 r0 = r15.$extensionsContextParams
            java.lang.String r1 = r0.A05
            java.lang.String r0 = "extensions-features-disabled"
            r3.A09(r2, r0, r1)
        L_0x0044:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0047:
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r5 = r15.this$0
            X.2o6 r4 = r15.$extensionsContextParams
            int r4 = r4.hashCode()
            r5.A00 = r4
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r4 = r15.this$0
            X.1Ua r6 = r4.A0O
            int r5 = r4.A00
            java.lang.String r4 = "phoenixExtensionFlow"
            r6.A02(r5, r4)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r4 = r15.this$0
            X.1Ua r5 = r4.A0O
            int r10 = r4.A00
            X.2o6 r4 = r15.$extensionsContextParams
            java.lang.String r7 = r4.A08
            java.lang.String r8 = r4.A09
            com.whatsapp.jid.UserJid r6 = r4.A02
            java.lang.String r9 = r4.A05
            r5.A07(r6, r7, r8, r9, r10)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r4 = r15.this$0
            X.1Ua r7 = r4.A0O
            int r6 = r4.A00
            X.2o6 r4 = r15.$extensionsContextParams
            boolean r5 = r4.A0C
            java.lang.String r4 = "is_resumed"
            r7.A05(r6, r4, r5)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r5 = r15.this$0
            X.2sH r5 = r5.A0A
            long r11 = r5.A0H()
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r10 = r15.this$0
            X.2o6 r6 = r15.$extensionsContextParams
            com.whatsapp.jid.UserJid r5 = r6.A02
            java.lang.String r7 = r6.A05
            X.2of r6 = r10.A0C
            java.lang.String r5 = r5.user
            long r8 = r6.A00(r5, r7)
            r5 = 0
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00a6
            X.1VX r6 = r10.A0P
            r5 = 2892(0xb4c, float:4.053E-42)
            long r5 = X.C56952sp.A05(r6, r5)
            long r5 = r5 + r8
        L_0x00a6:
            int r7 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r5 = r15.this$0
            if (r7 >= 0) goto L_0x00d9
            X.4DQ r1 = r15.$flowTerminationCallback
            X.2o6 r0 = r15.$extensionsContextParams
            java.lang.String r0 = r0.A05
            java.lang.String r12 = "extensions-banned-id-error"
            r5.A09(r1, r12, r0)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r1 = r15.this$0
            X.2xt r2 = r1.A08
            java.lang.String r8 = "galaxy_message"
            X.2o6 r0 = r15.$extensionsContextParams
            java.lang.String r9 = r0.A05
            com.whatsapp.jid.UserJid r6 = r0.A02
            java.lang.String r10 = r0.A08
            java.lang.String r11 = r0.A09
            r13 = 0
            X.3Lv r4 = r1.A0F
            X.2rx r3 = r1.A06
            X.2hy r5 = r1.A0G
            boolean r0 = r0.A0C
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            r2.A02(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0044
        L_0x00d9:
            X.1Ud r7 = r5.A0M
            X.2o6 r5 = r15.$extensionsContextParams
            com.whatsapp.jid.UserJid r6 = r5.A02
            java.lang.String r5 = "user_interaction"
            r12 = 0
            int r11 = r7.A0C(r6, r5)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r5 = r15.this$0
            X.1Ud r6 = r5.A0M
            X.2o6 r5 = r15.$extensionsContextParams
            java.lang.String r8 = r5.A08
            java.lang.String r9 = r5.A09
            com.whatsapp.jid.UserJid r7 = r5.A02
            java.lang.String r10 = r5.A05
            r6.A07(r7, r8, r9, r10, r11)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r5 = r15.this$0
            X.2rW r7 = r5.A0H
            java.lang.Integer r6 = X.AnonymousClass0x9.A0k(r11)
            X.2o6 r5 = r15.$extensionsContextParams
            com.whatsapp.jid.UserJid r5 = r5.A02
            X.2Kt r6 = r7.A00(r5, r6)
            if (r6 == 0) goto L_0x01de
            java.util.List r5 = r6.A01
            X.2o6 r9 = r15.$extensionsContextParams
            java.util.Iterator r10 = r5.iterator()
        L_0x0112:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x012a
            java.lang.Object r8 = r10.next()
            r5 = r8
            X.2nk r5 = (X.C53832nk) r5
            java.lang.String r7 = r5.A03
            java.lang.String r5 = r9.A05
            boolean r5 = X.C162457s7.A0P(r7, r5)
            if (r5 == 0) goto L_0x0112
            r12 = r8
        L_0x012a:
            X.2nk r12 = (X.C53832nk) r12
            if (r12 == 0) goto L_0x01de
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r2 = r15.this$0
            X.1Ua r5 = r2.A0O
            java.lang.String r8 = r12.A00
            int r2 = r2.A00
            r5.A0A(r8, r2)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r2 = r15.this$0
            X.1Uc r5 = r2.A0L
            java.lang.String r2 = r12.A03
            int r2 = r2.hashCode()
            r5.A0A(r8, r2)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r2 = r15.this$0
            X.1Uc r7 = r2.A0L
            X.2o6 r2 = r15.$extensionsContextParams
            boolean r5 = r2.A0C
            java.lang.String r2 = r2.A05
            int r2 = r2.hashCode()
            r7.A05(r2, r4, r5)
            java.lang.String r2 = "DRAFT"
            boolean r2 = X.C162457s7.A0P(r8, r2)
            if (r2 != 0) goto L_0x01ae
            X.2o6 r2 = r15.$extensionsContextParams
            java.lang.String r4 = r2.A06
            java.lang.String r2 = r2.A04
            boolean r2 = com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines.A01(r4, r2)
            if (r2 != 0) goto L_0x017d
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r2 = r15.this$0
            X.1Uc r5 = r2.A0L
            X.2o6 r2 = r15.$extensionsContextParams
            java.lang.String r2 = r2.A05
            int r4 = r2.hashCode()
            java.lang.String r2 = "metadata_cache_hit"
            r5.A05(r4, r2, r0)
        L_0x017d:
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r2 = r15.this$0
            X.1Ud r5 = r2.A0M
            java.lang.Integer r4 = X.AnonymousClass0x9.A0k(r11)
            java.lang.Short r2 = new java.lang.Short
            r2.<init>(r1)
            r5.A0E(r4, r2)
            X.2o6 r4 = r15.$extensionsContextParams
            java.lang.String r1 = r12.A02
            r4.A00 = r1
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r2 = r15.this$0
            X.4DQ r1 = r15.$flowTerminationCallback
            boolean r1 = r2.A0A(r4, r12, r6, r1)
            if (r1 != 0) goto L_0x0044
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r10 = r15.this$0
            X.2o6 r11 = r15.$extensionsContextParams
            X.4B3 r13 = r15.$flowReadyCallback
            X.4DQ r14 = r15.$flowTerminationCallback
            r15.label = r0
            java.lang.Object r0 = r10.A03(r11, r12, r13, r14, r15)
        L_0x01ab:
            if (r0 != r3) goto L_0x0044
            return r3
        L_0x01ae:
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r0 = r15.this$0
            X.1Uc r5 = r0.A0L
            X.2o6 r0 = r15.$extensionsContextParams
            java.lang.String r0 = r0.A05
            int r4 = r0.hashCode()
            r2 = 0
            java.lang.String r0 = "metadata_cache_hit"
            r5.A05(r4, r0, r2)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r0 = r15.this$0
            X.1Ud r2 = r0.A0M
            java.lang.String r0 = "draft"
            r2.A0D(r11, r0)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r5 = r15.this$0
            X.2o6 r4 = r15.$extensionsContextParams
            X.4B3 r2 = r15.$flowReadyCallback
            X.4DQ r0 = r15.$flowTerminationCallback
            r15.label = r1
            r6 = r4
            r7 = r2
            r8 = r0
            r9 = r15
            r10 = r11
            java.lang.Object r0 = r5.A04(r6, r7, r8, r9, r10)
            goto L_0x01ab
        L_0x01de:
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r0 = r15.this$0
            X.1Uc r5 = r0.A0L
            X.2o6 r0 = r15.$extensionsContextParams
            java.lang.String r0 = r0.A05
            int r4 = r0.hashCode()
            r1 = 0
            java.lang.String r0 = "metadata_cache_hit"
            r5.A05(r4, r0, r1)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r0 = r15.this$0
            X.1Ud r1 = r0.A0M
            java.lang.String r0 = "unknown_extension"
            r1.A0D(r11, r0)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r5 = r15.this$0
            X.2o6 r4 = r15.$extensionsContextParams
            X.4B3 r1 = r15.$flowReadyCallback
            X.4DQ r0 = r15.$flowTerminationCallback
            r15.label = r2
            r6 = r4
            r7 = r1
            r8 = r0
            r9 = r15
            r10 = r11
            java.lang.Object r0 = r5.A05(r6, r7, r8, r9, r10)
            goto L_0x01ab
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines$startExtensionFlow$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        return new PhoenixExtensionFlowManagerWithCoroutines$startExtensionFlow$1(this.$extensionsContextParams, this.this$0, this.$flowReadyCallback, this.$flowTerminationCallback, r8);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
