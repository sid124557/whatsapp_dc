package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3SS  reason: invalid class name */
public class AnonymousClass3SS implements AnonymousClass4FY {
    public Jid A00;
    public UserJid A01;
    public C45442a1 A02;
    public C45442a1 A03;
    public boolean A04;
    public boolean A05;
    public final long A06;
    public final Jid A07;
    public final AnonymousClass2z0 A08;
    public final String A09;
    public final String A0A;

    public AnonymousClass3SS(Jid jid, UserJid userJid, String str, String str2, long j) {
        this.A06 = j;
        this.A0A = str;
        this.A07 = jid;
        this.A01 = userJid;
        this.A09 = str2;
        this.A08 = AnonymousClass2z0.A05(C627336j.A02(jid), str, false);
    }

    public void BnM(boolean z) {
        this.A05 = true;
    }

    public /* synthetic */ C95814uZ B5O() {
        return C627336j.A02(this.A07);
    }

    public int B5W() {
        C45442a1 r0 = this.A03;
        if (r0 == null && (r0 = this.A02) == null) {
            return 0;
        }
        return r0.A00;
    }

    public int B5X() {
        C45442a1 r0 = this.A03;
        if (r0 == null && (r0 = this.A02) == null) {
            return 0;
        }
        return r0.A01;
    }

    public C95814uZ BAZ() {
        return C627336j.A02(this.A00);
    }

    public C95814uZ BC1() {
        return C627336j.A02(this.A07);
    }

    public Jid BCm() {
        Jid jid = this.A07;
        if (C627336j.A0K(jid) || (jid instanceof AnonymousClass1fS)) {
            return this.A00;
        }
        return jid;
    }

    public AnonymousClass39T BDD(String str) {
        Jid jid;
        Jid jid2;
        C50412i8 r2 = new C50412i8();
        r2.A05 = "appdata";
        r2.A07 = this.A0A;
        r2.A00 = 0;
        boolean z = this.A04;
        if (z) {
            jid = this.A00;
        } else {
            jid = this.A07;
        }
        r2.A02 = jid;
        if (z) {
            jid2 = this.A07;
        } else {
            jid2 = this.A00;
        }
        r2.A01 = jid2;
        AnonymousClass0x7.A1A(r2, str);
        return r2.A01();
    }

    public boolean BFN(int i) {
        return false;
    }

    public void Bmv(int i) {
        throw AnonymousClass002.A0G("Setting placeholder is not supported in appdata");
    }

    public String B5K() {
        return this.A09;
    }

    public byte[] B70() {
        return null;
    }

    public String B71() {
        return null;
    }

    public int B7F() {
        return 0;
    }

    public C624134x B7X() {
        return null;
    }

    public C45442a1 B8J() {
        return this.A02;
    }

    public long B9D() {
        return 0;
    }

    public AnonymousClass2z0 B9a() {
        return this.A08;
    }

    public String B9e() {
        return null;
    }

    public Jid BAb() {
        return this.A00;
    }

    public UserJid BBz() {
        return this.A01;
    }

    public byte[] BC0() {
        return null;
    }

    public Jid BC2() {
        return this.A07;
    }

    public int BCI() {
        return 0;
    }

    public C45442a1 BCn() {
        return this.A03;
    }

    public UserJid BCo() {
        return AnonymousClass32Y.A03(C627336j.A02(BCm()));
    }

    public long BDj() {
        return this.A06;
    }

    public boolean BH5() {
        return false;
    }

    public boolean BI6() {
        return false;
    }

    public boolean BIE() {
        return false;
    }

    public boolean BIK() {
        return false;
    }

    public boolean BIs() {
        return this.A05;
    }

    public void Bjw() {
    }

    public boolean BqM() {
        return false;
    }

    public boolean BqQ() {
        return false;
    }

    public boolean BqS() {
        return false;
    }

    public String getId() {
        return this.A0A;
    }
}
