package com.whatsapp.companionmode.registration;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass22M;
import X.AnonymousClass4GR;
import X.C47302d2;
import X.C57682u2;
import X.C58422vE;
import X.C59022wD;
import X.C75003pT;
import X.C77493tU;
import X.C818141e;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.companionmode.registration.KeyAttestationLifetimeManager$prepare$1", f = "KeyAttestationLifetimeManager.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
public final class KeyAttestationLifetimeManager$prepare$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ C47302d2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyAttestationLifetimeManager$prepare$1(C47302d2 r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            int A0O = this.this$0.A07.A0O(C58422vE.A02, 6433);
            C47302d2 r2 = this.this$0;
            C818141e r1 = new C818141e(r2);
            C77493tU r0 = new C77493tU(r2);
            this.label = 1;
            if (KeyAttestationLifetimeManagerKt.A00(this, r0, r1, A0O) == r5) {
                return r5;
            }
        } else if (i == 1) {
            try {
                C57682u2.A01(obj);
            } catch (Exception unused) {
                C47302d2 r02 = this.this$0;
                r02.A05.A01(AnonymousClass22M.A08, String.valueOf(r02.A07.A0O(C58422vE.A02, 6433)));
            }
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new KeyAttestationLifetimeManager$prepare$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new KeyAttestationLifetimeManager$prepare$1(this.this$0, (C84814Du) obj2));
    }
}
