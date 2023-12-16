package X;

import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.wds.components.banners.WDSBannerCompact;

/* renamed from: X.4mE  reason: invalid class name and case insensitive filesystem */
public final class C92184mE extends C117035rH {
    public int A00;
    public View A01;
    public C27991fJ A02;
    public final ViewGroup A03;
    public final C64653Ej A04;
    public final C64773Ex A05;
    public final AnonymousClass4FS A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92184mE(ViewGroup viewGroup, C64653Ej r3, C64773Ex r4, AnonymousClass67A r5, C27991fJ r6, AnonymousClass4FS r7) {
        super(r5, 31);
        C162457s7.A0J(r5, 1);
        C18260x0.A0b(viewGroup, r4, r3, 3);
        C162457s7.A0J(r7, 6);
        this.A02 = r6;
        this.A03 = viewGroup;
        this.A05 = r4;
        this.A04 = r3;
        this.A06 = r7;
    }

    public final void A08() {
        View view = this.A01;
        if (view != null) {
            AnonymousClass614 r3 = new AnonymousClass614(this);
            AnonymousClass615 r5 = new AnonymousClass615(this);
            if (view instanceof WDSBannerCompact) {
                WDSBannerCompact wDSBannerCompact = (WDSBannerCompact) view;
                C89644eZ activity = this.A01.getActivity();
                C162457s7.A0D(activity);
                int i = this.A00;
                Object[] A0M = AnonymousClass002.A0M();
                A0M[0] = C107575bX.A04(activity, R.color.f5nameremoved);
                AnonymousClass000.A1P(A0M, i, 1);
                Spanned A012 = C107575bX.A01(activity, A0M, R.plurals.f9nameremoved, i);
                C162457s7.A0D(A012);
                wDSBannerCompact.setText((CharSequence) A012);
                C18310x6.A17(view, r3, 49);
                wDSBannerCompact.setOnDismissListener((View.OnClickListener) new C109345eT(r5, 0));
                return;
            }
            AnonymousClass67A r0 = this.A01;
            C89644eZ activity2 = r0.getActivity();
            int i2 = this.A00;
            Object[] A0M2 = AnonymousClass002.A0M();
            A0M2[0] = C107575bX.A04(r0.getActivity(), AnonymousClass5Yj.A02(r0.getActivity(), R.attr.f3nameremoved, R.color.f5nameremoved));
            A0M2[1] = Integer.valueOf(this.A00);
            Spanned A013 = C107575bX.A01(activity2, A0M2, R.plurals.f9nameremoved, i2);
            C162457s7.A0D(A013);
            TextView A09 = AnonymousClass002.A09(view, R.id.pending_suggestions_text);
            if (A09 != null) {
                A09.setText(A013);
            }
            C109345eT.A00(view.findViewById(R.id.pending_suggestions_dismiss), r5, 1);
            C109345eT.A00(view, r3, 2);
        }
    }
}
