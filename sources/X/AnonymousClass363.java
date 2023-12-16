package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.363  reason: invalid class name */
public class AnonymousClass363 {
    public static final AnonymousClass39V[] A08 = new AnonymousClass39V[0];
    public final C116985rC A00;
    public final C116985rC A01;
    public final C55682qk A02;
    public final C56492s4 A03;
    public final AnonymousClass2K5 A04;
    public final C28951i2 A05;
    public final AnonymousClass9U4 A06;
    public final C56402rv A07;

    public AnonymousClass363(C116985rC r1, C116985rC r2, C55682qk r3, C56492s4 r4, AnonymousClass2K5 r5, C28951i2 r6, AnonymousClass9U4 r7, C56402rv r8) {
        this.A02 = r3;
        this.A03 = r4;
        this.A07 = r8;
        this.A06 = r7;
        this.A00 = r1;
        this.A05 = r6;
        this.A01 = r2;
        this.A04 = r5;
    }

    public static AnonymousClass36K A00(DeviceJid deviceJid, String str, AnonymousClass36K... r6) {
        ArrayList A0s = AnonymousClass001.A0s();
        for (AnonymousClass36K r0 : r6) {
            if (r0 != null) {
                A0s.add(r0);
            }
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        AnonymousClass39V.A01(deviceJid, "jid", A0s2);
        if (str != null) {
            AnonymousClass39V.A03("eph_setting", str, A0s2);
        }
        return AnonymousClass36K.A0J("to", (AnonymousClass39V[]) A0s2.toArray(A08), C18280x3.A1a(A0s, A0s.size()));
    }

    public static AnonymousClass36K A01(UserJid userJid, C49072fw r5, String str) {
        if ("url".equals(str) && r5 != null) {
            Map map = r5.A01;
            if (map.containsKey(userJid)) {
                return new AnonymousClass36K("content_binding", (byte[]) map.get(userJid), (AnonymousClass39V[]) null);
            }
        }
        return null;
    }

    public static List A02(C49072fw r21, Integer num, String str, String str2, List list, Map map, Map map2, Map map3, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass36K A012;
        AnonymousClass36K r11;
        ArrayList A0s = AnonymousClass001.A0s();
        HashSet A0K = AnonymousClass002.A0K();
        C49072fw r5 = r21;
        String str3 = str;
        Map map4 = map;
        int i2 = i;
        boolean z5 = z2;
        if (map2 != null) {
            Iterator A0q = AnonymousClass000.A0q(map2);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                DeviceJid A0Q = AnonymousClass0x9.A0Q(A0w);
                String A0o = C18310x6.A0o(C618932r.A00(A0Q.userJid), map4);
                C45442a1 r15 = (C45442a1) A0w.getValue();
                if (z3) {
                    r11 = A01(A0Q.userJid, r5, str3);
                } else {
                    r11 = null;
                }
                String str4 = null;
                Integer num2 = null;
                String str5 = null;
                if (z) {
                    str4 = str3;
                    num2 = num;
                    str5 = str2;
                }
                AnonymousClass36K A013 = AnonymousClass35A.A01(r15, num2, str4, str5, i2, z5);
                if (r11 != null) {
                    A0K.add(A0Q);
                }
                A0s.add(A00(A0Q, A0o, A013, r11));
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DeviceJid A0R = AnonymousClass0x7.A0R(it);
                String A0o2 = C18310x6.A0o(C618932r.A00(A0R.userJid), map4);
                ArrayList A0s2 = AnonymousClass001.A0s();
                AnonymousClass39V.A01(A0R, "jid", A0s2);
                if (A0o2 != null) {
                    AnonymousClass39V.A03("eph_setting", A0o2, A0s2);
                }
                AnonymousClass36K.A0R("to", A0s, (AnonymousClass39V[]) A0s2.toArray(A08));
            }
        }
        if (map3 != null) {
            Iterator A0q2 = AnonymousClass000.A0q(map3);
            while (A0q2.hasNext()) {
                Map.Entry A0w2 = AnonymousClass001.A0w(A0q2);
                DeviceJid A0Q2 = AnonymousClass0x9.A0Q(A0w2);
                A0s.add(A00(A0Q2, (String) null, AnonymousClass35A.A01((C45442a1) A0w2.getValue(), num, str, str2, i2, z5), A01(A0Q2.userJid, r5, str3)));
            }
        }
        if (z3 && z4 && r5 != null) {
            Iterator it2 = r5.A00.iterator();
            while (it2.hasNext()) {
                DeviceJid A0R2 = AnonymousClass0x7.A0R(it2);
                if (!A0K.contains(A0R2) && (A012 = A01(A0R2.userJid, r5, str3)) != null) {
                    ArrayList A0s3 = AnonymousClass001.A0s();
                    AnonymousClass39V.A01(A0R2, "jid", A0s3);
                    AnonymousClass36K.A0O(A012, "to", A0s, (AnonymousClass39V[]) A0s3.toArray(A08));
                }
            }
        }
        return A0s;
    }

    public static final void A03(C49072fw r2, String str, List list) {
        if ("url".equals(str) && r2 != null) {
            list.add(new AnonymousClass36K("sender_content_binding", r2.A02, (AnonymousClass39V[]) null));
        }
    }
}
