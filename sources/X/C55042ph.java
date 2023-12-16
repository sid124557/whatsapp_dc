package X;

import com.whatsapp.Me;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2ph  reason: invalid class name and case insensitive filesystem */
public final class C55042ph {
    public final C56972sr A00;
    public final C56612sH A01;
    public final AnonymousClass33T A02;
    public final AnonymousClass33p A03;
    public final C56982ss A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass4FV A06;
    public final AnonymousClass27x A07;
    public final AnonymousClass4FS A08;
    public final C183538qC A09;

    public final void A01(C624134x r12, Integer num, Integer num2, Long l, String str) {
        if (this.A05.A0Y(C58422vE.A02, 3127)) {
            A02(r12, num, num2, l, str, 4, 4);
        }
    }

    public final void A03(String str) {
        C162457s7.A0J(str, 0);
        if (this.A05.A0Y(C58422vE.A02, 3127)) {
            C25941bK r1 = new C25941bK();
            r1.A07 = C18280x3.A0S();
            r1.A06 = AnonymousClass0x7.A0g();
            r1.A0D = str;
            A00(r1);
            this.A06.BhD(r1);
        }
    }

    public final void A00(C25941bK r4) {
        String str;
        if (this.A05.A0Y(C58422vE.A02, 3127)) {
            r4.A00 = C18320x8.A0V(C18280x3.A1W(AnonymousClass0x2.A0F(this.A03), "notify_new_message_for_archived_chats"));
            r4.A02 = Boolean.valueOf(this.A02.A00.A01());
            Me A002 = C56972sr.A00(this.A00);
            if (A002 == null || (str = AnonymousClass0x9.A0w(A002)) == null) {
                str = "ZZ";
            }
            r4.A0G = str;
        }
    }

    public final void A02(C624134x r10, Integer num, Integer num2, Long l, String str, int i, int i2) {
        String str2;
        Integer A042;
        String str3;
        Integer num3;
        Boolean bool;
        String A052;
        C25941bK r4 = new C25941bK();
        AnonymousClass1VX r7 = this.A05;
        C58422vE r5 = C58422vE.A02;
        if (!r7.A0Y(r5, 3127) || !(r10 instanceof AnonymousClass1p5)) {
            str2 = null;
        } else {
            str2 = ((AnonymousClass1p5) r10).A00.A05;
        }
        r4.A0H = str2;
        r4.A07 = Integer.valueOf(i);
        r4.A06 = Integer.valueOf(i2);
        r4.A05 = num;
        r4.A04 = num2;
        UserJid A0o = r10.A0o();
        Long l2 = null;
        if (!(A0o == null || (A052 = AnonymousClass36P.A05(A0o)) == null)) {
            l2 = C18290x4.A0h(A052);
        }
        r4.A09 = l2;
        C625135j r1 = C625135j.A00;
        C58932w3 A002 = C625135j.A00(r7, r10);
        if (A002 == null) {
            A042 = null;
        } else {
            A042 = r1.A04(r7, A002);
        }
        r4.A08 = A042;
        r4.A0A = C18320x8.A0Y(TimeUnit.MILLISECONDS, System.currentTimeMillis() - r10.A0K);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        AnonymousClass2z0 r2 = r10.A1J;
        AnonymousClass2z0.A0A(r2, A0o2);
        String A0k = AnonymousClass001.A0k(A0o2, r10.A0K);
        try {
            MessageDigest A0t = AnonymousClass0x7.A0t();
            A0t.update(AnonymousClass0x2.A1a(A0k));
            str3 = AnonymousClass0x7.A0s(A0t.digest());
        } catch (NoSuchAlgorithmException e) {
            Log.e("OTP: Error computing sessionId for logging", e);
            str3 = null;
        }
        r4.A0F = str3;
        r4.A0C = str;
        r4.A0B = l;
        A00(r4);
        if (r7.A0Y(r5, 3127)) {
            C95814uZ r12 = r2.A00;
            if (r12 != null) {
                num3 = Integer.valueOf(C18280x3.A00(this.A04.A0M(r12) ? 1 : 0));
            } else {
                num3 = null;
            }
            r4.A03 = num3;
            if (r12 != null) {
                bool = C18320x8.A0V(AnonymousClass000.A1S((AnonymousClass1R1.A00(r12, ((C66363Lb) this.A09.get()).A04).A00() > 0 ? 1 : (AnonymousClass1R1.A00(r12, ((C66363Lb) this.A09.get()).A04).A00() == 0 ? 0 : -1))));
            } else {
                bool = null;
            }
            r4.A01 = bool;
        }
        this.A06.BhD(r4);
    }

    public C55042ph(C56972sr r1, C56612sH r2, AnonymousClass33T r3, AnonymousClass33p r4, C56982ss r5, AnonymousClass1VX r6, AnonymousClass4FV r7, AnonymousClass27x r8, AnonymousClass4FS r9, C183538qC r10) {
        C18260x0.A0f(r2, r6, r1, r5, r7);
        C18260x0.A0g(r9, r8, r10, r4, r3);
        this.A01 = r2;
        this.A05 = r6;
        this.A00 = r1;
        this.A04 = r5;
        this.A06 = r7;
        this.A08 = r9;
        this.A07 = r8;
        this.A09 = r10;
        this.A03 = r4;
        this.A02 = r3;
    }
}
