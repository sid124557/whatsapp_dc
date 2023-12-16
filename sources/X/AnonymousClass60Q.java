package X;

import android.view.ViewGroup;
import com.whatsapp.calling.callgrid.view.CallGrid;
import com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog;

/* renamed from: X.60Q  reason: invalid class name */
public final class AnonymousClass60Q extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AudioChatBottomSheetDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass60Q(AudioChatBottomSheetDialog audioChatBottomSheetDialog) {
        super(1);
        this.this$0 = audioChatBottomSheetDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        CallGrid callGrid = this.this$0.A04;
        if (callGrid != null) {
            callGrid.setupLonelyStateText((ViewGroup) callGrid.A0s.A04(), C998058g.CONNECTING);
        }
        return C59022wD.A00;
    }
}
