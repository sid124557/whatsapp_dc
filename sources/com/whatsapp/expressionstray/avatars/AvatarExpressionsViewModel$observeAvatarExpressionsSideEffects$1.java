package com.whatsapp.expressionstray.avatars;

import X.AnonymousClass001;
import X.AnonymousClass0IV;
import X.AnonymousClass1TR;
import X.AnonymousClass1TU;
import X.AnonymousClass20D;
import X.AnonymousClass26U;
import X.AnonymousClass26V;
import X.AnonymousClass4GQ;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C29901lX;
import X.C29921lZ;
import X.C43952Uc;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C832246p;
import X.C84814Du;
import X.C85494Gl;
import X.C85524Gp;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1", f = "AvatarExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AvatarExpressionsViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1$1", f = "AvatarExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GQ {
        public int label;

        public final Object A09(Object obj) {
            C43952Uc r4;
            if (this.label == 0) {
                C57682u2.A01(obj);
                boolean A0P = C162457s7.A0P(((AnonymousClass1TR) AnonymousClass26U.this).A00, "starred");
                AvatarExpressionsViewModel avatarExpressionsViewModel = avatarExpressionsViewModel;
                if (A0P) {
                    r4 = C29921lZ.A00;
                } else {
                    r4 = C29901lX.A00;
                }
                C85524Gp r2 = avatarExpressionsViewModel.A0G;
                AnonymousClass26V r1 = (AnonymousClass26V) r2.getValue();
                if (r1 instanceof AnonymousClass1TU) {
                    AnonymousClass1TU r12 = (AnonymousClass1TU) r1;
                    ((C832246p) r2).A04((Object) null, new AnonymousClass1TU(r4, r12.A01, r12.A03, r12.A04, true));
                }
                return C59022wD.A00;
            }
            throw AnonymousClass001.A0d();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C59022wD.A01(new AnonymousClass1(avatarExpressionsViewModel, (C84814Du) obj));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1(AvatarExpressionsViewModel avatarExpressionsViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = avatarExpressionsViewModel;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            final AnonymousClass26U r1 = (AnonymousClass26U) this.L$0;
            if (r1 instanceof AnonymousClass1TR) {
                final AvatarExpressionsViewModel avatarExpressionsViewModel = this.this$0;
                AnonymousClass1 r0 = new AnonymousClass1((C84814Du) null);
                C616131n.A02((C85494Gl) null, new AvatarExpressionsViewModel$launchAfterDataLoad$1(avatarExpressionsViewModel, (C84814Du) null, r0), AnonymousClass0IV.A00(avatarExpressionsViewModel), (AnonymousClass20D) null, 3);
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        AvatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1 avatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1 = new AvatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1(this.this$0, r4);
        avatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1.L$0 = obj;
        return avatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
