package X;

import com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet;
import com.whatsapp.jid.UserJid;

/* renamed from: X.41H  reason: invalid class name */
public final class AnonymousClass41H extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ CallLogMessageParticipantBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass41H(CallLogMessageParticipantBottomSheet callLogMessageParticipantBottomSheet) {
        super(1);
        this.this$0 = callLogMessageParticipantBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        UserJid userJid = (UserJid) obj;
        C162457s7.A0J(userJid, 0);
        CallLogMessageParticipantBottomSheet callLogMessageParticipantBottomSheet = this.this$0;
        C111095hX r4 = callLogMessageParticipantBottomSheet.A03;
        if (r4 != null) {
            r4.A0A(callLogMessageParticipantBottomSheet.A0G(), C627736r.A0l(callLogMessageParticipantBottomSheet.A0G(), userJid, (Integer) null, true, true));
            return C59022wD.A00;
        }
        throw C18270x1.A0S("activityUtils");
    }
}
