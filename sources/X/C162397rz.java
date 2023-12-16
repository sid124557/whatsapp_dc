package X;

import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.7rz  reason: invalid class name and case insensitive filesystem */
public class C162397rz {
    public static final C138076pj A01 = new C138076pj(0, 0, true);
    public static final C138076pj A02 = new C138076pj(0, 7, true);
    public static final C160287nN A03 = new C160287nN(0, 0, 0, true);
    public static final C160287nN A04 = new C160287nN(0, 5, 7, true);
    public static final byte[] A05 = {35, 33, 65, 77, 82, 10};
    public static final byte[] A06 = {35, 33, 65, 77, 82, 45, 87, 66, 10};
    public static final byte[] A07 = {79, 103, 103, 83};
    public static final byte[] A08 = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] A09 = {82, 73, 70, 70};
    public static final byte[] A0A = {100, 97, 116, 97};
    public static final byte[] A0B = {102, 109, 116, 32};
    public static final byte[] A0C = {73, 68, 51};
    public static final byte[] A0D = {102, 116, 121, 112};
    public static final byte[] A0E = {51, 103};
    public static final byte[] A0F = {113, 116, 32, 32};
    public static final byte[] A0G = {87, 65, 86, 69};
    public static final int[] A0H = {1633973356, 1668637984, 1684108385, 1717658484, 1718449184, 1768846196, 1818321516, 1819572340, 1852798053, 1886155636, 1936552044};
    public final C55682qk A00;

    public static int A01(AnonymousClass7LP r11, InputStream inputStream) {
        try {
            int i = (int) (r11.A01 - r11.A02);
            byte[] bArr = new byte[i];
            if (A02(inputStream, bArr, 0, i) != i) {
                return 7;
            }
            byte b = bArr[4];
            if (b != 3) {
                C18260x0.A0y("Did not find esds description tag - found: ", AnonymousClass001.A0o(), b);
                return 7;
            }
            int[] A0E2 = A0E(bArr, 4, i);
            if (A0E2 == null) {
                Log.i("Did not find esds description details");
                return 7;
            }
            int i2 = A0E2[0] + 3;
            byte b2 = bArr[i2];
            int i3 = 1;
            int i4 = i2 + 1;
            if ((b2 & 128) == 128) {
                i4 += 2;
            }
            if ((b2 & 64) == 64) {
                i4 += bArr[i4] + 1;
            }
            if ((b2 & 32) == 32) {
                i4 += 2;
            }
            byte b3 = bArr[i4];
            if (b3 != 4) {
                C18260x0.A0y("Did not find esds config description tag - found: ", AnonymousClass001.A0o(), b3);
                return 7;
            }
            int[] A0E3 = A0E(bArr, i4, i);
            if (A0E3 == null) {
                Log.i("Did not find esds config details");
                return 7;
            }
            int i5 = A0E3[0];
            byte b4 = bArr[i5 + 1];
            if (b4 != 64) {
                if (b4 != 107) {
                    switch (b4) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        case 105:
                            break;
                        default:
                            C18260x0.A0y("Did not find esds supported type - found: ", AnonymousClass001.A0o(), b4);
                            return 7;
                    }
                }
                i3 = 2;
            }
            byte b5 = bArr[i5 + 2];
            if (((b5 & 252) >> 2) == 5) {
                return i3;
            }
            C18260x0.A0y("Did not find stream type - found: ", AnonymousClass001.A0o(), b5);
            return 7;
        } catch (Exception e) {
            Log.i("Exception processing esds box: ", e);
            return 7;
        }
    }

    public static int A02(InputStream inputStream, byte[] bArr, int i, int i2) {
        int A0A2 = AnonymousClass6C9.A0A(bArr.length, i, i2);
        int i3 = 0;
        while (i3 < A0A2) {
            int read = inputStream.read(bArr, i + i3, A0A2 - i3);
            if (read == -1) {
                break;
            }
            i3 += read;
        }
        return i3;
    }

    public static boolean A0C(byte[] bArr, byte[] bArr2, int i) {
        int length = bArr.length - i;
        int length2 = bArr2.length;
        if (length >= length2) {
            int i2 = 0;
            while (i2 < length2) {
                if (bArr[i + i2] == bArr2[i2]) {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    public static int[] A0D(InputStream inputStream) {
        int[] iArr;
        int i;
        byte[] bArr = new byte[2];
        if (A02(inputStream, bArr, 0, 2) == 2) {
            int A0C2 = AnonymousClass6CA.A0C(bArr, 1, AnonymousClass6C9.A0F(bArr, 0));
            C18260x0.A0y("mp4a box version: ", AnonymousClass001.A0o(), A0C2);
            if (A0C2 == 0) {
                iArr = new int[2];
                iArr[0] = 0;
                i = 18;
            } else if (A0C2 == 1) {
                iArr = new int[2];
                iArr[0] = 1;
                i = 34;
            } else if (A0C2 == 2) {
                iArr = new int[2];
                iArr[0] = 2;
                i = 54;
            } else {
                throw AnonymousClass002.A0C("Unexpected result getting mp4a version");
            }
            iArr[1] = i;
            return iArr;
        }
        throw AnonymousClass002.A0C("Unexpected eof getting mp4a version");
    }

    public static int A03(byte[] bArr, int i, int i2, int i3, int i4) {
        return A00(bArr[i], bArr[i2], bArr[i3], bArr[i4]);
    }

    public static long A04(AnonymousClass7LP r2, long j) {
        return (j + r2.A01) - r2.A02;
    }

    public static C138076pj A05(C55682qk r25, File file) {
        C138076pj r3;
        int i;
        String str;
        int i2;
        String str2;
        StringBuilder A0o;
        String str3;
        String str4;
        int i3;
        String str5;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(C107655bf.A0T(r25, file));
        try {
            byte[] bArr = new byte[36];
            boolean z = false;
            int A022 = A02(bufferedInputStream, bArr, 0, 8);
            if (A022 >= 8) {
                if (A0C(bArr, A0D, 4)) {
                    Log.d("audio found MP4 type file");
                    if (A022 + A02(bufferedInputStream, bArr, 8, 4) >= 12) {
                        AnonymousClass7LP A072 = A07(bufferedInputStream, new int[]{1836019574}, (long) (A03(bArr, 0, 1, 2, 3) - 12), -1);
                        if (A072 == null) {
                            str5 = "moov box not found";
                        } else {
                            long j = A072.A01;
                            long j2 = A072.A02;
                            C140716uM r1 = new C140716uM(bufferedInputStream, j2);
                            long j3 = (j - j2) + r1.A00;
                            i3 = 0;
                            loop0:
                            while (true) {
                                long j4 = r1.A00;
                                if (j4 < j3) {
                                    AnonymousClass7LP A073 = A07(r1, new int[]{1953653099}, 0, j3 - j4);
                                    if (A073 != null) {
                                        long A042 = A04(A073, r1.A00);
                                        while (true) {
                                            long j5 = r1.A00;
                                            if (j5 >= A042) {
                                                continue;
                                                break;
                                            }
                                            C140716uM r17 = r1;
                                            AnonymousClass7LP A074 = A07(r17, new int[]{1835297121}, 0, A042 - j5);
                                            if (A074 == null) {
                                                str5 = "mdia box not found";
                                                break loop0;
                                            }
                                            long j6 = r1.A00;
                                            long A043 = A04(A074, j6);
                                            AnonymousClass7LP A075 = A07(r17, new int[]{1751411826}, 0, A043 - j6);
                                            if (A075 == null) {
                                                str5 = "hdlr box not found";
                                                break loop0;
                                            }
                                            long j7 = A075.A02;
                                            long j8 = (r1.A00 + A075.A01) - j7;
                                            A0B(r1, 16 - j7);
                                            byte[] bArr2 = new byte[4];
                                            if (A02(r1, bArr2, 0, 4) != 4) {
                                                str5 = "hdlr box too short";
                                                break loop0;
                                            }
                                            int A032 = A03(bArr2, 0, 1, 2, 3);
                                            if (A032 == 1986618469) {
                                                str5 = "video hdlr type not valid";
                                                break loop0;
                                            }
                                            if (A032 != 1936684398) {
                                                StringBuilder A0o2 = AnonymousClass001.A0o();
                                                C18260x0.A1L(A0o2, A09("non sound hdlr type found ", A0o2, A032));
                                            } else if (i3 != 0) {
                                                Log.i("multiple hldr sound tracks found");
                                                i3 = 6;
                                                break loop0;
                                            } else {
                                                long j9 = r1.A00;
                                                AnonymousClass7LP A076 = A07(r1, new int[]{1835626086}, j8 - j9, A043 - j9);
                                                if (A076 == null) {
                                                    str5 = "minf box not found";
                                                    break loop0;
                                                }
                                                long j10 = r1.A00;
                                                AnonymousClass7LP A077 = A07(r17, new int[]{1937007212}, 0, A04(A076, j10) - j10);
                                                if (A077 == null) {
                                                    str5 = "stbl box not found";
                                                    break loop0;
                                                }
                                                long j11 = r1.A00;
                                                AnonymousClass7LP A078 = A07(r17, new int[]{1937011556}, 0, A04(A077, j11) - j11);
                                                if (A078 == null) {
                                                    str5 = "stsd box not found";
                                                    break loop0;
                                                }
                                                A0B(r1, 8);
                                                long j12 = r1.A00;
                                                AnonymousClass7LP A079 = A07(r17, new int[]{1836069985, 1935764850, 1935767394}, 0, A04(A078, j12) - j12);
                                                if (A079 == null) {
                                                    str5 = "content box not found";
                                                    break loop0;
                                                }
                                                int i4 = A079.A00;
                                                if (i4 != 1836069985) {
                                                    StringBuilder A0o3 = AnonymousClass001.A0o();
                                                    str5 = AnonymousClass000.A0X(A09("Found media contents that wasn't m4a: ", A0o3, i4), A0o3);
                                                    break loop0;
                                                }
                                                long A044 = A04(A079, r1.A00);
                                                A0B(r1, 8);
                                                AnonymousClass7LP A0710 = A07(r17, new int[]{1702061171}, (long) A0D(r1)[1], A044 - r1.A00);
                                                if (A0710 == null) {
                                                    str5 = "esds box not found";
                                                    break loop0;
                                                }
                                                i3 = A01(A0710, r1);
                                            }
                                            A0B(r1, A042 - r1.A00);
                                        }
                                    }
                                } else {
                                    C18260x0.A0w("audio found: ", AnonymousClass001.A0o(), i3);
                                    if (7 == i3) {
                                    }
                                }
                            }
                            r3 = new C138076pj(2, i3, z);
                            bufferedInputStream.close();
                            return r3;
                        }
                        Log.i(str5);
                        i3 = 7;
                        z = true;
                        r3 = new C138076pj(2, i3, z);
                        bufferedInputStream.close();
                        return r3;
                    }
                } else {
                    if (A0C(bArr, A07, 0)) {
                        Log.d("audio found Ogg type file");
                        int A023 = A022 + A02(bufferedInputStream, bArr, A022, 36 - A022);
                        if (A023 < 27) {
                            str4 = "not opus - too few bytes for first packet";
                        } else {
                            int i5 = (bArr[26] & 255) + 27;
                            byte[] bArr3 = A08;
                            int length = bArr3.length + i5;
                            if (A023 < length) {
                                byte[] bArr4 = new byte[length];
                                System.arraycopy(bArr, 0, bArr4, 0, A023);
                                if (A023 + A02(bufferedInputStream, bArr4, A023, length - A023) < length) {
                                    str4 = "not opus - too few bytes";
                                } else {
                                    bArr = bArr4;
                                }
                            }
                            if (A0C(bArr, bArr3, i5)) {
                                r3 = new C138076pj(4, 5, false);
                            } else {
                                str4 = "not opus - header bytes don't match";
                            }
                        }
                        Log.i(str4);
                        r3 = new C138076pj(4, 7, true);
                    } else {
                        byte[] bArr5 = A09;
                        if (A0C(bArr, bArr5, 0)) {
                            str = "audio found Riff type file";
                        } else {
                            A022 += A02(bufferedInputStream, bArr, A022, 10 - A022);
                            if (A022 >= 10) {
                                if (A022 == 10 && A0C(bArr, A0C, 0)) {
                                    Log.d("audio found ID3");
                                    A0B(bufferedInputStream, (long) (((bArr[8] & Byte.MAX_VALUE) << 7) | ((bArr[6] & Byte.MAX_VALUE) << 21) | ((bArr[7] & Byte.MAX_VALUE) << 14) | (bArr[9] & Byte.MAX_VALUE)));
                                    A022 = A02(bufferedInputStream, bArr, 0, 10);
                                    int i6 = EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                                    boolean z2 = false;
                                    while (A022 > 0 && i6 > 0 && !A0C(bArr, bArr5, 0) && (bArr[0] != -1 || ((byte) (bArr[1] & 224)) != -32)) {
                                        A022--;
                                        System.arraycopy(bArr, 1, bArr, 0, A022);
                                        if (!z2) {
                                            if (bufferedInputStream.read(bArr, A022, 1) == -1) {
                                                bArr[A022] = 0;
                                                i6 = 0;
                                                z2 = true;
                                            } else {
                                                A022++;
                                                i6--;
                                            }
                                        }
                                    }
                                    StringBuilder A0o4 = AnonymousClass001.A0o();
                                    AnonymousClass6C8.A1D("skipped ", A0o4, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, i6);
                                    C18260x0.A1J(A0o4, " after ID3");
                                    if (A022 >= bArr5.length && A0C(bArr, bArr5, 0)) {
                                        str = "audio found Riff after ID3";
                                    } else if (A022 < 10) {
                                    }
                                }
                                if (A022 + A02(bufferedInputStream, bArr, A022, 36 - A022) >= 36) {
                                    if (bArr[0] == -1 && ((byte) (bArr[1] & 224)) == -32) {
                                        Log.d("audio found aac/mp3");
                                        if ((bArr[1] & 6) == 0) {
                                            r3 = new C138076pj(1, 1, false);
                                        } else {
                                            i = 2;
                                        }
                                    } else if (A0C(bArr, A05, 0)) {
                                        i = 3;
                                    } else if (A0C(bArr, A06, 0)) {
                                        i = 4;
                                    } else {
                                        r3 = A02;
                                    }
                                    r3 = new C138076pj(1, i, false);
                                }
                            }
                        }
                        Log.d(str);
                        int i7 = 36;
                        byte[] bArr6 = new byte[36];
                        byte[] bArr7 = new byte[8];
                        System.arraycopy(bArr, 0, bArr6, 0, A022);
                        if (A022 + A02(bufferedInputStream, bArr6, A022, 36 - A022) != 36) {
                            Log.i("Insufficient data for WAV file header");
                            i2 = 0;
                        } else {
                            byte[] bArr8 = A0G;
                            if (!A0C(bArr6, bArr8, 8)) {
                                A0o = AnonymousClass001.A0o();
                                A0o.append("Not WAVE File type ");
                                str3 = new String(bArr6, 8, bArr8.length);
                            } else {
                                byte[] bArr9 = A0B;
                                if (!A0C(bArr6, bArr9, 12)) {
                                    A0o = AnonymousClass001.A0o();
                                    A0o.append("Not WAVE chunk format ");
                                    str3 = new String(bArr6, 12, bArr9.length);
                                } else {
                                    byte b = ((bArr6[21] & 255) << 8) | (bArr6[20] & 255);
                                    if (80 == b || 85 == b || 5632 == b || 5648 == b) {
                                        int A024 = AnonymousClass6C7.A02(bArr6[19], bArr6[18], bArr6[17], bArr6[16]) + 16 + 4;
                                        while (true) {
                                            A0B(bufferedInputStream, (long) (A024 - i7));
                                            int A025 = A02(bufferedInputStream, bArr7, 0, 8);
                                            int i8 = A024 + A025;
                                            if (A025 == 8) {
                                                if (!AnonymousClass367.A05(A0H, A03(bArr7, 0, 1, 2, 3))) {
                                                    A0o = AnonymousClass001.A0o();
                                                    A0o.append("Unsupported WAVE chunk: ");
                                                    str3 = new String(bArr7, 0, 4);
                                                    break;
                                                } else if (A0C(bArr7, A0A, 0)) {
                                                    byte[] bArr10 = new byte[2];
                                                    if (A02(bufferedInputStream, bArr10, 0, 2) != 2) {
                                                        str2 = "EOF reading WAVE data";
                                                    } else if (bArr10[0] == -1 && ((byte) (bArr10[1] & 224)) == -32) {
                                                        Log.d("WAVE audio found aac/mp3");
                                                        i2 = 2;
                                                        if ((bArr10[1] & 6) == 0) {
                                                            i2 = 1;
                                                        }
                                                    } else {
                                                        str2 = "Not ACC/MP3 WAVE data";
                                                    }
                                                } else {
                                                    i7 = i8;
                                                    A024 = A03(bArr7, 7, 6, 5, 4) + i8;
                                                }
                                            } else {
                                                str2 = "EOF reading WAVE chunk";
                                                break;
                                            }
                                        }
                                    } else {
                                        A0o = AnonymousClass001.A0o();
                                        A0o.append("RIFF/WAV container carries stream which is not one of supported MPEG audio streams ");
                                        A0o.append(b);
                                        str2 = A0o.toString();
                                        Log.i(str2);
                                        i2 = 7;
                                        z = true;
                                    }
                                }
                            }
                            A0o.append(str3);
                            str2 = A0o.toString();
                            Log.i(str2);
                            i2 = 7;
                            z = true;
                        }
                        r3 = new C138076pj(5, i2, z);
                    }
                    bufferedInputStream.close();
                    return r3;
                }
            }
            r3 = A01;
        } catch (IOException e) {
            Log.i("Excepton reading next chunk ", e);
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        bufferedInputStream.close();
        return r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0362, code lost:
        r0 = "esds box not found";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03bf, code lost:
        r0 = "multiple hldr audio tracks found - not dolby";
     */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0371 A[Catch:{ all -> 0x03de, all -> 0x03e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0377 A[Catch:{ all -> 0x03de, all -> 0x03e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x021b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x021f A[Catch:{ all -> 0x03de, all -> 0x03e3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C160287nN A06(X.C55682qk r35, java.io.File r36) {
        /*
            r1 = r35
            r0 = r36
            java.io.FileInputStream r1 = X.C107655bf.A0T(r1, r0)
            java.io.BufferedInputStream r22 = new java.io.BufferedInputStream
            r0 = r22
            r0.<init>(r1)
            r3 = 0
            r5 = 12
            byte[] r6 = new byte[r5]     // Catch:{ all -> 0x03de }
            int r0 = A02(r0, r6, r3, r5)     // Catch:{ all -> 0x03de }
            if (r0 >= r5) goto L_0x001e
            X.7nN r9 = A03     // Catch:{ all -> 0x03de }
            goto L_0x03da
        L_0x001e:
            r1 = 4
            byte[] r0 = A0D     // Catch:{ all -> 0x03de }
            boolean r0 = A0C(r6, r0, r1)     // Catch:{ all -> 0x03de }
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = "video found MP4/3GP type file"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x03de }
            byte[] r0 = A0F     // Catch:{ all -> 0x03de }
            r2 = 8
            boolean r0 = A0C(r6, r0, r2)     // Catch:{ all -> 0x03de }
            r23 = 3
            r1 = 2
            if (r0 == 0) goto L_0x003c
            r24 = 7
            goto L_0x004c
        L_0x003c:
            byte[] r0 = A0E     // Catch:{ all -> 0x03de }
            boolean r0 = A0C(r6, r0, r2)     // Catch:{ all -> 0x03de }
            r24 = 2
            if (r0 == 0) goto L_0x004c
            r24 = 3
            goto L_0x004c
        L_0x0049:
            java.lang.String r0 = "video not MP4/3GP type file"
            goto L_0x0071
        L_0x004c:
            byte r4 = r6[r3]     // Catch:{ all -> 0x03de }
            r0 = 1
            byte r2 = r6[r0]     // Catch:{ all -> 0x03de }
            byte r1 = r6[r1]     // Catch:{ all -> 0x03de }
            byte r0 = r6[r23]     // Catch:{ all -> 0x03de }
            int r0 = X.AnonymousClass6C7.A02(r4, r2, r1, r0)     // Catch:{ all -> 0x03de }
            int r0 = r0 - r5
            long r1 = (long) r0     // Catch:{ all -> 0x03de }
            r13 = -1
            r8 = 1
            int[] r4 = new int[r8]     // Catch:{ all -> 0x03de }
            r0 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r4[r3] = r0     // Catch:{ all -> 0x03de }
            r9 = r22
            r10 = r4
            r11 = r1
            X.7LP r1 = A07(r9, r10, r11, r13)     // Catch:{ all -> 0x03de }
            if (r1 != 0) goto L_0x0078
            java.lang.String r0 = "moov box not found"
        L_0x0071:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03de }
            X.7nN r9 = A04     // Catch:{ all -> 0x03de }
            goto L_0x03da
        L_0x0078:
            X.7nN r9 = new X.7nN     // Catch:{ all -> 0x03de }
            r9.<init>()     // Catch:{ all -> 0x03de }
            r0 = r24
            r9.A01 = r0     // Catch:{ all -> 0x03de }
            long r15 = r1.A01     // Catch:{ all -> 0x03de }
            long r1 = r1.A02     // Catch:{ all -> 0x03de }
            long r15 = r15 - r1
            X.6uM r0 = new X.6uM     // Catch:{ all -> 0x03de }
            r4 = r22
            r0.<init>(r4, r1)     // Catch:{ all -> 0x03de }
            long r1 = r0.A00     // Catch:{ all -> 0x03de }
            long r15 = r15 + r1
        L_0x0090:
            long r1 = r0.A00     // Catch:{ all -> 0x03de }
            int r4 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r4 >= 0) goto L_0x03d1
            r27 = 0
            long r29 = r15 - r1
            int[] r2 = new int[r8]     // Catch:{ all -> 0x03de }
            r1 = 1953653099(0x7472616b, float:7.681346E31)
            r2[r3] = r1     // Catch:{ all -> 0x03de }
            r25 = r0
            r26 = r2
            X.7LP r4 = A07(r25, r26, r27, r29)     // Catch:{ all -> 0x03de }
            if (r4 == 0) goto L_0x0090
            long r1 = r0.A00     // Catch:{ all -> 0x03de }
            long r17 = A04(r4, r1)     // Catch:{ all -> 0x03de }
        L_0x00b1:
            long r1 = r0.A00     // Catch:{ all -> 0x03de }
            int r4 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r4 >= 0) goto L_0x0090
            r14 = 2
            int[] r5 = new int[r14]     // Catch:{ all -> 0x03de }
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            r5[r3] = r4     // Catch:{ all -> 0x03de }
            r21 = 1835297121(0x6d646961, float:4.4181236E27)
            r5[r8] = r21     // Catch:{ all -> 0x03de }
            long r29 = r17 - r1
            r26 = r5
            X.7LP r10 = A07(r25, r26, r27, r29)     // Catch:{ all -> 0x03de }
            if (r10 != 0) goto L_0x00d1
            java.lang.String r0 = "tkmd/mdia box not found"
            goto L_0x0071
        L_0x00d1:
            int r1 = r10.A00     // Catch:{ all -> 0x03de }
            if (r1 != r4) goto L_0x0199
            long r4 = r0.A00     // Catch:{ all -> 0x03de }
            long r6 = r10.A01     // Catch:{ all -> 0x03de }
            long r4 = r4 + r6
            long r1 = r10.A02     // Catch:{ all -> 0x03de }
            long r4 = r4 - r1
            r19 = 92
            r12 = 0
            int r10 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r10 < 0) goto L_0x0180
            long r10 = r6 - r1
            int r1 = (int) r10     // Catch:{ all -> 0x03de }
            byte[] r10 = new byte[r1]     // Catch:{ all -> 0x03de }
            int r2 = A02(r0, r10, r3, r1)     // Catch:{ all -> 0x03de }
            if (r2 != r1) goto L_0x03c3
            byte r1 = r10[r3]     // Catch:{ all -> 0x03de }
            if (r1 != 0) goto L_0x00f8
            r13 = 76
            r20 = 40
            goto L_0x0104
        L_0x00f8:
            if (r1 != r8) goto L_0x0180
            r19 = 104(0x68, double:5.14E-322)
            int r1 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r1 < 0) goto L_0x0180
            r13 = 88
            r20 = 52
        L_0x0104:
            byte r7 = r10[r13]     // Catch:{ all -> 0x03de }
            int r1 = r13 + 1
            byte r6 = r10[r1]     // Catch:{ all -> 0x03de }
            int r1 = r13 + 2
            byte r2 = r10[r1]     // Catch:{ all -> 0x03de }
            int r1 = r13 + 3
            byte r1 = r10[r1]     // Catch:{ all -> 0x03de }
            int r11 = X.AnonymousClass6C7.A02(r7, r6, r2, r1)     // Catch:{ all -> 0x03de }
            int r1 = r13 + 4
            byte r7 = r10[r1]     // Catch:{ all -> 0x03de }
            int r1 = r13 + 5
            byte r6 = r10[r1]     // Catch:{ all -> 0x03de }
            int r1 = r13 + 6
            byte r2 = r10[r1]     // Catch:{ all -> 0x03de }
            int r1 = r13 + 7
            byte r1 = r10[r1]     // Catch:{ all -> 0x03de }
            int r2 = X.AnonymousClass6C7.A02(r7, r6, r2, r1)     // Catch:{ all -> 0x03de }
            if (r11 <= 0) goto L_0x013e
            if (r2 <= 0) goto L_0x013e
            int r1 = r9.A03     // Catch:{ all -> 0x03de }
            if (r1 > 0) goto L_0x013e
            int r1 = r9.A04     // Catch:{ all -> 0x03de }
            if (r1 > 0) goto L_0x013e
            int r1 = r2 >>> 16
            r9.A03 = r1     // Catch:{ all -> 0x03de }
            int r1 = r11 >>> 16
            r9.A04 = r1     // Catch:{ all -> 0x03de }
        L_0x013e:
            r13 = 9
            int[] r11 = new int[r13]     // Catch:{ all -> 0x03de }
        L_0x0142:
            int r19 = r12 * 4
            int r19 = r19 + r20
            byte r7 = r10[r19]     // Catch:{ all -> 0x03de }
            int r1 = r19 + 1
            byte r6 = r10[r1]     // Catch:{ all -> 0x03de }
            int r1 = r19 + 2
            byte r2 = r10[r1]     // Catch:{ all -> 0x03de }
            int r1 = r19 + 3
            byte r1 = r10[r1]     // Catch:{ all -> 0x03de }
            int r1 = X.AnonymousClass6C7.A02(r7, r6, r2, r1)     // Catch:{ all -> 0x03de }
            r11[r12] = r1     // Catch:{ all -> 0x03de }
            int r12 = r12 + 1
            if (r12 < r13) goto L_0x0142
            r1 = r11[r3]     // Catch:{ all -> 0x03de }
            r2 = 4
            if (r1 != 0) goto L_0x0180
            r1 = r11[r8]     // Catch:{ all -> 0x03de }
            if (r1 != 0) goto L_0x0180
            r1 = r11[r14]     // Catch:{ all -> 0x03de }
            if (r1 != 0) goto L_0x0180
            r1 = r11[r23]     // Catch:{ all -> 0x03de }
            if (r1 != 0) goto L_0x0180
            r1 = r11[r2]     // Catch:{ all -> 0x03de }
            if (r1 != 0) goto L_0x0180
            r1 = 5
            r1 = r11[r1]     // Catch:{ all -> 0x03de }
            if (r1 != 0) goto L_0x0180
            r1 = 6
            r1 = r11[r1]     // Catch:{ all -> 0x03de }
            if (r1 != 0) goto L_0x0180
            r1 = 7
            r1 = r11[r1]     // Catch:{ all -> 0x03de }
        L_0x0180:
            long r1 = r0.A00     // Catch:{ all -> 0x03de }
            long r4 = r4 - r1
            long r33 = r17 - r1
            int[] r1 = new int[r8]     // Catch:{ all -> 0x03de }
            r1[r3] = r21     // Catch:{ all -> 0x03de }
            r29 = r0
            r30 = r1
            r31 = r4
            X.7LP r10 = A07(r29, r30, r31, r33)     // Catch:{ all -> 0x03de }
            if (r10 != 0) goto L_0x0199
            java.lang.String r0 = "mdia box not found"
            goto L_0x0071
        L_0x0199:
            long r1 = r0.A00     // Catch:{ all -> 0x03de }
            long r31 = A04(r10, r1)     // Catch:{ all -> 0x03de }
            long r29 = r31 - r1
            int[] r1 = new int[r8]     // Catch:{ all -> 0x03de }
            r2 = 1751411826(0x68646c72, float:4.3148E24)
            r1[r3] = r2     // Catch:{ all -> 0x03de }
            r26 = r1
            X.7LP r6 = A07(r25, r26, r27, r29)     // Catch:{ all -> 0x03de }
            if (r6 != 0) goto L_0x01b4
            java.lang.String r0 = "hdlr box not found"
            goto L_0x0071
        L_0x01b4:
            long r4 = r0.A00     // Catch:{ all -> 0x03de }
            long r1 = r6.A01     // Catch:{ all -> 0x03de }
            long r4 = r4 + r1
            long r6 = r6.A02     // Catch:{ all -> 0x03de }
            long r4 = r4 - r6
            r1 = 16
            long r1 = r1 - r6
            A0B(r0, r1)     // Catch:{ all -> 0x03de }
            r6 = 4
            byte[] r2 = new byte[r6]     // Catch:{ all -> 0x03de }
            int r1 = A02(r0, r2, r3, r6)     // Catch:{ all -> 0x03de }
            if (r1 == r6) goto L_0x01cf
            java.lang.String r0 = "hdlr box too short"
            goto L_0x0071
        L_0x01cf:
            r1 = r23
            int r6 = A03(r2, r3, r8, r14, r1)     // Catch:{ all -> 0x03de }
            r1 = 1936684398(0x736f756e, float:1.8971874E31)
            if (r6 == r1) goto L_0x01e9
            r1 = 1986618469(0x76696465, float:1.1834389E33)
            if (r6 == r1) goto L_0x01e1
            goto L_0x03a4
        L_0x01e1:
            int r1 = r9.A02     // Catch:{ all -> 0x03de }
            if (r1 == 0) goto L_0x0202
            java.lang.String r0 = "multiple hldr video tracks found"
            goto L_0x0071
        L_0x01e9:
            r10 = 8
            int r7 = r9.A00     // Catch:{ all -> 0x03de }
            if (r7 == 0) goto L_0x0202
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x03de }
            java.lang.String r1 = "multiple hldr sound tracks found "
            X.C18260x0.A0w(r1, r2, r7)     // Catch:{ all -> 0x03de }
            int r1 = r9.A00     // Catch:{ all -> 0x03de }
            if (r1 == r8) goto L_0x0200
            if (r1 == r10) goto L_0x0200
            goto L_0x03ca
        L_0x0200:
            r13 = 1
            goto L_0x0203
        L_0x0202:
            r13 = 0
        L_0x0203:
            long r1 = r0.A00     // Catch:{ all -> 0x03de }
            long r4 = r4 - r1
            long r31 = r31 - r1
            int[] r2 = new int[r8]     // Catch:{ all -> 0x03de }
            r1 = 1835626086(0x6d696e66, float:4.515217E27)
            r2[r3] = r1     // Catch:{ all -> 0x03de }
            r27 = r0
            r28 = r2
            r29 = r4
            X.7LP r4 = A07(r27, r28, r29, r31)     // Catch:{ all -> 0x03de }
            if (r4 != 0) goto L_0x021f
            java.lang.String r0 = "minf box not found"
            goto L_0x0071
        L_0x021f:
            long r1 = r0.A00     // Catch:{ all -> 0x03de }
            long r29 = A04(r4, r1)     // Catch:{ all -> 0x03de }
            long r29 = r29 - r1
            int[] r2 = new int[r8]     // Catch:{ all -> 0x03de }
            r1 = 1937007212(0x7374626c, float:1.9362132E31)
            r2[r3] = r1     // Catch:{ all -> 0x03de }
            r27 = 0
            r26 = r2
            X.7LP r4 = A07(r25, r26, r27, r29)     // Catch:{ all -> 0x03de }
            if (r4 != 0) goto L_0x023c
            java.lang.String r0 = "stbl box not found"
            goto L_0x0071
        L_0x023c:
            long r1 = r0.A00     // Catch:{ all -> 0x03de }
            long r29 = A04(r4, r1)     // Catch:{ all -> 0x03de }
            long r29 = r29 - r1
            int[] r2 = new int[r8]     // Catch:{ all -> 0x03de }
            r1 = 1937011556(0x73747364, float:1.9367383E31)
            r2[r3] = r1     // Catch:{ all -> 0x03de }
            r26 = r2
            X.7LP r4 = A07(r25, r26, r27, r29)     // Catch:{ all -> 0x03de }
            if (r4 != 0) goto L_0x0257
            java.lang.String r0 = "stsd box not found"
            goto L_0x0071
        L_0x0257:
            r1 = 8
            A0B(r0, r1)     // Catch:{ all -> 0x03de }
            long r1 = r0.A00     // Catch:{ all -> 0x03de }
            long r29 = A04(r4, r1)     // Catch:{ all -> 0x03de }
            r4 = 1986618469(0x76696465, float:1.1834389E33)
            if (r6 != r4) goto L_0x02a2
            r10 = 4
            int[] r7 = new int[r10]     // Catch:{ all -> 0x03de }
            r6 = 1635148593(0x61766331, float:2.840654E20)
            r7[r3] = r6     // Catch:{ all -> 0x03de }
            r5 = 1836070006(0x6d703476, float:4.646239E27)
            r7[r8] = r5     // Catch:{ all -> 0x03de }
            r8 = 1932670515(0x73323633, float:1.4119387E31)
            r7[r14] = r8     // Catch:{ all -> 0x03de }
            r4 = 1752589105(0x68766331, float:4.6541277E24)
            r7[r23] = r4     // Catch:{ all -> 0x03de }
            long r29 = r29 - r1
            r26 = r7
            X.7LP r1 = A07(r25, r26, r27, r29)     // Catch:{ all -> 0x03de }
            if (r1 != 0) goto L_0x028c
            java.lang.String r0 = "video content box not found"
            goto L_0x0071
        L_0x028c:
            int r1 = r1.A00     // Catch:{ all -> 0x03de }
            if (r1 != r6) goto L_0x0294
            r9.A02 = r14     // Catch:{ all -> 0x03de }
            goto L_0x03b1
        L_0x0294:
            if (r1 != r5) goto L_0x0298
            r10 = 3
            goto L_0x029e
        L_0x0298:
            if (r1 != r8) goto L_0x029c
            r10 = 1
            goto L_0x029e
        L_0x029c:
            if (r1 != r4) goto L_0x03b1
        L_0x029e:
            r9.A02 = r10     // Catch:{ all -> 0x03de }
            goto L_0x03b1
        L_0x02a2:
            r4 = 5
            int[] r4 = new int[r4]     // Catch:{ all -> 0x03de }
            r11 = 1836069985(0x6d703461, float:4.6462328E27)
            r4[r3] = r11     // Catch:{ all -> 0x03de }
            r10 = 1935764850(0x73616d72, float:1.7860208E31)
            r4[r8] = r10     // Catch:{ all -> 0x03de }
            r7 = 1935767394(0x73617762, float:1.7863284E31)
            r4[r14] = r7     // Catch:{ all -> 0x03de }
            r6 = 778924083(0x2e6d7033, float:5.3987214E-11)
            r4[r23] = r6     // Catch:{ all -> 0x03de }
            r5 = 1700998451(0x65632d33, float:6.7050686E22)
            r12 = 4
            r4[r12] = r5     // Catch:{ all -> 0x03de }
            long r29 = r29 - r1
            r26 = r4
            X.7LP r12 = A07(r25, r26, r27, r29)     // Catch:{ all -> 0x03de }
            if (r12 != 0) goto L_0x02cd
            java.lang.String r0 = "sound content box not found"
            goto L_0x0071
        L_0x02cd:
            if (r13 == 0) goto L_0x02d9
            int r2 = r9.A00     // Catch:{ all -> 0x03de }
            r1 = 8
            if (r2 != r1) goto L_0x02f4
            int r1 = r12.A00     // Catch:{ all -> 0x03de }
            if (r1 != r11) goto L_0x03bf
        L_0x02d9:
            int r1 = r12.A00     // Catch:{ all -> 0x03de }
            r4 = 7
            if (r1 != r11) goto L_0x037b
            long r1 = r0.A00     // Catch:{ all -> 0x03de }
            long r35 = A04(r12, r1)     // Catch:{ all -> 0x03de }
            r1 = 8
            A0B(r0, r1)     // Catch:{ all -> 0x03de }
            int[] r2 = A0D(r0)     // Catch:{ all -> 0x03de }
            r1 = r2[r3]     // Catch:{ all -> 0x03de }
            r2 = r2[r8]     // Catch:{ all -> 0x03de }
            if (r1 == r3) goto L_0x0300
            goto L_0x02fb
        L_0x02f4:
            if (r2 != r8) goto L_0x03bf
            int r1 = r12.A00     // Catch:{ all -> 0x03de }
            if (r1 != r5) goto L_0x03bf
            goto L_0x02d9
        L_0x02fb:
            r1 = r24
            if (r1 != r4) goto L_0x0300
            goto L_0x030f
        L_0x0300:
            r7 = 8
            long r4 = (long) r2     // Catch:{ all -> 0x03de }
            long r1 = r0.A00     // Catch:{ all -> 0x03de }
            long r35 = r35 - r1
            int[] r1 = new int[r8]     // Catch:{ all -> 0x03de }
            r2 = 1702061171(0x65736473, float:7.183675E22)
            r1[r3] = r2     // Catch:{ all -> 0x03de }
            goto L_0x0356
        L_0x030f:
            long r4 = (long) r2     // Catch:{ all -> 0x03de }
            long r1 = r0.A00     // Catch:{ all -> 0x03de }
            long r33 = r35 - r1
            int[] r30 = X.C86664Kz.A1Z()     // Catch:{ all -> 0x03de }
            r1 = 2002876005(0x77617665, float:4.5729223E33)
            r30[r3] = r1     // Catch:{ all -> 0x03de }
            r6 = 1702061171(0x65736473, float:7.183675E22)
            r30[r8] = r6     // Catch:{ all -> 0x03de }
            r7 = 8
            r29 = r0
            r31 = r4
            X.7LP r8 = A07(r29, r30, r31, r33)     // Catch:{ all -> 0x03de }
            int r2 = r8.A00     // Catch:{ all -> 0x03de }
            if (r2 != r1) goto L_0x0366
            long r4 = r0.A00     // Catch:{ all -> 0x03de }
            long r1 = A04(r8, r4)     // Catch:{ all -> 0x03de }
            long r29 = r1 - r4
            int[] r26 = X.C18330xA.A0E()     // Catch:{ all -> 0x03de }
            r26[r3] = r6     // Catch:{ all -> 0x03de }
            X.7LP r8 = A07(r25, r26, r27, r29)     // Catch:{ all -> 0x03de }
            if (r8 != 0) goto L_0x0368
            long r4 = r0.A00     // Catch:{ all -> 0x03de }
            long r1 = r1 - r4
            A0B(r0, r1)     // Catch:{ all -> 0x03de }
            r4 = 0
            long r1 = r0.A00     // Catch:{ all -> 0x03de }
            long r35 = r35 - r1
            int[] r1 = X.C18330xA.A0E()     // Catch:{ all -> 0x03de }
            r1[r3] = r6     // Catch:{ all -> 0x03de }
        L_0x0356:
            r31 = r0
            r32 = r1
            r33 = r4
            X.7LP r8 = A07(r31, r32, r33, r35)     // Catch:{ all -> 0x03de }
            if (r8 != 0) goto L_0x0368
        L_0x0362:
            java.lang.String r0 = "esds box not found"
            goto L_0x0071
        L_0x0366:
            if (r2 != r6) goto L_0x0362
        L_0x0368:
            int r4 = A01(r8, r0)     // Catch:{ all -> 0x03de }
            r9.A00 = r4     // Catch:{ all -> 0x03de }
            r2 = 1
            if (r13 == 0) goto L_0x0377
            if (r4 == r2) goto L_0x0374
            goto L_0x03bb
        L_0x0374:
            r9.A00 = r7     // Catch:{ all -> 0x03de }
            goto L_0x03b1
        L_0x0377:
            r1 = 7
            if (r4 != r1) goto L_0x03b1
            goto L_0x03ce
        L_0x037b:
            r2 = 8
            if (r1 != r10) goto L_0x0381
            r1 = 3
            goto L_0x0397
        L_0x0381:
            if (r1 != r7) goto L_0x0385
            r1 = 4
            goto L_0x0397
        L_0x0385:
            if (r1 != r6) goto L_0x039a
            r1 = r24
            if (r1 == r4) goto L_0x0391
            java.lang.String r1 = ".mp3 box found in non-QuickTime file (?!)"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x03de }
            goto L_0x0396
        L_0x0391:
            java.lang.String r1 = "file carries Mp3 audio stream"
            com.whatsapp.util.Log.d((java.lang.String) r1)     // Catch:{ all -> 0x03de }
        L_0x0396:
            r1 = 2
        L_0x0397:
            r9.A00 = r1     // Catch:{ all -> 0x03de }
            goto L_0x03b1
        L_0x039a:
            if (r1 != r5) goto L_0x03b1
            java.lang.String r1 = "file carries Dolby E-AC3 multichannel audio stream"
            com.whatsapp.util.Log.d((java.lang.String) r1)     // Catch:{ all -> 0x03de }
            r9.A00 = r2     // Catch:{ all -> 0x03de }
            goto L_0x03b1
        L_0x03a4:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x03de }
            java.lang.String r1 = "non sound/video hdlr type found "
            java.lang.String r1 = A09(r1, r2, r6)     // Catch:{ all -> 0x03de }
            X.C18260x0.A1J(r2, r1)     // Catch:{ all -> 0x03de }
        L_0x03b1:
            long r4 = r0.A00     // Catch:{ all -> 0x03de }
            long r1 = r17 - r4
            A0B(r0, r1)     // Catch:{ all -> 0x03de }
            r8 = 1
            goto L_0x00b1
        L_0x03bb:
            java.lang.String r0 = "multiple hldr audio tracks found - not dolby mp4"
            goto L_0x0071
        L_0x03bf:
            java.lang.String r0 = "multiple hldr audio tracks found - not dolby"
            goto L_0x0071
        L_0x03c3:
            java.lang.String r0 = "Unexpected eof reading tkhd"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ all -> 0x03de }
            throw r0     // Catch:{ all -> 0x03de }
        L_0x03ca:
            r0 = 6
            r9.A00 = r0     // Catch:{ all -> 0x03de }
            goto L_0x03da
        L_0x03ce:
            r9.A05 = r2     // Catch:{ all -> 0x03de }
            goto L_0x03da
        L_0x03d1:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x03de }
            java.lang.String r0 = "Details found: "
            X.C18260x0.A1R(r1, r0, r9)     // Catch:{ all -> 0x03de }
        L_0x03da:
            r22.close()
            return r9
        L_0x03de:
            r1 = move-exception
            r22.close()     // Catch:{ all -> 0x03e3 }
            throw r1
        L_0x03e3:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162397rz.A06(X.2qk, java.io.File):X.7nN");
    }

    public static AnonymousClass7LP A07(InputStream inputStream, int[] iArr, long j, long j2) {
        long j3;
        long j4;
        long j5;
        long j6 = j2;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Looking for ");
        int[] iArr2 = iArr;
        A0o.append(iArr2.length);
        A0o.append(" boxes including: ");
        int i = iArr[0];
        C18260x0.A1J(A0o, new String(new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)}));
        long j7 = 0;
        long j8 = j;
        InputStream inputStream2 = inputStream;
        if (j > 0) {
            if (j2 <= 0 || j <= j2) {
                A0B(inputStream2, j8);
                if (j2 == -1) {
                    j6 = -1;
                } else {
                    j6 = j2 - j;
                }
            } else {
                throw AnonymousClass002.A0C("Not enough bytes to skip");
            }
        }
        int i2 = 8;
        byte[] bArr = new byte[8];
        while (true) {
            if (j3 != -1 && j3 <= j7) {
                return null;
            }
            int A022 = A02(inputStream2, bArr, 0, i2);
            if (A022 >= i2) {
                long j9 = (long) A022;
                if (j3 == -1) {
                    j4 = -1;
                } else {
                    j4 = j3 - j9;
                }
                for (int i3 = 4; i3 < i2; i3++) {
                    byte b = bArr[i3];
                    if (b < 32) {
                        C18260x0.A0y("Found non character data in box type ", AnonymousClass001.A0o(), b);
                        return null;
                    }
                }
                int A023 = AnonymousClass6C7.A02(bArr[0], bArr[1], bArr[2], bArr[3]);
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("Found box: ");
                A0o2.append(new String(bArr, 4, 4));
                A0o2.append(' ');
                C18260x0.A1F(A0o2, A023);
                if (A023 == 0) {
                    A023 = -1;
                } else if (A023 == 1) {
                    byte[] bArr2 = new byte[i2];
                    A022 += A02(inputStream2, bArr2, 0, i2);
                    if (A022 == 16) {
                        long j10 = (long) A022;
                        if (j5 == -1) {
                            j5 = -1;
                        } else {
                            j5 -= j10;
                        }
                        long A024 = ((long) AnonymousClass6C7.A02(bArr2[4], bArr2[5], bArr2[6], bArr2[7])) | (((long) AnonymousClass6C7.A02(bArr2[0], bArr2[1], bArr2[2], bArr2[3])) << 32);
                        if (A024 <= 2147483647L) {
                            A023 = (int) A024;
                        } else {
                            throw AnonymousClass002.A0C(AnonymousClass000.A0Z("Length of box too long to be processed: ", AnonymousClass001.A0o(), A024));
                        }
                    } else {
                        throw AnonymousClass002.A0C("End of file looking for wide box length");
                    }
                }
                if (j5 <= 0 || j5 >= ((long) (A023 - A022))) {
                    int A025 = AnonymousClass6C7.A02(bArr[4], bArr[5], bArr[6], bArr[7]);
                    boolean A052 = AnonymousClass367.A05(iArr2, A025);
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    if (A052) {
                        C18260x0.A1J(A0o3, A09("Found matching box type: ", A0o3, A025));
                        return new AnonymousClass7LP(A023, A025, A022);
                    }
                    C18260x0.A1J(A0o3, A09("Did not find matching box type - found: ", A0o3, A025));
                    long j11 = (long) (A023 - A022);
                    A0B(inputStream2, j11);
                    if (j5 == -1) {
                        j3 = -1;
                    } else {
                        j3 = j5 - j11;
                    }
                    j7 = 0;
                    i2 = 8;
                } else {
                    StringBuilder A0o4 = AnonymousClass001.A0o();
                    A0o4.append("Length of box too long to be in current input: ");
                    A0o4.append(A023);
                    A0o4.append('>');
                    throw AnonymousClass002.A0C(AnonymousClass001.A0k(A0o4, j5));
                }
            } else {
                throw AnonymousClass002.A0C("End of file looking for box header");
            }
        }
    }

    public static String A08(C138076pj r3) {
        switch (r3.A00) {
            case 1:
                if (r3.A01 != 2) {
                    return "audio/aac";
                }
                return "audio/mp4";
            case 2:
                if (r3.A01 != 2) {
                    return "audio/mpeg";
                }
                return "audio/mp4";
            case 3:
                return "audio/amr";
            case 5:
                return "audio/ogg; codecs=opus";
            case 6:
                throw AnonymousClass0x9.A0i(AnonymousClass000.A0P(r3, "invalid audio type returned; ", AnonymousClass001.A0o()));
            default:
                Log.w("unsupported audio type; returning null mime type");
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Audio type not supported: ");
                throw new C143416yq(AnonymousClass000.A0h(A0o, r3.A00));
        }
    }

    public static void A0B(InputStream inputStream, long j) {
        byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
        while (j > 0) {
            long j2 = (long) EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            if (A02(inputStream, bArr, 0, AnonymousClass6CA.A02(j2, j)) != -1) {
                j -= j2;
            } else {
                throw AnonymousClass002.A0C(AnonymousClass000.A0Z("Unexpected EOF skipping ", AnonymousClass001.A0o(), j));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e A[Catch:{ Exception -> 0x0028 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[Catch:{ Exception -> 0x0028 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] A0E(byte[] r8, int r9, int r10) {
        /*
            int r0 = r9 + 4
            r7 = 0
            int r6 = java.lang.Math.min(r10, r0)     // Catch:{ Exception -> 0x0028 }
            r5 = 0
            r4 = r9
            r2 = 0
        L_0x000a:
            r3 = 1
            int r4 = r4 + 1
            int r2 = r2 << 7
            byte r1 = r8[r4]     // Catch:{ Exception -> 0x0028 }
            r0 = r1 & 127(0x7f, float:1.78E-43)
            int r2 = r2 + r0
            if (r9 >= r6) goto L_0x001c
            r1 = r1 & 128(0x80, float:1.794E-43)
            r0 = 128(0x80, float:1.794E-43)
            if (r1 == r0) goto L_0x000a
        L_0x001c:
            if (r2 != 0) goto L_0x001f
            return r7
        L_0x001f:
            int[] r0 = X.C86664Kz.A1Z()     // Catch:{ Exception -> 0x0028 }
            r0[r5] = r4     // Catch:{ Exception -> 0x0028 }
            r0[r3] = r2     // Catch:{ Exception -> 0x0028 }
            return r0
        L_0x0028:
            r1 = move-exception
            java.lang.String r0 = "Exception processing esds box: "
            com.whatsapp.util.Log.i(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162397rz.A0E(byte[], int, int):int[]");
    }

    public boolean A0F(File file) {
        C138076pj A052 = A05(this.A00, file);
        switch (A052.A00) {
            case 1:
            case 2:
            case 3:
            case 5:
                return true;
            case 6:
                throw AnonymousClass0x9.A0i(AnonymousClass000.A0P(A052, "invalid audio file type returned; ", AnonymousClass001.A0o()));
            default:
                return false;
        }
    }

    public boolean A0G(File file) {
        C160287nN A062 = A06(this.A00, file);
        int i = A062.A01;
        if (i != 2 && i != 3) {
            return false;
        }
        int i2 = A062.A00;
        if (i2 != 4 && i2 != 2 && i2 != 1 && i2 != 0 && i2 != 8) {
            return false;
        }
        int i3 = A062.A02;
        if (i3 == 2 || i3 == 1 || i3 == 3) {
            return true;
        }
        return false;
    }

    public C162397rz(C55682qk r1) {
        this.A00 = r1;
    }

    public static int A00(byte b, byte b2, byte b3, byte b4) {
        return AnonymousClass6C7.A02(b, b2, b3, b4);
    }

    public static String A09(String str, StringBuilder sb, int i) {
        sb.append(str);
        return new String(new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)});
    }

    public static String A0A(String str, boolean z) {
        String A0V;
        if (TextUtils.isEmpty(str)) {
            if (z) {
                A0V = "empty audio mime type";
            }
            return null;
        } else if ("audio/aac".equals(str)) {
            return "aac";
        } else {
            if ("audio/mp4".equals(str)) {
                return "m4a";
            }
            if ("audio/amr".equals(str)) {
                return "amr";
            }
            if ("audio/mpeg".equals(str)) {
                return "mp3";
            }
            if ("audio/ogg; codecs=opus".equals(str)) {
                return "opus";
            }
            if (z) {
                A0V = AnonymousClass000.A0V("unrecognized audio mime type; mimeType=", str, AnonymousClass001.A0o());
            }
            return null;
        }
        Log.w(A0V);
        return null;
    }
}
