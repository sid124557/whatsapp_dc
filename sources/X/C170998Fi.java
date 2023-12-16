package X;

import com.whatsapp.camera.CameraActivity;

/* renamed from: X.8Fi  reason: invalid class name and case insensitive filesystem */
public class C170998Fi implements C185028sw {
    public final /* synthetic */ CameraActivity A00;

    public C170998Fi(CameraActivity cameraActivity) {
        this.A00 = cameraActivity;
    }

    public int BAC() {
        return this.A00.getIntent().getIntExtra("camera_origin", 8);
    }

    public void BOE() {
        this.A00.finish();
    }

    public void BbC() {
        CameraActivity cameraActivity = this.A00;
        cameraActivity.setResult(-1);
        cameraActivity.finish();
    }
}
