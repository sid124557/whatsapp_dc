package X;

import android.os.Bundle;
import com.whatsapp.base.WaFragment;
import com.whatsapp.product.newsletterenforcements.newsletterguidelines.NewsletterGuidelinesFragment;

/* renamed from: X.2x8  reason: invalid class name and case insensitive filesystem */
public final class C59572x8 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final C165787xd A03;

    public final WaFragment A00() {
        C165787xd r6 = this.A03;
        boolean z = this.A00;
        boolean z2 = this.A01;
        boolean z3 = this.A02;
        NewsletterGuidelinesFragment newsletterGuidelinesFragment = new NewsletterGuidelinesFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putParcelable("newsletter-enforcement", r6);
        A08.putBoolean("show-what-this-means-section", z);
        A08.putBoolean("show-what-you-can-do-section", z2);
        A08.putBoolean("show-what-you-need-to-know-section", z3);
        newsletterGuidelinesFragment.A0u(A08);
        return newsletterGuidelinesFragment;
    }

    public C59572x8(C165787xd r1) {
        this.A03 = r1;
    }
}
