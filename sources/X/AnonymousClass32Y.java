package X;

import android.database.Cursor;
import android.os.BaseBundle;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.AbstractCollection;

/* renamed from: X.32Y  reason: invalid class name */
public final class AnonymousClass32Y {
    public static UserJid A01(BaseBundle baseBundle) {
        return UserJid.Companion.A0E(baseBundle.getString("chat_id"));
    }

    public static final UserJid A05(Jid jid) {
        if (jid instanceof UserJid) {
            return (UserJid) jid;
        }
        return null;
    }

    public static UserJid A08(String str) {
        return UserJid.Companion.A0E(str);
    }

    public static void A0D(AnonymousClass1ES r2, C624134x r3) {
        r3.A1J(UserJid.Companion.A0E(r2.participant_));
    }

    public static UserJid A00(Cursor cursor, int i) {
        return UserJid.Companion.A0E(cursor.getString(i));
    }

    public static UserJid A02(C623334p r0, long j) {
        return A05(r0.A08(j));
    }

    public static UserJid A03(Jid jid) {
        return A05(jid);
    }

    public static UserJid A04(Jid jid) {
        UserJid A05 = A05(jid);
        C626936e.A06(A05);
        return A05;
    }

    public static UserJid A06(AnonymousClass1ES r0, int i) {
        return UserJid.Companion.A0E(r0.A0N(i));
    }

    public static UserJid A07(C624134x r0) {
        return A05(r0.A0n());
    }

    public static UserJid A09(String str) {
        return A0A(str);
    }

    public static final UserJid A0A(String str) {
        UserJid userJid;
        Jid A01 = AnonymousClass32W.A01(str);
        if ((A01 instanceof UserJid) && (userJid = (UserJid) A01) != null) {
            return userJid;
        }
        throw AnonymousClass24P.A00(str);
    }

    public static void A0B(AnonymousClass32Y r0, C624134x r1, String str) {
        r1.A1J(r0.A0E(str));
    }

    public static void A0C(AnonymousClass32Y r0, String str, AbstractCollection abstractCollection) {
        UserJid A0E = r0.A0E(str);
        if (A0E != null) {
            abstractCollection.add(A0E);
        }
    }

    public final UserJid A0E(String str) {
        Object obj;
        try {
            obj = A0A(str);
        } catch (Throwable th) {
            obj = AnonymousClass3Z0.A01(th);
        }
        if (obj instanceof AnonymousClass3Z0) {
            obj = null;
        }
        return (UserJid) obj;
    }
}
