package X;

import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.2nl  reason: invalid class name and case insensitive filesystem */
public class C53842nl {
    public int A00 = 0;
    public String A01;
    public HashMap A02;
    public byte[] A03 = null;
    public boolean[] A04;
    public final AnonymousClass33p A05;
    public final C56092rP A06;
    public final C26071bX A07;

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f4 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(java.lang.String r14, byte[] r15, int r16) {
        /*
            r13 = this;
            r4 = 0
            java.util.HashMap r6 = r13.A02
            java.lang.Object r7 = r6.get(r14)
            X.2yG r7 = (X.C60262yG) r7
            if (r7 != 0) goto L_0x00f8
            r3 = 0
        L_0x000c:
            boolean[] r5 = r13.A04
            boolean r0 = r5[r3]
            if (r0 != 0) goto L_0x00ee
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r0 = r13.A01     // Catch:{ Exception -> 0x00d6 }
            r1.append(r0)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r0 = "wampsid"
            r1.append(r0)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r0 = java.lang.Integer.toString(r3)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ Exception -> 0x00d6 }
            java.io.File r2 = X.AnonymousClass002.A0B(r0)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r0 = "rwd"
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00d6 }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x00d6 }
            X.2yG r2 = new X.2yG     // Catch:{ Exception -> 0x00d6 }
            X.1bX r0 = r13.A07     // Catch:{ Exception -> 0x00d6 }
            r2.<init>(r0, r1, r3)     // Catch:{ Exception -> 0x00d6 }
            X.2rP r1 = r13.A06     // Catch:{ Exception -> 0x00d9 }
            android.content.SharedPreferences r0 = r1.A00()     // Catch:{ Exception -> 0x00d9 }
            int r0 = X.C18310x6.A03(r0, r14)     // Catch:{ Exception -> 0x00d9 }
            int r7 = r0 + 1
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r7 <= r0) goto L_0x004e
            r7 = 0
        L_0x004e:
            android.content.SharedPreferences r0 = r1.A00()     // Catch:{ Exception -> 0x00d9 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Exception -> 0x00d9 }
            X.C18270x1.A0h(r0, r14, r7)     // Catch:{ Exception -> 0x00d9 }
            r8 = r14
            int r1 = r14.length()     // Catch:{ Exception -> 0x00d9 }
            r0 = 36
            if (r1 <= r0) goto L_0x0066
            java.lang.String r8 = r14.substring(r4, r0)     // Catch:{ Exception -> 0x00d9 }
        L_0x0066:
            r2.A03 = r8     // Catch:{ Exception -> 0x00d9 }
            r8 = 1
            r2.A01 = r8     // Catch:{ Exception -> 0x00d9 }
            r2.A00 = r4     // Catch:{ Exception -> 0x00d9 }
            java.io.RandomAccessFile r9 = r2.A07     // Catch:{ Exception -> 0x00d9 }
            r0 = 33024(0x8100, double:1.6316E-319)
            r9.setLength(r0)     // Catch:{ Exception -> 0x00d9 }
            byte[] r0 = X.C60262yG.A08     // Catch:{ Exception -> 0x00d9 }
            r9.write(r0)     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r1 = r2.A03     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r1.getBytes(r0)     // Catch:{ Exception -> 0x00d9 }
            r9.write(r0)     // Catch:{ Exception -> 0x00d9 }
            r9.writeByte(r8)     // Catch:{ Exception -> 0x00d9 }
            r9.writeByte(r4)     // Catch:{ Exception -> 0x00d9 }
            r11 = 8
            r9.writeInt(r11)     // Catch:{ Exception -> 0x00d9 }
            r12 = 32768(0x8000, float:4.5918E-41)
            r9.writeInt(r12)     // Catch:{ Exception -> 0x00d9 }
            r9.writeBoolean(r4)     // Catch:{ Exception -> 0x00d9 }
            r0 = 256(0x100, double:1.265E-321)
            r9.seek(r0)     // Catch:{ Exception -> 0x00d9 }
            byte[] r8 = X.C59672xI.A06     // Catch:{ Exception -> 0x00d9 }
            r0 = r7 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r0     // Catch:{ Exception -> 0x00d9 }
            r0 = 5
            r8[r0] = r1     // Catch:{ Exception -> 0x00d9 }
            int r0 = r7 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r0     // Catch:{ Exception -> 0x00d9 }
            r0 = 6
            r8[r0] = r1     // Catch:{ Exception -> 0x00d9 }
            r9.write(r8)     // Catch:{ Exception -> 0x00d9 }
            java.util.ArrayList r1 = r2.A04     // Catch:{ Exception -> 0x00d9 }
            X.2O4 r0 = new X.2O4     // Catch:{ Exception -> 0x00d9 }
            r0.<init>(r11, r12, r4)     // Catch:{ Exception -> 0x00d9 }
            r1.add(r0)     // Catch:{ Exception -> 0x00d9 }
            int r10 = r2.A00     // Catch:{ Exception -> 0x00d9 }
            X.1bX r8 = r2.A06     // Catch:{ Exception -> 0x00d9 }
            X.2xI r7 = new X.2xI     // Catch:{ Exception -> 0x00d9 }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00d9 }
            r2.A02 = r7     // Catch:{ Exception -> 0x00d9 }
            r0 = 1
            r5[r3] = r0     // Catch:{ Exception -> 0x00d9 }
            int r1 = r13.A00     // Catch:{ Exception -> 0x00d9 }
            if (r1 <= 0) goto L_0x00d2
            byte[] r0 = r13.A03     // Catch:{ Exception -> 0x00d9 }
            r2.A01(r0, r1)     // Catch:{ Exception -> 0x00d9 }
        L_0x00d2:
            r6.put(r14, r2)     // Catch:{ Exception -> 0x00d9 }
            goto L_0x00f7
        L_0x00d6:
            r5 = move-exception
            r2 = r7
            goto L_0x00da
        L_0x00d9:
            r5 = move-exception
        L_0x00da:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "privatestatsuploadqueue/writeToQueueForPsId failed to create new QueueFile "
            X.C18260x0.A1O(r1, r0, r5)
            X.1bX r1 = r13.A07
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A0B = r0
            r1.A05()
            r7 = r2
        L_0x00ee:
            int r3 = r3 + 1
            r0 = 8
            if (r3 < r0) goto L_0x000c
            if (r7 != 0) goto L_0x00f8
            return r4
        L_0x00f7:
            r7 = r2
        L_0x00f8:
            r0 = r16
            boolean r0 = r7.A01(r15, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53842nl.A02(java.lang.String, byte[], int):boolean");
    }

    public void A00(String str) {
        this.A01 = str;
        int i = 0;
        do {
            boolean[] zArr = this.A04;
            zArr[i] = false;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(this.A01);
            A0o.append("wampsid");
            File A0B = AnonymousClass002.A0B(AnonymousClass000.A0X(Integer.toString(i), A0o));
            if (A0B.exists()) {
                RandomAccessFile randomAccessFile = null;
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(A0B, "rwd");
                    try {
                        C60262yG r7 = new C60262yG(this.A07, randomAccessFile2, i);
                        RandomAccessFile randomAccessFile3 = r7.A07;
                        randomAccessFile3.seek(0);
                        byte[] bArr = C60262yG.A08;
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        randomAccessFile3.read(bArr2);
                        if (Arrays.equals(bArr2, bArr)) {
                            randomAccessFile3.seek((long) length);
                            byte[] bArr3 = new byte[36];
                            randomAccessFile3.read(bArr3);
                            r7.A03 = new String(bArr3, DefaultCrypto.UTF_8);
                            r7.A01 = randomAccessFile3.read();
                            r7.A00 = randomAccessFile3.read();
                            ArrayList arrayList = r7.A04;
                            arrayList.clear();
                            boolean z = false;
                            for (int i2 = 0; i2 < r7.A01; i2++) {
                                int readInt = randomAccessFile3.readInt();
                                int readInt2 = randomAccessFile3.readInt();
                                boolean readBoolean = randomAccessFile3.readBoolean();
                                if (readBoolean && readInt <= 8) {
                                    Log.e("queuefile/loadFromFile see locked empty mini event buffer");
                                    z = true;
                                    readBoolean = false;
                                }
                                arrayList.add(new AnonymousClass2O4(readInt, readInt2, readBoolean));
                            }
                            int i3 = r7.A00;
                            int i4 = AnonymousClass0x9.A0P(arrayList, i3).A01;
                            int i5 = AnonymousClass0x9.A0P(arrayList, i3).A00;
                            r7.A02 = new C59672xI(r7.A06, randomAccessFile3, i3, i4, i5);
                            if (z) {
                                r7.A00();
                            }
                            this.A02.put(r7.A03, r7);
                            zArr[i] = true;
                        } else {
                            Log.e("privatestatsuploadqueue/initfromqueuefile invalid queue file");
                            try {
                                randomAccessFile2.close();
                                A0B.delete();
                                return;
                            } catch (IOException | SecurityException e) {
                                C18260x0.A1O(AnonymousClass001.A0o(), "privatestatsuploadqueue/initfromqueuefile failed to delete the corrupted queue file ", e);
                                return;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        randomAccessFile = randomAccessFile2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    C18260x0.A1O(AnonymousClass001.A0o(), "privatestatsuploadqueue/initfromqueuefile failed to load the queue file ", e);
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException | SecurityException e4) {
                            C18260x0.A1O(AnonymousClass001.A0o(), "privatestatsuploadqueue/initfromqueuefile failed to delete the corrupted queue file ", e4);
                        }
                    }
                    i++;
                    if (i >= 8) {
                    }
                }
            }
            i++;
        } while (i >= 8);
    }

    public boolean A01() {
        Iterator A0u = AnonymousClass001.A0u(this.A02);
        while (A0u.hasNext()) {
            C60262yG r3 = (C60262yG) AnonymousClass0x2.A0W(A0u);
            int i = 0;
            while (true) {
                if (i < r3.A01) {
                    if (AnonymousClass0x9.A0P(r3.A04, i).A01 > 8) {
                        return true;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    public C53842nl(AnonymousClass33p r5, C56092rP r6, C26071bX r7) {
        this.A07 = r7;
        this.A06 = r6;
        this.A05 = r5;
        this.A02 = AnonymousClass001.A0t();
        boolean[] zArr = new boolean[8];
        this.A04 = zArr;
        int i = 0;
        do {
            zArr[i] = false;
            i++;
        } while (i < 8);
        this.A01 = "";
    }
}
