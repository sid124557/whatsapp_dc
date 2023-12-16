package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass001;
import X.AnonymousClass0IV;
import X.AnonymousClass1U5;
import X.AnonymousClass1UR;
import X.AnonymousClass20D;
import X.AnonymousClass218;
import X.AnonymousClass4GQ;
import X.AnonymousClass4GR;
import X.C382126e;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import X.C85494Gl;
import X.C85534Gq;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$observeStickerExpressionsSideEffects$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$observeStickerExpressionsSideEffects$1 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$observeStickerExpressionsSideEffects$1$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$observeStickerExpressionsSideEffects$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GQ {
        public int label;

        public final Object A09(Object obj) {
            AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C57682u2.A01(obj);
                C85534Gq r2 = StickerExpressionsViewModel.this.A0d;
                AnonymousClass1U5 r0 = new AnonymousClass1U5(((AnonymousClass1UR) r1).A00);
                this.label = 1;
                if (r2.B2K(r0, this) == r4) {
                    return r4;
                }
            } else if (i == 1) {
                C57682u2.A01(obj);
            } else {
                throw AnonymousClass001.A0d();
            }
            return C59022wD.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C59022wD.A01(new AnonymousClass1(r1, (C84814Du) obj));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$observeStickerExpressionsSideEffects$1(StickerExpressionsViewModel stickerExpressionsViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = stickerExpressionsViewModel;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            final C382126e r1 = (C382126e) this.L$0;
            if (r1 instanceof AnonymousClass1UR) {
                final StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
                AnonymousClass1 r0 = new AnonymousClass1((C84814Du) null);
                C616131n.A02((C85494Gl) null, new StickerExpressionsViewModel$launchAfterDataLoad$1(stickerExpressionsViewModel, (C84814Du) null, r0), AnonymousClass0IV.A00(stickerExpressionsViewModel), (AnonymousClass20D) null, 3);
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        StickerExpressionsViewModel$observeStickerExpressionsSideEffects$1 stickerExpressionsViewModel$observeStickerExpressionsSideEffects$1 = new StickerExpressionsViewModel$observeStickerExpressionsSideEffects$1(this.this$0, r4);
        stickerExpressionsViewModel$observeStickerExpressionsSideEffects$1.L$0 = obj;
        return stickerExpressionsViewModel$observeStickerExpressionsSideEffects$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
