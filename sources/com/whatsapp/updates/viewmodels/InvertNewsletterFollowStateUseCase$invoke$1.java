package com.whatsapp.updates.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1RL;
import X.AnonymousClass218;
import X.AnonymousClass34A;
import X.AnonymousClass4GQ;
import X.AnonymousClass4GR;
import X.AnonymousClass634;
import X.C103665Nw;
import X.C114975nu;
import X.C120835zF;
import X.C372821q;
import X.C56842se;
import X.C57682u2;
import X.C57702u4;
import X.C59022wD;
import X.C72463dl;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.updates.viewmodels.InvertNewsletterFollowStateUseCase$invoke$1", f = "InvertNewsletterFollowStateUseCase.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
public final class InvertNewsletterFollowStateUseCase$invoke$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass1RL $newsletterInfo;
    public final /* synthetic */ AnonymousClass4GQ $onComplete;
    public Object L$0;
    public int label;
    public final /* synthetic */ C103665Nw this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvertNewsletterFollowStateUseCase$invoke$1(AnonymousClass1RL r2, C103665Nw r3, C84814Du r4, AnonymousClass4GQ r5) {
        super(r4, 2);
        this.$onComplete = r5;
        this.this$0 = r3;
        this.$newsletterInfo = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass4GQ r3;
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            r3 = this.$onComplete;
            C103665Nw r6 = this.this$0;
            AnonymousClass1RL r5 = this.$newsletterInfo;
            this.L$0 = r3;
            this.label = 1;
            C72463dl r2 = new C72463dl(C57702u4.A01(this));
            C114975nu r7 = new C114975nu(r5, r6, r2);
            r6.A00.A06(r7);
            AnonymousClass34A.A01(r6.A03.B61()).BGv(new AnonymousClass634(r7, r6));
            boolean A1Y = AnonymousClass000.A1Y(r5.A07, C372821q.GUEST);
            C56842se r1 = r6.A01;
            if (A1Y) {
                r1.A03(r5, new C120835zF(r5, r6));
            } else {
                r1.A0A(r5.A0I());
            }
            obj = r2.A00();
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            r3 = (AnonymousClass4GQ) this.L$0;
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        r3.invoke(obj);
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        AnonymousClass4GQ r3 = this.$onComplete;
        return new InvertNewsletterFollowStateUseCase$invoke$1(this.$newsletterInfo, this.this$0, r6, r3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
