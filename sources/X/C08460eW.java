package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.0eW  reason: invalid class name and case insensitive filesystem */
public class C08460eW implements C16860u8 {
    public final /* synthetic */ RecyclerView A00;

    public C08460eW(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public void A00(AnonymousClass0Pd r6) {
        int i = r6.A00;
        if (i == 1) {
            RecyclerView recyclerView = this.A00;
            recyclerView.A0S.A12(recyclerView, r6.A02, r6.A01);
        } else if (i == 2) {
            RecyclerView recyclerView2 = this.A00;
            recyclerView2.A0S.A13(recyclerView2, r6.A02, r6.A01);
        } else if (i == 4) {
            RecyclerView recyclerView3 = this.A00;
            recyclerView3.A0S.A15(recyclerView3, r6.A03, r6.A02, r6.A01);
        } else if (i == 8) {
            RecyclerView recyclerView4 = this.A00;
            recyclerView4.A0S.A14(recyclerView4, r6.A02, r6.A01, 1);
        }
    }

    public void BKY(Object obj, int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.A00;
        AnonymousClass0R0 r3 = recyclerView.A0K;
        int A02 = r3.A02();
        int i5 = i + i2;
        for (int i6 = 0; i6 < A02; i6++) {
            View childAt = ((C08480eY) r3.A01).A00.getChildAt(i6);
            C05570Ua A022 = RecyclerView.A02(childAt);
            if (A022 != null && !AnonymousClass000.A1S(A022.A00 & 128) && (i4 = A022.A05) >= i && i4 < i5) {
                int i7 = 2 | A022.A00;
                A022.A00 = i7;
                if (obj == null) {
                    A022.A00 = 1024 | i7;
                } else if ((1024 & i7) == 0) {
                    if (A022.A0E == null) {
                        ArrayList A0s = AnonymousClass001.A0s();
                        A022.A0E = A0s;
                        A022.A0F = Collections.unmodifiableList(A0s);
                    }
                    A022.A0E.add(obj);
                }
                AnonymousClass001.A0Y(childAt).A01 = true;
            }
        }
        C04870Qz r5 = recyclerView.A0w;
        ArrayList arrayList = r5.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                C05570Ua A0Z = AnonymousClass001.A0Z(arrayList, size);
                if (A0Z != null && (i3 = A0Z.A05) >= i && i3 < i5) {
                    A0Z.A00 = 2 | A0Z.A00;
                    r5.A05(size);
                }
            } else {
                recyclerView.A0l = true;
                return;
            }
        }
    }

    public void BLp(int i, int i2) {
        RecyclerView recyclerView = this.A00;
        AnonymousClass0R0 r6 = recyclerView.A0K;
        int A02 = r6.A02();
        for (int i3 = 0; i3 < A02; i3++) {
            C05570Ua A002 = AnonymousClass0R0.A00(r6, i3);
            if (A002 != null && !AnonymousClass000.A1S(A002.A00 & 128) && A002.A05 >= i) {
                A002.A04(i2, false);
                recyclerView.A0y.A0C = true;
            }
        }
        ArrayList arrayList = recyclerView.A0w.A06;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C05570Ua A0Z = AnonymousClass001.A0Z(arrayList, i4);
            if (A0Z != null && A0Z.A05 >= i) {
                A0Z.A04(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.A0k = true;
    }

    public void BLq(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.A00;
        AnonymousClass0R0 r10 = recyclerView.A0K;
        int A02 = r10.A02();
        int i5 = i;
        int i6 = i2;
        int i7 = 1;
        if (i < i2) {
            i7 = -1;
            i6 = i;
            i5 = i2;
        }
        for (int i8 = 0; i8 < A02; i8++) {
            C05570Ua A002 = AnonymousClass0R0.A00(r10, i8);
            if (A002 != null && (i4 = A002.A05) >= i6 && i4 <= i5) {
                if (i4 == i) {
                    A002.A04(i2 - i, false);
                } else {
                    A002.A04(i7, false);
                }
                recyclerView.A0y.A0C = true;
            }
        }
        C04870Qz r0 = recyclerView.A0w;
        int i9 = 1;
        int i10 = i;
        int i11 = i2;
        if (i < i2) {
            i9 = -1;
            i11 = i;
            i10 = i2;
        }
        ArrayList arrayList = r0.A06;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            C05570Ua A0Z = AnonymousClass001.A0Z(arrayList, i12);
            if (A0Z != null && (i3 = A0Z.A05) >= i11 && i3 <= i10) {
                if (i3 == i) {
                    A0Z.A04(i2 - i, false);
                } else {
                    A0Z.A04(i9, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.A0k = true;
    }
}
