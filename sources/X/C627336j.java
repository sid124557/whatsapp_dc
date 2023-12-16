package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.36j  reason: invalid class name and case insensitive filesystem */
public final class C627336j {
    public static C95814uZ A02(Jid jid) {
        if (jid instanceof DeviceJid) {
            return ((DeviceJid) jid).userJid;
        }
        return C106405Yw.A03(jid);
    }

    public static UserJid A05(String str) {
        AnonymousClass1fY r1 = AnonymousClass1fY.A00;
        if ("".equals(str) || r1.getRawString().equals(str)) {
            return r1;
        }
        return AnonymousClass32Y.A08(str);
    }

    public static String A07(Jid jid) {
        if (jid == null) {
            return null;
        }
        return jid.getRawString();
    }

    public static String A08(String str) {
        Class<Jid> cls = Jid.class;
        Jid A00 = AnonymousClass32W.A00(str);
        if (A00 == null || !cls.isAssignableFrom(A00.getClass())) {
            return str;
        }
        return A00.toString();
    }

    public static String A09(String[] strArr) {
        if (strArr == null) {
            return "null";
        }
        int length = strArr.length - 1;
        if (length == -1) {
            return "[]";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append('[');
        int i = 0;
        while (true) {
            A0o.append(A08(strArr[i]));
            if (i == length) {
                return AnonymousClass0x2.A0f(A0o);
            }
            AnonymousClass001.A1M(A0o);
            i++;
        }
    }

    public static List A0C(String[] strArr) {
        Class<UserJid> cls = UserJid.class;
        ArrayList A0s = AnonymousClass001.A0s();
        for (String str : strArr) {
            if (str != null) {
                Jid A00 = AnonymousClass32W.A00(str);
                if (cls.isInstance(A00)) {
                    A0s.add(cls.cast(A00));
                }
            }
        }
        return A0s;
    }

    public static void A0G(Class cls, Collection collection, Collection collection2) {
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Jid A00 = AnonymousClass32W.A00(AnonymousClass001.A0m(it));
                if (cls.isInstance(A00)) {
                    collection2.add(cls.cast(A00));
                }
            }
        }
    }

    public static void A0H(Iterable iterable, Collection collection) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Jid A0S = AnonymousClass0x7.A0S(it);
                if (A0S != null) {
                    collection.add(A0S.getRawString());
                }
            }
        }
    }

    public static boolean A0I(Jid jid) {
        if (jid == null) {
            return false;
        }
        int type = jid.getType();
        if (type == 0 || type == 1 || type == 18 || type == 22 || type == 3 || type == 7 || type == 21) {
            return true;
        }
        return false;
    }

    public static boolean A0J(Jid jid) {
        if (jid == null) {
            return false;
        }
        int type = jid.getType();
        if (type == 10 || type == 0 || type == 17 || type == 20 || type == 18 || type == 19) {
            return true;
        }
        return false;
    }

    public static boolean A0K(Jid jid) {
        if ((jid instanceof C28001fK) || (jid instanceof C27991fJ)) {
            return true;
        }
        return false;
    }

    public static boolean A0L(Jid jid) {
        if ((jid instanceof C27981fH) || (jid instanceof C135136kB)) {
            return true;
        }
        return false;
    }

    public static boolean A0M(Jid jid) {
        if ((jid instanceof PhoneUserJid) || (jid instanceof C135196kH)) {
            return true;
        }
        return false;
    }

    public static int A00(C55682qk r2, Set set) {
        HashSet hashSet = new HashSet(set.size());
        A0F(r2, set, hashSet);
        return hashSet.size();
    }

    public static Intent A01(Context context, Jid jid, int i) {
        return C627736r.A08(context, i).putExtra("jid", A07(jid));
    }

    public static C95814uZ A03(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C95814uZ A0P = C18300x5.A0P(it);
            if (A0P instanceof C135166kE) {
                return A0P;
            }
        }
        return null;
    }

    public static C27991fJ A04(String str) {
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append('@');
        String A0X = AnonymousClass000.A0X("g.us", A0l);
        Jid A00 = AnonymousClass32W.A00(A0X);
        if (A00 instanceof C27991fJ) {
            return (C27991fJ) A00;
        }
        throw AnonymousClass24P.A00(A0X);
    }

    public static String A06(AnonymousClass4FC r1) {
        return A07(r1.getContact().A0I(C95814uZ.class));
    }

    public static ArrayList A0A(Collection collection) {
        ArrayList A0u = C18300x5.A0u(collection);
        A0H(collection, A0u);
        return A0u;
    }

    public static List A0B(Class cls, Iterable iterable) {
        ArrayList A0s = AnonymousClass001.A0s();
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Jid A00 = AnonymousClass32W.A00(AnonymousClass001.A0m(it));
                if (cls.isInstance(A00)) {
                    A0s.add(cls.cast(A00));
                }
            }
        }
        return A0s;
    }

    public static void A0D(Intent intent, Jid jid, String str) {
        intent.putExtra(str, A07(jid));
    }

    public static void A0E(Intent intent, Jid jid, String str, String str2) {
        intent.setClassName(str, str2);
        intent.putExtra("jid", A07(jid));
    }

    public static void A0F(C55682qk r4, Iterable iterable, Collection collection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            DeviceJid A0R = AnonymousClass0x7.A0R(it);
            if (A0R == null) {
                r4.A0A("Jids/deviceJidsToUserJids/null-jid", true, (String) null);
            } else {
                collection.add(A0R.userJid);
            }
        }
    }

    public static boolean A0N(Collection collection) {
        for (Object obj : collection) {
            if (obj instanceof C95804uY) {
                return true;
            }
        }
        return false;
    }

    public static String[] A0O(Collection collection) {
        ArrayList A0u = C18300x5.A0u(collection);
        A0H(collection, A0u);
        return C18280x3.A1b(A0u);
    }

    public static String[] A0P(Object[] objArr) {
        return A0O(Arrays.asList(objArr));
    }
}
