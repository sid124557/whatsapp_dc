package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.banners.WDSBannerCompact;

/* renamed from: X.4mI  reason: invalid class name and case insensitive filesystem */
public class C92224mI extends C117035rH {
    public View A00;
    public AnonymousClass3ZH A01;
    public UserJid A02;
    public UserJid A03;
    public final ViewGroup A04;
    public final C56972sr A05;
    public final C64773Ex A06;
    public final AnonymousClass5ZU A07;
    public final C49792h6 A08;
    public final UserJid A09;
    public final AnonymousClass4FS A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C92224mI(ViewGroup viewGroup, C56972sr r3, C64773Ex r4, AnonymousClass5ZU r5, AnonymousClass67A r6, C49792h6 r7, AnonymousClass3ZH r8, UserJid userJid, AnonymousClass4FS r10, boolean z, boolean z2) {
        super(r6, 15);
        this.A05 = r3;
        this.A0A = r10;
        this.A06 = r4;
        this.A07 = r5;
        this.A08 = r7;
        this.A09 = userJid;
        this.A04 = viewGroup;
        this.A0B = z;
        this.A0C = z2;
        this.A01 = r8;
    }

    public final void A08() {
        int i;
        boolean A0Y = this.A05.A0Y();
        boolean equals = this.A09.equals(this.A03);
        if (!A0Y) {
            i = R.string.f11nameremoved;
            if (equals) {
                i = R.string.f11nameremoved;
            }
        } else {
            i = R.string.f11nameremoved;
            if (equals) {
                i = R.string.f11nameremoved;
            }
        }
        String A0H = this.A07.A0H(C64773Ex.A00(this.A06, this.A03));
        String A0m = C86604Kt.A0m(this.A01.getActivity(), A0H, i);
        C109455ee r3 = new C109455ee(6, A0H, this);
        C109335eS r2 = new C109335eS(this, 41);
        View view = this.A00;
        if (view instanceof WDSBannerCompact) {
            WDSBannerCompact wDSBannerCompact = (WDSBannerCompact) view;
            wDSBannerCompact.setText((CharSequence) A0m);
            wDSBannerCompact.setOnClickListener(r3);
            wDSBannerCompact.setOnDismissListener((View.OnClickListener) r2);
            return;
        }
        C626936e.A04(view);
        C86624Kv.A17(view, A0m, R.id.change_number_text);
        this.A00.setOnClickListener(r3);
        this.A00.findViewById(R.id.change_number_dismiss).setOnClickListener(r2);
    }
}
