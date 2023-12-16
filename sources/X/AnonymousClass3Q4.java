package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl;

/* renamed from: X.3Q4  reason: invalid class name */
public final class AnonymousClass3Q4 implements NewsletterMetadataFields {
    public final NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin A00;

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.State BDI() {
        NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.State state = (NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.State) this.A00.A00(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.State.class, "state");
        if (state != null) {
            return new AnonymousClass3Q1(state);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata BDd() {
        NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata threadMetadata = (NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata) this.A00.A00(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.class, "thread_metadata");
        if (threadMetadata != null) {
            return new AnonymousClass8HH(threadMetadata);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ViewerMetadata BEO() {
        NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ViewerMetadata viewerMetadata = (NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ViewerMetadata) this.A00.A00(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ViewerMetadata.class, "viewer_metadata");
        if (viewerMetadata != null) {
            return new AnonymousClass3Q3(viewerMetadata);
        }
        return null;
    }

    public AnonymousClass3Q4(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin xwa2NotifyNewsletterOnJoin) {
        this.A00 = xwa2NotifyNewsletterOnJoin;
    }
}
