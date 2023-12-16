package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.2rX  reason: invalid class name and case insensitive filesystem */
public class C56172rX {
    public boolean A00;
    public boolean A01 = true;
    public final int A02;
    public final C380625j A03;
    public final C56392ru A04;
    public final C59782xT A05;
    public final AnonymousClass2SH A06;
    public final C26071bX A07;
    public final File A08;
    public final RandomAccessFile A09;
    public final boolean A0A;

    public final int A00() {
        return this.A04.A00.A05.A05.capacity() - C57832uH.A00(C57832uH.A00.length - 1).length;
    }

    public long A01() {
        long j;
        C56392ru r5 = this.A04;
        long j2 = 0;
        for (int i = 0; i < r5.A02; i++) {
            if (i == r5.A04.A01) {
                j = (long) r5.A00.A00();
            } else {
                j = r5.A07[i];
            }
            j2 += j;
        }
        return j2;
    }

    public final void A02() {
        int i;
        if (this.A01) {
            try {
                this.A04.A00.A02();
                try {
                    C59782xT r2 = this.A05;
                    int i2 = r2.A06;
                    if (i2 == 0) {
                        i = 2;
                    } else {
                        i = r2.A08.A05.length;
                    }
                    r2.A01(i2, i);
                    r2.A07.A01();
                    this.A00 = false;
                } catch (IOException e) {
                    C26071bX r1 = this.A07;
                    r1.A0I = Boolean.TRUE;
                    r1.A05();
                    Log.e("wambuffer/flush: cannot write header", e);
                    Log.e("wambuffer: PERSISTENCE TURNED OFF");
                    this.A01 = false;
                }
            } catch (IOException unused) {
                Log.e("InMemorySingleEventBufferManager/flushEventBuffers: error while event buffer flush");
                Log.e("wambuffer: PERSISTENCE TURNED OFF");
                this.A01 = false;
            }
        }
    }

    public final void A03() {
        C56392ru r7 = this.A04;
        if (r7.A00.A05()) {
            throw new Error("Rotation failed since the current event buffer is empty");
        } else if (r7.A05()) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[4];
            AnonymousClass000.A1L(objArr, this.A06.A01);
            objArr[1] = Integer.valueOf(r7.A00.A05.A05.position());
            C56132rT r2 = r7.A00;
            objArr[2] = Integer.valueOf(r2.A00());
            AnonymousClass0x2.A1V(objArr, r2.A06.A05[r2.A02].A04);
            C18320x8.A1J("wambuffer/rotate: rotated event buffer %d: size = %d, event count = %d, timestamp = %d", locale, objArr);
            if (r7 instanceof C26131bd) {
                C26131bd r72 = (C26131bd) r7;
                C56132rT r22 = r72.A00;
                ByteBuffer asReadOnlyBuffer = r22.A05.A05.asReadOnlyBuffer();
                asReadOnlyBuffer.flip();
                if (asReadOnlyBuffer.limit() != 0) {
                    r72.A07(asReadOnlyBuffer, true);
                    try {
                        r22.A01();
                        r22.A02();
                    } catch (IOException e) {
                        e.toString();
                    }
                }
            } else {
                long[] jArr = r7.A07;
                AnonymousClass2SH r3 = r7.A04;
                int i = r3.A01;
                jArr[i] = (long) r7.A00.A00();
                int i2 = (i + 1) % r7.A02;
                r3.A01 = i2;
                r7.A00 = r7.A01(i2);
            }
            if (!this.A0A || this.A02 != 2) {
                this.A00 = true;
            }
        } else {
            throw new Error("Rotation failed since there is no empty buffer");
        }
    }

    public final void A04(C26151bf r11, C26141be r12) {
        C56132rT r6 = this.A04.A00;
        int length = C57832uH.A00.length - 1;
        ByteBuffer byteBuffer = r6.A05.A05;
        if (byteBuffer.position() == 0) {
            byteBuffer.put(C57832uH.A00(length));
            AnonymousClass2SH r8 = r6.A06;
            AnonymousClass2SG[] r7 = r8.A05;
            int i = r6.A02;
            AnonymousClass2SG r3 = r7[i];
            int i2 = r8.A00 + 1;
            r8.A00 = i2;
            if (i2 > 65535) {
                r8.A00 = 1;
                i2 = 1;
            }
            r3.A00 = i2;
            byteBuffer.put(r6.A06(length));
            r7[i].A04 = C18290x4.A08();
        }
        C36731zn r32 = r11.A02;
        int size = r32.size();
        C36731zn r1 = r12.A02;
        if (size + r1.size() <= byteBuffer.remaining()) {
            byteBuffer.put(r32.A00());
            byteBuffer.put(r1.A00());
            int i3 = r6.A01 + r11.A01;
            r6.A01 = i3;
            r6.A01 = i3 + r12.A01;
            r6.A00++;
            Map map = r11.A00;
            for (Number number : Collections.unmodifiableCollection(map.keySet())) {
                C59182wU r2 = r6.A04;
                int intValue = number.intValue();
                if (map.containsKey(number)) {
                    r2.A00(intValue, ((C48082eJ) map.get(number)).A00);
                } else {
                    throw new Error("The buffer does not contain the given attribute");
                }
            }
            return;
        }
        throw new Error("Not enough space in the buffer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r3.A0A != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(java.io.RandomAccessFile r4, int r5) {
        /*
            r3 = this;
            int r1 = r3.A02     // Catch:{ IOException -> 0x001c }
            if (r1 == 0) goto L_0x0011
            r0 = 1
            if (r1 != r0) goto L_0x000a
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0013
        L_0x000a:
            boolean r0 = r3.A0A     // Catch:{ IOException -> 0x001c }
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r0 == 0) goto L_0x0013
        L_0x0011:
            r1 = 65536(0x10000, float:9.18355E-41)
        L_0x0013:
            int r1 = r1 * r5
            r0 = 65536(0x10000, float:9.18355E-41)
            int r1 = r1 + r0
            long r0 = (long) r1     // Catch:{ IOException -> 0x001c }
            r4.setLength(r0)     // Catch:{ IOException -> 0x001c }
            return
        L_0x001c:
            r2 = move-exception
            X.1bX r1 = r3.A07
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A0H = r0
            r1.A05()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Cannot allocate space for new WAM file: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r2, r0, r1)
            X.23d r0 = new X.23d
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56172rX.A05(java.io.RandomAccessFile, int):void");
    }

    public boolean A06() {
        long A082 = C18290x4.A08() / 86400;
        AnonymousClass2SH r6 = this.A06;
        if (A082 != r6.A03) {
            int nextInt = AnonymousClass0x9.A1C().nextInt(100);
            boolean z = false;
            r6.A02 = 0;
            if (nextInt == 0) {
                z = true;
            }
            r6.A04 = z;
            r6.A03 = A082;
        }
        return r6.A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02c7, code lost:
        r7 = r15[r2];
        r3 = X.AnonymousClass001.A0o();
        r3.append("wambuffer/header/init/eventBufferMetadata/");
        r3.append(r2);
        r3.append(": size=");
        r3.append(r7.A01);
        r3.append(" timestamp=");
        r3.append(r7.A04);
        r3.append(" streamId=");
        r3.append(r7.A02);
        r3.append(" bufferSequenceNumber=");
        r3.append(r7.A00);
        r3.append(" checksum=");
        X.C18260x0.A1I(r3, r7.A03);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        r6.A04.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0310, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        r1 = new X.C375623c("Invalid current event buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0319, code lost:
        r1 = new X.C375623c("Invalid max event buffer size");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0321, code lost:
        r1 = new X.C375623c("Invalid max metadata size");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0329, code lost:
        r1 = new X.C375623c("Invalid WAM file magic or version");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0331, code lost:
        r1 = new X.C375623c("Invalid event buffer size");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0338, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0344, code lost:
        r1 = r9.A09;
        r1.A05 = java.lang.Boolean.TRUE;
        r1.A05();
        r1 = new X.C375623c("Invalid checksum");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0355, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0356, code lost:
        r1 = new X.C375623c(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0360, code lost:
        r1 = new X.C375623c("Event buffer downgrade not allowed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x038d, code lost:
        r1 = X.AnonymousClass001.A0c("Given range contains invalid bytes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x039f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        r1 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03a2, code lost:
        if (r1 != 0) goto L_0x03a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03a5, code lost:
        if (r1 != 1) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03a7, code lost:
        r7 = r6.A07;
        r1 = r7.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03ab, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03ac, code lost:
        if (r1 != null) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        r0 = r7.A0O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03b0, code lost:
        if (r0 == null) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03b2, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03b5, code lost:
        r2 = r0.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03b9, code lost:
        r7.A0O = X.AnonymousClass0x9.A0n(r2, r1.longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        r7 = r6.A07;
        r1 = r7.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03c8, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03c9, code lost:
        if (r1 != null) goto L_0x03cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        r0 = r7.A0Q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03cd, code lost:
        if (r0 == null) goto L_0x03cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03cf, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03d2, code lost:
        r2 = r0.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03d6, code lost:
        r7.A0Q = X.AnonymousClass0x9.A0n(r2, r1.longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        r7 = r6.A07;
        r1 = r7.A0J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03e5, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03e6, code lost:
        if (r1 != null) goto L_0x03e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:?, code lost:
        r0 = r7.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03ea, code lost:
        if (r0 == null) goto L_0x03ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03ec, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03ef, code lost:
        r2 = r0.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03f3, code lost:
        r7.A0M = X.AnonymousClass0x9.A0n(r2, r1.longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03fe, code lost:
        r7.A05();
        r6.A04.A03();
        r3 = r6.A06;
        r3.A01 = 0;
        r3.A00 = 0;
        r3.A04 = false;
        r3.A03 = 0;
        r3.A02 = 0;
        r7 = r6.A04;
        r0 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0419, code lost:
        if (r0 != null) goto L_0x041b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x041b, code lost:
        r0.A01();
        r7.A07[r7.A04.A01] = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0426, code lost:
        r3 = r6.A05;
        r3.A03 = X.C57842uI.A00(r3.A06);
        r3.A01 = 65536;
        r3.A02 = 0;
        r2 = r3.A07;
        r2.A05.clear();
        r2.A01 = 0;
        r2.A06.reset();
        r2.A00 = 0;
        r1 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x044b, code lost:
        if (r1 != 0) goto L_0x044d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x044e, code lost:
        if (r1 == 1) goto L_0x0450;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0450, code lost:
        r1 = 16384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0453, code lost:
        r1 = 32768;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0458, code lost:
        if (r3.A0A != false) goto L_0x045a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x045a, code lost:
        r1 = 65536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0469, code lost:
        r3.A00 = r1;
        r1 = X.AnonymousClass001.A0o();
        r1.append("wambuffer/wambuffer: error while opening WAM file (");
        r1.append(r4);
        X.C18260x0.A1K(r1, ")");
        r21.A0C = java.lang.Boolean.TRUE;
        r21.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04b2, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x012a, code lost:
        if (r8 != 0) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x012c, code lost:
        r14 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r4.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r14 = r4.getInt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0137, code lost:
        r7 = r9.A08;
        r15 = r7.A05;
        r4 = r15.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x013c, code lost:
        if (r14 > r4) goto L_0x0360;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x013e, code lost:
        r9.A01(r8, r14);
        r18 = r19.position();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r1.A02(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r13 = r19.asReadOnlyBuffer();
        r13.flip();
        r0 = new byte[X.C57842uI.A00(r8).length];
        r9.A03 = r0;
        r13.get(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x015e, code lost:
        if (r8 != 0) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0160, code lost:
        r11 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0162, code lost:
        r13.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r11 = r13.getInt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x016b, code lost:
        r10 = java.nio.ByteOrder.LITTLE_ENDIAN;
        r13.order(r10);
        r9.A01 = r13.getInt();
        r13.order(r10);
        r9.A00 = r13.getInt();
        r13.order(r10);
        r0 = r13.getInt();
        r7.A01 = r0;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0189, code lost:
        if (r0 < r11) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x018b, code lost:
        r7.A01 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x018d, code lost:
        if (r8 < 2) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x018f, code lost:
        r13.order(r10);
        r7.A00 = r13.getInt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r7.A04 = X.AnonymousClass001.A1T(r13.get());
        r7.A03 = X.C59782xT.A00(r13);
        r13.order(r10);
        r7.A02 = r13.getInt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01b1, code lost:
        if (r3 >= r11) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01b3, code lost:
        if (r3 >= r4) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01b5, code lost:
        r2 = r15[r3];
        r13.order(r10);
        r2.A01 = r13.getInt();
        r2.A04 = X.C59782xT.A00(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01c8, code lost:
        if (r8 < 2) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01ca, code lost:
        r13.order(r10);
        r2.A02 = r13.getInt();
        r13.order(r10);
        r2.A00 = r13.getInt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01dc, code lost:
        r2.A03 = X.C59782xT.A00(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01e5, code lost:
        r13.order(r10);
        r13.getInt();
        r13.order(r10);
        r13.getInt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01f1, code lost:
        if (r8 < 2) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01f3, code lost:
        r13.order(r10);
        r13.getInt();
        r13.order(r10);
        r13.getInt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ff, code lost:
        r13.order(r10);
        r13.getInt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0205, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0208, code lost:
        r9.A02 = X.C59782xT.A00(r13);
        r3 = r18 - 4;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0215, code lost:
        if (r3 > r19.position()) goto L_0x038d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0217, code lost:
        r1 = new java.util.zip.Adler32();
        r1.update(r19.array(), 0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x022b, code lost:
        if (r9.A02 != r1.getValue()) goto L_0x0344;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0237, code lost:
        if (java.util.Arrays.equals(r9.A03, X.C57842uI.A00(r8)) == false) goto L_0x0329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0239, code lost:
        r11 = r9.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x023d, code lost:
        if (r11 != 65536) goto L_0x0321;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x023f, code lost:
        r10 = r9.A00;
        r1 = r9.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0243, code lost:
        if (r1 == 0) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0246, code lost:
        if (r1 != 1) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0248, code lost:
        r1 = 16384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x024b, code lost:
        r1 = 32768;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0250, code lost:
        if (r9.A0A == false) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0252, code lost:
        r1 = 65536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0254, code lost:
        if (r10 != r1) goto L_0x0319;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0256, code lost:
        r1 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0258, code lost:
        if (r1 < 0) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x025c, code lost:
        if (r1 >= r9.A05) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x025e, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x025f, code lost:
        if (r3 >= r4) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0265, code lost:
        if (r15[r3].A01 > r10) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0267, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        r3 = X.AnonymousClass001.A0o();
        r3.append("wambuffer/header/init: header=");
        r3.append(r8);
        r3.append(" bufferCount=");
        r3.append(r14);
        r3.append(" maxMetadataSize=");
        r3.append(r11);
        r3.append(" maxEventBufferSize=");
        r3.append(r10);
        r3.append(" currentEventBufferIndex=");
        r3.append(r1);
        r3.append(" currentEventBufferIndex=");
        r3.append(r1);
        r3.append(" currentBufferSequenceNumber=");
        r3.append(r7.A00);
        r3.append(" isEventBeaconingEnabled=");
        r3.append(r7.A04);
        r3.append(" dayOfLastBeaconingDecision=");
        r3.append(r7.A03);
        r3.append(" currentEventSequenceNumber=");
        X.C18260x0.A1G(r3, r7.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02c5, code lost:
        if (r2 >= r4) goto L_0x030b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C56172rX(X.C380625j r23, X.AnonymousClass33p r24, X.AnonymousClass1VX r25, X.C56092rP r26, X.C26071bX r27, java.io.File r28, int r29, int r30, int r31, boolean r32) {
        /*
            r22 = this;
            r1 = 100
            r6 = r22
            r6.<init>()
            r4 = 1
            r6.A01 = r4
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "wambuffer/wambuffer: "
            r3 = r28
            X.AnonymousClass000.A10(r3, r0, r5)
            java.lang.String r0 = " ; fileHeaderVersion: "
            r5.append(r0)
            r2 = r29
            r5.append(r2)
            java.lang.String r0 = " ; eventBufferCount: "
            r5.append(r0)
            r20 = r30
            r0 = r20
            r5.append(r0)
            java.lang.String r0 = " ; beaconChance: "
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = " ; bufferChannel: "
            r5.append(r0)
            r1 = r31
            r5.append(r1)
            java.lang.String r0 = " : isPsPhase3Enabled: "
            r7 = r32
            X.C18260x0.A1D(r0, r5, r7)
            boolean r8 = r3.isFile()
            r6.A0A = r7
            r21 = r27
            r0 = r21
            r6.A07 = r0
            r10 = r23
            r6.A03 = r10
            java.lang.String r0 = "rwd"
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0060 }
            r5.<init>(r3, r0)     // Catch:{ IOException -> 0x0060 }
            r6.A01 = r4     // Catch:{ IOException -> 0x0060 }
            goto L_0x007e
        L_0x0060:
            r5 = move-exception
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r0 = r21
            r0.A0A = r4
            if (r8 != 0) goto L_0x006b
            r0.A08 = r4
        L_0x006b:
            r21.A05()
            java.lang.String r0 = "wambuffer/newwamfile: cannot open or create persistent WAM file; running in volatile mode"
            com.whatsapp.util.Log.e(r0, r5)
            java.lang.String r0 = "wambuffer: PERSISTENCE TURNED OFF"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            r6.A01 = r0
            r5 = 0
        L_0x007e:
            r6.A08 = r3
            r6.A09 = r5
            r6.A02 = r1
            X.2SH r4 = new X.2SH
            r0 = r20
            r4.<init>(r0, r1)
            r6.A06 = r4
            X.2xT r0 = new X.2xT
            r11 = r0
            r12 = r4
            r13 = r21
            r14 = r5
            r15 = r2
            r16 = r20
            r17 = r1
            r18 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r6.A05 = r0
            r0 = 2
            if (r32 == 0) goto L_0x00e3
            if (r1 != r0) goto L_0x00e3
            java.lang.String r3 = r3.getAbsolutePath()
            char r0 = java.io.File.separatorChar
            int r0 = r3.lastIndexOf(r0)
            r1 = 0
            int r0 = r0 + 1
            java.lang.String r16 = r3.substring(r1, r0)
            r1 = 3271(0xcc7, float:4.584E-42)
            X.2vE r0 = X.C58422vE.A02
            r3 = r25
            boolean r0 = r3.A0Y(r0, r1)
            if (r0 == 0) goto L_0x00d3
            X.1bc r9 = new X.1bc
            r11 = r4
            r12 = r13
            r13 = r5
            r14 = r20
            r9.<init>(r10, r11, r12, r13, r14)
        L_0x00cc:
            r6.A04 = r9
            if (r8 == 0) goto L_0x045d
            if (r5 == 0) goto L_0x045d
            goto L_0x00ef
        L_0x00d3:
            X.1bd r9 = new X.1bd
            r11 = r24
            r12 = r26
            r13 = r4
            r14 = r21
            r15 = r5
            r17 = r20
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x00cc
        L_0x00e3:
            X.2ru r9 = new X.2ru
            r11 = r4
            r12 = r13
            r13 = r5
            r14 = r20
            r15 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15)
            goto L_0x00cc
        L_0x00ef:
            r0 = r20
            r6.A05(r5, r0)     // Catch:{ 23d -> 0x04b5 }
            X.2xT r9 = r6.A05     // Catch:{ 23c -> 0x0394 }
            byte[] r0 = X.C57842uI.A00(r2)     // Catch:{ 23c -> 0x0394 }
            int r2 = r0.length     // Catch:{ 23c -> 0x0394 }
            byte[] r0 = new byte[r2]     // Catch:{ 23c -> 0x0394 }
            r9.A03 = r0     // Catch:{ 23c -> 0x0394 }
            X.30f r1 = r9.A07     // Catch:{ IOException -> 0x0382 }
            int r0 = r2 + 4
            r1.A02(r0)     // Catch:{ IOException -> 0x0382 }
            java.nio.ByteBuffer r0 = r1.A05     // Catch:{ 23c -> 0x0394 }
            r19 = r0
            java.nio.ByteBuffer r4 = r19.asReadOnlyBuffer()     // Catch:{ 23c -> 0x0394 }
            r4.flip()     // Catch:{ 23c -> 0x0394 }
            byte[] r0 = r9.A03     // Catch:{ 23c -> 0x0394 }
            r4.get(r0)     // Catch:{ 23c -> 0x0394 }
            byte[] r3 = r9.A03     // Catch:{ Exception -> 0x0377 }
            r8 = 0
        L_0x0119:
            byte[][] r2 = X.C57842uI.A00     // Catch:{ Exception -> 0x0377 }
            int r0 = r2.length     // Catch:{ Exception -> 0x0377 }
            if (r8 >= r0) goto L_0x0368
            r0 = r2[r8]     // Catch:{ Exception -> 0x0377 }
            boolean r0 = java.util.Arrays.equals(r3, r0)     // Catch:{ Exception -> 0x0377 }
            if (r0 == 0) goto L_0x0127
            goto L_0x012a
        L_0x0127:
            int r8 = r8 + 1
            goto L_0x0119
        L_0x012a:
            if (r8 != 0) goto L_0x012e
            r14 = 2
            goto L_0x0137
        L_0x012e:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ 23c -> 0x0394 }
            r4.order(r0)     // Catch:{ 23c -> 0x0394 }
            int r14 = r4.getInt()     // Catch:{ 23c -> 0x0394 }
        L_0x0137:
            X.2SH r7 = r9.A08     // Catch:{ 23c -> 0x0394 }
            X.2SG[] r15 = r7.A05     // Catch:{ 23c -> 0x0394 }
            int r4 = r15.length     // Catch:{ 23c -> 0x0394 }
            if (r14 > r4) goto L_0x0360
            r9.A01(r8, r14)     // Catch:{ 23c -> 0x0394 }
            int r18 = r19.position()     // Catch:{ 23c -> 0x0394 }
            r0 = r18
            r1.A02(r0)     // Catch:{ IOException -> 0x0355 }
            java.nio.ByteBuffer r13 = r19.asReadOnlyBuffer()     // Catch:{ 23c -> 0x0394 }
            r13.flip()     // Catch:{ 23c -> 0x0394 }
            byte[] r0 = X.C57842uI.A00(r8)     // Catch:{ 23c -> 0x0394 }
            int r0 = r0.length     // Catch:{ 23c -> 0x0394 }
            byte[] r0 = new byte[r0]     // Catch:{ 23c -> 0x0394 }
            r9.A03 = r0     // Catch:{ 23c -> 0x0394 }
            r13.get(r0)     // Catch:{ 23c -> 0x0394 }
            r12 = 2
            if (r8 != 0) goto L_0x0162
            r11 = 2
            goto L_0x016b
        L_0x0162:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ 23c -> 0x0394 }
            r13.order(r0)     // Catch:{ 23c -> 0x0394 }
            int r11 = r13.getInt()     // Catch:{ 23c -> 0x0394 }
        L_0x016b:
            java.nio.ByteOrder r10 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ 23c -> 0x0394 }
            r13.order(r10)     // Catch:{ 23c -> 0x0394 }
            int r0 = r13.getInt()     // Catch:{ 23c -> 0x0394 }
            r9.A01 = r0     // Catch:{ 23c -> 0x0394 }
            r13.order(r10)     // Catch:{ 23c -> 0x0394 }
            int r0 = r13.getInt()     // Catch:{ 23c -> 0x0394 }
            r9.A00 = r0     // Catch:{ 23c -> 0x0394 }
            r13.order(r10)     // Catch:{ 23c -> 0x0394 }
            int r0 = r13.getInt()     // Catch:{ 23c -> 0x0394 }
            r7.A01 = r0     // Catch:{ 23c -> 0x0394 }
            r3 = 0
            if (r0 < r11) goto L_0x018d
            r7.A01 = r3     // Catch:{ 23c -> 0x0394 }
        L_0x018d:
            if (r8 < r12) goto L_0x01b1
            r13.order(r10)     // Catch:{ 23c -> 0x0394 }
            int r0 = r13.getInt()     // Catch:{ 23c -> 0x0394 }
            r7.A00 = r0     // Catch:{ 23c -> 0x0394 }
            byte r0 = r13.get()     // Catch:{ 23c -> 0x0394 }
            boolean r0 = X.AnonymousClass001.A1T(r0)
            r7.A04 = r0     // Catch:{ 23c -> 0x0394 }
            long r0 = X.C59782xT.A00(r13)     // Catch:{ 23c -> 0x0394 }
            r7.A03 = r0     // Catch:{ 23c -> 0x0394 }
            r13.order(r10)     // Catch:{ 23c -> 0x0394 }
            int r0 = r13.getInt()     // Catch:{ 23c -> 0x0394 }
            r7.A02 = r0     // Catch:{ 23c -> 0x0394 }
        L_0x01b1:
            if (r3 >= r11) goto L_0x0208
            if (r3 >= r4) goto L_0x01e5
            r2 = r15[r3]     // Catch:{ 23c -> 0x0394 }
            r13.order(r10)     // Catch:{ 23c -> 0x0394 }
            int r0 = r13.getInt()     // Catch:{ 23c -> 0x0394 }
            r2.A01 = r0     // Catch:{ 23c -> 0x0394 }
            long r16 = X.C59782xT.A00(r13)     // Catch:{ 23c -> 0x0394 }
            r0 = r16
            r2.A04 = r0     // Catch:{ 23c -> 0x0394 }
            if (r8 < r12) goto L_0x01dc
            r13.order(r10)     // Catch:{ 23c -> 0x0394 }
            int r0 = r13.getInt()     // Catch:{ 23c -> 0x0394 }
            r2.A02 = r0     // Catch:{ 23c -> 0x0394 }
            r13.order(r10)     // Catch:{ 23c -> 0x0394 }
            int r0 = r13.getInt()     // Catch:{ 23c -> 0x0394 }
            r2.A00 = r0     // Catch:{ 23c -> 0x0394 }
        L_0x01dc:
            long r16 = X.C59782xT.A00(r13)     // Catch:{ 23c -> 0x0394 }
            r0 = r16
            r2.A03 = r0     // Catch:{ 23c -> 0x0394 }
            goto L_0x0205
        L_0x01e5:
            r13.order(r10)     // Catch:{ 23c -> 0x0394 }
            r13.getInt()     // Catch:{ 23c -> 0x0394 }
            r13.order(r10)     // Catch:{ 23c -> 0x0394 }
            r13.getInt()     // Catch:{ 23c -> 0x0394 }
            if (r8 < r12) goto L_0x01ff
            r13.order(r10)     // Catch:{ 23c -> 0x0394 }
            r13.getInt()     // Catch:{ 23c -> 0x0394 }
            r13.order(r10)     // Catch:{ 23c -> 0x0394 }
            r13.getInt()     // Catch:{ 23c -> 0x0394 }
        L_0x01ff:
            r13.order(r10)     // Catch:{ 23c -> 0x0394 }
            r13.getInt()     // Catch:{ 23c -> 0x0394 }
        L_0x0205:
            int r3 = r3 + 1
            goto L_0x01b1
        L_0x0208:
            long r0 = X.C59782xT.A00(r13)     // Catch:{ 23c -> 0x0394 }
            r9.A02 = r0     // Catch:{ 23c -> 0x0394 }
            int r3 = r18 + -4
            r2 = 0
            int r0 = r19.position()     // Catch:{ 23c -> 0x0394 }
            if (r3 > r0) goto L_0x038d
            java.util.zip.Adler32 r1 = new java.util.zip.Adler32     // Catch:{ 23c -> 0x0394 }
            r1.<init>()     // Catch:{ 23c -> 0x0394 }
            byte[] r0 = r19.array()     // Catch:{ 23c -> 0x0394 }
            r1.update(r0, r2, r3)     // Catch:{ 23c -> 0x0394 }
            long r10 = r1.getValue()     // Catch:{ 23c -> 0x0394 }
            long r0 = r9.A02     // Catch:{ 23c -> 0x0394 }
            int r3 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x0344
            byte[] r1 = r9.A03     // Catch:{ 23c -> 0x0339 }
            byte[] r0 = X.C57842uI.A00(r8)     // Catch:{ 23c -> 0x0339 }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ 23c -> 0x0339 }
            if (r0 == 0) goto L_0x0329
            int r11 = r9.A01     // Catch:{ 23c -> 0x0339 }
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r11 != r0) goto L_0x0321
            int r10 = r9.A00     // Catch:{ 23c -> 0x0339 }
            int r1 = r9.A04     // Catch:{ 23c -> 0x0339 }
            if (r1 == 0) goto L_0x0252
            r0 = 1
            if (r1 != r0) goto L_0x024b
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0254
        L_0x024b:
            boolean r0 = r9.A0A     // Catch:{ 23c -> 0x0339 }
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r0 == 0) goto L_0x0254
        L_0x0252:
            r1 = 65536(0x10000, float:9.18355E-41)
        L_0x0254:
            if (r10 != r1) goto L_0x0319
            int r1 = r7.A01     // Catch:{ 23c -> 0x0339 }
            if (r1 < 0) goto L_0x0311
            int r0 = r9.A05     // Catch:{ 23c -> 0x0339 }
            if (r1 >= r0) goto L_0x0311
            r3 = 0
        L_0x025f:
            if (r3 >= r4) goto L_0x026a
            r0 = r15[r3]     // Catch:{ 23c -> 0x0339 }
            int r0 = r0.A01     // Catch:{ 23c -> 0x0339 }
            if (r0 > r10) goto L_0x0331
            int r3 = r3 + 1
            goto L_0x025f
        L_0x026a:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 23c -> 0x0394 }
            java.lang.String r0 = "wambuffer/header/init: header="
            r3.append(r0)     // Catch:{ 23c -> 0x0394 }
            r3.append(r8)     // Catch:{ 23c -> 0x0394 }
            java.lang.String r0 = " bufferCount="
            r3.append(r0)     // Catch:{ 23c -> 0x0394 }
            r3.append(r14)     // Catch:{ 23c -> 0x0394 }
            java.lang.String r0 = " maxMetadataSize="
            r3.append(r0)     // Catch:{ 23c -> 0x0394 }
            r3.append(r11)     // Catch:{ 23c -> 0x0394 }
            java.lang.String r0 = " maxEventBufferSize="
            r3.append(r0)     // Catch:{ 23c -> 0x0394 }
            r3.append(r10)     // Catch:{ 23c -> 0x0394 }
            java.lang.String r0 = " currentEventBufferIndex="
            r3.append(r0)     // Catch:{ 23c -> 0x0394 }
            r3.append(r1)     // Catch:{ 23c -> 0x0394 }
            r3.append(r0)     // Catch:{ 23c -> 0x0394 }
            r3.append(r1)     // Catch:{ 23c -> 0x0394 }
            java.lang.String r0 = " currentBufferSequenceNumber="
            r3.append(r0)     // Catch:{ 23c -> 0x0394 }
            int r0 = r7.A00     // Catch:{ 23c -> 0x0394 }
            r3.append(r0)     // Catch:{ 23c -> 0x0394 }
            java.lang.String r0 = " isEventBeaconingEnabled="
            r3.append(r0)     // Catch:{ 23c -> 0x0394 }
            boolean r0 = r7.A04     // Catch:{ 23c -> 0x0394 }
            r3.append(r0)     // Catch:{ 23c -> 0x0394 }
            java.lang.String r0 = " dayOfLastBeaconingDecision="
            r3.append(r0)     // Catch:{ 23c -> 0x0394 }
            long r0 = r7.A03     // Catch:{ 23c -> 0x0394 }
            r3.append(r0)     // Catch:{ 23c -> 0x0394 }
            java.lang.String r0 = " currentEventSequenceNumber="
            r3.append(r0)     // Catch:{ 23c -> 0x0394 }
            int r0 = r7.A02     // Catch:{ 23c -> 0x0394 }
            X.C18260x0.A1G(r3, r0)     // Catch:{ 23c -> 0x0394 }
        L_0x02c5:
            if (r2 >= r4) goto L_0x030b
            r7 = r15[r2]     // Catch:{ 23c -> 0x0394 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 23c -> 0x0394 }
            java.lang.String r0 = "wambuffer/header/init/eventBufferMetadata/"
            r3.append(r0)     // Catch:{ 23c -> 0x0394 }
            r3.append(r2)     // Catch:{ 23c -> 0x0394 }
            java.lang.String r0 = ": size="
            r3.append(r0)     // Catch:{ 23c -> 0x0394 }
            int r0 = r7.A01     // Catch:{ 23c -> 0x0394 }
            r3.append(r0)     // Catch:{ 23c -> 0x0394 }
            java.lang.String r0 = " timestamp="
            r3.append(r0)     // Catch:{ 23c -> 0x0394 }
            long r0 = r7.A04     // Catch:{ 23c -> 0x0394 }
            r3.append(r0)     // Catch:{ 23c -> 0x0394 }
            java.lang.String r0 = " streamId="
            r3.append(r0)     // Catch:{ 23c -> 0x0394 }
            int r0 = r7.A02     // Catch:{ 23c -> 0x0394 }
            r3.append(r0)     // Catch:{ 23c -> 0x0394 }
            java.lang.String r0 = " bufferSequenceNumber="
            r3.append(r0)     // Catch:{ 23c -> 0x0394 }
            int r0 = r7.A00     // Catch:{ 23c -> 0x0394 }
            r3.append(r0)     // Catch:{ 23c -> 0x0394 }
            java.lang.String r0 = " checksum="
            r3.append(r0)     // Catch:{ 23c -> 0x0394 }
            long r0 = r7.A03     // Catch:{ 23c -> 0x0394 }
            X.C18260x0.A1I(r3, r0)     // Catch:{ 23c -> 0x0394 }
            int r2 = r2 + 1
            goto L_0x02c5
        L_0x030b:
            X.2ru r0 = r6.A04     // Catch:{ 23d -> 0x039f }
            r0.A02()     // Catch:{ 23d -> 0x039f }
            return
        L_0x0311:
            java.lang.String r0 = "Invalid current event buffer"
            X.23c r1 = new X.23c     // Catch:{ 23c -> 0x0339 }
            r1.<init>(r0)     // Catch:{ 23c -> 0x0339 }
            goto L_0x0338
        L_0x0319:
            java.lang.String r0 = "Invalid max event buffer size"
            X.23c r1 = new X.23c     // Catch:{ 23c -> 0x0339 }
            r1.<init>(r0)     // Catch:{ 23c -> 0x0339 }
            goto L_0x0338
        L_0x0321:
            java.lang.String r0 = "Invalid max metadata size"
            X.23c r1 = new X.23c     // Catch:{ 23c -> 0x0339 }
            r1.<init>(r0)     // Catch:{ 23c -> 0x0339 }
            goto L_0x0338
        L_0x0329:
            java.lang.String r0 = "Invalid WAM file magic or version"
            X.23c r1 = new X.23c     // Catch:{ 23c -> 0x0339 }
            r1.<init>(r0)     // Catch:{ 23c -> 0x0339 }
            goto L_0x0338
        L_0x0331:
            java.lang.String r0 = "Invalid event buffer size"
            X.23c r1 = new X.23c     // Catch:{ 23c -> 0x0339 }
            r1.<init>(r0)     // Catch:{ 23c -> 0x0339 }
        L_0x0338:
            throw r1     // Catch:{ 23c -> 0x0339 }
        L_0x0339:
            r2 = move-exception
            X.1bX r1 = r9.A09     // Catch:{ 23c -> 0x0394 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ 23c -> 0x0394 }
            r1.A03 = r0     // Catch:{ 23c -> 0x0394 }
            r1.A05()     // Catch:{ 23c -> 0x0394 }
            throw r2     // Catch:{ 23c -> 0x0394 }
        L_0x0344:
            X.1bX r1 = r9.A09     // Catch:{ 23c -> 0x0394 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ 23c -> 0x0394 }
            r1.A05 = r0     // Catch:{ 23c -> 0x0394 }
            r1.A05()     // Catch:{ 23c -> 0x0394 }
            java.lang.String r0 = "Invalid checksum"
            X.23c r1 = new X.23c     // Catch:{ 23c -> 0x0394 }
            r1.<init>(r0)     // Catch:{ 23c -> 0x0394 }
            goto L_0x0393
        L_0x0355:
            r0 = move-exception
            java.lang.String r0 = r0.toString()     // Catch:{ 23c -> 0x0394 }
            X.23c r1 = new X.23c     // Catch:{ 23c -> 0x0394 }
            r1.<init>(r0)     // Catch:{ 23c -> 0x0394 }
            goto L_0x0393
        L_0x0360:
            java.lang.String r0 = "Event buffer downgrade not allowed"
            X.23c r1 = new X.23c     // Catch:{ 23c -> 0x0394 }
            r1.<init>(r0)     // Catch:{ 23c -> 0x0394 }
            goto L_0x0393
        L_0x0368:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0377 }
            java.lang.String r0 = "Invalid value: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r3, r0, r1)     // Catch:{ Exception -> 0x0377 }
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)     // Catch:{ Exception -> 0x0377 }
            throw r0     // Catch:{ Exception -> 0x0377 }
        L_0x0377:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ 23c -> 0x0394 }
            X.23c r1 = new X.23c     // Catch:{ 23c -> 0x0394 }
            r1.<init>(r0)     // Catch:{ 23c -> 0x0394 }
            goto L_0x0393
        L_0x0382:
            r0 = move-exception
            java.lang.String r0 = r0.toString()     // Catch:{ 23c -> 0x0394 }
            X.23c r1 = new X.23c     // Catch:{ 23c -> 0x0394 }
            r1.<init>(r0)     // Catch:{ 23c -> 0x0394 }
            goto L_0x0393
        L_0x038d:
            java.lang.String r0 = "Given range contains invalid bytes"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A0c(r0)     // Catch:{ 23c -> 0x0394 }
        L_0x0393:
            throw r1     // Catch:{ 23c -> 0x0394 }
        L_0x0394:
            r0 = move-exception
            java.lang.String r1 = r0.toString()     // Catch:{ 23d -> 0x039f }
            X.23d r0 = new X.23d     // Catch:{ 23d -> 0x039f }
            r0.<init>(r1)     // Catch:{ 23d -> 0x039f }
            throw r0     // Catch:{ 23d -> 0x039f }
        L_0x039f:
            r4 = move-exception
            int r1 = r6.A02     // Catch:{ 23d -> 0x04b5 }
            if (r1 == 0) goto L_0x03e1
            r0 = 1
            if (r1 == r0) goto L_0x03c4
            X.1bX r7 = r6.A07     // Catch:{ 23d -> 0x04b5 }
            java.lang.Long r1 = r7.A0K     // Catch:{ 23d -> 0x04b5 }
            monitor-enter(r7)     // Catch:{ 23d -> 0x04b5 }
            if (r1 == 0) goto L_0x03fd
            java.lang.Long r0 = r7.A0O     // Catch:{ all -> 0x04b2 }
            if (r0 != 0) goto L_0x03b5
            r2 = 0
            goto L_0x03b9
        L_0x03b5:
            long r2 = r0.longValue()     // Catch:{ all -> 0x04b2 }
        L_0x03b9:
            long r0 = r1.longValue()     // Catch:{ all -> 0x04b2 }
            java.lang.Long r0 = X.AnonymousClass0x9.A0n(r2, r0)     // Catch:{ all -> 0x04b2 }
            r7.A0O = r0     // Catch:{ all -> 0x04b2 }
            goto L_0x03fd
        L_0x03c4:
            X.1bX r7 = r6.A07     // Catch:{ 23d -> 0x04b5 }
            java.lang.Long r1 = r7.A0L     // Catch:{ 23d -> 0x04b5 }
            monitor-enter(r7)     // Catch:{ 23d -> 0x04b5 }
            if (r1 == 0) goto L_0x03fd
            java.lang.Long r0 = r7.A0Q     // Catch:{ all -> 0x04b2 }
            if (r0 != 0) goto L_0x03d2
            r2 = 0
            goto L_0x03d6
        L_0x03d2:
            long r2 = r0.longValue()     // Catch:{ all -> 0x04b2 }
        L_0x03d6:
            long r0 = r1.longValue()     // Catch:{ all -> 0x04b2 }
            java.lang.Long r0 = X.AnonymousClass0x9.A0n(r2, r0)     // Catch:{ all -> 0x04b2 }
            r7.A0Q = r0     // Catch:{ all -> 0x04b2 }
            goto L_0x03fd
        L_0x03e1:
            X.1bX r7 = r6.A07     // Catch:{ 23d -> 0x04b5 }
            java.lang.Long r1 = r7.A0J     // Catch:{ 23d -> 0x04b5 }
            monitor-enter(r7)     // Catch:{ 23d -> 0x04b5 }
            if (r1 == 0) goto L_0x03fd
            java.lang.Long r0 = r7.A0M     // Catch:{ all -> 0x04b2 }
            if (r0 != 0) goto L_0x03ef
            r2 = 0
            goto L_0x03f3
        L_0x03ef:
            long r2 = r0.longValue()     // Catch:{ all -> 0x04b2 }
        L_0x03f3:
            long r0 = r1.longValue()     // Catch:{ all -> 0x04b2 }
            java.lang.Long r0 = X.AnonymousClass0x9.A0n(r2, r0)     // Catch:{ all -> 0x04b2 }
            r7.A0M = r0     // Catch:{ all -> 0x04b2 }
        L_0x03fd:
            monitor-exit(r7)     // Catch:{ 23d -> 0x04b5 }
            r7.A05()     // Catch:{ 23d -> 0x04b5 }
            X.2ru r0 = r6.A04     // Catch:{ 23d -> 0x04b5 }
            r0.A03()     // Catch:{ 23d -> 0x04b5 }
            X.2SH r3 = r6.A06     // Catch:{ 23d -> 0x04b5 }
            r0 = 0
            r3.A01 = r0     // Catch:{ 23d -> 0x04b5 }
            r3.A00 = r0     // Catch:{ 23d -> 0x04b5 }
            r3.A04 = r0     // Catch:{ 23d -> 0x04b5 }
            r1 = 0
            r3.A03 = r1     // Catch:{ 23d -> 0x04b5 }
            r3.A02 = r0     // Catch:{ 23d -> 0x04b5 }
            X.2ru r7 = r6.A04     // Catch:{ 23d -> 0x04b5 }
            X.2rT r0 = r7.A00     // Catch:{ 23d -> 0x04b5 }
            if (r0 == 0) goto L_0x0426
            r0.A01()     // Catch:{ 23d -> 0x04b5 }
            long[] r3 = r7.A07     // Catch:{ 23d -> 0x04b5 }
            X.2SH r0 = r7.A04     // Catch:{ 23d -> 0x04b5 }
            int r0 = r0.A01     // Catch:{ 23d -> 0x04b5 }
            r3[r0] = r1     // Catch:{ 23d -> 0x04b5 }
        L_0x0426:
            X.2xT r3 = r6.A05     // Catch:{ 23d -> 0x04b5 }
            int r0 = r3.A06     // Catch:{ 23d -> 0x04b5 }
            byte[] r0 = X.C57842uI.A00(r0)     // Catch:{ 23d -> 0x04b5 }
            r3.A03 = r0     // Catch:{ 23d -> 0x04b5 }
            r0 = 65536(0x10000, float:9.18355E-41)
            r3.A01 = r0     // Catch:{ 23d -> 0x04b5 }
            r0 = 0
            r3.A02 = r0     // Catch:{ 23d -> 0x04b5 }
            X.30f r2 = r3.A07     // Catch:{ 23d -> 0x04b5 }
            java.nio.ByteBuffer r0 = r2.A05     // Catch:{ 23d -> 0x04b5 }
            r0.clear()     // Catch:{ 23d -> 0x04b5 }
            r1 = 0
            r2.A01 = r1     // Catch:{ 23d -> 0x04b5 }
            java.util.zip.Checksum r0 = r2.A06     // Catch:{ 23d -> 0x04b5 }
            r0.reset()     // Catch:{ 23d -> 0x04b5 }
            r2.A00 = r1     // Catch:{ 23d -> 0x04b5 }
            int r1 = r3.A04     // Catch:{ 23d -> 0x04b5 }
            if (r1 == 0) goto L_0x045a
            r0 = 1
            if (r1 != r0) goto L_0x0453
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0469
        L_0x0453:
            boolean r0 = r3.A0A     // Catch:{ 23d -> 0x04b5 }
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r0 == 0) goto L_0x0469
        L_0x045a:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0469
        L_0x045d:
            r9.A03()     // Catch:{ 23d -> 0x04b5 }
            java.lang.String r0 = "wambuffer/wambuffer: no WAM file found; creating a new one"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 23d -> 0x04b5 }
            if (r5 != 0) goto L_0x0486
            return
        L_0x0469:
            r3.A00 = r1     // Catch:{ 23d -> 0x04b5 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 23d -> 0x04b5 }
            java.lang.String r0 = "wambuffer/wambuffer: error while opening WAM file ("
            r1.append(r0)     // Catch:{ 23d -> 0x04b5 }
            r1.append(r4)     // Catch:{ 23d -> 0x04b5 }
            java.lang.String r0 = ")"
            X.C18260x0.A1K(r1, r0)     // Catch:{ 23d -> 0x04b5 }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ 23d -> 0x04b5 }
            r0 = r21
            r0.A0C = r1     // Catch:{ 23d -> 0x04b5 }
            r21.A05()     // Catch:{ 23d -> 0x04b5 }
        L_0x0486:
            r0 = r20
            r6.A05(r5, r0)     // Catch:{ 23d -> 0x04b5 }
            X.2xT r2 = r6.A05     // Catch:{ IOException -> 0x04a7 }
            int r1 = r2.A06     // Catch:{ IOException -> 0x04a7 }
            if (r1 != 0) goto L_0x0493
            r0 = 2
            goto L_0x0498
        L_0x0493:
            X.2SH r0 = r2.A08     // Catch:{ IOException -> 0x04a7 }
            X.2SG[] r0 = r0.A05     // Catch:{ IOException -> 0x04a7 }
            int r0 = r0.length     // Catch:{ IOException -> 0x04a7 }
        L_0x0498:
            r2.A01(r1, r0)     // Catch:{ IOException -> 0x04a7 }
            X.30f r0 = r2.A07     // Catch:{ IOException -> 0x04a7 }
            r0.A01()     // Catch:{ IOException -> 0x04a7 }
            java.lang.String r0 = "wambuffer/initnewfile: successfully created new WAM file"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 23d -> 0x04b5 }
            return
        L_0x04a7:
            r0 = move-exception
            java.lang.String r0 = r0.toString()     // Catch:{ 23d -> 0x04b5 }
            X.23d r1 = new X.23d     // Catch:{ 23d -> 0x04b5 }
            r1.<init>(r0)     // Catch:{ 23d -> 0x04b5 }
            goto L_0x04b4
        L_0x04b2:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ 23d -> 0x04b5 }
        L_0x04b4:
            throw r1     // Catch:{ 23d -> 0x04b5 }
        L_0x04b5:
            r1 = move-exception
            java.lang.String r0 = "wambuffer/wambuffer: failed to initialize with new file"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "wambuffer: PERSISTENCE TURNED OFF"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            r6.A01 = r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0 = r21
            r0.A08 = r1
            r21.A05()
            java.io.RandomAccessFile r0 = r6.A09
            if (r0 == 0) goto L_0x04e6
            r0.close()     // Catch:{ IOException -> 0x04d6 }
            goto L_0x04e6
        L_0x04d6:
            r2 = move-exception
            X.1bX r1 = r6.A07
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A07 = r0
            r1.A05()
            java.lang.String r0 = "wambuffer/closefile: cannot close WAM file"
            com.whatsapp.util.Log.e(r0, r2)
        L_0x04e6:
            java.io.File r0 = r6.A08
            boolean r0 = r0.delete()
            if (r0 == 0) goto L_0x04f5
            java.lang.String r0 = "wambuffer/removefile: successfully removed WAM file"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x04f5:
            X.1bX r1 = r6.A07
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A0F = r0
            r1.A05()
            java.lang.String r0 = "wambuffer/removefile: cannot remove WAM file"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56172rX.<init>(X.25j, X.33p, X.1VX, X.2rP, X.1bX, java.io.File, int, int, int, boolean):void");
    }
}
