package X;

import java.util.List;
import java.util.Locale;

/* renamed from: X.0Oo  reason: invalid class name and case insensitive filesystem */
public class C04510Oo {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final long A08;
    public final AnonymousClass0QL A09;
    public final C01610Bn A0A;
    public final C01600Bm A0B;
    public final AnonymousClass0MC A0C;
    public final C09510gJ A0D;
    public final C02190Ff A0E;
    public final AnonymousClass0FS A0F;
    public final String A0G;
    public final String A0H;
    public final List A0I;
    public final List A0J;
    public final List A0K;
    public final boolean A0L;

    public String toString() {
        return A00("");
    }

    public C04510Oo(AnonymousClass0QL r3, C01610Bn r4, C01600Bm r5, AnonymousClass0MC r6, C09510gJ r7, C02190Ff r8, AnonymousClass0FS r9, String str, String str2, List list, List list2, List list3, float f, float f2, int i, int i2, int i3, int i4, int i5, long j, long j2, boolean z) {
        this.A0K = list;
        this.A09 = r3;
        this.A0G = str;
        this.A07 = j;
        this.A0E = r8;
        this.A08 = j2;
        this.A0H = str2;
        this.A0J = list2;
        this.A0D = r7;
        this.A06 = i;
        this.A05 = i2;
        this.A04 = i3;
        this.A01 = f;
        this.A00 = f2;
        this.A03 = i4;
        this.A02 = i5;
        this.A0B = r5;
        this.A0C = r6;
        this.A0I = list3;
        this.A0F = r9;
        this.A0A = r4;
        this.A0L = z;
    }

    public String A00(String str) {
        int i;
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append(this.A0G);
        A0l.append("\n");
        AnonymousClass0QL r2 = this.A09;
        long j = this.A08;
        C10550i7 r5 = r2.A05;
        C04510Oo r1 = (C04510Oo) r5.A05(j, (Object) null);
        if (r1 != null) {
            String str2 = "\t\tParents: ";
            while (true) {
                A0l.append(str2);
                A0l.append(r1.A0G);
                r1 = (C04510Oo) r5.A05(r1.A08, (Object) null);
                if (r1 == null) {
                    break;
                }
                str2 = "->";
            }
            A0l.append(str);
            A0l.append("\n");
        }
        List list = this.A0J;
        if (!list.isEmpty()) {
            A0l.append(str);
            AnonymousClass000.A1H("\tMasks: ", A0l, list);
            A0l.append("\n");
        }
        int i2 = this.A06;
        if (!(i2 == 0 || (i = this.A05) == 0)) {
            A0l.append(str);
            A0l.append("\tBackground: ");
            Locale locale = Locale.US;
            Object[] objArr = new Object[3];
            AnonymousClass000.A1L(objArr, i2);
            AnonymousClass000.A1M(objArr, i);
            AnonymousClass000.A1N(objArr, this.A04);
            A0l.append(String.format(locale, "%dx%d %X\n", objArr));
        }
        List list2 = this.A0K;
        if (!list2.isEmpty()) {
            A0l.append(str);
            A0l.append("\tShapes:\n");
            for (Object next : list2) {
                A0l.append(str);
                AnonymousClass000.A17(next, "\t\t", "\n", A0l);
            }
        }
        return A0l.toString();
    }
}
