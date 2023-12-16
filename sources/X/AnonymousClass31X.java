package X;

import android.text.TextUtils;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.31X  reason: invalid class name */
public class AnonymousClass31X {
    public static void A00(AnonymousClass1VX r19, AnonymousClass2RJ r20, AnonymousClass36K r21, String str) {
        int i;
        boolean z;
        AnonymousClass36K A0l = r21.A0l(str);
        C626936e.A06(A0l);
        List A0s = A0l.A0s("participant");
        ArrayList A0s2 = AnonymousClass001.A0s();
        Class<UserJid> cls = UserJid.class;
        Iterator A0M = AnonymousClass36K.A0M(A0l, "participant");
        while (A0M.hasNext()) {
            A0s2.add(C18310x6.A0Y(A0M).A0g(cls, "jid"));
        }
        ArrayList A0s3 = AnonymousClass001.A0s();
        A01(A0l, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0s3);
        ArrayList A0s4 = AnonymousClass001.A0s();
        A01(A0l, "error", A0s4);
        ArrayList A0s5 = AnonymousClass001.A0s();
        C58422vE r5 = C58422vE.A02;
        AnonymousClass1VX r10 = r19;
        if (r10.A0Y(r5, 4136)) {
            Iterator A0M2 = AnonymousClass36K.A0M(A0l, "participant");
            while (A0M2.hasNext()) {
                boolean z2 = true;
                if ("false".equals(AnonymousClass36K.A0L(C18310x6.A0Y(A0M2), "addressable"))) {
                    z2 = false;
                }
                A0s5.add(Boolean.valueOf(z2));
            }
        }
        ArrayList A0s6 = AnonymousClass001.A0s();
        ArrayList A0s7 = AnonymousClass001.A0s();
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            AnonymousClass36K A0Y = C18310x6.A0Y(it);
            AnonymousClass36K A0l2 = A0Y.A0l("add_request");
            if (A0l2 == null) {
                A0s6.add((Object) null);
            } else {
                AnonymousClass0x2.A1F(A0l2.A0r("code", (String) null), A0l2.A0r("expiration", (String) null), A0s6);
            }
            AnonymousClass36K A0l3 = A0Y.A0l("membership_approval_request");
            if (A0l3 == null) {
                A0s7.add((Object) null);
            } else {
                A0s7.add(A0l3.A0r("error", (String) null));
            }
        }
        for (int i2 = 0; i2 < A0s2.size(); i2++) {
            Jid jid = (Jid) A0s2.get(i2);
            String str2 = (String) A0s4.get(i2);
            AnonymousClass2RJ r13 = r20;
            if (str2 != null) {
                try {
                    i = Integer.valueOf(str2).intValue();
                    if (i == 421 && !TextUtils.isEmpty((CharSequence) A0s7.get(i2)) && TextUtils.isDigitsOnly((CharSequence) A0s7.get(i2))) {
                        i = Integer.valueOf(AnonymousClass000.A0X((String) A0s7.get(i2), C18320x8.A0j(i))).intValue();
                    }
                } catch (Exception unused) {
                    i = 499;
                }
                C18280x3.A1D(jid, r13.A02, i);
                if (i == 403) {
                    if (r10.A0Y(r5, 4136)) {
                        z = AnonymousClass001.A1Z(A0s5.get(i2));
                    } else {
                        z = true;
                    }
                    Pair pair = (Pair) A0s6.get(i2);
                    if (pair != null && z) {
                        try {
                            long longValue = Long.valueOf((String) pair.second).longValue();
                            r13.A03.put(jid, new AnonymousClass2L3((String) pair.first, longValue));
                        } catch (Exception unused2) {
                        }
                    }
                    if (r10.A0Y(r5, 4136) && !AnonymousClass001.A1Z(A0s5.get(i2))) {
                        r13.A01.add(jid.getRawString());
                    }
                }
                if (r10.A0Y(r5, 4136) && i == 451) {
                    r13.A01.add(jid.getRawString());
                }
            } else {
                Object obj = A0s3.get(i2);
                if (obj == null) {
                    obj = "";
                }
                r13.A04.put(jid, obj);
            }
        }
    }

    public static void A02(AnonymousClass36K r5, String str, Map map, Map map2) {
        int i;
        Class<UserJid> cls = UserJid.class;
        AnonymousClass36K A0l = r5.A0l(str);
        C626936e.A06(A0l);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A0M = AnonymousClass36K.A0M(A0l, "participant");
        while (A0M.hasNext()) {
            A0s.add(C18310x6.A0Y(A0M).A0g(cls, "jid"));
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        A01(A0l, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0s2);
        ArrayList A0s3 = AnonymousClass001.A0s();
        A01(A0l, "error", A0s3);
        for (int i2 = 0; i2 < A0s.size(); i2++) {
            Object obj = A0s.get(i2);
            String str2 = (String) A0s3.get(i2);
            if (str2 != null) {
                try {
                    i = Integer.valueOf(str2);
                } catch (Exception unused) {
                    i = 499;
                }
                map2.put(obj, i);
            } else {
                Object obj2 = A0s2.get(i2);
                if (obj2 == null) {
                    obj2 = "";
                }
                map.put(obj, obj2);
            }
        }
    }

    public static void A01(AnonymousClass36K r1, String str, List list) {
        Iterator A0M = AnonymousClass36K.A0M(r1, "participant");
        while (A0M.hasNext()) {
            list.add(AnonymousClass36K.A0L(C18310x6.A0Y(A0M), str));
        }
    }
}
