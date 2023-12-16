package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.3ST  reason: invalid class name */
public class AnonymousClass3ST implements AnonymousClass4FY {
    public int A00;
    public int A01 = 0;
    public int A02;
    public int A03;
    public int A04 = 0;
    public int A05 = 3;
    public int A06 = 0;
    public long A07;
    public C51542jz A08;
    public C50882iv A09;
    public C53432n5 A0A;
    public C51612k6 A0B;
    public C624034w A0C;
    public C95814uZ A0D;
    public Jid A0E;
    public C27981fH A0F;
    public C27981fH A0G;
    public PhoneUserJid A0H;
    public PhoneUserJid A0I;
    public PhoneUserJid A0J;
    public UserJid A0K;
    public AnonymousClass1EU A0L;
    public AnonymousClass1EU A0M;
    public C45442a1 A0N;
    public C45442a1 A0O;
    public C624134x A0P;
    public AnonymousClass2z0 A0Q;
    public AnonymousClass2z0 A0R;
    public AnonymousClass215 A0S;
    public AnonymousClass3ZC A0T;
    public Boolean A0U;
    public Integer A0V;
    public Integer A0W;
    public Integer A0X;
    public Integer A0Y;
    public Long A0Z;
    public Long A0a;
    public Long A0b;
    public Long A0c;
    public Long A0d;
    public Long A0e;
    public Long A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public String A0s;
    public String A0t;
    public String A0u;
    public String A0v;
    public Set A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10 = false;
    public boolean A11;
    public boolean A12;
    public byte[] A13;
    public byte[] A14;
    public byte[] A15;
    public final long A16;
    public final C371321b A17;
    public final Jid A18;
    public final UserJid A19;
    public final String A1A;
    public final String A1B;

    public void Bjw() {
        this.A0P = null;
    }

    public void BnM(boolean z) {
        this.A12 = true;
    }

    public static AnonymousClass2z0 A00(AnonymousClass3ST r1) {
        AnonymousClass2z0 r0 = r1.A0R;
        if (r0 == null) {
            return r1.A0Q;
        }
        return r0;
    }

    public C624134x A01(AnonymousClass4G5 r4) {
        C624134x r0 = this.A0P;
        if (r0 == null) {
            r0 = r4.B0j(A00(this), this.A16);
            this.A0P = r0;
        }
        A02(r0);
        return r0;
    }

    public void A02(C624134x r5) {
        int i;
        this.A0P = r5;
        r5.A1R = DeviceJid.of(BCm());
        if (A00(this).A02) {
            this.A0P.A1G(4);
            this.A0P.A1W = true;
        } else {
            Jid jid = this.A0E;
            if (jid != null) {
                this.A0P.A1J(C627336j.A02(jid));
            }
        }
        Integer num = this.A0Y;
        if (num != null) {
            this.A0P.A0C = num.intValue();
        }
        Integer num2 = this.A0X;
        if (num2 != null) {
            this.A0P.A0B = num2.intValue();
        }
        C624134x r1 = this.A0P;
        r1.A0K = this.A16;
        Long l = this.A0b;
        if (l != null) {
            r1.A0I = l.longValue();
        }
        r1.A1O = this.A07;
        Integer num3 = this.A0W;
        if (num3 != null) {
            r1.A0p = num3;
        }
        String str = this.A0n;
        if (str != null) {
            r1.A13 = str;
        }
        String str2 = this.A0m;
        if (str2 != null) {
            r1.A0z = str2;
        }
        PhoneUserJid phoneUserJid = this.A0J;
        if (phoneUserJid != null) {
            r1.A0V = phoneUserJid;
        }
        String str3 = this.A0u;
        if (str3 != null) {
            r1.A17 = str3;
        }
        PhoneUserJid phoneUserJid2 = this.A0H;
        if (phoneUserJid2 != null) {
            r1.A0T = phoneUserJid2;
        }
        C27981fH r0 = this.A0F;
        if (r0 != null) {
            r1.A0R = r0;
        }
        C27981fH r02 = this.A0G;
        if (r02 != null) {
            r1.A0S = r02;
        }
        PhoneUserJid phoneUserJid3 = this.A0I;
        if (phoneUserJid3 != null) {
            r1.A0U = phoneUserJid3;
        }
        String str4 = this.A0t;
        if (str4 != null) {
            r1.A16 = str4;
        }
        C371321b r03 = this.A17;
        if (r03 != null) {
            r1.A0N = r03;
        }
        r1.A1B = this.A0x;
        Long l2 = this.A0f;
        if (l2 != null) {
            r1.A0w = l2;
        }
        r1.A0G = this.A06;
        r1.A0n = this.A0T;
        r1.A0v = this.A0e;
        r1.A0u = this.A0d;
        r1.A0t = this.A0c;
        int i2 = this.A01;
        if (i2 != 0) {
            r1.A01 = i2;
        }
        int i3 = this.A03;
        if (i3 != 0) {
            r1.A1B(i3);
        }
        C624034w r04 = this.A0C;
        if (r04 != null) {
            C624134x r12 = this.A0P;
            r12.A0P = r04;
            String str5 = r04.A0K;
            if (str5 == null) {
                str5 = "UNSET";
            }
            r12.A15 = str5;
        }
        C624134x r2 = this.A0P;
        r2.A1E = this.A12;
        if (r2.A1B && r2.A0C == 0) {
            r2.A1E(0);
            this.A0P.A1Y((Long) null);
        } else if (r2.A05 <= 0 && (i = this.A02) != 0 && AnonymousClass2z0.A0D(r2)) {
            r2.A1E(i);
        }
        String str6 = this.A0h;
        if (str6 != null) {
            this.A0P.A1b(str6);
        }
        this.A0P.A0E = this.A05;
    }

    public C95814uZ B5O() {
        C95814uZ r0 = this.A0D;
        if (r0 == null) {
            return C627336j.A02(this.A18);
        }
        return r0;
    }

    public int B5W() {
        C45442a1 r0 = this.A0O;
        if (r0 == null && (r0 = this.A0N) == null) {
            return 0;
        }
        return r0.A00;
    }

    public int B5X() {
        C45442a1 r0 = this.A0O;
        if (r0 == null && (r0 = this.A0N) == null) {
            return 0;
        }
        return r0.A01;
    }

    public AnonymousClass2z0 B9a() {
        AnonymousClass2z0 r0 = this.A0R;
        if (r0 == null) {
            return this.A0Q;
        }
        return r0;
    }

    public C95814uZ BAZ() {
        return C627336j.A02(this.A0E);
    }

    public C95814uZ BC1() {
        return C627336j.A02(this.A18);
    }

    public int BCI() {
        Integer num = this.A0Y;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public Jid BCm() {
        Jid jid = this.A18;
        Jid jid2 = this.A0E;
        if (C627336j.A0K(jid) || (jid instanceof AnonymousClass1fS)) {
            return jid2;
        }
        return jid;
    }

    public UserJid BCo() {
        Jid jid = this.A18;
        Jid jid2 = this.A0E;
        if (C627336j.A0K(jid) || (jid instanceof AnonymousClass1fS)) {
            jid = jid2;
        }
        return AnonymousClass32Y.A03(C627336j.A02(jid));
    }

    public AnonymousClass39T BDD(String str) {
        Jid jid;
        Jid jid2;
        C50412i8 r2 = new C50412i8();
        r2.A05 = "message";
        r2.A07 = this.A1B;
        r2.A00 = this.A07;
        boolean z = this.A0x;
        if (z) {
            jid = this.A0E;
        } else {
            jid = this.A18;
        }
        r2.A02 = jid;
        if (z) {
            jid2 = this.A18;
        } else {
            jid2 = this.A0E;
        }
        r2.A01 = jid2;
        r2.A08 = this.A0v;
        AnonymousClass0x7.A1A(r2, str);
        return r2.A01();
    }

    public boolean BFN(int i) {
        return AnonymousClass000.A1U(this.A03 & 16, 16);
    }

    public boolean BIE() {
        return AnonymousClass000.A1W(this.A0W);
    }

    public boolean BIK() {
        return AnonymousClass000.A1W(this.A0C);
    }

    public void Bmv(int i) {
        this.A04 = i;
    }

    public boolean BqQ() {
        if (this.A00 == 1) {
            return false;
        }
        return true;
    }

    public AnonymousClass3ST(C47132cl r7) {
        Jid jid = r7.A02;
        this.A18 = jid;
        UserJid userJid = r7.A03;
        this.A19 = userJid;
        String str = r7.A07;
        this.A1B = str;
        this.A16 = r7.A05.longValue();
        this.A1A = r7.A06;
        this.A17 = r7.A00;
        C95814uZ A022 = C627336j.A02(jid);
        this.A0Q = AnonymousClass2z0.A05(A022, str, r7.A04.booleanValue());
        if (userJid != null) {
            this.A0R = AnonymousClass2z0.A05(userJid, str, true);
            return;
        }
        C95814uZ r0 = r7.A01;
        if (r0 != null && !r0.equals(A022)) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("IncomingMessageStanza/IncomingMessageStanza remoteChatJid=");
            A0o2.append(A022);
            A0o2.append("; normalizedChatJid=");
            C18260x0.A0o(r7.A01, A0o2);
            this.A0R = AnonymousClass2z0.A05(r7.A01, str, r7.A04.booleanValue());
            this.A0z = true;
        }
    }

    public String B5K() {
        return this.A0i;
    }

    public byte[] B70() {
        return this.A13;
    }

    public String B71() {
        return this.A0l;
    }

    public int B7F() {
        return this.A01;
    }

    public /* bridge */ /* synthetic */ C624134x B7X() {
        return this.A0P;
    }

    public C45442a1 B8J() {
        return this.A0N;
    }

    public long B9D() {
        return this.A07;
    }

    public String B9e() {
        return this.A0v;
    }

    public Jid BAb() {
        return this.A0E;
    }

    public UserJid BBz() {
        return this.A19;
    }

    public byte[] BC0() {
        return this.A14;
    }

    public Jid BC2() {
        return this.A18;
    }

    public C45442a1 BCn() {
        return this.A0O;
    }

    public long BDj() {
        return this.A16;
    }

    public boolean BH5() {
        return this.A0x;
    }

    public boolean BI6() {
        return this.A0z;
    }

    public boolean BIs() {
        return this.A12;
    }

    public boolean BqM() {
        return true;
    }

    public boolean BqS() {
        return true;
    }

    public String getId() {
        return this.A1B;
    }
}
