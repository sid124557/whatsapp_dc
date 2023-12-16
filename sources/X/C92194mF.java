package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.product.newsletterenforcements.NewsletterAlertsLauncherBridgeImpl;

/* renamed from: X.4mF  reason: invalid class name and case insensitive filesystem */
public final class C92194mF extends C117035rH {
    public View A00;
    public final ViewGroup A01;
    public final C56982ss A02;
    public final C56652sL A03;
    public final AnonymousClass3ZH A04;
    public final C42462Oe A05;
    public final NewsletterAlertsLauncherBridgeImpl A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92194mF(ViewGroup viewGroup, AnonymousClass67A r4, C56982ss r5, C56652sL r6, AnonymousClass3ZH r7, C42462Oe r8, NewsletterAlertsLauncherBridgeImpl newsletterAlertsLauncherBridgeImpl) {
        super(r4, 80);
        C18260x0.A0e(r4, r7, viewGroup, r5);
        C162457s7.A0J(r6, 6);
        C162457s7.A0J(r8, 8);
        this.A04 = r7;
        this.A01 = viewGroup;
        this.A02 = r5;
        this.A03 = r6;
        this.A06 = newsletterAlertsLauncherBridgeImpl;
        this.A05 = r8;
    }

    public final void A08() {
        View findViewById;
        TextView A09;
        View view = this.A00;
        if (!(view == null || (A09 = AnonymousClass002.A09(view, R.id.pending_messages_text)) == null)) {
            A09.setText(R.string.f11nameremoved);
        }
        View view2 = this.A00;
        if (!(view2 == null || (findViewById = view2.findViewById(R.id.pending_messages_dismiss)) == null)) {
            C109345eT.A00(findViewById, this, 6);
        }
        View view3 = this.A00;
        if (view3 != null) {
            C109345eT.A00(view3, this, 7);
        }
    }
}
