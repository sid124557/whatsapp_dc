package X;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.360  reason: invalid class name */
public class AnonymousClass360 {
    public static Collection A00(Object obj) {
        if (!(obj instanceof C834348j) || (obj instanceof C85404Gc)) {
            try {
                return (Collection) obj;
            } catch (ClassCastException e) {
                C162457s7.A0N(AnonymousClass360.class.getName(), e);
                throw e;
            }
        } else {
            A04(obj, "kotlin.collections.MutableCollection");
            throw AnonymousClass000.A0L();
        }
    }

    public static List A01(Object obj) {
        if (!(obj instanceof C834348j) || (obj instanceof C85384Ga)) {
            try {
                return (List) obj;
            } catch (ClassCastException e) {
                C162457s7.A0N(AnonymousClass360.class.getName(), e);
                throw e;
            }
        } else {
            A04(obj, "kotlin.collections.MutableList");
            throw AnonymousClass000.A0L();
        }
    }

    public static Map A02(Object obj) {
        if (!(obj instanceof C834348j) || (obj instanceof AnonymousClass4GZ)) {
            try {
                return (Map) obj;
            } catch (ClassCastException e) {
                C162457s7.A0N(AnonymousClass360.class.getName(), e);
                throw e;
            }
        } else {
            A04(obj, "kotlin.collections.MutableMap");
            throw AnonymousClass000.A0L();
        }
    }

    public static void A03(Object obj, int i) {
        if (obj != null && !A05(i, obj)) {
            A04(obj, AnonymousClass000.A0Y("kotlin.jvm.functions.Function", AnonymousClass001.A0o(), i));
            throw AnonymousClass000.A0L();
        }
    }

    public static void A04(Object obj, String str) {
        String A0O;
        if (obj == null) {
            A0O = "null";
        } else {
            A0O = AnonymousClass000.A0O(obj);
        }
        ClassCastException classCastException = new ClassCastException(AnonymousClass000.A0V(" cannot be cast to ", str, AnonymousClass000.A0l(A0O)));
        C162457s7.A0N(AnonymousClass360.class.getName(), classCastException);
        throw classCastException;
    }

    public static boolean A05(int i, Object obj) {
        int i2;
        if (obj instanceof C834048g) {
            if (obj instanceof AnonymousClass4GV) {
                i2 = ((AnonymousClass4GV) obj).getArity();
            } else if (obj instanceof AnonymousClass4GP) {
                i2 = 0;
            } else if (obj instanceof AnonymousClass4GQ) {
                i2 = 1;
            } else if (obj instanceof AnonymousClass4GR) {
                i2 = 2;
            } else if (obj instanceof AnonymousClass4GS) {
                i2 = 3;
            } else if (obj instanceof AnonymousClass4GT) {
                i2 = 4;
            } else if (obj instanceof AnonymousClass4GU) {
                i2 = 5;
            } else {
                i2 = -1;
                if (obj instanceof C76733sG) {
                    i2 = 6;
                }
            }
            if (i2 != i) {
                return false;
            }
            return true;
        }
        return false;
    }
}
