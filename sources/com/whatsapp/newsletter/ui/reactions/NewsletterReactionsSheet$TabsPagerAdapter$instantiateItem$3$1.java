package com.whatsapp.newsletter.ui.reactions;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4C8;
import X.AnonymousClass4GR;
import X.AnonymousClass4Ut;
import X.AnonymousClass4ZS;
import X.AnonymousClass6AZ;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import android.widget.ProgressBar;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet$TabsPagerAdapter$instantiateItem$3$1", f = "NewsletterReactionsSheet.kt", i = {}, l = {223}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterReactionsSheet$TabsPagerAdapter$instantiateItem$3$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ ProgressBar $loaderView;
    public final /* synthetic */ AnonymousClass4Ut $this_apply;
    public int label;
    public final /* synthetic */ NewsletterReactionsSheet this$0;
    public final /* synthetic */ AnonymousClass4ZS this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterReactionsSheet$TabsPagerAdapter$instantiateItem$3$1(ProgressBar progressBar, AnonymousClass4ZS r3, NewsletterReactionsSheet newsletterReactionsSheet, AnonymousClass4Ut r5, C84814Du r6) {
        super(r6, 2);
        this.$this_apply = r5;
        this.this$0 = newsletterReactionsSheet;
        this.this$1 = r3;
        this.$loaderView = progressBar;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass4C8 A02 = C75003pT.A02(this.this$0, this.$this_apply.A0D);
            AnonymousClass6AZ r0 = new AnonymousClass6AZ(this.$loaderView, 1, this.this$1);
            this.label = 1;
            if (A02.Az8(this, r0) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        AnonymousClass4Ut r4 = this.$this_apply;
        NewsletterReactionsSheet newsletterReactionsSheet = this.this$0;
        return new NewsletterReactionsSheet$TabsPagerAdapter$instantiateItem$3$1(this.$loaderView, this.this$1, newsletterReactionsSheet, r4, r8);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
