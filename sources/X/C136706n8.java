package X;

import android.content.Context;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterDeleteMutationImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterDeleteResponseImpl;
import com.whatsapp.util.Log;

/* renamed from: X.6n8  reason: invalid class name and case insensitive filesystem */
public final class C136706n8 extends AnonymousClass47C {
    public transient C49552gi A00;
    public transient C56842se A01;
    public transient C162047r8 A02;
    public AnonymousClass4DF callback;
    public final C95804uY newsletterJid;

    public void A05() {
        this.callback = null;
        Log.i("DeleteNewsletterGraphqlJob/onCanceled");
    }

    public void Bm4(Context context) {
        C162457s7.A0J(context, 0);
        C64333Db A012 = C389229y.A01(context);
        this.A00 = A012.Anh();
        this.A01 = (C56842se) A012.ANr.get();
        this.A02 = A012.AoV();
    }

    public C136706n8(C95804uY r2, AnonymousClass4DF r3) {
        super("GetNewsletterMetadataJob");
        this.newsletterJid = r2;
        this.callback = r3;
    }

    public void A04() {
        AnonymousClass4DF r1;
        Log.i("DeleteNewsletterGraphqlJob/onAdded");
        C49552gi r0 = this.A00;
        if (r0 == null) {
            throw C18270x1.A0S("graphqlClient");
        } else if (!r0.A03.A0I() && (r1 = this.callback) != null) {
            r1.onError(new C136766nE());
        }
    }

    public boolean A06(Exception exc) {
        return false;
    }

    public void A07() {
        if (!this.isCancelled) {
            Log.i("DeleteNewsletterGraphqlJob/onRun");
            NewsletterDeleteMutationImpl$Builder newsletterDeleteMutationImpl$Builder = new NewsletterDeleteMutationImpl$Builder();
            String rawString = this.newsletterJid.getRawString();
            C50712ie r3 = newsletterDeleteMutationImpl$Builder.A00;
            r3.A02("newsletter_id", rawString);
            C162187rP.A06(AnonymousClass000.A1W(rawString));
            AnonymousClass7J9 r1 = new AnonymousClass7J9(r3, NewsletterDeleteResponseImpl.class, "NewsletterDelete");
            C49552gi r0 = this.A00;
            if (r0 == null) {
                throw C18270x1.A0S("graphqlClient");
            }
            r0.A01(r1).A01(new AnonymousClass8YH(this));
        }
    }

    public void cancel() {
        super.cancel();
        this.callback = null;
    }
}
