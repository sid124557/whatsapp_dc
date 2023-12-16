package X;

import com.whatsapp.jid.DeviceJid;
import java.util.concurrent.Callable;

/* renamed from: X.3d8  reason: invalid class name and case insensitive filesystem */
public class C72073d8 implements Callable {
    public final C621133n A00;
    public final DeviceJid A01;

    public /* bridge */ /* synthetic */ Object call() {
        return this.A00.A08(AnonymousClass36G.A02(this.A01));
    }

    public C72073d8(C621133n r1, DeviceJid deviceJid) {
        this.A01 = deviceJid;
        this.A00 = r1;
    }
}
