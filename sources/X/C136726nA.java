package X;

import android.content.Context;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminInviteMutationImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminInviteResponseImpl;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.6nA  reason: invalid class name and case insensitive filesystem */
public final class C136726nA extends AnonymousClass47C {
    public transient C49552gi A00;
    public transient C162047r8 A01;
    public AnonymousClass642 callback;
    public final C95804uY newsletterJid;
    public final UserJid userId;

    public void Bm4(Context context) {
        C162457s7.A0J(context, 0);
        C64333Db A012 = C389229y.A01(context);
        this.A00 = A012.Anh();
        this.A01 = A012.AoV();
    }

    public C136726nA(C95804uY r2, UserJid userJid, AnonymousClass642 r4) {
        super("GetNewsletterMetadataJob");
        this.newsletterJid = r2;
        this.userId = userJid;
        this.callback = r4;
    }

    public void A04() {
        Log.i("NewsletterAdminInviteGraphqlJob/onAdded");
        C49552gi r0 = this.A00;
        if (r0 == null) {
            throw C18270x1.A0S("graphqlClient");
        } else if (!r0.A03.A0I()) {
            AnonymousClass642 r1 = this.callback;
            if (r1 != null) {
                new C136766nE();
                C115035o0 r12 = (C115035o0) r1;
                r12.A01.invoke(new C96854x6(r12.A00));
            }
            cancel();
        }
    }

    public void A05() {
        Log.i("NewsletterAdminInviteGraphqlJob/onCanceled");
        this.callback = null;
    }

    public boolean A06(Exception exc) {
        return false;
    }

    public void A07() {
        if (!this.isCancelled) {
            Log.i("NewsletterAdminInviteGraphqlJob/onRun");
            NewsletterAdminInviteMutationImpl$Builder newsletterAdminInviteMutationImpl$Builder = new NewsletterAdminInviteMutationImpl$Builder();
            String rawString = this.newsletterJid.getRawString();
            C50712ie r3 = newsletterAdminInviteMutationImpl$Builder.A00;
            r3.A02("newsletter_id", rawString);
            newsletterAdminInviteMutationImpl$Builder.A01 = AnonymousClass000.A1W(rawString);
            C162047r8 r1 = this.A01;
            if (r1 == null) {
                throw C18270x1.A0S("newsletterGraphqlUtils");
            }
            String rawString2 = C162457s7.A01(this.userId, r1).getRawString();
            r3.A02("user_id", rawString2);
            newsletterAdminInviteMutationImpl$Builder.A02 = AnonymousClass000.A1W(rawString2);
            C162187rP.A06(newsletterAdminInviteMutationImpl$Builder.A01);
            C162187rP.A06(newsletterAdminInviteMutationImpl$Builder.A02);
            AnonymousClass7J9 r12 = new AnonymousClass7J9(r3, NewsletterAdminInviteResponseImpl.class, "NewsletterAdminInvite");
            C49552gi r0 = this.A00;
            if (r0 == null) {
                throw C18270x1.A0S("graphqlClient");
            }
            r0.A01(r12).A01(new AnonymousClass8YM(this));
        }
    }

    public void cancel() {
        super.cancel();
        this.callback = null;
    }
}
