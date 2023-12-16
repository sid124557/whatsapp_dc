package X;

/* renamed from: X.2u5  reason: invalid class name and case insensitive filesystem */
public class C57712u5 {
    public static String A00(AnonymousClass4GV r1) {
        String obj = r1.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }
}
