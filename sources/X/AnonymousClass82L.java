package X;

import android.graphics.Bitmap;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Queue;
import java.util.Set;

/* renamed from: X.82L  reason: invalid class name */
public abstract class AnonymousClass82L implements C187498xJ {
    public final SparseArray A00;
    public final C177728gM A01;
    public final C150737Rz A02;
    public final C150737Rz A03;
    public final C156557gp A04;
    public final C186618vf A05;
    public final Class A06 = getClass();
    public final Set A07;

    public synchronized Object A01(C149247Lp r3) {
        Object poll;
        poll = r3.A03.poll();
        if (poll != null) {
            r3.A00++;
        }
        return poll;
    }

    public final void A02() {
        C186438vJ r7 = C161577py.A00;
        if (r7.BI0(2)) {
            Class cls = this.A06;
            C150737Rz r1 = this.A03;
            Integer valueOf = Integer.valueOf(r1.A00);
            Integer valueOf2 = Integer.valueOf(r1.A01);
            C150737Rz r12 = this.A02;
            Integer valueOf3 = Integer.valueOf(r12.A00);
            Integer valueOf4 = Integer.valueOf(r12.A01);
            String simpleName = cls.getSimpleName();
            Object[] objArr = new Object[4];
            C18260x0.A0j(valueOf, valueOf2, valueOf3, objArr);
            objArr[3] = valueOf4;
            r7.BsD(simpleName, AnonymousClass6CA.A0T("Used = (%d, %d); Free = (%d, %d)", objArr));
        }
    }

    public synchronized void A03(int i) {
        C150737Rz r6 = this.A03;
        int i2 = r6.A01;
        C150737Rz r5 = this.A02;
        int i3 = r5.A01;
        int i4 = i2 + i3;
        int min = Math.min(i4 - i, i3);
        if (min > 0) {
            if (C161577py.A00.BI0(2)) {
                C161577py.A00(this.A06, Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(min), "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d");
            }
            A02();
            int i5 = 0;
            while (true) {
                SparseArray sparseArray = this.A00;
                if (i5 >= sparseArray.size() || min <= 0) {
                    A02();
                } else {
                    C149247Lp r1 = (C149247Lp) sparseArray.valueAt(i5);
                    r1.getClass();
                    while (true) {
                        Object poll = r1.A03.poll();
                        if (poll == null) {
                            break;
                        }
                        A04(poll);
                        int i6 = r1.A01;
                        min -= i6;
                        r5.A00(i6);
                        if (min <= 0) {
                            break;
                        }
                    }
                    i5++;
                }
            }
            A02();
            if (C161577py.A00.BI0(2)) {
                C161577py.A01(this.A06, Integer.valueOf(i), Integer.valueOf(r6.A01 + r5.A01), "trimToSize: TargetSize = %d; Final Size = %d");
            }
        }
    }

    public synchronized boolean A05() {
        return C86624Kv.A1W(this.A03.A01 + this.A02.A01, this.A04.A02);
    }

    public void Bim(Object obj) {
        int allocationByteCount;
        boolean z;
        boolean z2 = this instanceof AnonymousClass6Me;
        if (z2) {
            C184808sY r0 = (C184808sY) obj;
            r0.getClass();
            allocationByteCount = r0.BD5();
        } else {
            Bitmap bitmap = (Bitmap) obj;
            bitmap.getClass();
            allocationByteCount = bitmap.getAllocationByteCount();
        }
        synchronized (this) {
            C149247Lp r3 = (C149247Lp) this.A00.get(allocationByteCount);
            if (!this.A07.remove(obj)) {
                Class cls = this.A06;
                Object[] objArr = new Object[2];
                AnonymousClass000.A1L(objArr, System.identityHashCode(obj));
                AnonymousClass000.A1M(objArr, allocationByteCount);
                C186438vJ r2 = C161577py.A00;
                if (r2.BI0(6)) {
                    r2.B2F(cls.getSimpleName(), AnonymousClass6CA.A0T("release (free, value unrecognized) (object, size) = (%x, %s)", objArr));
                }
                A04(obj);
            } else {
                if (r3 != null) {
                    int i = r3.A00;
                    Queue queue = r3.A03;
                    if (i + queue.size() <= r3.A02 && !A05()) {
                        if (z2) {
                            C184808sY r02 = (C184808sY) obj;
                            r02.getClass();
                            z = !r02.isClosed();
                        } else {
                            Bitmap bitmap2 = (Bitmap) obj;
                            bitmap2.getClass();
                            if (!bitmap2.isRecycled()) {
                                z = bitmap2.isMutable();
                            }
                        }
                        if (z) {
                            int i2 = r3.A00;
                            if (i2 > 0) {
                                r3.A00 = i2 - 1;
                                queue.add(obj);
                            } else {
                                Object[] objArr2 = {obj};
                                C186438vJ r1 = C161577py.A00;
                                if (r1.BI0(6)) {
                                    r1.B2F("BUCKET", AnonymousClass6CA.A0T("Tried to release value %s from an empty bucket!", objArr2));
                                }
                            }
                            C150737Rz r12 = this.A02;
                            r12.A00++;
                            r12.A01 += allocationByteCount;
                            this.A03.A00(allocationByteCount);
                            if (C161577py.A00.BI0(2)) {
                                C161577py.A03(this.A06, obj, "release (reuse) (object, size) = (%x, %s)", allocationByteCount);
                            }
                        }
                    }
                    int i3 = r3.A00;
                    C153877cA.A01(AnonymousClass001.A1W(i3));
                    r3.A00 = i3 - 1;
                }
                if (C161577py.A00.BI0(2)) {
                    C161577py.A03(this.A06, obj, "release (free) (object, size) = (%x, %s)", allocationByteCount);
                }
                A04(obj);
                this.A03.A00(allocationByteCount);
            }
            A02();
        }
    }

    public Object A00(int i) {
        if (this instanceof AnonymousClass6Mb) {
            return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
        }
        return new C172238Kf(i);
    }

    public void A04(Object obj) {
        if (this instanceof AnonymousClass6Me) {
            C184808sY r2 = (C184808sY) obj;
            r2.getClass();
            r2.close();
            return;
        }
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        bitmap.recycle();
    }

    public AnonymousClass82L(C177728gM r11, C156557gp r12, C186618vf r13) {
        r11.getClass();
        this.A01 = r11;
        r12.getClass();
        this.A04 = r12;
        r13.getClass();
        this.A05 = r13;
        this.A00 = AnonymousClass6CA.A0I();
        SparseIntArray sparseIntArray = new SparseIntArray(0);
        synchronized (this) {
            SparseArray sparseArray = this.A00;
            sparseArray.clear();
            SparseIntArray sparseIntArray2 = this.A04.A03;
            for (int i = 0; i < sparseIntArray2.size(); i++) {
                int keyAt = sparseIntArray2.keyAt(i);
                sparseArray.put(keyAt, new C149247Lp(keyAt, sparseIntArray2.valueAt(i), sparseIntArray.get(keyAt, 0)));
            }
        }
        this.A07 = Collections.newSetFromMap(new IdentityHashMap());
        this.A02 = new C150737Rz();
        this.A03 = new C150737Rz();
    }
}
