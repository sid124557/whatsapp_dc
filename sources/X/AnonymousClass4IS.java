package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.4IS  reason: invalid class name */
public class AnonymousClass4IS implements Comparator {
    public Object A00;
    public final int A01;

    public AnonymousClass4IS(Map map, int i) {
        this.A01 = i;
        if (2 - i != 0) {
            this.A00 = map;
        } else {
            this.A00 = map;
        }
    }

    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        long j;
        switch (this.A01) {
            case 0:
                return AnonymousClass001.A0K(((AnonymousClass4GR) this.A00).invoke(obj, obj2));
            case 1:
                AnonymousClass66R r3 = ((C614130p) this.A00).A0B;
                Object A0V = C18280x3.A0V(obj, r3);
                int i3 = Integer.MAX_VALUE;
                if (A0V == null) {
                    A0V = Integer.MAX_VALUE;
                }
                Integer num = (Integer) A0V;
                Object A0V2 = C18280x3.A0V(obj2, r3);
                if (A0V2 != null) {
                    i3 = A0V2;
                }
                return AnonymousClass2A6.A00(num, i3);
            case 2:
                Map map = (Map) this.A00;
                return AnonymousClass2A6.A00((Comparable) map.get(obj2), (Comparable) map.get(obj));
            case 3:
                C56152rV r5 = ((AnonymousClass2S2) this.A00).A04;
                C624134x A02 = r5.A02(((AnonymousClass3ZH) obj2).A0H, true);
                long j2 = 0;
                if (A02 != null) {
                    j = A02.A0K;
                } else {
                    j = 0;
                }
                Long valueOf = Long.valueOf(j);
                C624134x A022 = r5.A02(((AnonymousClass3ZH) obj).A0H, true);
                if (A022 != null) {
                    j2 = A022.A0K;
                }
                return AnonymousClass2A6.A00(valueOf, Long.valueOf(j2));
            case 4:
                C52882mC r7 = (C52882mC) obj;
                C52882mC r8 = (C52882mC) obj2;
                int A05 = ((C56942so) this.A00).A06.A05(r7.A02, r8.A02);
                if (A05 == 0) {
                    return r7.A03.compareTo(r8.A03);
                }
                return A05;
            case 5:
                return AnonymousClass001.A0K(((AnonymousClass45W) ((AnonymousClass4GR) this.A00)).invoke(obj, obj2));
            case 6:
                Map map2 = (Map) this.A00;
                AnonymousClass31D r72 = (AnonymousClass31D) obj;
                AnonymousClass31D r82 = (AnonymousClass31D) obj2;
                if (r72 != r82) {
                    return -Long.compare(C18290x4.A0C(r72.A0C, map2), C18290x4.A0C(r82.A0C, map2));
                }
                return 0;
            case 7:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                String A0q = C18310x6.A0q(entry);
                String A0q2 = C18310x6.A0q(entry2);
                if (A0q.startsWith("m-")) {
                    i = 1;
                } else {
                    i = -1;
                    if (A0q.startsWith("w-")) {
                        i = 0;
                    }
                }
                if (A0q2.startsWith("m-")) {
                    i2 = 1;
                } else {
                    i2 = -1;
                    if (A0q2.startsWith("w-")) {
                        i2 = 0;
                    }
                }
                if (i != i2) {
                    return i - i2;
                }
                int compareTo = ((Long) entry.getValue()).compareTo((Long) entry2.getValue());
                if (compareTo == 0) {
                    return A0q.compareTo(A0q2);
                }
                return compareTo;
            case 8:
                return Integer.compare(((C60142y4) obj2).A00, ((C60142y4) obj).A00);
            default:
                for (AnonymousClass4GQ r0 : (AnonymousClass4GQ[]) this.A00) {
                    int A002 = AnonymousClass2A6.A00((Comparable) r0.invoke(obj), (Comparable) r0.invoke(obj2));
                    if (A002 != 0) {
                        return A002;
                    }
                }
                return 0;
        }
    }

    public AnonymousClass4IS(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
