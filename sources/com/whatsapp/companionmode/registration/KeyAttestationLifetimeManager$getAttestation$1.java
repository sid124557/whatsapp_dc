package com.whatsapp.companionmode.registration;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C47302d2;
import X.C56952sp;
import X.C57682u2;
import X.C59022wD;
import X.C616331p;
import X.C75003pT;
import X.C84814Du;
import X.C85474Gj;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.companionmode.registration.KeyAttestationLifetimeManager$getAttestation$1", f = "KeyAttestationLifetimeManager.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
public final class KeyAttestationLifetimeManager$getAttestation$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ C47302d2 this$0;

    @DebugMetadata(c = "com.whatsapp.companionmode.registration.KeyAttestationLifetimeManager$getAttestation$1$1", f = "KeyAttestationLifetimeManager.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.companionmode.registration.KeyAttestationLifetimeManager$getAttestation$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        public final Object A09(Object obj) {
            AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C57682u2.A01(obj);
                C85474Gj r0 = C47302d2.this.A01;
                if (r0 == null) {
                    return null;
                }
                this.label = 1;
                if (r0.BJQ(this) == r2) {
                    return r2;
                }
            } else if (i == 1) {
                C57682u2.A01(obj);
            } else {
                throw AnonymousClass001.A0d();
            }
            return C59022wD.A00;
        }

        public final C84814Du A0A(Object obj, C84814Du r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A01(new AnonymousClass1((C84814Du) obj2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyAttestationLifetimeManager$getAttestation$1(C47302d2 r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            long A06 = C56952sp.A06(this.this$0.A07, 6434);
            final C47302d2 r2 = this.this$0;
            AnonymousClass1 r0 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            if (C616331p.A01(this, r0, A06) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return this.this$0.A02;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new KeyAttestationLifetimeManager$getAttestation$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new KeyAttestationLifetimeManager$getAttestation$1(this.this$0, (C84814Du) obj2));
    }
}
