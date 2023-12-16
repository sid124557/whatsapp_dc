package com.whatsapp.newsletterenforcements.userreports;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.AnonymousClass7J9;
import X.C150557Rg;
import X.C153197aq;
import X.C50712ie;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterUserReportsResponseImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletterenforcements.userreports.NewsletterUserReportsNetworkClient$fetchUserReports$2", f = "NewsletterUserReportsNetworkClient.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterUserReportsNetworkClient$fetchUserReports$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ NewsletterUserReportsNetworkClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterUserReportsNetworkClient$fetchUserReports$2(NewsletterUserReportsNetworkClient newsletterUserReportsNetworkClient, C84814Du r3) {
        super(r3, 2);
        this.this$0 = newsletterUserReportsNetworkClient;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass7J9 r1 = new AnonymousClass7J9(new C50712ie(), NewsletterUserReportsResponseImpl.class, "NewsletterUserReports");
            C150557Rg r0 = this.this$0.A00;
            this.label = 1;
            obj = r0.A00(r1, this);
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return ((C153197aq) obj).A00(NewsletterUserReportsResponseImpl.Xwa2ChannelsReports.class, "xwa2_channels_reports").A02(NewsletterUserReportsResponseImpl.Xwa2ChannelsReports.ChannelsReports.class, "channels_reports");
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new NewsletterUserReportsNetworkClient$fetchUserReports$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new NewsletterUserReportsNetworkClient$fetchUserReports$2(this.this$0, (C84814Du) obj2));
    }
}
