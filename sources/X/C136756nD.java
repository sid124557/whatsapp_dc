package X;

import android.content.Context;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterRecommendedQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterRecommendedResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterSearchQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterSearchResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterFiltersInput;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterRecommendedInput;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterSearchInput;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterSortInput;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.6nD  reason: invalid class name and case insensitive filesystem */
public final class C136756nD extends AnonymousClass47C {
    public transient C49552gi A00;
    public transient C49122g1 A01;
    public transient C162047r8 A02;
    public AnonymousClass4DH callback;
    public final boolean filterOutSubscribedChannels;
    public final boolean isRecommended;
    public final int limit;
    public final String query;
    public final String sortField;
    public final String sortOrder;

    public void Bm4(Context context) {
        C162457s7.A0J(context, 0);
        C64333Db A012 = C389229y.A01(context);
        this.A00 = A012.Anh();
        this.A02 = A012.AoV();
        this.A01 = (C49122g1) A012.ANg.get();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136756nD(AnonymousClass4DH r3, String str, String str2, int i, boolean z, boolean z2) {
        super("GetNewsletterMetadataJob");
        C162457s7.A0J(str2, 2);
        this.query = str;
        this.sortField = str2;
        this.sortOrder = "DESCENDING";
        this.limit = i;
        this.isRecommended = z;
        this.callback = r3;
        this.filterOutSubscribedChannels = z2;
    }

    public static void A00(C50712ie r3) {
        Boolean bool = Boolean.TRUE;
        r3.A01("fetch_state", bool);
        r3.A01("fetch_creation_time", bool);
        r3.A01("fetch_name", bool);
        Boolean bool2 = Boolean.FALSE;
        r3.A01("fetch_image", bool2);
        r3.A01("fetch_preview", bool);
        r3.A01("fetch_description", bool);
        r3.A01("fetch_invite", bool);
        r3.A01("fetch_handle", bool);
        r3.A01("fetch_subscribers_count", bool);
        r3.A01("fetch_verification", bool);
        r3.A01("fetch_viewer_metadata", bool2);
    }

    public void A04() {
        Log.i("GetDirectoryNewslettersJob/onAdded");
        C49552gi r0 = this.A00;
        if (r0 == null) {
            throw C18270x1.A0S("graphQlClient");
        } else if (!r0.A03.A0I()) {
            AnonymousClass4DH r1 = this.callback;
            if (r1 != null) {
                r1.BS5(new C136766nE());
            }
            this.callback = null;
        }
    }

    public void A05() {
        if (!this.isCancelled) {
            Log.i("GetDirectoryNewslettersJob/onCanceled");
        }
    }

    public boolean A06(Exception exc) {
        return false;
    }

    public void A07() {
        C48662fG r1;
        AnonymousClass4GQ r0;
        if (!this.isCancelled) {
            Log.i("GetDirectoryNewslettersJob/onRun");
            boolean z = this.isRecommended;
            C49552gi r4 = this.A00;
            if (z) {
                if (r4 == null) {
                    throw C18270x1.A0S("graphQlClient");
                }
                C49122g1 r02 = this.A01;
                if (r02 == null) {
                    throw C18270x1.A0S("newsletterDirectoryUtil");
                }
                List A12 = C18290x4.A12(r02.A00());
                XWA2NewsletterRecommendedInput xWA2NewsletterRecommendedInput = new XWA2NewsletterRecommendedInput();
                xWA2NewsletterRecommendedInput.A07("country_codes", A12);
                AnonymousClass6L0.A00(xWA2NewsletterRecommendedInput, this.limit);
                NewsletterRecommendedQueryImpl$Builder newsletterRecommendedQueryImpl$Builder = new NewsletterRecommendedQueryImpl$Builder();
                C50712ie r3 = newsletterRecommendedQueryImpl$Builder.A00;
                r3.A00(xWA2NewsletterRecommendedInput, "input");
                newsletterRecommendedQueryImpl$Builder.A01 = true;
                A00(r3);
                C162187rP.A06(newsletterRecommendedQueryImpl$Builder.A01);
                r1 = r4.A01(new AnonymousClass7J9(r3, NewsletterRecommendedResponseImpl.class, "NewsletterRecommended"));
                r0 = new AnonymousClass8YI(this);
            } else if (r4 == null) {
                throw C18270x1.A0S("graphQlClient");
            } else {
                XWA2NewsletterSortInput xWA2NewsletterSortInput = new XWA2NewsletterSortInput();
                xWA2NewsletterSortInput.A06("field", this.sortField);
                xWA2NewsletterSortInput.A06("order", this.sortOrder);
                C49122g1 r03 = this.A01;
                if (r03 == null) {
                    throw C18270x1.A0S("newsletterDirectoryUtil");
                }
                List A122 = C18290x4.A12(r03.A00());
                XWA2NewsletterFiltersInput xWA2NewsletterFiltersInput = new XWA2NewsletterFiltersInput();
                xWA2NewsletterFiltersInput.A07("country_codes", A122);
                xWA2NewsletterFiltersInput.A06("search_text", this.query);
                XWA2NewsletterSearchInput xWA2NewsletterSearchInput = new XWA2NewsletterSearchInput();
                AnonymousClass6L0.A00(xWA2NewsletterSearchInput, this.limit);
                xWA2NewsletterSearchInput.A05(xWA2NewsletterFiltersInput, "filters");
                xWA2NewsletterSearchInput.A05(xWA2NewsletterSortInput, "sorted_by");
                NewsletterSearchQueryImpl$Builder newsletterSearchQueryImpl$Builder = new NewsletterSearchQueryImpl$Builder();
                C50712ie r32 = newsletterSearchQueryImpl$Builder.A00;
                r32.A00(xWA2NewsletterSearchInput, "input");
                newsletterSearchQueryImpl$Builder.A01 = true;
                A00(r32);
                C162187rP.A06(newsletterSearchQueryImpl$Builder.A01);
                r1 = r4.A01(new AnonymousClass7J9(r32, NewsletterSearchResponseImpl.class, "NewsletterSearch"));
                r0 = new AnonymousClass8YJ(this);
            }
            r1.A01(r0);
        }
    }

    public void cancel() {
        super.cancel();
        this.callback = null;
    }

    public C136756nD() {
        this((AnonymousClass4DH) null, (String) null, "SUBSCRIBER_COUNT", 500, false, false);
    }
}
