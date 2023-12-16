package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterQueryMessageDeliveryUpdatesResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2MessageDeliveryUpdateIssueCode;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.43p  reason: invalid class name and case insensitive filesystem */
public final class C824443p extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C95804uY $newsletterJid;
    public final /* synthetic */ C45382Zv this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C824443p(C95804uY r2, C45382Zv r3) {
        super(1);
        this.this$0 = r3;
        this.$newsletterJid = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ArrayList arrayList;
        C129586aY A02;
        StringBuilder A0o;
        String str;
        C153197aq r2 = (C153197aq) obj;
        C162457s7.A0J(r2, 0);
        C153197aq A00 = r2.A00(NewsletterQueryMessageDeliveryUpdatesResponseImpl.Xwa2Newsletter.class, "xwa2_newsletter");
        if (A00 != null) {
            C45382Zv r5 = this.this$0;
            C95804uY r4 = this.$newsletterJid;
            C153197aq A002 = A00.A00(NewsletterQueryMessageDeliveryUpdatesResponseImpl.Xwa2Newsletter.Messages.class, "messages");
            if (A002 == null || (A02 = A002.A02(NewsletterQueryMessageDeliveryUpdatesResponseImpl.Xwa2Newsletter.Messages.Edges.class, "edges")) == null) {
                arrayList = AnonymousClass001.A0s();
            } else {
                arrayList = AnonymousClass001.A0s();
                Iterator it = A02.iterator();
                while (it.hasNext()) {
                    C153197aq r8 = (C153197aq) it.next();
                    Class<NewsletterQueryMessageDeliveryUpdatesResponseImpl.Xwa2Newsletter.Messages.Edges.Node> cls = NewsletterQueryMessageDeliveryUpdatesResponseImpl.Xwa2Newsletter.Messages.Edges.Node.class;
                    Class<NewsletterQueryMessageDeliveryUpdatesResponseImpl.Xwa2Newsletter.Messages.Edges.Node.MessageDeliveryUpdate> cls2 = NewsletterQueryMessageDeliveryUpdatesResponseImpl.Xwa2Newsletter.Messages.Edges.Node.MessageDeliveryUpdate.class;
                    Class<NewsletterQueryMessageDeliveryUpdatesResponseImpl.Xwa2Newsletter.Messages.Edges.Node.MessageDeliveryUpdate.Issue> cls3 = NewsletterQueryMessageDeliveryUpdatesResponseImpl.Xwa2Newsletter.Messages.Edges.Node.MessageDeliveryUpdate.Issue.class;
                    C153197aq A003 = r8.A00(cls, "node").A00(cls2, "message_delivery_update").A00(cls3, "issue");
                    GraphQLXWA2MessageDeliveryUpdateIssueCode graphQLXWA2MessageDeliveryUpdateIssueCode = GraphQLXWA2MessageDeliveryUpdateIssueCode.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                    if (A003.A03(graphQLXWA2MessageDeliveryUpdateIssueCode, "code") != GraphQLXWA2MessageDeliveryUpdateIssueCode.NEEDS_REVIEW) {
                        A0o = AnonymousClass001.A0o();
                        A0o.append("MessageDeliveryUpdatesFetcher/onSuccess - unexpected issue code ");
                        A0o.append(r8.A00(cls, "node").A00(cls2, "message_delivery_update").A00(cls3, "issue").A03(graphQLXWA2MessageDeliveryUpdateIssueCode, "code"));
                        str = " for id: ";
                    } else if (C829745q.A07(C18300x5.A0l("server_id", r8.A00(cls, "node").A00)) == null) {
                        A0o = AnonymousClass001.A0o();
                        str = "MessageDeliveryUpdatesFetcher/onSuccess - serverId is not long: ";
                    } else {
                        C624134x A004 = r5.A01.A00(r4, Long.parseLong(C18300x5.A0l("server_id", r8.A00(cls, "node").A00)));
                        if (A004 != null) {
                            arrayList.add(A004);
                        }
                    }
                    A0o.append(str);
                    C18260x0.A1K(A0o, r8.A00(cls, "node").A00.optString("server_id"));
                }
            }
            r5.A02.A00(r4, arrayList);
        } else {
            C18260x0.A1Q(AnonymousClass001.A0o(), "MessageDeliveryUpdatesFetcher/onSuccess - unexpected null newsletter with no errors for: ", this.$newsletterJid);
        }
        return C59022wD.A00;
    }
}
