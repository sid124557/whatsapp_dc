package X;

import com.whatsapp.util.Log;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;

/* renamed from: X.2sR  reason: invalid class name and case insensitive filesystem */
public abstract class C56712sR {
    public final int A00;
    public final long A01;
    public final int[] A02;

    public final synchronized long A05(int i) {
        return (long) this.A02[i];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        if (r16 == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        r3 = (int) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r11.A02[r6] = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
        if (r1 != ((long) A01(r6))) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007b, code lost:
        X.C18270x1.A1K(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007e, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A07(long r12, long r14, boolean r16) {
        /*
            r11 = this;
            r10 = r11
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
        L_0x0005:
            r8 = 0
            int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0086
            int r7 = r11.A02(r12)
            long r3 = r11.A04(r7)
            long r1 = r12 - r3
            r6 = 1
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1U(r0)
            X.C626936e.A0C(r0)
            int r0 = r11.A01(r7)
            long r3 = (long) r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0029
            r6 = 0
        L_0x0029:
            X.C626936e.A0C(r6)
            int r6 = r11.A02(r12)
            long r3 = r11.A05(r6)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x007f
            long r1 = r1 + r14
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0086
            int r7 = r11.A01(r6)
            long r3 = (long) r7
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0065
            if (r16 == 0) goto L_0x004e
            monitor-enter(r10)
            int[] r0 = r11.A02     // Catch:{ all -> 0x006e }
            r0[r6] = r7     // Catch:{ all -> 0x006e }
            monitor-exit(r10)
        L_0x004e:
            long r1 = r1 - r3
            int r3 = r6 + 1
            int r0 = r11.A00
            if (r3 >= r0) goto L_0x005e
            X.C18270x1.A1K(r5, r6)
            long r12 = r11.A04(r3)
            r14 = r1
            goto L_0x0005
        L_0x005e:
            java.lang.String r0 = "downloaded more bytes than chunks"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0065:
            if (r16 == 0) goto L_0x0072
            int r3 = (int) r1
            monitor-enter(r10)
            int[] r0 = r11.A02     // Catch:{ all -> 0x006e }
            r0[r6] = r3     // Catch:{ all -> 0x006e }
            goto L_0x0071
        L_0x006e:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x0071:
            monitor-exit(r10)
        L_0x0072:
            int r0 = r11.A01(r6)
            long r3 = (long) r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0086
            X.C18270x1.A1K(r5, r6)
            return r5
        L_0x007f:
            java.lang.String r0 = "gap in downloaded chunk"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0086:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56712sR.A07(long, long, boolean):java.util.List");
    }

    public synchronized boolean A09(int i) {
        return AnonymousClass000.A1U(this.A02[i], A01(i));
    }

    public synchronized String toString() {
        StringBuilder A0o;
        String str;
        A0o = AnonymousClass001.A0o();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("totalBytes: ");
        A0o2.append(this.A01);
        C18270x1.A1C(", ", A0o2, A0o);
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("chunkCount: ");
        int i = this.A00;
        A0o3.append(i);
        C18270x1.A1C(", ", A0o3, A0o);
        int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            if (!A09(i3)) {
                if (i2 >= 0) {
                    int i4 = i3 - 1;
                    if (i4 != i2) {
                        StringBuilder A0o4 = AnonymousClass001.A0o();
                        A0o4.append("-");
                        A0o4.append(i4);
                        str = AnonymousClass000.A0f(A0o4);
                    } else {
                        str = "]";
                    }
                    A0o.append(str);
                    i2 = -1;
                }
                int[] iArr = this.A02;
                if (iArr[i3] > 0) {
                    StringBuilder A0o5 = AnonymousClass001.A0o();
                    A0o5.append("[");
                    A0o5.append(i3);
                    A0o5.append("] ");
                    A0o5.append(iArr[i3]);
                    C18270x1.A1C(", ", A0o5, A0o);
                }
            } else if (i2 < 0) {
                A0o.append(AnonymousClass000.A0Y("[", AnonymousClass001.A0o(), i3));
                i2 = i3;
            }
        }
        if (i2 >= 0) {
            StringBuilder A0o6 = AnonymousClass001.A0o();
            A0o6.append("[");
            A0o6.append(i2);
            A0o6.append("-");
            A0o6.append(i - 1);
            C18270x1.A1C("]", A0o6, A0o);
        }
        return A0o.toString();
    }

    public int A01(int i) {
        if (this instanceof C32861rn) {
            return AnonymousClass000.A09(((C32861rn) this).A00, i);
        }
        C32851rm r1 = (C32851rm) this;
        int i2 = r1.A00 - 1;
        long j = r1.A01;
        if (i == i2) {
            j = Math.min(j, r1.A01 % j);
        }
        return (int) j;
    }

    public int A02(long j) {
        boolean z = true;
        int i = 0;
        C626936e.A0C(AnonymousClass001.A1U((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        if (j >= this.A01) {
            z = false;
        }
        C626936e.A0C(z);
        int i2 = 0;
        while (i < this.A00) {
            i2 += A01(i);
            if (j < ((long) i2)) {
                break;
            }
            i++;
        }
        return i;
    }

    public long A03() {
        long j = 0;
        for (int i = 0; i < this.A00; i++) {
            j += A05(i);
        }
        return j;
    }

    public long A04(int i) {
        long j = 0;
        int i2 = 0;
        while (i2 < i && i2 < this.A00) {
            j += (long) A01(i2);
            i2++;
        }
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A06(long r7) {
        /*
            r6 = this;
            long r4 = r6.A01
            r2 = -1
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0024
            int r4 = r6.A02(r7)
        L_0x000c:
            int r1 = r6.A00
            if (r4 >= r1) goto L_0x0019
            boolean r0 = r6.A09(r4)
            if (r0 == 0) goto L_0x0019
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0019:
            if (r4 == r1) goto L_0x0024
            long r2 = r6.A04(r4)
            long r0 = r6.A05(r4)
            long r2 = r2 + r0
        L_0x0024:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56712sR.A06(long):long");
    }

    public void A08(File file) {
        DataOutputStream dataOutputStream;
        if (this instanceof C32861rn) {
            try {
                dataOutputStream = new DataOutputStream(AnonymousClass0x7.A0d(file));
                dataOutputStream.writeLong(this.A01);
                for (int i = 0; i < this.A00; i++) {
                    dataOutputStream.writeInt(this.A02[i]);
                }
            } catch (IOException e) {
                Log.e("ChunkStore/chunk store write failed", e);
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            C32851rm r2 = (C32851rm) this;
            dataOutputStream = new DataOutputStream(AnonymousClass0x7.A0d(file));
            dataOutputStream.writeLong(r2.A01);
            dataOutputStream.writeLong(r2.A01);
            dataOutputStream.writeInt(r2.A00);
            for (int i2 = 0; i2 < r2.A00; i2++) {
                dataOutputStream.writeInt(r2.A02[i2]);
            }
        }
        dataOutputStream.flush();
        dataOutputStream.close();
        return;
        throw th;
    }

    public C56712sR(int[] iArr, int i, long j) {
        this.A01 = j;
        this.A00 = i;
        if (iArr == null) {
            this.A02 = new int[i];
        } else {
            this.A02 = iArr;
        }
    }
}
