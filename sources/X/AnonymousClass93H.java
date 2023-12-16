package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.ReplyWithMessageDialogFragment;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallAnswerCallView;

/* renamed from: X.93H  reason: invalid class name */
public class AnonymousClass93H implements C182088nq {
    public Object A00;
    public final int A01;

    public AnonymousClass93H(VoipCallAnswerCallView voipCallAnswerCallView, int i) {
        this.A01 = i;
        this.A00 = voipCallAnswerCallView;
    }

    public final void BOA() {
        int i = this.A01;
        C138486qS r2 = (C138486qS) this.A00;
        switch (i) {
            case 0:
                int i2 = 1;
                if (r2.A04) {
                    i2 = 5;
                }
                C179798jj r0 = r2.A01;
                if (r0 != null) {
                    ((AnonymousClass8KA) r0).A00.A7a(i2);
                    return;
                }
                return;
            case 1:
                int i3 = 2;
                if (r2.A04) {
                    i3 = 7;
                }
                C179798jj r02 = r2.A01;
                if (r02 != null) {
                    ((AnonymousClass8KA) r02).A00.Bik(i3);
                    return;
                }
                return;
            default:
                C179798jj r1 = r2.A01;
                if (r1 != null) {
                    CallInfo callInfo = r2.A02;
                    C626936e.A06(callInfo);
                    UserJid peerJid = callInfo.getPeerJid();
                    C626936e.A06(peerJid);
                    CallInfo callInfo2 = r2.A02;
                    C626936e.A06(callInfo2);
                    String str = callInfo2.callId;
                    VoipActivityV2 voipActivityV2 = ((AnonymousClass8KA) r1).A00;
                    if (voipActivityV2.A2D) {
                        voipActivityV2.A7A(new ReplyWithMessageDialogFragment(peerJid, str), "ReplyWithMessageDialogFragment");
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
