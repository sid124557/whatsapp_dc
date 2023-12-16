package X;

import com.whatsapp.jid.DeviceJid;
import java.util.concurrent.Callable;

/* renamed from: X.3dC  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C72113dC implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C56222rd A02;
    public final /* synthetic */ DeviceJid A03;
    public final /* synthetic */ String A04;

    public final Object call() {
        return this.A02.A02(this.A03, this.A04, this.A00, this.A01);
    }

    public /* synthetic */ C72113dC(C56222rd r1, DeviceJid deviceJid, String str, int i, int i2) {
        this.A02 = r1;
        this.A03 = deviceJid;
        this.A04 = str;
        this.A00 = i;
        this.A01 = i2;
    }
}
