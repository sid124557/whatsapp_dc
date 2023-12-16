package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.32X  reason: invalid class name */
public final class AnonymousClass32X {
    public static final PhoneUserJid A00(String str) {
        PhoneUserJid phoneUserJid;
        C162457s7.A0J(str, 0);
        UserJid A04 = UserJid.JID_FACTORY.A04(str, "s.whatsapp.net");
        C162457s7.A0D(A04);
        if ((A04 instanceof PhoneUserJid) && (phoneUserJid = (PhoneUserJid) A04) != null) {
            return phoneUserJid;
        }
        throw AnonymousClass24P.A00(AnonymousClass000.A0V("invalid phone number: ", str, AnonymousClass001.A0o()));
    }

    public static final boolean A01(String str) {
        C162457s7.A0J(str, 0);
        int length = str.length();
        if (length >= 5 && length <= 20 && !C175738Zn.A0Y(str, "10", false) && !C175738Zn.A0Y(str, "0", false)) {
            char[] charArray = str.toCharArray();
            C162457s7.A0D(charArray);
            int length2 = charArray.length;
            int i = 0;
            while (i < length2) {
                char c = charArray[i];
                if (C162457s7.A00(c, 48) >= 0 && C162457s7.A00(c, 57) <= 0) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    public final PhoneUserJid A02(String str) {
        Object obj;
        try {
            Jid A01 = AnonymousClass32W.A01(str);
            if (!(A01 instanceof PhoneUserJid) || (obj = (PhoneUserJid) A01) == null) {
                throw AnonymousClass24P.A00(str);
            }
            if (obj instanceof AnonymousClass3Z0) {
                obj = null;
            }
            return (PhoneUserJid) obj;
        } catch (Throwable th) {
            obj = AnonymousClass3Z0.A01(th);
        }
    }
}
