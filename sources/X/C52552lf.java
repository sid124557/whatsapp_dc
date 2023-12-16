package X;

import android.os.Message;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2lf  reason: invalid class name and case insensitive filesystem */
public class C52552lf {
    public final List A00 = AnonymousClass001.A0s();
    public final Map A01 = AnonymousClass001.A0t();
    public final Set A02 = AnonymousClass002.A0K();

    public void A00(Message message, String str, boolean z) {
        List list = this.A00;
        synchronized (list) {
            list.add(new AnonymousClass2OW(message, str, z));
        }
    }

    public void A01(DeviceJid deviceJid, C624134x r7) {
        Set set;
        DeviceJid deviceJid2;
        Map map = this.A01;
        synchronized (map) {
            AnonymousClass2z0 r3 = r7.A1J;
            Pair pair = (Pair) map.get(r3);
            if (pair == null) {
                set = AnonymousClass002.A0K();
                map.put(r3, AnonymousClass0x9.A0C(set, r7));
            } else {
                set = (Set) pair.first;
            }
            if (deviceJid != null) {
                deviceJid2 = deviceJid;
            } else {
                C95814uZ r1 = r3.A00;
                if (r1 instanceof UserJid) {
                    deviceJid2 = C18320x8.A0O(r1);
                } else {
                    deviceJid2 = null;
                }
            }
            if (!set.add(deviceJid2)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("in-flight-messages/duplicate in flight message: ");
                A0o.append(r3);
                C18260x0.A1S(A0o, " : ", deviceJid);
            }
        }
    }

    public void A02(DeviceJid deviceJid, AnonymousClass2z0 r6) {
        DeviceJid deviceJid2;
        Map map = this.A01;
        synchronized (map) {
            Pair pair = (Pair) map.get(r6);
            if (pair == null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("in-flight-messages/no message to remove: ");
                A0o.append(r6);
                C18260x0.A1S(A0o, " : ", deviceJid);
            } else {
                Set set = (Set) pair.first;
                if (set == null) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("in-flight-messages/no message to remove: ");
                    A0o2.append(r6);
                    C18260x0.A1S(A0o2, " : ", deviceJid);
                } else {
                    if (deviceJid != null) {
                        deviceJid2 = deviceJid;
                    } else {
                        C95814uZ r1 = r6.A00;
                        if (r1 instanceof UserJid) {
                            deviceJid2 = C18320x8.A0O(r1);
                        } else {
                            deviceJid2 = null;
                        }
                    }
                    if (!set.remove(deviceJid2)) {
                        StringBuilder A0o3 = AnonymousClass001.A0o();
                        A0o3.append("in-flight-messages/no message to remove for target: ");
                        A0o3.append(r6);
                        C18260x0.A1S(A0o3, " : ", deviceJid);
                    }
                    if (set.isEmpty()) {
                        map.remove(r6);
                    }
                }
            }
        }
    }
}
