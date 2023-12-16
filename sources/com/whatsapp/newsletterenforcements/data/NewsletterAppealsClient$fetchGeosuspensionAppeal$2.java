package com.whatsapp.newsletterenforcements.data;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.AnonymousClass7J9;
import X.C150557Rg;
import X.C153197aq;
import X.C162187rP;
import X.C50712ie;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C95804uY;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterGeoSuspendAppealStateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterGeoSuspendLatestAppealStateQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterGeoSuspendLatestAppealStateResponseImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient$fetchGeosuspensionAppeal$2", f = "NewsletterAppealsClient.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterAppealsClient$fetchGeosuspensionAppeal$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $countryCode;
    public final /* synthetic */ C95804uY $newsletterJid;
    public Object L$0;
    public int label;
    public final /* synthetic */ NewsletterAppealsClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAppealsClient$fetchGeosuspensionAppeal$2(C95804uY r2, NewsletterAppealsClient newsletterAppealsClient, String str, C84814Du r5) {
        super(r5, 2);
        this.$newsletterJid = r2;
        this.$countryCode = str;
        this.this$0 = newsletterAppealsClient;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            NewsletterGeoSuspendLatestAppealStateQueryImpl$Builder newsletterGeoSuspendLatestAppealStateQueryImpl$Builder = new NewsletterGeoSuspendLatestAppealStateQueryImpl$Builder();
            String obj2 = this.$newsletterJid.toString();
            C50712ie r5 = newsletterGeoSuspendLatestAppealStateQueryImpl$Builder.A00;
            r5.A02("channel_id", obj2);
            newsletterGeoSuspendLatestAppealStateQueryImpl$Builder.A01 = AnonymousClass000.A1W(obj2);
            String str = this.$countryCode;
            r5.A02("country_code", str);
            newsletterGeoSuspendLatestAppealStateQueryImpl$Builder.A02 = AnonymousClass000.A1W(str);
            C162187rP.A06(newsletterGeoSuspendLatestAppealStateQueryImpl$Builder.A01);
            C162187rP.A06(newsletterGeoSuspendLatestAppealStateQueryImpl$Builder.A02);
            AnonymousClass7J9 r2 = new AnonymousClass7J9(r5, NewsletterGeoSuspendLatestAppealStateResponseImpl.class, "NewsletterGeoSuspendLatestAppealState");
            NewsletterAppealsClient newsletterAppealsClient = this.this$0;
            C150557Rg r0 = newsletterAppealsClient.A00;
            this.L$0 = newsletterAppealsClient;
            this.label = 1;
            obj = r0.A00(r2, this);
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return NewsletterAppealsClient.A00(new NewsletterGeoSuspendAppealStateResponseImpl(((C153197aq) obj).A00(NewsletterGeoSuspendLatestAppealStateResponseImpl.Xwa2ChannelGeoSuspendLatestAppealState.class, "xwa2_channel_geo_suspend_latest_appeal_state").A00));
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new NewsletterAppealsClient$fetchGeosuspensionAppeal$2(this.$newsletterJid, this.this$0, this.$countryCode, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
