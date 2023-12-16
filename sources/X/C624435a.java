package X;

import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.35a  reason: invalid class name and case insensitive filesystem */
public class C624435a {
    public static String A00(AnonymousClass3ZM r2) {
        String str;
        C95814uZ r22 = r2.A00;
        if (r22 instanceof GroupJid) {
            str = r22.getRawString();
        } else {
            C626936e.A0D(r22 instanceof UserJid, "MentionUtil/unexpected jid type in mention");
            str = r22.user;
            C626936e.A06(str);
        }
        return AnonymousClass000.A0V("@", str, AnonymousClass001.A0o());
    }

    public static String A01(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        JSONArray A1F = AnonymousClass0x9.A1F();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass3ZM r3 = (AnonymousClass3ZM) it.next();
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put("j", r3.A00.getRawString());
            Object obj = r3.A01;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            A1G.put("d", obj);
            A1F.put(A1G);
        }
        return A1F.toString();
    }

    public static boolean A05(C56972sr r2, List list) {
        return A02(UserJid.class, list).contains(C56972sr.A04(r2));
    }

    public static List A02(Class cls, Iterable iterable) {
        ArrayList A0s = AnonymousClass001.A0s();
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                C95814uZ r1 = ((AnonymousClass3ZM) it.next()).A00;
                if (cls.isInstance(r1)) {
                    A0s.add(cls.cast(r1));
                }
            }
        }
        return A0s;
    }

    public static List A03(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) != '[') {
            return A04(str);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C162457s7.A0J(jSONObject, 0);
                A0s.add(new AnonymousClass3ZM(C106405Yw.A04(jSONObject.getString("j")), C57282tO.A00("d", jSONObject, false)));
            }
            return A0s;
        } catch (JSONException unused) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("MentionUtil/Failed to parse mention from JSON looking string: ");
            A0o.append(str.substring(0, 5));
            C18260x0.A1K(A0o, "...");
            return A04(str);
        }
    }

    public static List A04(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List A0B = C627336j.A0B(UserJid.class, C18310x6.A0t(str));
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A0B.iterator();
        while (it.hasNext()) {
            A0s.add(new AnonymousClass3ZM(C18300x5.A0P(it), (String) null));
        }
        return A0s;
    }
}
