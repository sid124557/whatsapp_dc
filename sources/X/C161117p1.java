package X;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.7p1  reason: invalid class name and case insensitive filesystem */
public final class C161117p1 {
    public static final char[] A00;

    static {
        char[] cArr = new char[80];
        A00 = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void A00(C187928y2 r17, StringBuilder sb, int i) {
        int i2;
        StringBuilder sb2;
        int i3;
        int ordinal;
        Object obj;
        boolean equals;
        Method method;
        String substring;
        C187928y2 r12 = r17;
        HashSet A0K = AnonymousClass002.A0K();
        HashMap A0t = AnonymousClass001.A0t();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = r12.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method2 = declaredMethods[i4];
            if (!Modifier.isStatic(method2.getModifiers()) && method2.getName().length() >= 3) {
                if (method2.getName().startsWith("set")) {
                    A0K.add(method2.getName());
                } else if (Modifier.isPublic(method2.getModifiers()) && method2.getParameterTypes().length == 0) {
                    boolean startsWith = method2.getName().startsWith("has");
                    String name = method2.getName();
                    if (startsWith) {
                        A0t.put(name, method2);
                    } else if (name.startsWith("get")) {
                        treeMap.put(method2.getName(), method2);
                    }
                }
            }
            i4++;
        }
        Iterator A0u = AnonymousClass001.A0u(treeMap);
        while (true) {
            sb2 = sb;
            i3 = i;
            if (!A0u.hasNext()) {
                break;
            }
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            String substring2 = C18310x6.A0q(A0w).substring(i2);
            if (substring2.endsWith("List") && !substring2.endsWith("OrBuilderList") && !substring2.equals("List") && (method = (Method) A0w.getValue()) != null && method.getReturnType().equals(List.class)) {
                substring = substring2.substring(0, substring2.length() - 4);
            } else if (!substring2.endsWith("Map") || substring2.equals("Map") || (method = (Method) A0w.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                if (A0K.contains(AnonymousClass000.A0T("set", substring2))) {
                    if (substring2.endsWith("Bytes")) {
                        if (treeMap.containsKey(AnonymousClass000.A0X(substring2.substring(0, substring2.length() - 5), AnonymousClass000.A0l("get")))) {
                        }
                    }
                    Method method3 = (Method) A0w.getValue();
                    Method method4 = (Method) A0t.get(AnonymousClass000.A0T("has", substring2));
                    if (method3 != null) {
                        Object A09 = C130786cX.A09(r12, method3, new Object[0]);
                        if (method4 == null) {
                            if (A09 instanceof Boolean) {
                                equals = !AnonymousClass001.A1Z(A09);
                            } else {
                                if (A09 instanceof Integer) {
                                    ordinal = AnonymousClass001.A0K(A09);
                                } else if (A09 instanceof Float) {
                                    ordinal = Float.floatToRawIntBits(AnonymousClass001.A05(A09));
                                } else if (A09 instanceof Double) {
                                    ordinal = (Double.doubleToRawLongBits(AnonymousClass6C9.A02(A09)) > 0 ? 1 : (Double.doubleToRawLongBits(AnonymousClass6C9.A02(A09)) == 0 ? 0 : -1));
                                } else {
                                    if (A09 instanceof String) {
                                        obj = "";
                                    } else if (A09 instanceof C172548Lq) {
                                        obj = C172548Lq.A01;
                                    } else if (A09 instanceof C187928y2) {
                                        if (A09 == ((C181378mf) A09).B6s()) {
                                        }
                                    } else if (A09 instanceof Enum) {
                                        ordinal = ((Enum) A09).ordinal();
                                    }
                                    equals = A09.equals(obj);
                                }
                                if (ordinal == 0) {
                                }
                            }
                            if (equals) {
                            }
                        } else if (!AnonymousClass001.A1Z(C130786cX.A09(r12, method4, new Object[0]))) {
                        }
                        A01(A09, substring2, sb2, i3);
                    }
                }
                i2 = 3;
            } else {
                substring = substring2.substring(0, substring2.length() - 3);
            }
            A01(C130786cX.A09(r12, method, new Object[0]), substring, sb2, i3);
            i2 = 3;
        }
        C160677o7 r3 = ((C130786cX) r12).unknownFields;
        if (r3 != null) {
            for (int i5 = 0; i5 < r3.count; i5++) {
                A01(r3.A03[i5], String.valueOf(r3.A02[i5] >>> 3), sb2, i3);
            }
        }
    }

    public static void A01(Object obj, String str, StringBuilder sb, int i) {
        String A002;
        if (obj instanceof List) {
            Iterator A0q = C18320x8.A0q(obj);
            while (A0q.hasNext()) {
                A01(A0q.next(), str, sb, i);
            }
        } else if (obj instanceof Map) {
            Iterator A0q2 = AnonymousClass000.A0q((Map) obj);
            while (A0q2.hasNext()) {
                A01(A0q2.next(), str, sb, i);
            }
        } else {
            sb.append(10);
            int i2 = i;
            while (i2 > 0) {
                char[] cArr = A00;
                int length = cArr.length;
                if (i2 <= length) {
                    length = i2;
                }
                sb.append(cArr, 0, length);
                i2 -= length;
            }
            if (!str.isEmpty()) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(Character.toLowerCase(AnonymousClass6C9.A00(str)));
                for (int i3 = 1; i3 < str.length(); i3++) {
                    A0o.append(Character.toLowerCase(AnonymousClass6C9.A01(str, A0o, i3)));
                }
                str = A0o.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                A002 = AnonymousClass734.A00(new C130256bf(((String) obj).getBytes(C155647fF.A04)));
            } else if (obj instanceof C172548Lq) {
                sb.append(": \"");
                A002 = AnonymousClass734.A00((C172548Lq) obj);
            } else {
                if (obj instanceof C130786cX) {
                    sb.append(" {");
                    A00((C170198Cg) obj, sb, i + 2);
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i4 = i + 2;
                    A01(entry.getKey(), "key", sb, i4);
                    A01(entry.getValue(), "value", sb, i4);
                } else {
                    sb.append(": ");
                    sb.append(obj);
                    return;
                }
                sb.append("\n");
                while (i > 0) {
                    char[] cArr2 = A00;
                    int length2 = cArr2.length;
                    if (i <= length2) {
                        length2 = i;
                    }
                    sb.append(cArr2, 0, length2);
                    i -= length2;
                }
                sb.append("}");
                return;
            }
            sb.append(A002);
            sb.append('\"');
        }
    }
}
