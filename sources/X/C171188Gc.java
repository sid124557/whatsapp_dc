package X;

import android.database.ContentObserver;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/* renamed from: X.8Gc  reason: invalid class name and case insensitive filesystem */
public class C171188Gc implements C186308v5 {
    public int A00;
    public int A01;
    public long[] A02;
    public final PriorityQueue A03;
    public final int[] A04;
    public final C186308v5[] A05;

    public C186058ug B9S(int i) {
        if (i < 0 || i > getCount()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("index ");
            A0o.append(i);
            A0o.append(" out of range max is ");
            throw AnonymousClass6C7.A0Y(A0o, getCount());
        }
        int[] iArr = this.A04;
        int i2 = 0;
        Arrays.fill(iArr, 0);
        int i3 = this.A01;
        int i4 = 0;
        while (i2 < i3) {
            long j = this.A02[i2];
            int i5 = (int) (4294967295L & j);
            int i6 = (int) (j >> 32);
            int i7 = i4 + i5;
            if (i7 > i) {
                return this.A05[i6].B9S(iArr[i6] + (i - i4));
            }
            iArr[i6] = iArr[i6] + i5;
            i2++;
            i4 = i7;
        }
        while (true) {
            PriorityQueue priorityQueue = this.A03;
            C151187Tt r5 = (C151187Tt) priorityQueue.poll();
            if (r5 == null) {
                return null;
            }
            int i8 = r5.A03;
            if (i8 == this.A00) {
                int i9 = this.A01 - 1;
                long[] jArr = this.A02;
                jArr[i9] = jArr[i9] + 1;
            } else {
                this.A00 = i8;
                long[] jArr2 = this.A02;
                int length = jArr2.length;
                int i10 = this.A01;
                if (length == i10) {
                    long[] jArr3 = new long[(i10 * 2)];
                    System.arraycopy(jArr2, 0, jArr3, 0, i10);
                    this.A02 = jArr3;
                    jArr2 = jArr3;
                }
                int i11 = this.A01;
                this.A01 = i11 + 1;
                jArr2[i11] = 1 | (((long) this.A00) << 32);
            }
            if (i4 == i) {
                C186058ug r1 = r5.A02;
                if (!r5.A00()) {
                    return r1;
                }
                priorityQueue.add(r5);
                return r1;
            }
            if (r5.A00()) {
                priorityQueue.add(r5);
            }
            i4++;
        }
    }

    public void Bjj() {
        for (C186308v5 Bjj : this.A05) {
            Bjj.Bjj();
        }
    }

    public void close() {
        for (C186308v5 close : this.A05) {
            close.close();
        }
    }

    public int getCount() {
        int i = 0;
        for (C186308v5 count : this.A05) {
            i += count.getCount();
        }
        return i;
    }

    public boolean isEmpty() {
        for (C186308v5 isEmpty : this.A05) {
            if (!isEmpty.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        for (C186308v5 registerContentObserver : this.A05) {
            registerContentObserver.registerContentObserver(contentObserver);
        }
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        for (C186308v5 unregisterContentObserver : this.A05) {
            unregisterContentObserver.unregisterContentObserver(contentObserver);
        }
    }

    public C171188Gc(C186308v5[] r6, int i) {
        Comparator r2;
        C186308v5[] r4 = (C186308v5[]) r6.clone();
        this.A05 = r4;
        if (i == 1) {
            r2 = new AnonymousClass8NI();
        } else {
            r2 = new AnonymousClass8NJ();
        }
        PriorityQueue priorityQueue = new PriorityQueue(4, r2);
        this.A03 = priorityQueue;
        this.A02 = new long[16];
        this.A01 = 0;
        int length = r4.length;
        this.A04 = new int[length];
        this.A00 = -1;
        priorityQueue.clear();
        for (int i2 = 0; i2 < length; i2++) {
            C151187Tt r1 = new C151187Tt(this.A05[i2], i2);
            if (r1.A00()) {
                this.A03.add(r1);
            }
        }
    }

    public HashMap B4t() {
        HashMap A0t = AnonymousClass001.A0t();
        for (C186308v5 B4t : this.A05) {
            A0t.putAll(B4t.B4t());
        }
        return A0t;
    }

    public C186058ug Bhe(int i) {
        return B9S(i);
    }
}
