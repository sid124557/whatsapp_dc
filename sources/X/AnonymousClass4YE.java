package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.4YE  reason: invalid class name */
public final class AnonymousClass4YE extends C05570Ua {
    public final AnonymousClass5YB A00;
    public final WDSProfilePhoto A01;

    public AnonymousClass4YE(View view, AnonymousClass64J r5) {
        super(view);
        this.A00 = AnonymousClass5YB.A00(view, r5, R.id.report_to_admin_reporter_name);
        WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) C18290x4.A0M(view, R.id.report_to_admin_reporter_photo);
        this.A01 = wDSProfilePhoto;
        C18300x5.A13(view.getContext(), wDSProfilePhoto, R.string.f11nameremoved);
        AnonymousClass0YY.A06(wDSProfilePhoto, 2);
    }
}
