package X;

import java.util.List;

/* renamed from: X.2o3  reason: invalid class name and case insensitive filesystem */
public final class C54022o3 {
    public final int A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final List A0A;
    public final boolean A0B;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54022o3) {
                C54022o3 r5 = (C54022o3) obj;
                if (this.A0B != r5.A0B || this.A00 != r5.A00 || !C162457s7.A0P(this.A07, r5.A07) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A06, r5.A06) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A0A, r5.A0A) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A08, r5.A08) || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A09, r5.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.A0A;
        return AnonymousClass002.A02(this.A09, (((((AnonymousClass000.A08(list, (((((((((((AnonymousClass0x9.A04(this.A0B) + this.A00) * 31) + C18270x1.A00(this.A07)) * 31) + AnonymousClass000.A07(this.A01)) * 31) + C18270x1.A00(this.A02)) * 31) + C18270x1.A00(this.A06)) * 31) + C18270x1.A00(this.A04)) * 31) + C18270x1.A00(this.A03)) * 31) + C18270x1.A00(this.A08)) * 31) + AnonymousClass0x7.A07(this.A05)) * 31);
    }

    public C54022o3(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, int i, boolean z) {
        this.A0B = z;
        this.A00 = i;
        this.A07 = str;
        this.A01 = bool;
        this.A02 = str2;
        this.A06 = str3;
        this.A04 = str4;
        this.A0A = list;
        this.A03 = str5;
        this.A08 = str6;
        this.A05 = str7;
        this.A09 = list2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UsyncBotResponseData(tagMatch=");
        A0o.append(this.A0B);
        A0o.append(", tag=");
        A0o.append(this.A00);
        A0o.append(", name=");
        A0o.append(this.A07);
        A0o.append(", isDefault=");
        A0o.append(this.A01);
        A0o.append(", attributes=");
        A0o.append(this.A02);
        A0o.append(", description=");
        A0o.append(this.A06);
        A0o.append(", category=");
        A0o.append(this.A04);
        A0o.append(", prompts=");
        A0o.append(this.A0A);
        A0o.append(", behaviorGraph=");
        A0o.append(this.A03);
        A0o.append(", personaId=");
        A0o.append(this.A08);
        A0o.append(", commandsDescription=");
        A0o.append(this.A05);
        A0o.append(", commands=");
        return C18260x0.A04(this.A09, A0o);
    }
}
