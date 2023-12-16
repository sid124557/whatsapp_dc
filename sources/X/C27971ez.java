package X;

/* renamed from: X.1ez  reason: invalid class name and case insensitive filesystem */
public final class C27971ez extends C50682ib {
    public final C47922e3 A00;
    public final C56652sL A01;
    public final AnonymousClass1VX A02;
    public final C56182rZ A03;
    public final C51022j9 A04;
    public final C49152g4 A05;

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0250, code lost:
        if (r2 != null) goto L_0x01ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0215  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C27871eo r13) {
        /*
            r12 = this;
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            X.7aq r4 = r13.A00
            java.lang.String r3 = "xwa2_notify_newsletter_on_admin_metadata_update"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate> r2 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.class
            X.7aq r1 = r4.A00(r2, r3)
            java.lang.String r0 = "id"
            java.lang.String r0 = r1.A04(r0)
            X.4uY r8 = X.C106415Yx.A00(r0)     // Catch:{ all -> 0x001a }
            goto L_0x001f
        L_0x001a:
            r0 = move-exception
            X.3Z0 r8 = X.AnonymousClass3Z0.A01(r0)
        L_0x001f:
            boolean r0 = r8 instanceof X.AnonymousClass3Z0
            if (r0 == 0) goto L_0x0024
            r8 = 0
        L_0x0024:
            X.4uY r8 = (X.C95804uY) r8
            if (r8 == 0) goto L_0x025b
            X.7aq r5 = r4.A00(r2, r3)
            X.C162457s7.A0D(r5)
            java.lang.String r1 = "thread_metadata"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$ThreadMetadata> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.ThreadMetadata.class
            X.7aq r2 = r5.A00(r0, r1)
            if (r2 == 0) goto L_0x0180
            java.lang.String r1 = "geo_states"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$ThreadMetadata$GeoStates> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.ThreadMetadata.GeoStates.class
            X.6aY r11 = r2.A02(r0, r1)
            if (r11 == 0) goto L_0x0180
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r6 = r11.iterator()
        L_0x004c:
            boolean r0 = r6.hasNext()
            r3 = 1
            if (r0 == 0) goto L_0x0074
            java.lang.Object r3 = r6.next()
            r2 = r3
            X.7aq r2 = (X.C153197aq) r2
            java.lang.String r1 = "state"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$ThreadMetadata$GeoStates$State> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.ThreadMetadata.GeoStates.State.class
            X.7aq r2 = r2.A00(r0, r1)
            java.lang.String r1 = "type"
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r1 = r2.A03(r0, r1)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.GEOSUSPENDED
            if (r1 != r0) goto L_0x004c
            r4.add(r3)
            goto L_0x004c
        L_0x0074:
            java.util.ArrayList r10 = X.C73783g4.A0d(r4)
            java.util.Iterator r2 = r4.iterator()
        L_0x007c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r2.next()
            X.7aq r0 = (X.C153197aq) r0
            org.json.JSONObject r1 = r0.A00
            java.lang.String r0 = "country_code"
            java.lang.String r0 = r1.optString(r0)
            r10.add(r0)
            goto L_0x007c
        L_0x0094:
            boolean r0 = X.AnonymousClass0x7.A1S(r10)
            if (r0 == 0) goto L_0x00e8
            X.2j9 r6 = r12.A04
            monitor-enter(r6)
            X.2j8 r9 = r6.A00(r8)     // Catch:{ all -> 0x017c }
            if (r9 == 0) goto L_0x00e7
            java.util.Set r7 = r9.A00     // Catch:{ all -> 0x017c }
            java.util.ArrayList r4 = X.C73783g4.A0d(r10)     // Catch:{ all -> 0x017c }
            java.util.Iterator r2 = r10.iterator()     // Catch:{ all -> 0x017c }
        L_0x00ad:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x017c }
            if (r0 == 0) goto L_0x00c0
            java.lang.String r1 = X.AnonymousClass001.A0m(r2)     // Catch:{ all -> 0x017c }
            X.2j7 r0 = new X.2j7     // Catch:{ all -> 0x017c }
            r0.<init>(r1)     // Catch:{ all -> 0x017c }
            r4.add(r0)     // Catch:{ all -> 0x017c }
            goto L_0x00ad
        L_0x00c0:
            java.util.Set r0 = X.C73823g8.A01(r4, r7)     // Catch:{ all -> 0x017c }
            X.2j8 r1 = new X.2j8     // Catch:{ all -> 0x017c }
            r1.<init>(r0)     // Catch:{ all -> 0x017c }
            boolean r0 = r9.equals(r1)     // Catch:{ all -> 0x017c }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00e7
            r6.A02(r8, r1)     // Catch:{ all -> 0x017c }
            monitor-exit(r6)
            X.1VX r2 = r12.A02
            r1 = 5216(0x1460, float:7.309E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x00e8
            X.2sL r0 = r12.A01
            r0.A02(r8, r3)
            goto L_0x00e8
        L_0x00e7:
            monitor-exit(r6)
        L_0x00e8:
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Iterator r4 = r11.iterator()
        L_0x00f0:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0117
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.7aq r2 = (X.C153197aq) r2
            java.lang.String r1 = "state"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$ThreadMetadata$GeoStates$State> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.ThreadMetadata.GeoStates.State.class
            X.7aq r2 = r2.A00(r0, r1)
            java.lang.String r1 = "type"
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r1 = r2.A03(r0, r1)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.ACTIVE
            if (r1 != r0) goto L_0x00f0
            r6.add(r3)
            goto L_0x00f0
        L_0x0117:
            java.util.ArrayList r9 = X.C73783g4.A0d(r6)
            java.util.Iterator r2 = r6.iterator()
        L_0x011f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0137
            java.lang.Object r0 = r2.next()
            X.7aq r0 = (X.C153197aq) r0
            org.json.JSONObject r1 = r0.A00
            java.lang.String r0 = "country_code"
            java.lang.String r0 = r1.optString(r0)
            r9.add(r0)
            goto L_0x011f
        L_0x0137:
            boolean r0 = X.AnonymousClass0x7.A1S(r9)
            if (r0 == 0) goto L_0x0180
            X.2j9 r6 = r12.A04
            monitor-enter(r6)
            X.2j8 r7 = r6.A00(r8)     // Catch:{ all -> 0x017c }
            if (r7 == 0) goto L_0x017f
            java.util.Set r4 = r7.A00     // Catch:{ all -> 0x017c }
            java.util.ArrayList r3 = X.C73783g4.A0d(r9)     // Catch:{ all -> 0x017c }
            java.util.Iterator r2 = r9.iterator()     // Catch:{ all -> 0x017c }
        L_0x0150:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x017c }
            if (r0 == 0) goto L_0x0163
            java.lang.String r1 = X.AnonymousClass001.A0m(r2)     // Catch:{ all -> 0x017c }
            X.2j7 r0 = new X.2j7     // Catch:{ all -> 0x017c }
            r0.<init>(r1)     // Catch:{ all -> 0x017c }
            r3.add(r0)     // Catch:{ all -> 0x017c }
            goto L_0x0150
        L_0x0163:
            java.util.Set r0 = X.C73723fy.A0P(r3)     // Catch:{ all -> 0x017c }
            java.util.Set r0 = X.C73823g8.A00(r0, r4)     // Catch:{ all -> 0x017c }
            X.2j8 r1 = new X.2j8     // Catch:{ all -> 0x017c }
            r1.<init>(r0)     // Catch:{ all -> 0x017c }
            boolean r0 = r7.equals(r1)     // Catch:{ all -> 0x017c }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x017f
            r6.A02(r8, r1)     // Catch:{ all -> 0x017c }
            goto L_0x017f
        L_0x017c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x017f:
            monitor-exit(r6)
        L_0x0180:
            java.lang.String r1 = "messages"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$Messages> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.Messages.class
            X.7aq r2 = r5.A00(r0, r1)
            if (r2 == 0) goto L_0x025b
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.lang.String r1 = "edges"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$Messages$Edges> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.Messages.Edges.class
            X.6aY r0 = r2.A02(r0, r1)
            X.C162457s7.A0D(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x01a2:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0256
            java.lang.Object r2 = r9.next()
            X.7aq r2 = (X.C153197aq) r2
            if (r2 == 0) goto L_0x024f
            java.lang.String r1 = "node"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$Messages$Edges$Node> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.Messages.Edges.Node.class
            X.7aq r0 = r2.A00(r0, r1)
            if (r0 == 0) goto L_0x024f
            org.json.JSONObject r1 = r0.A00
            java.lang.String r0 = "server_id"
            java.lang.String r0 = r1.optString(r0)
            if (r0 == 0) goto L_0x024f
            java.lang.Long r3 = X.C829745q.A07(r0)
        L_0x01ca:
            java.lang.String r1 = "node"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$Messages$Edges$Node> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.Messages.Edges.Node.class
            X.7aq r2 = r2.A00(r0, r1)
            if (r2 == 0) goto L_0x0254
            java.lang.String r1 = "message_delivery_update"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$Messages$Edges$Node$MessageDeliveryUpdate> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.Messages.Edges.Node.MessageDeliveryUpdate.class
            X.7aq r2 = r2.A00(r0, r1)
            if (r2 == 0) goto L_0x0254
            java.lang.String r1 = "issue"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$Messages$Edges$Node$MessageDeliveryUpdate$Issue> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.Messages.Edges.Node.MessageDeliveryUpdate.Issue.class
            X.7aq r2 = r2.A00(r0, r1)
            if (r2 == 0) goto L_0x0254
            java.lang.String r1 = "code"
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2MessageDeliveryUpdateIssueCode r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2MessageDeliveryUpdateIssueCode.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r1 = r2.A03(r0, r1)
        L_0x01f1:
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2MessageDeliveryUpdateIssueCode r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2MessageDeliveryUpdateIssueCode.NEEDS_REVIEW
            boolean r4 = X.AnonymousClass000.A1Y(r1, r0)
            if (r3 != 0) goto L_0x0215
            if (r4 == 0) goto L_0x020f
            X.22M r3 = X.AnonymousClass22M.A0N
            java.lang.String r2 = "add"
        L_0x01ff:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "NewsletterAdminMetadataUpdateHandler/reportServerIdMissing Unexpectedly failed to find serverId for message to "
            X.C18260x0.A0r(r0, r2, r1)
            X.2e3 r1 = r12.A00
            r0 = 0
            r1.A01(r3, r0)
            goto L_0x01a2
        L_0x020f:
            X.22M r3 = X.AnonymousClass22M.A0O
            java.lang.String r2 = "remove"
            goto L_0x01ff
        L_0x0215:
            X.2rZ r0 = r12.A03
            long r2 = r3.longValue()
            X.34x r1 = r0.A00(r8, r2)
            r0 = r6
            if (r4 == 0) goto L_0x0223
            r0 = r7
        L_0x0223:
            if (r1 != 0) goto L_0x024a
            if (r4 == 0) goto L_0x0244
            X.22M r5 = X.AnonymousClass22M.A09
            java.lang.String r4 = "add"
        L_0x022b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "NewsletterAdminMetadataUpdateHandler/reportMessageNotFound Unexpectedly failed to find message to "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " for serverId: "
            X.C18260x0.A11(r0, r1, r2)
            X.2e3 r1 = r12.A00
            r0 = 0
            r1.A01(r5, r0)
            goto L_0x01a2
        L_0x0244:
            X.22M r5 = X.AnonymousClass22M.A0A
            java.lang.String r4 = "remove"
            goto L_0x022b
        L_0x024a:
            r0.add(r1)
            goto L_0x01a2
        L_0x024f:
            r3 = 0
            if (r2 == 0) goto L_0x0254
            goto L_0x01ca
        L_0x0254:
            r1 = 0
            goto L_0x01f1
        L_0x0256:
            X.2g4 r0 = r12.A05
            r0.A01(r8, r7, r6)
        L_0x025b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27971ez.A00(X.1eo):void");
    }

    public C27971ez(C47922e3 r2, C56652sL r3, AnonymousClass1VX r4, C56182rZ r5, C51022j9 r6, C49152g4 r7) {
        C18260x0.A0d(r4, r3, r5, r6);
        C162457s7.A0J(r7, 6);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r7;
    }
}
