package X;

import java.util.List;

/* renamed from: X.5TL  reason: invalid class name */
public final class AnonymousClass5TL {
    public final C104715Sb A00;
    public final AnonymousClass58D A01;
    public final C997458a A02;
    public final C986752u A03;
    public final AnonymousClass535 A04;
    public final AnonymousClass5ZA A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public AnonymousClass5TL(C104715Sb r2, AnonymousClass58D r3, C997458a r4, C986752u r5, AnonymousClass535 r6, AnonymousClass5ZA r7, List list, List list2, List list3, boolean z, boolean z2, boolean z3) {
        C162457s7.A0J(r3, 6);
        C162457s7.A0J(r4, 10);
        this.A0A = z;
        this.A05 = r7;
        this.A07 = list;
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = r6;
        this.A06 = list2;
        this.A08 = list3;
        this.A02 = r4;
        this.A09 = z2;
        this.A0B = z3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5TL) {
                AnonymousClass5TL r5 = (AnonymousClass5TL) obj;
                if (this.A0A != r5.A0A || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A07, r5.A07) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A00, r5.A00) || this.A01 != r5.A01 || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A06, r5.A06) || !C162457s7.A0P(this.A08, r5.A08) || this.A02 != r5.A02 || this.A09 != r5.A09 || this.A0B != r5.A0B) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        AnonymousClass58D r0 = this.A01;
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass000.A08(this.A02, (((((AnonymousClass000.A08(r0, (((((((AnonymousClass0x9.A04(this.A0A) + AnonymousClass000.A07(this.A05)) * 31) + AnonymousClass000.A07(this.A07)) * 31) + AnonymousClass000.A07(this.A03)) * 31) + AnonymousClass000.A07(this.A00)) * 31) + AnonymousClass000.A07(this.A04)) * 31) + AnonymousClass000.A07(this.A06)) * 31) + C18310x6.A07(this.A08)) * 31), this.A09), this.A0B);
    }

    public String toString() {
        int i;
        Integer num;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UiState: statusUpdates = ");
        AnonymousClass5ZA r1 = this.A05;
        int i2 = 0;
        if (r1 != null) {
            int size = r1.A05.size() + r1.A06.size();
            int i3 = 1;
            if (r1.A03.A00() == null) {
                i3 = 0;
            }
            i = size + i3;
        } else {
            i = 0;
        }
        A0o.append(i);
        A0o.append(", newsletters = ");
        List list = this.A07;
        if (list != null) {
            i2 = list.size();
        }
        A0o.append(i2);
        A0o.append(" recommended = ");
        AnonymousClass535 r0 = this.A04;
        if (r0 != null) {
            num = AnonymousClass0x9.A0l(r0.A00);
        } else {
            num = null;
        }
        A0o.append(num);
        return AnonymousClass000.A0X("  ", A0o);
    }
}
