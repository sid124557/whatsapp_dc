package com.whatsapp.calling.avatar.data.protocol;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass31C;
import X.AnonymousClass36K;
import X.AnonymousClass4GR;
import X.AnonymousClass5BH;
import X.AnonymousClass5HQ;
import X.C162457s7;
import X.C18260x0;
import X.C35711xJ;
import X.C57492tj;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C91044io;
import X.C91054ip;
import X.C96034vh;
import X.C96044vi;
import X.C96054vj;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.avatar.data.protocol.SetFLMConsentResultProtocol$sendRequest$2", f = "SetFLMConsentResultProtocol.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
public final class SetFLMConsentResultProtocol$sendRequest$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $iqId;
    public final /* synthetic */ C35711xJ $request;
    public int label;
    public final /* synthetic */ AnonymousClass5HQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetFLMConsentResultProtocol$sendRequest$2(AnonymousClass5HQ r2, C35711xJ r3, String str, C84814Du r5) {
        super(r5, 2);
        this.this$0 = r2;
        this.$iqId = str;
        this.$request = r3;
    }

    public final Object A09(Object obj) {
        int i;
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            C57682u2.A01(obj);
            AnonymousClass31C r3 = this.this$0.A00;
            String str = this.$iqId;
            AnonymousClass36K r4 = this.$request.A00;
            C162457s7.A0D(r4);
            this.label = 1;
            obj = r3.A02(r4, str, this, 401, 32000, false);
            if (obj == r2) {
                return r2;
            }
        } else if (i2 == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        AnonymousClass5BH r12 = (AnonymousClass5BH) obj;
        if (r12 instanceof C96044vi) {
            Log.i("SetFLMConsentResultProtocol Success");
            return C91054ip.A00;
        } else if (r12 instanceof C96034vh) {
            int A01 = C57492tj.A01(((C96034vh) r12).A00);
            C18260x0.A0x("SetFLMConsentResultProtocol Error: ", AnonymousClass001.A0o(), A01);
            return new C91044io(A01);
        } else {
            if (C162457s7.A0P(r12, C96054vj.A00)) {
                Log.e("SetFLMConsentResultProtocol Delivery failure");
                i = -1;
            } else {
                C18260x0.A1Q(AnonymousClass001.A0o(), "SetFLMConsentResultProtocol Unknown response: ", r12);
                i = 0;
            }
            return new C91044io(i);
        }
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new SetFLMConsentResultProtocol$sendRequest$2(this.this$0, this.$request, this.$iqId, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
