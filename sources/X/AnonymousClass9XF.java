package X;

import android.hardware.Camera;
import android.text.TextUtils;
import com.whatsapp.bloks.BloksCameraOverlay;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: X.9XF  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9XF implements Camera.PictureCallback {
    public final /* synthetic */ C15810ry A00;
    public final /* synthetic */ C196179aQ A01;
    public final /* synthetic */ C196189aR A02;

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        C196189aR r5 = this.A02;
        C196179aQ r4 = this.A01;
        C15810ry r6 = this.A00;
        byte[] bArr2 = bArr;
        if (bArr == null) {
            r5.A01.A0S(new C198769fS(r5));
            return;
        }
        C44232Ve r8 = r5.A03;
        String str = r4.A07;
        if (TextUtils.isEmpty(str)) {
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("IMG_");
            A0o.append(format);
            str = AnonymousClass000.A0X(".png", A0o);
        }
        File A002 = r8.A00(str);
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(r4.A00, cameraInfo);
        AnonymousClass4FS r1 = r5.A04;
        boolean A1U = AnonymousClass000.A1U(cameraInfo.facing, 1);
        String str2 = r4.A07;
        int i = r4.A01;
        int i2 = r4.A02;
        BloksCameraOverlay bloksCameraOverlay = r4.A05;
        C626936e.A04(bloksCameraOverlay);
        r1.BkO(new C191869Gt(r6, bloksCameraOverlay, r8, A002, str2, bArr2, i, i2, A1U), new Void[0]);
    }

    public /* synthetic */ AnonymousClass9XF(C15810ry r1, C196179aQ r2, C196189aR r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
