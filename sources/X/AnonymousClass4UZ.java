package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4UZ  reason: invalid class name */
public final class AnonymousClass4UZ extends C05550Ty {
    public final C06270Wx A00;
    public final C06270Wx A01;
    public final C06270Wx A02;
    public final C06270Wx A03;
    public final AnonymousClass08M A04;
    public final AnonymousClass08M A05;
    public final AnonymousClass08M A06;
    public final C116985rC A07;
    public final C56972sr A08;
    public final C104095Pq A09;
    public final AnonymousClass5LD A0A;
    public final C56612sH A0B;
    public final C54292oU A0C;
    public final C620733j A0D;
    public final UserJid A0E;
    public final C55832qz A0F;
    public final AnonymousClass4FS A0G;
    public final String A0H;
    public final String A0I;

    public AnonymousClass4UZ(C116985rC r4, C56972sr r5, C104095Pq r6, AnonymousClass5LD r7, C56612sH r8, C54292oU r9, C620733j r10, UserJid userJid, AnonymousClass2z0 r12, C55832qz r13, AnonymousClass4FS r14, String str, String str2) {
        String str3 = str2;
        C18260x0.A0f(r12, str, str3, userJid, r8);
        C18260x0.A0U(r5, r9);
        C18280x3.A15(r10, r13);
        C162457s7.A0J(r14, 12);
        this.A0I = str;
        this.A0H = str3;
        this.A0E = userJid;
        this.A0B = r8;
        this.A08 = r5;
        this.A0C = r9;
        this.A0A = r7;
        this.A0D = r10;
        this.A0F = r13;
        this.A09 = r6;
        this.A0G = r14;
        this.A07 = r4;
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A05 = A012;
        this.A02 = A012;
        AnonymousClass08M A013 = AnonymousClass08M.A01();
        this.A06 = A013;
        this.A03 = A013;
        AnonymousClass08M A014 = AnonymousClass08M.A01();
        this.A04 = A014;
        this.A01 = A014;
        r7.A00 = A012;
        r7.A01 = A014;
        this.A00 = C05110Rz.A00(new AnonymousClass923(0), A012);
        C624134x A052 = this.A0F.A05(r12);
        if (A052 != null && A052.A0o() != null && !A052.A1J.A02) {
            C116985rC r1 = this.A07;
            if (r1.A07()) {
                r1.A04();
                throw AnonymousClass001.A0g("logCartViewed");
            }
        }
    }
}
