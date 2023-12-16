package X;

import android.content.Context;
import com.whatsapp.calling.VoipPermissionsActivity;
import com.whatsapp.gallerypicker.GalleryPickerLauncher;
import com.whatsapp.profile.CapturePhoto;

/* renamed from: X.68W  reason: invalid class name */
public class AnonymousClass68W implements C15520rV {
    public Object A00;
    public final int A01;

    public AnonymousClass68W(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(C004805c r1, int i) {
        r1.A5J(new AnonymousClass68W(r1, i));
    }

    public void BQ0(Context context) {
        switch (this.A01) {
            case 14:
                VoipPermissionsActivity voipPermissionsActivity = (VoipPermissionsActivity) this.A00;
                if (!voipPermissionsActivity.A0F) {
                    voipPermissionsActivity.A0F = true;
                    C64333Db r1 = ((C88834as) ((AnonymousClass3DZ) voipPermissionsActivity.generatedComponent())).A4Z;
                    voipPermissionsActivity.A02 = C64333Db.A04(r1);
                    voipPermissionsActivity.A08 = C64333Db.A4H(r1);
                    voipPermissionsActivity.A0A = C86614Ku.A0o(r1);
                    voipPermissionsActivity.A03 = C86644Kx.A0Q(r1);
                    voipPermissionsActivity.A04 = C64333Db.A26(r1);
                    voipPermissionsActivity.A06 = (C56762sW) r1.A4R.get();
                    voipPermissionsActivity.A05 = C64333Db.A2r(r1);
                    voipPermissionsActivity.A07 = C64333Db.A4B(r1);
                    return;
                }
                return;
            case 58:
                GalleryPickerLauncher galleryPickerLauncher = (GalleryPickerLauncher) this.A00;
                if (!galleryPickerLauncher.A03) {
                    galleryPickerLauncher.A03 = true;
                    C64333Db r12 = ((C88834as) ((AnonymousClass3DZ) galleryPickerLauncher.generatedComponent())).A4Z;
                    galleryPickerLauncher.A01 = C64333Db.A4B(r12);
                    galleryPickerLauncher.A02 = C86634Kw.A0o(r12);
                    galleryPickerLauncher.A00 = C64333Db.A2r(r12);
                    return;
                }
                return;
            case 73:
                CapturePhoto capturePhoto = (CapturePhoto) this.A00;
                if (!capturePhoto.A04) {
                    capturePhoto.A04 = true;
                    C64333Db r13 = ((C88834as) ((AnonymousClass3DZ) capturePhoto.generatedComponent())).A4Z;
                    capturePhoto.A00 = C64333Db.A04(r13);
                    capturePhoto.A01 = C64333Db.A2r(r13);
                    capturePhoto.A02 = C64333Db.A4B(r13);
                    capturePhoto.A03 = (C51072jE) r13.ATh.get();
                    return;
                }
                return;
            default:
                ((AnonymousClass4SG) this.A00).A5r();
                return;
        }
    }
}
