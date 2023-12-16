package X;

import com.whatsapp.util.Log;
import java.util.List;
import java.util.Set;

/* renamed from: X.2iD  reason: invalid class name and case insensitive filesystem */
public final class C50462iD {
    public final C55682qk A00;
    public final AnonymousClass36E A01;
    public final C56612sH A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass31C A04;
    public final C56182rZ A05;
    public final C48702fK A06;
    public final C56212rc A07;
    public final C55632qf A08;
    public final AnonymousClass2YX A09;
    public final C72173dI A0A;

    public final void A00(C95804uY r12, String str, long j, long j2) {
        String str2 = str;
        if (str != null) {
            C56182rZ r1 = this.A05;
            C95804uY r2 = r12;
            long j3 = j;
            C624134x A002 = r1.A00(r12, j);
            if (A002 == null) {
                this.A06.A01(r2, Long.valueOf(j2), (Long) null, str, (List) null, j3);
                return;
            }
            this.A08.A02(A002, (Long) null, Long.valueOf(j2), str2, this.A02.A0H(), true, true);
            r1.A04(A002);
        }
    }

    public final void A01(C95804uY r13, Set set, long j, long j2) {
        if (set != null) {
            C95804uY r1 = r13;
            long j3 = j;
            C624134x A002 = this.A05.A00(r13, j3);
            long j4 = j2;
            if (A002 == null) {
                Log.d("NewsletterIncomingMessageManager/processIncomingVotesFromMe/storing orphan");
                this.A06.A01(r1, (Long) null, Long.valueOf(j4), (String) null, C73723fy.A0F(set), j3);
            } else if (A002 instanceof C30451mT) {
                this.A08.A01(r13, (C30451mT) A002, C73723fy.A0F(set), j4);
            }
        }
    }

    public C50462iD(C55682qk r2, AnonymousClass36E r3, C56612sH r4, AnonymousClass1VX r5, AnonymousClass31C r6, C56182rZ r7, C48702fK r8, C56212rc r9, C55632qf r10, AnonymousClass2YX r11, AnonymousClass4FS r12) {
        C18260x0.A0f(r12, r4, r5, r2, r6);
        C18260x0.A0g(r3, r7, r10, r11, r9);
        C162457s7.A0J(r8, 11);
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
        this.A04 = r6;
        this.A01 = r3;
        this.A05 = r7;
        this.A08 = r10;
        this.A09 = r11;
        this.A07 = r9;
        this.A06 = r8;
        this.A0A = C72173dI.A00(r12);
    }
}
