package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.6bc  reason: invalid class name and case insensitive filesystem */
public class C130226bc extends AnonymousClass8T6<String> implements C188208yW, RandomAccess {
    public static final C130226bc A01;
    public static final C188208yW A02;
    public final List A00;

    static {
        C130226bc r1 = new C130226bc();
        A01 = r1;
        r1.A00 = false;
        A02 = r1;
    }

    public Object BBr(int i) {
        return this.A00.get(i);
    }

    public List BE2() {
        return Collections.unmodifiableList(this.A00);
    }

    public C188208yW BE3() {
        if (this.A00) {
            return new AnonymousClass8T7(this);
        }
        return this;
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        String str;
        int A012;
        List list = this.A00;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof C172548Lq) {
            C172548Lq r5 = (C172548Lq) obj;
            str = r5.A05();
            C130256bf r52 = (C130256bf) r5;
            int A08 = r52.A08();
            A012 = C159717mL.A00.A01(r52.bytes, A08, r52.A03() + A08);
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, C155647fF.A04);
            A012 = C159717mL.A00.A01(bArr, 0, bArr.length);
        }
        if (A012 == 0) {
            list.set(i, str);
        }
        return str;
    }

    public int size() {
        return this.A00.size();
    }

    public C130226bc(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    public void AwJ(C172548Lq r2) {
        A00();
        this.A00.add(r2);
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ C188248ya BLN(int i) {
        if (i >= size()) {
            ArrayList A0I = AnonymousClass002.A0I(i);
            A0I.addAll(this.A00);
            return new C130226bc(A0I);
        }
        throw AnonymousClass6CA.A0N();
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        A00();
        this.A00.add(i, obj);
        this.modCount++;
    }

    public boolean addAll(int i, Collection collection) {
        A00();
        if (collection instanceof C188208yW) {
            collection = ((C188208yW) collection).BE2();
        }
        boolean addAll = this.A00.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public void clear() {
        A00();
        this.A00.clear();
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        A00();
        Object remove = this.A00.remove(i);
        this.modCount++;
        if (remove instanceof String) {
            return remove;
        }
        if (remove instanceof C172548Lq) {
            return ((C172548Lq) remove).A05();
        }
        return new String((byte[]) remove, C155647fF.A04);
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        A00();
        Object obj2 = this.A00.set(i, obj);
        if (obj2 instanceof String) {
            return obj2;
        }
        if (obj2 instanceof C172548Lq) {
            return ((C172548Lq) obj2).A05();
        }
        return new String((byte[]) obj2, C155647fF.A04);
    }

    public C130226bc() {
        this(AnonymousClass002.A0I(10));
    }

    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
