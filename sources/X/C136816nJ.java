package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryListQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryListResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterDirectoryFilterInput;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterDirectoryListInput;
import java.util.List;
import java.util.Map;

/* renamed from: X.6nJ  reason: invalid class name and case insensitive filesystem */
public final class C136816nJ extends C136746nC {
    public C45362Zt cache;
    public final String countryCode;
    public final int limit;
    public final C184498rv originalCallback;
    public final String startCursor;
    public final AnonymousClass59A type;

    public C136816nJ(C45362Zt r8, AnonymousClass59A r9, C184498rv r10, String str, String str2, int i, boolean z) {
        super(new C171578Hp(r8, r9, r10, str, str2), "NewsletterDirectoryV2ListJob", z);
        this.type = r9;
        this.countryCode = str;
        this.limit = i;
        this.startCursor = str2;
        this.cache = r8;
        this.originalCallback = r10;
    }

    public void A07() {
        List list;
        C45362Zt r4;
        AnonymousClass3Z6 r0;
        if (!this.isCancelled) {
            if (this.startCursor == null && (r4 = this.cache) != null) {
                String str = this.type.value;
                String str2 = this.countryCode;
                C162457s7.A0J(str, 0);
                r4.A00();
                if (str2 == null) {
                    str2 = "global";
                }
                String A0e = AnonymousClass0x2.A0e(str2, AnonymousClass000.A0l(str), '_');
                Map map = r4.A02;
                synchronized (map) {
                    C52592lj r02 = (C52592lj) map.get(A0e);
                    if (r02 != null) {
                        r0 = AnonymousClass3Z6.A02(r02.A02, r02.A01);
                    } else {
                        r0 = null;
                    }
                }
                if (r0 != null) {
                    this.originalCallback.BiS((String) r0.second, (List) r0.first);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("NewsletterDirectoryV2ListJob results served from cache | type: ");
                    A0o.append(this.type);
                    A0o.append(" country: ");
                    C18260x0.A1J(A0o, this.countryCode);
                    return;
                }
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("NewsletterDirectoryV2ListJob results will be retrieved from network | type: ");
            A0o2.append(this.type);
            A0o2.append(" country: ");
            C18260x0.A1J(A0o2, this.countryCode);
            C49552gi r42 = this.A02;
            if (r42 != null) {
                XWA2NewsletterDirectoryFilterInput xWA2NewsletterDirectoryFilterInput = new XWA2NewsletterDirectoryFilterInput();
                String str3 = this.countryCode;
                if (str3 != null) {
                    list = AnonymousClass8UF.A0p(C18270x1.A1b(str3));
                } else {
                    list = null;
                }
                xWA2NewsletterDirectoryFilterInput.A07("country_codes", list);
                XWA2NewsletterDirectoryListInput xWA2NewsletterDirectoryListInput = new XWA2NewsletterDirectoryListInput();
                xWA2NewsletterDirectoryListInput.A06("view", this.type.value);
                AnonymousClass6L0.A00(xWA2NewsletterDirectoryListInput, this.limit);
                xWA2NewsletterDirectoryListInput.A06("start_cursor", this.startCursor);
                xWA2NewsletterDirectoryListInput.A05(xWA2NewsletterDirectoryFilterInput, "filters");
                C50712ie r3 = new NewsletterDirectoryListQueryImpl$Builder().A00;
                r3.A00(xWA2NewsletterDirectoryListInput, "input");
                r42.A01(new AnonymousClass7J9(r3, NewsletterDirectoryListResponseImpl.class, "NewsletterDirectoryList")).A01(new AnonymousClass8YO(this));
                return;
            }
            throw C18270x1.A0S("graphQlClient");
        }
    }

    public void cancel() {
        super.cancel();
        this.callback = null;
    }
}
