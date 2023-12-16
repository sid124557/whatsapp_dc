package X;

import com.whatsapp.R;
import com.whatsapp.newsletter.NewsletterInfoActivity;

/* renamed from: X.61v  reason: invalid class name and case insensitive filesystem */
public final class C1217761v extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1217761v(NewsletterInfoActivity newsletterInfoActivity) {
        super(1);
        this.this$0 = newsletterInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C104935Sx r6 = (C104935Sx) obj;
        NewsletterInfoActivity newsletterInfoActivity = this.this$0;
        C162457s7.A0H(r6);
        newsletterInfoActivity.BjL();
        int ordinal = r6.A03.ordinal();
        if (ordinal == 3 || ordinal == 2) {
            newsletterInfoActivity.A7Q();
        } else if (ordinal == 1 || ordinal == 0) {
            newsletterInfoActivity.A7c(false, false);
        }
        if (!r6.A05) {
            newsletterInfoActivity.Bot(r6.A00);
        } else {
            C19340zH A00 = AnonymousClass5V0.A00(newsletterInfoActivity);
            A00.A0U(r6.A01);
            A00.A0T(r6.A00);
            A00.A0d(newsletterInfoActivity, new C100385As(r6, 18, newsletterInfoActivity), R.string.f11nameremoved);
            A00.A0c(newsletterInfoActivity, new AnonymousClass5BX(3), R.string.f11nameremoved);
            C18280x3.A0q(A00);
        }
        return C59022wD.A00;
    }
}
