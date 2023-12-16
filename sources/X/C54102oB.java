package X;

import android.os.SystemClock;
import java.util.Iterator;

/* renamed from: X.2oB  reason: invalid class name and case insensitive filesystem */
public final class C54102oB {
    public final C116985rC A00;
    public final C55682qk A01;
    public final C56612sH A02;
    public final C49472ga A03;
    public final C54762pF A04;
    public final AnonymousClass5ZC A05 = new AnonymousClass5ZC(100000, 100000, 1000000, false);
    public final C183538qC A06;
    public final C183538qC A07;
    public final C183538qC A08;
    public final C183538qC A09;
    public final C183538qC A0A;
    public final C183538qC A0B;
    public final C183538qC A0C;
    public final AnonymousClass66R A0D;

    public final void A00(C624134x r8) {
        byte b = r8.A1I;
        AnonymousClass66R r1 = this.A0D;
        if (!C53662nS.A01(r1, b) || !(C53662nS.A00(r1, b) instanceof AnonymousClass4BT)) {
            A01(r8, "message cannot be read from the database", "fill", "fmessage-database-reading-not-supported");
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        r8.A1H(1);
        AnonymousClass48B A002 = C53662nS.A00(r1, b);
        C162457s7.A0K(A002, "null cannot be cast to non-null type com.whatsapp.subsystem.database.retrieval.FMessageDatabaseReader");
        AnonymousClass4BT r12 = (AnonymousClass4BT) A002;
        r12.B3F(r8);
        new AnonymousClass8PJ(r12.getClass());
        Iterator A0Y = C18270x1.A0Y(this.A0A);
        while (A0Y.hasNext()) {
            ((AnonymousClass4BQ) A0Y.next()).BhW(r8, (C378824k) null);
        }
        this.A03.A01(this.A05, "CachedMessageStore/fillMessageFromExtraTables", C18310x6.A0A(uptimeMillis));
    }

    public C54102oB(C116985rC r5, C55682qk r6, C56612sH r7, C49472ga r8, C54762pF r9, C46422bb r10, C183538qC r11, C183538qC r12, C183538qC r13, C183538qC r14, C183538qC r15, C183538qC r16, C183538qC r17) {
        C18260x0.A0V(r10, r7, r6);
        C162457s7.A0J(r8, 5);
        C18260x0.A0g(r9, r11, r12, r13, r14);
        C183538qC r1 = r16;
        C183538qC r0 = r17;
        C18260x0.A0Y(r15, r1, r0);
        this.A02 = r7;
        this.A01 = r6;
        this.A00 = r5;
        this.A03 = r8;
        this.A04 = r9;
        this.A0A = r11;
        this.A09 = r12;
        this.A08 = r13;
        this.A0C = r14;
        this.A0B = r15;
        this.A07 = r1;
        this.A06 = r0;
        this.A0D = C154517dI.A01(new C79643wx(r10));
    }

    public final void A01(C624134x r5, String str, String str2, String str3) {
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append(", message_type=");
        byte b = r5.A1I;
        String A0h = AnonymousClass000.A0h(A0l, b);
        C626936e.A0D(false, A0h);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FMessageDatabaseSubsystem/");
        A0o.append(str2);
        C18260x0.A0t("; ", A0h, A0o);
        this.A01.A0A(str3, true, String.valueOf(b));
    }
}
