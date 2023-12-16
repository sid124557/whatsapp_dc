package X;

import android.view.ViewGroup;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.whatsapp.R;
import com.whatsapp.WaViewPager;
import com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet;
import java.util.List;

/* renamed from: X.62A  reason: invalid class name */
public final class AnonymousClass62A extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ NewsletterReactionsSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass62A(NewsletterReactionsSheet newsletterReactionsSheet) {
        super(1);
        this.this$0 = newsletterReactionsSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass4ZS r2;
        int i;
        ViewGroup.LayoutParams layoutParams;
        AnonymousClass7YM r7 = (AnonymousClass7YM) obj;
        NewsletterReactionsSheet newsletterReactionsSheet = this.this$0;
        C162457s7.A0H(r7);
        MaterialButtonToggleGroup materialButtonToggleGroup = newsletterReactionsSheet.A02;
        if (materialButtonToggleGroup != null) {
            List list = r7.A01;
            int i2 = 0;
            if (list.size() <= 1) {
                i2 = 8;
            }
            materialButtonToggleGroup.setVisibility(i2);
            if (materialButtonToggleGroup.getWidth() > 0 && (layoutParams = materialButtonToggleGroup.getLayoutParams()) != null) {
                layoutParams.width = materialButtonToggleGroup.getWidth();
            }
            int ordinal = ((C142386x7) list.get(r7.A00)).ordinal();
            if (ordinal == 0) {
                i = R.id.reactions_button_all;
            } else if (ordinal == 1) {
                i = R.id.reactions_button_contacts;
            }
            materialButtonToggleGroup.A02(i, true);
        }
        NewsletterReactionsSheet newsletterReactionsSheet2 = this.this$0;
        WaViewPager waViewPager = newsletterReactionsSheet2.A05;
        if (waViewPager != null) {
            AnonymousClass0R4 realAdapter = waViewPager.getRealAdapter();
            if (!(realAdapter instanceof AnonymousClass4ZS) || (r2 = (AnonymousClass4ZS) realAdapter) == null) {
                r2 = new AnonymousClass4ZS(newsletterReactionsSheet2);
                waViewPager.setAdapter(r2);
            }
            List list2 = r7.A01;
            if (!C162457s7.A0P(r2.A00, list2)) {
                r2.A00 = list2;
                r2.A05();
            }
            waViewPager.setCurrentLogicalItem(r7.A00);
        }
        return C59022wD.A00;
    }
}
