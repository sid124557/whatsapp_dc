package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.36d  reason: invalid class name and case insensitive filesystem */
public class C626836d {
    public static Object A04(AnonymousClass36K r2, AnonymousClass4B7 r3, String[] strArr) {
        for (String A0m : strArr) {
            r2 = r2.A0m(A0m);
        }
        return r3.Ax7(r2);
    }

    public static Object A05(AnonymousClass36K r10, Class cls, Long l, Long l2, Object obj, String[] strArr, boolean z) {
        Object obj2;
        String A0r;
        String A0r2;
        int length = strArr.length;
        if (length != 0) {
            int i = length - 1;
            String str = strArr[i];
            boolean A1U = AnonymousClass000.A1U(str.charAt(0), 35);
            for (int i2 = 0; i2 < i; i2++) {
                r10 = r10.A0m(strArr[i2]);
            }
            Long l3 = null;
            if (cls == String.class) {
                if (A1U) {
                    A0r2 = r10.A0n();
                } else {
                    A0r2 = r10.A0r(str, (String) null);
                }
                if (z) {
                    if (!AnonymousClass75J.A00(A0r2, obj)) {
                        throw A01("Error while parsing attribute '%s' in tag <%s/>.", A0P(r10, str, 2));
                    }
                } else if (A0r2 != null) {
                    if (l != null && ((long) A0r2.length()) < l.longValue()) {
                        Object[] A0P = A0P(r10, str, 3);
                        A0P[2] = l;
                        throw A01("Length of attribute %s for tag %s is less than the specified lower bound value of %s.", A0P);
                    } else if (l2 != null && ((long) A0r2.length()) > l2.longValue()) {
                        Object[] A0P2 = A0P(r10, str, 3);
                        A0P2[2] = l2;
                        throw A01("Length of attribute %s for tag %s is more than the specified upper bound value of %s.", A0P2);
                    } else if (obj != null && !A0r2.equals(obj)) {
                        throw A01("Error while parsing attribute '%s' in tag <%s/>.", A0P(r10, str, 2));
                    }
                }
                return A0r2;
            } else if (cls != byte[].class) {
                if (cls == Long.class || cls == Long.TYPE) {
                    if (A1U) {
                        A0r = r10.A0n();
                    } else {
                        A0r = r10.A0r(str, (String) null);
                    }
                    if (z) {
                        if (A0r != null) {
                            l3 = Long.valueOf(r10.A0f(A0r, str));
                        }
                        if (!AnonymousClass75J.A00(l3, obj)) {
                            throw A01("Error while parsing attribute '%s' in tag <%s/>.", A0P(r10, str, 2));
                        }
                    } else if (A0r != null) {
                        long A0f = r10.A0f(A0r, str);
                        obj2 = Long.valueOf(A0f);
                        if (l != null && A0f < l.longValue()) {
                            Object[] A0P3 = A0P(r10, str, 3);
                            A0P3[2] = l;
                            throw A01("Value of attribute '%s' for tag %s is less than the specified lower bound value of %s", A0P3);
                        } else if (l2 != null && A0f > l2.longValue()) {
                            Object[] A0P4 = A0P(r10, str, 3);
                            A0P4[2] = l2;
                            throw A01("Value of attribute '%s' for tag %s is more than the specified upper bound value of %s", A0P4);
                        } else if (obj != null && !obj2.equals(obj)) {
                            throw A01("Error while parsing attribute '%s' in tag <%s/>.", A0P(r10, str, 2));
                        }
                    }
                } else if (Jid.class.isAssignableFrom(cls)) {
                    obj2 = r10.A0g(cls, str);
                    if (z) {
                        if (!AnonymousClass75J.A00(obj2, obj)) {
                            throw A01("Error while parsing attribute '%s' in tag <%s/>.", A0P(r10, str, 2));
                        }
                    } else if (obj2 != null) {
                        if (obj != null && !obj2.equals(obj)) {
                            throw A01("Error while parsing attribute '%s' in tag <%s/>.", A0P(r10, str, 2));
                        }
                    }
                } else {
                    throw A01("Invalid type '%s' passed to function", new Object[]{cls.getName()});
                }
                return obj2;
            } else if (A1U) {
                byte[] bArr = r10.A01;
                if (bArr != null) {
                    if (l != null && ((long) bArr.length) < l.longValue()) {
                        throw A01("Length of element value for tag %s is less than the specified lower bound value of %s", new Object[]{r10.A00, l});
                    } else if (l2 == null || ((long) bArr.length) <= l2.longValue()) {
                        return bArr;
                    } else {
                        throw A01("Length of element value for tag %s is more than the specified upper bound value of %s", new Object[]{r10.A00, l2});
                    }
                }
            } else {
                throw new AnonymousClass24Y("Cannot have binary not contained in an element value in tag %s", r10.A00);
            }
            return l3;
        }
        throw AnonymousClass24Y.A01("Empty path");
    }

    public static List A0B(AnonymousClass36K r9, AnonymousClass4B7 r10, String[] strArr, long j, long j2) {
        int length = strArr.length;
        if (length != 0) {
            int i = length - 1;
            for (int i2 = 0; i2 < i; i2++) {
                r9 = r9.A0m(strArr[i2]);
            }
            String str = strArr[i];
            List A0s = r9.A0s(str);
            ArrayList A0s2 = AnonymousClass001.A0s();
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                A0s2.add(r10.Ax7(C18310x6.A0Y(it)));
            }
            if (((long) A0s2.size()) < j) {
                Object[] objArr = new Object[3];
                objArr[0] = str;
                AnonymousClass000.A1P(objArr, A0s2.size(), 1);
                AnonymousClass000.A1Q(objArr, 2, j);
                throw A01("Invalid number of children '%s'. Received %d children but the minimum value specified in the spec is %d.", objArr);
            } else if (((long) A0s2.size()) <= j2) {
                return A0s2;
            } else {
                Object[] objArr2 = new Object[3];
                objArr2[0] = str;
                AnonymousClass000.A1P(objArr2, A0s2.size(), 1);
                AnonymousClass000.A1Q(objArr2, 2, j2);
                throw A01("Invalid number of children '%s'. Received %d children but the maximum value specified in the spec is %d.", objArr2);
            }
        } else {
            throw AnonymousClass24Y.A01("Empty path");
        }
    }

    public static void A0F(AnonymousClass36K r7, Class cls, Object obj, String[] strArr) {
        A06(r7, cls, -9007199254740991L, 9007199254740991L, obj, strArr, false);
    }

    public static void A0G(C56052rL r8, String str) {
        if (A0M(str, 0, 9007199254740991L, false)) {
            r8.A0G(new AnonymousClass39V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
        }
    }

    public static void A0H(byte[] bArr, long j, long j2) {
        Object[] objArr;
        String str;
        long length = (long) bArr.length;
        if (length < j) {
            objArr = new Object[1];
            AnonymousClass000.A1Q(objArr, 0, j);
            str = "Length of binary byte array is less than the specified lower bound value of %d";
        } else if (length > j2) {
            objArr = new Object[1];
            AnonymousClass000.A1Q(objArr, 0, j2);
            str = "Length of binary byte array is greater than the specified lower bound value of %d";
        } else {
            return;
        }
        C18300x5.A1N(str, objArr);
    }

    public static boolean A0I(Jid jid, String str, List list, boolean z) {
        if (jid != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Class) it.next()).isAssignableFrom(jid.getClass())) {
                }
            }
            Object[] A1X = AnonymousClass0x9.A1X();
            A1X[0] = str;
            A1X[1] = TextUtils.join(", ", list);
            A1X[2] = C18310x6.A0n(jid);
            C18300x5.A1N("JID enum '%s' was expected to be one of '%s' but was '%s'.", A1X);
            return true;
        } else if (!z) {
            C18300x5.A1N("Received null for JID enum '%s'.", new Object[]{str});
            return false;
        }
        return true;
    }

    public static boolean A0J(Long l, long j, long j2, boolean z) {
        Object[] objArr;
        String str;
        if (l != null || z) {
            if (l != null) {
                long longValue = l.longValue();
                if (longValue < j) {
                    objArr = new Object[1];
                    AnonymousClass000.A1Q(objArr, 0, j);
                    str = "Value is less than the specified lower bound value of %d";
                } else if (longValue > j2) {
                    objArr = new Object[1];
                    AnonymousClass000.A1Q(objArr, 0, j2);
                    str = "Value is greater than the specified lower bound value of %d";
                }
                C18300x5.A1N(str, objArr);
            }
            return true;
        }
        C626936e.A0D(false, "Received null value for non-optional ':int'.");
        return false;
    }

    public static boolean A0L(Object obj, String str) {
        if (obj != null) {
            return true;
        }
        C18300x5.A1N("Received null value for non-optional '%s'.", new Object[]{str});
        return false;
    }

    public static boolean A0M(String str, long j, long j2, boolean z) {
        Object[] objArr;
        String str2;
        if (str != null || z) {
            if (str != null) {
                long length = (long) str.length();
                if (length < j) {
                    objArr = new Object[1];
                    AnonymousClass000.A1Q(objArr, 0, j);
                    str2 = "Length of string is less than the specified lower bound value of %s";
                } else if (length > j2) {
                    objArr = new Object[1];
                    AnonymousClass000.A1Q(objArr, 0, j2);
                    str2 = "Length of string is greater than the specified upper bound value of %s";
                }
                C18300x5.A1N(str2, objArr);
            }
            return true;
        }
        C626936e.A0D(false, "Received null value for non-optional ':string'.");
        return false;
    }

    public static boolean A0O(List list, long j, long j2) {
        Object[] objArr;
        String str;
        if (list == null) {
            C626936e.A0D(false, "Received null value for children. Pass `Collections.emptyList()` instead of null for non-present, optional children.");
            return false;
        }
        if (((long) list.size()) < j) {
            objArr = new Object[2];
            AnonymousClass000.A1P(objArr, list.size(), 0);
            AnonymousClass000.A1Q(objArr, 1, j);
            str = "Number of children %d is less than the specified minimum value of %d";
        } else {
            if (((long) list.size()) > j2) {
                objArr = new Object[2];
                AnonymousClass000.A1P(objArr, list.size(), 0);
                AnonymousClass000.A1Q(objArr, 1, j2);
                str = "Number of children %d is greater than the specified maximum value of %d";
            }
            return true;
        }
        C18300x5.A1N(str, objArr);
        return true;
    }

    public static Object[] A0P(AnonymousClass36K r3, Object obj, int i) {
        Object[] objArr = new Object[i];
        objArr[0] = obj;
        objArr[1] = r3.A00;
        return objArr;
    }

    public static Jid A00(AnonymousClass36K r7, List list, String[] strArr) {
        Jid jid = (Jid) A06(r7, Jid.class, (Long) null, (Long) null, (Object) null, strArr, false);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Class) it.next()).isAssignableFrom(jid.getClass())) {
                return jid;
            }
        }
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = TextUtils.join(", ", list);
        A0M[1] = C18310x6.A0n(jid);
        throw A01("JID was expected to be one of '%s' but was '%s'.", A0M);
    }

    public static Object A02(AnonymousClass36K r1, AnonymousClass4B7 r2, int i) {
        return A04(r1, r2, new String[i]);
    }

    public static Object A03(AnonymousClass36K r7, AnonymousClass4B7 r8, String[] strArr) {
        List A0B = A0B(r7, r8, strArr, 0, 1);
        if (A0B.isEmpty()) {
            return null;
        }
        return C18290x4.A0k(A0B);
    }

    public static Object A08(AnonymousClass36K r1, String[] strArr, int i) {
        return A03(r1, new C86304Jp(i), strArr);
    }

    public static String A09(AnonymousClass36K r7, List list, String[] strArr) {
        String str = (String) A05(r7, String.class, (Long) null, (Long) null, (Object) null, strArr, false);
        if (str == null) {
            return null;
        }
        if (list.contains(str)) {
            return str;
        }
        Object[] A0L = AnonymousClass002.A0L();
        A0L[0] = TextUtils.join(", ", list);
        throw A01("String was expected to be one of '%s'.", A0L);
    }

    public static String A0A(AnonymousClass36K r7, List list, String[] strArr) {
        String str = (String) A06(r7, String.class, (Long) null, (Long) null, (Object) null, strArr, false);
        if (list.contains(str)) {
            return str;
        }
        Object[] A0L = AnonymousClass002.A0L();
        A0L[0] = TextUtils.join(", ", list);
        throw A01("String was expected to be one of '%s'.", A0L);
    }

    public static List A0C(AnonymousClass36K r5, String[] strArr, int i) {
        return A0B(r5, new C86304Jp(i), strArr, 1, 1);
    }

    public static void A0E(AnonymousClass36K r2, AnonymousClass36K r3, int i) {
        A04(r3, new C86294Jo(r2, i), new String[0]);
    }

    public static boolean A0K(Long l, boolean z) {
        return A0J(l, 0, 9007199254740991L, z);
    }

    public static boolean A0N(String str, boolean z) {
        return A0M(str, 0, 9007199254740991L, z);
    }

    public static AnonymousClass24Y A01(String str, Object[] objArr) {
        return new AnonymousClass24Y(String.format(str, objArr));
    }

    public static Object A06(AnonymousClass36K r6, Class cls, Long l, Long l2, Object obj, String[] strArr, boolean z) {
        Object A05 = A05(r6, cls, l, l2, obj, strArr, z);
        if (A05 != null) {
            return A05;
        }
        int length = strArr.length - 1;
        String str = strArr[length];
        for (int i = 0; i < length; i++) {
            r6 = r6.A0m(strArr[i]);
        }
        Object[] A1b = C18310x6.A1b(str, 0);
        A1b[1] = r6.A00;
        throw A01("Required attribute '%s' missing for tag '%s'", A1b);
    }

    public static Object A07(AnonymousClass36K r4, String str, List list, String[] strArr) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                return A04(r4, (AnonymousClass4B7) it.next(), strArr);
            } catch (AnonymousClass24Y e) {
                A0s.add(e.getMessage());
            }
        }
        Object[] A1a = C18310x6.A1a(str);
        A1a[1] = C107575bX.A08("\n", A0s);
        throw A01("Required mixin group '%s' was not present, encountered the following errors for each possible mixin:\n%s", A1a);
    }

    public static void A0D(Jid jid, C56052rL r2, String str) {
        if (A0L(jid, str)) {
            r2.A0G(new AnonymousClass39V(jid, str));
        }
    }
}
