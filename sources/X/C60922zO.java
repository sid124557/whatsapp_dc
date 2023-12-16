package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.crypto.SecretKey;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2zO  reason: invalid class name and case insensitive filesystem */
public final class C60922zO {
    public final C55512qT A00;
    public final C56162rW A01;
    public final AnonymousClass1Uc A02;
    public final C23651Ud A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass31C A05;

    public static final boolean A00(C41572Kt r5) {
        if (r5 != null) {
            List<C53832nk> list = r5.A01;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (C53832nk r2 : list) {
                    if (r2.A02 != null && "PUBLISHED".equalsIgnoreCase(r2.A00)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void A01(UserJid userJid) {
        C162457s7.A0J(userJid, 0);
        if (this.A00.A04(userJid)) {
            new AnonymousClass3TI(userJid, this.A05).A00(new C64513Du(this, (AnonymousClass4EG) null, (String) null, (SecretKey) null, (byte[]) null, -1, false, false));
        }
    }

    public final boolean A02(UserJid userJid) {
        String A0R;
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        if (userJid != null) {
            AnonymousClass1VX r2 = this.A04;
            C58422vE r1 = C58422vE.A02;
            if (!r2.A0Y(r1, 2999) && (A0R = r2.A0R(r1, 1320)) != null) {
                try {
                    JSONObject optJSONObject2 = AnonymousClass0x9.A1H(A0R).optJSONObject("galaxy_message");
                    if (!(optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("flows")) == null)) {
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            JSONObject optJSONObject3 = optJSONObject.optJSONObject(AnonymousClass001.A0m(keys));
                            if (!(optJSONObject3 == null || (optJSONArray = optJSONObject3.optJSONArray("supported_businesses")) == null)) {
                                int length = optJSONArray.length();
                                for (int i = 0; i < length; i++) {
                                    String str = userJid.user;
                                    String string = optJSONArray.getString(i);
                                    if (str == null) {
                                        if (string == null) {
                                            return true;
                                        }
                                    } else if (str.equalsIgnoreCase(string)) {
                                        return true;
                                    }
                                }
                                continue;
                            }
                        }
                    }
                } catch (Exception e) {
                    Log.e("ExtensionsLogger/ExtensionsConnectionManager/isExtensionsBusiness()", e);
                }
            }
        }
        return false;
    }

    public C60922zO(C55512qT r1, C56162rW r2, AnonymousClass1Uc r3, C23651Ud r4, AnonymousClass1VX r5, AnonymousClass31C r6) {
        C18260x0.A0Q(r6, r5);
        this.A05 = r6;
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
    }
}
