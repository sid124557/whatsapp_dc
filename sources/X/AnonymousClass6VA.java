package X;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.6VA  reason: invalid class name */
public final class AnonymousClass6VA extends AnonymousClass8T0 implements C188178yT, RandomAccess {
    public static final AnonymousClass6VA A01;
    public static final C188178yT A02;
    public final List A00;

    static {
        AnonymousClass6VA r1 = new AnonymousClass6VA(10);
        A01 = r1;
        r1.A00 = false;
        A02 = r1;
    }

    public static String A00(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof AnonymousClass8Ln)) {
            return new String((byte[]) obj, C155637fE.A03);
        }
        AnonymousClass8Ln r4 = (AnonymousClass8Ln) obj;
        Charset charset = C155637fE.A03;
        if (r4.A01() == 0) {
            return "";
        }
        AnonymousClass6VD r42 = (AnonymousClass6VD) r4;
        return AnonymousClass6CA.A0W(charset, r42.zza, 0, r42.A01());
    }

    /* renamed from: A03 */
    public final String get(int i) {
        String str;
        boolean A002;
        List list = this.A00;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AnonymousClass8Ln) {
            AnonymousClass8Ln r6 = (AnonymousClass8Ln) obj;
            Charset charset = C155637fE.A03;
            if (r6.A01() == 0) {
                str = "";
            } else {
                AnonymousClass6VD r0 = (AnonymousClass6VD) r6;
                str = AnonymousClass6CA.A0W(charset, r0.zza, 0, r0.A01());
            }
            AnonymousClass6VD r62 = (AnonymousClass6VD) r6;
            A002 = C1456376r.A00.A00(r62.zza, 0, r62.A01());
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, C155637fE.A03);
            A002 = C1456376r.A00.A00(bArr, 0, bArr.length);
        }
        if (A002) {
            list.set(i, str);
        }
        return str;
    }

    public final C188178yT Btz() {
        if (this.A00) {
            return new AnonymousClass8T1(this);
        }
        return this;
    }

    public final List Bu6() {
        return Collections.unmodifiableList(this.A00);
    }

    public final int size() {
        return this.A00.size();
    }

    public AnonymousClass6VA(int i) {
        this.A00 = AnonymousClass002.A0I(i);
    }

    public final /* bridge */ /* synthetic */ C188218yX Btt(int i) {
        if (i >= size()) {
            ArrayList A0I = AnonymousClass002.A0I(i);
            A0I.addAll(this.A00);
            return new AnonymousClass6VA(A0I);
        }
        throw AnonymousClass6CA.A0N();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        A02();
        this.A00.add(i, obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        A02();
        if (collection instanceof C188178yT) {
            collection = ((C188178yT) collection).Bu6();
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

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        A02();
        Object remove = this.A00.remove(i);
        this.modCount++;
        return A00(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        A02();
        return A00(this.A00.set(i, obj));
    }

    public AnonymousClass6VA() {
        this(10);
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public AnonymousClass6VA(ArrayList arrayList) {
        this.A00 = arrayList;
    }
}
