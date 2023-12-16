package X;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;

/* renamed from: X.75o  reason: invalid class name and case insensitive filesystem */
public class C1454075o {
    public static void A00(Object obj, StringBuilder sb) {
        String valueOf;
        if (obj == null) {
            valueOf = "null";
        } else {
            Class<?> cls = obj.getClass();
            int i = 0;
            if (cls.isArray()) {
                sb.append("[");
                while (i < Array.getLength(obj)) {
                    A00(Array.get(obj, i), sb);
                    sb.append(",");
                    i++;
                }
                sb.replace(sb.length() - 1, sb.length(), "]");
                return;
            } else if (cls.equals(String.class)) {
                sb.append("\"");
                sb.append(obj);
                sb.append("\"");
                return;
            } else if (cls.isPrimitive() || cls.equals(Integer.class) || cls.equals(Long.class) || cls.equals(Short.class) || cls.equals(Double.class) || cls.equals(Float.class) || cls.equals(BigDecimal.class)) {
                valueOf = String.valueOf(obj);
            } else {
                try {
                    sb.append("{");
                    Field[] declaredFields = cls.getDeclaredFields();
                    int length = declaredFields.length;
                    while (i < length) {
                        Field field = declaredFields[i];
                        if (!Modifier.isStatic(field.getModifiers())) {
                            field.setAccessible(true);
                            sb.append("\"");
                            sb.append(field.getName());
                            C18290x4.A1R(sb, "\"");
                            A00(field.get(obj), sb);
                            sb.append(",");
                        }
                        i++;
                    }
                    sb.replace(sb.length() - 1, sb.length(), "}");
                    return;
                } catch (Exception e) {
                    e.getLocalizedMessage();
                    return;
                }
            }
        }
        sb.append(valueOf);
    }
}
