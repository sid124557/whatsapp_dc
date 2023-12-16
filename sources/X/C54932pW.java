package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.2pW  reason: invalid class name and case insensitive filesystem */
public final class C54932pW {
    public final C55682qk A00;
    public final C49712gy A01;
    public final C64773Ex A02;
    public final C56982ss A03;
    public final C56662sM A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass4FV A06;

    public final int A00(C28011fL r5) {
        C162457s7.A0J(r5, 0);
        int i = 3;
        if (r5 instanceof AnonymousClass1fI) {
            AnonymousClass3ZH A07 = this.A02.A07(r5);
            if (A07 == null || !C162457s7.A0P(A07.A0M, "lid")) {
                return 0;
            }
        } else {
            C64773Ex r2 = this.A02;
            AnonymousClass3ZH A09 = r2.A09(r5);
            if (A09 != null && "lid".equals(A09.A0M)) {
                return 3;
            }
            if (A02(r5)) {
                return 2;
            }
            AnonymousClass3ZH A092 = r2.A09(r5);
            if (A092 == null) {
                return 0;
            }
            i = 1;
            if (!A092.A0k) {
                return 0;
            }
        }
        return i;
    }

    public final boolean A01(GroupJid groupJid, String str) {
        int A002;
        String str2;
        if (groupJid == null || !this.A05.A0Y(C58422vE.A02, 3688) || 1 == (A002 = A00(groupJid)) || 2 == A002) {
            return false;
        }
        AnonymousClass3ZH A09 = this.A02.A09(groupJid);
        if (A09 == null || (str2 = A09.A0M) == null) {
            str2 = "pn";
        }
        if (str2.equals(str)) {
            return false;
        }
        this.A01.A02(new AnonymousClass47H(groupJid.getRawString()));
        return true;
    }

    public final boolean A02(C28011fL r3) {
        C162457s7.A0J(r3, 0);
        AnonymousClass3ZH A09 = this.A02.A09(r3);
        if (A09 == null || !A09.A0k || !this.A03.A0O(r3)) {
            return false;
        }
        return true;
    }

    public C54932pW(C55682qk r1, C49712gy r2, C64773Ex r3, C56982ss r4, C56662sM r5, AnonymousClass1VX r6, AnonymousClass4FV r7) {
        C18260x0.A0f(r6, r1, r4, r7, r2);
        C18260x0.A0U(r3, r5);
        this.A05 = r6;
        this.A00 = r1;
        this.A03 = r4;
        this.A06 = r7;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
    }
}
