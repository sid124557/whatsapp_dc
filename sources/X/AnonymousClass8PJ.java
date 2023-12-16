package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.8PJ  reason: invalid class name */
public final class AnonymousClass8PJ implements C85424Ge, C188528z2 {
    public static final HashMap A01;
    public static final HashMap A02;
    public static final HashMap A03;
    public static final Map A04;
    public static final Map A05;
    public final Class A00;

    public AnonymousClass8PJ(Class cls) {
        C162457s7.A0J(cls, 1);
        this.A00 = cls;
    }

    static {
        int i = 0;
        List A0o = AnonymousClass8UF.A0o(AnonymousClass4GP.class, AnonymousClass4GQ.class, AnonymousClass4GR.class, AnonymousClass4GS.class, AnonymousClass4GT.class, AnonymousClass4GU.class, C76733sG.class, C188408yq.class, C188418yr.class, C188428ys.class, C188278yd.class, C188288ye.class, C188298yf.class, C188308yg.class, C188318yh.class, C188328yi.class, C188338yj.class, C188348yk.class, C188358yl.class, C188368ym.class, C188378yn.class, C188388yo.class, C188398yp.class);
        ArrayList A0I = AnonymousClass002.A0I(C73783g4.A0b(A0o, 10));
        for (Object next : A0o) {
            int i2 = i + 1;
            if (i < 0) {
                throw C18280x3.A0X();
            }
            A0I.add(AnonymousClass3Z6.A01(next, i));
            i = i2;
        }
        A04 = C73813g7.A0B(A0I);
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("boolean", "kotlin.Boolean");
        A0t.put("char", "kotlin.Char");
        A0t.put("byte", "kotlin.Byte");
        A0t.put("short", "kotlin.Short");
        A0t.put("int", "kotlin.Int");
        A0t.put("float", "kotlin.Float");
        A0t.put("long", "kotlin.Long");
        A0t.put("double", "kotlin.Double");
        A02 = A0t;
        HashMap A0t2 = AnonymousClass001.A0t();
        A0t2.put("java.lang.Boolean", "kotlin.Boolean");
        A0t2.put("java.lang.Character", "kotlin.Char");
        A0t2.put("java.lang.Byte", "kotlin.Byte");
        A0t2.put("java.lang.Short", "kotlin.Short");
        A0t2.put("java.lang.Integer", "kotlin.Int");
        A0t2.put("java.lang.Float", "kotlin.Float");
        A0t2.put("java.lang.Long", "kotlin.Long");
        A0t2.put("java.lang.Double", "kotlin.Double");
        A03 = A0t2;
        HashMap A0t3 = AnonymousClass001.A0t();
        A0t3.put("java.lang.Object", "kotlin.Any");
        A0t3.put("java.lang.String", "kotlin.String");
        A0t3.put("java.lang.CharSequence", "kotlin.CharSequence");
        A0t3.put("java.lang.Throwable", "kotlin.Throwable");
        A0t3.put("java.lang.Cloneable", "kotlin.Cloneable");
        A0t3.put("java.lang.Number", "kotlin.Number");
        A0t3.put("java.lang.Comparable", "kotlin.Comparable");
        A0t3.put("java.lang.Enum", "kotlin.Enum");
        A0t3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        A0t3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        A0t3.put("java.util.Iterator", "kotlin.collections.Iterator");
        A0t3.put("java.util.Collection", "kotlin.collections.Collection");
        A0t3.put("java.util.List", "kotlin.collections.List");
        A0t3.put("java.util.Set", "kotlin.collections.Set");
        A0t3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        A0t3.put("java.util.Map", "kotlin.collections.Map");
        A0t3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        A0t3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        A0t3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        A0t3.putAll(A0t);
        A0t3.putAll(A0t2);
        Collection values = A0t.values();
        C162457s7.A0D(values);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("kotlin.jvm.internal.");
            C162457s7.A0H(A0m);
            String str = A0m;
            C162457s7.A0J(A0m, 0);
            int length = A0m.length();
            int A0D = C175728Zm.A0D(A0m, '.', length - 1);
            if (A0D != -1) {
                str = A0m.substring(A0D + 1, length);
                C162457s7.A0D(str);
            }
            A0o2.append(str);
            A0t3.put(AnonymousClass000.A0X("CompanionObject", A0o2), AnonymousClass000.A0X(".Companion", AnonymousClass000.A0l(A0m)));
        }
        Iterator A0q = AnonymousClass000.A0q(A04);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            A0t3.put(((Class) A0w.getKey()).getName(), AnonymousClass000.A0Y("kotlin.Function", AnonymousClass001.A0o(), AnonymousClass0x2.A08(A0w)));
        }
        A01 = A0t3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass8UG.A0I(A0t3.size()));
        Iterator it2 = A0t3.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry A0w2 = AnonymousClass001.A0w(it2);
            Object key = A0w2.getKey();
            String A12 = AnonymousClass0x9.A12(A0w2);
            C162457s7.A0J(A12, 0);
            int length2 = A12.length();
            int A0D2 = C175728Zm.A0D(A12, '.', length2 - 1);
            if (A0D2 != -1) {
                A12 = A12.substring(A0D2 + 1, length2);
                C162457s7.A0D(A12);
            }
            linkedHashMap.put(key, A12);
        }
        A05 = linkedHashMap;
    }

    public Class B8n() {
        return this.A00;
    }

    public String BBo() {
        String A0e;
        String A0X;
        Class cls = this.A00;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (!componentType.isPrimitive() || (A0e = C18320x8.A0e(componentType.getName(), A01)) == null || (A0X = AnonymousClass000.A0X("Array", AnonymousClass000.A0l(A0e))) == null) {
                return "kotlin.Array";
            }
            return A0X;
        }
        String A0e2 = C18320x8.A0e(cls.getName(), A01);
        if (A0e2 == null) {
            return cls.getCanonicalName();
        }
        return A0e2;
    }

    public String BD4() {
        String A0o;
        Class cls = this.A00;
        String str = null;
        if (!cls.isAnonymousClass()) {
            if (cls.isLocalClass()) {
                str = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    C162457s7.A0H(str);
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append(enclosingMethod.getName());
                    return C175728Zm.A0L(str, AnonymousClass001.A0j(A0o2, '$'), str);
                }
                Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                if (enclosingConstructor != null) {
                    C162457s7.A0H(str);
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append(enclosingConstructor.getName());
                    return C175728Zm.A0L(str, AnonymousClass001.A0j(A0o3, '$'), str);
                }
                C162457s7.A0H(str);
                C162457s7.A0J(str, 0);
                int A0C = C175728Zm.A0C(str, '$', 0);
                if (A0C != -1) {
                    String substring = str.substring(A0C + 1, str.length());
                    C162457s7.A0D(substring);
                    return substring;
                }
            } else if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (!componentType.isPrimitive() || (A0o = C18310x6.A0o(componentType.getName(), A05)) == null || (str = AnonymousClass000.A0T(A0o, "Array")) == null) {
                    return "Array";
                }
            } else {
                str = C18310x6.A0o(cls.getName(), A05);
                if (str == null) {
                    return cls.getSimpleName();
                }
            }
        }
        return str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass8PJ) || !C162457s7.A0P(C154547dL.A01(this), C154547dL.A01((C85424Ge) obj))) {
            return false;
        }
        return true;
    }

    public List getAnnotations() {
        throw new C143076yI();
    }

    public int hashCode() {
        return C154547dL.A01(this).hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1B(this.A00, A0o);
        return AnonymousClass000.A0X(" (Kotlin reflection is not available)", A0o);
    }
}
