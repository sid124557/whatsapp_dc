package X;

import java.util.Comparator;

/* renamed from: X.9pa  reason: invalid class name and case insensitive filesystem */
public class C204579pa implements Comparator {
    public final int A00;

    public C204579pa(int i) {
        this.A00 = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                return ((C166587yw) obj).A0A.compareTo(((C166587yw) obj2).A0A);
            case 1:
                String A0C = ((C133766hu) obj).A0C();
                C626936e.A06(A0C);
                String A0C2 = ((C133766hu) obj2).A0C();
                C626936e.A06(A0C2);
                return A0C.compareTo(A0C2);
            case 2:
                return Long.compare(((C624034w) obj2).A06, ((C624034w) obj).A06);
            case 3:
                return (int) (((C624034w) obj2).A05 - ((C624034w) obj).A05);
            default:
                return AnonymousClass2A6.A00(AnonymousClass0x9.A0l(((C632638o) obj).A02), AnonymousClass0x9.A0l(((C632638o) obj2).A02));
        }
    }
}
