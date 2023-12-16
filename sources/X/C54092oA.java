package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.2oA  reason: invalid class name and case insensitive filesystem */
public final class C54092oA {
    public long A00 = 1;
    public final int A01;
    public final C50662iZ A02;
    public final Jid A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54092oA) {
                C54092oA r8 = (C54092oA) obj;
                if (this.A00 != r8.A00 || this.A01 != r8.A01 || !C162457s7.A0P(this.A03, r8.A03) || !C162457s7.A0P(this.A08, r8.A08) || !C162457s7.A0P(this.A09, r8.A09) || !C162457s7.A0P(this.A0A, r8.A0A) || !C162457s7.A0P(this.A07, r8.A07) || this.A0D != r8.A0D || !C162457s7.A0P(this.A0B, r8.A0B) || this.A0C != r8.A0C || !C162457s7.A0P(this.A06, r8.A06) || !C162457s7.A0P(this.A05, r8.A05) || !C162457s7.A0P(this.A04, r8.A04) || !C162457s7.A0P(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C54092oA(C50662iZ r3, Jid jid, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z, boolean z2) {
        this.A01 = i;
        this.A03 = jid;
        this.A08 = str;
        this.A09 = str2;
        this.A0A = str3;
        this.A07 = str4;
        this.A0D = z;
        this.A0B = str5;
        this.A0C = z2;
        this.A06 = str6;
        this.A05 = str7;
        this.A04 = str8;
        this.A02 = r3;
    }

    public int hashCode() {
        return ((((((AnonymousClass0x2.A01(AnonymousClass0x2.A07(this.A0B, AnonymousClass0x2.A01((AnonymousClass0x2.A07(this.A0A, AnonymousClass0x2.A07(this.A09, AnonymousClass0x2.A07(this.A08, AnonymousClass000.A08(this.A03, (AnonymousClass0x2.A02(this.A00) + this.A01) * 31)))) + C18270x1.A00(this.A07)) * 31, this.A0D)), this.A0C) + C18270x1.A00(this.A06)) * 31) + C18270x1.A00(this.A05)) * 31) + C18270x1.A00(this.A04)) * 31) + C18310x6.A07(this.A02);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ExtensionsScreenProgressReportMetadata(sequenceNumber=");
        A0o.append(this.A00);
        A0o.append(", bizPlatform=");
        A0o.append(this.A01);
        A0o.append(", businessOwnerJid=");
        A0o.append(this.A03);
        A0o.append(", extensionsFlowId=");
        A0o.append(this.A08);
        A0o.append(", extensionsMessageId=");
        A0o.append(this.A09);
        A0o.append(", extensionsSessionId=");
        A0o.append(this.A0A);
        A0o.append(", extensionsCategories=");
        A0o.append(this.A07);
        A0o.append(", isTemplate=");
        A0o.append(this.A0D);
        A0o.append(", hsmTag=");
        A0o.append(this.A0B);
        A0o.append(", extensionRestoredFromCache=");
        A0o.append(this.A0C);
        A0o.append(", extensionStatus=");
        A0o.append(this.A06);
        A0o.append(", entryPointConversionSource=");
        A0o.append(this.A05);
        A0o.append(", entryPointConversionApp=");
        A0o.append(this.A04);
        A0o.append(", entryPointMetaData=");
        return C18260x0.A04(this.A02, A0o);
    }
}
