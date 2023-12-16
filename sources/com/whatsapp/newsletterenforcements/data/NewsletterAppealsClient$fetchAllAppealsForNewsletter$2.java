package com.whatsapp.newsletterenforcements.data;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C95804uY;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient$fetchAllAppealsForNewsletter$2", f = "NewsletterAppealsClient.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterAppealsClient$fetchAllAppealsForNewsletter$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C95804uY $newsletterJid;
    public int label;
    public final /* synthetic */ NewsletterAppealsClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAppealsClient$fetchAllAppealsForNewsletter$2(C95804uY r2, NewsletterAppealsClient newsletterAppealsClient, C84814Du r4) {
        super(r4, 2);
        this.$newsletterJid = r2;
        this.this$0 = newsletterAppealsClient;
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r7) {
        /*
            r6 = this;
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x0046
            if (r0 != r4) goto L_0x00e1
            X.C57682u2.A01(r7)
        L_0x000c:
            X.7aq r7 = (X.C153197aq) r7
            java.lang.String r1 = "xwa2_channel_appeals"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAppealsResponseImpl$Xwa2ChannelAppeals> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAppealsResponseImpl.Xwa2ChannelAppeals.class
            X.7aq r3 = r7.A00(r0, r1)
            X.C162457s7.A0D(r3)
            java.lang.String r1 = "suspension_appeals"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAppealsResponseImpl$Xwa2ChannelAppeals$SuspensionAppeals> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAppealsResponseImpl.Xwa2ChannelAppeals.SuspensionAppeals.class
            X.6aY r0 = r3.A02(r0, r1)
            if (r0 == 0) goto L_0x0078
            java.util.ArrayList r5 = X.C73783g4.A0d(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x002b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r0 = r2.next()
            X.7aq r0 = (X.C153197aq) r0
            org.json.JSONObject r1 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterSuspendAppealStateResponseImpl r0 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterSuspendAppealStateResponseImpl
            r0.<init>(r1)
            X.1hE r0 = com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient.A02(r0)
            r5.add(r0)
            goto L_0x002b
        L_0x0046:
            X.C57682u2.A01(r7)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterAppealsQueryImpl$Builder r2 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterAppealsQueryImpl$Builder
            r2.<init>()
            X.4uY r0 = r6.$newsletterJid
            java.lang.String r1 = r0.toString()
            X.2ie r3 = r2.A00
            java.lang.String r0 = "channel_id"
            r3.A02(r0, r1)
            boolean r0 = X.AnonymousClass000.A1W(r1)
            X.C162187rP.A06(r0)
            java.lang.String r2 = "NewsletterAppeals"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAppealsResponseImpl> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAppealsResponseImpl.class
            X.7J9 r1 = new X.7J9
            r1.<init>(r3, r0, r2)
            com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient r0 = r6.this$0
            X.7Rg r0 = r0.A00
            r6.label = r4
            java.lang.Object r7 = r0.A00(r1, r6)
            if (r7 != r5) goto L_0x000c
            return r5
        L_0x0078:
            X.3d3 r5 = X.C72023d3.A00
        L_0x007a:
            java.lang.String r1 = "geo_suspend_appeals"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAppealsResponseImpl$Xwa2ChannelAppeals$GeoSuspendAppeals> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAppealsResponseImpl.Xwa2ChannelAppeals.GeoSuspendAppeals.class
            X.6aY r0 = r3.A02(r0, r1)
            if (r0 == 0) goto L_0x00a7
            java.util.ArrayList r4 = X.C73783g4.A0d(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x008c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r0 = r2.next()
            X.7aq r0 = (X.C153197aq) r0
            org.json.JSONObject r1 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterGeoSuspendAppealStateResponseImpl r0 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterGeoSuspendAppealStateResponseImpl
            r0.<init>(r1)
            X.1hF r0 = com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient.A00(r0)
            r4.add(r0)
            goto L_0x008c
        L_0x00a7:
            X.3d3 r4 = X.C72023d3.A00
        L_0x00a9:
            java.lang.String r1 = "violating_message_appeals"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAppealsResponseImpl$Xwa2ChannelAppeals$ViolatingMessageAppeals> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAppealsResponseImpl.Xwa2ChannelAppeals.ViolatingMessageAppeals.class
            X.6aY r0 = r3.A02(r0, r1)
            if (r0 == 0) goto L_0x00d6
            java.util.ArrayList r3 = X.C73783g4.A0d(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x00bb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00d8
            java.lang.Object r0 = r2.next()
            X.7aq r0 = (X.C153197aq) r0
            org.json.JSONObject r1 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterViolatingMessageAppealStateResponseImpl r0 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterViolatingMessageAppealStateResponseImpl
            r0.<init>(r1)
            X.1hG r0 = com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient.A01(r0)
            r3.add(r0)
            goto L_0x00bb
        L_0x00d6:
            X.3d3 r3 = X.C72023d3.A00
        L_0x00d8:
            java.util.List r0 = X.C73723fy.A0K(r4, r5)
            java.util.List r0 = X.C73723fy.A0K(r3, r0)
            return r0
        L_0x00e1:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient$fetchAllAppealsForNewsletter$2.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new NewsletterAppealsClient$fetchAllAppealsForNewsletter$2(this.$newsletterJid, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
