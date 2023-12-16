package com.whatsapp.extensions.webview.bridge;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass3MC;
import X.AnonymousClass3TI;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C23671Uf;
import X.C57682u2;
import X.C57702u4;
import X.C59022wD;
import X.C60922zO;
import X.C64513Du;
import X.C72463dl;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.jid.UserJid;
import javax.crypto.SecretKey;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository$getPublicKey$2", f = "FlowsWebViewDataRepository.kt", i = {}, l = {274}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsWebViewDataRepository$getPublicKey$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ boolean $forceRefresh;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ FlowsWebViewDataRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsWebViewDataRepository$getPublicKey$2(FlowsWebViewDataRepository flowsWebViewDataRepository, UserJid userJid, C84814Du r4, boolean z) {
        super(r4, 2);
        this.$forceRefresh = z;
        this.this$0 = flowsWebViewDataRepository;
        this.$bizJid = userJid;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            if (!this.$forceRefresh && !this.this$0.A0C.A04(this.$bizJid)) {
                return new C23671Uf(this.this$0.A09.A01(this.$bizJid.user));
            }
            FlowsWebViewDataRepository flowsWebViewDataRepository = this.this$0;
            UserJid userJid = this.$bizJid;
            this.L$0 = flowsWebViewDataRepository;
            this.L$1 = userJid;
            this.label = 1;
            C72463dl A02 = C57702u4.A02(this);
            C60922zO r6 = flowsWebViewDataRepository.A03;
            AnonymousClass3MC r7 = new AnonymousClass3MC(flowsWebViewDataRepository, userJid, A02);
            C162457s7.A0J(userJid, 0);
            new AnonymousClass3TI(userJid, r6.A05).A00(new C64513Du(r6, r7, (String) null, (SecretKey) null, (byte[]) null, -1, false, false));
            obj = A02.A00();
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return obj;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new FlowsWebViewDataRepository$getPublicKey$2(this.this$0, this.$bizJid, r6, this.$forceRefresh);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
