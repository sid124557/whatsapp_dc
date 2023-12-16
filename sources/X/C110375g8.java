package X;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;

/* renamed from: X.5g8  reason: invalid class name and case insensitive filesystem */
public class C110375g8 implements C17050uU {
    public int A00;
    public C07890cz A01;
    public C87084Ny A02;
    public boolean A03 = false;

    public boolean Az7(C07890cz r2, C07910d1 r3) {
        return false;
    }

    public boolean B2v(C07890cz r2, C07910d1 r3) {
        return false;
    }

    public boolean B3N() {
        return false;
    }

    public void BG6(Context context, C07890cz r3) {
        this.A01 = r3;
        this.A02.A0H = r3;
    }

    public void BPH(C07890cz r1, boolean z) {
    }

    public void BaE(Parcelable parcelable) {
        if (parcelable instanceof C166247yN) {
            C87084Ny r5 = this.A02;
            C166247yN r8 = (C166247yN) parcelable;
            int i = r8.A00;
            int size = r5.A0H.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = r5.A0H.getItem(i2);
                if (i == item.getItemId()) {
                    r5.A0A = i;
                    r5.A0B = i2;
                    item.setChecked(true);
                    break;
                }
                i2++;
            }
            Context context = this.A02.getContext();
            AnonymousClass6EM r52 = r8.A01;
            SparseArray sparseArray = new SparseArray(r52.size());
            int i3 = 0;
            while (i3 < r52.size()) {
                int keyAt = r52.keyAt(i3);
                C108925dn r1 = (C108925dn) r52.valueAt(i3);
                if (r1 != null) {
                    sparseArray.put(keyAt, new AnonymousClass4M1(context, r1));
                    i3++;
                } else {
                    throw AnonymousClass001.A0c("BadgeDrawable's savedState cannot be null");
                }
            }
            C87084Ny r6 = this.A02;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                int keyAt2 = sparseArray.keyAt(i4);
                SparseArray sparseArray2 = r6.A0O;
                if (sparseArray2.indexOfKey(keyAt2) < 0) {
                    sparseArray2.append(keyAt2, sparseArray.get(keyAt2));
                }
            }
            AnonymousClass4PF[] r4 = r6.A0M;
            if (r4 != null) {
                for (AnonymousClass4PF r2 : r4) {
                    r2.setBadge((AnonymousClass4M1) r6.A0O.get(r2.getId()));
                }
            }
        }
    }

    public Parcelable Baj() {
        C166247yN r5 = new C166247yN();
        C87084Ny r1 = this.A02;
        r5.A00 = r1.A0A;
        SparseArray sparseArray = r1.A0O;
        AnonymousClass6EM r3 = new AnonymousClass6EM();
        int i = 0;
        while (i < sparseArray.size()) {
            int keyAt = sparseArray.keyAt(i);
            AnonymousClass4M1 r0 = (AnonymousClass4M1) sparseArray.valueAt(i);
            if (r0 != null) {
                r3.put(keyAt, r0.A09.A04);
                i++;
            } else {
                throw AnonymousClass001.A0c("badgeDrawable cannot be null");
            }
        }
        r5.A01 = r3;
        return r5;
    }

    public void Brl(boolean z) {
        AnonymousClass4PF[] r0;
        AnonymousClass0A7 r02;
        if (!this.A03) {
            C87084Ny r5 = this.A02;
            if (!z) {
                C07890cz r1 = r5.A0H;
                if (r1 != null && (r0 = r5.A0M) != null) {
                    int size = r1.size();
                    if (size == r0.length) {
                        int i = r5.A0A;
                        for (int i2 = 0; i2 < size; i2++) {
                            MenuItem item = r5.A0H.getItem(i2);
                            if (item.isChecked()) {
                                r5.A0A = item.getItemId();
                                r5.A0B = i2;
                            }
                        }
                        if (!(i == r5.A0A || (r02 = r5.A0S) == null)) {
                            AnonymousClass0XC.A02(r5, r02);
                        }
                        int i3 = r5.A09;
                        int size2 = r5.A0H.A05().size();
                        boolean z2 = true;
                        if (i3 != -1 ? i3 != 0 : size2 <= 3) {
                            z2 = false;
                        }
                        for (int i4 = 0; i4 < size; i4++) {
                            r5.A0I.A03 = true;
                            r5.A0M[i4].setLabelVisibilityMode(r5.A09);
                            r5.A0M[i4].setShifting(z2);
                            r5.A0M[i4].BGB((C07910d1) r5.A0H.getItem(i4), 0);
                            r5.A0I.A03 = false;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            r5.A02();
        }
    }

    public int getId() {
        return this.A00;
    }

    public boolean Bcv(AnonymousClass04J r2) {
        return false;
    }

    public void Bls(C16470tS r1) {
    }
}
