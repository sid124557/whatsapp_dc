package X;

/* renamed from: X.0iA  reason: invalid class name and case insensitive filesystem */
public class C10580iA implements Comparable {
    public AnonymousClass05I A00;
    public C04700Qh A01;
    public final /* synthetic */ AnonymousClass05I A02;

    public C10580iA(AnonymousClass05I r1, AnonymousClass05I r2) {
        this.A02 = r1;
        this.A00 = r2;
    }

    public int compareTo(Object obj) {
        return this.A01.A02 - ((C04700Qh) obj).A02;
    }

    public String toString() {
        String str = "[ ";
        if (this.A01 != null) {
            int i = 0;
            do {
                StringBuilder A0l = AnonymousClass000.A0l(str);
                A0l.append(this.A01.A09[i]);
                str = AnonymousClass000.A0X(" ", A0l);
                i++;
            } while (i < 9);
        }
        StringBuilder A0l2 = AnonymousClass000.A0l(str);
        A0l2.append("] ");
        return AnonymousClass000.A0R(this.A01, A0l2);
    }
}
