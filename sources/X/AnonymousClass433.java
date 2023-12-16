package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoActivity;

/* renamed from: X.433  reason: invalid class name */
public final class AnonymousClass433 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ NewsletterSuspensionInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass433(NewsletterSuspensionInfoActivity newsletterSuspensionInfoActivity) {
        super(1);
        this.this$0 = newsletterSuspensionInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass28H r7 = (AnonymousClass28H) obj;
        if (r7 instanceof AnonymousClass1kk) {
            NewsletterSuspensionInfoActivity newsletterSuspensionInfoActivity = this.this$0;
            ((AnonymousClass5UY) newsletterSuspensionInfoActivity.A05.getValue()).A06(C829045j.A01(newsletterSuspensionInfoActivity.A08));
            newsletterSuspensionInfoActivity.A74((C28511hE) null);
        } else if (r7 instanceof C29621ki) {
            NewsletterSuspensionInfoActivity newsletterSuspensionInfoActivity2 = this.this$0;
            C28511hE r4 = ((C29621ki) r7).A00;
            int A01 = C829045j.A01(newsletterSuspensionInfoActivity2.A08);
            switch (r4.A01.ordinal()) {
                case 0:
                case 6:
                    ((AnonymousClass5UY) newsletterSuspensionInfoActivity2.A05.getValue()).A06(A01);
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                    AnonymousClass66R r2 = newsletterSuspensionInfoActivity2.A05;
                    C829045j.A02(r2).setText(R.string.f11nameremoved);
                    C634339f.A00(C18310x6.A0J(r2), newsletterSuspensionInfoActivity2, r4, A01);
                    break;
                case 5:
                    AnonymousClass66R r22 = newsletterSuspensionInfoActivity2.A05;
                    C829045j.A02(r22).setText(R.string.f11nameremoved);
                    C633939b.A00(C18310x6.A0J(r22), newsletterSuspensionInfoActivity2, 25);
                    break;
            }
            newsletterSuspensionInfoActivity2.A74(r4);
        } else if (r7 instanceof C29631kj) {
            NewsletterSuspensionInfoActivity newsletterSuspensionInfoActivity3 = this.this$0;
            ((AnonymousClass5UY) newsletterSuspensionInfoActivity3.A08.getValue()).A06(0);
            ((View) newsletterSuspensionInfoActivity3.A0B.getValue()).setVisibility(C829045j.A01(newsletterSuspensionInfoActivity3.A05));
        }
        return C59022wD.A00;
    }
}
