package com.whatsapp.product.newsletterenforcements.alerts;

import X.AnonymousClass001;
import X.AnonymousClass1RL;
import X.AnonymousClass1kV;
import X.AnonymousClass1kW;
import X.AnonymousClass1kX;
import X.AnonymousClass4GR;
import X.C51002j7;
import X.C56982ss;
import X.C57682u2;
import X.C58422vE;
import X.C59022wD;
import X.C73723fy;
import X.C75003pT;
import X.C84814Du;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel$fetchAlerts$2", f = "NewsletterAlertsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterAlertsViewModel$fetchAlerts$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ NewsletterAlertsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAlertsViewModel$fetchAlerts$2(NewsletterAlertsViewModel newsletterAlertsViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = newsletterAlertsViewModel;
    }

    public final Object A09(Object obj) {
        Object obj2;
        if (this.label == 0) {
            C57682u2.A01(obj);
            ArrayList A0s = AnonymousClass001.A0s();
            NewsletterAlertsViewModel newsletterAlertsViewModel = this.this$0;
            AnonymousClass1RL r5 = (AnonymousClass1RL) C56982ss.A00(newsletterAlertsViewModel.A01, newsletterAlertsViewModel.A03);
            if (r5 != null) {
                NewsletterAlertsViewModel newsletterAlertsViewModel2 = this.this$0;
                if (newsletterAlertsViewModel2.A02.A0Y(C58422vE.A02, 6146) && r5.A0M(newsletterAlertsViewModel2.A04)) {
                    obj2 = AnonymousClass1kX.A00;
                } else if (newsletterAlertsViewModel2.A07.A01(r5)) {
                    obj2 = AnonymousClass1kW.A00;
                }
                A0s.add(obj2);
            }
            NewsletterAlertsViewModel newsletterAlertsViewModel3 = this.this$0;
            for (C51002j7 r0 : C73723fy.A0H(newsletterAlertsViewModel3.A05.A01(newsletterAlertsViewModel3.A03), 30)) {
                A0s.add(new AnonymousClass1kV(r0.A00));
            }
            return C73723fy.A0F(A0s);
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new NewsletterAlertsViewModel$fetchAlerts$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new NewsletterAlertsViewModel$fetchAlerts$2(this.this$0, (C84814Du) obj2));
    }
}
