package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Va  reason: invalid class name and case insensitive filesystem */
public abstract class C128166Va extends AnonymousClass8AX {
    public static Map zzjr = AnonymousClass0x9.A1D();
    public C160647o3 zzjp = C160647o3.A05;
    public int zzjq = -1;

    public final /* synthetic */ C187818xr Btj() {
        return (AnonymousClass8AX) A06(6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!A06(6).getClass().isInstance(obj)) {
            return false;
        }
        return AnonymousClass6C8.A0Y(this).B2c(this, obj);
    }

    public static int A00(C186258v0 r3, Object obj) {
        AnonymousClass8AX r4 = (AnonymousClass8AX) obj;
        C128166Va r2 = (C128166Va) r4;
        int i = r2.zzjq;
        if (i != -1) {
            return i;
        }
        int BuG = r3.BuG(r4);
        r2.zzjq = BuG;
        return BuG;
    }

    public static C160647o3 A01(Object obj) {
        C128166Va r2 = (C128166Va) obj;
        C160647o3 r1 = r2.zzjp;
        if (r1 != C160647o3.A05) {
            return r1;
        }
        C160647o3 r0 = new C160647o3();
        r2.zzjp = r0;
        return r0;
    }

    public static final void A05(Object obj, String str, StringBuilder sb, int i) {
        String A03;
        if (obj instanceof List) {
            Iterator A0q = C18320x8.A0q(obj);
            while (A0q.hasNext()) {
                A05(A0q.next(), str, sb, i);
            }
        } else if (obj instanceof Map) {
            Iterator A0q2 = AnonymousClass000.A0q((Map) obj);
            while (A0q2.hasNext()) {
                A05(A0q2.next(), str, sb, i);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                A03 = A03(new C128286Vm(((String) obj).getBytes(C155587f9.A03)));
            } else if (obj instanceof C172528Lo) {
                sb.append(": \"");
                A03 = A03((C172528Lo) obj);
            } else {
                if (obj instanceof C128166Va) {
                    sb.append(" {");
                    A04((AnonymousClass8AX) obj, sb, i + 2);
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i4 = i + 2;
                    A05(entry.getKey(), "key", sb, i4);
                    A05(entry.getValue(), "value", sb, i4);
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else {
                    C18270x1.A1H(sb, ": ", obj);
                    return;
                }
                sb.append("}");
                return;
            }
            sb.append(A03);
            sb.append('\"');
        }
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [X.6Vc, X.8hk, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v12, types: [X.6Vc, X.8hk, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v19, types: [X.6Vc, X.8hk, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v26, types: [X.6Vc, X.8hk, java.lang.Object] */
    public Object A06(int i) {
        ? r3;
        ? r32;
        ? r33;
        ? r34;
        if (this instanceof C128396Vx) {
            switch (C1456776v.A00[i - 1]) {
                case 1:
                    return new C128396Vx();
                case 2:
                    return new C128376Vv();
                case 3:
                    Object[] A0M = AnonymousClass002.A0M();
                    A0M[0] = "zzbiq";
                    A0M[1] = AnonymousClass6W0.class;
                    return new AnonymousClass8AT(C128396Vx.zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", A0M);
                case 4:
                    return C128396Vx.zzbir;
                case 5:
                    synchronized (C128396Vx.class) {
                        r34 = new C128186Vc(C128396Vx.zzbir);
                        C128396Vx.zzbg = r34;
                    }
                    return r34;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof AnonymousClass6W0) {
            switch (C1456776v.A00[i - 1]) {
                case 1:
                    return new AnonymousClass6W0();
                case 2:
                    return new C128386Vw();
                case 3:
                    return new AnonymousClass8AT(AnonymousClass6W0.zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
                case 4:
                    return AnonymousClass6W0.zzbiv;
                case 5:
                    synchronized (AnonymousClass6W0.class) {
                        r33 = new C128186Vc(AnonymousClass6W0.zzbiv);
                        AnonymousClass6W0.zzbg = r33;
                    }
                    return r33;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C18320x8.A0m();
            }
        } else {
            boolean z = this instanceof C128406Vy;
            int i2 = C1456676u.A00[i - 1];
            if (z) {
                switch (i2) {
                    case 1:
                        return new C128406Vy();
                    case 2:
                        return new C128366Vu();
                    case 3:
                        return new AnonymousClass8AT(C128406Vy.zzbfc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{"zzbb", "zzbfa", C143036yE.A00, "zzbfb", AnonymousClass22P.A00});
                    case 4:
                        return C128406Vy.zzbfc;
                    case 5:
                        synchronized (C128406Vy.class) {
                            r32 = new C128186Vc(C128406Vy.zzbfc);
                            C128406Vy.zzbg = r32;
                        }
                        return r32;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw C18320x8.A0m();
                }
            } else {
                switch (i2) {
                    case 1:
                        return new C128416Vz();
                    case 2:
                        return new C128356Vt();
                    case 3:
                        return new AnonymousClass8AT(C128416Vz.zztx, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\b\u0002", new Object[]{"zzbb", "zztu", "zztv", "zztw"});
                    case 4:
                        return C128416Vz.zztx;
                    case 5:
                        synchronized (C128416Vz.class) {
                            r3 = new C128186Vc(C128416Vz.zztx);
                            C128416Vz.zzbg = r3;
                        }
                        return r3;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw C18320x8.A0m();
                }
            }
        }
    }

    public final int BtV() {
        int i = this.zzjq;
        if (i != -1) {
            return i;
        }
        int BuG = AnonymousClass6C8.A0Y(this).BuG(this);
        this.zzjq = BuG;
        return BuG;
    }

    public int hashCode() {
        int i = this.zzex;
        if (i != 0) {
            return i;
        }
        int BFY = AnonymousClass6C8.A0Y(this).BFY(this);
        this.zzex = BFY;
        return BFY;
    }

    public static Object A02(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw AnonymousClass6CA.A0Q("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw AnonymousClass6CA.A0Q("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static String A03(C172528Lo r4) {
        String str;
        StringBuilder A0Y = AnonymousClass6CA.A0Y(r4.A02());
        for (int i = 0; i < r4.A02(); i++) {
            int A01 = r4.A01(i);
            if (A01 != 34) {
                if (A01 == 39) {
                    str = "\\'";
                } else if (A01 != 92) {
                    switch (A01) {
                        case 7:
                            str = "\\a";
                            break;
                        case 8:
                            str = "\\b";
                            break;
                        case 9:
                            str = "\\t";
                            break;
                        case 10:
                            str = "\\n";
                            break;
                        case 11:
                            str = "\\v";
                            break;
                        case 12:
                            str = "\\f";
                            break;
                        case 13:
                            str = "\\r";
                            break;
                        default:
                            if (A01 < 32 || A01 > 126) {
                                A01 = AnonymousClass6C7.A07(A0Y, A01);
                            }
                            A0Y.append((char) A01);
                            continue;
                    }
                } else {
                    str = "\\\\";
                }
                A0Y.append(str);
            } else {
                str = "\\\"";
                A0Y.append(str);
            }
        }
        return A0Y.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0073, code lost:
        if (r1.getReturnType().equals(java.util.List.class) != false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0075, code lost:
        r7 = X.AnonymousClass001.A0o();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007e, code lost:
        if (r6 >= r8.length()) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0080, code lost:
        r7.append(java.lang.Character.toLowerCase(X.AnonymousClass6C9.A01(r8, r7, r6)));
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008e, code lost:
        A05(A02(r13, r1, new java.lang.Object[0]), r7.toString(), r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e0, code lost:
        if (java.lang.reflect.Modifier.isPublic(r1.getModifiers()) != false) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.C187818xr r13, java.lang.StringBuilder r14, int r15) {
        /*
            java.util.HashMap r5 = X.AnonymousClass001.A0t()
            java.util.HashMap r4 = X.AnonymousClass001.A0t()
            java.util.TreeSet r8 = new java.util.TreeSet
            r8.<init>()
            java.lang.Class r0 = r13.getClass()
            java.lang.reflect.Method[] r7 = r0.getDeclaredMethods()
            int r6 = r7.length
            r3 = 0
            r1 = 0
        L_0x0018:
            java.lang.String r2 = "get"
            if (r1 >= r6) goto L_0x0024
            r0 = r7[r1]
            X.AnonymousClass6C7.A1P(r0, r8, r4, r5)
            int r1 = r1 + 1
            goto L_0x0018
        L_0x0024:
            java.util.Iterator r12 = r8.iterator()
        L_0x0028:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01bf
            java.lang.String r10 = X.AnonymousClass001.A0m(r12)
            java.lang.String r7 = ""
            java.lang.String r9 = r10.replaceFirst(r2, r7)
            java.lang.String r1 = "List"
            boolean r0 = r9.endsWith(r1)
            r6 = 1
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = "OrBuilderList"
            boolean r0 = r9.endsWith(r0)
            if (r0 != 0) goto L_0x009c
            boolean r0 = r9.equals(r1)
            if (r0 != 0) goto L_0x009c
            java.lang.String r1 = X.AnonymousClass6C7.A0i(r9)
            int r0 = r9.length()
            int r0 = r0 + -4
            java.lang.String r0 = r9.substring(r6, r0)
            java.lang.String r8 = X.AnonymousClass6C7.A0j(r1, r0)
            java.lang.Object r1 = r5.get(r10)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 == 0) goto L_0x009c
            java.lang.Class r11 = r1.getReturnType()
            java.lang.Class<java.util.List> r0 = java.util.List.class
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x009c
        L_0x0075:
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            r6 = 0
        L_0x007a:
            int r0 = r8.length()
            if (r6 >= r0) goto L_0x008e
            char r0 = X.AnonymousClass6C9.A01(r8, r7, r6)
            char r0 = java.lang.Character.toLowerCase(r0)
            r7.append(r0)
            int r6 = r6 + 1
            goto L_0x007a
        L_0x008e:
            java.lang.String r6 = r7.toString()
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Object r0 = A02(r13, r1, r0)
            A05(r0, r6, r14, r15)
            goto L_0x0028
        L_0x009c:
            java.lang.String r1 = "Map"
            boolean r0 = r9.endsWith(r1)
            if (r0 == 0) goto L_0x00e3
            boolean r0 = r9.equals(r1)
            if (r0 != 0) goto L_0x00e3
            java.lang.String r1 = X.AnonymousClass6C7.A0i(r9)
            int r0 = r9.length()
            int r0 = r0 + -3
            java.lang.String r0 = r9.substring(r6, r0)
            java.lang.String r8 = X.AnonymousClass6C7.A0j(r1, r0)
            java.lang.Object r1 = r5.get(r10)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 == 0) goto L_0x00e3
            java.lang.Class r10 = r1.getReturnType()
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00e3
            java.lang.Class<java.lang.Deprecated> r0 = java.lang.Deprecated.class
            boolean r0 = r1.isAnnotationPresent(r0)
            if (r0 != 0) goto L_0x00e3
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L_0x00e3
            goto L_0x0075
        L_0x00e3:
            int r8 = r9.length()
            java.lang.String r0 = "set"
            java.lang.String r0 = X.AnonymousClass6C7.A0k(r0, r9, r8)
            java.lang.Object r0 = r4.get(r0)
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "Bytes"
            boolean r0 = r9.endsWith(r0)
            if (r0 == 0) goto L_0x010b
            int r0 = r8 + -5
            java.lang.String r0 = r9.substring(r3, r0)
            java.lang.String r0 = X.AnonymousClass6C7.A0j(r2, r0)
            boolean r0 = r5.containsKey(r0)
            if (r0 != 0) goto L_0x0028
        L_0x010b:
            java.lang.String r1 = X.AnonymousClass6C7.A0i(r9)
            java.lang.String r0 = r9.substring(r6)
            java.lang.String r6 = X.AnonymousClass6C7.A0j(r1, r0)
            java.lang.String r0 = X.AnonymousClass6C7.A0k(r2, r9, r8)
            java.lang.Object r1 = r5.get(r0)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r0 = "has"
            java.lang.String r0 = X.AnonymousClass6C7.A0k(r0, r9, r8)
            java.lang.Object r8 = r5.get(r0)
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Object r1 = A02(r13, r1, r0)
            if (r8 != 0) goto L_0x0191
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0143
            boolean r0 = X.AnonymousClass001.A1Z(r1)
        L_0x013f:
            if (r0 != 0) goto L_0x019d
            goto L_0x0028
        L_0x0143:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x014c
            int r0 = X.AnonymousClass001.A0K(r1)
            goto L_0x013f
        L_0x014c:
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L_0x0158
            float r7 = X.AnonymousClass001.A05(r1)
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            goto L_0x013f
        L_0x0158:
            boolean r0 = r1 instanceof java.lang.Double
            if (r0 == 0) goto L_0x0165
            double r9 = X.AnonymousClass6C9.A02(r1)
            r7 = 0
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            goto L_0x013f
        L_0x0165:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 != 0) goto L_0x016f
            boolean r0 = r1 instanceof X.C172528Lo
            if (r0 == 0) goto L_0x0176
            X.8Lo r7 = X.C172528Lo.A00
        L_0x016f:
            boolean r0 = r1.equals(r7)
            if (r0 != 0) goto L_0x0028
            goto L_0x019d
        L_0x0176:
            boolean r0 = r1 instanceof X.C187818xr
            if (r0 == 0) goto L_0x0185
            r0 = r1
            X.8lz r0 = (X.C181008lz) r0
            X.8xr r0 = r0.Btj()
            if (r1 != r0) goto L_0x019d
            goto L_0x0028
        L_0x0185:
            boolean r0 = r1 instanceof java.lang.Enum
            if (r0 == 0) goto L_0x019d
            r0 = r1
            java.lang.Enum r0 = (java.lang.Enum) r0
            int r0 = r0.ordinal()
            goto L_0x013f
        L_0x0191:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Object r0 = A02(r13, r8, r0)
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r0 == 0) goto L_0x0028
        L_0x019d:
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            r7 = 0
        L_0x01a2:
            int r0 = r6.length()
            if (r7 >= r0) goto L_0x01b6
            char r0 = X.AnonymousClass6C9.A01(r6, r8, r7)
            char r0 = java.lang.Character.toLowerCase(r0)
            r8.append(r0)
            int r7 = r7 + 1
            goto L_0x01a2
        L_0x01b6:
            java.lang.String r0 = r8.toString()
            A05(r1, r0, r14, r15)
            goto L_0x0028
        L_0x01bf:
            X.6Va r13 = (X.C128166Va) r13
            X.7o3 r3 = r13.zzjp
            if (r3 == 0) goto L_0x01de
            r2 = 0
        L_0x01c6:
            int r0 = r3.A00
            if (r2 >= r0) goto L_0x01de
            int[] r0 = r3.A03
            r0 = r0[r2]
            int r0 = r0 >>> 3
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.Object[] r0 = r3.A04
            r0 = r0[r2]
            A05(r0, r1, r14, r15)
            int r2 = r2 + 1
            goto L_0x01c6
        L_0x01de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128166Va.A04(X.8xr, java.lang.StringBuilder, int):void");
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("# ");
        A0o.append(obj);
        A04(this, A0o, 0);
        return A0o.toString();
    }
}
