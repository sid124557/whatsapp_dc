package X;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.7pt  reason: invalid class name and case insensitive filesystem */
public final class C161547pt {
    public static final Integer A00(Object obj, Object obj2) {
        int compareTo;
        boolean z = true;
        boolean A1X = AnonymousClass000.A1X(obj);
        if (obj2 != null) {
            z = false;
        }
        if (z ^ A1X) {
            throw new ClassCastException("One of the input is null, but the other one is not");
        } else if (obj == null || obj2 == null) {
            return 0;
        } else {
            AnonymousClass3Z6 A01 = A01(obj, obj2);
            Object obj3 = A01.first;
            Object obj4 = A01.second;
            if (obj3.getClass() == obj4.getClass()) {
                if (obj3 instanceof Long) {
                    int i = (C18310x6.A0B(obj3) > C18310x6.A0B(obj4) ? 1 : (C18310x6.A0B(obj3) == C18310x6.A0B(obj4) ? 0 : -1));
                    if (i < 0) {
                        compareTo = -1;
                    } else {
                        compareTo = AnonymousClass6C9.A1L(i);
                    }
                } else if (obj3 instanceof Double) {
                    compareTo = Double.compare(AnonymousClass6C9.A02(obj3), AnonymousClass6C9.A02(obj4));
                } else if (obj3 instanceof Boolean) {
                    compareTo = Boolean.compare(AnonymousClass001.A1Z(obj3), AnonymousClass001.A1Z(obj4));
                } else if (!(obj3 instanceof String)) {
                    return null;
                } else {
                    compareTo = ((String) obj3).compareTo((String) obj4);
                }
                return Integer.valueOf(compareTo);
            }
            throw new ClassCastException("Two input are not the same type");
        }
    }

    public static final AnonymousClass3Z6 A01(Object obj, Object obj2) {
        if ((obj instanceof Double) && (obj2 instanceof Number)) {
            return AnonymousClass3Z6.A02(obj, Double.valueOf(AnonymousClass6C9.A02(obj2)));
        }
        if ((obj instanceof Number) && (obj2 instanceof Double)) {
            return AnonymousClass3Z6.A02(Double.valueOf(AnonymousClass6C9.A02(obj)), obj2);
        }
        if (obj instanceof Integer) {
            obj = C18280x3.A0U((Number) obj);
        }
        if (obj2 instanceof Integer) {
            obj2 = C18280x3.A0U((Number) obj2);
        }
        return AnonymousClass3Z6.A02(obj, obj2);
    }

    public static final boolean A02(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return C162457s7.A0P(obj2, obj);
        }
        AnonymousClass3Z6 A01 = A01(obj, obj2);
        Object obj3 = A01.first;
        Object obj4 = A01.second;
        if (obj3.getClass() != obj4.getClass()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("The two values for comparison are different classes. Expected: ");
            C18260x0.A0N(obj.getClass(), A0o);
            A0o.append(", Actual: ");
            C18260x0.A0N(obj2.getClass(), A0o);
            throw new ClassCastException(A0o.toString());
        } else if (obj3 instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj3;
            JSONObject jSONObject2 = (JSONObject) obj4;
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            Iterator<String> keys = jSONObject.keys();
            C162457s7.A0D(keys);
            while (keys.hasNext()) {
                String A0m = AnonymousClass001.A0m(keys);
                if (!A02(jSONObject.opt(A0m), jSONObject2.opt(A0m))) {
                    return false;
                }
            }
            return true;
        } else if (obj3 instanceof JSONArray) {
            return A04((JSONArray) obj3, (JSONArray) obj4);
        } else {
            if ((obj3 instanceof Number) || (obj3 instanceof Boolean) || (obj3 instanceof String)) {
                return obj3.equals(obj4);
            }
            throw AnonymousClass002.A0G("The class type is currently not supported, only supports Number, Boolean, String, JSONObject, and JSONArray");
        }
    }

    public static final boolean A03(Object obj, Object obj2) {
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            if (jSONArray.length() != 0) {
                int length = jSONArray.length();
                int i = 0;
                while (i < length) {
                    Object obj3 = jSONArray.get(i);
                    C162457s7.A0D(obj3);
                    AnonymousClass3Z6 A01 = A01(obj3, obj2);
                    Object obj4 = A01.first;
                    Object obj5 = A01.second;
                    Class<?> cls = obj4.getClass();
                    if (cls == obj5.getClass()) {
                        i++;
                    } else {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("The two values for comparison are different classes. Expected: ");
                        C18260x0.A0N(cls, A0o);
                        A0o.append(", Actual: ");
                        C18260x0.A0N(obj2.getClass(), A0o);
                        throw new ClassCastException(A0o.toString());
                    }
                }
                int length2 = jSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    if (A02(jSONArray.get(i2), obj2)) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw AnonymousClass002.A0G("Expected value is not an array");
    }

    public static final boolean A04(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray.length() == jSONArray2.length()) {
            int length = jSONArray.length();
            int i = 0;
            while (i < length) {
                if (A02(jSONArray.get(i), jSONArray2.get(i))) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }
}
