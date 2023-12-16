package X;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.2ru  reason: invalid class name and case insensitive filesystem */
public class C56392ru {
    public C56132rT A00;
    public final int A01;
    public final int A02;
    public final C380625j A03;
    public final AnonymousClass2SH A04;
    public final C26071bX A05;
    public final RandomAccessFile A06;
    public final long[] A07;

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0091 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.SparseArray A00() {
        /*
            r19 = this;
            r5 = r19
            boolean r0 = r5 instanceof X.C26131bd
            if (r0 == 0) goto L_0x00ca
            X.1bd r5 = (X.C26131bd) r5
            X.2nl r0 = r5.A01
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            java.util.HashMap r0 = r0.A02
            java.util.Iterator r7 = X.AnonymousClass001.A0u(r0)
        L_0x0015:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x024d
            java.lang.Object r4 = X.AnonymousClass0x2.A0W(r7)
            X.2yG r4 = (X.C60262yG) r4
            r5 = 0
            r3 = 0
        L_0x0023:
            int r0 = r4.A01
            if (r3 >= r0) goto L_0x0034
            java.util.ArrayList r0 = r4.A04
            X.2O4 r0 = X.AnonymousClass0x9.A0P(r0, r3)
            int r1 = r0.A01
            r0 = 8
            if (r1 <= r0) goto L_0x00c6
            r5 = 1
        L_0x0034:
            if (r5 == 0) goto L_0x0015
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r11 = 0
        L_0x003c:
            int r0 = r4.A01
            if (r11 >= r0) goto L_0x00ac
            int r0 = r4.A00
            if (r11 != r0) goto L_0x0094
            X.2xI r8 = r4.A02
        L_0x0046:
            int r5 = r8.A02
            r1 = 8
            r0 = 0
            if (r5 > r1) goto L_0x004e
            r0 = 1
        L_0x004e:
            if (r0 != 0) goto L_0x0091
            if (r5 <= r1) goto L_0x0082
            byte[] r6 = new byte[r5]
            java.io.RandomAccessFile r5 = r8.A05     // Catch:{ EOFException -> 0x0079, IOException -> 0x0072 }
            long r0 = r8.A03     // Catch:{ EOFException -> 0x0079, IOException -> 0x0072 }
            r5.seek(r0)     // Catch:{ EOFException -> 0x0079, IOException -> 0x0072 }
            int r1 = r8.A02     // Catch:{ EOFException -> 0x0079, IOException -> 0x0072 }
            r0 = 0
            r5.readFully(r6, r0, r1)     // Catch:{ EOFException -> 0x0079, IOException -> 0x0072 }
            int r0 = r8.A01     // Catch:{ EOFException -> 0x0079, IOException -> 0x0072 }
            int r0 = r0 * 9
            int r0 = r0 + 56
            int r0 = r0 + 8
            long r0 = (long) r0     // Catch:{ EOFException -> 0x0079, IOException -> 0x0072 }
            r5.seek(r0)     // Catch:{ EOFException -> 0x0079, IOException -> 0x0072 }
            r0 = 1
            r5.writeBoolean(r0)     // Catch:{ EOFException -> 0x0079, IOException -> 0x0072 }
            goto L_0x0083
        L_0x0072:
            X.1bX r1 = r8.A04
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A0E = r0
            goto L_0x007f
        L_0x0079:
            X.1bX r1 = r8.A04
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A04 = r0
        L_0x007f:
            r1.A05()
        L_0x0082:
            r6 = 0
        L_0x0083:
            if (r6 == 0) goto L_0x0091
            r3.put(r11, r6)
            java.util.ArrayList r0 = r4.A04
            X.2O4 r1 = X.AnonymousClass0x9.A0P(r0, r11)
            r0 = 1
            r1.A02 = r0
        L_0x0091:
            int r11 = r11 + 1
            goto L_0x003c
        L_0x0094:
            java.io.RandomAccessFile r10 = r4.A07
            java.util.ArrayList r1 = r4.A04
            X.2O4 r0 = X.AnonymousClass0x9.A0P(r1, r11)
            int r12 = r0.A01
            X.2O4 r0 = X.AnonymousClass0x9.A0P(r1, r11)
            int r13 = r0.A00
            X.1bX r9 = r4.A06
            X.2xI r8 = new X.2xI
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x0046
        L_0x00ac:
            r6 = 0
        L_0x00ad:
            int r0 = r3.size()
            if (r6 >= r0) goto L_0x0015
            int r5 = r3.keyAt(r6)
            java.lang.Object r1 = r3.get(r5)
            int r0 = r4.A05
            int r0 = r0 * 8
            int r0 = r0 + r5
            r2.put(r0, r1)
            int r6 = r6 + 1
            goto L_0x00ad
        L_0x00c6:
            int r3 = r3 + 1
            goto L_0x0023
        L_0x00ca:
            boolean r0 = r5 instanceof X.C26121bc
            if (r0 == 0) goto L_0x021d
            X.1bc r5 = (X.C26121bc) r5
            X.2xC r8 = r5.A00
            r0 = 10240(0x2800, float:1.4349E-41)
            byte[] r0 = new byte[r0]
            r8.A01 = r0
            r0 = 0
            r8.A00 = r0
            java.util.LinkedHashSet r0 = r8.A03
            r18 = r0
            r18.clear()
            java.util.HashMap r0 = r8.A02
            r17 = r0
            r17.clear()
            java.util.List r10 = r5.A01
            r10.clear()
            X.2SH r9 = r5.A04
            int r7 = r9.A01
        L_0x00f2:
            int r7 = r7 + 1
            int r0 = r5.A02
            int r7 = r7 % r0
            int r0 = r9.A01
            if (r7 == r0) goto L_0x01f5
            X.2rT r0 = r5.A01(r7)
            X.30f r0 = r0.A05
            java.nio.ByteBuffer r0 = r0.A05
            java.nio.ByteBuffer r14 = r0.asReadOnlyBuffer()
            r14.flip()
            int r0 = r14.limit()
            if (r0 <= 0) goto L_0x00f2
            int r13 = r14.limit()
            byte[] r0 = X.C59612xC.A04
            int r1 = r0.length
            r14.position(r1)
            r12 = 2048(0x800, float:2.87E-42)
            byte[] r11 = new byte[r12]
            r3 = 0
            r6 = 0
            r16 = 0
            r4 = 0
        L_0x0123:
            if (r1 >= r13) goto L_0x01ec
            X.2O5 r15 = X.C625335l.A03(r14)     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            int r2 = r15.A01     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            if (r2 != 0) goto L_0x0185
            int r2 = r15.A00     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            r0 = 6005(0x1775, float:8.415E-42)
            if (r2 != r0) goto L_0x014a
            java.lang.Object r3 = r15.A02     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            int r0 = r14.position()     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            int r0 = r0 - r1
            r14.position(r1)     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            r14.get(r11, r6, r0)     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            r8.A00(r3, r11, r0)     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
        L_0x0145:
            int r1 = r14.position()     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            goto L_0x0123
        L_0x014a:
            int r2 = r14.position()     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            int r2 = r2 - r1
            r14.position(r1)     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            r14.get(r11, r6, r2)     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            java.util.Iterator r1 = X.C18290x4.A10(r17)     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
        L_0x0159:
            boolean r0 = r1.hasNext()     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            if (r0 == 0) goto L_0x0169
            java.lang.Object r0 = r1.next()     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            java.io.ByteArrayOutputStream r0 = (java.io.ByteArrayOutputStream) r0     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            r0.write(r11, r6, r2)     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            goto L_0x0159
        L_0x0169:
            if (r2 <= r12) goto L_0x016d
            r2 = 2048(0x800, float:2.87E-42)
        L_0x016d:
            int r1 = r8.A00     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            int r0 = 10240 - r1
            if (r2 <= r0) goto L_0x017a
            java.lang.String r0 = "privatestatsuploadqueue/writetoCommonAttrBuffer too many common attributes"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            goto L_0x0145
        L_0x017a:
            byte[] r0 = r8.A01     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            java.lang.System.arraycopy(r11, r6, r0, r1, r2)     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            int r0 = r8.A00     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            int r0 = r0 + r2
            r8.A00 = r0     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            goto L_0x0145
        L_0x0185:
            r0 = 1
            if (r2 != r0) goto L_0x01aa
            int r2 = r14.position()     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            byte r0 = r14.get(r1)     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x01a6
            int r0 = r2 - r1
            r14.position(r1)     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            r14.get(r11, r6, r0)     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            r8.A00(r3, r11, r0)     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            r14.position(r2)     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            r1 = r4
            r16 = 0
            goto L_0x01a8
        L_0x01a6:
            r16 = 1
        L_0x01a8:
            r4 = r1
            goto L_0x0145
        L_0x01aa:
            r0 = 2
            if (r2 != r0) goto L_0x0145
            byte r0 = r14.get(r1)     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0145
            if (r16 == 0) goto L_0x0145
            int r2 = r14.position()     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            int r1 = r2 - r4
            r14.position(r4)     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            if (r1 > r12) goto L_0x01c9
            r14.get(r11, r6, r1)     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            r8.A00(r3, r11, r1)     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            goto L_0x01d1
        L_0x01c9:
            byte[] r0 = new byte[r1]     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            r14.get(r0, r6, r1)     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            r8.A00(r3, r0, r1)     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
        L_0x01d1:
            r14.position(r2)     // Catch:{ 23b -> 0x01e1, all -> 0x01d8 }
            r16 = 0
            goto L_0x0145
        L_0x01d8:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "privateStatseventbuffermanager/splitbuffer unexpected errors "
            goto L_0x01e9
        L_0x01e1:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "privatestatseventbuffermanager/splitbuffer invalid buf content"
        L_0x01e9:
            X.C18260x0.A1O(r1, r0, r2)
        L_0x01ec:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r10.add(r0)
            goto L_0x00f2
        L_0x01f5:
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            java.util.Iterator r4 = r18.iterator()
            r3 = 0
        L_0x01ff:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x024d
            java.lang.Object r1 = r4.next()
            r0 = r17
            java.lang.Object r0 = r0.get(r1)
            java.io.ByteArrayOutputStream r0 = (java.io.ByteArrayOutputStream) r0
            if (r0 == 0) goto L_0x021a
            byte[] r0 = r0.toByteArray()
            r2.put(r3, r0)
        L_0x021a:
            int r3 = r3 + 1
            goto L_0x01ff
        L_0x021d:
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            X.2SH r4 = r5.A04
            int r3 = r4.A01
        L_0x0226:
            int r3 = r3 + 1
            int r0 = r5.A02
            int r3 = r3 % r0
            int r0 = r4.A01
            if (r3 == r0) goto L_0x024d
            X.2rT r1 = r5.A01(r3)
            boolean r0 = r1.A05()
            if (r0 != 0) goto L_0x0226
            X.30f r0 = r1.A05
            java.nio.ByteBuffer r0 = r0.A05
            byte[] r1 = r0.array()
            int r0 = r0.position()
            byte[] r0 = java.util.Arrays.copyOf(r1, r0)
            r2.put(r3, r0)
            goto L_0x0226
        L_0x024d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56392ru.A00():android.util.SparseArray");
    }

    public C56132rT A01(int i) {
        RandomAccessFile randomAccessFile = this.A06;
        AnonymousClass2SH r5 = this.A04;
        int i2 = this.A01;
        C56132rT r3 = new C56132rT(this.A03, r5, this.A05, randomAccessFile, i, i2);
        try {
            r3.A03();
            if (i == r5.A01) {
                this.A07[i] = (long) r3.A00();
                return r3;
            }
        } catch (C375423a e) {
            C18260x0.A1O(AnonymousClass001.A0o(), "InMemorySingleEventBufferManager/readEventBufferFromDisk: error in reading event buffer", e);
        }
        return r3;
    }

    public void A02() {
        AnonymousClass2SH r9 = this.A04;
        AnonymousClass2SG[] r0 = r9.A05;
        int i = r9.A01;
        AnonymousClass2SG r6 = r0[i];
        RandomAccessFile randomAccessFile = this.A06;
        int i2 = this.A01;
        C56132rT r7 = new C56132rT(this.A03, r9, this.A05, randomAccessFile, i, i2);
        this.A00 = r7;
        try {
            r7.A03();
            this.A07[r9.A01] = (long) this.A00.A00();
            long A08 = C18290x4.A08();
            long j = r6.A04;
            if (j > A08) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("InMemorySingleEventBufferManager/init event from file: current event buffer timestamp is ");
                A0o.append(j - A08);
                C18260x0.A1M(A0o, " seconds in the future");
                r6.A04 = A08;
            }
            Locale locale = Locale.US;
            Object[] objArr = new Object[5];
            C56132rT r5 = this.A00;
            int i3 = r5.A02;
            int i4 = r5.A06.A01;
            if (i3 == i4) {
                AnonymousClass000.A1L(objArr, r5.A01);
                AnonymousClass000.A1M(objArr, r5.A00());
                if (i3 == i4) {
                    AnonymousClass000.A1N(objArr, r5.A04.A00.size());
                    AnonymousClass000.A1O(objArr, this.A00.A05.A05.position());
                    C56132rT r2 = this.A00;
                    C18300x5.A1R(objArr, r2.A06.A05[r2.A02].A04);
                    C18320x8.A1J("InMemorySingleEventBufferManager/initfromfile: opened existing wam file: record_count = %d, event_count = %d, attribute_count = %d, size = %d, create_ts = %d", locale, objArr);
                    return;
                }
                throw AnonymousClass002.A0G("No attribute count available for rotated buffers");
            }
            throw AnonymousClass002.A0G("No record count available for rotated buffers");
        } catch (C375423a e) {
            throw new C375723d(e.toString());
        }
    }

    public void A03() {
        RandomAccessFile randomAccessFile = this.A06;
        AnonymousClass2SH r2 = this.A04;
        int i = r2.A01;
        int i2 = this.A01;
        this.A00 = new C56132rT(this.A03, r2, this.A05, randomAccessFile, i, i2);
    }

    public boolean A05() {
        C56132rT A012;
        if (this instanceof C26131bd) {
            C26131bd r2 = (C26131bd) this;
            if (!r2.A01.A01()) {
                return true;
            }
            A012 = r2.A01(1);
        } else {
            A012 = A01((this.A04.A01 + 1) % this.A02);
        }
        return A012.A05();
    }

    public boolean A06() {
        if (this instanceof C26131bd) {
            return ((C26131bd) this).A01.A01();
        }
        for (int i = 0; i < this.A02; i++) {
            if (i != this.A04.A01 && !A01(i).A05()) {
                return true;
            }
        }
        return false;
    }

    public C56392ru(C380625j r2, AnonymousClass2SH r3, C26071bX r4, RandomAccessFile randomAccessFile, int i, int i2) {
        this.A06 = randomAccessFile;
        this.A04 = r3;
        this.A02 = i;
        this.A01 = i2;
        this.A05 = r4;
        this.A07 = new long[i];
        this.A03 = r2;
    }

    public void A04(List list) {
        if (A06()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int A052 = C18280x3.A05(it);
                if (A052 != this.A04.A01) {
                    C56132rT A012 = A01(A052);
                    if (!A012.A05()) {
                        A012.A01();
                        this.A07[A052] = 0;
                        try {
                            A012.A02();
                        } catch (IOException e) {
                            C18260x0.A1O(AnonymousClass001.A0o(), "InMemorySingleEventBufferManager/dropSentData: error while event buffer flush", e);
                        }
                    }
                }
            }
            return;
        }
        throw new Error("InMemorySingleEventBufferManager/dropSentData: Tried to drop empty buffer");
    }
}
