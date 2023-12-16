package X;

import java.io.File;

/* renamed from: X.5Wr  reason: invalid class name and case insensitive filesystem */
public final class C105855Wr {
    public C138386qG A00;
    public AnonymousClass567 A01;
    public final C69263Wi A02;
    public final C621033m A03;
    public final C29441ip A04;
    public final AnonymousClass5ZU A05;
    public final C620633i A06;
    public final C56612sH A07;
    public final C54292oU A08;
    public final C61072zf A09;
    public final C66473Lo A0A;
    public final AnonymousClass36Y A0B;
    public final AnonymousClass1VX A0C;
    public final AnonymousClass4FV A0D;
    public final C56232re A0E;
    public final C48132eP A0F;
    public final C620133d A0G;
    public final C50222hp A0H;
    public final C45042Yl A0I;
    public final C989053r A0J;
    public final AnonymousClass4FS A0K;
    public final C183538qC A0L;

    public C105855Wr(C69263Wi r21, C621033m r22, C29441ip r23, AnonymousClass5ZU r24, C620633i r25, C56612sH r26, C54292oU r27, C61072zf r28, C66473Lo r29, AnonymousClass36Y r30, AnonymousClass1VX r31, AnonymousClass4FV r32, C56232re r33, C48132eP r34, C620133d r35, C50222hp r36, C45042Yl r37, C989053r r38, AnonymousClass4FS r39, C183538qC r40) {
        AnonymousClass1VX r0 = r31;
        AnonymousClass4FV r9 = r32;
        C56612sH r15 = r26;
        C54292oU r14 = r27;
        C69263Wi r19 = r21;
        C18260x0.A0f(r15, r0, r19, r14, r9);
        C989053r r4 = r38;
        AnonymousClass36Y r10 = r30;
        C620633i r13 = r25;
        C61072zf r12 = r28;
        C621033m r18 = r22;
        C18260x0.A0g(r18, r12, r10, r13, r4);
        AnonymousClass5ZU r16 = r24;
        C162457s7.A0J(r16, 11);
        C620133d r6 = r35;
        C56232re r8 = r33;
        C48132eP r7 = r34;
        C66473Lo r11 = r29;
        C29441ip r17 = r23;
        C18260x0.A0h(r7, r8, r6, r17, r11);
        C50222hp r5 = r36;
        AnonymousClass4FS r3 = r39;
        AnonymousClass0x2.A1C(r5, r3);
        C183538qC r2 = r40;
        C162457s7.A0J(r2, 19);
        this.A07 = r15;
        this.A0C = r0;
        this.A02 = r19;
        this.A08 = r14;
        this.A0D = r9;
        this.A03 = r18;
        this.A09 = r12;
        this.A0B = r10;
        this.A06 = r13;
        this.A0J = r4;
        this.A05 = r16;
        this.A0F = r7;
        this.A0E = r8;
        this.A0G = r6;
        this.A04 = r17;
        this.A0A = r11;
        this.A0H = r5;
        this.A0K = r3;
        this.A0L = r2;
        this.A0I = r37;
    }

    public static final boolean A00(AnonymousClass33C r3, AnonymousClass1I7 r4) {
        StringBuilder A0A2 = C18330xA.A0A("ReusableVideoPlayer/isDownloadActive/");
        A0A2.append("mediaDataV2.transferring=");
        A0A2.append(r3.A0c);
        A0A2.append(",downloader is not null=");
        A0A2.append(AnonymousClass000.A1W(r4));
        if (r4 != null) {
            A0A2.append(",downloader.context is not null=");
            A0A2.append(AnonymousClass000.A1W(r4.A0o));
        }
        AnonymousClass0x2.A18(A0A2);
        if (!r3.A0c || r4 == null || r4.A0o == null) {
            return false;
        }
        return true;
    }

    public final void A01(C34221uQ r4, File file) {
        this.A0K.BkM(new C70363aN(r4, this, file, 27));
    }
}
