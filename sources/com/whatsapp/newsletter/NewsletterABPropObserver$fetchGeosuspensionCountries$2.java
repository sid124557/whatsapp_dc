package com.whatsapp.newsletter;

import X.AnonymousClass001;
import X.AnonymousClass4DG;
import X.AnonymousClass4GR;
import X.C28491gy;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C94424rG;
import X.C95804uY;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.NewsletterABPropObserver$fetchGeosuspensionCountries$2", f = "NewsletterABPropObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterABPropObserver$fetchGeosuspensionCountries$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ C94424rG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterABPropObserver$fetchGeosuspensionCountries$2(C94424rG r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            List<C95804uY> A05 = this.this$0.A03.A05();
            C94424rG r2 = this.this$0;
            for (C95804uY r4 : A05) {
                r2.A02.A02(new C28491gy(r4, (AnonymousClass4DG) null, true, false, false));
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new NewsletterABPropObserver$fetchGeosuspensionCountries$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new NewsletterABPropObserver$fetchGeosuspensionCountries$2(this.this$0, (C84814Du) obj2));
    }
}
