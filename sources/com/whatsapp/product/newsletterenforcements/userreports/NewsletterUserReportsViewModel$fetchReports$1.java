package com.whatsapp.product.newsletterenforcements.userreports;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass2C4;
import X.AnonymousClass4GR;
import X.AnonymousClass8SF;
import X.C129586aY;
import X.C18260x0;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.newsletterenforcements.userreports.NewsletterUserReportsNetworkClient;
import java.util.AbstractCollection;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel$fetchReports$1", f = "NewsletterUserReportsViewModel.kt", i = {1}, l = {62, 63}, m = "invokeSuspend", n = {"userReports"}, s = {"L$0"})
public final class NewsletterUserReportsViewModel$fetchReports$1 extends C75003pT implements AnonymousClass4GR {
    public Object L$0;
    public int label;
    public final /* synthetic */ NewsletterUserReportsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterUserReportsViewModel$fetchReports$1(NewsletterUserReportsViewModel newsletterUserReportsViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = newsletterUserReportsViewModel;
    }

    public final Object A09(Object obj) {
        AbstractCollection abstractCollection;
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            try {
                NewsletterUserReportsNetworkClient newsletterUserReportsNetworkClient = this.this$0.A02;
                this.label = 1;
                obj = newsletterUserReportsNetworkClient.A00(this);
                if (obj == r4) {
                    return r4;
                }
            } catch (AnonymousClass8SF e) {
                C18260x0.A1Q(AnonymousClass001.A0o(), "Exception while fetching newsletter reports: ", e);
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else if (i == 2) {
            abstractCollection = (AbstractCollection) this.L$0;
            C57682u2.A01(obj);
            List list = (List) obj;
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A19("Successfully fetched user reports: from network: ", A0o, abstractCollection);
            C18260x0.A1C(", after filtering: ", A0o, list);
            this.this$0.A00.A0G(list);
            return C59022wD.A00;
        } else {
            throw AnonymousClass001.A0d();
        }
        C129586aY r6 = (C129586aY) obj;
        NewsletterUserReportsViewModel newsletterUserReportsViewModel = this.this$0;
        this.L$0 = r6;
        this.label = 2;
        Object A00 = C616131n.A00(this, AnonymousClass2C4.A00, new NewsletterUserReportsViewModel$processUserReports$2(newsletterUserReportsViewModel, r6, (C84814Du) null));
        if (A00 == r4) {
            return r4;
        }
        abstractCollection = r6;
        obj = A00;
        List list2 = (List) obj;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        C18260x0.A19("Successfully fetched user reports: from network: ", A0o2, abstractCollection);
        C18260x0.A1C(", after filtering: ", A0o2, list2);
        this.this$0.A00.A0G(list2);
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new NewsletterUserReportsViewModel$fetchReports$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new NewsletterUserReportsViewModel$fetchReports$1(this.this$0, (C84814Du) obj2));
    }
}
