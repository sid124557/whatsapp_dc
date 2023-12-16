package com.whatsapp.newsletterenforcements.data;

import X.C150557Rg;
import X.C162457s7;
import X.C28511hE;
import X.C28521hF;
import X.C28531hG;
import X.C73853gB;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterGeoSuspendAppealStateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterSuspendAppealStateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterViolatingMessageAppealStateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealReason;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ViolationCategory;

public final class NewsletterAppealsClient {
    public final C150557Rg A00;
    public final C73853gB A01;

    public static final C28521hF A00(NewsletterGeoSuspendAppealStateResponseImpl newsletterGeoSuspendAppealStateResponseImpl) {
        GraphQLXWA2AppealState graphQLXWA2AppealState = (GraphQLXWA2AppealState) newsletterGeoSuspendAppealStateResponseImpl.A03(GraphQLXWA2AppealState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "state");
        C162457s7.A0D(graphQLXWA2AppealState);
        String A04 = newsletterGeoSuspendAppealStateResponseImpl.A04("creation_time");
        GraphQLXWA2ViolationCategory graphQLXWA2ViolationCategory = (GraphQLXWA2ViolationCategory) newsletterGeoSuspendAppealStateResponseImpl.A03(GraphQLXWA2ViolationCategory.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "enforcement_violation_category");
        C162457s7.A0D(graphQLXWA2ViolationCategory);
        String optString = newsletterGeoSuspendAppealStateResponseImpl.A00.optString("country_code");
        C162457s7.A0D(optString);
        return new C28521hF((GraphQLXWA2AppealReason) newsletterGeoSuspendAppealStateResponseImpl.A03(GraphQLXWA2AppealReason.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "appeal_reason"), graphQLXWA2AppealState, graphQLXWA2ViolationCategory, A04, optString);
    }

    public static final C28531hG A01(NewsletterViolatingMessageAppealStateResponseImpl newsletterViolatingMessageAppealStateResponseImpl) {
        GraphQLXWA2AppealState graphQLXWA2AppealState = (GraphQLXWA2AppealState) newsletterViolatingMessageAppealStateResponseImpl.A03(GraphQLXWA2AppealState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "state");
        C162457s7.A0D(graphQLXWA2AppealState);
        GraphQLXWA2ViolationCategory graphQLXWA2ViolationCategory = (GraphQLXWA2ViolationCategory) newsletterViolatingMessageAppealStateResponseImpl.A03(GraphQLXWA2ViolationCategory.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "enforcement_violation_category");
        C162457s7.A0D(graphQLXWA2ViolationCategory);
        String A04 = newsletterViolatingMessageAppealStateResponseImpl.A04("creation_time");
        String optString = newsletterViolatingMessageAppealStateResponseImpl.A00.optString("server_msg_id");
        C162457s7.A0D(optString);
        return new C28531hG((GraphQLXWA2AppealReason) newsletterViolatingMessageAppealStateResponseImpl.A03(GraphQLXWA2AppealReason.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "appeal_reason"), graphQLXWA2AppealState, graphQLXWA2ViolationCategory, A04, optString);
    }

    public static final C28511hE A02(NewsletterSuspendAppealStateResponseImpl newsletterSuspendAppealStateResponseImpl) {
        GraphQLXWA2AppealState graphQLXWA2AppealState = (GraphQLXWA2AppealState) newsletterSuspendAppealStateResponseImpl.A03(GraphQLXWA2AppealState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "state");
        C162457s7.A0D(graphQLXWA2AppealState);
        GraphQLXWA2ViolationCategory graphQLXWA2ViolationCategory = (GraphQLXWA2ViolationCategory) newsletterSuspendAppealStateResponseImpl.A03(GraphQLXWA2ViolationCategory.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "enforcement_violation_category");
        C162457s7.A0D(graphQLXWA2ViolationCategory);
        return new C28511hE((GraphQLXWA2AppealReason) newsletterSuspendAppealStateResponseImpl.A03(GraphQLXWA2AppealReason.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "appeal_reason"), graphQLXWA2AppealState, graphQLXWA2ViolationCategory, newsletterSuspendAppealStateResponseImpl.A04("creation_time"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.C95804uY r12, java.lang.String r13, java.lang.String r14, X.C84814Du r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof X.C118525tg
            r7 = r11
            if (r0 == 0) goto L_0x003c
            r4 = r15
            X.5tg r4 = (X.C118525tg) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003c
            int r2 = r2 - r1
            r4.label = r2
        L_0x0013:
            java.lang.Object r3 = r4.result
            X.218 r2 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 != r1) goto L_0x0042
            X.C57682u2.A01(r3)
        L_0x0021:
            X.C162457s7.A0G(r3)
            return r3
        L_0x0025:
            X.C57682u2.A01(r3)
            X.3gB r0 = r11.A01
            r10 = 0
            com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient$createGeosuspensionAppeal$2 r5 = new com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient$createGeosuspensionAppeal$2
            r6 = r12
            r8 = r13
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r4.label = r1
            java.lang.Object r3 = X.C616131n.A00(r4, r0, r5)
            if (r3 != r2) goto L_0x0021
            return r2
        L_0x003c:
            X.5tg r4 = new X.5tg
            r4.<init>(r11, r15)
            goto L_0x0013
        L_0x0042:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient.A03(X.4uY, java.lang.String, java.lang.String, X.4Du):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.C95804uY r12, java.lang.String r13, java.lang.String r14, X.C84814Du r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof X.C118545ti
            r7 = r11
            if (r0 == 0) goto L_0x003c
            r4 = r15
            X.5ti r4 = (X.C118545ti) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003c
            int r2 = r2 - r1
            r4.label = r2
        L_0x0013:
            java.lang.Object r3 = r4.result
            X.218 r2 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 != r1) goto L_0x0042
            X.C57682u2.A01(r3)
        L_0x0021:
            X.C162457s7.A0G(r3)
            return r3
        L_0x0025:
            X.C57682u2.A01(r3)
            X.3gB r0 = r11.A01
            r10 = 0
            com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient$createViolatingMessageAppeal$2 r5 = new com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient$createViolatingMessageAppeal$2
            r6 = r12
            r8 = r13
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r4.label = r1
            java.lang.Object r3 = X.C616131n.A00(r4, r0, r5)
            if (r3 != r2) goto L_0x0021
            return r2
        L_0x003c:
            X.5ti r4 = new X.5ti
            r4.<init>(r11, r15)
            goto L_0x0013
        L_0x0042:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient.A04(X.4uY, java.lang.String, java.lang.String, X.4Du):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(X.C95804uY r7, java.lang.String r8, X.C84814Du r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C118535th
            if (r0 == 0) goto L_0x0038
            r5 = r9
            X.5th r5 = (X.C118535th) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0038
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.218 r4 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0024
            if (r0 != r3) goto L_0x003e
            X.C57682u2.A01(r1)
        L_0x0020:
            X.C162457s7.A0G(r1)
            return r1
        L_0x0024:
            X.C57682u2.A01(r1)
            X.3gB r2 = r6.A01
            r1 = 0
            com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient$createSuspensionAppeal$2 r0 = new com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient$createSuspensionAppeal$2
            r0.<init>(r7, r6, r8, r1)
            r5.label = r3
            java.lang.Object r1 = X.C616131n.A00(r5, r2, r0)
            if (r1 != r4) goto L_0x0020
            return r4
        L_0x0038:
            X.5th r5 = new X.5th
            r5.<init>(r6, r9)
            goto L_0x0012
        L_0x003e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient.A05(X.4uY, java.lang.String, X.4Du):java.lang.Object");
    }

    public NewsletterAppealsClient(C150557Rg r1, C73853gB r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
