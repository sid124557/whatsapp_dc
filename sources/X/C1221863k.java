package X;

import android.os.Bundle;
import com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet;
import java.lang.ref.WeakReference;

/* renamed from: X.63k  reason: invalid class name and case insensitive filesystem */
public final class C1221863k extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ WeakReference $activityWeakReference;
    public final /* synthetic */ long $expirationTimestamp;
    public final /* synthetic */ C95804uY $newsletterJid;
    public final /* synthetic */ String $newsletterName;
    public final /* synthetic */ C92814nJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1221863k(C92814nJ r2, C95804uY r3, String str, WeakReference weakReference, long j) {
        super(1);
        this.this$0 = r2;
        this.$newsletterJid = r3;
        this.$newsletterName = str;
        this.$expirationTimestamp = j;
        this.$activityWeakReference = weakReference;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A1Z = AnonymousClass001.A1Z(obj);
        ((C48062eH) this.this$0.A2B.get()).A02(AnonymousClass3LH.class);
        C95804uY r6 = this.$newsletterJid;
        String str = this.$newsletterName;
        long j = this.$expirationTimestamp;
        C18260x0.A0O(r6, str);
        NewsletterAcceptAdminInviteSheet newsletterAcceptAdminInviteSheet = new NewsletterAcceptAdminInviteSheet();
        Bundle A08 = AnonymousClass002.A08();
        AnonymousClass0x2.A0v(A08, r6, "newsletter_jid");
        A08.putString("newsletter_name", str);
        A08.putLong("invite_expiration_ts", j);
        A08.putBoolean("from_tos_accepted", A1Z);
        newsletterAcceptAdminInviteSheet.A0u(A08);
        C003203q r0 = (C003203q) this.$activityWeakReference.get();
        if (r0 != null) {
            C86644Kx.A1C(newsletterAcceptAdminInviteSheet, r0);
        }
        return C59022wD.A00;
    }
}
