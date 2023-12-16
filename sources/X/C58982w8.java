package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2w8  reason: invalid class name and case insensitive filesystem */
public final class C58982w8 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04 = 3;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Integer A0E;
    public Integer A0F;
    public Integer A0G;
    public Long A0H;
    public Long A0I;
    public String A0J;
    public boolean A0K;
    public final UserJid A0L;
    public final String A0M;

    public C58982w8(UserJid userJid, Integer num, String str, int i, int i2, long j, long j2, boolean z) {
        C162457s7.A0J(str, 1);
        this.A0M = str;
        this.A0L = userJid;
        this.A09 = j;
        this.A02 = i;
        this.A01 = i2;
        this.A0E = num;
        this.A07 = 0;
        this.A08 = 0;
        this.A06 = 0;
        this.A00 = 0;
        this.A03 = 1;
        this.A05 = j2;
        this.A0K = z;
        this.A0I = null;
        this.A0J = null;
        this.A0H = null;
        this.A0C = null;
        this.A0D = null;
        this.A0A = null;
        this.A0B = null;
        this.A0G = null;
        this.A0F = null;
    }

    public static final int A00(int i) {
        switch (i) {
            case 4:
                return 7;
            case 5:
                return 8;
            case 6:
                return 9;
            case 7:
                return 10;
            case 8:
                return 11;
            case 9:
                return 12;
            default:
                return 1;
        }
    }
}
