package X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;

/* renamed from: X.6KF  reason: invalid class name */
public final class AnonymousClass6KF extends C157777ir {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final SparseArray A07;
    public final SparseBooleanArray A08;

    public final void A00(int i, boolean z) {
        SparseBooleanArray sparseBooleanArray = this.A08;
        if (sparseBooleanArray.get(i) == z) {
            return;
        }
        if (z) {
            sparseBooleanArray.put(i, true);
        } else {
            sparseBooleanArray.delete(i);
        }
    }

    public AnonymousClass6KF(AnonymousClass6KG r7) {
        super(r7);
        this.A06 = r7.A08;
        this.A02 = r7.A04;
        this.A03 = r7.A05;
        this.A05 = r7.A07;
        this.A00 = r7.A00;
        this.A01 = r7.A03;
        this.A04 = r7.A06;
        SparseArray sparseArray = r7.A01;
        SparseArray A0I = AnonymousClass6CA.A0I();
        for (int i = 0; i < sparseArray.size(); i++) {
            A0I.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.A07 = A0I;
        this.A08 = r7.A02.clone();
    }

    public /* bridge */ /* synthetic */ void A01(String[] strArr) {
        String str;
        C129486aO builder = C129586aY.builder();
        for (String str2 : strArr) {
            str2.getClass();
            try {
                str = new Locale(str2).getISO3Language();
            } catch (MissingResourceException unused) {
                str = C1447272s.A00(str2);
            }
            builder.add((Object) str);
        }
        this.A0K = builder.build();
    }

    public AnonymousClass6KF() {
        this.A07 = AnonymousClass6CA.A0I();
        this.A08 = new SparseBooleanArray();
        this.A06 = true;
        this.A02 = false;
        this.A03 = true;
        this.A05 = true;
        this.A01 = true;
    }
}
