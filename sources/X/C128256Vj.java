package X;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.6Vj  reason: invalid class name and case insensitive filesystem */
public final class C128256Vj extends AnonymousClass8T2<String> implements C188188yU, RandomAccess {
    public static final C128256Vj A01;
    public static final C188188yU A02;
    public final List A00;

    static {
        C128256Vj r1 = new C128256Vj();
        A01 = r1;
        r1.A00 = false;
        A02 = r1;
    }

    public static String A00(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof C172528Lo)) {
            return new String((byte[]) obj, C155587f9.A03);
        }
        C172528Lo r4 = (C172528Lo) obj;
        Charset charset = C155587f9.A03;
        if (r4.A02() == 0) {
            return "";
        }
        C128286Vm r42 = (C128286Vm) r4;
        return AnonymousClass6CA.A0W(charset, r42.zzfp, r42.A04(), r42.A02());
    }

    public final Object BBr(int i) {
        return this.A00.get(i);
    }

    public final List Btl() {
        return Collections.unmodifiableList(this.A00);
    }

    public final C188188yU Btm() {
        if (this.A00) {
            return new AnonymousClass8T3(this);
        }
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        String str;
        int A012;
        List list = this.A00;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof C172528Lo) {
            C172528Lo r6 = (C172528Lo) obj;
            Charset charset = C155587f9.A03;
            if (r6.A02() == 0) {
                str = "";
            } else {
                C128286Vm r0 = (C128286Vm) r6;
                str = AnonymousClass6CA.A0W(charset, r0.zzfp, r0.A04(), r0.A02());
            }
            C128286Vm r62 = (C128286Vm) r6;
            int A04 = r62.A04();
            A012 = C161077ox.A00.A01(r62.zzfp, A04, r62.A02() + A04);
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, C155587f9.A03);
            A012 = C161077ox.A00.A01(bArr, 0, bArr.length);
        }
        if (A012 == 0) {
            list.set(i, str);
        }
        return str;
    }

    public final int size() {
        return this.A00.size();
    }

    public C128256Vj(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    public final /* synthetic */ C188228yY BuC(int i) {
        if (i >= size()) {
            ArrayList A0I = AnonymousClass002.A0I(i);
            A0I.addAll(this.A00);
            return new C128256Vj(A0I);
        }
        throw AnonymousClass6CA.A0N();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        A02();
        this.A00.add(i, obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        A02();
        if (collection instanceof C188188yU) {
            collection = ((C188188yU) collection).Btl();
        }
        boolean addAll = this.A00.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        A02();
        this.A00.clear();
        this.modCount++;
    }

    public final /* synthetic */ Object remove(int i) {
        A02();
        Object remove = this.A00.remove(i);
        this.modCount++;
        return A00(remove);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        A02();
        return A00(this.A00.set(i, obj));
    }

    public C128256Vj() {
        this(AnonymousClass002.A0I(10));
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
