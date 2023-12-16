package X;

import com.whatsapp.util.Log;
import com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetActivity;

/* renamed from: X.8KI  reason: invalid class name */
public final class AnonymousClass8KI implements C16430tO {
    public final /* synthetic */ BloksCDSBottomSheetActivity A00;

    public void BPR(AnonymousClass0JP r3) {
        C162457s7.A0J(r3, 0);
        Log.i("BloksCDSBottomSheetActivity - Completed async action");
        BloksCDSBottomSheetActivity bloksCDSBottomSheetActivity = this.A00;
        bloksCDSBottomSheetActivity.runOnUiThread(new AnonymousClass8ME(r3, bloksCDSBottomSheetActivity));
    }

    public AnonymousClass8KI(BloksCDSBottomSheetActivity bloksCDSBottomSheetActivity) {
        this.A00 = bloksCDSBottomSheetActivity;
    }
}
