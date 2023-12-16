package X;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.7nx  reason: invalid class name and case insensitive filesystem */
public abstract class C160607nx {
    public volatile int A00 = -1;

    public abstract int A02();

    public abstract void A04(C161777qQ r1);

    public static void A01(Object obj, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        String str2;
        if (obj != null) {
            if (obj instanceof C160607nx) {
                int length = stringBuffer.length();
                if (str != null) {
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(A00(str));
                    stringBuffer2.append(" <\n");
                    stringBuffer.append("  ");
                }
                Class<?> cls = obj.getClass();
                for (Field field : cls.getFields()) {
                    int modifiers = field.getModifiers();
                    String name = field.getName();
                    if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                        Class<?> type = field.getType();
                        Object obj2 = field.get(obj);
                        if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                            A01(obj2, name, stringBuffer, stringBuffer2);
                        } else if (obj2 != null) {
                            int length2 = Array.getLength(obj2);
                            for (int i = 0; i < length2; i++) {
                                A01(Array.get(obj2, i), name, stringBuffer, stringBuffer2);
                            }
                        }
                    }
                }
                for (Method name2 : cls.getMethods()) {
                    String name3 = name2.getName();
                    if (name3.startsWith("set")) {
                        String substring = name3.substring(3);
                        try {
                            if (AnonymousClass001.A1Z(AnonymousClass000.A0K(cls, obj, AnonymousClass6C7.A0j("has", substring)))) {
                                A01(AnonymousClass000.A0K(cls, obj, AnonymousClass6C7.A0j("get", substring)), substring, stringBuffer, stringBuffer2);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                }
                if (str != null) {
                    stringBuffer.setLength(length);
                    stringBuffer2.append(stringBuffer);
                    str2 = ">\n";
                } else {
                    return;
                }
            } else {
                String A002 = A00(str);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(A002);
                stringBuffer2.append(": ");
                if (obj instanceof String) {
                    String str3 = (String) obj;
                    if (!str3.startsWith("http") && str3.length() > 200) {
                        str3 = String.valueOf(str3.substring(0, 200)).concat("[...]");
                    }
                    int length3 = str3.length();
                    StringBuilder A0Y = AnonymousClass6CA.A0Y(length3);
                    for (int i2 = 0; i2 < length3; i2++) {
                        char charAt = str3.charAt(i2);
                        if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                            Object[] objArr = new Object[1];
                            AnonymousClass000.A1P(objArr, charAt, 0);
                            A0Y.append(String.format("\\u%04x", objArr));
                        } else {
                            A0Y.append(charAt);
                        }
                    }
                    String obj3 = A0Y.toString();
                    stringBuffer2.append("\"");
                    stringBuffer2.append(obj3);
                    stringBuffer2.append("\"");
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    stringBuffer2.append('\"');
                    for (byte b : bArr) {
                        byte b2 = b & 255;
                        if (b2 == 92 || b2 == 34) {
                            stringBuffer2.append('\\');
                        } else if (b2 < 32 || b2 >= Byte.MAX_VALUE) {
                            Object[] objArr2 = new Object[1];
                            AnonymousClass000.A1P(objArr2, b2, 0);
                            stringBuffer2.append(String.format("\\%03o", objArr2));
                        }
                        stringBuffer2.append((char) b2);
                    }
                    stringBuffer2.append('\"');
                } else {
                    stringBuffer2.append(obj);
                }
                str2 = "\n";
            }
            stringBuffer2.append(str2);
        }
    }

    public /* synthetic */ Object clone() {
        throw null;
    }

    public String toString() {
        StringBuffer A0X = AnonymousClass6CA.A0X();
        try {
            A01(this, (String) null, AnonymousClass6CA.A0X(), A0X);
            return A0X.toString();
        } catch (IllegalAccessException | InvocationTargetException e) {
            return AnonymousClass6C7.A0j("Error printing proto: ", e.getMessage());
        }
    }

    public static String A00(String str) {
        StringBuffer A0X = AnonymousClass6CA.A0X();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i != 0) {
                if (Character.isUpperCase(charAt)) {
                    A0X.append('_');
                } else {
                    A0X.append(charAt);
                }
            }
            charAt = Character.toLowerCase(charAt);
            A0X.append(charAt);
        }
        return A0X.toString();
    }

    public C160607nx A03() {
        return (C160607nx) super.clone();
    }
}
