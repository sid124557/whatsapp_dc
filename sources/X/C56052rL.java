package X;

import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.2rL  reason: invalid class name and case insensitive filesystem */
public class C56052rL {
    public String A00;
    public byte[] A01;
    public final List A02 = AnonymousClass001.A0s();
    public final List A03 = AnonymousClass001.A0s();

    public static C56052rL A00() {
        C56052rL r3 = new C56052rL("iq");
        r3.A0G(new AnonymousClass39V((Jid) C135206kI.A00, "to"));
        return r3;
    }

    public static C56052rL A01() {
        return new C56052rL("iq");
    }

    public static C56052rL A02() {
        return new C56052rL("message");
    }

    public static C56052rL A04(String str) {
        return new C56052rL(str);
    }

    public static void A06(Jid jid, C56052rL r2, String str) {
        r2.A0G(new AnonymousClass39V(jid, str));
    }

    public static void A09(C56052rL r0, C56052rL r1, byte[] bArr) {
        r0.A01 = bArr;
        r1.A0H(r0.A0F());
    }

    public static void A0B(C56052rL r1, String str, int i) {
        r1.A0G(new AnonymousClass39V(str, i));
    }

    public static void A0C(C56052rL r1, String str, long j) {
        r1.A0G(new AnonymousClass39V(str, j));
    }

    public static void A0D(C56052rL r1, String str, String str2) {
        r1.A0G(new AnonymousClass39V(str, str2));
    }

    public static void A0E(C56052rL r3, String str, String str2) {
        r3.A0G(new AnonymousClass39V(str, str2));
        r3.A0G(new AnonymousClass39V((Jid) C135206kI.A00, "to"));
    }

    public AnonymousClass36K A0F() {
        AnonymousClass36K[] r1;
        List list = this.A02;
        AnonymousClass39V[] r3 = null;
        if (!list.isEmpty()) {
            r3 = (AnonymousClass39V[]) list.toArray(new AnonymousClass39V[0]);
        }
        List list2 = this.A03;
        if (list2.isEmpty() || (r1 = (AnonymousClass36K[]) list2.toArray(new AnonymousClass36K[0])) == null) {
            return new AnonymousClass36K(this.A00, this.A01, r3);
        }
        return AnonymousClass36K.A0J(this.A00, r3, r1);
    }

    public void A0G(AnonymousClass39V r2) {
        this.A02.add(r2);
    }

    public void A0H(AnonymousClass36K r2) {
        if (r2 != null) {
            this.A03.add(r2);
        }
    }

    public void A0I(AnonymousClass36K r12) {
        int length;
        String str = this.A00;
        if ("smax:any".equals(str)) {
            str = r12.A00;
            this.A00 = str;
        }
        String str2 = r12.A00;
        if (!str.equals(str2) && !"smax:any".equals(str2)) {
            Object[] A0M = AnonymousClass002.A0M();
            AnonymousClass000.A16(str, str2, A0M);
            C626936e.A0D(false, String.format("Error merging <%s/> with <%s/>: conflicting tags", A0M));
        }
        AnonymousClass39V[] A0u = r12.A0u();
        if (A0u != null) {
            for (AnonymousClass39V r8 : A0u) {
                String str3 = r8.A02;
                List list = this.A02;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        list.add(r8);
                        break;
                    }
                    AnonymousClass39V r1 = (AnonymousClass39V) it.next();
                    if (r1.A02.equals(str3)) {
                        if (!r8.equals(r1)) {
                            Object[] A0M2 = AnonymousClass002.A0M();
                            A0M2[0] = r8.A02;
                            A0M2[1] = this.A00;
                            C18300x5.A1N("Error merging attribute '%s' in <%s/>: conflicting values", A0M2);
                        }
                    }
                }
            }
        }
        AnonymousClass36K[] r6 = r12.A03;
        if (!(r6 == null || (length = r6.length) == 0)) {
            int i = 0;
            if (this.A01 != null) {
                Object[] A0L = AnonymousClass002.A0L();
                A0L[0] = this.A00;
                C18300x5.A1N("Error merging children into <%s/>: element already has data", A0L);
            }
            List list2 = this.A03;
            if (!list2.isEmpty()) {
                AnonymousClass3AF r3 = new AnonymousClass3AF();
                HashMap A0t = AnonymousClass001.A0t();
                for (Object next : list2) {
                    ((List) C18310x6.A0h(r3.apply(next), A0t)).add(next);
                }
                List asList = Arrays.asList(r6);
                AnonymousClass3AF r32 = new AnonymousClass3AF();
                HashMap A0t2 = AnonymousClass001.A0t();
                for (Object next2 : asList) {
                    ((List) C18310x6.A0h(r32.apply(next2), A0t2)).add(next2);
                }
                Iterator A0q = AnonymousClass000.A0q(A0t);
                while (A0q.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0q);
                    if (A0t2.containsKey(A0w.getKey())) {
                        int A06 = C18290x4.A06(A0w);
                        List list3 = (List) AnonymousClass0x7.A0k(A0w, A0t2);
                        Objects.requireNonNull(list3);
                        if (A06 != list3.size()) {
                            Object[] A0M3 = AnonymousClass002.A0M();
                            A0M3[0] = this.A00;
                            A0M3[1] = A0w.getKey();
                            C18300x5.A1N("Error merging children into <%s/>: conflicting child count for <%s/>", A0M3);
                        }
                    }
                }
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    AnonymousClass36K A0Y = C18310x6.A0Y(it2);
                    String str4 = A0Y.A00;
                    if (A0t2.containsKey(str4)) {
                        List A0s2 = C18320x8.A0s(str4, A0t2);
                        Objects.requireNonNull(A0s2);
                        AnonymousClass36K r62 = (AnonymousClass36K) A0s2.remove(0);
                        C56052rL A04 = A04(str4);
                        AnonymousClass36K[] r0 = A0Y.A03;
                        if (r0 != null) {
                            A04.A03.addAll(Arrays.asList(r0));
                        }
                        AnonymousClass39V[] A0u2 = A0Y.A0u();
                        if (A0u2 != null) {
                            A04.A02.addAll(Arrays.asList(A0u2));
                        }
                        A04.A01 = A0Y.A01;
                        A04.A0I(r62);
                        A0Y = A04.A0F();
                    }
                    A0s.add(A0Y);
                }
                Iterator A0q2 = AnonymousClass000.A0q(A0t2);
                while (A0q2.hasNext()) {
                    Map.Entry A0w2 = AnonymousClass001.A0w(A0q2);
                    if (!A0t.containsKey(A0w2.getKey())) {
                        A0s.addAll((Collection) A0w2.getValue());
                    }
                }
                list2.clear();
                list2.addAll(A0s);
            } else {
                do {
                    list2.add(r6[i]);
                    i++;
                } while (i < length);
            }
        }
        byte[] bArr = r12.A01;
        if (bArr != null) {
            if (!this.A03.isEmpty()) {
                C18300x5.A1N("Error merging data into <%s/>: element already has children", new Object[]{this.A00});
            }
            byte[] bArr2 = this.A01;
            if (bArr2 != null && !Arrays.equals(bArr2, bArr)) {
                C18300x5.A1N("Error merging data into <%s/>: conflicting values", new Object[]{this.A00});
            }
            this.A01 = bArr;
        }
    }

    public void A0J(String str) {
        byte[] bytes;
        if (str == null) {
            bytes = null;
        } else {
            bytes = str.getBytes();
        }
        this.A01 = bytes;
    }

    public void A0K(String str, String str2, List list) {
        if (str != null) {
            A0L(str, str2, list);
        }
    }

    public C56052rL(String str) {
        this.A00 = str;
    }

    public static C56052rL A03() {
        return new C56052rL("smax:any");
    }

    public static void A05(C56612sH r3, C56052rL r4, C56052rL r5) {
        r4.A0J(String.valueOf(r3.A0H() / ((long) 1000)));
        r5.A0H(r4.A0F());
    }

    public static void A07(C56052rL r0, C56052rL r1) {
        r1.A0H(r0.A0F());
    }

    public static void A08(C56052rL r0, C56052rL r1, String str) {
        r0.A0J(str);
        r1.A0H(r0.A0F());
    }

    public static void A0A(C56052rL r3, Number number, String str) {
        r3.A0G(new AnonymousClass39V(str, number.longValue()));
    }

    public void A0L(String str, String str2, List list) {
        if (!list.contains(str)) {
            Object[] A0L = AnonymousClass002.A0L();
            A0L[0] = TextUtils.join(", ", list);
            C626936e.A0D(false, String.format("String was expected to be one of '%s'.", A0L));
        }
        A0D(this, str2, str);
    }
}
