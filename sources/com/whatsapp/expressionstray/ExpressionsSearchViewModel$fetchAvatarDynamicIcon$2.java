package com.whatsapp.expressionstray;

import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass1TP;
import X.AnonymousClass1TQ;
import X.AnonymousClass26T;
import X.AnonymousClass4GR;
import X.C49942hL;
import X.C57682u2;
import X.C59022wD;
import X.C626936e;
import X.C75003pT;
import X.C84814Du;
import android.graphics.Bitmap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsSearchViewModel$fetchAvatarDynamicIcon$2", f = "ExpressionsSearchViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$fetchAvatarDynamicIcon$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$fetchAvatarDynamicIcon$2(ExpressionsSearchViewModel expressionsSearchViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = expressionsSearchViewModel;
    }

    public final Object A09(Object obj) {
        Object r4;
        if (this.label == 0) {
            C57682u2.A01(obj);
            if (this.this$0.A0D.A01()) {
                C49942hL r2 = this.this$0.A0G;
                C626936e.A00();
                Bitmap A00 = r2.A00(r2.A01("meta-avatar-tab-icon"), "meta-avatar-tab-icon");
                if (A00 != null) {
                    ExpressionsSearchViewModel expressionsSearchViewModel = this.this$0;
                    expressionsSearchViewModel.A02 = A00;
                    AnonymousClass08M r3 = expressionsSearchViewModel.A07;
                    AnonymousClass26T r22 = (AnonymousClass26T) r3.A07();
                    if (r22 instanceof AnonymousClass1TQ) {
                        AnonymousClass1TQ r23 = (AnonymousClass1TQ) r22;
                        r4 = new AnonymousClass1TQ(A00, r23.A02, r23.A03, r23.A00, r23.A04);
                    } else if (r22 instanceof AnonymousClass1TP) {
                        AnonymousClass1TP r24 = (AnonymousClass1TP) r22;
                        r4 = new AnonymousClass1TP(A00, r24.A01, r24.A02);
                    }
                    r3.A0G(r4);
                }
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new ExpressionsSearchViewModel$fetchAvatarDynamicIcon$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new ExpressionsSearchViewModel$fetchAvatarDynamicIcon$2(this.this$0, (C84814Du) obj2));
    }
}
