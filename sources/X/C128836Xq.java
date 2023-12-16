package X;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.6Xq  reason: invalid class name and case insensitive filesystem */
public final class C128836Xq extends AnonymousClass8T4<String> implements C188198yV, RandomAccess {
    public static final C128836Xq A01;
    public static final C188198yV A02;
    public final List A00;

    static {
        C128836Xq r1 = new C128836Xq();
        A01 = r1;
        r1.A00 = false;
        A02 = r1;
    }

    public static String A00(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof C172538Lp)) {
            return new String((byte[]) obj, C155597fA.A02);
        }
        C172538Lp r4 = (C172538Lp) obj;
        Charset charset = C155597fA.A02;
        if (r4.A01() == 0) {
            return "";
        }
        C128876Xu r42 = (C128876Xu) r4;
        return AnonymousClass6CA.A0W(charset, r42.zzb, r42.A03(), r42.A01());
    }

    public final Object Btc(int i) {
        return this.A00.get(i);
    }

    public final List Btv() {
        return Collections.unmodifiableList(this.A00);
    }

    public final C188198yV Bu0() {
        if (this.A00) {
            return new AnonymousClass8T5(this);
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
        if (obj instanceof C172538Lp) {
            C172538Lp r6 = (C172538Lp) obj;
            Charset charset = C155597fA.A02;
            if (r6.A01() == 0) {
                str = "";
            } else {
                C128876Xu r0 = (C128876Xu) r6;
                str = AnonymousClass6CA.A0W(charset, r0.zzb, r0.A03(), r0.A01());
            }
            C128876Xu r62 = (C128876Xu) r6;
            int A03 = r62.A03();
            A012 = C154937dz.A00.A01(r62.zzb, A03, r62.A01() + A03);
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, C155597fA.A02);
            A012 = C154937dz.A00.A01(bArr, 0, bArr.length);
        }
        if (A012 == 0) {
            list.set(i, str);
        }
        return str;
    }

    public final int size() {
        return this.A00.size();
    }

    public C128836Xq(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    public final /* synthetic */ C188238yZ BtF(int i) {
        if (i >= size()) {
            ArrayList A0I = AnonymousClass002.A0I(i);
            A0I.addAll(this.A00);
            return new C128836Xq(A0I);
        }
        throw AnonymousClass6CA.A0N();
    }

    public final void BtL(C172538Lp r2) {
        A01();
        this.A00.add(r2);
        this.modCount++;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        A01();
        this.A00.add(i, obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        A01();
        if (collection instanceof C188198yV) {
            collection = ((C188198yV) collection).Btv();
        }
        boolean addAll = this.A00.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        A01();
        this.A00.clear();
        this.modCount++;
    }

    public final /* synthetic */ Object remove(int i) {
        A01();
        Object remove = this.A00.remove(i);
        this.modCount++;
        return A00(remove);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        A01();
        return A00(this.A00.set(i, obj));
    }

    public C128836Xq() {
        this(AnonymousClass002.A0I(10));
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
