package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Map;

/* renamed from: X.2eO  reason: invalid class name and case insensitive filesystem */
public class C48122eO {
    public final Map A00;

    public synchronized int A00(DeviceJid deviceJid) {
        int A01;
        A01 = A01(deviceJid) + 1;
        C18280x3.A1D(deviceJid.getRawString(), this.A00, A01);
        return A01;
    }

    public synchronized int A01(DeviceJid deviceJid) {
        String rawString = deviceJid.getRawString();
        Map map = this.A00;
        if (!map.containsKey(rawString)) {
            return 0;
        }
        return AnonymousClass0x7.A05(map.get(rawString));
    }

    public C48122eO(Map map) {
        this.A00 = map;
    }
}
