package X;

import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.wds.components.banners.WDSBannerCompact;

/* renamed from: X.4mH  reason: invalid class name and case insensitive filesystem */
public class C92214mH extends C117035rH {
    public int A00 = 0;
    public View A01;
    public C27991fJ A02;
    public boolean A03 = false;
    public final ViewGroup A04;
    public final C111095hX A05;
    public final C64773Ex A06;
    public final AnonymousClass4FS A07;
    public final boolean A08;

    public C92214mH(ViewGroup viewGroup, C111095hX r3, C64773Ex r4, AnonymousClass67A r5, AnonymousClass3ZH r6, AnonymousClass4FS r7, boolean z) {
        super(r5, 30);
        this.A04 = viewGroup;
        this.A07 = r7;
        this.A05 = r3;
        this.A06 = r4;
        if (r6.A0U()) {
            this.A02 = (C27991fJ) AnonymousClass3ZH.A04(r6);
            this.A03 = r6.A0v;
        }
        this.A08 = z;
    }

    public final void A08() {
        View view = this.A01;
        if (view != null) {
            C109335eS r6 = new C109335eS(this, 47);
            C109335eS r5 = new C109335eS(this, 48);
            if (view instanceof WDSBannerCompact) {
                WDSBannerCompact wDSBannerCompact = (WDSBannerCompact) view;
                C89644eZ activity = this.A01.getActivity();
                int i = this.A00;
                C162457s7.A0J(activity, 0);
                Object[] A0M = AnonymousClass002.A0M();
                A0M[0] = C107575bX.A04(activity, R.color.f5nameremoved);
                AnonymousClass000.A1P(A0M, i, 1);
                Spanned A012 = C107575bX.A01(activity, A0M, R.plurals.f9nameremoved, i);
                C162457s7.A0D(A012);
                wDSBannerCompact.setText((CharSequence) A012);
                wDSBannerCompact.setOnDismissListener((View.OnClickListener) r6);
                wDSBannerCompact.setOnClickListener(r5);
                return;
            }
            TextView A0G = C18300x5.A0G(view, R.id.pending_requests_text);
            AnonymousClass67A r0 = this.A01;
            C89644eZ activity2 = r0.getActivity();
            int i2 = this.A00;
            Object[] A0M2 = AnonymousClass002.A0M();
            A0M2[0] = C107575bX.A04(r0.getActivity(), AnonymousClass5Yj.A02(r0.getActivity(), R.attr.f3nameremoved, R.color.f5nameremoved));
            AnonymousClass000.A1M(A0M2, this.A00);
            A0G.setText(C107575bX.A01(activity2, A0M2, R.plurals.f9nameremoved, i2));
            C06560Yg.A02(this.A01, R.id.pending_participants_dismiss).setOnClickListener(r6);
            this.A01.setOnClickListener(r5);
        }
    }
}
