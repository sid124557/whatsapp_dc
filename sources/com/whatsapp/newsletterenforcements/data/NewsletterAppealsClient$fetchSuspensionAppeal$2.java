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
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterSuspendAppealStateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterSuspendLatestAppealStateQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterSuspendLatestAppealStateResponseImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient$fetchSuspensionAppeal$2", f = "NewsletterAppealsClient.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterAppealsClient$fetchSuspensionAppeal$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C95804uY $newsletterJid;
    public Object L$0;
    public int label;
    public final /* synthetic */ NewsletterAppealsClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAppealsClient$fetchSuspensionAppeal$2(C95804uY r2, NewsletterAppealsClient newsletterAppealsClient, C84814Du r4) {
        super(r4, 2);
        this.$newsletterJid = r2;
        this.this$0 = newsletterAppealsClient;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            NewsletterSuspendLatestAppealStateQueryImpl$Builder newsletterSuspendLatestAppealStateQueryImpl$Builder = new NewsletterSuspendLatestAppealStateQueryImpl$Builder();
            String obj2 = this.$newsletterJid.toString();
            C50712ie r3 = newsletterSuspendLatestAppealStateQueryImpl$Builder.A00;
            r3.A02("channel_id", obj2);
            C162187rP.A06(AnonymousClass000.A1W(obj2));
            AnonymousClass7J9 r2 = new AnonymousClass7J9(r3, NewsletterSuspendLatestAppealStateResponseImpl.class, "NewsletterSuspendLatestAppealState");
            NewsletterAppealsClient newsletterAppealsClient = this.this$0;
            C150557Rg r0 = newsletterAppealsClient.A00;
            this.L$0 = newsletterAppealsClient;
            this.label = 1;
            obj = r0.A00(r2, this);
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return NewsletterAppealsClient.A02(new NewsletterSuspendAppealStateResponseImpl(((C153197aq) obj).A00(NewsletterSuspendLatestAppealStateResponseImpl.Xwa2ChannelSuspendLatestAppealState.class, "xwa2_channel_suspend_latest_appeal_state").A00));
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new NewsletterAppealsClient$fetchSuspensionAppeal$2(this.$newsletterJid, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
