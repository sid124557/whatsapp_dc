package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2rC  reason: invalid class name and case insensitive filesystem */
public final class C55962rC {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final long A05;
    public final C51542jz A06;
    public final C624034w A07;
    public final C95814uZ A08;
    public final UserJid A09;
    public final AnonymousClass1EF A0A;
    public final AnonymousClass1EU A0B;
    public final AnonymousClass1EU A0C;
    public final AnonymousClass2z0 A0D;
    public final Long A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;

    public static AnonymousClass1EU A01(C55962rC r1) {
        C162457s7.A0J(r1, 0);
        return r1.A0B;
    }

    public final C55962rC A02(AnonymousClass1EU r46) {
        AnonymousClass1EU r22 = r46;
        C162457s7.A0J(r22, 0);
        AnonymousClass1EU r23 = this.A0C;
        AnonymousClass1EF r21 = this.A0A;
        C624034w r44 = this.A07;
        AnonymousClass2z0 r24 = this.A0D;
        C95814uZ r43 = this.A08;
        long j = this.A05;
        boolean z = this.A0M;
        boolean z2 = this.A0N;
        boolean z3 = this.A0O;
        int i = this.A00;
        Long l = this.A0E;
        int i2 = this.A01;
        String str = this.A0J;
        String str2 = this.A0L;
        String str3 = this.A0G;
        String str4 = this.A0H;
        String str5 = this.A0K;
        String str6 = this.A0I;
        String str7 = this.A0F;
        UserJid userJid = this.A09;
        C51542jz r3 = this.A06;
        return new C55962rC(r3, r44, r43, userJid, r21, r22, r23, r24, l, str, str2, str3, str4, str5, str6, str7, i, i2, j, z, z2, z3, this.A04, this.A03, this.A02);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C55962rC) {
                C55962rC r8 = (C55962rC) obj;
                if (!C162457s7.A0P(this.A0B, r8.A0B) || !C162457s7.A0P(this.A0C, r8.A0C) || !C162457s7.A0P(this.A0A, r8.A0A) || !C162457s7.A0P(this.A07, r8.A07) || !C162457s7.A0P(this.A0D, r8.A0D) || !C162457s7.A0P(this.A08, r8.A08) || this.A05 != r8.A05 || this.A0M != r8.A0M || this.A0N != r8.A0N || this.A0O != r8.A0O || this.A00 != r8.A00 || !C162457s7.A0P(this.A0E, r8.A0E) || this.A01 != r8.A01 || !C162457s7.A0P(this.A0J, r8.A0J) || !C162457s7.A0P(this.A0L, r8.A0L) || !C162457s7.A0P(this.A0G, r8.A0G) || !C162457s7.A0P(this.A0H, r8.A0H) || !C162457s7.A0P(this.A0K, r8.A0K) || !C162457s7.A0P(this.A0I, r8.A0I) || !C162457s7.A0P(this.A0F, r8.A0F) || !C162457s7.A0P(this.A09, r8.A09) || !C162457s7.A0P(this.A06, r8.A06) || this.A04 != r8.A04 || this.A03 != r8.A03 || this.A02 != r8.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static AnonymousClass1EM A00(C55962rC r0) {
        AnonymousClass1EM r02 = r0.A0B.protocolMessage_;
        if (r02 == null) {
            return AnonymousClass1EM.DEFAULT_INSTANCE;
        }
        return r02;
    }

    public final C30351mJ A03(int i) {
        C30351mJ A002 = C30351mJ.A00(this.A0C, this.A0D, this.A05);
        A002.A00 = i;
        return A002;
    }

    public final boolean A04() {
        if (this.A0N || this.A0O) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int A042 = C18300x5.A04(this.A0B);
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass0x2.A01((((((((((((((((((((((((AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass000.A00((AnonymousClass000.A08(this.A0D, (((AnonymousClass000.A08(this.A0C, A042) + AnonymousClass000.A07(this.A0A)) * 31) + AnonymousClass000.A07(this.A07)) * 31) + AnonymousClass000.A07(this.A08)) * 31, this.A05), this.A0M), this.A0N), this.A0O) + this.A00) * 31) + AnonymousClass000.A07(this.A0E)) * 31) + this.A01) * 31) + C18270x1.A00(this.A0J)) * 31) + C18270x1.A00(this.A0L)) * 31) + C18270x1.A00(this.A0G)) * 31) + C18270x1.A00(this.A0H)) * 31) + C18270x1.A00(this.A0K)) * 31) + C18270x1.A00(this.A0I)) * 31) + C18270x1.A00(this.A0F)) * 31) + AnonymousClass000.A07(this.A09)) * 31) + C18310x6.A07(this.A06)) * 31, this.A04), this.A03), this.A02);
    }

    public C55962rC(C51542jz r3, C624034w r4, C95814uZ r5, UserJid userJid, AnonymousClass1EF r7, AnonymousClass1EU r8, AnonymousClass1EU r9, AnonymousClass2z0 r10, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A0B = r8;
        this.A0C = r9;
        this.A0A = r7;
        this.A07 = r4;
        this.A0D = r10;
        this.A08 = r5;
        this.A05 = j;
        this.A0M = z;
        this.A0N = z2;
        this.A0O = z3;
        this.A00 = i;
        this.A0E = l;
        this.A01 = i2;
        this.A0J = str;
        this.A0L = str2;
        this.A0G = str3;
        this.A0H = str4;
        this.A0K = str5;
        this.A0I = str6;
        this.A0F = str7;
        this.A09 = userJid;
        this.A06 = r3;
        this.A04 = z4;
        this.A03 = z5;
        this.A02 = z6;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ParseE2EMessageParams(e2eMessage=");
        A0o.append(this.A0B);
        A0o.append(", originalE2eMessage=");
        A0o.append(this.A0C);
        A0o.append(", contextInfo=");
        A0o.append(this.A0A);
        A0o.append(", paymentTransactionInfo=");
        A0o.append(this.A07);
        A0o.append(", messageKey=");
        A0o.append(this.A0D);
        A0o.append(", chatJid=");
        C18310x6.A1J(this.A08, A0o);
        A0o.append(this.A05);
        A0o.append(", includeQuotedMessage=");
        A0o.append(this.A0M);
        A0o.append(", isHistorySyncMessage=");
        A0o.append(this.A0N);
        A0o.append(", isQuotedMessage=");
        A0o.append(this.A0O);
        A0o.append(", durationSeconds=");
        A0o.append(this.A00);
        A0o.append(", csatTriggerExpiryMillis=");
        A0o.append(this.A0E);
        A0o.append(", editedVersion=");
        A0o.append(this.A01);
        A0o.append(", messageTypeAttribute=");
        A0o.append(this.A0J);
        A0o.append(", pollTypeAttribute=");
        A0o.append(this.A0L);
        A0o.append(", counterAbuseToken=");
        A0o.append(this.A0G);
        A0o.append(", hsmCategory=");
        A0o.append(this.A0H);
        A0o.append(", nativeFlowName=");
        A0o.append(this.A0K);
        A0o.append(", hsmTag=");
        A0o.append(this.A0I);
        A0o.append(", commentThreadMsgId=");
        A0o.append(this.A0F);
        A0o.append(", commentMsgSenderJid=");
        A0o.append(this.A09);
        A0o.append(", reportingInfo=");
        A0o.append(this.A06);
        A0o.append(", skipCommentFlagProcessing=");
        A0o.append(this.A04);
        A0o.append(", maskLinkedDevices=");
        A0o.append(this.A03);
        A0o.append(", isPremiumMessage=");
        return C18260x0.A0A(A0o, this.A02);
    }
}
