package com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass3Z6;
import X.AnonymousClass4GR;
import X.C161447pg;
import X.C18270x1;
import X.C18300x5;
import X.C23641Ub;
import X.C372521n;
import X.C48622fC;
import X.C51052jC;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines$fetchEntrypointScreen$1", f = "PhoenixExtensionFlowManagerWithCoroutines.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
public final class PhoenixExtensionFlowManagerWithCoroutines$fetchEntrypointScreen$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $flowId;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ C51052jC $phoenixSessionConfig;
    public final /* synthetic */ UserJid $senderJid;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ PhoenixExtensionFlowManagerWithCoroutines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoenixExtensionFlowManagerWithCoroutines$fetchEntrypointScreen$1(PhoenixExtensionFlowManagerWithCoroutines phoenixExtensionFlowManagerWithCoroutines, UserJid userJid, C51052jC r4, String str, String str2, C84814Du r7) {
        super(r7, 2);
        this.this$0 = phoenixExtensionFlowManagerWithCoroutines;
        this.$phoenixSessionConfig = r4;
        this.$flowId = str;
        this.$messageId = str2;
        this.$senderJid = userJid;
    }

    public final Object A09(Object obj) {
        String str;
        PhoenixExtensionFlowManagerWithCoroutines phoenixExtensionFlowManagerWithCoroutines;
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        String str2 = null;
        if (i == 0) {
            C57682u2.A01(obj);
            PhoenixExtensionFlowManagerWithCoroutines phoenixExtensionFlowManagerWithCoroutines2 = this.this$0;
            phoenixExtensionFlowManagerWithCoroutines2.A01 = phoenixExtensionFlowManagerWithCoroutines2.A02.A00(this.$phoenixSessionConfig);
            str = this.$flowId;
            if (str != null) {
                phoenixExtensionFlowManagerWithCoroutines = this.this$0;
                String str3 = this.$messageId;
                C51052jC r0 = this.$phoenixSessionConfig;
                UserJid userJid = this.$senderJid;
                C23641Ub r6 = phoenixExtensionFlowManagerWithCoroutines.A0N;
                int hashCode = str.hashCode();
                C372521n r7 = C372521n.PREFETCH_MESSAGE;
                if (r0 != null) {
                    str2 = r0.A00;
                }
                r6.A0D(r7, userJid, false, str, str3, str2, hashCode);
                C48622fC r02 = phoenixExtensionFlowManagerWithCoroutines.A0J;
                this.L$0 = phoenixExtensionFlowManagerWithCoroutines;
                this.L$1 = str;
                this.label = 1;
                obj = r02.A01(str, this, hashCode);
                if (obj == r2) {
                    return r2;
                }
            }
            return C59022wD.A00;
        } else if (i == 1) {
            str = (String) this.L$1;
            phoenixExtensionFlowManagerWithCoroutines = (PhoenixExtensionFlowManagerWithCoroutines) this.L$0;
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        AnonymousClass3Z6 r15 = (AnonymousClass3Z6) obj;
        boolean A1Z = AnonymousClass001.A1Z(r15.first);
        String str4 = (String) r15.second;
        int i2 = 3;
        if (A1Z) {
            i2 = 2;
        }
        phoenixExtensionFlowManagerWithCoroutines.A0N.A06(str.hashCode(), (short) i2);
        if (A1Z) {
            C161447pg r03 = phoenixExtensionFlowManagerWithCoroutines.A01;
            if (r03 == null) {
                throw C18270x1.A0S("fdsManager");
            } else if (str4 != null) {
                r03.A0D(str, str4);
            } else {
                throw C18300x5.A0X();
            }
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r9) {
        return new PhoenixExtensionFlowManagerWithCoroutines$fetchEntrypointScreen$1(this.this$0, this.$senderJid, this.$phoenixSessionConfig, this.$flowId, this.$messageId, r9);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
