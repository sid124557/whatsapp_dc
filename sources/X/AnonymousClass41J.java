package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.calling.participantlist.ParticipantListBottomSheetDialog;

/* renamed from: X.41J  reason: invalid class name */
public final class AnonymousClass41J extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ ParticipantListBottomSheetDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass41J(ParticipantListBottomSheetDialog participantListBottomSheetDialog) {
        super(1);
        this.this$0 = participantListBottomSheetDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Dialog dialog;
        Window window;
        Boolean bool = (Boolean) obj;
        C162457s7.A0H(bool);
        if (bool.booleanValue()) {
            ParticipantListBottomSheetDialog participantListBottomSheetDialog = this.this$0;
            Context A1D = participantListBottomSheetDialog.A1D();
            if (!(A1D == null || (dialog = participantListBottomSheetDialog.A03) == null || (window = dialog.getWindow()) == null)) {
                window.setNavigationBarColor(AnonymousClass0Y8.A04(A1D, R.color.f5nameremoved));
            }
            View view = participantListBottomSheetDialog.A0B;
            if (view != null) {
                View A02 = C06560Yg.A02(view, R.id.title);
                C162457s7.A0K(A02, "null cannot be cast to non-null type com.whatsapp.WaTextView");
                ((TextView) A02).setText(R.string.f11nameremoved);
                ViewParent parent = view.getParent();
                C162457s7.A0K(parent, "null cannot be cast to non-null type android.view.View");
                ((View) parent).setBackground(AnonymousClass0RP.A00(view.getContext(), R.drawable.audio_chat_activity_bottom_sheet_background));
            }
        }
        return C59022wD.A00;
    }
}
