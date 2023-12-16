package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2nj  reason: invalid class name and case insensitive filesystem */
public final class C53822nj {
    public long A00 = 1;
    public C54092oA A01;
    public String A02;
    public final AnonymousClass2YC A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass4FV A05;
    public final AnonymousClass2WM A06;
    public final AnonymousClass4FS A07;

    public final void A01(Long l, String str, String str2, String str3, String str4) {
        if (this.A01 == null) {
            Log.e("Cannot log extensions screen progress without a valid session id.");
            return;
        }
        if (str != null) {
            this.A02 = str;
        }
        if (l != null) {
            this.A00 = l.longValue();
        }
        this.A07.BkM(new C70503ab(this, str2, str3, str4, 1));
    }

    public final void A00(C25961bM r6) {
        Integer num;
        C54092oA r4 = this.A01;
        if (r4 != null) {
            r6.A02 = Integer.valueOf(r4.A01);
            r6.A07 = this.A06.A00(r4.A03);
            r6.A0F = r4.A08;
            r6.A0G = r4.A09;
            r6.A0H = r4.A0A;
            r6.A0D = r4.A07;
            r6.A01 = Boolean.valueOf(r4.A0D);
            r6.A0J = r4.A0B;
            r6.A00 = Boolean.valueOf(r4.A0C);
            r6.A06 = Long.valueOf(r4.A00);
            r6.A0E = r4.A06;
            AnonymousClass1VX r3 = this.A04;
            C58422vE r2 = C58422vE.A02;
            if (r3.A0Y(r2, 6381)) {
                UserJid A052 = AnonymousClass32Y.A05(r4.A03);
                if (A052 != null) {
                    num = this.A03.A00(A052);
                } else {
                    num = null;
                }
                r6.A0C = r4.A05;
                r6.A0B = r4.A04;
                r6.A03 = num;
            }
            C50662iZ r1 = r4.A02;
            if (r3.A0Y(r2, 6551)) {
                Integer num2 = null;
                if (r1 != null) {
                    num2 = C18290x4.A0Z();
                }
                r6.A04 = num2;
            }
            r4.A00++;
        }
    }

    public final void A02(String str, boolean z) {
        if (this.A01 == null) {
            Log.e("Cannot log extension finished without a valid session id.");
        } else {
            this.A07.BkM(new C70303aH(this, str, 5, z));
        }
    }

    public C53822nj(AnonymousClass2YC r3, AnonymousClass1VX r4, AnonymousClass4FV r5, AnonymousClass2WM r6, AnonymousClass4FS r7) {
        C18260x0.A0d(r7, r5, r3, r4);
        this.A07 = r7;
        this.A05 = r5;
        this.A06 = r6;
        this.A03 = r3;
        this.A04 = r4;
    }
}
