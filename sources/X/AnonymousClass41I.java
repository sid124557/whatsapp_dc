package X;

import com.whatsapp.calling.participantlist.ParticipantListBottomSheetDialog;
import java.util.List;

/* renamed from: X.41I  reason: invalid class name */
public final class AnonymousClass41I extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ ParticipantListBottomSheetDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass41I(ParticipantListBottomSheetDialog participantListBottomSheetDialog) {
        super(1);
        this.this$0 = participantListBottomSheetDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        AnonymousClass4WF r0 = this.this$0.A02;
        if (r0 != null) {
            r0.A0L(list);
            return C59022wD.A00;
        }
        throw C18270x1.A0S("participantListAdapter");
    }
}
