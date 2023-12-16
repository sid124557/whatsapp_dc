package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.1vA  reason: invalid class name and case insensitive filesystem */
public class C34441vA extends AnonymousClass361 {
    public synchronized Set A04(String str) {
        HashSet A0K;
        String A02 = A02(str);
        A0K = AnonymousClass002.A0K();
        if (A02 != null) {
            try {
                JSONArray jSONArray = new JSONArray(A02);
                for (int i = 0; i < jSONArray.length(); i++) {
                    A0K.add(jSONArray.getString(i));
                }
            } catch (JSONException e) {
                throw new IllegalStateException("key-value-store/getStringSetProp:", e);
            }
        }
        return A0K;
    }

    public synchronized void A06(String str, Set set) {
        JSONArray A1F = AnonymousClass0x9.A1F();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            A1F.put(AnonymousClass001.A0m(it));
        }
        A05(str, A1F.toString());
    }

    public Integer A00(String str) {
        String A02 = A02(str);
        if (A02 == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(A02));
        } catch (NumberFormatException e) {
            C18260x0.A0u("key-value-store/getIntProp/Invalid int value: ", A02, AnonymousClass001.A0o(), e);
            return null;
        }
    }

    public Long A01(String str) {
        String A02 = A02(str);
        if (A02 == null) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(A02));
        } catch (NumberFormatException e) {
            C18260x0.A0u("key-value-store/getLongProp/Invalid long value: ", A02, AnonymousClass001.A0o(), e);
            return null;
        }
    }

    public String A02(String str) {
        Cursor A0A;
        AnonymousClass4GK A03 = C18630y0.A03(this);
        try {
            A0A = AnonymousClass361.A0A(A03, "SELECT prop_value FROM wa_props WHERE prop_name = ?", "CONTACT_PROPS", C18270x1.A1b(str));
            if (A0A.moveToFirst()) {
                String A0Z = AnonymousClass0x2.A0Z(A0A, "prop_value");
                A0A.close();
                A03.close();
                return A0Z;
            }
            A0A.close();
            A03.close();
            return null;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public List A03(String str) {
        String A02 = A02(str);
        if (A02 == null) {
            return null;
        }
        String[] A1b = C18320x8.A1b(A02);
        ArrayList A0s = AnonymousClass001.A0s();
        int length = A1b.length;
        int i = 0;
        while (i < length) {
            String str2 = A1b[i];
            try {
                AnonymousClass0x2.A1Q(A0s, Long.parseLong(str2));
                i++;
            } catch (NumberFormatException e) {
                C18260x0.A0u("key-value-store/getLongListProp/Invalid long value: ", str2, AnonymousClass001.A0o(), e);
                return null;
            }
        }
        return A0s;
    }

    public final void A05(String str, String str2) {
        C85284Fq A07;
        try {
            A07 = C18630y0.A07(this);
            if (TextUtils.isEmpty(str2)) {
                AnonymousClass361.A08(A07, "wa_props", "prop_name=?", C18270x1.A1b(str));
            } else {
                ContentValues A09 = C18280x3.A09();
                A09.put("prop_name", str);
                A09.put("prop_value", str2);
                AnonymousClass361.A0B(A09, A07, "wa_props");
            }
            A07.close();
            return;
        } catch (IllegalArgumentException e) {
            C626936e.A08(AnonymousClass000.A0V("key-value-store/unable to set prop:", str, AnonymousClass001.A0o()), e);
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public C34441vA(AnonymousClass1RI r1) {
        super(r1);
    }
}
