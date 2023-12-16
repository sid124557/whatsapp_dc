package X;

import java.security.AccessController;
import java.security.Provider;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.8SV  reason: invalid class name */
public final class AnonymousClass8SV extends Provider implements C185198tF {
    public static final Map A00 = AnonymousClass001.A0t();
    public static final C156897hO A01 = new C156897hO();
    public static final String[] A02 = {"MD5", "SHA1", "SHA256", "SHA384"};
    public static final String[] A03 = {"AES", "XSalsa20"};
    public static final String[] A04 = {"PBEPBKDF2"};

    public final void A00(String str, String[] strArr) {
        for (int i = 0; i != strArr.length; i++) {
            StringBuilder A0l = AnonymousClass000.A0l(str);
            A0l.append(strArr[i]);
            Class A002 = C1454375w.A00(AnonymousClass000.A0X("$Mappings", A0l), AnonymousClass8SV.class);
            if (A002 != null) {
                try {
                    ((AnonymousClass7R3) A002.newInstance()).A07(this);
                } catch (Exception e) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("cannot create instance of ");
                    A0o.append(str);
                    A0o.append(strArr[i]);
                    throw new InternalError(AnonymousClass000.A0P(e, "$Mappings : ", A0o));
                }
            }
        }
    }

    public void AwK(String str, String str2) {
        if (!containsKey(str)) {
            put(str, str2);
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("duplicate provider key (");
        A0o.append(str);
        throw AnonymousClass000.A0I(") found", A0o);
    }

    public void AwL(String str, String str2, C176768dX r5) {
        AwK(AnonymousClass000.A0P(r5, ".", AnonymousClass000.A0l(str)), str2);
        AwK(AnonymousClass000.A0P(r5, ".OID.", AnonymousClass000.A0l(str)), str2);
    }

    public void AwM(String str, Map map) {
        Iterator A0i = C18280x3.A0i(map);
        while (A0i.hasNext()) {
            String A0m = AnonymousClass001.A0m(A0i);
            String A0V = AnonymousClass000.A0V(" ", A0m, AnonymousClass000.A0l(str));
            if (!containsKey(A0V)) {
                put(A0V, map.get(A0m));
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("duplicate provider attribute key (");
                A0o.append(A0V);
                throw AnonymousClass000.A0I(") found", A0o);
            }
        }
    }

    public AnonymousClass8SV() {
        super("SC", 1.68d, "SpongyCastle Security Provider v1.68");
        AccessController.doPrivileged(new C172808Mx(this));
    }
}
