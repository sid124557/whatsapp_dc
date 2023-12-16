package X;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;
import com.whatsapp.profile.WebImagePicker;

/* renamed from: X.90f  reason: invalid class name and case insensitive filesystem */
public class C1891590f implements DialogInterface.OnCancelListener {
    public Object A00;
    public final int A01;

    public C1891590f(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.A01) {
            case 0:
                C181898nW r0 = (C181898nW) this.A00;
                if (r0 != null) {
                    ((Activity) ((C1893290w) r0).A00).finish();
                    return;
                }
                return;
            case 1:
                ((AnonymousClass5U9) this.A00).A00();
                return;
            case 2:
                AnonymousClass4U2 r02 = ((BusinessDirectoryMapViewActivity) this.A00).A0N;
                if (r02 == null) {
                    throw C86604Kt.A0j();
                }
                r02.A0H();
                return;
            case 3:
                ((C90724i8) this.A00).A74();
                return;
            case 4:
                C621433s.A00(((C111485iA) this.A00).A02, 1);
                return;
            case 5:
                C108145cU r2 = (C108145cU) this.A00;
                if (r2.A0Y == C141956wP.LIVE_LOCATION_MODE) {
                    r2.A06();
                    return;
                }
                return;
            case 6:
                return;
            case 7:
                Activity activity = (Activity) this.A00;
                C162457s7.A0J(activity, 0);
                activity.finish();
                return;
            default:
                C33951tx r3 = (C33951tx) this.A00;
                ProgressDialog progressDialog = r3.A00;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                r3.A00 = null;
                r3.A0D(true);
                WebImagePicker webImagePicker = r3.A02;
                if (webImagePicker.A0C == r3) {
                    webImagePicker.A0C = null;
                    return;
                }
                return;
        }
    }
}
