package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.2i8  reason: invalid class name and case insensitive filesystem */
public class C50412i8 {
    public long A00;
    public Jid A01;
    public Jid A02;
    public UserJid A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public final Map A09 = AnonymousClass001.A0t();

    public static C50412i8 A00(Jid jid) {
        C50412i8 r0 = new C50412i8();
        r0.A02 = jid;
        return r0;
    }

    public AnonymousClass39T A01() {
        ArrayList A0v;
        Map map = this.A09;
        if (map.isEmpty()) {
            A0v = null;
        } else {
            A0v = C18300x5.A0v(map);
        }
        Jid jid = this.A02;
        String str = this.A05;
        String str2 = this.A07;
        C626936e.A06(str2);
        return new AnonymousClass39T(jid, this.A01, this.A03, str, str2, this.A08, this.A04, this.A06, A0v, this.A00);
    }

    public void A02(String str, String str2) {
        this.A09.put(str, new AnonymousClass39V(str, str2));
    }
}
