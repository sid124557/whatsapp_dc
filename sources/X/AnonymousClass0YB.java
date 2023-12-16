package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.ArrayMap;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0YB  reason: invalid class name */
public final class AnonymousClass0YB {
    public static final Map A00;
    public static final Map A01;

    public static Bundle A01(C10500i2 r7, Collection collection) {
        Bundle bundle = new Bundle(2);
        ArrayList A0s = AnonymousClass001.A0s();
        int i = 0;
        for (Object next : collection) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("<item ");
            A0o.append(i);
            A0s.add(A00(r7, next, AnonymousClass000.A0X(">", A0o)));
            i++;
        }
        bundle.putParcelableArrayList("tag_value", A0s);
        return bundle;
    }

    static {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(Boolean.class, "bool");
        arrayMap.put(Byte.class, "byte");
        arrayMap.put(Short.class, "short");
        arrayMap.put(Integer.class, "int");
        arrayMap.put(Long.class, "long");
        arrayMap.put(Double.class, "double");
        arrayMap.put(Float.class, "float");
        arrayMap.put(String.class, "string");
        arrayMap.put(Parcelable.class, "parcelable");
        arrayMap.put(Map.class, "map");
        arrayMap.put(List.class, "list");
        arrayMap.put(IconCompat.class, "image");
        A01 = arrayMap;
        ArrayMap arrayMap2 = new ArrayMap();
        arrayMap2.put(0, "primitive");
        arrayMap2.put(AnonymousClass001.A0f(), "iInterface");
        arrayMap2.put(9, "iBinder");
        arrayMap2.put(2, "map");
        arrayMap2.put(3, "set");
        arrayMap2.put(4, "list");
        arrayMap2.put(5, "object");
        arrayMap2.put(6, "image");
        A00 = arrayMap2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007c, code lost:
        if ((r10 instanceof java.lang.String) != false) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle A00(X.C10500i2 r9, java.lang.Object r10, java.lang.String r11) {
        /*
            if (r10 == 0) goto L_0x0033
            java.util.ArrayDeque r0 = r9.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x0008:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0031
            java.lang.Object r0 = r1.next()
            X.0OI r0 = (X.AnonymousClass0OI) r0
            java.lang.Object r0 = r0.A00
            if (r0 != r10) goto L_0x0008
            r0 = 1
        L_0x0019:
            if (r0 == 0) goto L_0x0033
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Found cycle while bundling type "
            r1.append(r0)
            X.AnonymousClass000.A1A(r10, r1)
            java.lang.String r1 = r1.toString()
            X.059 r0 = new X.059
            r0.<init>(r9, r1)
            throw r0
        L_0x0031:
            r0 = 0
            goto L_0x0019
        L_0x0033:
            java.util.ArrayDeque r0 = r9.A01
            X.0i2 r3 = new X.0i2
            r3.<init>(r10, r11, r0)
            if (r10 == 0) goto L_0x02dd
            boolean r0 = r10 instanceof androidx.core.graphics.drawable.IconCompat     // Catch:{ all -> 0x02f6 }
            if (r0 == 0) goto L_0x0059
            androidx.core.graphics.drawable.IconCompat r10 = (androidx.core.graphics.drawable.IconCompat) r10     // Catch:{ all -> 0x02f6 }
            r0 = 2
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x02f6 }
            r6.<init>(r0)     // Catch:{ all -> 0x02f6 }
            java.lang.String r1 = "tag_class_type"
            r0 = 6
            r6.putInt(r1, r0)     // Catch:{ all -> 0x02f6 }
            java.lang.String r1 = "tag_value"
            android.os.Bundle r0 = r10.A0B()     // Catch:{ all -> 0x02f6 }
            r6.putBundle(r1, r0)     // Catch:{ all -> 0x02f6 }
            goto L_0x02c2
        L_0x0059:
            boolean r4 = r10 instanceof java.lang.Boolean     // Catch:{ all -> 0x02f6 }
            if (r4 != 0) goto L_0x007e
            boolean r0 = r10 instanceof java.lang.Byte     // Catch:{ all -> 0x02f6 }
            if (r0 != 0) goto L_0x007e
            boolean r0 = r10 instanceof java.lang.Character     // Catch:{ all -> 0x02f6 }
            if (r0 != 0) goto L_0x007e
            boolean r0 = r10 instanceof java.lang.Short     // Catch:{ all -> 0x02f6 }
            if (r0 != 0) goto L_0x007e
            boolean r0 = r10 instanceof java.lang.Integer     // Catch:{ all -> 0x02f6 }
            if (r0 != 0) goto L_0x007e
            boolean r0 = r10 instanceof java.lang.Long     // Catch:{ all -> 0x02f6 }
            if (r0 != 0) goto L_0x007e
            boolean r0 = r10 instanceof java.lang.Double     // Catch:{ all -> 0x02f6 }
            if (r0 != 0) goto L_0x007e
            boolean r0 = r10 instanceof java.lang.Float     // Catch:{ all -> 0x02f6 }
            if (r0 != 0) goto L_0x007e
            boolean r1 = r10 instanceof java.lang.String     // Catch:{ all -> 0x02f6 }
            r0 = 0
            if (r1 == 0) goto L_0x007f
        L_0x007e:
            r0 = 1
        L_0x007f:
            if (r0 != 0) goto L_0x0235
            boolean r0 = r10 instanceof android.os.Parcelable     // Catch:{ all -> 0x02f6 }
            if (r0 != 0) goto L_0x0235
            boolean r0 = r10 instanceof android.os.IInterface     // Catch:{ all -> 0x02f6 }
            if (r0 == 0) goto L_0x00ab
            android.os.IInterface r10 = (android.os.IInterface) r10     // Catch:{ all -> 0x02f6 }
            r0 = 3
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x02f6 }
            r6.<init>(r0)     // Catch:{ all -> 0x02f6 }
            java.lang.String r2 = X.AnonymousClass000.A0O(r10)     // Catch:{ all -> 0x02f6 }
            java.lang.String r1 = "tag_class_type"
            r0 = 1
            r6.putInt(r1, r0)     // Catch:{ all -> 0x02f6 }
            java.lang.String r1 = "tag_value"
            android.os.IBinder r0 = r10.asBinder()     // Catch:{ all -> 0x02f6 }
            r6.putBinder(r1, r0)     // Catch:{ all -> 0x02f6 }
            java.lang.String r0 = "tag_class_name"
            r6.putString(r0, r2)     // Catch:{ all -> 0x02f6 }
            goto L_0x02c2
        L_0x00ab:
            boolean r0 = r10 instanceof android.os.IBinder     // Catch:{ all -> 0x02f6 }
            if (r0 == 0) goto L_0x00c5
            android.os.IBinder r10 = (android.os.IBinder) r10     // Catch:{ all -> 0x02f6 }
            r0 = 2
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x02f6 }
            r6.<init>(r0)     // Catch:{ all -> 0x02f6 }
            java.lang.String r1 = "tag_class_type"
            r0 = 9
            r6.putInt(r1, r0)     // Catch:{ all -> 0x02f6 }
            java.lang.String r0 = "tag_value"
            r6.putBinder(r0, r10)     // Catch:{ all -> 0x02f6 }
            goto L_0x02c2
        L_0x00c5:
            boolean r0 = r10 instanceof java.util.Map     // Catch:{ all -> 0x02f6 }
            if (r0 == 0) goto L_0x013d
            java.util.Map r10 = (java.util.Map) r10     // Catch:{ all -> 0x02f6 }
            r5 = 2
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x02f6 }
            r6.<init>(r5)     // Catch:{ all -> 0x02f6 }
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x02f6 }
            java.util.Iterator r11 = X.AnonymousClass000.A0q(r10)     // Catch:{ all -> 0x02f6 }
            r8 = 0
        L_0x00da:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x02f6 }
            if (r0 == 0) goto L_0x0131
            java.util.Map$Entry r10 = X.AnonymousClass001.A0w(r11)     // Catch:{ all -> 0x02f6 }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x02f6 }
            r7.<init>(r5)     // Catch:{ all -> 0x02f6 }
            java.lang.Object r2 = r10.getKey()     // Catch:{ all -> 0x02f6 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02f6 }
            java.lang.String r0 = "<key "
            r1.append(r0)     // Catch:{ all -> 0x02f6 }
            r1.append(r8)     // Catch:{ all -> 0x02f6 }
            java.lang.String r9 = ">"
            java.lang.String r0 = X.AnonymousClass000.A0X(r9, r1)     // Catch:{ all -> 0x02f6 }
            android.os.Bundle r1 = A00(r3, r2, r0)     // Catch:{ all -> 0x02f6 }
            java.lang.String r0 = "tag_1"
            r7.putBundle(r0, r1)     // Catch:{ all -> 0x02f6 }
            java.lang.Object r0 = r10.getValue()     // Catch:{ all -> 0x02f6 }
            if (r0 == 0) goto L_0x012b
            java.lang.Object r2 = r10.getValue()     // Catch:{ all -> 0x02f6 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02f6 }
            java.lang.String r0 = "<value "
            r1.append(r0)     // Catch:{ all -> 0x02f6 }
            r1.append(r8)     // Catch:{ all -> 0x02f6 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r9, r1)     // Catch:{ all -> 0x02f6 }
            android.os.Bundle r1 = A00(r3, r2, r0)     // Catch:{ all -> 0x02f6 }
            java.lang.String r0 = "tag_2"
            r7.putBundle(r0, r1)     // Catch:{ all -> 0x02f6 }
        L_0x012b:
            int r8 = r8 + 1
            r4.add(r7)     // Catch:{ all -> 0x02f6 }
            goto L_0x00da
        L_0x0131:
            java.lang.String r0 = "tag_class_type"
            r6.putInt(r0, r5)     // Catch:{ all -> 0x02f6 }
            java.lang.String r0 = "tag_value"
            r6.putParcelableArrayList(r0, r4)     // Catch:{ all -> 0x02f6 }
            goto L_0x02c2
        L_0x013d:
            boolean r0 = r10 instanceof java.util.List     // Catch:{ all -> 0x02f6 }
            if (r0 == 0) goto L_0x014f
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x02f6 }
            android.os.Bundle r6 = A01(r3, r10)     // Catch:{ all -> 0x02f6 }
            java.lang.String r1 = "tag_class_type"
            r0 = 4
        L_0x014a:
            r6.putInt(r1, r0)     // Catch:{ all -> 0x02f6 }
            goto L_0x02c2
        L_0x014f:
            boolean r0 = r10 instanceof java.util.Set     // Catch:{ all -> 0x02f6 }
            if (r0 == 0) goto L_0x015d
            java.util.Set r10 = (java.util.Set) r10     // Catch:{ all -> 0x02f6 }
            android.os.Bundle r6 = A01(r3, r10)     // Catch:{ all -> 0x02f6 }
            java.lang.String r1 = "tag_class_type"
            r0 = 3
            goto L_0x014a
        L_0x015d:
            java.lang.Class r2 = r10.getClass()     // Catch:{ all -> 0x02f6 }
            boolean r0 = r2.isEnum()     // Catch:{ all -> 0x02f6 }
            if (r0 == 0) goto L_0x019c
            r0 = 3
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x02f6 }
            r6.<init>(r0)     // Catch:{ all -> 0x02f6 }
            java.lang.String r1 = "tag_class_type"
            r0 = 7
            r6.putInt(r1, r0)     // Catch:{ all -> 0x02f6 }
            java.lang.String r0 = "name"
            java.lang.reflect.Method r1 = A04(r3, r2, r0)     // Catch:{ all -> 0x02f6 }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ ReflectiveOperationException -> 0x0192 }
            java.lang.Object r1 = r1.invoke(r10, r0)     // Catch:{ ReflectiveOperationException -> 0x0192 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ ReflectiveOperationException -> 0x0192 }
            java.lang.String r0 = "tag_value"
            r6.putString(r0, r1)     // Catch:{ all -> 0x02f6 }
            java.lang.String r1 = r2.getName()     // Catch:{ all -> 0x02f6 }
            java.lang.String r0 = "tag_class_name"
            r6.putString(r0, r1)     // Catch:{ all -> 0x02f6 }
            goto L_0x02c2
        L_0x0192:
            r1 = move-exception
            java.lang.String r0 = "Enum missing name method"
            X.05A r4 = new X.05A     // Catch:{ all -> 0x02f6 }
            r4.<init>(r3, r0, r1)     // Catch:{ all -> 0x02f6 }
            goto L_0x02f5
        L_0x019c:
            boolean r0 = r10 instanceof java.lang.Class     // Catch:{ all -> 0x02f6 }
            if (r0 == 0) goto L_0x01ba
            java.lang.Class r10 = (java.lang.Class) r10     // Catch:{ all -> 0x02f6 }
            r0 = 2
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x02f6 }
            r6.<init>(r0)     // Catch:{ all -> 0x02f6 }
            java.lang.String r1 = "tag_class_type"
            r0 = 8
            r6.putInt(r1, r0)     // Catch:{ all -> 0x02f6 }
            java.lang.String r1 = r10.getName()     // Catch:{ all -> 0x02f6 }
            java.lang.String r0 = "tag_value"
            r6.putString(r0, r1)     // Catch:{ all -> 0x02f6 }
            goto L_0x02c2
        L_0x01ba:
            boolean r0 = r2.isArray()     // Catch:{ all -> 0x02f6 }
            if (r0 != 0) goto L_0x022c
            java.lang.String r4 = r2.getName()     // Catch:{ all -> 0x02f6 }
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x021a }
            r2.getDeclaredConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x021a }
            java.util.List r2 = A05(r2)     // Catch:{ all -> 0x02f6 }
            int r0 = r2.size()     // Catch:{ all -> 0x02f6 }
            int r0 = r0 + 2
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x02f6 }
            r6.<init>(r0)     // Catch:{ all -> 0x02f6 }
            java.lang.String r1 = "tag_class_type"
            r0 = 5
            r6.putInt(r1, r0)     // Catch:{ all -> 0x02f6 }
            java.lang.String r0 = "tag_class_name"
            r6.putString(r0, r4)     // Catch:{ all -> 0x02f6 }
            java.util.Iterator r5 = r2.iterator()     // Catch:{ all -> 0x02f6 }
        L_0x01e8:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x02f6 }
            if (r0 == 0) goto L_0x02c2
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x02f6 }
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch:{ all -> 0x02f6 }
            r0 = 1
            r2.setAccessible(r0)     // Catch:{ all -> 0x02f6 }
            java.lang.Class r0 = r2.getDeclaringClass()     // Catch:{ all -> 0x02f6 }
            java.lang.String r1 = r0.getName()     // Catch:{ all -> 0x02f6 }
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x02f6 }
            java.lang.String r4 = X.AnonymousClass000.A0T(r1, r0)     // Catch:{ all -> 0x02f6 }
            java.lang.Object r1 = r2.get(r10)     // Catch:{ IllegalAccessException -> 0x02e5 }
            if (r1 == 0) goto L_0x01e8
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x02f6 }
            android.os.Bundle r0 = A00(r3, r1, r0)     // Catch:{ all -> 0x02f6 }
            r6.putParcelable(r4, r0)     // Catch:{ all -> 0x02f6 }
            goto L_0x01e8
        L_0x021a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02f6 }
            java.lang.String r0 = "Class to deserialize is missing a no args constructor: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r4, r1)     // Catch:{ all -> 0x02f6 }
            X.05A r4 = new X.05A     // Catch:{ all -> 0x02f6 }
            r4.<init>(r3, r0, r2)     // Catch:{ all -> 0x02f6 }
            goto L_0x02f5
        L_0x022c:
            java.lang.String r0 = "Object serializing contains an array, use a list or a set instead"
            X.05A r4 = new X.05A     // Catch:{ all -> 0x02f6 }
            r4.<init>(r3, r0)     // Catch:{ all -> 0x02f6 }
            goto L_0x02f5
        L_0x0235:
            r0 = 2
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x02f6 }
            r6.<init>(r0)     // Catch:{ all -> 0x02f6 }
            java.lang.String r1 = "tag_class_type"
            r0 = 0
            r6.putInt(r1, r0)     // Catch:{ all -> 0x02f6 }
            java.lang.String r2 = "tag_value"
            if (r4 == 0) goto L_0x024d
            boolean r0 = X.AnonymousClass001.A1Z(r10)     // Catch:{ all -> 0x02f6 }
            r6.putBoolean(r2, r0)     // Catch:{ all -> 0x02f6 }
            goto L_0x02c2
        L_0x024d:
            boolean r0 = r10 instanceof java.lang.Byte     // Catch:{ all -> 0x02f6 }
            if (r0 == 0) goto L_0x025b
            java.lang.Byte r10 = (java.lang.Byte) r10     // Catch:{ all -> 0x02f6 }
            byte r0 = r10.byteValue()     // Catch:{ all -> 0x02f6 }
            r6.putByte(r2, r0)     // Catch:{ all -> 0x02f6 }
            goto L_0x02c2
        L_0x025b:
            boolean r0 = r10 instanceof java.lang.Character     // Catch:{ all -> 0x02f6 }
            if (r0 == 0) goto L_0x0269
            java.lang.Character r10 = (java.lang.Character) r10     // Catch:{ all -> 0x02f6 }
            char r0 = r10.charValue()     // Catch:{ all -> 0x02f6 }
            r6.putChar(r2, r0)     // Catch:{ all -> 0x02f6 }
            goto L_0x02c2
        L_0x0269:
            boolean r0 = r10 instanceof java.lang.Short     // Catch:{ all -> 0x02f6 }
            if (r0 == 0) goto L_0x0277
            java.lang.Short r10 = (java.lang.Short) r10     // Catch:{ all -> 0x02f6 }
            short r0 = r10.shortValue()     // Catch:{ all -> 0x02f6 }
            r6.putShort(r2, r0)     // Catch:{ all -> 0x02f6 }
            goto L_0x02c2
        L_0x0277:
            boolean r0 = r10 instanceof java.lang.Integer     // Catch:{ all -> 0x02f6 }
            if (r0 == 0) goto L_0x0285
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x02f6 }
            int r0 = r10.intValue()     // Catch:{ all -> 0x02f6 }
            r6.putInt(r2, r0)     // Catch:{ all -> 0x02f6 }
            goto L_0x02c2
        L_0x0285:
            boolean r0 = r10 instanceof java.lang.Long     // Catch:{ all -> 0x02f6 }
            if (r0 == 0) goto L_0x0293
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x02f6 }
            long r0 = r10.longValue()     // Catch:{ all -> 0x02f6 }
            r6.putLong(r2, r0)     // Catch:{ all -> 0x02f6 }
            goto L_0x02c2
        L_0x0293:
            boolean r0 = r10 instanceof java.lang.Double     // Catch:{ all -> 0x02f6 }
            if (r0 == 0) goto L_0x02a1
            java.lang.Double r10 = (java.lang.Double) r10     // Catch:{ all -> 0x02f6 }
            double r0 = r10.doubleValue()     // Catch:{ all -> 0x02f6 }
            r6.putDouble(r2, r0)     // Catch:{ all -> 0x02f6 }
            goto L_0x02c2
        L_0x02a1:
            boolean r0 = r10 instanceof java.lang.Float     // Catch:{ all -> 0x02f6 }
            if (r0 == 0) goto L_0x02af
            java.lang.Float r10 = (java.lang.Float) r10     // Catch:{ all -> 0x02f6 }
            float r0 = r10.floatValue()     // Catch:{ all -> 0x02f6 }
            r6.putFloat(r2, r0)     // Catch:{ all -> 0x02f6 }
            goto L_0x02c2
        L_0x02af:
            boolean r0 = r10 instanceof java.lang.String     // Catch:{ all -> 0x02f6 }
            if (r0 == 0) goto L_0x02b9
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x02f6 }
            r6.putString(r2, r10)     // Catch:{ all -> 0x02f6 }
            goto L_0x02c2
        L_0x02b9:
            boolean r0 = r10 instanceof android.os.Parcelable     // Catch:{ all -> 0x02f6 }
            if (r0 == 0) goto L_0x02c6
            android.os.Parcelable r10 = (android.os.Parcelable) r10     // Catch:{ all -> 0x02f6 }
            r6.putParcelable(r2, r10)     // Catch:{ all -> 0x02f6 }
        L_0x02c2:
            r3.close()
            return r6
        L_0x02c6:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02f6 }
            java.lang.String r0 = "Unsupported primitive type: "
            r1.append(r0)     // Catch:{ all -> 0x02f6 }
            java.lang.String r0 = X.AnonymousClass000.A0O(r10)     // Catch:{ all -> 0x02f6 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x02f6 }
            X.05A r4 = new X.05A     // Catch:{ all -> 0x02f6 }
            r4.<init>(r3, r0)     // Catch:{ all -> 0x02f6 }
            goto L_0x02f5
        L_0x02dd:
            java.lang.String r0 = "Bundling of null object is not supported"
            X.05A r4 = new X.05A     // Catch:{ all -> 0x02f6 }
            r4.<init>(r3, r0)     // Catch:{ all -> 0x02f6 }
            goto L_0x02f5
        L_0x02e5:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02f6 }
            java.lang.String r0 = "Field is not accessible: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r4, r1)     // Catch:{ all -> 0x02f6 }
            X.05A r4 = new X.05A     // Catch:{ all -> 0x02f6 }
            r4.<init>(r3, r0, r2)     // Catch:{ all -> 0x02f6 }
        L_0x02f5:
            throw r4     // Catch:{ all -> 0x02f6 }
        L_0x02f6:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x02fb }
            throw r1
        L_0x02fb:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YB.A00(X.0i2, java.lang.Object, java.lang.String):android.os.Bundle");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.Class<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: java.util.HashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: ?} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: androidx.core.graphics.drawable.IconCompat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: java.lang.Class<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v37, resolved type: android.os.IBinder} */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0352, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0356, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0357, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0358, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x035b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1 = new X.AnonymousClass05A(r4, X.AnonymousClass000.A0V("Class name is unknown: ", r3, X.AnonymousClass001.A0o()), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0177, code lost:
        r3.A06 = r0;
        r3 = r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:6:0x0030, B:12:0x0047] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A02(android.os.Bundle r10, X.C10500i2 r11) {
        /*
            java.lang.Class<X.0YB> r0 = X.AnonymousClass0YB.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.util.Objects.requireNonNull(r0)
            r10.setClassLoader(r0)
            java.lang.String r0 = "tag_class_type"
            int r2 = r10.getInt(r0)
            int r1 = r10.getInt(r0)
            java.util.Map r0 = A00
            java.lang.Object r1 = X.AnonymousClass001.A0i(r0, r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = "unknown"
        L_0x0022:
            java.util.ArrayDeque r0 = r11.A01
            X.0i2 r4 = new X.0i2
            r4.<init>(r10, r1, r0)
            switch(r2) {
                case 0: goto L_0x02fb;
                case 1: goto L_0x029c;
                case 2: goto L_0x024e;
                case 3: goto L_0x0310;
                case 4: goto L_0x030b;
                case 5: goto L_0x0184;
                case 6: goto L_0x00ff;
                case 7: goto L_0x0068;
                case 8: goto L_0x003f;
                case 9: goto L_0x002e;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x0342
        L_0x002e:
            java.lang.String r0 = "tag_value"
            android.os.IBinder r3 = r10.getBinder(r0)     // Catch:{ all -> 0x0352 }
            if (r3 != 0) goto L_0x0336
            java.lang.String r0 = "Bundle is missing the binder"
            X.05A r1 = new X.05A     // Catch:{ all -> 0x0352 }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x0352 }
            goto L_0x0351
        L_0x003f:
            java.lang.String r0 = "tag_value"
            java.lang.String r3 = r10.getString(r0)     // Catch:{ all -> 0x0352 }
            if (r3 == 0) goto L_0x005f
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x004d }
            goto L_0x0336
        L_0x004d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "Class name is unknown: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r3, r1)     // Catch:{ all -> 0x0352 }
            X.05A r1 = new X.05A     // Catch:{ all -> 0x0352 }
            r1.<init>(r4, r0, r2)     // Catch:{ all -> 0x0352 }
            goto L_0x0351
        L_0x005f:
            java.lang.String r0 = "Class is missing the class name"
            X.05A r1 = new X.05A     // Catch:{ all -> 0x0352 }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x0352 }
            goto L_0x0351
        L_0x0068:
            java.lang.String r0 = "tag_value"
            java.lang.String r6 = r10.getString(r0)     // Catch:{ all -> 0x0352 }
            java.lang.String r5 = "]"
            if (r6 == 0) goto L_0x00ee
            java.lang.String r0 = "tag_class_name"
            java.lang.String r3 = r10.getString(r0)     // Catch:{ all -> 0x0352 }
            if (r3 == 0) goto L_0x00dd
            java.lang.Class r1 = java.lang.Class.forName(r3)     // Catch:{ IllegalArgumentException -> 0x00c3, ClassNotFoundException -> 0x00a9, ReflectiveOperationException -> 0x008f }
            java.lang.String r0 = "valueOf"
            java.lang.reflect.Method r2 = A04(r4, r1, r0)     // Catch:{ IllegalArgumentException -> 0x00c3, ClassNotFoundException -> 0x00a9, ReflectiveOperationException -> 0x008f }
            java.lang.Object[] r1 = X.AnonymousClass000.A1b(r6)     // Catch:{ IllegalArgumentException -> 0x00c3, ClassNotFoundException -> 0x00a9, ReflectiveOperationException -> 0x008f }
            r0 = 0
            java.lang.Object r3 = r2.invoke(r0, r1)     // Catch:{ IllegalArgumentException -> 0x00c3, ClassNotFoundException -> 0x00a9, ReflectiveOperationException -> 0x008f }
            goto L_0x0336
        L_0x008f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "Enum of class ["
            r1.append(r0)     // Catch:{ all -> 0x0352 }
            r1.append(r3)     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "] missing valueOf method"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0352 }
            X.05A r1 = new X.05A     // Catch:{ all -> 0x0352 }
            r1.<init>(r4, r0, r2)     // Catch:{ all -> 0x0352 }
            goto L_0x0351
        L_0x00a9:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "Enum class ["
            r1.append(r0)     // Catch:{ all -> 0x0352 }
            r1.append(r3)     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "] not found"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0352 }
            X.05A r1 = new X.05A     // Catch:{ all -> 0x0352 }
            r1.<init>(r4, r0, r2)     // Catch:{ all -> 0x0352 }
            goto L_0x0351
        L_0x00c3:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "Enum value ["
            r1.append(r0)     // Catch:{ all -> 0x0352 }
            r1.append(r6)     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "] does not exist in enum class ["
            java.lang.String r0 = X.AnonymousClass000.A0U(r0, r3, r5, r1)     // Catch:{ all -> 0x0352 }
            X.05A r1 = new X.05A     // Catch:{ all -> 0x0352 }
            r1.<init>(r4, r0, r2)     // Catch:{ all -> 0x0352 }
            goto L_0x0351
        L_0x00dd:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "Missing enum className ["
            java.lang.String r0 = X.AnonymousClass000.A0U(r0, r3, r5, r1)     // Catch:{ all -> 0x0352 }
            X.05A r1 = new X.05A     // Catch:{ all -> 0x0352 }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x0352 }
            goto L_0x0351
        L_0x00ee:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "Missing enum name ["
            java.lang.String r0 = X.AnonymousClass000.A0U(r0, r6, r5, r1)     // Catch:{ all -> 0x0352 }
            X.05A r1 = new X.05A     // Catch:{ all -> 0x0352 }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x0352 }
            goto L_0x0351
        L_0x00ff:
            java.lang.String r0 = "tag_value"
            android.os.Bundle r5 = r10.getBundle(r0)     // Catch:{ all -> 0x0352 }
            if (r5 == 0) goto L_0x017b
            java.lang.String r0 = "type"
            int r2 = r5.getInt(r0)     // Catch:{ all -> 0x0352 }
            androidx.core.graphics.drawable.IconCompat r3 = new androidx.core.graphics.drawable.IconCompat     // Catch:{ all -> 0x0352 }
            r3.<init>(r2)     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "int1"
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x0352 }
            r3.A00 = r0     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "int2"
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x0352 }
            r3.A01 = r0     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "string1"
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0352 }
            r3.A07 = r0     // Catch:{ all -> 0x0352 }
            java.lang.String r1 = "tint_list"
            boolean r0 = r5.containsKey(r1)     // Catch:{ all -> 0x0352 }
            if (r0 == 0) goto L_0x013a
            android.os.Parcelable r0 = r5.getParcelable(r1)     // Catch:{ all -> 0x0352 }
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch:{ all -> 0x0352 }
            r3.A03 = r0     // Catch:{ all -> 0x0352 }
        L_0x013a:
            java.lang.String r1 = "tint_mode"
            boolean r0 = r5.containsKey(r1)     // Catch:{ all -> 0x0352 }
            if (r0 == 0) goto L_0x014c
            java.lang.String r0 = r5.getString(r1)     // Catch:{ all -> 0x0352 }
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.valueOf(r0)     // Catch:{ all -> 0x0352 }
            r3.A04 = r0     // Catch:{ all -> 0x0352 }
        L_0x014c:
            java.lang.String r0 = "obj"
            switch(r2) {
                case -1: goto L_0x016e;
                case 0: goto L_0x0151;
                case 1: goto L_0x016e;
                case 2: goto L_0x0173;
                case 3: goto L_0x0169;
                case 4: goto L_0x0173;
                case 5: goto L_0x016e;
                case 6: goto L_0x0173;
                default: goto L_0x0151;
            }     // Catch:{ all -> 0x0352 }
        L_0x0151:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "Unknown type "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r2)     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "IconCompat"
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "Failed to create IconCompat from bundle"
            X.05A r1 = new X.05A     // Catch:{ all -> 0x0352 }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x0352 }
            goto L_0x0351
        L_0x0169:
            byte[] r0 = r5.getByteArray(r0)     // Catch:{ all -> 0x0352 }
            goto L_0x0177
        L_0x016e:
            android.os.Parcelable r0 = r5.getParcelable(r0)     // Catch:{ all -> 0x0352 }
            goto L_0x0177
        L_0x0173:
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0352 }
        L_0x0177:
            r3.A06 = r0     // Catch:{ all -> 0x0352 }
            goto L_0x0336
        L_0x017b:
            java.lang.String r0 = "IconCompat bundle is null"
            X.05A r1 = new X.05A     // Catch:{ all -> 0x0352 }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x0352 }
            goto L_0x0351
        L_0x0184:
            java.lang.String r7 = "CarApp.Bun"
            java.lang.String r0 = "tag_class_name"
            java.lang.String r5 = r10.getString(r0)     // Catch:{ all -> 0x0352 }
            if (r5 == 0) goto L_0x0245
            java.lang.Class r8 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
            r2 = 0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
            java.lang.reflect.Constructor r1 = r8.getDeclaredConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
            r6 = 1
            r1.setAccessible(r6)     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
            java.lang.Object r3 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
            java.util.List r0 = A05(r8)     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
        L_0x01ab:
            boolean r0 = r9.hasNext()     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
            if (r0 == 0) goto L_0x0336
            java.lang.Object r2 = r9.next()     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
            r2.setAccessible(r6)     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
            java.lang.Class r0 = r2.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
            java.lang.String r1 = r0.getName()     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
            java.lang.String r0 = r2.getName()     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
            java.lang.String r8 = X.AnonymousClass000.A0T(r1, r0)     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
            java.lang.Object r1 = r10.get(r8)     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
            if (r1 != 0) goto L_0x01dc
            java.lang.String r1 = "androidx.core.graphics.drawable.IconCompat"
            java.lang.String r0 = "android.support.v4.graphics.drawable.IconCompat"
            java.lang.String r0 = r8.replaceAll(r1, r0)     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
            java.lang.Object r1 = r10.get(r0)     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
        L_0x01dc:
            boolean r0 = r1 instanceof android.os.Bundle     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
            if (r0 == 0) goto L_0x01ea
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
            java.lang.Object r0 = A02(r1, r4)     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
            r2.set(r3, r0)     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
            goto L_0x01ab
        L_0x01ea:
            if (r1 != 0) goto L_0x01ab
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r7, r0)     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
            if (r0 == 0) goto L_0x01ab
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
            java.lang.String r0 = "Value is null for field: "
            X.AnonymousClass000.A19(r2, r0, r7, r1)     // Catch:{ ClassNotFoundException -> 0x0233, NoSuchMethodException -> 0x0221, ReflectiveOperationException -> 0x020f, IllegalArgumentException -> 0x01fd }
            goto L_0x01ab
        L_0x01fd:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "Failed to deserialize class: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r5, r1)     // Catch:{ all -> 0x0352 }
            X.05A r1 = new X.05A     // Catch:{ all -> 0x0352 }
            r1.<init>(r4, r0, r2)     // Catch:{ all -> 0x0352 }
            goto L_0x0351
        L_0x020f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "Constructor or field is not accessible: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r5, r1)     // Catch:{ all -> 0x0352 }
            X.05A r1 = new X.05A     // Catch:{ all -> 0x0352 }
            r1.<init>(r4, r0, r2)     // Catch:{ all -> 0x0352 }
            goto L_0x0351
        L_0x0221:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "Object missing no args constructor: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r5, r1)     // Catch:{ all -> 0x0352 }
            X.05A r1 = new X.05A     // Catch:{ all -> 0x0352 }
            r1.<init>(r4, r0, r2)     // Catch:{ all -> 0x0352 }
            goto L_0x0351
        L_0x0233:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "Object for unknown class: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r5, r1)     // Catch:{ all -> 0x0352 }
            X.05A r1 = new X.05A     // Catch:{ all -> 0x0352 }
            r1.<init>(r4, r0, r2)     // Catch:{ all -> 0x0352 }
            goto L_0x0351
        L_0x0245:
            java.lang.String r0 = "Bundle is missing the class name"
            X.05A r1 = new X.05A     // Catch:{ all -> 0x0352 }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x0352 }
            goto L_0x0351
        L_0x024e:
            java.lang.String r0 = "tag_value"
            java.util.ArrayList r0 = r10.getParcelableArrayList(r0)     // Catch:{ all -> 0x0352 }
            if (r0 == 0) goto L_0x0293
            java.util.HashMap r3 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x0352 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0352 }
        L_0x025e:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0352 }
            if (r0 == 0) goto L_0x0336
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x0352 }
            android.os.Parcelable r2 = (android.os.Parcelable) r2     // Catch:{ all -> 0x0352 }
            android.os.Bundle r2 = (android.os.Bundle) r2     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "tag_1"
            android.os.Bundle r1 = r2.getBundle(r0)     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "tag_2"
            android.os.Bundle r0 = r2.getBundle(r0)     // Catch:{ all -> 0x0352 }
            if (r1 == 0) goto L_0x028a
            java.lang.Object r1 = A02(r1, r4)     // Catch:{ all -> 0x0352 }
            if (r0 != 0) goto L_0x0282
            r0 = 0
            goto L_0x0286
        L_0x0282:
            java.lang.Object r0 = A02(r0, r4)     // Catch:{ all -> 0x0352 }
        L_0x0286:
            r3.put(r1, r0)     // Catch:{ all -> 0x0352 }
            goto L_0x025e
        L_0x028a:
            java.lang.String r0 = "Bundle is missing key"
            X.05A r1 = new X.05A     // Catch:{ all -> 0x0352 }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x0352 }
            goto L_0x0351
        L_0x0293:
            java.lang.String r0 = "Bundle is missing the map"
            X.05A r1 = new X.05A     // Catch:{ all -> 0x0352 }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x0352 }
            goto L_0x0351
        L_0x029c:
            java.lang.String r0 = "tag_value"
            android.os.IBinder r3 = r10.getBinder(r0)     // Catch:{ all -> 0x0352 }
            if (r3 == 0) goto L_0x02f3
            java.lang.String r0 = "tag_class_name"
            java.lang.String r5 = r10.getString(r0)     // Catch:{ all -> 0x0352 }
            if (r5 == 0) goto L_0x02eb
            java.lang.Class r1 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x02da, ReflectiveOperationException -> 0x02c9 }
            java.lang.String r0 = "asInterface"
            java.lang.reflect.Method r2 = A04(r4, r1, r0)     // Catch:{ ClassNotFoundException -> 0x02da, ReflectiveOperationException -> 0x02c9 }
            java.lang.Object[] r1 = X.AnonymousClass000.A1b(r3)     // Catch:{ ClassNotFoundException -> 0x02da, ReflectiveOperationException -> 0x02c9 }
            r0 = 0
            java.lang.Object r3 = r2.invoke(r0, r1)     // Catch:{ ClassNotFoundException -> 0x02da, ReflectiveOperationException -> 0x02c9 }
            if (r3 != 0) goto L_0x0336
            java.lang.String r1 = "Failed to get interface from binder"
            X.05A r0 = new X.05A     // Catch:{ ClassNotFoundException -> 0x02da, ReflectiveOperationException -> 0x02c9 }
            r0.<init>(r4, r1)     // Catch:{ ClassNotFoundException -> 0x02da, ReflectiveOperationException -> 0x02c9 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x02da, ReflectiveOperationException -> 0x02c9 }
        L_0x02c9:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "Method to create IInterface from a Binder is not accessible for interface: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r5, r1)     // Catch:{ all -> 0x0352 }
            X.05A r1 = new X.05A     // Catch:{ all -> 0x0352 }
            r1.<init>(r4, r0, r2)     // Catch:{ all -> 0x0352 }
            goto L_0x0351
        L_0x02da:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "Binder for unknown IInterface: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r5, r1)     // Catch:{ all -> 0x0352 }
            X.05A r1 = new X.05A     // Catch:{ all -> 0x0352 }
            r1.<init>(r4, r0, r2)     // Catch:{ all -> 0x0352 }
            goto L_0x0351
        L_0x02eb:
            java.lang.String r0 = "Bundle is missing IInterface class name"
            X.05A r1 = new X.05A     // Catch:{ all -> 0x0352 }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x0352 }
            goto L_0x0351
        L_0x02f3:
            java.lang.String r0 = "Bundle is missing the binder"
            X.05A r1 = new X.05A     // Catch:{ all -> 0x0352 }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x0352 }
            goto L_0x0351
        L_0x02fb:
            java.lang.String r0 = "tag_value"
            java.lang.Object r3 = r10.get(r0)     // Catch:{ all -> 0x0352 }
            if (r3 != 0) goto L_0x0336
            java.lang.String r0 = "Bundle is missing the primitive value"
            X.05A r1 = new X.05A     // Catch:{ all -> 0x0352 }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x0352 }
            goto L_0x0351
        L_0x030b:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0352 }
            goto L_0x0314
        L_0x0310:
            java.util.HashSet r3 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x0352 }
        L_0x0314:
            java.lang.String r0 = "tag_value"
            java.util.ArrayList r0 = r10.getParcelableArrayList(r0)     // Catch:{ all -> 0x0352 }
            if (r0 == 0) goto L_0x033a
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0352 }
        L_0x0320:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0352 }
            if (r0 == 0) goto L_0x0336
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0352 }
            android.os.Parcelable r0 = (android.os.Parcelable) r0     // Catch:{ all -> 0x0352 }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ all -> 0x0352 }
            java.lang.Object r0 = A02(r0, r4)     // Catch:{ all -> 0x0352 }
            r3.add(r0)     // Catch:{ all -> 0x0352 }
            goto L_0x0320
        L_0x0336:
            r4.close()
            return r3
        L_0x033a:
            java.lang.String r0 = "Bundle is missing the collection"
            X.05A r1 = new X.05A     // Catch:{ all -> 0x0352 }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x0352 }
            goto L_0x0351
        L_0x0342:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "Unsupported class type in bundle: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r2)     // Catch:{ all -> 0x0352 }
            X.05A r1 = new X.05A     // Catch:{ all -> 0x0352 }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x0352 }
        L_0x0351:
            throw r1     // Catch:{ all -> 0x0352 }
        L_0x0352:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0357 }
            throw r1
        L_0x0357:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YB.A02(android.os.Bundle, X.0i2):java.lang.Object");
    }

    public static String A03(Class cls) {
        String str = (String) A01.get(cls);
        if (str != null) {
            return str;
        }
        if (List.class.isAssignableFrom(cls)) {
            return "<List>";
        }
        if (Map.class.isAssignableFrom(cls)) {
            return "<Map>";
        }
        if (Set.class.isAssignableFrom(cls)) {
            return "<Set>";
        }
        return cls.getSimpleName();
    }

    public static Method A04(C10500i2 r5, Class cls, String str) {
        if (cls == null || cls == Object.class) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("No method ");
            A0o.append(str);
            throw new AnonymousClass05A(r5, AnonymousClass000.A0P(cls, " in class ", A0o));
        }
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return A04(r5, cls.getSuperclass(), str);
    }

    public static List A05(Class cls) {
        ArrayList A0s = AnonymousClass001.A0s();
        if (!(cls == null || cls == Object.class)) {
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    A0s.add(field);
                }
            }
            A0s.addAll(A05(cls.getSuperclass()));
        }
        return A0s;
    }
}
