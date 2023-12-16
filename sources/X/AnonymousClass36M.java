package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;

/* renamed from: X.36M  reason: invalid class name */
public final class AnonymousClass36M {
    public static final int A01(int i) {
        if (i < 4) {
            return 1;
        }
        if (i < 8) {
            return 2;
        }
        if (i < 16) {
            return 3;
        }
        if (i < 32) {
            return 4;
        }
        if (i < 64) {
            return 5;
        }
        if (i < 128) {
            return 6;
        }
        if (i < 256) {
            return 7;
        }
        if (i < 512) {
            return 8;
        }
        if (i < 1000) {
            return 9;
        }
        if (i < 1500) {
            return 10;
        }
        if (i < 2000) {
            return 11;
        }
        if (i < 2500) {
            return 12;
        }
        if (i < 3000) {
            return 13;
        }
        if (i < 3500) {
            return 14;
        }
        if (i < 4000) {
            return 15;
        }
        if (i < 4500) {
            return 16;
        }
        if (i < 5000) {
            return 17;
        }
        return 18;
    }

    public static final int A03(int i) {
        if (i < 4) {
            return 1;
        }
        if (i < 8) {
            return 2;
        }
        if (i < 16) {
            return 3;
        }
        if (i < 32) {
            return 4;
        }
        if (i < 64) {
            return 5;
        }
        if (i < 128) {
            return 6;
        }
        if (i < 256) {
            return 7;
        }
        if (i < 512) {
            return 8;
        }
        if (i < 999) {
            return 9;
        }
        if (i < 1500) {
            return 10;
        }
        if (i < 2000) {
            return 11;
        }
        if (i < 2500) {
            return 12;
        }
        if (i < 3000) {
            return 13;
        }
        if (i < 3500) {
            return 14;
        }
        if (i < 4000) {
            return 15;
        }
        if (i < 4500) {
            return 16;
        }
        return 17;
    }

    public static final int A06(C624134x r1) {
        C162457s7.A0J(r1, 0);
        if (r1.A0n() instanceof AnonymousClass1fS) {
            return 3;
        }
        return A05(r1.A1J.A00);
    }

    public static final Integer A07(C56982ss r1, C95814uZ r2) {
        C162457s7.A0J(r1, 1);
        if (!C627336j.A0K(r2)) {
            return null;
        }
        GroupJid groupJid = (GroupJid) r2;
        if (!C627336j.A0K(groupJid)) {
            return null;
        }
        int A07 = r1.A07(groupJid);
        if (A07 != 2) {
            int i = 3;
            if (A07 != 3) {
                if (A07 != 6) {
                    i = 1;
                }
            }
            return Integer.valueOf(i);
        }
        return 2;
    }

    public static final int A00(int i) {
        if (i < 32) {
            return 1;
        }
        if (i < 64) {
            return 2;
        }
        if (i < 128) {
            return 3;
        }
        if (i < 256) {
            return 4;
        }
        if (i < 512) {
            return 5;
        }
        if (i < 1024) {
            return 16;
        }
        if (i < 1500) {
            return 7;
        }
        if (i < 2000) {
            return 8;
        }
        if (i < 2500) {
            return 9;
        }
        if (i < 3000) {
            return 10;
        }
        if (i < 3500) {
            return 11;
        }
        if (i < 4000) {
            return 12;
        }
        if (i < 4500) {
            return 13;
        }
        if (i < 5000) {
            return 14;
        }
        return 15;
    }

    public static final int A04(int i) {
        if (i <= 33) {
            return 1;
        }
        if (i <= 65) {
            return 2;
        }
        if (i <= 129) {
            return 3;
        }
        if (i <= 257) {
            return 4;
        }
        if (i <= 513) {
            return 5;
        }
        if (i <= 1025) {
            return 16;
        }
        if (i <= 1501) {
            return 7;
        }
        if (i <= 2001) {
            return 8;
        }
        if (i <= 2501) {
            return 9;
        }
        if (i <= 3001) {
            return 10;
        }
        if (i <= 3501) {
            return 11;
        }
        if (i <= 4001) {
            return 12;
        }
        if (i <= 4501) {
            return 13;
        }
        if (i <= 5001) {
            return 14;
        }
        return 15;
    }

    public static final int A02(int i) {
        return C18300x5.A02(i);
    }

    public static final int A05(Jid jid) {
        if (C627336j.A0K(jid)) {
            return 2;
        }
        if (jid instanceof C135166kE) {
            return 4;
        }
        if (jid instanceof AnonymousClass1fI) {
            return 3;
        }
        if (jid instanceof C95804uY) {
            return 5;
        }
        return 1;
    }
}
