package X;

import com.whatsapp.calling.callgrid.viewmodel.ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1;
import com.whatsapp.jid.UserJid;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5QX  reason: invalid class name */
public final class AnonymousClass5QX {
    public final C06270Wx A00;
    public final AnonymousClass08M A01;
    public final Map A02 = C18320x8.A0r();
    public final Set A03;
    public final C73853gB A04;
    public final C73853gB A05;

    public AnonymousClass5QX(C73853gB r3, C73853gB r4) {
        C162457s7.A0J(r3, 1);
        this.A05 = r3;
        this.A04 = r4;
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A01 = A012;
        this.A03 = AnonymousClass0x9.A17();
        this.A00 = A012;
    }

    public final void A00(UserJid userJid) {
        C18260x0.A1P(AnonymousClass001.A0o(), "voip/ScreenSharePeerTransitionStateProvider/ Transition state shown for ", userJid);
        this.A03.add(userJid);
        this.A02.put(userJid, C616131n.A02((C85494Gl) null, new ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1(this, userJid, (C84814Du) null), AnonymousClass349.A02(this.A04), (AnonymousClass20D) null, 3));
    }
}
