package X;

import com.whatsapp.voipcalling.camera.VoipCameraManager;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import org.pjsip.PjCamera;

/* renamed from: X.8KH  reason: invalid class name */
public class AnonymousClass8KH implements C185758uC {
    public final /* synthetic */ VoipCameraManager A00;

    public AnonymousClass8KH(VoipCameraManager voipCameraManager) {
        this.A00 = voipCameraManager;
    }

    public void BOJ(VoipPhysicalCamera voipPhysicalCamera, int i) {
        this.A00.clearStoredRawCameraInfo(i, C18280x3.A01(voipPhysicalCamera instanceof PjCamera ? 1 : 0));
    }

    public void BPF(VoipPhysicalCamera voipPhysicalCamera) {
        this.A00.closeCurrentCamera(voipPhysicalCamera);
    }

    public void BSW(VoipPhysicalCamera voipPhysicalCamera) {
    }

    public void BbK(VoipPhysicalCamera voipPhysicalCamera) {
    }

    public void Bet(VoipPhysicalCamera voipPhysicalCamera) {
    }

    public AnonymousClass8KH() {
    }
}
