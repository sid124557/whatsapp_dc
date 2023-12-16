package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;

/* renamed from: X.32V  reason: invalid class name */
public final class AnonymousClass32V {
    public static final GroupJid A01(Jid jid) {
        if (jid instanceof GroupJid) {
            return (GroupJid) jid;
        }
        return null;
    }

    public static GroupJid A00(Jid jid) {
        return A01(jid);
    }

    public static final GroupJid A02(String str) {
        GroupJid groupJid;
        Jid A01 = AnonymousClass32W.A01(str);
        if ((A01 instanceof GroupJid) && (groupJid = (GroupJid) A01) != null) {
            return groupJid;
        }
        throw AnonymousClass24P.A00(str);
    }

    public final GroupJid A03(String str) {
        Object obj;
        try {
            obj = A02(str);
        } catch (Throwable th) {
            obj = AnonymousClass3Z0.A01(th);
        }
        if (obj instanceof AnonymousClass3Z0) {
            obj = null;
        }
        return (GroupJid) obj;
    }
}
