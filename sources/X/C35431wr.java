package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.1wr  reason: invalid class name and case insensitive filesystem */
public class C35431wr extends C35561x4 implements C833548b {
    public C35431wr(Jid jid, int i) {
        String str;
        C56052rL A02 = C56052rL.A02();
        Class[] clsArr = new Class[2];
        clsArr[0] = C135146kC.class;
        List A1A = AnonymousClass0x9.A1A(UserJid.class, clsArr, 1);
        if (i != 0) {
            str = "from";
        } else {
            str = "to";
        }
        if (C626836d.A0I(jid, str, A1A, false)) {
            C56052rL.A06(jid, A02, str);
        }
        C41032Ir.A0A(A02, this);
    }
}
