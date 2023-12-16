package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0XV  reason: invalid class name */
public final class AnonymousClass0XV {
    public static final Class[] A05 = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    public final C16050sO A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;

    public static final Bundle A00(AnonymousClass0XV r6) {
        Iterator A0q = AnonymousClass000.A0q(C73813g7.A0D(r6.A04));
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            r6.A06((String) A0w.getKey(), ((C16050sO) A0w.getValue()).Bkk());
        }
        Map map = r6.A03;
        Set keySet = map.keySet();
        ArrayList A0I = AnonymousClass002.A0I(keySet.size());
        ArrayList A0I2 = AnonymousClass002.A0I(A0I.size());
        for (Object next : keySet) {
            A0I.add(next);
            A0I2.add(map.get(next));
        }
        return C02820Hs.A00(AnonymousClass2A3.A00("keys", A0I), AnonymousClass2A3.A00("values", A0I2));
    }

    public static final boolean A01(Object obj) {
        if (obj != null) {
            Class[] clsArr = A05;
            int length = clsArr.length;
            int i = 0;
            while (i < length) {
                Class cls = clsArr[i];
                C162457s7.A0H(cls);
                if (!cls.isInstance(obj)) {
                    i++;
                }
            }
            return false;
        }
        return true;
    }

    public final Object A04(String str) {
        C162457s7.A0J(str, 0);
        return this.A03.get(str);
    }

    public final void A05(String str) {
        C162457s7.A0J(str, 0);
        this.A03.remove(str);
        AnonymousClass08K r1 = (AnonymousClass08K) this.A02.remove(str);
        if (r1 != null) {
            r1.A00 = null;
        }
        this.A01.remove(str);
    }

    public final void A06(String str, Object obj) {
        C06270Wx r1;
        C162457s7.A0J(str, 0);
        if (A01(obj)) {
            Object obj2 = this.A02.get(str);
            if (!(obj2 instanceof AnonymousClass08M) || (r1 = (C06270Wx) obj2) == null) {
                this.A03.put(str, obj);
            } else {
                r1.A0H(obj);
            }
            C85524Gp r0 = (C85524Gp) this.A01.get(str);
            if (r0 != null) {
                r0.setValue(obj);
                return;
            }
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Can't put value with type ");
        C162457s7.A0H(obj);
        A0o.append(obj.getClass());
        throw AnonymousClass000.A0F(" into saved state", A0o);
    }

    public final AnonymousClass08M A02(Object obj, String str) {
        AnonymousClass08M r1;
        Map map = this.A02;
        Object obj2 = map.get(str);
        if ((obj2 instanceof AnonymousClass08M) && (r1 = (AnonymousClass08M) obj2) != null) {
            return r1;
        }
        Map map2 = this.A03;
        if (map2.containsKey(str)) {
            obj = map2.get(str);
        } else {
            map2.put(str, obj);
        }
        AnonymousClass08K r12 = new AnonymousClass08K(this, obj, str);
        map.put(str, r12);
        return r12;
    }

    public final AnonymousClass08M A03(String str) {
        AnonymousClass08K r1;
        AnonymousClass08M r12;
        Map map = this.A02;
        Object obj = map.get(str);
        if ((obj instanceof AnonymousClass08M) && (r12 = (AnonymousClass08M) obj) != null) {
            return r12;
        }
        Map map2 = this.A03;
        if (map2.containsKey(str)) {
            r1 = new AnonymousClass08K(this, map2.get(str), str);
        } else {
            r1 = new AnonymousClass08K(this, str);
        }
        map.put(str, r1);
        return r1;
    }

    public AnonymousClass0XV(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.A03 = linkedHashMap;
        this.A04 = new LinkedHashMap();
        this.A02 = new LinkedHashMap();
        this.A01 = new LinkedHashMap();
        this.A00 = new C02470Gj(this, 4);
        linkedHashMap.putAll(map);
    }

    public AnonymousClass0XV() {
        this.A03 = new LinkedHashMap();
        this.A04 = new LinkedHashMap();
        this.A02 = new LinkedHashMap();
        this.A01 = new LinkedHashMap();
        this.A00 = new C02470Gj(this, 4);
    }
}
