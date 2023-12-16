package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import java.util.Map;

/* renamed from: X.9UR  reason: invalid class name */
public class AnonymousClass9UR {
    public static final Map A00 = AnonymousClass001.A0t();

    public static CameraCharacteristics A00(CameraManager cameraManager, String str) {
        Map map = A00;
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) map.get(str);
        if (cameraCharacteristics != null) {
            return cameraCharacteristics;
        }
        try {
            cameraManager.getClass();
            CameraCharacteristics cameraCharacteristics2 = cameraManager.getCameraCharacteristics(str);
            map.put(str, cameraCharacteristics2);
            return cameraCharacteristics2;
        } catch (CameraAccessException e) {
            throw new C201699ka(AnonymousClass000.A0V("Could not get Camera Characteristics for Camera ID: ", str, AnonymousClass001.A0o()), e);
        }
    }
}
