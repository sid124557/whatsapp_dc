package com.whatsapp.product.newsletterenforcements.userreports;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C153197aq;
import X.C18330xA;
import X.C40722Hm;
import X.C57682u2;
import X.C57692u3;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel$processUserReports$2", f = "NewsletterUserReportsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterUserReportsViewModel$processUserReports$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ List $userReports;
    public int label;
    public final /* synthetic */ NewsletterUserReportsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterUserReportsViewModel$processUserReports$2(NewsletterUserReportsViewModel newsletterUserReportsViewModel, List list, C84814Du r4) {
        super(r4, 2);
        this.$userReports = list;
        this.this$0 = newsletterUserReportsViewModel;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            List list = this.$userReports;
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object next : list) {
                GraphQLXWA2ReportStatus graphQLXWA2ReportStatus = GraphQLXWA2ReportStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                if (((C153197aq) next).A03(graphQLXWA2ReportStatus, "status") != graphQLXWA2ReportStatus) {
                    A0s.add(next);
                }
            }
            C40722Hm r1 = this.this$0.A03;
            r1.A00.clear();
            ConcurrentHashMap concurrentHashMap = r1.A00;
            LinkedHashMap A0C = C18330xA.A0C(C57692u3.A01(A0s));
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                A0C.put(((C153197aq) next2).A00.optString("report_id"), next2);
            }
            concurrentHashMap.putAll(A0C);
            return A0s;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new NewsletterUserReportsViewModel$processUserReports$2(this.this$0, this.$userReports, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
