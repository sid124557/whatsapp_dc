package X;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;

/* renamed from: X.8La  reason: invalid class name */
public final class AnonymousClass8La implements Comparable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final C126806Pj A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    /* renamed from: A00 */
    public int compareTo(AnonymousClass8La r8) {
        AnonymousClass8NS r6;
        AnonymousClass8NS reverse;
        AnonymousClass8NS r0;
        boolean z = this.A0C;
        if (!z || !this.A0D) {
            r6 = C126816Pk.A03;
            reverse = r6.reverse();
        } else {
            r6 = C126816Pk.A03;
            reverse = r6;
        }
        C162027r4 A002 = AnonymousClass8NS.A00(AnonymousClass8NS.A00(C162027r4.start().compareFalseFirst(this.A0D, r8.A0D), Integer.valueOf(this.A04), r8.A04).compare(this.A05, r8.A05).compare(this.A07, r8.A07).compareFalseFirst(z, r8.A0C), Integer.valueOf(this.A06), r8.A06);
        Integer valueOf = Integer.valueOf(this.A00);
        Integer valueOf2 = Integer.valueOf(r8.A00);
        if (this.A09.A0Q) {
            r0 = r6.reverse();
        } else {
            r0 = C126816Pk.A04;
        }
        C162027r4 compare = AnonymousClass8NS.A00(A002.compare(valueOf, valueOf2, r0).compareFalseFirst(this.A0B, r8.A0B), Integer.valueOf(this.A02), r8.A02).compare(this.A03, r8.A03).compare(Integer.valueOf(this.A01), Integer.valueOf(r8.A01), reverse).compare(Integer.valueOf(this.A08), Integer.valueOf(r8.A08), reverse);
        if (!C162387ry.A0D(this.A0A, r8.A0A)) {
            reverse = C126816Pk.A04;
        }
        return compare.compare(valueOf, valueOf2, reverse).result();
    }

    public AnonymousClass8La(C166527yp r8, C126806Pj r9, int i) {
        int i2;
        int i3;
        int length;
        int i4;
        this.A09 = r9;
        String str = r8.A0S;
        this.A0A = (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) ? null : str;
        int i5 = 0;
        this.A0D = AnonymousClass6C8.A1O(i);
        int i6 = 0;
        while (true) {
            C129586aY r1 = r9.A03;
            i2 = Integer.MAX_VALUE;
            if (i6 >= r1.size()) {
                i6 = Integer.MAX_VALUE;
                i3 = 0;
                break;
            }
            i3 = C126816Pk.A00(r8, AnonymousClass001.A0n(r1, i6), false);
            if (i3 > 0) {
                break;
            }
            i6++;
        }
        this.A04 = i6;
        this.A05 = i3;
        this.A07 = Integer.bitCount(r8.A0D & r9.A01);
        boolean z = true;
        this.A0B = AnonymousClass000.A1S(r8.A0G & 1);
        int i7 = r8.A06;
        this.A01 = i7;
        this.A08 = r8.A0F;
        int i8 = r8.A05;
        this.A00 = i8;
        if ((i8 != -1 && i8 > r9.A00) || (i7 != -1 && i7 > r9.A01)) {
            z = false;
        }
        this.A0C = z;
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] A0E = C162387ry.A01 >= 24 ? C162387ry.A0E(configuration) : new String[]{configuration.locale.toLanguageTag()};
        int i9 = 0;
        while (true) {
            length = A0E.length;
            if (i9 >= length) {
                break;
            }
            A0E[i9] = C162387ry.A08(A0E[i9]);
            i9++;
        }
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                i4 = C126816Pk.A00(r8, A0E[i10], false);
                if (i4 > 0) {
                    break;
                }
                i10++;
            } else {
                i10 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
        }
        this.A02 = i10;
        this.A03 = i4;
        while (true) {
            C129586aY r2 = r9.A0E;
            if (i5 < r2.size()) {
                String str2 = r8.A0T;
                if (str2 != null && str2.equals(r2.get(i5))) {
                    i2 = i5;
                    break;
                }
                i5++;
            } else {
                break;
            }
        }
        this.A06 = i2;
    }
}
