package X;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Es  reason: invalid class name and case insensitive filesystem */
public class C64733Es implements AnonymousClass49Y {
    public final C56612sH A00;
    public final HashMap A01 = AnonymousClass001.A0t();

    public C58782vo A00(String str) {
        C58782vo A012 = A01(str, true, false);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DnsCache/getAllByName resolved host:");
        A0o.append(str);
        A0o.append(" to: ");
        C18260x0.A1J(A0o, Arrays.toString(A012.A04));
        return A012;
    }

    public C58782vo A01(String str, boolean z, boolean z2) {
        boolean z3;
        String str2 = str;
        C18260x0.A0s("resolving ", str2, AnonymousClass001.A0o());
        synchronized (this) {
            HashMap hashMap = this.A01;
            List<C53452n7> list = (List) hashMap.get(str2);
            z3 = z2;
            if (list != null) {
                ArrayList A0s = AnonymousClass001.A0s();
                HashSet A0K = AnonymousClass002.A0K();
                int i = 0;
                for (C53452n7 r3 : list) {
                    C56612sH r1 = this.A00;
                    Long l = r3.A01;
                    if (l == null || r1.A0H() < l.longValue()) {
                        A0s.add(r3.A03);
                        i = r3.A00;
                    } else {
                        A0K.add(r3);
                    }
                }
                list.removeAll(A0K);
                if (list.isEmpty()) {
                    hashMap.remove(str2);
                }
                C58782vo r8 = new C58782vo(new C41512Kn(i, true), (InetAddress[]) A0s.toArray(new InetAddress[0]), z3);
                InetAddress[] inetAddressArr = r8.A04;
                if (inetAddressArr != null && inetAddressArr.length > 0) {
                    return r8;
                }
            }
        }
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str2);
            A03(Arrays.asList(allByName), str2, 0);
            return new C58782vo(new C41512Kn(0, false), allByName, z3);
        } catch (UnknownHostException e) {
            C18260x0.A0v("primary dns resolution failed for ", str2, AnonymousClass001.A0o(), e);
            try {
                List<AnonymousClass2YB> A012 = AnonymousClass34I.A01(str2, 0);
                ArrayList A0p = AnonymousClass000.A0p(A012);
                for (AnonymousClass2YB r0 : A012) {
                    A0p.add(r0.A01);
                }
                A03(A0p, str2, 1);
                return new C58782vo(new C41512Kn(1, false), (InetAddress[]) A0p.toArray(new InetAddress[0]), z3);
            } catch (C118215tB | UnknownHostException e2) {
                C18260x0.A0v("secondary dns resolution failed for ", str2, AnonymousClass001.A0o(), e2);
                if (z) {
                    try {
                        return A02(str2, true, z3);
                    } catch (UnknownHostException e3) {
                        C18260x0.A0v("hardcoded ip resolution failed for ", str2, AnonymousClass001.A0o(), e3);
                        throw e;
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    public void BPq(C59622xD r2) {
        synchronized (this) {
            this.A01.clear();
        }
    }

    public final C58782vo A02(String str, boolean z, boolean z2) {
        List A0s = C18320x8.A0s(str, AnonymousClass2B1.A00);
        if (A0s == null || A0s.isEmpty()) {
            throw new UnknownHostException(AnonymousClass000.A0V("no hardcoded ips found for ", str, AnonymousClass001.A0o()));
        }
        if (z) {
            A03(A0s, str, 2);
        }
        return new C58782vo(new C41512Kn(2, false), (InetAddress[]) A0s.toArray(new InetAddress[0]), z2);
    }

    public C64733Es(C56612sH r2) {
        this.A00 = r2;
    }

    public final void A03(Iterable iterable, String str, int i) {
        long currentTimeMillis = System.currentTimeMillis() + 3600000;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            A0s.add(new C53452n7(Long.valueOf(currentTimeMillis), (Short) null, (InetAddress) it.next(), i, false, false));
        }
        synchronized (this) {
            this.A01.put(str, A0s);
        }
    }
}
