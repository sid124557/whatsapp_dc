package com.whatsapp.newsletterenforcements.data;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.AnonymousClass7J9;
import X.C129586aY;
import X.C150557Rg;
import X.C153197aq;
import X.C162187rP;
import X.C50712ie;
import X.C57682u2;
import X.C59022wD;
import X.C72023d3;
import X.C73783g4;
import X.C75003pT;
import X.C84814Du;
import X.C95804uY;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterViolatingMessageAppealStateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterViolatingMessageLatestAppealStateQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterViolatingMessageLatestAppealStateResponseImpl;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient$fetchViolatingMessagesAppeal$2", f = "NewsletterAppealsClient.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterAppealsClient$fetchViolatingMessagesAppeal$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C95804uY $newsletterJid;
    public int label;
    public final /* synthetic */ NewsletterAppealsClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAppealsClient$fetchViolatingMessagesAppeal$2(C95804uY r2, NewsletterAppealsClient newsletterAppealsClient, C84814Du r4) {
        super(r4, 2);
        this.$newsletterJid = r2;
        this.this$0 = newsletterAppealsClient;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            NewsletterViolatingMessageLatestAppealStateQueryImpl$Builder newsletterViolatingMessageLatestAppealStateQueryImpl$Builder = new NewsletterViolatingMessageLatestAppealStateQueryImpl$Builder();
            String obj2 = this.$newsletterJid.toString();
            C50712ie r3 = newsletterViolatingMessageLatestAppealStateQueryImpl$Builder.A00;
            r3.A02("channel_id", obj2);
            C162187rP.A06(AnonymousClass000.A1W(obj2));
            AnonymousClass7J9 r1 = new AnonymousClass7J9(r3, NewsletterViolatingMessageLatestAppealStateResponseImpl.class, "NewsletterViolatingMessageLatestAppealState");
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
        C129586aY A02 = ((C153197aq) obj).A02(NewsletterViolatingMessageLatestAppealStateResponseImpl.Xwa2ChannelViolatingMessagesLatestAppealState.class, "xwa2_channel_violating_messages_latest_appeal_state");
        if (A02 == null) {
            return C72023d3.A00;
        }
        ArrayList A0c = C73783g4.A0c(A02);
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            A0c.add(NewsletterAppealsClient.A01(new NewsletterViolatingMessageAppealStateResponseImpl(((C153197aq) it.next()).A00)));
        }
        return A0c;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new NewsletterAppealsClient$fetchViolatingMessagesAppeal$2(this.$newsletterJid, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
