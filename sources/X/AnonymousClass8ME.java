package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetActivity;

/* renamed from: X.8ME  reason: invalid class name */
public final class AnonymousClass8ME implements Runnable {
    public final /* synthetic */ AnonymousClass0JP A00;
    public final /* synthetic */ BloksCDSBottomSheetActivity A01;

    public AnonymousClass8ME(AnonymousClass0JP r1, BloksCDSBottomSheetActivity bloksCDSBottomSheetActivity) {
        this.A01 = bloksCDSBottomSheetActivity;
        this.A00 = r1;
    }

    public final void run() {
        BloksCDSBottomSheetActivity bloksCDSBottomSheetActivity = this.A01;
        View findViewById = bloksCDSBottomSheetActivity.findViewById(R.id.progress_bar);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        AnonymousClass0JP r1 = this.A00;
        if (!(r1 instanceof AnonymousClass0F5) && !C162457s7.A0P(r1, AnonymousClass0F8.A00)) {
            bloksCDSBottomSheetActivity.finish();
        }
    }
}
