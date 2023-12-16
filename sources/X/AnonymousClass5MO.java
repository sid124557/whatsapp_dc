package X;

import com.whatsapp.calling.callgrid.view.CallGrid;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5MO  reason: invalid class name */
public class AnonymousClass5MO {
    public final /* synthetic */ CallGrid A00;

    public AnonymousClass5MO(CallGrid callGrid) {
        this.A00 = callGrid;
    }

    public void A00(C105175Tw r5) {
        CallGrid callGrid = this.A00;
        C626936e.A06(callGrid.A09);
        CallGridViewModel callGridViewModel = callGrid.A09;
        if (r5.A0K && !r5.A0B) {
            callGridViewModel.A0U(r5.A0b);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("voip/CallGridViewModel//showVoiceCallParticipantMenu ");
        UserJid userJid = r5.A0b;
        C18260x0.A0o(userJid, A0o);
        callGridViewModel.A0J.A0H(userJid);
    }
}
