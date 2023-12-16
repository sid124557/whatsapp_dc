package X;

import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.7YV  reason: invalid class name */
public final class AnonymousClass7YV {
    public final CopyOnWriteArraySet A00 = new CopyOnWriteArraySet();
    public final /* synthetic */ VoipPhysicalCamera A01;

    public AnonymousClass7YV(VoipPhysicalCamera voipPhysicalCamera) {
        this.A01 = voipPhysicalCamera;
    }

    public void A00() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C185758uC) it.next()).BPF(this.A01);
        }
    }

    public void A01() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C185758uC) it.next()).Bet(this.A01);
        }
    }
}
