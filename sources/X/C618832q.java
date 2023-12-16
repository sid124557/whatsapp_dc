package X;

import com.whatsapp.jid.UserJid;
import java.util.AbstractCollection;
import java.util.Map;

/* renamed from: X.32q  reason: invalid class name and case insensitive filesystem */
public class C618832q {
    public int A00 = 0;
    public int A01;
    public long A02 = 0;
    public long A03 = 0;
    public long A04 = 0;
    public C42902Py A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public final AnonymousClass3ZH A0O;
    public final UserJid A0P;
    public final String A0Q;
    public final String A0R;

    public static void A00(C623734t r1, C618832q r2, UserJid userJid) {
        r2.A05 = r1.A0M.A0E().A00(userJid, r2.A0Q);
    }

    public AnonymousClass2UM A03() {
        boolean z;
        UserJid userJid = this.A0P;
        if (userJid instanceof C27981fH) {
            AnonymousClass3ZH r0 = this.A0O;
            if (r0 == null || (!r0.A0o && !this.A0D)) {
                z = true;
            } else {
                z = false;
            }
            this.A0G = z;
        }
        this.A0H &= true ^ C627336j.A0L(userJid);
        return new AnonymousClass2UM(this);
    }

    public C618832q(AnonymousClass3ZH r4) {
        this.A0P = AnonymousClass3ZH.A07(r4);
        this.A0O = r4;
        C51602k5 r0 = r4.A0F;
        if (r0 != null) {
            this.A0Q = r0.A01;
        } else {
            this.A0Q = null;
        }
        if (r4.A10) {
            this.A04 = r4.A0D;
        }
        this.A0R = null;
    }

    public static void A01(C623734t r1, C618832q r2, Object obj, Map map) {
        r2.A07 = (String) map.get(obj);
        r2.A09 = (String) r1.A0S.get(obj);
    }

    public static void A02(C618832q r0, AbstractCollection abstractCollection) {
        abstractCollection.add(r0.A03());
    }

    public C618832q(UserJid userJid, String str) {
        this.A0P = userJid;
        this.A0Q = str;
        this.A0O = null;
        this.A0R = null;
    }

    public C618832q(String str) {
        this.A0R = str;
        this.A0P = null;
        this.A0Q = null;
        this.A0O = null;
    }
}
