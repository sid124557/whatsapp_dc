package X;

import android.content.Intent;
import com.whatsapp.chatinfo.view.custom.CreatorPrivacyNewsletterBottomSheet;
import java.util.Map;

/* renamed from: X.5qD  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C116395qD implements C183268pl {
    public final /* synthetic */ CreatorPrivacyNewsletterBottomSheet A00;

    public final void BV6(String str, Map map) {
        CreatorPrivacyNewsletterBottomSheet creatorPrivacyNewsletterBottomSheet = this.A00;
        C162457s7.A0J(map, 2);
        Intent A08 = C18300x5.A08(C18310x6.A0o("link", map));
        C111095hX r1 = creatorPrivacyNewsletterBottomSheet.A00;
        if (r1 != null) {
            r1.A0A(creatorPrivacyNewsletterBottomSheet.A0R(), A08);
            return;
        }
        throw C18270x1.A0S("activityUtils");
    }

    public /* synthetic */ C116395qD(CreatorPrivacyNewsletterBottomSheet creatorPrivacyNewsletterBottomSheet) {
        this.A00 = creatorPrivacyNewsletterBottomSheet;
    }
}
