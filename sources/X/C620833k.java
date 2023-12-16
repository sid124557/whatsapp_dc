package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.33k  reason: invalid class name and case insensitive filesystem */
public class C620833k {
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final C28011fL A05;
    public final Object A06 = AnonymousClass002.A0D();
    public final Object A07 = AnonymousClass002.A0D();
    public final Map A08 = AnonymousClass0x9.A1D();
    public final Map A09 = AnonymousClass0x9.A1D();
    public volatile boolean A0A = false;

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A05;
        objArr[1] = this.A09;
        objArr[2] = this.A08;
        objArr[3] = A09();
        return C18310x6.A08(A0B(), objArr, 4);
    }

    public C129526aS A02() {
        Map map;
        if (this.A00 != 0) {
            map = this.A08;
        } else {
            map = this.A09;
        }
        return C129526aS.copyOf((Collection) map.keySet());
    }

    public C129526aS A04() {
        return C129526aS.copyOf(this.A09.values());
    }

    public C60842zG A06(UserJid userJid) {
        Map map;
        if (userJid instanceof PhoneUserJid) {
            map = this.A09;
        } else {
            map = this.A08;
        }
        C60842zG r0 = (C60842zG) map.remove(userJid);
        if (r0 != null) {
            A0H();
        }
        return r0;
    }

    public String A09() {
        String str;
        synchronized (this.A06) {
            str = this.A01;
            C626936e.A06(str);
        }
        return str;
    }

    public String A0A() {
        String str;
        synchronized (this.A07) {
            str = this.A02;
            if (str == null) {
                str = A00(this.A08.keySet());
                this.A02 = str;
            }
            C626936e.A06(str);
        }
        return str;
    }

    public String A0B() {
        String str;
        synchronized (this.A06) {
            str = this.A03;
            C626936e.A06(str);
        }
        return str;
    }

    public String A0C() {
        String str;
        synchronized (this.A07) {
            str = this.A04;
            if (str == null) {
                str = A00(this.A09.keySet());
                this.A04 = str;
            }
            C626936e.A06(str);
        }
        return str;
    }

    public final void A0I() {
        Iterator A0v = AnonymousClass001.A0v(this.A09);
        while (A0v.hasNext()) {
            Iterator A10 = C18290x4.A10(C18320x8.A0G(A0v).A04);
            while (A10.hasNext()) {
                ((C52162kz) A10.next()).A01 = false;
            }
        }
    }

    public final void A0J() {
        synchronized (this.A06) {
            this.A03 = C621933y.A03(A0F());
            this.A01 = C621933y.A03(A0E());
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("computed participant device hash for ");
            A0o.append(this.A05);
            A0o.append(" as participantHash: ");
            A0o.append(A0B());
            A0o.append(", lidParticipantHash: ");
            C18260x0.A1J(A0o, A09());
        }
    }

    public void A0M(ConcurrentHashMap concurrentHashMap) {
        Map map = this.A09;
        map.clear();
        Iterator A0u = AnonymousClass001.A0u(concurrentHashMap);
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            if (A0w.getKey() instanceof PhoneUserJid) {
                map.put(A0w.getKey(), A0w.getValue());
            } else if (!C627336j.A0L(AnonymousClass0x9.A0R(A0w)) || this.A00 == 0) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("trying to add a participant that is not PN or lid based ");
                C18260x0.A0m(A0w.getKey(), A0o);
            } else {
                this.A08.put(A0w.getKey(), A0w.getValue());
            }
        }
    }

    public boolean A0Q(UserJid userJid) {
        if (userJid == null) {
            return false;
        }
        if (this.A09.containsKey(userJid) || this.A08.containsKey(userJid)) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C620833k r4 = (C620833k) obj;
            if (this.A05.equals(r4.A05) && this.A09.equals(r4.A09) && AnonymousClass75J.A00(A09(), r4.A09()) && this.A08.equals(r4.A08)) {
                return AnonymousClass75J.A00(A0B(), r4.A0B());
            }
        }
        return false;
    }

    public C620833k(C28011fL r2, int i) {
        C626936e.A06(r2);
        this.A05 = r2;
        this.A00 = i;
    }

    public static String A00(Collection collection) {
        ArrayList A0u = C18300x5.A0u(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C18270x1.A1L(A0u, it);
        }
        Collections.sort(A0u);
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            Iterator it2 = A0u.iterator();
            while (it2.hasNext()) {
                instance.update(AnonymousClass001.A0m(it2).getBytes());
            }
            byte[] A1Z = C18320x8.A1Z(instance.digest(), 6);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("1:");
            return AnonymousClass000.A0X(C18290x4.A0t(A1Z), A0o);
        } catch (NoSuchAlgorithmException e) {
            throw C18330xA.A09(e);
        }
    }

    public static Set A01(Collection collection) {
        C626936e.A0C(C18310x6.A1X(collection));
        HashSet hashSet = new HashSet(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hashSet.add(new C52162kz(AnonymousClass0x7.A0R(it), false, false));
        }
        return hashSet;
    }

    public C129526aS A03() {
        HashSet A0K = AnonymousClass002.A0K();
        A0K.addAll(this.A09.keySet());
        A0K.addAll(this.A08.keySet());
        return C129526aS.copyOf((Collection) A0K);
    }

    public C60842zG A05(UserJid userJid) {
        Map map;
        if (!C627336j.A0L(userJid) || this.A00 == 0) {
            map = this.A09;
        } else {
            map = this.A08;
        }
        return (C60842zG) map.get(userJid);
    }

    public final C60842zG A07(UserJid userJid, Collection collection, int i, boolean z, boolean z2) {
        C60842zG A052 = A05(userJid);
        if (A052 != null) {
            A052.A01 = i;
            A052.A02 = z;
        } else {
            A052 = new C60842zG(userJid, A01(collection), i, z);
            if (userJid instanceof PhoneUserJid) {
                Map map = this.A09;
                A052.A00 = map.size();
                map.put(userJid, A052);
            }
            if (C627336j.A0L(userJid) && this.A00 != 0) {
                Map map2 = this.A08;
                A052.A00 = map2.size();
                map2.put(userJid, A052);
            }
            this.A0A = true;
            if (z2) {
                A0H();
                return A052;
            }
        }
        return A052;
    }

    public C42052Mp A08(C129526aS r9, UserJid userJid) {
        C60842zG A052 = A05(userJid);
        boolean z = false;
        if (A052 == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GroupParticipants/refreshDevices/participant ");
            A0o.append(userJid);
            C18260x0.A1M(A0o, " doesn't exist");
            return new C42052Mp(false, false, false);
        }
        ConcurrentHashMap concurrentHashMap = A052.A04;
        C129526aS copyOf = C129526aS.copyOf((Collection) concurrentHashMap.keySet());
        C172878Nf it = r9.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            DeviceJid A0R = AnonymousClass0x7.A0R(it);
            if (!copyOf.contains(A0R)) {
                this.A0A = true;
                C52162kz r1 = new C52162kz(A0R, false, false);
                C18320x8.A1G(r1.A02, r1, concurrentHashMap);
                z2 = true;
            }
        }
        C172878Nf it2 = copyOf.iterator();
        boolean z3 = false;
        boolean z4 = false;
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!r9.contains(next)) {
                C52162kz r0 = (C52162kz) concurrentHashMap.remove(next);
                if (r0 != null) {
                    z4 |= r0.A01;
                }
                z3 = true;
            }
        }
        if (z2 || z3) {
            A0J();
            if (z3 && z4) {
                z = true;
                A0I();
            }
        }
        return new C42052Mp(z2, z3, z);
    }

    public ArrayList A0D() {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A0v = AnonymousClass001.A0v(this.A09);
        while (A0v.hasNext()) {
            C60842zG A0G = C18320x8.A0G(A0v);
            if (A0G.A01 != 0) {
                A0s.add(A0G);
            }
        }
        return A0s;
    }

    public Set A0E() {
        HashSet A0K = AnonymousClass002.A0K();
        Iterator A0q = AnonymousClass000.A0q(this.A08);
        while (A0q.hasNext()) {
            C172878Nf A002 = C60842zG.A00((C60842zG) AnonymousClass0x2.A0W(A0q));
            while (A002.hasNext()) {
                A0K.add(((C52162kz) A002.next()).A02);
            }
        }
        return A0K;
    }

    public Set A0F() {
        HashSet A0K = AnonymousClass002.A0K();
        Iterator A0q = AnonymousClass000.A0q(this.A09);
        while (A0q.hasNext()) {
            C172878Nf A002 = C60842zG.A00((C60842zG) AnonymousClass0x2.A0W(A0q));
            while (A002.hasNext()) {
                A0K.add(((C52162kz) A002.next()).A02);
            }
        }
        return A0K;
    }

    public Set A0G(C56972sr r8, boolean z) {
        Map map;
        boolean z2;
        HashSet A0K = AnonymousClass002.A0K();
        if (z) {
            map = this.A08;
        } else {
            map = this.A09;
        }
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            C172878Nf A002 = C60842zG.A00((C60842zG) AnonymousClass0x2.A0W(A0q));
            while (A002.hasNext()) {
                C52162kz r3 = (C52162kz) A002.next();
                if (!z || 3 == this.A00) {
                    z2 = r3.A01;
                } else {
                    z2 = r3.A00;
                }
                DeviceJid deviceJid = r3.A02;
                if (!r8.A0c(deviceJid) && !z2) {
                    A0K.add(deviceJid);
                }
            }
        }
        return A0K;
    }

    public void A0H() {
        A0J();
        synchronized (this.A07) {
            this.A04 = A00(this.A09.keySet());
            this.A02 = A00(this.A08.keySet());
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GroupParticipants/updateParticipantsUserHash computed participant user hash for ");
            A0o.append(this.A05);
            A0o.append(" as ");
            A0o.append(A0C());
            A0o.append("; lid participant user hash as ");
            C18260x0.A1J(A0o, A0A());
        }
    }

    public void A0K(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            if (it.hasNext()) {
                C60842zG A0G = C18320x8.A0G(it);
                A07(A0G.A03, C129526aS.copyOf((Collection) A0G.A04.keySet()), A0G.A01, A0G.A02, false);
            } else {
                A0H();
                return;
            }
        }
    }

    public void A0L(Collection collection) {
        boolean z = false;
        for (Object next : collection) {
            if (this.A09.remove(next) != null || this.A08.remove(next) != null) {
                z = true;
            }
        }
        if (z) {
            A0H();
        }
    }

    public boolean A0N(C129526aS r6, UserJid userJid) {
        C60842zG A052 = A05(userJid);
        if (A052 == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GroupParticipants/removeDevices/participant ");
            A0o.append(userJid);
            C18260x0.A1M(A0o, " doesn't exist");
            return false;
        }
        boolean z = false;
        C172878Nf it = r6.iterator();
        while (it.hasNext()) {
            C52162kz r0 = (C52162kz) A052.A04.remove(it.next());
            if (r0 != null) {
                z |= r0.A01;
            }
        }
        if (r6.isEmpty()) {
            return z;
        }
        if (z) {
            A0I();
        }
        A0J();
        return z;
    }

    public boolean A0O(C56972sr r4) {
        PhoneUserJid A042 = C56972sr.A04(r4);
        C27981fH A0H = r4.A0H();
        if (A042 != null && this.A09.containsKey(A042)) {
            return true;
        }
        if (A0H == null || !this.A08.containsKey(A0H)) {
            return false;
        }
        return true;
    }

    public boolean A0P(C56972sr r4) {
        C60842zG r0;
        PhoneUserJid A042 = C56972sr.A04(r4);
        if (A042 == null || (r0 = (C60842zG) this.A09.get(A042)) == null || r0.A01 == 0) {
            return false;
        }
        return true;
    }

    public boolean A0R(Collection collection) {
        for (Object obj : collection) {
            C60842zG r0 = (C60842zG) this.A09.get(obj);
            if (r0 != null) {
                C172878Nf A002 = C60842zG.A00(r0);
                while (A002.hasNext()) {
                    if (((C52162kz) A002.next()).A01) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GroupParticipants{groupJid='");
        A0o.append(this.A05);
        A0o.append('\'');
        A0o.append(", participants=");
        AnonymousClass0x7.A1H(A0o, this.A09);
        A0o.append(", participantHashV1='");
        A0o.append(A0B());
        A0o.append('\'');
        A0o.append(", lidParticipants=");
        AnonymousClass0x7.A1H(A0o, this.A08);
        A0o.append(", lidParticipantHashV1='");
        A0o.append(A09());
        A0o.append('\'');
        return AnonymousClass000.A0d(A0o);
    }
}
