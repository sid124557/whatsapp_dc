package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectorySearchQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectorySearchResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterDirectorySearchInput;

/* renamed from: X.6nH  reason: invalid class name and case insensitive filesystem */
public final class C136796nH extends C136746nC {
    public final int limit;
    public final String query;
    public final String startCursor;

    public C136796nH(C184498rv r3, String str, String str2, int i) {
        super(r3, "NewsletterDirectoryV2SearchJob", false);
        this.query = str;
        this.limit = i;
        this.startCursor = str2;
    }

    public void A07() {
        if (!this.isCancelled) {
            C49552gi r4 = this.A02;
            if (r4 != null) {
                XWA2NewsletterDirectorySearchInput xWA2NewsletterDirectorySearchInput = new XWA2NewsletterDirectorySearchInput();
                xWA2NewsletterDirectorySearchInput.A06("search_text", this.query);
                AnonymousClass6L0.A00(xWA2NewsletterDirectorySearchInput, this.limit);
                xWA2NewsletterDirectorySearchInput.A06("start_cursor", this.startCursor);
                C50712ie r3 = new NewsletterDirectorySearchQueryImpl$Builder().A00;
                r3.A00(xWA2NewsletterDirectorySearchInput, "input");
                r4.A01(new AnonymousClass7J9(r3, NewsletterDirectorySearchResponseImpl.class, "NewsletterDirectorySearch")).A01(new AnonymousClass8YP(this));
                return;
            }
            throw C18270x1.A0S("graphQlClient");
        }
    }
}
