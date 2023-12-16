package X;

import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.product.integrityappeals.NewsletterRequestReviewSelectReasonActivity;

/* renamed from: X.42x  reason: invalid class name and case insensitive filesystem */
public final class C822642x extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ NewsletterRequestReviewSelectReasonActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C822642x(NewsletterRequestReviewSelectReasonActivity newsletterRequestReviewSelectReasonActivity) {
        super(1);
        this.this$0 = newsletterRequestReviewSelectReasonActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Intent A07;
        AnonymousClass21L r6 = (AnonymousClass21L) obj;
        if (r6 != null) {
            int ordinal = r6.ordinal();
            if (ordinal == 3 || ordinal == 4 || ordinal == 0) {
                this.this$0.A05.A0D();
                C69263Wi r2 = this.this$0.A05;
                int i = R.string.f11nameremoved;
                if (ordinal != 3) {
                    i = R.string.f11nameremoved;
                    if (ordinal != 4) {
                        i = 0;
                        if (ordinal == 0) {
                            i = R.string.f11nameremoved;
                        }
                    }
                }
                r2.A0H(i, 0);
                NewsletterRequestReviewSelectReasonActivity newsletterRequestReviewSelectReasonActivity = this.this$0;
                AnonymousClass38S r22 = (AnonymousClass38S) newsletterRequestReviewSelectReasonActivity.A01.getValue();
                if (r22 instanceof AnonymousClass1hI) {
                    A07 = C627736r.A0d(newsletterRequestReviewSelectReasonActivity, r22.A00(), ((AnonymousClass1hI) r22).A01);
                } else if (r22 instanceof AnonymousClass1hJ) {
                    C95804uY A00 = r22.A00();
                    A07 = C18320x8.A07();
                    C627336j.A0E(A07, A00, newsletterRequestReviewSelectReasonActivity.getPackageName(), "com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesActivity");
                    A07.addFlags(603979776);
                } else if (r22 instanceof C28541hH) {
                    C95804uY A002 = r22.A00();
                    A07 = C18320x8.A07();
                    C627336j.A0E(A07, A002, newsletterRequestReviewSelectReasonActivity.getPackageName(), "com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoActivity");
                    A07.addFlags(603979776);
                } else {
                    throw C73153f1.A00();
                }
                newsletterRequestReviewSelectReasonActivity.startActivity(A07);
                newsletterRequestReviewSelectReasonActivity.finish();
            } else if (ordinal == 2) {
                this.this$0.A05.A0G(0, R.string.f11nameremoved);
            }
        }
        return C59022wD.A00;
    }
}
