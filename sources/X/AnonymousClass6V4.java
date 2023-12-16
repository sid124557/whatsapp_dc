package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6V4  reason: invalid class name */
public abstract class AnonymousClass6V4 extends AnonymousClass8AG {
    public static final Map zzb = AnonymousClass0x9.A1D();
    public C160547nq zzc = C160547nq.A04;

    public static final void A03(Object obj, String str, StringBuilder sb, int i) {
        String A00;
        if (obj instanceof List) {
            Iterator A0q = C18320x8.A0q(obj);
            while (A0q.hasNext()) {
                A03(A0q.next(), str, sb, i);
            }
        } else if (obj instanceof Map) {
            Iterator A0q2 = AnonymousClass000.A0q((Map) obj);
            while (A0q2.hasNext()) {
                A03(A0q2.next(), str, sb, i);
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
                A00 = AnonymousClass72S.A00(new AnonymousClass6VD(((String) obj).getBytes(C155637fE.A03)));
            } else if (obj instanceof AnonymousClass8Ln) {
                sb.append(": \"");
                A00 = AnonymousClass72S.A00((AnonymousClass8Ln) obj);
            } else {
                if (obj instanceof AnonymousClass6V4) {
                    sb.append(" {");
                    A02((AnonymousClass8AG) obj, sb, i + 2);
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i4 = i + 2;
                    A03(entry.getKey(), "key", sb, i4);
                    A03(entry.getValue(), "value", sb, i4);
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else {
                    sb.append(": ");
                    sb.append(obj);
                    return;
                }
                sb.append("}");
                return;
            }
            sb.append(A00);
            sb.append('\"');
        }
    }

    public final /* synthetic */ C187798xp Bu9() {
        return AnonymousClass6VG.zzb;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null || (cls = getClass()) != obj.getClass()) {
            return false;
        }
        return C157357iA.A02.A00(cls).BuB(this, obj);
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int BtE = C157357iA.A02.A00(getClass()).BtE(this);
        this.zza = BtE;
        return BtE;
    }

    public static Object A00(Object obj, Method method, Object... objArr) {
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

    public static final String A01(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        for (int i = 0; i < str.length(); i++) {
            A0o.append(Character.toLowerCase(AnonymousClass6C9.A01(str, A0o, i)));
        }
        return A0o.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:90:0x0028 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C187798xp r12, java.lang.StringBuilder r13, int r14) {
        /*
            java.util.HashMap r5 = X.AnonymousClass001.A0t()
            java.util.HashMap r4 = X.AnonymousClass001.A0t()
            java.util.TreeSet r8 = new java.util.TreeSet
            r8.<init>()
            java.lang.Class r0 = r12.getClass()
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
            java.util.Iterator r11 = r8.iterator()
        L_0x0028:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01b0
            java.lang.String r8 = X.AnonymousClass001.A0m(r11)
            boolean r0 = r8.startsWith(r2)
            if (r0 == 0) goto L_0x01ad
            r0 = 3
            java.lang.String r6 = r8.substring(r0)
        L_0x003d:
            java.lang.String r1 = "List"
            boolean r0 = r6.endsWith(r1)
            r7 = 1
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = "OrBuilderList"
            boolean r0 = r6.endsWith(r0)
            if (r0 != 0) goto L_0x008c
            boolean r0 = r6.equals(r1)
            if (r0 != 0) goto L_0x008c
            java.lang.String r1 = X.AnonymousClass6C7.A0i(r6)
            int r0 = r6.length()
            int r0 = r0 + -4
            java.lang.String r0 = r6.substring(r7, r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r10 = r1.concat(r0)
            java.lang.Object r9 = r5.get(r8)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 == 0) goto L_0x008c
            java.lang.Class r1 = r9.getReturnType()
            java.lang.Class<java.util.List> r0 = java.util.List.class
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x008c
            java.lang.String r6 = A01(r10)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Object r0 = A00(r12, r9, r0)
        L_0x0088:
            A03(r0, r6, r13, r14)
            goto L_0x0028
        L_0x008c:
            java.lang.String r1 = "Map"
            boolean r0 = r6.endsWith(r1)
            if (r0 == 0) goto L_0x00e1
            boolean r0 = r6.equals(r1)
            if (r0 != 0) goto L_0x00e1
            java.lang.String r1 = X.AnonymousClass6C7.A0i(r6)
            int r0 = r6.length()
            int r0 = r0 + -3
            java.lang.String r0 = r6.substring(r7, r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r9 = r1.concat(r0)
            java.lang.Object r1 = r5.get(r8)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 == 0) goto L_0x00e1
            java.lang.Class r8 = r1.getReturnType()
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00e1
            java.lang.Class<java.lang.Deprecated> r0 = java.lang.Deprecated.class
            boolean r0 = r1.isAnnotationPresent(r0)
            if (r0 != 0) goto L_0x00e1
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L_0x00e1
            java.lang.String r6 = A01(r9)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Object r0 = A00(r12, r1, r0)
            goto L_0x0088
        L_0x00e1:
            java.lang.String r0 = "set"
            java.lang.String r0 = r0.concat(r6)
            java.lang.Object r0 = r4.get(r0)
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "Bytes"
            boolean r0 = r6.endsWith(r0)
            if (r0 == 0) goto L_0x010d
            int r0 = r6.length()
            int r0 = r0 + -5
            java.lang.String r0 = r6.substring(r3, r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r2.concat(r0)
            boolean r0 = r5.containsKey(r0)
            if (r0 != 0) goto L_0x0028
        L_0x010d:
            java.lang.String r1 = X.AnonymousClass6C7.A0i(r6)
            java.lang.String r0 = r6.substring(r7)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r10 = r1.concat(r0)
            java.lang.String r0 = r2.concat(r6)
            java.lang.Object r1 = r5.get(r0)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r0 = "has"
            java.lang.String r0 = r0.concat(r6)
            java.lang.Object r6 = r5.get(r0)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Object r1 = A00(r12, r1, r0)
            if (r6 != 0) goto L_0x01a6
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0151
            r0 = r1
        L_0x0142:
            boolean r0 = X.AnonymousClass001.A1Z(r0)
        L_0x0146:
            if (r0 == 0) goto L_0x0028
        L_0x0148:
            java.lang.String r0 = A01(r10)
            A03(r1, r0, r13, r14)
            goto L_0x0028
        L_0x0151:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x015a
            int r0 = X.AnonymousClass001.A0K(r1)
            goto L_0x0146
        L_0x015a:
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L_0x0167
            float r0 = X.AnonymousClass001.A05(r1)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            goto L_0x0146
        L_0x0167:
            boolean r0 = r1 instanceof java.lang.Double
            if (r0 == 0) goto L_0x0178
            double r6 = X.AnonymousClass6C9.A02(r1)
            long r8 = java.lang.Double.doubleToRawLongBits(r6)
            r6 = 0
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            goto L_0x0146
        L_0x0178:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0185
            java.lang.String r0 = ""
        L_0x017e:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0028
            goto L_0x0148
        L_0x0185:
            boolean r0 = r1 instanceof X.AnonymousClass8Ln
            if (r0 == 0) goto L_0x018c
            X.8Ln r0 = X.AnonymousClass8Ln.A00
            goto L_0x017e
        L_0x018c:
            boolean r0 = r1 instanceof X.C187798xp
            if (r0 == 0) goto L_0x019a
            r0 = r1
            X.8lu r0 = (X.C180958lu) r0
            X.8xp r0 = r0.Bu9()
            if (r1 == r0) goto L_0x0028
            goto L_0x0148
        L_0x019a:
            boolean r0 = r1 instanceof java.lang.Enum
            if (r0 == 0) goto L_0x0148
            r0 = r1
            java.lang.Enum r0 = (java.lang.Enum) r0
            int r0 = r0.ordinal()
            goto L_0x0146
        L_0x01a6:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Object r0 = A00(r12, r6, r0)
            goto L_0x0142
        L_0x01ad:
            r6 = r8
            goto L_0x003d
        L_0x01b0:
            X.6V4 r12 = (X.AnonymousClass6V4) r12
            X.7nq r3 = r12.zzc
            if (r3 == 0) goto L_0x01cf
            r2 = 0
        L_0x01b7:
            int r0 = r3.A00
            if (r2 >= r0) goto L_0x01cf
            int[] r0 = r3.A02
            r0 = r0[r2]
            int r0 = r0 >>> 3
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.Object[] r0 = r3.A03
            r0 = r0[r2]
            A03(r0, r1, r13, r14)
            int r2 = r2 + 1
            goto L_0x01b7
        L_0x01cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6V4.A02(X.8xp, java.lang.StringBuilder, int):void");
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("# ");
        A0o.append(obj);
        A02(this, A0o, 0);
        return A0o.toString();
    }
}
