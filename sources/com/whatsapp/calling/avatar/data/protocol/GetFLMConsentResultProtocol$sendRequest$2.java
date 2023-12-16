package com.whatsapp.calling.avatar.data.protocol;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass31C;
import X.AnonymousClass36K;
import X.AnonymousClass4GR;
import X.AnonymousClass5BH;
import X.AnonymousClass5HP;
import X.C115325oU;
import X.C124286Br;
import X.C162457s7;
import X.C18260x0;
import X.C34821vs;
import X.C35711xJ;
import X.C57492tj;
import X.C57682u2;
import X.C59022wD;
import X.C626836d;
import X.C75003pT;
import X.C84814Du;
import X.C91024im;
import X.C91034in;
import X.C96034vh;
import X.C96044vi;
import X.C96054vj;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.avatar.data.protocol.GetFLMConsentResultProtocol$sendRequest$2", f = "GetFLMConsentResultProtocol.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
public final class GetFLMConsentResultProtocol$sendRequest$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $iqId;
    public final /* synthetic */ C35711xJ $request;
    public int label;
    public final /* synthetic */ AnonymousClass5HP this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetFLMConsentResultProtocol$sendRequest$2(AnonymousClass5HP r2, C35711xJ r3, String str, C84814Du r5) {
        super(r5, 2);
        this.this$0 = r2;
        this.$iqId = str;
        this.$request = r3;
    }

    public final Object A09(Object obj) {
        boolean z;
        AnonymousClass218 r1 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass31C r5 = this.this$0.A00;
            String str = this.$iqId;
            AnonymousClass36K r6 = this.$request.A00;
            C162457s7.A0D(r6);
            this.label = 1;
            obj = r5.A02(r6, str, this, 400, 32000, false);
            if (obj == r1) {
                return r1;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        AnonymousClass5BH r14 = (AnonymousClass5BH) obj;
        if (r14 instanceof C96044vi) {
            Log.i("GetFLMConsentResultProtocol Success");
            AnonymousClass36K r62 = ((C96044vi) r14).A00;
            C35711xJ r12 = this.$request;
            AnonymousClass36K.A0N(r62, "iq");
            C626836d.A04(r62, new C115325oU(r12.A00), new String[0]);
            Number number = (Number) ((C34821vs) C626836d.A04(r62, new C124286Br(6), new String[]{"avatar_consent_result"})).A00;
            if (number != null) {
                long longValue = number.longValue();
                if (longValue == 1) {
                    z = true;
                } else if (longValue == 2) {
                    z = false;
                }
                return new C91034in(z);
            }
            z = null;
            return new C91034in(z);
        } else if (r14 instanceof C96034vh) {
            int A01 = C57492tj.A01(((C96034vh) r14).A00);
            C18260x0.A0x("GetFLMConsentResultProtocol Error: ", AnonymousClass001.A0o(), A01);
            return new C91024im(A01);
        } else if (C162457s7.A0P(r14, C96054vj.A00)) {
            Log.e("GetFLMConsentResultProtocol Delivery failure");
            return new C91024im(-1);
        } else {
            C18260x0.A1Q(AnonymousClass001.A0o(), "GetFLMConsentResultProtocol Unknown response: ", r14);
            return new C91024im(0);
        }
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new GetFLMConsentResultProtocol$sendRequest$2(this.this$0, this.$request, this.$iqId, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
