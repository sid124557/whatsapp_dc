package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Process;
import com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity;
import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoErrorDialog;
import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel;
import com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity;

/* renamed from: X.4Ht  reason: invalid class name and case insensitive filesystem */
public class C85824Ht implements DialogInterface.OnCancelListener {
    public Object A00;
    public final int A01;

    public C85824Ht(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        IndiaUpiFcsPinHandlerActivity indiaUpiFcsPinHandlerActivity;
        int i;
        switch (this.A01) {
            case 0:
                ((Activity) this.A00).finish();
                Process.killProcess(Process.myPid());
                return;
            case 1:
                ((AccountSwitchingActivity) this.A00).A5q(false);
                return;
            case 2:
                ((AvatarProfilePhotoViewModel) ((AvatarProfilePhotoErrorDialog) this.A00).A00.getValue()).A0C.A0H(C141506vg.CLOSE_SCREEN);
                return;
            case 3:
                indiaUpiFcsPinHandlerActivity = (IndiaUpiFcsPinHandlerActivity) this.A00;
                i = 12;
                break;
            case 4:
                indiaUpiFcsPinHandlerActivity = (IndiaUpiFcsPinHandlerActivity) this.A00;
                i = 11;
                break;
            case 5:
                ((IndiaUpiFcsPinHandlerActivity) this.A00).A7l();
                return;
            case 6:
                indiaUpiFcsPinHandlerActivity = (IndiaUpiFcsPinHandlerActivity) this.A00;
                i = 19;
                break;
            case 7:
                indiaUpiFcsPinHandlerActivity = (IndiaUpiFcsPinHandlerActivity) this.A00;
                i = 10;
                break;
            case 8:
                Activity activity = (Activity) this.A00;
                activity.setResult(0, activity.getIntent());
                activity.finish();
                activity.overridePendingTransition(0, 0);
                return;
            case 9:
                C621433s.A00((Activity) this.A00, 13);
                return;
            default:
                ((AnonymousClass5ZM) this.A00).A0D(true);
                return;
        }
        C621433s.A00(indiaUpiFcsPinHandlerActivity, i);
        indiaUpiFcsPinHandlerActivity.A7l();
    }
}
