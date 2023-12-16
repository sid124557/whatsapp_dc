package com.whatsapp.registration.integritysignals;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass24J;
import X.AnonymousClass2TA;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C18260x0;
import X.C18320x8;
import X.C57682u2;
import X.C58482vK;
import X.C59022wD;
import X.C616131n;
import X.C73463fX;
import X.C75003pT;
import X.C84814Du;
import com.google.android.gms.common.api.ApiException;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.integritysignals.GpiaRegClient$fetchTokenBlocking$1", f = "GpiaRegClient.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
public final class GpiaRegClient$fetchTokenBlocking$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ AnonymousClass2TA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GpiaRegClient$fetchTokenBlocking$1(AnonymousClass2TA r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        int i;
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            C57682u2.A01(obj);
            try {
                byte[] A0K = this.this$0.A00.A0K();
                if (A0K == null) {
                    Log.w("GpiaRegClient: Nonce is null, returning.");
                    return null;
                }
                String A0i = C18320x8.A0i(A0K);
                AnonymousClass2TA r4 = this.this$0;
                C162457s7.A0H(A0i);
                this.label = 1;
                Log.d("GpiaRegClient: fetchTokenInternal called");
                obj = C616131n.A00(this, r4.A06, new GpiaRegClient$fetchTokenInternal$2(r4, "reg", A0i, (C84814Du) null));
                if (obj == r6) {
                    return r6;
                }
            } catch (Exception e) {
                C18260x0.A1Q(AnonymousClass001.A0o(), "GpiaRegClient: Exception while executing fetchToken: ", e);
                if (e instanceof ApiException) {
                    i = ((ApiException) e).mStatus.A01;
                } else if (e instanceof AnonymousClass24J) {
                    i = ((AnonymousClass24J) e).errorCode;
                } else {
                    i = 1000;
                    if (e instanceof C73463fX) {
                        i = 1004;
                    }
                }
                return new C58482vK((String) null, i);
            }
        } else if (i2 == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return new C58482vK((String) obj, 0);
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new GpiaRegClient$fetchTokenBlocking$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new GpiaRegClient$fetchTokenBlocking$1(this.this$0, (C84814Du) obj2));
    }
}
