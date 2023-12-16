package X;

/* renamed from: X.7dL  reason: invalid class name and case insensitive filesystem */
public final class C154547dL {
    public static final Class A01(C85424Ge r2) {
        C162457s7.A0J(r2, 0);
        Class B8n = ((C188528z2) r2).B8n();
        if (B8n.isPrimitive()) {
            String name = B8n.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return B8n;
    }

    public static final Class A00(C85424Ge r1) {
        Class B8n = ((C188528z2) r1).B8n();
        C162457s7.A0K(B8n, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return B8n;
    }
}
