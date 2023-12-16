package com.whatsapp.companionmode.registration;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass22M;
import X.AnonymousClass3Q7;
import X.AnonymousClass4GQ;
import X.AnonymousClass4GR;
import X.C47182cq;
import X.C57682u2;
import X.C57702u4;
import X.C58422vE;
import X.C59022wD;
import X.C72463dl;
import X.C75003pT;
import X.C818041d;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.companionmode.registration.GpiaLifetimeManager$prepare$1", f = "GpiaLifetimeManager.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
public final class GpiaLifetimeManager$prepare$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ C47182cq this$0;

    @DebugMetadata(c = "com.whatsapp.companionmode.registration.GpiaLifetimeManager$prepare$1$2", f = "GpiaLifetimeManager.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.companionmode.registration.GpiaLifetimeManager$prepare$1$2  reason: invalid class name */
    public final class AnonymousClass2 extends C75003pT implements AnonymousClass4GQ {
        public Object L$0;
        public int label;

        public final Object A09(Object obj) {
            AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C57682u2.A01(obj);
                C47182cq r0 = C47182cq.this;
                this.L$0 = r0;
                this.label = 1;
                C72463dl A02 = C57702u4.A02(this);
                r0.A06.A02(new AnonymousClass3Q7(A02), "md-pairing");
                if (A02.A00() == r4) {
                    return r4;
                }
            } else if (i == 1) {
                C57682u2.A01(obj);
            } else {
                throw AnonymousClass001.A0d();
            }
            C47182cq r2 = C47182cq.this;
            r2.A00 = r2.A03.A0H();
            return C59022wD.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C59022wD.A01(new AnonymousClass2((C84814Du) obj));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GpiaLifetimeManager$prepare$1(C47182cq r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            int A0O = this.this$0.A05.A0O(C58422vE.A02, 7009);
            final C47182cq r3 = this.this$0;
            C818041d r2 = new C818041d(r3);
            AnonymousClass2 r0 = new AnonymousClass2((C84814Du) null);
            this.label = 1;
            if (GpiaLifetimeManagerKt.A00(this, r2, r0, A0O) == r6) {
                return r6;
            }
        } else if (i == 1) {
            try {
                C57682u2.A01(obj);
            } catch (Exception e) {
                C47182cq r02 = this.this$0;
                r02.A04.A00(AnonymousClass22M.A03, e, String.valueOf(r02.A05.A0O(C58422vE.A02, 7009)));
            }
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new GpiaLifetimeManager$prepare$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new GpiaLifetimeManager$prepare$1(this.this$0, (C84814Du) obj2));
    }
}
