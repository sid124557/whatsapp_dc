package com.whatsapp.expressionstray.conversation;

import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass1Tc;
import X.AnonymousClass4GR;
import X.C49942hL;
import X.C57682u2;
import X.C59022wD;
import X.C626936e;
import X.C75003pT;
import X.C84814Du;
import android.graphics.Bitmap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel$fetchAvatarDynamicIcon$2", f = "ExpressionsKeyboardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsKeyboardViewModel$fetchAvatarDynamicIcon$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ ExpressionsKeyboardViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsKeyboardViewModel$fetchAvatarDynamicIcon$2(ExpressionsKeyboardViewModel expressionsKeyboardViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = expressionsKeyboardViewModel;
    }

    public final Object A09(Object obj) {
        AnonymousClass1Tc r1;
        if (this.label == 0) {
            C57682u2.A01(obj);
            C49942hL r2 = this.this$0.A0C;
            C626936e.A00();
            Bitmap A00 = r2.A00(r2.A01("meta-avatar-tab-icon"), "meta-avatar-tab-icon");
            if (A00 == null) {
                return null;
            }
            ExpressionsKeyboardViewModel expressionsKeyboardViewModel = this.this$0;
            expressionsKeyboardViewModel.A01 = A00;
            AnonymousClass08M r22 = expressionsKeyboardViewModel.A04;
            Object A07 = r22.A07();
            if ((A07 instanceof AnonymousClass1Tc) && (r1 = (AnonymousClass1Tc) A07) != null) {
                r22.A0G(new AnonymousClass1Tc(A00, r1.A02, r1.A03, r1.A00, r1.A04));
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new ExpressionsKeyboardViewModel$fetchAvatarDynamicIcon$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new ExpressionsKeyboardViewModel$fetchAvatarDynamicIcon$2(this.this$0, (C84814Du) obj2));
    }
}
