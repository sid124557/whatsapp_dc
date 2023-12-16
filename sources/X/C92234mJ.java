package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.pininchat.banner.PinInChatBannerMultiplePinsIndicator;
import com.whatsapp.pininchat.banner.PinInChatBannerViewModel;

/* renamed from: X.4mJ  reason: invalid class name and case insensitive filesystem */
public class C92234mJ extends C117035rH {
    public View A00;
    public PinInChatBannerMultiplePinsIndicator A01;
    public final ViewGroup A02;
    public final AnonymousClass36E A03;
    public final C22751Py A04;
    public final AnonymousClass36Y A05;
    public final AnonymousClass1VX A06;
    public final PinInChatBannerViewModel A07;
    public final AnonymousClass5W5 A08;
    public final C49902hH A09;
    public final C48192eV A0A;
    public final C50222hp A0B;
    public final C45042Yl A0C;

    public C92234mJ(ViewGroup viewGroup, AnonymousClass36E r6, AnonymousClass67A r7, C22751Py r8, AnonymousClass36Y r9, AnonymousClass1VX r10, PinInChatBannerViewModel pinInChatBannerViewModel, AnonymousClass5W5 r12, C49902hH r13, C48192eV r14, C50222hp r15, C45042Yl r16) {
        super(r7, 50);
        this.A02 = viewGroup;
        this.A06 = r10;
        this.A05 = r9;
        this.A09 = r13;
        this.A0A = r14;
        this.A04 = r8;
        this.A08 = r12;
        this.A03 = r6;
        this.A0B = r15;
        this.A0C = r16;
        this.A07 = pinInChatBannerViewModel;
        AnonymousClass08M r2 = pinInChatBannerViewModel.A01;
        AnonymousClass67A r3 = this.A01;
        AnonymousClass6C6.A02(r3.getActivity(), r2, this, 178);
        AnonymousClass6C6.A02(r3.getActivity(), pinInChatBannerViewModel.A05, this, 179);
        AnonymousClass4UC r22 = pinInChatBannerViewModel.A06;
        if (r22.A00 <= 0) {
            AnonymousClass6C6.A02(r3.getActivity(), r22, this, 180);
        }
    }

    public final void A08(C104615Rr r3) {
        PinInChatBannerMultiplePinsIndicator pinInChatBannerMultiplePinsIndicator;
        int i;
        if (this.A01 != null && this.A0A.A00() > 1) {
            if (r3.A01 <= 1) {
                pinInChatBannerMultiplePinsIndicator = this.A01;
                i = 4;
            } else {
                this.A01.setupIndicator(r3);
                pinInChatBannerMultiplePinsIndicator = this.A01;
                i = 0;
            }
            pinInChatBannerMultiplePinsIndicator.setVisibility(i);
        }
    }

    public final void A09(C624134x r6) {
        View view = this.A00;
        if (view != null) {
            C109475eg.A00(view, this, r6, 2);
            C1237169m.A00(this.A00, r6, this, 1);
            C49902hH r4 = this.A09;
            View view2 = this.A00;
            C162457s7.A0J(view2, 1);
            byte b = r6.A1I;
            AnonymousClass4G4 r3 = (AnonymousClass4G4) ((C53662nS) r4.A04.getValue()).A02(b);
            if (r3.BIP(r6) || r3.BsU(r6)) {
                TextEmojiLabel A0M = C86614Ku.A0M(view2, R.id.pinnedMessagesBanner_content);
                AnonymousClass5RS r1 = new AnonymousClass5RS(A0M);
                A0M.setTextDirection(5);
                r3.BjV(r1, r6);
                return;
            }
            r4.A00.A0A("pin-in-chat-unexpected-render", false, String.valueOf(b));
        }
    }
}
