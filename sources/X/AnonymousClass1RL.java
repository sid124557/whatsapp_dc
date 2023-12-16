package X;

import java.util.List;

/* renamed from: X.1RL  reason: invalid class name */
public final class AnonymousClass1RL extends AnonymousClass31A {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public C129586aY A06;
    public C372821q A07;
    public AnonymousClass599 A08;
    public C372921r A09;
    public C371421c A0A;
    public C372321l A0B;
    public C371621e A0C;
    public Long A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public final long A0O;
    public final AnonymousClass31A A0P;
    public final List A0Q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1RL(C129586aY r3, AnonymousClass31A r4, C372821q r5, AnonymousClass599 r6, C372921r r7, C371421c r8, C372321l r9, C371621e r10, Long l, String str, String str2, String str3, String str4, String str5, String str6, List list, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, boolean z4) {
        super(r4);
        C162457s7.A0J(r4, 2);
        C162457s7.A0J(r5, 15);
        C162457s7.A0J(r8, 16);
        C162457s7.A0J(r10, 17);
        C162457s7.A0J(r9, 21);
        C162457s7.A0J(r7, 23);
        C162457s7.A0J(r6, 27);
        this.A00 = j;
        this.A0P = r4;
        this.A0H = str;
        this.A02 = j2;
        this.A0E = str2;
        this.A01 = j3;
        this.A0J = str3;
        this.A03 = j4;
        this.A0I = str4;
        this.A04 = j5;
        this.A0O = j6;
        this.A0F = str5;
        this.A0G = str6;
        this.A05 = j7;
        this.A07 = r5;
        this.A0A = r8;
        this.A0C = r10;
        this.A0L = z;
        this.A0Q = list;
        this.A0M = z2;
        this.A0B = r9;
        this.A0K = z3;
        this.A09 = r7;
        this.A06 = r3;
        this.A0D = l;
        this.A0N = z4;
        this.A08 = r6;
        this.A0h = str;
    }

    public final boolean A0M(AnonymousClass5UP r4) {
        C162457s7.A0J(r4, 0);
        if (!C18300x5.A1S(r4) || !r4.A01.A0Y(C58422vE.A02, 3149) || this.A0B != C372321l.SUSPENDED) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1RL) {
                AnonymousClass1RL r8 = (AnonymousClass1RL) obj;
                if (!(this.A00 == r8.A00 && C162457s7.A0P(this.A0P, r8.A0P) && C162457s7.A0P(this.A0H, r8.A0H) && this.A02 == r8.A02 && C162457s7.A0P(this.A0E, r8.A0E) && this.A01 == r8.A01 && C162457s7.A0P(this.A0J, r8.A0J) && this.A03 == r8.A03 && C162457s7.A0P(this.A0I, r8.A0I) && this.A04 == r8.A04 && this.A0O == r8.A0O && C162457s7.A0P(this.A0F, r8.A0F) && C162457s7.A0P(this.A0G, r8.A0G) && this.A05 == r8.A05 && this.A07 == r8.A07 && this.A0A == r8.A0A && this.A0C == r8.A0C && this.A0L == r8.A0L && C162457s7.A0P(this.A0Q, r8.A0Q) && this.A0M == r8.A0M && this.A0B == r8.A0B && this.A0K == r8.A0K && this.A09 == r8.A09 && C162457s7.A0P(this.A06, r8.A06) && C162457s7.A0P(this.A0D, r8.A0D) && this.A0N == r8.A0N && this.A08 == r8.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void A0J(AnonymousClass1RL r3) {
        if (r3 != null) {
            this.A0U = r3.A0U;
            this.A0V = r3.A0V;
            this.A0N = r3.A0N;
            this.A0O = r3.A0O;
            this.A0X = r3.A0X;
            this.A0d = r3.A0d;
            this.A0c = r3.A0c;
            this.A08 = r3.A08;
        }
    }

    public final boolean A0K() {
        if (this.A0K) {
            return false;
        }
        C372821q r1 = this.A07;
        if (r1 == C372821q.ADMIN || r1 == C372821q.OWNER) {
            return true;
        }
        return false;
    }

    public final boolean A0L() {
        return AnonymousClass000.A1Y(this.A0C, C371621e.VERIFIED);
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A08, AnonymousClass0x2.A01((((AnonymousClass000.A08(this.A09, AnonymousClass0x2.A01(AnonymousClass000.A08(this.A0B, AnonymousClass0x2.A01(AnonymousClass000.A08(this.A0Q, AnonymousClass0x2.A01(AnonymousClass000.A08(this.A0C, AnonymousClass000.A08(this.A0A, AnonymousClass000.A08(this.A07, AnonymousClass000.A00((((AnonymousClass000.A00(AnonymousClass000.A00((AnonymousClass000.A00((AnonymousClass000.A00((AnonymousClass000.A00((AnonymousClass000.A08(this.A0P, AnonymousClass0x2.A02(this.A00)) + C18270x1.A00(this.A0H)) * 31, this.A02) + C18270x1.A00(this.A0E)) * 31, this.A01) + C18270x1.A00(this.A0J)) * 31, this.A03) + C18270x1.A00(this.A0I)) * 31, this.A04), this.A0O) + C18270x1.A00(this.A0F)) * 31) + C18270x1.A00(this.A0G)) * 31, this.A05)))), this.A0L)), this.A0M)), this.A0K)) + AnonymousClass000.A07(this.A06)) * 31) + C18310x6.A07(this.A0D)) * 31, this.A0N));
    }

    public final C95804uY A0I() {
        C95814uZ A052 = A05();
        C162457s7.A0K(A052, "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid");
        return (C95804uY) A052;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NewsletterInfo(chatRowId=");
        A0o.append(this.A00);
        A0o.append(", chatInfo=");
        A0o.append(this.A0P);
        A0o.append(", name=");
        A0o.append(this.A0H);
        A0o.append(", nameId=");
        A0o.append(this.A02);
        A0o.append(", description=");
        A0o.append(this.A0E);
        A0o.append(", descriptionId=");
        A0o.append(this.A01);
        A0o.append(", pictureUrl=");
        A0o.append(this.A0J);
        A0o.append(", pictureId=");
        A0o.append(this.A03);
        A0o.append(", picturePreviewUrl=");
        A0o.append(this.A0I);
        A0o.append(", picturePreviewId=");
        A0o.append(this.A04);
        A0o.append(", createdTimestamp=");
        A0o.append(this.A0O);
        A0o.append(", handle=");
        A0o.append(this.A0F);
        A0o.append(", inviteCode=");
        A0o.append(this.A0G);
        A0o.append(", subscribersCount=");
        A0o.append(this.A05);
        A0o.append(", membership=");
        A0o.append(this.A07);
        A0o.append(", privacy=");
        A0o.append(this.A0A);
        A0o.append(", verified=");
        A0o.append(this.A0C);
        A0o.append(", muted=");
        A0o.append(this.A0L);
        A0o.append(", accounts=");
        A0o.append(this.A0Q);
        A0o.append(", oldestMessageRetrieved=");
        A0o.append(this.A0M);
        A0o.append(", suspended=");
        A0o.append(this.A0B);
        A0o.append(", deleted=");
        A0o.append(this.A0K);
        A0o.append(", reactionsSettings=");
        A0o.append(this.A09);
        A0o.append(", reactionsSettingsBlocklist=");
        A0o.append(this.A06);
        A0o.append(", reactionsSettingsUpdateTs=");
        A0o.append(this.A0D);
        A0o.append(", showEnforcedUpdateBanner=");
        A0o.append(this.A0N);
        A0o.append(", mediaCacheSetting=");
        return C18260x0.A04(this.A08, A0o);
    }
}
