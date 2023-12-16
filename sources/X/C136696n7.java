package X;

import android.content.Context;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterAcceptAdminInviteMutationImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterAcceptAdminInviteResponseImpl;
import com.whatsapp.util.Log;

/* renamed from: X.6n7  reason: invalid class name and case insensitive filesystem */
public final class C136696n7 extends AnonymousClass47C {
    public transient C49552gi A00;
    public transient C162047r8 A01;
    public AnonymousClass4DF callback;
    public final C95804uY newsletterJid;

    public void Bm4(Context context) {
        C162457s7.A0J(context, 0);
        C64333Db A012 = C389229y.A01(context);
        this.A00 = A012.Anh();
        this.A01 = A012.AoV();
    }

    public C136696n7(C95804uY r2, AnonymousClass4DF r3) {
        super("GetNewsletterMetadataJob");
        this.newsletterJid = r2;
        this.callback = r3;
    }

    public void A04() {
        Log.i("NewsletterAcceptAdminInviteGraphqlJob/onAdded");
        C49552gi r0 = this.A00;
        if (r0 == null) {
            throw C18270x1.A0S("graphqlClient");
        } else if (!r0.A03.A0I()) {
            AnonymousClass4DF r1 = this.callback;
            if (r1 != null) {
                r1.onError(new C136766nE());
            }
            cancel();
        }
    }

    public void A05() {
        Log.i("NewsletterAcceptAdminInviteGraphqlJob/onCanceled");
        this.callback = null;
    }

    public boolean A06(Exception exc) {
        return false;
    }

    public void A07() {
        if (!this.isCancelled) {
            Log.i("NewsletterAcceptAdminInviteGraphqlJob/onRun");
            NewsletterAcceptAdminInviteMutationImpl$Builder newsletterAcceptAdminInviteMutationImpl$Builder = new NewsletterAcceptAdminInviteMutationImpl$Builder();
            String rawString = this.newsletterJid.getRawString();
            C50712ie r3 = newsletterAcceptAdminInviteMutationImpl$Builder.A00;
            r3.A02("newsletter_id", rawString);
            C162187rP.A06(AnonymousClass000.A1W(rawString));
            AnonymousClass7J9 r1 = new AnonymousClass7J9(r3, NewsletterAcceptAdminInviteResponseImpl.class, "NewsletterAcceptAdminInvite");
            C49552gi r0 = this.A00;
            if (r0 == null) {
                throw C18270x1.A0S("graphqlClient");
            }
            r0.A01(r1).A01(new AnonymousClass8YK(this));
        }
    }

    public void cancel() {
        super.cancel();
        this.callback = null;
    }
}
