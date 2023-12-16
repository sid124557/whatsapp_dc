package X;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0mz  reason: invalid class name and case insensitive filesystem */
public final class C13320mz implements Runnable {
    public static Comparator A04 = new C17940wU(3);
    public static final ThreadLocal A05 = new ThreadLocal();
    public long A00;
    public long A01;
    public ArrayList A02 = AnonymousClass001.A0s();
    public ArrayList A03 = AnonymousClass001.A0s();

    public static final C05570Ua A00(RecyclerView recyclerView, int i, long j) {
        AnonymousClass0R0 r4 = recyclerView.A0K;
        int A022 = r4.A02();
        for (int i2 = 0; i2 < A022; i2++) {
            C05570Ua A002 = AnonymousClass0R0.A00(r4, i2);
            if (A002.A05 == i && (A002.A00 & 4) == 0) {
                return null;
            }
        }
        C04870Qz r3 = recyclerView.A0w;
        try {
            recyclerView.A09++;
            C05570Ua A023 = r3.A02(i, j);
            if (A023 != null) {
                if (!A023.A06() || (A023.A00 & 4) != 0) {
                    r3.A0A(A023, false);
                } else {
                    r3.A06(A023.A0H);
                }
            }
            return A023;
        } finally {
            recyclerView.A0u(false);
        }
    }

    public void run() {
        long j;
        WeakReference weakReference;
        RecyclerView recyclerView;
        AnonymousClass0MO r5;
        try {
            AnonymousClass0RZ.A01("RV Prefetch");
            ArrayList arrayList = this.A02;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j2 = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView2 = (RecyclerView) arrayList.get(i);
                    if (recyclerView2.getWindowVisibility() == 0) {
                        j2 = Math.max(recyclerView2.getDrawingTime(), j2);
                    }
                }
                if (j2 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j2) + this.A00;
                    int size2 = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size2; i3++) {
                        RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i3);
                        if (recyclerView3.getWindowVisibility() == 0) {
                            C08540ee r0 = recyclerView3.A0L;
                            r0.A00(recyclerView3, false);
                            i2 += r0.A00;
                        }
                    }
                    ArrayList arrayList2 = this.A03;
                    arrayList2.ensureCapacity(i2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < size2; i5++) {
                        RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i5);
                        if (recyclerView4.getWindowVisibility() == 0) {
                            C08540ee r10 = recyclerView4.A0L;
                            int abs = Math.abs(r10.A01) + Math.abs(r10.A02);
                            for (int i6 = 0; i6 < r10.A00 * 2; i6 += 2) {
                                if (i4 >= arrayList2.size()) {
                                    r5 = new AnonymousClass0MO();
                                    arrayList2.add(r5);
                                } else {
                                    r5 = (AnonymousClass0MO) arrayList2.get(i4);
                                }
                                int[] iArr = r10.A03;
                                int i7 = iArr[i6 + 1];
                                boolean z = false;
                                if (i7 <= abs) {
                                    z = true;
                                }
                                r5.A04 = z;
                                r5.A02 = abs;
                                r5.A00 = i7;
                                r5.A03 = recyclerView4;
                                r5.A01 = iArr[i6];
                                i4++;
                            }
                        }
                    }
                    Collections.sort(arrayList2, A04);
                    for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                        AnonymousClass0MO r102 = (AnonymousClass0MO) arrayList2.get(i8);
                        if (r102.A03 == null) {
                            break;
                        }
                        if (r102.A04) {
                            j = Long.MAX_VALUE;
                        } else {
                            j = nanos;
                        }
                        C05570Ua A002 = A00(r102.A03, r102.A01, j);
                        if (!(A002 == null || (weakReference = A002.A0D) == null || !A002.A06() || (A002.A00 & 4) != 0 || (recyclerView = (RecyclerView) weakReference.get()) == null)) {
                            if (recyclerView.A0e && recyclerView.A0K.A02() != 0) {
                                recyclerView.A0R();
                            }
                            C08540ee r7 = recyclerView.A0L;
                            r7.A00(recyclerView, true);
                            if (r7.A00 != 0) {
                                AnonymousClass0RZ.A01("RV Nested Prefetch");
                                AnonymousClass0Q1 r12 = recyclerView.A0y;
                                AnonymousClass0R6 r52 = recyclerView.A0N;
                                r12.A04 = 1;
                                r12.A03 = r52.A0G();
                                r12.A08 = false;
                                r12.A0D = false;
                                r12.A09 = false;
                                for (int i9 = 0; i9 < r7.A00 * 2; i9 += 2) {
                                    A00(recyclerView, r7.A03[i9], nanos);
                                }
                                AnonymousClass0RZ.A00();
                            }
                        }
                        r102.A04 = false;
                        r102.A02 = 0;
                        r102.A00 = 0;
                        r102.A03 = null;
                        r102.A01 = 0;
                    }
                }
            }
            this.A01 = 0;
            AnonymousClass0RZ.A00();
        } catch (Throwable th) {
            this.A01 = 0;
            AnonymousClass0RZ.A00();
            throw th;
        }
    }
}
