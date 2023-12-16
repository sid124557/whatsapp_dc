package X;

import android.hardware.Camera;
import android.view.View;

/* renamed from: X.9Xw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C195459Xw implements View.OnClickListener {
    public final /* synthetic */ Camera.PictureCallback A00;
    public final /* synthetic */ AnonymousClass7H5 A01;
    public final /* synthetic */ C196179aQ A02;
    public final /* synthetic */ C196189aR A03;
    public final /* synthetic */ String A04;

    public final void onClick(View view) {
        C196189aR r6 = this.A03;
        String str = this.A04;
        AnonymousClass7H5 r4 = this.A01;
        C196179aQ r3 = this.A02;
        Camera.PictureCallback pictureCallback = this.A00;
        if (!r6.A00) {
            r6.A00 = true;
            int hashCode = str.hashCode();
            if (hashCode == 100313435 || hashCode != 112202875 || !str.equals("video")) {
                r3.A03.takePicture((Camera.ShutterCallback) null, (Camera.PictureCallback) null, pictureCallback);
                return;
            }
            AnonymousClass98Y r1 = r3.A06;
            C626936e.A04(r1);
            C196189aR.A00(r1, r4, r3, r6.A03);
        }
    }

    public /* synthetic */ C195459Xw(Camera.PictureCallback pictureCallback, AnonymousClass7H5 r2, C196179aQ r3, C196189aR r4, String str) {
        this.A03 = r4;
        this.A04 = str;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = pictureCallback;
    }
}
