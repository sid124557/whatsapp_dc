package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.30M  reason: invalid class name */
public class AnonymousClass30M {
    public int A00 = 0;
    public C30471mV A01;
    public final CopyOnWriteArrayList A02;

    public synchronized C30471mV A00() {
        return this.A01;
    }

    public synchronized void A03(AnonymousClass2z0 r6) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("messagelist/remove ");
        A0o.append(r6);
        A0o.append(" from ");
        C18260x0.A1L(A0o, A01());
        CopyOnWriteArrayList copyOnWriteArrayList = this.A02;
        C30471mV r3 = null;
        if (r6 != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C30471mV A0S = C18320x8.A0S(it);
                if (r6.equals(A0S.A1J)) {
                    r3 = A0S;
                    break;
                }
            }
        }
        copyOnWriteArrayList.remove(r3);
        if (!copyOnWriteArrayList.isEmpty()) {
            this.A01 = (C30471mV) copyOnWriteArrayList.get(0);
        }
    }

    public final void A02() {
        AnonymousClass33C r2 = this.A01.A01;
        C626936e.A0D(AnonymousClass000.A1W(r2), "First media data is null");
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C30471mV A0S = C18320x8.A0S(it);
            AnonymousClass33C r3 = A0S.A01;
            C626936e.A0D(AnonymousClass000.A1W(r3), "Media data is null");
            C626936e.A0D(AnonymousClass000.A1U(this.A01.A1I, A0S.A1I), "Media type mismatch");
            C626936e.A0D(AnonymousClass000.A1U(this.A01.A09, A0S.A09), "Origin mismatch");
            C626936e.A0D(AnonymousClass75J.A00(this.A01.A1w(), A0S.A1w()), "Caption mismatch");
            C626936e.A0D(AnonymousClass75J.A00(this.A01.A04, A0S.A04), "Hash mismatch");
            C626936e.A0D(AnonymousClass75J.A00(this.A01.A03, A0S.A03), "Encrypted hash mismatch");
            C626936e.A0D(AnonymousClass000.A1U(this.A01.A0B, A0S.A0B), "Duration mismatch");
            C626936e.A0D(AnonymousClass75J.A00(this.A01.A05, A0S.A05), "Mime mismatch");
            C626936e.A0D(AnonymousClass75J.A00(this.A01.A1x(), A0S.A1x()), "Name mismatch");
            C626936e.A0D(AnonymousClass75J.A00(this.A01.A08, A0S.A08), "Multicast id mismatch");
            C626936e.A06(r2);
            String str = r2.A0I;
            C626936e.A06(r3);
            C626936e.A0D(AnonymousClass75J.A00(str, r3.A0I), "Media Job Id mismatch");
        }
    }

    public boolean A04() {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            if (!AnonymousClass2z0.A0B(C18300x5.A0T(it))) {
                return true;
            }
        }
        return false;
    }

    public boolean A05() {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            if (AnonymousClass2z0.A0B(C18300x5.A0T(it))) {
                return true;
            }
        }
        return false;
    }

    public AnonymousClass30M(List list) {
        this.A02 = new CopyOnWriteArrayList(list);
        this.A01 = (C30471mV) list.get(0);
        A02();
    }

    public String A01() {
        StringBuilder A0o = AnonymousClass001.A0o();
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C624134x A0T = C18300x5.A0T(it);
            if (A0o.length() != 0) {
                A0o.append(',');
            }
            A0o.append(A0T.A1J);
        }
        return A0o.toString();
    }

    public AnonymousClass30M(List list, int i) {
        this.A02 = new CopyOnWriteArrayList(list);
        this.A00 = i;
        this.A01 = (C30471mV) list.get(0);
        A02();
    }
}
