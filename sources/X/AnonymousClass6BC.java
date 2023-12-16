package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

/* renamed from: X.6BC  reason: invalid class name */
public class AnonymousClass6BC implements DialogInterface.OnKeyListener {
    public Object A00;
    public final int A01;

    public AnonymousClass6BC(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        C003203q r0;
        C105315Uk r02;
        switch (this.A01) {
            case 0:
                C08310eF r2 = (C08310eF) this.A00;
                if (!(i == 4 && keyEvent.getAction() == 1 && (r0 = r2.A0Q()) != null)) {
                    return false;
                }
            case 1:
                SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = (SharedTextPreviewDialogFragment) this.A00;
                if (i != 4 || !sharedTextPreviewDialogFragment.A08.isShowing()) {
                    return false;
                }
                sharedTextPreviewDialogFragment.A08.dismiss();
                return true;
            case 2:
                DialogFragment dialogFragment = (DialogFragment) this.A00;
                C162457s7.A0J(keyEvent, 3);
                if (i != 4 || keyEvent.getAction() != 1 || keyEvent.isCanceled()) {
                    return false;
                }
                dialogFragment.A1K();
                return true;
            case 3:
                StorageUsageGalleryActivity storageUsageGalleryActivity = (StorageUsageGalleryActivity) this.A00;
                if (i != 4) {
                    return false;
                }
                storageUsageGalleryActivity.A74();
                return true;
            default:
                VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = (VoipCallControlBottomSheetV2) this.A00;
                if (i == 4 && keyEvent.getAction() == 1) {
                    CallInfo A1T = voipCallControlBottomSheetV2.A1T();
                    if (A1T != null && (Voip.A09(A1T.callState) || voipCallControlBottomSheetV2.A0P.A01)) {
                        voipCallControlBottomSheetV2.A1Z(1);
                        return true;
                    } else if ((!voipCallControlBottomSheetV2.A1d() && ((r02 = voipCallControlBottomSheetV2.A0N) == null || r02.A08())) || (r0 = voipCallControlBottomSheetV2.A0Q()) == null) {
                        voipCallControlBottomSheetV2.A1W();
                        return true;
                    }
                } else {
                    C003203q A0Q = voipCallControlBottomSheetV2.A0Q();
                    if (A0Q == null || !(A0Q instanceof C009707r)) {
                        return false;
                    }
                    return ((C009707r) A0Q).dispatchKeyEvent(keyEvent);
                }
                break;
        }
        r0.onBackPressed();
        return true;
    }
}
