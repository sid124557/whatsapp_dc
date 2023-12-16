package X;

import com.whatsapp.R;
import com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.5j8  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C112065j8 implements AnonymousClass49C {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ VoipActivityV2 A01;

    public final void BaR(boolean z) {
        C103925Oy r5;
        int i;
        int i2;
        VoipActivityV2 voipActivityV2 = this.A01;
        UserJid userJid = this.A00;
        CallInfo A02 = C627436k.A02();
        if (A02 != null) {
            InCallBannerViewModel inCallBannerViewModel = voipActivityV2.A0t;
            boolean z2 = A02.videoEnabled;
            C64773Ex r0 = inCallBannerViewModel.A05;
            if (z) {
                AnonymousClass3ZH A0A = r0.A0A(userJid);
                Object[] A0L = AnonymousClass002.A0L();
                C18290x4.A1K(inCallBannerViewModel.A06, A0A, A0L);
                C137946pW A0N = AnonymousClass4L0.A0N(A0L, R.string.f11nameremoved);
                int i3 = R.color.f5nameremoved;
                if (z2) {
                    i3 = R.color.f5nameremoved;
                }
                r5 = new C103925Oy(A0N, (C150477Qw) null, 5, i3);
                i = R.drawable.vec_ic_calling_user_blocked;
                i2 = R.color.f5nameremoved;
            } else {
                AnonymousClass3ZH A0A2 = r0.A0A(userJid);
                Object[] A0L2 = AnonymousClass002.A0L();
                A0L2[0] = inCallBannerViewModel.A06.A0H(A0A2);
                C137946pW A0N2 = AnonymousClass4L0.A0N(A0L2, R.string.f11nameremoved);
                C137946pW A0N3 = AnonymousClass4L0.A0N(new Object[0], R.string.f11nameremoved);
                int i4 = R.color.f5nameremoved;
                if (z2) {
                    i4 = R.color.f5nameremoved;
                }
                r5 = new C103925Oy(A0N2, A0N3, 6, i4);
                i = R.drawable.vec_ic_remove_user_warning;
                i2 = R.color.f5nameremoved;
            }
            AnonymousClass4VK.A04(inCallBannerViewModel, r5, i, i2);
        }
    }

    public /* synthetic */ C112065j8(UserJid userJid, VoipActivityV2 voipActivityV2) {
        this.A01 = voipActivityV2;
        this.A00 = userJid;
    }
}
