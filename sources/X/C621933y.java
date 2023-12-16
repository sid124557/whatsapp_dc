package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.33y  reason: invalid class name and case insensitive filesystem */
public class C621933y {
    public static C129526aS A01(AnonymousClass8OQ r5, AnonymousClass8OQ r6) {
        C129496aP r4 = new C129496aP();
        C172878Nf it = r5.keySet().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!r6.containsKey(next) || r6.get(next) != r5.get(next)) {
                r4.add(next);
            }
        }
        return r4.build();
    }

    public static C129526aS A02(AnonymousClass8OQ r6, AnonymousClass8OQ r7) {
        C129496aP r5 = new C129496aP();
        C172878Nf it = r7.keySet().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            boolean containsKey = r6.containsKey(next);
            if (!containsKey || r6.get(next) != r7.get(next)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("DevicesUtil/calculateDevicesRemoved/device=");
                A0o.append(next);
                A0o.append("; hasDevice=");
                A0o.append(containsKey);
                A0o.append("; newIndex=");
                A0o.append(r6.get(next));
                A0o.append("; currentIndex=");
                C18260x0.A0m(r7.get(next), A0o);
                r5.add(next);
            }
        }
        return r5.build();
    }

    public static AnonymousClass8OQ A00(AnonymousClass8OQ r6, UserJid userJid) {
        HashMap A0t = AnonymousClass001.A0t();
        C172878Nf A0M = C18310x6.A0M(r6);
        while (A0M.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0M);
            DeviceJid fromUserJidAndDeviceIdNullable = DeviceJid.getFromUserJidAndDeviceIdNullable(userJid, AnonymousClass0x9.A0R(A0w).getDevice());
            C626936e.A0D(AnonymousClass000.A1W(fromUserJidAndDeviceIdNullable), "DeviceJid must not be null");
            if (fromUserJidAndDeviceIdNullable != null) {
                A0t.put(fromUserJidAndDeviceIdNullable, A0w.getValue());
            }
        }
        return AnonymousClass8OQ.copyOf((Map) A0t);
    }

    public static String A03(Collection collection) {
        String rawString;
        ArrayList A0u = C18300x5.A0u(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Jid A0S = AnonymousClass0x7.A0S(it);
            if (A0S instanceof C135136kB) {
                String str = A0S.user;
                String server = A0S.getServer();
                int device = A0S.getDevice();
                StringBuilder A0l = AnonymousClass000.A0l(str);
                A0l.append('.');
                A0l.append(0);
                A0l.append(':');
                A0l.append(device);
                rawString = AnonymousClass0x2.A0e(server, A0l, '@');
            } else {
                rawString = A0S.getRawString();
            }
            A0u.add(rawString);
        }
        Collections.sort(A0u);
        try {
            MessageDigest A0t = AnonymousClass0x7.A0t();
            Iterator it2 = A0u.iterator();
            while (it2.hasNext()) {
                A0t.update(AnonymousClass001.A0m(it2).getBytes());
            }
            byte[] A1Z = C18320x8.A1Z(A0t.digest(), 6);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("2:");
            return AnonymousClass000.A0X(C18290x4.A0t(A1Z), A0o);
        } catch (NoSuchAlgorithmException e) {
            throw C18330xA.A09(e);
        }
    }
}
