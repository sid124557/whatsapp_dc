package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.2o1  reason: invalid class name and case insensitive filesystem */
public final class C54002o1 {
    public final int A00;
    public final UserJid A01;
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

    public C54002o1(UserJid userJid, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, int i, boolean z) {
        AnonymousClass0x2.A1A(str, 3, str2);
        C18260x0.A0U(str3, str4);
        this.A01 = userJid;
        this.A00 = i;
        this.A07 = str;
        this.A0B = z;
        this.A02 = str2;
        this.A06 = str3;
        this.A04 = str4;
        this.A0A = list;
        this.A03 = str5;
        this.A08 = str6;
        this.A05 = str7;
        this.A09 = list2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54002o1) {
                C54002o1 r5 = (C54002o1) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00 || !C162457s7.A0P(this.A07, r5.A07) || this.A0B != r5.A0B || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A06, r5.A06) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A0A, r5.A0A) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A08, r5.A08) || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A09, r5.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A072 = AnonymousClass0x2.A07(this.A04, AnonymousClass0x2.A07(this.A06, AnonymousClass0x2.A07(this.A02, AnonymousClass0x2.A01(AnonymousClass0x2.A07(this.A07, (C18300x5.A04(this.A01) + this.A00) * 31), this.A0B))));
        return AnonymousClass002.A02(this.A09, (((((AnonymousClass000.A08(this.A0A, A072) + C18270x1.A00(this.A03)) * 31) + C18270x1.A00(this.A08)) * 31) + AnonymousClass0x7.A07(this.A05)) * 31);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BotProfile(userJid=");
        A0o.append(this.A01);
        A0o.append(", tag=");
        A0o.append(this.A00);
        A0o.append(", name=");
        A0o.append(this.A07);
        A0o.append(", isDefault=");
        A0o.append(this.A0B);
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
