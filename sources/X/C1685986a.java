package X;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.86a  reason: invalid class name and case insensitive filesystem */
public class C1685986a implements C185328tT {
    public static final Map A0r;
    public static final UUID A0s = new UUID(72057594037932032L, -9223371306706625679L);
    public static final byte[] A0t = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(AnonymousClass79T.A05);
    public static final byte[] A0u = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final byte[] A0v = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public byte A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public long A0N;
    public C187028wK A0O;
    public C151327Uh A0P;
    public C151547Vf A0Q;
    public C151547Vf A0R;
    public ByteBuffer A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public int[] A0c;
    public final SparseArray A0d;
    public final C178098gy A0e;
    public final C157427iH A0f;
    public final C161467pi A0g;
    public final C161467pi A0h;
    public final C161467pi A0i;
    public final C161467pi A0j;
    public final C161467pi A0k;
    public final C161467pi A0l;
    public final C161467pi A0m;
    public final C161467pi A0n;
    public final C161467pi A0o;
    public final C161467pi A0p;
    public final boolean A0q;

    static {
        HashMap A0t2 = AnonymousClass001.A0t();
        A0t2.put("htc_video_rotA-000", C18290x4.A0Z());
        A0t2.put("htc_video_rotA-090", 90);
        A0t2.put("htc_video_rotA-180", 180);
        A0t2.put("htc_video_rotA-270", 270);
        A0r = Collections.unmodifiableMap(A0t2);
    }

    public C1685986a(int i) {
        C1688086v r4 = new C1688086v();
        this.A0L = -1;
        this.A0N = -9223372036854775807L;
        this.A0H = -9223372036854775807L;
        this.A0I = -9223372036854775807L;
        this.A0G = -1;
        this.A0K = -1;
        this.A0F = -9223372036854775807L;
        this.A0e = r4;
        r4.A03 = new C1687986u(this);
        this.A0q = true;
        this.A0f = new C157427iH();
        this.A0d = AnonymousClass6CA.A0I();
        this.A0m = C161467pi.A05(4);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(-1);
        this.A0p = new C161467pi(allocate.array());
        this.A0n = C161467pi.A05(4);
        this.A0k = new C161467pi(C161627q8.A02);
        this.A0j = C161467pi.A05(4);
        this.A0l = new C161467pi();
        this.A0o = new C161467pi();
        this.A0h = C161467pi.A05(8);
        this.A0i = new C161467pi();
        this.A0g = new C161467pi();
        this.A0c = new int[1];
    }

    public final int A03(C187648xa r18, C151327Uh r19, int i) {
        int Bkf;
        int Bkf2;
        int i2;
        byte[] bArr;
        C151327Uh r10 = r19;
        int i3 = i;
        String str = r10.A0e;
        C187648xa r11 = r18;
        if ("S_TEXT/UTF8".equals(str)) {
            bArr = A0v;
        } else if ("S_TEXT/ASS".equals(str)) {
            bArr = A0u;
        } else {
            C185598tw r7 = r10.A0c;
            boolean z = true;
            if (!this.A0V) {
                if (r10.A0k) {
                    this.A02 &= -1073741825;
                    int i4 = 128;
                    if (!this.A0Y) {
                        C161467pi r3 = this.A0m;
                        r11.readFully(r3.A02, 0, 1);
                        this.A08++;
                        byte b = r3.A02[0];
                        if ((b & 128) != 128) {
                            this.A00 = b;
                            this.A0Y = true;
                        } else {
                            throw AnonymousClass6u7.A01("Extension bit is set in signal byte");
                        }
                    }
                    byte b2 = this.A00;
                    if ((b2 & 1) == 1) {
                        boolean A1U = AnonymousClass000.A1U(b2 & 2, 2);
                        this.A02 |= 1073741824;
                        if (!this.A0W) {
                            C161467pi r12 = this.A0h;
                            r11.readFully(r12.A02, 0, 8);
                            this.A08 += 8;
                            this.A0W = true;
                            C161467pi r13 = this.A0m;
                            byte[] bArr2 = r13.A02;
                            if (!A1U) {
                                i4 = 0;
                            }
                            bArr2[0] = (byte) (i4 | 8);
                            r13.A0S(0);
                            r7.Bkd(r13, 1, 1);
                            this.A09++;
                            r12.A0S(0);
                            r7.Bkd(r12, 8, 1);
                            this.A09 += 8;
                        }
                        if (A1U) {
                            if (!this.A0X) {
                                C161467pi r32 = this.A0m;
                                r11.readFully(r32.A02, 0, 1);
                                this.A08++;
                                r32.A0S(0);
                                this.A0B = r32.A0C();
                                this.A0X = true;
                            }
                            int i5 = this.A0B * 4;
                            C161467pi r14 = this.A0m;
                            r14.A0Q(i5);
                            r11.readFully(r14.A02, 0, i5);
                            this.A08 += i5;
                            short s = (short) ((this.A0B / 2) + 1);
                            int i6 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.A0S;
                            if (byteBuffer == null || byteBuffer.capacity() < i6) {
                                this.A0S = ByteBuffer.allocate(i6);
                            }
                            this.A0S.position(0);
                            this.A0S.putShort(s);
                            int i7 = 0;
                            int i8 = 0;
                            while (true) {
                                i2 = this.A0B;
                                if (i7 >= i2) {
                                    break;
                                }
                                int A0E2 = r14.A0E();
                                int i9 = i7 % 2;
                                ByteBuffer byteBuffer2 = this.A0S;
                                int i10 = A0E2 - i8;
                                if (i9 == 0) {
                                    byteBuffer2.putShort((short) i10);
                                } else {
                                    byteBuffer2.putInt(i10);
                                }
                                i7++;
                                i8 = A0E2;
                            }
                            int i11 = (i - this.A08) - i8;
                            int i12 = i2 % 2;
                            ByteBuffer byteBuffer3 = this.A0S;
                            if (i12 == 1) {
                                byteBuffer3.putInt(i11);
                            } else {
                                byteBuffer3.putShort((short) i11);
                                this.A0S.putInt(0);
                            }
                            C161467pi r33 = this.A0i;
                            r33.A0U(this.A0S.array(), i6);
                            r7.Bkd(r33, i6, 1);
                            this.A09 += i6;
                        }
                    }
                } else {
                    byte[] bArr3 = r10.A0o;
                    if (bArr3 != null) {
                        this.A0l.A0U(bArr3, bArr3.length);
                    }
                }
                if (r10.A0O > 0) {
                    this.A02 |= 268435456;
                    this.A0g.A0Q(0);
                    C161467pi r122 = this.A0m;
                    r122.A0Q(4);
                    byte[] bArr4 = r122.A02;
                    AnonymousClass6C9.A1G(bArr4, i >> 24, 0);
                    AnonymousClass6C9.A1G(bArr4, i >> 16, 1);
                    AnonymousClass6C9.A1G(bArr4, i >> 8, 2);
                    bArr4[3] = (byte) (i3 & 255);
                    r7.Bkd(r122, 4, 2);
                    this.A09 += 4;
                }
                this.A0V = true;
            }
            C161467pi r8 = this.A0l;
            int i13 = r8.A00;
            int i14 = i + i13;
            String str2 = r10.A0e;
            if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
                AnonymousClass7UE r34 = r10.A0d;
                if (r34 != null) {
                    if (i13 != 0) {
                        z = false;
                    }
                    C161487pm.A04(z);
                    if (!r34.A05) {
                        byte[] bArr5 = r34.A06;
                        r11.Bgd(bArr5, 0, 10);
                        r11.Bjy();
                        if (bArr5[4] == -8 && bArr5[5] == 114 && bArr5[6] == 111) {
                            byte b3 = bArr5[7];
                            if ((b3 & 254) == 186) {
                                char c = 8;
                                if ((b3 & 255) == 187) {
                                    c = 9;
                                }
                                if ((40 << ((bArr5[c] >> 4) & 7)) != 0) {
                                    r34.A05 = true;
                                }
                            }
                        }
                    }
                }
                while (true) {
                    int i15 = this.A08;
                    if (i15 >= i14) {
                        break;
                    }
                    int i16 = i14 - i15;
                    int A002 = C161467pi.A00(r8);
                    if (A002 > 0) {
                        Bkf2 = Math.min(i16, A002);
                        r7.Bkc(r8, Bkf2);
                    } else {
                        Bkf2 = r7.Bkf(r11, i16, 0, false);
                    }
                    this.A08 += Bkf2;
                    this.A09 += Bkf2;
                }
            } else {
                C161467pi r132 = this.A0j;
                byte[] bArr6 = r132.A02;
                bArr6[0] = 0;
                bArr6[1] = 0;
                bArr6[2] = 0;
                int i17 = r10.A0R;
                int i18 = 4 - i17;
                while (this.A08 < i14) {
                    int i19 = this.A0A;
                    int A003 = C161467pi.A00(r8);
                    if (i19 == 0) {
                        int min = Math.min(i17, A003);
                        r11.readFully(bArr6, i18 + min, i17 - min);
                        if (min > 0) {
                            r8.A0V(bArr6, i18, min);
                        }
                        this.A08 += i17;
                        this.A0A = C161467pi.A03(r132, 0);
                        C161467pi r0 = this.A0k;
                        r0.A0S(0);
                        r7.Bkc(r0, 4);
                        this.A09 += 4;
                    } else {
                        if (A003 > 0) {
                            Bkf = Math.min(i19, A003);
                            r7.Bkc(r8, Bkf);
                        } else {
                            Bkf = r7.Bkf(r11, i19, 0, false);
                        }
                        this.A08 += Bkf;
                        this.A09 += Bkf;
                        this.A0A -= Bkf;
                    }
                }
            }
            if ("A_VORBIS".equals(r10.A0e)) {
                C161467pi r02 = this.A0p;
                r02.A0S(0);
                r7.Bkc(r02, 4);
                this.A09 += 4;
            }
            int i20 = this.A09;
            this.A08 = 0;
            this.A09 = 0;
            this.A0A = 0;
            this.A0V = false;
            this.A0Y = false;
            this.A0X = false;
            this.A0B = 0;
            this.A00 = 0;
            this.A0W = false;
            this.A0l.A0Q(0);
            return i20;
        }
        int length = bArr.length;
        int i21 = length + i;
        C161467pi r35 = this.A0o;
        byte[] bArr7 = r35.A02;
        if (bArr7.length < i21) {
            byte[] copyOf = Arrays.copyOf(bArr, i21 + i);
            r35.A0U(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr7, 0, length);
        }
        r11.readFully(r35.A02, length, i3);
        r35.A0S(0);
        r35.A0R(i21);
        int i202 = this.A09;
        this.A08 = 0;
        this.A09 = 0;
        this.A0A = 0;
        this.A0V = false;
        this.A0Y = false;
        this.A0X = false;
        this.A0B = 0;
        this.A00 = 0;
        this.A0W = false;
        this.A0l.A0Q(0);
        return i202;
    }

    public final long A04(long j) {
        long j2 = this.A0N;
        if (j2 != -9223372036854775807L) {
            return C162387ry.A05(j, j2, 1000);
        }
        throw AnonymousClass6u7.A01("Can't scale timecode prior to timecodeScale being set.");
    }

    public final void A05(int i) {
        if (this.A0R == null || this.A0Q == null) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("Element ");
            A0o2.append(i);
            throw AnonymousClass6u7.A01(AnonymousClass000.A0X(" must be in a Cues", A0o2));
        }
    }

    public final void A06(int i) {
        if (this.A0P == null) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("Element ");
            A0o2.append(i);
            throw AnonymousClass6u7.A01(AnonymousClass000.A0X(" must be in a TrackEntry", A0o2));
        }
    }

    public final void A07(C187648xa r5, int i) {
        C161467pi r3 = this.A0m;
        if (r3.A00 < i) {
            int length = r3.A02.length;
            if (length < i) {
                r3.A0P(Math.max(length * 2, i));
            }
            byte[] bArr = r3.A02;
            int i2 = r3.A00;
            r5.readFully(bArr, i2, i - i2);
            r3.A0R(i);
        }
    }

    public final void A08(C151327Uh r18, int i, int i2, int i3, long j) {
        byte[] A022;
        int i4;
        String str;
        C151327Uh r7 = r18;
        int i5 = i2;
        int i6 = i;
        AnonymousClass7UE r2 = r7.A0d;
        int i7 = i3;
        long j2 = j;
        if (r2 == null) {
            String str2 = r7.A0e;
            if ("S_TEXT/UTF8".equals(str2) || "S_TEXT/ASS".equals(str2)) {
                if (this.A03 > 1) {
                    str = "Skipping subtitle sample in laced block.";
                } else {
                    long j3 = this.A0D;
                    if (j3 == -9223372036854775807L) {
                        str = "Skipping subtitle sample with no duration.";
                    } else {
                        C161467pi r8 = this.A0o;
                        byte[] bArr = r8.A02;
                        if (str2.equals("S_TEXT/ASS")) {
                            A022 = A02("%01d:%02d:%02d:%02d", j3, 10000);
                            i4 = 21;
                        } else if (str2.equals("S_TEXT/UTF8")) {
                            A022 = A02("%02d:%02d:%02d,%03d", j3, 1000);
                            i4 = 19;
                        } else {
                            throw AnonymousClass6CA.A0N();
                        }
                        System.arraycopy(A022, 0, bArr, i4, A022.length);
                        int i8 = r8.A01;
                        while (true) {
                            if (i8 >= r8.A00) {
                                break;
                            } else if (r8.A02[i8] == 0) {
                                r8.A0R(i8);
                                break;
                            } else {
                                i8++;
                            }
                        }
                        r7.A0c.Bkc(r8, r8.A00);
                        i5 = i2 + r8.A00;
                    }
                }
                Log.w("MatroskaExtractor", str);
            }
            if ((268435456 & i) != 0) {
                if (this.A03 > 1) {
                    i6 = i & -268435457;
                } else {
                    C161467pi r3 = this.A0g;
                    int i9 = r3.A00;
                    r7.A0c.Bkd(r3, i9, 2);
                    i5 += i9;
                }
            }
            r7.A0c.Bkh(r7.A0b, i6, i5, i7, j2);
        } else if (r2.A05) {
            int i10 = r2.A02;
            int i11 = i10 + 1;
            r2.A02 = i11;
            if (i10 == 0) {
                r2.A04 = j2;
                r2.A00 = i6;
                r2.A03 = 0;
            }
            r2.A03 += i2;
            r2.A01 = i7;
            if (i11 >= 16) {
                r2.A00(r7);
            }
        }
        this.A0U = true;
    }

    public final void BFs(C187028wK r1) {
        this.A0O = r1;
    }

    public final boolean BpS(C187648xa r18) {
        C161467pi A052 = C161467pi.A05(8);
        C187648xa r11 = r18;
        long length = r11.getLength();
        long j = 1024;
        int i = (length > -1 ? 1 : (length == -1 ? 0 : -1));
        if (i != 0 && length <= 1024) {
            j = length;
        }
        int i2 = (int) j;
        r11.Bgd(A052.A02, 0, 4);
        int i3 = 4;
        for (long A0I2 = A052.A0I(); A0I2 != 440786851; A0I2 = ((A0I2 << 8) & -256) | ((long) (A052.A02[0] & 255))) {
            i3++;
            if (i3 == i2) {
                return false;
            }
            C161467pi.A06(r11, A052, 1);
        }
        int i4 = 0;
        r11.Bgd(A052.A02, 0, 1);
        byte[] bArr = A052.A02;
        byte b = bArr[0] & 255;
        if (b == 0) {
            return false;
        }
        int i5 = 128;
        int i6 = 0;
        while ((b & i5) == 0) {
            i5 >>= 1;
            i6++;
        }
        int i7 = b & (~i5);
        r11.Bgd(bArr, 1, i6);
        while (i4 < i6) {
            i4++;
            i7 = (A052.A02[i4] & 255) + (i7 << 8);
        }
        int i8 = i3 + i6 + 1;
        long j2 = (long) i7;
        long j3 = (long) i8;
        if (j2 == Long.MIN_VALUE) {
            return false;
        }
        if (i != 0 && j3 + j2 >= length) {
            return false;
        }
        while (true) {
            long j4 = (long) i8;
            long j5 = j3 + j2;
            if (j4 < j5) {
                int i9 = 0;
                r11.Bgd(A052.A02, 0, 1);
                byte[] bArr2 = A052.A02;
                byte b2 = bArr2[0] & 255;
                if (b2 == 0) {
                    return false;
                }
                int i10 = 128;
                int i11 = 0;
                while ((b2 & i10) == 0) {
                    i10 >>= 1;
                    i11++;
                }
                int i12 = b2 & (~i10);
                r11.Bgd(bArr2, 1, i11);
                while (i9 < i11) {
                    i9++;
                    i12 = (A052.A02[i9] & 255) + (i12 << 8);
                }
                int i13 = i8 + i11 + 1;
                if (((long) i12) == Long.MIN_VALUE) {
                    return false;
                }
                int i14 = 0;
                r11.Bgd(A052.A02, 0, 1);
                byte[] bArr3 = A052.A02;
                byte b3 = bArr3[0] & 255;
                if (b3 == 0) {
                    return false;
                }
                int i15 = 128;
                int i16 = 0;
                while ((b3 & i15) == 0) {
                    i15 >>= 1;
                    i16++;
                }
                int i17 = b3 & (~i15);
                r11.Bgd(bArr3, 1, i16);
                while (i14 < i16) {
                    i14++;
                    i17 = (A052.A02[i14] & 255) + (i17 << 8);
                }
                i8 = i13 + i16 + 1;
                long j6 = (long) i17;
                int i18 = (j6 > 0 ? 1 : (j6 == 0 ? 0 : -1));
                if (i18 < 0 || j6 > 2147483647L) {
                    return false;
                }
                if (i18 != 0) {
                    int i19 = (int) j6;
                    r11.Awu(i19);
                    i8 += i19;
                }
            } else if (j4 == j5) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static C151327Uh A00(C1685986a r0, int i) {
        r0.A06(i);
        return r0.A0P;
    }

    public static void A01(ByteBuffer byteBuffer, float f) {
        byteBuffer.putShort((short) ((int) ((f * 50000.0f) + 0.5f)));
    }

    public static byte[] A02(String str, long j, long j2) {
        C161487pm.A03(AnonymousClass000.A1S((j > -9223372036854775807L ? 1 : (j == -9223372036854775807L ? 0 : -1))));
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) (i * 3600)) * SearchActionVerificationClientService.MS_TO_NS);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) (i2 * 60)) * SearchActionVerificationClientService.MS_TO_NS);
        int i3 = (int) (j4 / SearchActionVerificationClientService.MS_TO_NS);
        Locale locale = Locale.US;
        Object[] objArr = new Object[4];
        C86604Kt.A1X(objArr, i, 0, i2, 1);
        AnonymousClass000.A1P(objArr, i3, 2);
        AnonymousClass000.A1P(objArr, (int) ((j4 - (((long) i3) * SearchActionVerificationClientService.MS_TO_NS)) / j2), 3);
        return String.format(locale, str, objArr).getBytes(AnonymousClass79T.A05);
    }

    public void Bkz(long j, long j2) {
        this.A0F = -9223372036854775807L;
        int i = 0;
        this.A05 = 0;
        C1688086v r1 = (C1688086v) this.A0e;
        r1.A01 = 0;
        r1.A05.clear();
        C157427iH r0 = r1.A04;
        r0.A01 = 0;
        r0.A00 = 0;
        C157427iH r02 = this.A0f;
        r02.A01 = 0;
        r02.A00 = 0;
        this.A08 = 0;
        this.A09 = 0;
        this.A0A = 0;
        this.A0V = false;
        this.A0Y = false;
        this.A0X = false;
        this.A0B = 0;
        this.A00 = 0;
        this.A0W = false;
        this.A0l.A0Q(0);
        while (true) {
            SparseArray sparseArray = this.A0d;
            if (i < sparseArray.size()) {
                AnonymousClass7UE r12 = ((C151327Uh) sparseArray.valueAt(i)).A0d;
                if (r12 != null) {
                    r12.A05 = false;
                    r12.A02 = 0;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01d0, code lost:
        if (r10.equals(r0) == false) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01d2, code lost:
        r25 = r4.A0S;
        r12 = 4;
        r6 = 3;
        r19 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01de, code lost:
        switch(r2) {
            case -2095576542: goto L_0x0320;
            case -2095575984: goto L_0x0318;
            case -1985379776: goto L_0x0310;
            case -1784763192: goto L_0x0308;
            case -1730367663: goto L_0x0300;
            case -1482641358: goto L_0x02f8;
            case -1482641357: goto L_0x02f0;
            case -1373388978: goto L_0x02e8;
            case -933872740: goto L_0x02df;
            case -538363189: goto L_0x02d6;
            case -538363109: goto L_0x02cd;
            case -425012669: goto L_0x02c4;
            case -356037306: goto L_0x02bb;
            case 62923557: goto L_0x02b2;
            case 62923603: goto L_0x02a9;
            case 62927045: goto L_0x02a0;
            case 82318131: goto L_0x0296;
            case 82338133: goto L_0x028c;
            case 82338134: goto L_0x0282;
            case 99146302: goto L_0x0278;
            case 444813526: goto L_0x026e;
            case 542569478: goto L_0x0264;
            case 635596514: goto L_0x025a;
            case 725948237: goto L_0x0250;
            case 725957860: goto L_0x0246;
            case 738597099: goto L_0x023c;
            case 855502857: goto L_0x0232;
            case 1422270023: goto L_0x0228;
            case 1809237540: goto L_0x021e;
            case 1950749482: goto L_0x0214;
            case 1950789798: goto L_0x020a;
            case 1951062397: goto L_0x0200;
            default: goto L_0x01e1;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01e1, code lost:
        r15 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01e2, code lost:
        r3 = "audio/raw";
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01f6, code lost:
        switch(r15) {
            case 0: goto L_0x05a4;
            case 1: goto L_0x05a4;
            case 2: goto L_0x0531;
            case 3: goto L_0x0527;
            case 4: goto L_0x04cb;
            case 5: goto L_0x04c1;
            case 6: goto L_0x04be;
            case 7: goto L_0x043b;
            case 8: goto L_0x042a;
            case 9: goto L_0x05a4;
            case 10: goto L_0x040f;
            case 11: goto L_0x0403;
            case 12: goto L_0x03ff;
            case 13: goto L_0x03dd;
            case 14: goto L_0x03d9;
            case 15: goto L_0x03d5;
            case 16: goto L_0x03d1;
            case 17: goto L_0x03cd;
            case 18: goto L_0x03c9;
            case 19: goto L_0x03c2;
            case 20: goto L_0x03be;
            case 21: goto L_0x03d5;
            case 22: goto L_0x057e;
            case 23: goto L_0x03b4;
            case 24: goto L_0x03a4;
            case 25: goto L_0x0396;
            case 26: goto L_0x037d;
            case 27: goto L_0x037a;
            case 28: goto L_0x0376;
            case 29: goto L_0x0372;
            case 30: goto L_0x0366;
            case 31: goto L_0x032b;
            default: goto L_0x01f9;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01ff, code lost:
        throw X.AnonymousClass6u7.A01("Unrecognized codec identifier.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0200, code lost:
        r0 = r10.equals("A_OPUS");
        r15 = 31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x020a, code lost:
        r0 = r10.equals("A_FLAC");
        r15 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0214, code lost:
        r0 = r10.equals("A_EAC3");
        r15 = 29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x021e, code lost:
        r0 = r10.equals("V_MPEG2");
        r15 = 28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0228, code lost:
        r0 = r10.equals("S_TEXT/UTF8");
        r15 = 27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0232, code lost:
        r0 = r10.equals("V_MPEGH/ISO/HEVC");
        r15 = 26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x023c, code lost:
        r0 = r10.equals("S_TEXT/ASS");
        r15 = 25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0246, code lost:
        r0 = r10.equals("A_PCM/INT/LIT");
        r15 = 24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0250, code lost:
        r0 = r10.equals("A_PCM/INT/BIG");
        r15 = 23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x025a, code lost:
        r0 = r10.equals("A_PCM/FLOAT/IEEE");
        r15 = 22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0264, code lost:
        r0 = r10.equals("A_DTS/EXPRESS");
        r15 = 21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x026e, code lost:
        r0 = r10.equals("V_THEORA");
        r15 = 20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0278, code lost:
        r0 = r10.equals("S_HDMV/PGS");
        r15 = 19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0282, code lost:
        r0 = r10.equals("V_VP9");
        r15 = 18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x028c, code lost:
        r0 = r10.equals("V_VP8");
        r15 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0296, code lost:
        r0 = r10.equals("V_AV1");
        r15 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02a0, code lost:
        r0 = r10.equals("A_DTS");
        r15 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02a9, code lost:
        r0 = r10.equals("A_AC3");
        r15 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02b2, code lost:
        r0 = r10.equals("A_AAC");
        r15 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02bb, code lost:
        r0 = r10.equals("A_DTS/LOSSLESS");
        r15 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02c4, code lost:
        r0 = r10.equals("S_VOBSUB");
        r15 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02cd, code lost:
        r0 = r10.equals("V_MPEG4/ISO/AVC");
        r15 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02d6, code lost:
        r0 = r10.equals("V_MPEG4/ISO/ASP");
        r15 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02df, code lost:
        r0 = r10.equals("S_DVBSUB");
        r15 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02e8, code lost:
        r0 = r10.equals("V_MS/VFW/FOURCC");
        r15 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02f0, code lost:
        r0 = r10.equals("A_MPEG/L3");
        r15 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02f8, code lost:
        r0 = r10.equals("A_MPEG/L2");
        r15 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0300, code lost:
        r0 = r10.equals("A_VORBIS");
        r15 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0308, code lost:
        r0 = r10.equals("A_TRUEHD");
        r15 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0310, code lost:
        r0 = r10.equals("A_MS/ACM");
        r15 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0318, code lost:
        r0 = r10.equals("V_MPEG4/ISO/SP");
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0320, code lost:
        r0 = r10.equals("V_MPEG4/ISO/AP");
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0327, code lost:
        if (r0 != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x032b, code lost:
        r5 = X.AnonymousClass002.A0I(3);
        r5.add(r4.A00(r10));
        r0 = java.nio.ByteBuffer.allocate(8);
        r10 = java.nio.ByteOrder.LITTLE_ENDIAN;
        r0 = r0.order(r10);
        r0.putLong(r4.A0Y);
        r5.add(r0.array());
        r0 = java.nio.ByteBuffer.allocate(8).order(r10);
        r0.putLong(r4.A0Z);
        r5.add(r0.array());
        r3 = "audio/opus";
        r11 = 5760;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0366, code lost:
        r3 = "audio/flac";
        r5 = java.util.Collections.singletonList(r4.A00(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0372, code lost:
        r3 = "audio/eac3";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0376, code lost:
        r3 = "video/mpeg2";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x037a, code lost:
        r3 = "application/x-subrip";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x037d, code lost:
        r2 = X.C156327gR.A00(new X.C161467pi(r4.A00(r10)));
        r5 = r2.A02;
        r4.A0R = r2.A00;
        r10 = r2.A01;
        r3 = "video/hevc";
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0396, code lost:
        r3 = "text/x-ssa";
        r5 = X.C129586aY.of(A0t, r4.A00(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03a4, code lost:
        r10 = r4.A0D;
        r12 = X.C162387ry.A01(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03aa, code lost:
        if (r12 != 0) goto L_0x0599;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03ac, code lost:
        r3 = X.AnonymousClass001.A0o();
        r0 = "Unsupported little endian PCM bit depth: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03b4, code lost:
        r10 = r4.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03b6, code lost:
        if (r10 != 8) goto L_0x0595;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03b8, code lost:
        r5 = null;
        r10 = null;
        r12 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03be, code lost:
        r3 = "video/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03c2, code lost:
        r5 = null;
        r10 = null;
        r3 = "application/pgs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03c9, code lost:
        r3 = "video/x-vnd.on2.vp9";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03cd, code lost:
        r3 = "video/x-vnd.on2.vp8";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03d1, code lost:
        r3 = "video/av01";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03d5, code lost:
        r3 = "audio/vnd.dts";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03d9, code lost:
        r3 = "audio/ac3";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03dd, code lost:
        r5 = java.util.Collections.singletonList(r4.A00(r10));
        r3 = r4.A0l;
        r2 = X.C159817mV.A00(new X.C160807oL(r3, r3.length), false);
        r4.A0U = r2.A01;
        r4.A0F = r2.A00;
        r10 = r2.A02;
        r3 = "audio/mp4a-latm";
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03ff, code lost:
        r3 = "audio/vnd.dts.hd";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0403, code lost:
        r3 = "application/vobsub";
        r5 = X.C129586aY.of(r4.A00(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x040f, code lost:
        r2 = X.C156827hH.A00(new X.C161467pi(r4.A00(r10)));
        r5 = r2.A05;
        r4.A0R = r2.A02;
        r10 = r2.A04;
        r3 = "video/avc";
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0426, code lost:
        r12 = -1;
        r11 = -1;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x042a, code lost:
        r2 = new byte[4];
        java.lang.System.arraycopy(r4.A00(r10), 0, r2, 0, 4);
        r3 = "application/dvbsubs";
        r5 = X.C129586aY.of(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x043b, code lost:
        r11 = new X.C161467pi(r4.A00(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:?, code lost:
        r11.A0T(16);
        r12 = r11.A0G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0450, code lost:
        if (r12 != 1482049860) goto L_0x045b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0452, code lost:
        r0 = X.AnonymousClass0x9.A0C("video/divx", (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0460, code lost:
        if (r12 != 859189832) goto L_0x046b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0462, code lost:
        r0 = X.AnonymousClass0x9.A0C("video/3gpp", (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0470, code lost:
        if (r12 != 826496599) goto L_0x04a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0472, code lost:
        r10 = r11.A01 + 20;
        r5 = r11.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0478, code lost:
        r3 = r5.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x047b, code lost:
        if (r10 >= (r3 - 4)) goto L_0x103e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x047f, code lost:
        if (r5[r10] != 0) goto L_0x04a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0485, code lost:
        if (r5[r10 + 1] != 0) goto L_0x04a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x048b, code lost:
        if (r5[r10 + 2] != 1) goto L_0x04a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0493, code lost:
        if (r5[r10 + 3] != 15) goto L_0x04a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0495, code lost:
        r0 = X.AnonymousClass0x9.A0C("video/wvc1", java.util.Collections.singletonList(java.util.Arrays.copyOfRange(r5, r10, r3)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04a4, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x04a7, code lost:
        android.util.Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
        r0 = X.AnonymousClass0x9.A0C("video/x-unknown", (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x04b4, code lost:
        r3 = (java.lang.String) r0.first;
        r5 = (java.util.List) r0.second;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04be, code lost:
        r3 = "audio/mpeg";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04c1, code lost:
        r3 = "audio/mpeg-L2";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04c3, code lost:
        r5 = null;
        r10 = null;
        r12 = -1;
        r11 = com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.UNZIP_BUFFER_SIZE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04cb, code lost:
        r11 = r4.A00(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04d4, code lost:
        if (r11[0] != 2) goto L_0x1056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04d6, code lost:
        r3 = 1;
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04d8, code lost:
        r2 = r11[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04de, code lost:
        if ((r2 & 255) != 255) goto L_0x04e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04e0, code lost:
        r13 = r13 + 255;
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04e5, code lost:
        r3 = r3 + 1;
        r13 = r13 + (r2 & 255);
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04ea, code lost:
        r2 = r11[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04ee, code lost:
        if ((r2 & 255) != 255) goto L_0x04f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04f0, code lost:
        r12 = r12 + 255;
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04f5, code lost:
        r5 = r3 + 1;
        r12 = r12 + (r2 & 255);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04fb, code lost:
        if (r11[r5] != 1) goto L_0x1051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04fd, code lost:
        r3 = new byte[r13];
        java.lang.System.arraycopy(r11, r5, r3, 0, r13);
        r5 = r5 + r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0505, code lost:
        if (r11[r5] != 3) goto L_0x105b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0507, code lost:
        r5 = r5 + r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x050b, code lost:
        if (r11[r5] != 5) goto L_0x104c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x050d, code lost:
        r2 = r11.length - r5;
        r0 = new byte[r2];
        java.lang.System.arraycopy(r11, r5, r0, 0, r2);
        r5 = X.AnonymousClass002.A0I(2);
        r5.add(r3);
        r5.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x051e, code lost:
        r3 = "audio/vorbis";
        r11 = com.facebook.msys.mci.DefaultCrypto.BUFFER_SIZE;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0522, code lost:
        r10 = null;
        r12 = -1;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0527, code lost:
        r4.A0d = new X.AnonymousClass7UE();
        r3 = "audio/true-hd";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0531, code lost:
        r12 = new X.C161467pi(r4.A00(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:?, code lost:
        r10 = r12.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x053e, code lost:
        if (r10 == 1) goto L_0x056f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0543, code lost:
        if (r10 != 65534) goto L_0x0565;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0545, code lost:
        r12.A0S(24);
        r16 = r12.A0H();
        r15 = A0s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0556, code lost:
        if (r16 != r15.getMostSignificantBits()) goto L_0x0565;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0562, code lost:
        if (r12.A0H() != r15.getLeastSignificantBits()) goto L_0x0565;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0565, code lost:
        r3 = X.AnonymousClass001.A0o();
        r3.append("Non-PCM MS/ACM is unsupported. Setting mimeType to ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x056f, code lost:
        r10 = r4.A0D;
        r12 = X.C162387ry.A01(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0575, code lost:
        if (r12 != 0) goto L_0x0599;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0577, code lost:
        r3 = X.AnonymousClass001.A0o();
        r0 = "Unsupported PCM bit depth: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x057e, code lost:
        r10 = r4.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0582, code lost:
        if (r10 == 32) goto L_0x0599;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0584, code lost:
        r3 = X.AnonymousClass001.A0o();
        r0 = "Unsupported floating point PCM bit depth: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x058a, code lost:
        X.C18270x1.A19(r0, ". Setting mimeType to ", r3, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x058d, code lost:
        X.AnonymousClass000.A1F("audio/x-unknown", "MatroskaExtractor", r3);
        r3 = "audio/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0591, code lost:
        r5 = null;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0595, code lost:
        if (r10 != 16) goto L_0x059d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0597, code lost:
        r12 = 268435456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0599, code lost:
        r5 = null;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x059d, code lost:
        r3 = X.AnonymousClass001.A0o();
        r0 = "Unsupported big endian PCM bit depth: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x05a4, code lost:
        r0 = r4.A0l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05a6, code lost:
        if (r0 != null) goto L_0x07ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05a8, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05aa, code lost:
        r3 = "video/mp4v-es";
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05ac, code lost:
        r10 = null;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x05ae, code lost:
        r12 = -1;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05af, code lost:
        r11 = -1;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05b0, code lost:
        r2 = r4.A0m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05b2, code lost:
        if (r2 == null) goto L_0x05c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x05b4, code lost:
        r0 = X.C155727fP.A00(new X.C161467pi(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05bd, code lost:
        if (r0 == null) goto L_0x05c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05bf, code lost:
        r10 = r0.A00;
        r3 = "video/dolby-vision";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x05c3, code lost:
        r17 = r4.A0h | X.C18310x6.A02(r4.A0i ? 1 : 0);
        r2 = X.C157057he.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x05d7, code lost:
        if (X.C162107rG.A03(r3) == false) goto L_0x0628;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x05d9, code lost:
        r2.A04 = r4.A0F;
        r2.A0D = r4.A0U;
        r2.A09 = r12;
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x05e4, code lost:
        r7 = r4.A0g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x05e6, code lost:
        if (r7 == null) goto L_0x05f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x05ee, code lost:
        if (A0r.containsKey(r7) != false) goto L_0x05f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x05f0, code lost:
        r2.A0P = r4.A0g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x05f4, code lost:
        r2.A0O = java.lang.Integer.toString(r25);
        r2.A0R = r3;
        r2.A08 = r11;
        r2.A0Q = r4.A0f;
        r2.A0E = r17 ? 1 : 0;
        r2.A0S = r5;
        r2.A0M = r10;
        r2.A0I = r4.A0a;
        r3 = X.C166527yp.A00(r2);
        r0 = r26.Br0(r4.A0S, r6);
        r4.A0c = r0;
        r0.B3T(r3);
        r1.A0d.put(r4.A0S, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x062c, code lost:
        if (X.C162107rG.A05(r3) == false) goto L_0x078d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0630, code lost:
        if (r4.A0L != 0) goto L_0x078a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0632, code lost:
        r0 = r4.A0M;
        r7 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0635, code lost:
        if (r0 != -1) goto L_0x0639;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0637, code lost:
        r0 = r4.A0X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0639, code lost:
        r4.A0M = r0;
        r0 = r4.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x063d, code lost:
        if (r0 != -1) goto L_0x0641;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x063f, code lost:
        r0 = r4.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0641, code lost:
        r4.A0K = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0643, code lost:
        r6 = r4.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0645, code lost:
        if (r6 == r7) goto L_0x0786;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0647, code lost:
        r12 = r4.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0649, code lost:
        if (r12 == r7) goto L_0x0786;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x064b, code lost:
        r6 = ((float) (r4.A0N * r6)) / ((float) (r4.A0X * r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0656, code lost:
        if (r4.A0j == false) goto L_0x0708;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x065e, code lost:
        if (r4.A06 == -1.0f) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0664, code lost:
        if (r4.A07 == -1.0f) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x066a, code lost:
        if (r4.A04 == -1.0f) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0670, code lost:
        if (r4.A05 == -1.0f) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0676, code lost:
        if (r4.A02 == -1.0f) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x067c, code lost:
        if (r4.A03 == -1.0f) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0682, code lost:
        if (r4.A0B == -1.0f) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0688, code lost:
        if (r4.A0C == -1.0f) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x068e, code lost:
        if (r4.A00 == -1.0f) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0694, code lost:
        if (r4.A01 == -1.0f) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0696, code lost:
        r16 = new byte[25];
        r12 = java.nio.ByteBuffer.wrap(r16).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r12.put((byte) 0);
        r12.putShort((short) ((int) ((r4.A06 * 50000.0f) + 0.5f)));
        A01(r12, r4.A07);
        A01(r12, r4.A04);
        A01(r12, r4.A05);
        A01(r12, r4.A02);
        A01(r12, r4.A03);
        A01(r12, r4.A0B);
        A01(r12, r4.A0C);
        r12.putShort((short) ((int) (r4.A00 + 0.5f)));
        r12.putShort((short) ((int) (r4.A01 + 0.5f)));
        r12.putShort((short) r4.A0P);
        r12.putShort((short) r4.A0Q);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x06f6, code lost:
        r14 = new X.C166497ym(r4.A0H, r16, r4.A0G, r4.A0I);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0708, code lost:
        r0 = r4.A0g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x070a, code lost:
        if (r0 == null) goto L_0x071e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x070c, code lost:
        r12 = A0r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0712, code lost:
        if (r12.containsKey(r0) == false) goto L_0x071e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0714, code lost:
        r7 = X.AnonymousClass001.A0K(r12.get(r4.A0g));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0720, code lost:
        if (r4.A0T != 0) goto L_0x077c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0729, code lost:
        if (java.lang.Float.compare(r4.A0A, 0.0f) != 0) goto L_0x077c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x072b, code lost:
        r12 = r4.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0731, code lost:
        if (java.lang.Float.compare(r12, 0.0f) != 0) goto L_0x077c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0739, code lost:
        if (java.lang.Float.compare(r4.A09, 0.0f) == 0) goto L_0x0745;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0741, code lost:
        if (java.lang.Float.compare(r12, 90.0f) != 0) goto L_0x0762;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0743, code lost:
        r19 = 90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0745, code lost:
        r2.A0G = r4.A0X;
        r2.A07 = r4.A0N;
        r2.A01 = r6;
        r2.A0C = r19;
        r2.A0T = r4.A0n;
        r2.A0F = r4.A0V;
        r2.A0K = r20;
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0768, code lost:
        if (java.lang.Float.compare(r12, -180.0f) == 0) goto L_0x077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0770, code lost:
        if (java.lang.Float.compare(r12, 180.0f) == 0) goto L_0x077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0772, code lost:
        r19 = 270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x077a, code lost:
        if (java.lang.Float.compare(r12, -90.0f) == 0) goto L_0x0745;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x077c, code lost:
        r19 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x077f, code lost:
        r19 = 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0782, code lost:
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0786, code lost:
        r6 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x078a, code lost:
        r7 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0791, code lost:
        if ("application/x-subrip".equals(r3) != false) goto L_0x05e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0799, code lost:
        if ("text/x-ssa".equals(r3) != false) goto L_0x05e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x07a1, code lost:
        if ("application/vobsub".equals(r3) != false) goto L_0x05e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x07a9, code lost:
        if ("application/pgs".equals(r3) != false) goto L_0x05e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x07b1, code lost:
        if ("application/dvbsubs".equals(r3) != false) goto L_0x05e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x07b9, code lost:
        throw X.AnonymousClass6u7.A01("Unexpected MIME type.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x07ba, code lost:
        r5 = java.util.Collections.singletonList(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x095c, code lost:
        if (r1 == 2) goto L_0x0ca5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x095f, code lost:
        if (r1 == 3) goto L_0x0c2c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0961, code lost:
        if (r1 == 4) goto L_0x0997;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0963, code lost:
        r0 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x0969, code lost:
        if (r0 == 4) goto L_0x097e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x096d, code lost:
        if (r0 == 8) goto L_0x097e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x097d, code lost:
        throw X.AnonymousClass6u7.A01(X.AnonymousClass000.A0Z("Invalid float size: ", X.AnonymousClass001.A0o(), r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x097e, code lost:
        r6 = (int) r0;
        r11 = r10.A06;
        r7 = 0;
        r29.readFully(r11, 0, r6);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0989, code lost:
        if (r7 >= r6) goto L_0x0ee7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x098b, code lost:
        r0 = (r0 << 8) | ((long) (r11[r7] & 255));
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0997, code lost:
        r11 = (int) r10.A02;
        r6 = ((X.C1687986u) r3).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x09a2, code lost:
        if (r2 == 161) goto L_0x0a53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x09a4, code lost:
        if (r2 == 163) goto L_0x0a53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x09a8, code lost:
        if (r2 == 165) goto L_0x09f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x09ac, code lost:
        if (r2 == 16877) goto L_0x09e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x09b0, code lost:
        if (r2 == 16981) goto L_0x09da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x09b4, code lost:
        if (r2 == 18402) goto L_0x0a38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x09b8, code lost:
        if (r2 == 21419) goto L_0x0a1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x09bc, code lost:
        if (r2 == 25506) goto L_0x09d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x09c0, code lost:
        if (r2 != 30322) goto L_0x1073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x09c2, code lost:
        r1 = new byte[r11];
        A00(r6, r2).A0n = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x09ca, code lost:
        r29.readFully(r1, 0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x09d1, code lost:
        r1 = new byte[r11];
        A00(r6, r2).A0l = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x09da, code lost:
        r1 = new byte[r11];
        A00(r6, r2).A0o = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x09e3, code lost:
        r2 = A00(r6, 16877);
        r1 = r2.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x09ec, code lost:
        if (r1 == 1685485123) goto L_0x09f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x09f1, code lost:
        if (r1 != 1685480259) goto L_0x0a4c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x09f3, code lost:
        r1 = new byte[r11];
        r2.A0m = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x09fa, code lost:
        if (r6.A05 != 2) goto L_0x0f02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x09fc, code lost:
        r2 = (X.C151327Uh) r6.A0d.get(r6.A06);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0a08, code lost:
        if (r6.A01 != 4) goto L_0x0a4c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0a12, code lost:
        if ("V_VP9".equals(r2.A0e) == false) goto L_0x0a4c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0a14, code lost:
        r0 = r6.A0g;
        r0.A0Q(r11);
        r1 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0a1c, code lost:
        r3 = r6.A0n;
        java.util.Arrays.fill(r3.A02, (byte) 0);
        r29.readFully(r3.A02, 4 - r11, r11);
        r3.A0S(0);
        r6.A0C = (int) r3.A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0a38, code lost:
        r2 = new byte[r11];
        r29.readFully(r2, 0, r11);
        A00(r6, 18402).A0b = new X.AnonymousClass7WZ(1, r2, 0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0a4c, code lost:
        r29.BpP(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0a53, code lost:
        r18 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0a57, code lost:
        if (r6.A05 != 0) goto L_0x0a78;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0a59, code lost:
        r7 = r6.A0f;
        r6.A06 = (int) r7.A00(r29, 8, false, true);
        r6.A07 = r7.A00;
        r6.A0D = -9223372036854775807L;
        r6.A05 = 1;
        r6.A0m.A0Q(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0a78, code lost:
        r7 = (X.C151327Uh) r6.A0d.get(r6.A06);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0a82, code lost:
        if (r7 != null) goto L_0x0a90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0a84, code lost:
        r29.BpP(r11 - r6.A07);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0a8c, code lost:
        r6.A05 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0a90, code lost:
        r7.A0c.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0a97, code lost:
        if (r6.A05 != 1) goto L_0x0aea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0a99, code lost:
        r1 = r29;
        r6.A07(r1, 3);
        r14 = r6.A0m;
        r12 = (r14.A02[2] & 6) >> 1;
        r0 = 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0aad, code lost:
        if (r12 != 0) goto L_0x0b27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0aaf, code lost:
        r6.A03 = 1;
        r3 = r6.A0c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0ab3, code lost:
        if (r3 != null) goto L_0x0b1d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0ab5, code lost:
        r3 = new int[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0ab7, code lost:
        r6.A0c = r3;
        r3[0] = (r11 - r6.A07) - 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0ac0, code lost:
        r11 = r14.A02;
        r6.A0E = r6.A0F + r6.A04((long) ((r11[0] << r18) | (r11[1] & r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0ad6, code lost:
        if (r7.A0W == 2) goto L_0x0ae3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0ada, code lost:
        if (r2 != 163) goto L_0x0b1b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0ae1, code lost:
        if ((r11[2] & 128) != 128) goto L_0x0b1b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0ae3, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0ae4, code lost:
        r6.A02 = r0;
        r6.A05 = 2;
        r6.A04 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0aec, code lost:
        if (r2 != 163) goto L_0x0c13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0aee, code lost:
        r1 = r6.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0af2, code lost:
        if (r1 >= r6.A03) goto L_0x0a8c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0af4, code lost:
        r6.A08(r7, r6.A02, r6.A03(r29, r7, r6.A0c[r1]), 0, ((long) ((r6.A04 * r7.A0J) / 1000)) + r6.A0E);
        r6.A04++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0b1b, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0b1e, code lost:
        if (r3.length >= 1) goto L_0x0ab7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0b20, code lost:
        r3 = new int[java.lang.Math.max(0, 1)];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0b27, code lost:
        r13 = 4;
        r6.A07(r1, 4);
        r15 = (r14.A02[3] & 255) + 1;
        r6.A03 = r15;
        r3 = r6.A0c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0b36, code lost:
        if (r3 != null) goto L_0x0b48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0b38, code lost:
        r3 = new int[r15];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0b3a, code lost:
        r6.A0c = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0b3c, code lost:
        if (r12 != 2) goto L_0x0b54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0b3e, code lost:
        java.util.Arrays.fill(r3, 0, r15, ((r11 - r6.A07) - 4) / r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0b48, code lost:
        r1 = r3.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0b49, code lost:
        if (r1 >= r15) goto L_0x0b3a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0b4b, code lost:
        r3 = new int[java.lang.Math.max(r1 * 2, r15)];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0b54, code lost:
        if (r12 != 1) goto L_0x0b83;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0b56, code lost:
        r12 = 0;
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0b58, code lost:
        r4 = r6.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0b5c, code lost:
        if (r12 >= (r4 - 1)) goto L_0x0b7b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0b5e, code lost:
        r3[r12] = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0b60, code lost:
        r13 = r13 + 1;
        r6.A07(r29, r13);
        r4 = r14.A02[r13 - 1] & 255;
        r3 = r6.A0c;
        r1 = r3[r12] + r4;
        r3[r12] = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0b75, code lost:
        if (r4 == 255) goto L_0x0b60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0b77, code lost:
        r15 = r15 + r1;
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x0b7b, code lost:
        r4 = r4 - 1;
        r11 = ((r11 - r6.A07) - r13) - r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0b85, code lost:
        if (r12 != 3) goto L_0x108c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0b87, code lost:
        r15 = 0;
        r20 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0b8a, code lost:
        r4 = r6.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0b8e, code lost:
        if (r15 >= (r4 - 1)) goto L_0x0c08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x0b90, code lost:
        r3[r15] = 0;
        r13 = r13 + 1;
        r6.A07(r29, r13);
        r3 = r14.A02;
        r17 = r13 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0b9f, code lost:
        if (r3[r17] == 0) goto L_0x1085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0ba1, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0ba2, code lost:
        r4 = 1 << (7 - r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0ba9, code lost:
        if ((r3[r17] & r4) == 0) goto L_0x0bd1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0bab, code lost:
        r13 = r13 + r12;
        r6.A07(r29, r13);
        r1 = r14.A02;
        r19 = r1;
        r16 = r17 + 1;
        r3 = (long) ((~r4) & (r1[r17] & r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x0bbf, code lost:
        if (r16 >= r13) goto L_0x0bda;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x0bc1, code lost:
        r3 = (r3 << r18) | ((long) (r19[r16] & r0));
        r16 = r16 + 1;
        r18 = 8;
        r0 = 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0bd1, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0bd5, code lost:
        if (r12 < r18) goto L_0x0ba2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x0bd7, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0bda, code lost:
        if (r15 <= 0) goto L_0x0be7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0bdc, code lost:
        r3 = r3 - ((1 << ((r12 * 7) + 6)) - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0bec, code lost:
        if (r3 < -2147483648L) goto L_0x107e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0bf3, code lost:
        if (r3 > 2147483647L) goto L_0x107e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0bf5, code lost:
        r1 = (int) r3;
        r3 = r6.A0c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0bf8, code lost:
        if (r15 == 0) goto L_0x0bff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0bfa, code lost:
        r1 = r1 + r3[r15 - 1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x0bff, code lost:
        r3[r15] = r1;
        r20 = r20 + r1;
        r15 = r15 + 1;
        r0 = 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x0c08, code lost:
        r4 = r4 - 1;
        r11 = ((r11 - r6.A07) - r13) - r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x0c0f, code lost:
        r3[r4] = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0c13, code lost:
        r3 = r6.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x0c17, code lost:
        if (r3 >= r6.A03) goto L_0x0f02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x0c19, code lost:
        r2 = r6.A0c;
        r2[r3] = r6.A03(r29, r7, r2[r3]);
        r6.A04++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x0c2c, code lost:
        r0 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x0c33, code lost:
        if (r0 > 2147483647L) goto L_0x1097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x0c35, code lost:
        r6 = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0c36, code lost:
        if (r6 != 0) goto L_0x0c57;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x0c38, code lost:
        r5 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x0c3a, code lost:
        r1 = ((X.C1687986u) r3).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0c40, code lost:
        if (r2 == 134) goto L_0x0c9d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x0c44, code lost:
        if (r2 == 17026) goto L_0x0c76;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x0c48, code lost:
        if (r2 == 21358) goto L_0x0c6e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x0c4d, code lost:
        if (r2 != 2274716) goto L_0x0f02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x0c4f, code lost:
        A00(r1, 2274716).A0f = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x0c57, code lost:
        r4 = new byte[r6];
        r29.readFully(r4, 0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:594:0x0c5e, code lost:
        if (r6 <= 0) goto L_0x0c68;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:0x0c60, code lost:
        r1 = r6 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x0c64, code lost:
        if (r4[r1] != 0) goto L_0x0c68;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:597:0x0c66, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:598:0x0c68, code lost:
        r5 = new java.lang.String(r4, 0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:599:0x0c6e, code lost:
        A00(r1, 21358).A0g = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:601:0x0c7c, code lost:
        if ("webm".equals(r5) != false) goto L_0x0f02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x0c84, code lost:
        if ("matroska".equals(r5) != false) goto L_0x0f02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:604:0x0c86, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("DocType ");
        r1.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:605:0x0c9c, code lost:
        throw X.AnonymousClass6u7.A01(X.AnonymousClass000.A0X(" not supported", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x0c9d, code lost:
        A00(r1, 134).A0e = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:607:0x0ca5, code lost:
        r0 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x0ca9, code lost:
        if (r0 > 8) goto L_0x10b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:0x0cab, code lost:
        r11 = (int) r0;
        r13 = r10.A06;
        r12 = 0;
        r29.readFully(r13, 0, r11);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:0x0cb6, code lost:
        if (r12 >= r11) goto L_0x0cc4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:0x0cb8, code lost:
        r0 = (r0 << 8) | ((long) (r13[r12] & 255));
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:612:0x0cc4, code lost:
        r3 = ((X.C1687986u) r3).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:613:0x0ccc, code lost:
        if (r2 == 20529) goto L_0x0ed3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:615:0x0cd2, code lost:
        if (r2 == 20530) goto L_0x0ec1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:616:0x0cd4, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:617:0x0cd6, code lost:
        switch(r2) {
            case 131: goto L_0x0d50;
            case 136: goto L_0x0d59;
            case 155: goto L_0x0de6;
            case 159: goto L_0x0d66;
            case org.wawebrtc.MediaCodecVideoEncoder.MIN_ENCODER_WIDTH :int: goto L_0x0d6f;
            case 179: goto L_0x0dee;
            case 186: goto L_0x0d78;
            case 215: goto L_0x0d81;
            case 231: goto L_0x0dfc;
            case 238: goto L_0x0e04;
            case 241: goto L_0x0e09;
            case 251: goto L_0x0e19;
            case 16871: goto L_0x0d8a;
            case 16980: goto L_0x0e1d;
            case 17029: goto L_0x0e31;
            case 17143: goto L_0x0e3d;
            case 18401: goto L_0x0e4f;
            case 18408: goto L_0x0e63;
            case 21420: goto L_0x0e75;
            case 21432: goto L_0x0e7c;
            case 21680: goto L_0x0d93;
            case 21682: goto L_0x0d9c;
            case 21690: goto L_0x0da5;
            case 21930: goto L_0x0dae;
            case 21998: goto L_0x0dbb;
            case 22186: goto L_0x0dc4;
            case 22203: goto L_0x0dcc;
            case 25188: goto L_0x0dd4;
            case 30321: goto L_0x0e9e;
            case 2352003: goto L_0x0ddd;
            case 2807729: goto L_0x0ebe;
            default: goto L_0x0cd9;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:619:0x0cdb, code lost:
        switch(r2) {
            case 21945: goto L_0x0cf2;
            case 21946: goto L_0x0d06;
            case 21947: goto L_0x0d2c;
            case 21948: goto L_0x0ce0;
            case 21949: goto L_0x0ce9;
            default: goto L_0x0cde;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:0x0ce0, code lost:
        A00(r3, r2).A0P = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:621:0x0ce9, code lost:
        A00(r3, r2).A0Q = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:622:0x0cf2, code lost:
        r3.A06(r2);
        r2 = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:623:0x0cf6, code lost:
        if (r2 == 1) goto L_0x0d00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:624:0x0cf8, code lost:
        if (r2 != 2) goto L_0x0f02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:625:0x0cfa, code lost:
        r3.A0P.A0G = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:626:0x0d00, code lost:
        r3.A0P.A0G = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:627:0x0d06, code lost:
        r3.A06(r2);
        r2 = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:628:0x0d0a, code lost:
        if (r2 == 1) goto L_0x0d26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:630:0x0d0e, code lost:
        if (r2 == 16) goto L_0x0d20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:632:0x0d12, code lost:
        if (r2 == 18) goto L_0x0d1a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:633:0x0d14, code lost:
        if (r2 == 6) goto L_0x0d26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:634:0x0d16, code lost:
        if (r2 == 7) goto L_0x0d26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:635:0x0d1a, code lost:
        r3.A0P.A0I = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:636:0x0d20, code lost:
        r3.A0P.A0I = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:637:0x0d26, code lost:
        r3.A0P.A0I = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:638:0x0d2c, code lost:
        r3 = A00(r3, r2);
        r3.A0j = true;
        r2 = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:639:0x0d33, code lost:
        if (r2 == 1) goto L_0x0d4c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:641:0x0d37, code lost:
        if (r2 == 9) goto L_0x0d48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:642:0x0d39, code lost:
        if (r2 == 4) goto L_0x0d44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:644:0x0d3c, code lost:
        if (r2 == 5) goto L_0x0d44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:645:0x0d3e, code lost:
        if (r2 == 6) goto L_0x0d44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:646:0x0d40, code lost:
        if (r2 == 7) goto L_0x0d44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:647:0x0d44, code lost:
        r3.A0H = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:648:0x0d48, code lost:
        r3.A0H = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:649:0x0d4c, code lost:
        r3.A0H = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:650:0x0d50, code lost:
        A00(r3, r2).A0W = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:651:0x0d59, code lost:
        r3 = A00(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:652:0x0d5f, code lost:
        if (r0 != 1) goto L_0x0d62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:653:0x0d61, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:654:0x0d62, code lost:
        r3.A0h = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:655:0x0d66, code lost:
        A00(r3, r2).A0F = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:656:0x0d6f, code lost:
        A00(r3, r2).A0X = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:657:0x0d78, code lost:
        A00(r3, r2).A0N = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:658:0x0d81, code lost:
        A00(r3, r2).A0S = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:659:0x0d8a, code lost:
        A00(r3, r2).A0E = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:660:0x0d93, code lost:
        A00(r3, r2).A0M = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:661:0x0d9c, code lost:
        A00(r3, r2).A0L = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:662:0x0da5, code lost:
        A00(r3, r2).A0K = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:663:0x0dae, code lost:
        r3 = A00(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:664:0x0db4, code lost:
        if (r0 != 1) goto L_0x0db7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:665:0x0db6, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:666:0x0db7, code lost:
        r3.A0i = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:667:0x0dbb, code lost:
        A00(r3, r2).A0O = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:668:0x0dc4, code lost:
        A00(r3, r2).A0Y = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:669:0x0dcc, code lost:
        A00(r3, r2).A0Z = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:670:0x0dd4, code lost:
        A00(r3, r2).A0D = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:671:0x0ddd, code lost:
        A00(r3, r2).A0J = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:672:0x0de6, code lost:
        r3.A0D = r3.A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:673:0x0dee, code lost:
        r3.A05(r2);
        r3.A0R.A00(r3.A04(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:674:0x0dfc, code lost:
        r3.A0F = r3.A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:675:0x0e04, code lost:
        r3.A01 = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:677:0x0e0b, code lost:
        if (r3.A0a != false) goto L_0x0f02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:678:0x0e0d, code lost:
        r3.A05(r2);
        r3.A0Q.A00(r0);
        r3.A0a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:679:0x0e19, code lost:
        r3.A0T = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:681:0x0e21, code lost:
        if (r0 == 3) goto L_0x0f02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:682:0x0e23, code lost:
        r3 = X.AnonymousClass001.A0o();
        X.C18310x6.A1N("ContentCompAlgo ", " not supported", r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:683:0x0e30, code lost:
        throw X.AnonymousClass6u7.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:685:0x0e33, code lost:
        if (r0 < 1) goto L_0x10a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:687:0x0e39, code lost:
        if (r0 > 2) goto L_0x10a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:689:0x0e3f, code lost:
        if (r0 == 1) goto L_0x0f02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:690:0x0e41, code lost:
        r3 = X.AnonymousClass001.A0o();
        X.C18310x6.A1N("EBMLReadVersion ", " not supported", r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:691:0x0e4e, code lost:
        throw X.AnonymousClass6u7.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:693:0x0e53, code lost:
        if (r0 == 5) goto L_0x0f02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:694:0x0e55, code lost:
        r3 = X.AnonymousClass001.A0o();
        X.C18310x6.A1N("ContentEncAlgo ", " not supported", r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:695:0x0e62, code lost:
        throw X.AnonymousClass6u7.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:697:0x0e65, code lost:
        if (r0 == 1) goto L_0x0f02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:698:0x0e67, code lost:
        r3 = X.AnonymousClass001.A0o();
        X.C18310x6.A1N("AESSettingsCipherMode ", " not supported", r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:699:0x0e74, code lost:
        throw X.AnonymousClass6u7.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:700:0x0e75, code lost:
        r3.A0J = r0 + r3.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:701:0x0e7c, code lost:
        r4 = (int) r0;
        r3.A06(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:702:0x0e80, code lost:
        if (r4 == 0) goto L_0x0e99;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:703:0x0e82, code lost:
        if (r4 == 1) goto L_0x0e94;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:704:0x0e84, code lost:
        if (r4 == 3) goto L_0x0e8f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:706:0x0e88, code lost:
        if (r4 != 15) goto L_0x0f02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:707:0x0e8a, code lost:
        r3.A0P.A0V = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:708:0x0e8f, code lost:
        r3.A0P.A0V = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:709:0x0e94, code lost:
        r3.A0P.A0V = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:710:0x0e99, code lost:
        r3.A0P.A0V = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:711:0x0e9e, code lost:
        r3.A06(r2);
        r2 = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:712:0x0ea2, code lost:
        if (r2 == 0) goto L_0x0eb9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:713:0x0ea4, code lost:
        if (r2 == 1) goto L_0x0eb4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:714:0x0ea6, code lost:
        if (r2 == 2) goto L_0x0eaf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:715:0x0ea8, code lost:
        if (r2 != 3) goto L_0x0f02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:716:0x0eaa, code lost:
        r3.A0P.A0T = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:717:0x0eaf, code lost:
        r3.A0P.A0T = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:718:0x0eb4, code lost:
        r3.A0P.A0T = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:719:0x0eb9, code lost:
        r3.A0P.A0T = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:720:0x0ebe, code lost:
        r3.A0N = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:722:0x0ec3, code lost:
        if (r0 == 1) goto L_0x0f02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:723:0x0ec5, code lost:
        r3 = X.AnonymousClass001.A0o();
        X.C18310x6.A1N("ContentEncodingScope ", " not supported", r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:724:0x0ed2, code lost:
        throw X.AnonymousClass6u7.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:726:0x0ed7, code lost:
        if (r0 == 0) goto L_0x0f02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:727:0x0ed9, code lost:
        r3 = X.AnonymousClass001.A0o();
        X.C18310x6.A1N("ContentEncodingOrder ", " not supported", r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:728:0x0ee6, code lost:
        throw X.AnonymousClass6u7.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:730:0x0ee8, code lost:
        if (r6 != 4) goto L_0x0f7a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:731:0x0eea, code lost:
        r0 = (double) java.lang.Float.intBitsToFloat((int) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:732:0x0ef0, code lost:
        r4 = ((X.C1687986u) r3).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:733:0x0ef6, code lost:
        if (r2 == 181) goto L_0x0f72;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:735:0x0efa, code lost:
        if (r2 == 17545) goto L_0x0f6e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:736:0x0efc, code lost:
        switch(r2) {
            case 21969: goto L_0x0f1e;
            case 21970: goto L_0x0f26;
            case 21971: goto L_0x0f2e;
            case 21972: goto L_0x0f36;
            case 21973: goto L_0x0f3e;
            case 21974: goto L_0x0f46;
            case 21975: goto L_0x0f4e;
            case 21976: goto L_0x0f56;
            case 21977: goto L_0x0f5e;
            case 21978: goto L_0x0f66;
            default: goto L_0x0eff;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:737:0x0eff, code lost:
        switch(r2) {
            case 30323: goto L_0x0f06;
            case 30324: goto L_0x0f0e;
            case 30325: goto L_0x0f16;
            default: goto L_0x0f02;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:738:0x0f02, code lost:
        r10.A01 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:739:0x0f06, code lost:
        A00(r4, r2).A0A = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:740:0x0f0e, code lost:
        A00(r4, r2).A08 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:741:0x0f16, code lost:
        A00(r4, r2).A09 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:742:0x0f1e, code lost:
        A00(r4, r2).A06 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:743:0x0f26, code lost:
        A00(r4, r2).A07 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:744:0x0f2e, code lost:
        A00(r4, r2).A04 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:745:0x0f36, code lost:
        A00(r4, r2).A05 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:746:0x0f3e, code lost:
        A00(r4, r2).A02 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:747:0x0f46, code lost:
        A00(r4, r2).A03 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:748:0x0f4e, code lost:
        A00(r4, r2).A0B = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:749:0x0f56, code lost:
        A00(r4, r2).A0C = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:750:0x0f5e, code lost:
        A00(r4, r2).A00 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:751:0x0f66, code lost:
        A00(r4, r2).A01 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:752:0x0f6e, code lost:
        r4.A0H = (long) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:753:0x0f72, code lost:
        A00(r4, 181).A0U = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:754:0x0f7a, code lost:
        r0 = java.lang.Double.longBitsToDouble(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:784:0x1044, code lost:
        throw X.AnonymousClass6u7.A01("Failed to find FourCC VC1 initialization data");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:787:0x104b, code lost:
        throw X.AnonymousClass6u7.A01("Error parsing FourCC private data");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:789:?, code lost:
        r0 = X.AnonymousClass6u7.A01("Error parsing vorbis codec private");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:790:0x1051, code lost:
        r0 = X.AnonymousClass6u7.A01("Error parsing vorbis codec private");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:791:0x1056, code lost:
        r0 = X.AnonymousClass6u7.A01("Error parsing vorbis codec private");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:792:0x105b, code lost:
        r0 = X.AnonymousClass6u7.A01("Error parsing vorbis codec private");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:793:0x105f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:796:0x1064, code lost:
        throw X.AnonymousClass6u7.A01("Error parsing vorbis codec private");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:799:0x106b, code lost:
        throw X.AnonymousClass6u7.A01("Error parsing MS/ACM codec private");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:803:0x107d, code lost:
        throw X.AnonymousClass6u7.A02("Unexpected id: ", X.AnonymousClass001.A0o(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:805:0x1084, code lost:
        throw X.AnonymousClass6u7.A01("EBML lacing sample size out of range.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:807:0x108b, code lost:
        throw X.AnonymousClass6u7.A01("No valid varint length mask found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:809:0x1096, code lost:
        throw X.AnonymousClass6u7.A02("Unexpected lacing value: ", X.AnonymousClass001.A0o(), r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:811:0x10a5, code lost:
        throw X.AnonymousClass6u7.A01(X.AnonymousClass000.A0Z("String element size: ", X.AnonymousClass001.A0o(), r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:812:0x10a6, code lost:
        r3 = X.AnonymousClass001.A0o();
        X.C18310x6.A1N("DocTypeReadVersion ", " not supported", r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:813:0x10b3, code lost:
        throw X.AnonymousClass6u7.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:815:0x10c2, code lost:
        throw X.AnonymousClass6u7.A01(X.AnonymousClass000.A0Z("Invalid integer size: ", X.AnonymousClass001.A0o(), r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int BiD(X.C187648xa r29, X.AnonymousClass7BG r30) {
        /*
            r28 = this;
            r9 = 0
            r27 = r28
            r0 = r27
            r0.A0U = r9
            r8 = 1
        L_0x0008:
            r0 = r27
            boolean r0 = r0.A0U
            if (r0 != 0) goto L_0x10e4
            r0 = r27
            X.8gy r10 = r0.A0e
            X.86v r10 = (X.C1688086v) r10
            X.8gx r0 = r10.A03
            X.C161487pm.A01(r0)
        L_0x0019:
            java.util.ArrayDeque r11 = r10.A05
            java.lang.Object r0 = r11.peek()
            X.7Fy r0 = (X.C147847Fy) r0
            if (r0 == 0) goto L_0x080d
            long r3 = r29.BBW()
            long r1 = r0.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x080d
            X.8gx r1 = r10.A03
            java.lang.Object r0 = r11.pop()
            X.7Fy r0 = (X.C147847Fy) r0
            int r2 = r0.A00
            X.86u r1 = (X.C1687986u) r1
            X.86a r1 = r1.A00
            X.8wK r0 = r1.A0O
            r26 = r0
            X.C161487pm.A01(r26)
            r0 = 160(0xa0, float:2.24E-43)
            if (r2 == r0) goto L_0x07c0
            r0 = 174(0xae, float:2.44E-43)
            r18 = 0
            if (r2 == r0) goto L_0x0157
            r0 = 19899(0x4dbb, float:2.7884E-41)
            r7 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r2 == r0) goto L_0x0144
            r0 = 25152(0x6240, float:3.5245E-41)
            if (r2 == r0) goto L_0x011e
            r0 = 28032(0x6d80, float:3.9281E-41)
            if (r2 == r0) goto L_0x010b
            r0 = 357149030(0x1549a966, float:4.072526E-26)
            if (r2 == r0) goto L_0x00ed
            r0 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r2 == r0) goto L_0x00e0
            if (r2 != r7) goto L_0x0fc5
            boolean r0 = r1.A0b
            if (r0 != 0) goto L_0x0fbf
            X.7Vf r0 = r1.A0R
            r22 = r0
            X.7Vf r0 = r1.A0Q
            r21 = r0
            long r6 = r1.A0L
            r2 = -1
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00d8
            long r4 = r1.A0I
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00d8
            if (r22 == 0) goto L_0x00d8
            r0 = r22
            int r15 = r0.A00
            if (r15 == 0) goto L_0x00d8
            if (r21 == 0) goto L_0x00d8
            r0 = r21
            int r0 = r0.A00
            r3 = r0
            if (r0 != r15) goto L_0x00d8
            int[] r13 = new int[r15]
            long[] r12 = new long[r15]
            long[] r11 = new long[r15]
            long[] r10 = new long[r15]
            r14 = 0
            r2 = 0
        L_0x00a1:
            if (r2 >= r15) goto L_0x00be
            if (r2 < 0) goto L_0x100f
            if (r2 >= r15) goto L_0x100f
            r0 = r22
            long[] r0 = r0.A01
            r16 = r0[r2]
            r10[r2] = r16
            if (r2 >= r3) goto L_0x0ff5
            r0 = r21
            long[] r0 = r0.A01
            r19 = r0[r2]
            long r16 = r6 + r19
            r12[r2] = r16
            int r2 = r2 + 1
            goto L_0x00a1
        L_0x00be:
            int r0 = r15 + -1
            if (r14 >= r0) goto L_0x0f80
            int r19 = r14 + 1
            r2 = r12[r19]
            r16 = r12[r14]
            long r2 = r2 - r16
            int r0 = (int) r2
            r13[r14] = r0
            r16 = r10[r19]
            r2 = r10[r14]
            long r16 = r16 - r2
            r11[r14] = r16
            r14 = r19
            goto L_0x00be
        L_0x00d8:
            long r2 = r1.A0I
            X.86k r2 = X.C1686986k.A00(r2)
            goto L_0x0fb8
        L_0x00e0:
            android.util.SparseArray r0 = r1.A0d
            int r0 = r0.size()
            if (r0 == 0) goto L_0x1029
            r26.B2W()
            goto L_0x0fc5
        L_0x00ed:
            long r2 = r1.A0N
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00fd
            r2 = 1000000(0xf4240, double:4.940656E-318)
            r1.A0N = r2
        L_0x00fd:
            long r2 = r1.A0H
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0fc5
            long r2 = r1.A04(r2)
            r1.A0I = r2
            goto L_0x0fc5
        L_0x010b:
            X.7Uh r1 = A00(r1, r2)
            boolean r0 = r1.A0k
            if (r0 == 0) goto L_0x0fc5
            byte[] r0 = r1.A0o
            if (r0 == 0) goto L_0x0fc5
            java.lang.String r0 = "Combining encryption and compression is not supported"
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x011e:
            X.7Uh r5 = A00(r1, r2)
            boolean r0 = r5.A0k
            if (r0 == 0) goto L_0x0fc5
            X.7WZ r0 = r5.A0b
            if (r0 == 0) goto L_0x1030
            X.7yc[] r4 = new X.C166397yc[r8]
            java.util.UUID r3 = X.C161207pD.A03
            byte[] r2 = r0.A03
            java.lang.String r1 = "video/webm"
            X.7yc r0 = new X.7yc
            r0.<init>(r1, r3, r2)
            r4[r9] = r0
            X.7z2 r1 = new X.7z2
            r0 = r18
            r1.<init>(r0, r4, r8)
            r5.A0a = r1
            goto L_0x0fc5
        L_0x0144:
            int r6 = r1.A0C
            r0 = -1
            if (r6 == r0) goto L_0x1037
            long r4 = r1.A0J
            r2 = -1
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x1037
            if (r6 != r7) goto L_0x0fc5
            r1.A0G = r4
            goto L_0x0fc5
        L_0x0157:
            X.7Uh r4 = r1.A0P
            X.C161487pm.A01(r4)
            java.lang.String r10 = r4.A0e
            if (r10 == 0) goto L_0x106c
            int r2 = r10.hashCode()
            switch(r2) {
                case -2095576542: goto L_0x01ca;
                case -2095575984: goto L_0x01c7;
                case -1985379776: goto L_0x01c4;
                case -1784763192: goto L_0x01c1;
                case -1730367663: goto L_0x01be;
                case -1482641358: goto L_0x01bb;
                case -1482641357: goto L_0x01b8;
                case -1373388978: goto L_0x01b5;
                case -933872740: goto L_0x01b2;
                case -538363189: goto L_0x01af;
                case -538363109: goto L_0x01ac;
                case -425012669: goto L_0x01a9;
                case -356037306: goto L_0x01a6;
                case 62923557: goto L_0x01a3;
                case 62923603: goto L_0x01a0;
                case 62927045: goto L_0x019d;
                case 82318131: goto L_0x019a;
                case 82338133: goto L_0x0197;
                case 82338134: goto L_0x0194;
                case 99146302: goto L_0x0191;
                case 444813526: goto L_0x018e;
                case 542569478: goto L_0x018b;
                case 635596514: goto L_0x0188;
                case 725948237: goto L_0x0185;
                case 725957860: goto L_0x0182;
                case 738597099: goto L_0x017f;
                case 855502857: goto L_0x017c;
                case 1422270023: goto L_0x0179;
                case 1809237540: goto L_0x0176;
                case 1950749482: goto L_0x0173;
                case 1950789798: goto L_0x0170;
                case 1951062397: goto L_0x016d;
                default: goto L_0x0167;
            }
        L_0x0167:
            r0 = r18
            r1.A0P = r0
            goto L_0x0fc5
        L_0x016d:
            java.lang.String r0 = "A_OPUS"
            goto L_0x01cc
        L_0x0170:
            java.lang.String r0 = "A_FLAC"
            goto L_0x01cc
        L_0x0173:
            java.lang.String r0 = "A_EAC3"
            goto L_0x01cc
        L_0x0176:
            java.lang.String r0 = "V_MPEG2"
            goto L_0x01cc
        L_0x0179:
            java.lang.String r0 = "S_TEXT/UTF8"
            goto L_0x01cc
        L_0x017c:
            java.lang.String r0 = "V_MPEGH/ISO/HEVC"
            goto L_0x01cc
        L_0x017f:
            java.lang.String r0 = "S_TEXT/ASS"
            goto L_0x01cc
        L_0x0182:
            java.lang.String r0 = "A_PCM/INT/LIT"
            goto L_0x01cc
        L_0x0185:
            java.lang.String r0 = "A_PCM/INT/BIG"
            goto L_0x01cc
        L_0x0188:
            java.lang.String r0 = "A_PCM/FLOAT/IEEE"
            goto L_0x01cc
        L_0x018b:
            java.lang.String r0 = "A_DTS/EXPRESS"
            goto L_0x01cc
        L_0x018e:
            java.lang.String r0 = "V_THEORA"
            goto L_0x01cc
        L_0x0191:
            java.lang.String r0 = "S_HDMV/PGS"
            goto L_0x01cc
        L_0x0194:
            java.lang.String r0 = "V_VP9"
            goto L_0x01cc
        L_0x0197:
            java.lang.String r0 = "V_VP8"
            goto L_0x01cc
        L_0x019a:
            java.lang.String r0 = "V_AV1"
            goto L_0x01cc
        L_0x019d:
            java.lang.String r0 = "A_DTS"
            goto L_0x01cc
        L_0x01a0:
            java.lang.String r0 = "A_AC3"
            goto L_0x01cc
        L_0x01a3:
            java.lang.String r0 = "A_AAC"
            goto L_0x01cc
        L_0x01a6:
            java.lang.String r0 = "A_DTS/LOSSLESS"
            goto L_0x01cc
        L_0x01a9:
            java.lang.String r0 = "S_VOBSUB"
            goto L_0x01cc
        L_0x01ac:
            java.lang.String r0 = "V_MPEG4/ISO/AVC"
            goto L_0x01cc
        L_0x01af:
            java.lang.String r0 = "V_MPEG4/ISO/ASP"
            goto L_0x01cc
        L_0x01b2:
            java.lang.String r0 = "S_DVBSUB"
            goto L_0x01cc
        L_0x01b5:
            java.lang.String r0 = "V_MS/VFW/FOURCC"
            goto L_0x01cc
        L_0x01b8:
            java.lang.String r0 = "A_MPEG/L3"
            goto L_0x01cc
        L_0x01bb:
            java.lang.String r0 = "A_MPEG/L2"
            goto L_0x01cc
        L_0x01be:
            java.lang.String r0 = "A_VORBIS"
            goto L_0x01cc
        L_0x01c1:
            java.lang.String r0 = "A_TRUEHD"
            goto L_0x01cc
        L_0x01c4:
            java.lang.String r0 = "A_MS/ACM"
            goto L_0x01cc
        L_0x01c7:
            java.lang.String r0 = "V_MPEG4/ISO/SP"
            goto L_0x01cc
        L_0x01ca:
            java.lang.String r0 = "V_MPEG4/ISO/AP"
        L_0x01cc:
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0167
            int r0 = r4.A0S
            r25 = r0
            r13 = 16
            r11 = 8
            r12 = 4
            r6 = 3
            r19 = 0
            switch(r2) {
                case -2095576542: goto L_0x0320;
                case -2095575984: goto L_0x0318;
                case -1985379776: goto L_0x0310;
                case -1784763192: goto L_0x0308;
                case -1730367663: goto L_0x0300;
                case -1482641358: goto L_0x02f8;
                case -1482641357: goto L_0x02f0;
                case -1373388978: goto L_0x02e8;
                case -933872740: goto L_0x02df;
                case -538363189: goto L_0x02d6;
                case -538363109: goto L_0x02cd;
                case -425012669: goto L_0x02c4;
                case -356037306: goto L_0x02bb;
                case 62923557: goto L_0x02b2;
                case 62923603: goto L_0x02a9;
                case 62927045: goto L_0x02a0;
                case 82318131: goto L_0x0296;
                case 82338133: goto L_0x028c;
                case 82338134: goto L_0x0282;
                case 99146302: goto L_0x0278;
                case 444813526: goto L_0x026e;
                case 542569478: goto L_0x0264;
                case 635596514: goto L_0x025a;
                case 725948237: goto L_0x0250;
                case 725957860: goto L_0x0246;
                case 738597099: goto L_0x023c;
                case 855502857: goto L_0x0232;
                case 1422270023: goto L_0x0228;
                case 1809237540: goto L_0x021e;
                case 1950749482: goto L_0x0214;
                case 1950789798: goto L_0x020a;
                case 1951062397: goto L_0x0200;
                default: goto L_0x01e1;
            }
        L_0x01e1:
            r15 = -1
        L_0x01e2:
            java.lang.String r24 = "application/dvbsubs"
            java.lang.String r23 = "application/pgs"
            java.lang.String r22 = "application/vobsub"
            java.lang.String r21 = "text/x-ssa"
            java.lang.String r7 = "application/x-subrip"
            java.lang.String r14 = ". Setting mimeType to "
            java.lang.String r3 = "audio/raw"
            java.lang.String r5 = "MatroskaExtractor"
            java.lang.String r2 = "audio/x-unknown"
            r20 = 0
            switch(r15) {
                case 0: goto L_0x05a4;
                case 1: goto L_0x05a4;
                case 2: goto L_0x0531;
                case 3: goto L_0x0527;
                case 4: goto L_0x04cb;
                case 5: goto L_0x04c1;
                case 6: goto L_0x04be;
                case 7: goto L_0x043b;
                case 8: goto L_0x042a;
                case 9: goto L_0x05a4;
                case 10: goto L_0x040f;
                case 11: goto L_0x0403;
                case 12: goto L_0x03ff;
                case 13: goto L_0x03dd;
                case 14: goto L_0x03d9;
                case 15: goto L_0x03d5;
                case 16: goto L_0x03d1;
                case 17: goto L_0x03cd;
                case 18: goto L_0x03c9;
                case 19: goto L_0x03c2;
                case 20: goto L_0x03be;
                case 21: goto L_0x03d5;
                case 22: goto L_0x057e;
                case 23: goto L_0x03b4;
                case 24: goto L_0x03a4;
                case 25: goto L_0x0396;
                case 26: goto L_0x037d;
                case 27: goto L_0x037a;
                case 28: goto L_0x0376;
                case 29: goto L_0x0372;
                case 30: goto L_0x0366;
                case 31: goto L_0x032b;
                default: goto L_0x01f9;
            }
        L_0x01f9:
            java.lang.String r0 = "Unrecognized codec identifier."
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x0200:
            java.lang.String r0 = "A_OPUS"
            boolean r0 = r10.equals(r0)
            r15 = 31
            goto L_0x0327
        L_0x020a:
            java.lang.String r0 = "A_FLAC"
            boolean r0 = r10.equals(r0)
            r15 = 30
            goto L_0x0327
        L_0x0214:
            java.lang.String r0 = "A_EAC3"
            boolean r0 = r10.equals(r0)
            r15 = 29
            goto L_0x0327
        L_0x021e:
            java.lang.String r0 = "V_MPEG2"
            boolean r0 = r10.equals(r0)
            r15 = 28
            goto L_0x0327
        L_0x0228:
            java.lang.String r0 = "S_TEXT/UTF8"
            boolean r0 = r10.equals(r0)
            r15 = 27
            goto L_0x0327
        L_0x0232:
            java.lang.String r0 = "V_MPEGH/ISO/HEVC"
            boolean r0 = r10.equals(r0)
            r15 = 26
            goto L_0x0327
        L_0x023c:
            java.lang.String r0 = "S_TEXT/ASS"
            boolean r0 = r10.equals(r0)
            r15 = 25
            goto L_0x0327
        L_0x0246:
            java.lang.String r0 = "A_PCM/INT/LIT"
            boolean r0 = r10.equals(r0)
            r15 = 24
            goto L_0x0327
        L_0x0250:
            java.lang.String r0 = "A_PCM/INT/BIG"
            boolean r0 = r10.equals(r0)
            r15 = 23
            goto L_0x0327
        L_0x025a:
            java.lang.String r0 = "A_PCM/FLOAT/IEEE"
            boolean r0 = r10.equals(r0)
            r15 = 22
            goto L_0x0327
        L_0x0264:
            java.lang.String r0 = "A_DTS/EXPRESS"
            boolean r0 = r10.equals(r0)
            r15 = 21
            goto L_0x0327
        L_0x026e:
            java.lang.String r0 = "V_THEORA"
            boolean r0 = r10.equals(r0)
            r15 = 20
            goto L_0x0327
        L_0x0278:
            java.lang.String r0 = "S_HDMV/PGS"
            boolean r0 = r10.equals(r0)
            r15 = 19
            goto L_0x0327
        L_0x0282:
            java.lang.String r0 = "V_VP9"
            boolean r0 = r10.equals(r0)
            r15 = 18
            goto L_0x0327
        L_0x028c:
            java.lang.String r0 = "V_VP8"
            boolean r0 = r10.equals(r0)
            r15 = 17
            goto L_0x0327
        L_0x0296:
            java.lang.String r0 = "V_AV1"
            boolean r0 = r10.equals(r0)
            r15 = 16
            goto L_0x0327
        L_0x02a0:
            java.lang.String r0 = "A_DTS"
            boolean r0 = r10.equals(r0)
            r15 = 15
            goto L_0x0327
        L_0x02a9:
            java.lang.String r0 = "A_AC3"
            boolean r0 = r10.equals(r0)
            r15 = 14
            goto L_0x0327
        L_0x02b2:
            java.lang.String r0 = "A_AAC"
            boolean r0 = r10.equals(r0)
            r15 = 13
            goto L_0x0327
        L_0x02bb:
            java.lang.String r0 = "A_DTS/LOSSLESS"
            boolean r0 = r10.equals(r0)
            r15 = 12
            goto L_0x0327
        L_0x02c4:
            java.lang.String r0 = "S_VOBSUB"
            boolean r0 = r10.equals(r0)
            r15 = 11
            goto L_0x0327
        L_0x02cd:
            java.lang.String r0 = "V_MPEG4/ISO/AVC"
            boolean r0 = r10.equals(r0)
            r15 = 10
            goto L_0x0327
        L_0x02d6:
            java.lang.String r0 = "V_MPEG4/ISO/ASP"
            boolean r0 = r10.equals(r0)
            r15 = 9
            goto L_0x0327
        L_0x02df:
            java.lang.String r0 = "S_DVBSUB"
            boolean r0 = r10.equals(r0)
            r15 = 8
            goto L_0x0327
        L_0x02e8:
            java.lang.String r0 = "V_MS/VFW/FOURCC"
            boolean r0 = r10.equals(r0)
            r15 = 7
            goto L_0x0327
        L_0x02f0:
            java.lang.String r0 = "A_MPEG/L3"
            boolean r0 = r10.equals(r0)
            r15 = 6
            goto L_0x0327
        L_0x02f8:
            java.lang.String r0 = "A_MPEG/L2"
            boolean r0 = r10.equals(r0)
            r15 = 5
            goto L_0x0327
        L_0x0300:
            java.lang.String r0 = "A_VORBIS"
            boolean r0 = r10.equals(r0)
            r15 = 4
            goto L_0x0327
        L_0x0308:
            java.lang.String r0 = "A_TRUEHD"
            boolean r0 = r10.equals(r0)
            r15 = 3
            goto L_0x0327
        L_0x0310:
            java.lang.String r0 = "A_MS/ACM"
            boolean r0 = r10.equals(r0)
            r15 = 2
            goto L_0x0327
        L_0x0318:
            java.lang.String r0 = "V_MPEG4/ISO/SP"
            boolean r0 = r10.equals(r0)
            r15 = 1
            goto L_0x0327
        L_0x0320:
            java.lang.String r0 = "V_MPEG4/ISO/AP"
            boolean r0 = r10.equals(r0)
            r15 = 0
        L_0x0327:
            if (r0 != 0) goto L_0x01e2
            goto L_0x01e1
        L_0x032b:
            java.util.ArrayList r5 = X.AnonymousClass002.A0I(r6)
            byte[] r0 = r4.A00(r10)
            r5.add(r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r11)
            java.nio.ByteOrder r10 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r0 = r0.order(r10)
            long r2 = r4.A0Y
            r0.putLong(r2)
            byte[] r0 = r0.array()
            r5.add(r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r11)
            java.nio.ByteBuffer r0 = r0.order(r10)
            long r2 = r4.A0Z
            r0.putLong(r2)
            byte[] r0 = r0.array()
            r5.add(r0)
            java.lang.String r3 = "audio/opus"
            r11 = 5760(0x1680, float:8.071E-42)
            goto L_0x0522
        L_0x0366:
            byte[] r0 = r4.A00(r10)
            java.util.List r5 = java.util.Collections.singletonList(r0)
            java.lang.String r3 = "audio/flac"
            goto L_0x05ac
        L_0x0372:
            java.lang.String r3 = "audio/eac3"
            goto L_0x0591
        L_0x0376:
            java.lang.String r3 = "video/mpeg2"
            goto L_0x0591
        L_0x037a:
            r3 = r7
            goto L_0x0591
        L_0x037d:
            byte[] r2 = r4.A00(r10)
            X.7pi r0 = new X.7pi
            r0.<init>((byte[]) r2)
            X.7gR r2 = X.C156327gR.A00(r0)
            java.util.List r5 = r2.A02
            int r0 = r2.A00
            r4.A0R = r0
            java.lang.String r10 = r2.A01
            java.lang.String r3 = "video/hevc"
            goto L_0x0426
        L_0x0396:
            byte[] r2 = A0t
            byte[] r0 = r4.A00(r10)
            X.6aY r5 = X.C129586aY.of(r2, r0)
            r3 = r21
            goto L_0x05ac
        L_0x03a4:
            int r10 = r4.A0D
            int r12 = X.C162387ry.A01(r10)
            if (r12 != 0) goto L_0x0599
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unsupported little endian PCM bit depth: "
            goto L_0x058a
        L_0x03b4:
            int r10 = r4.A0D
            if (r10 != r11) goto L_0x0595
            r5 = r18
            r10 = r5
            r12 = 3
            goto L_0x05af
        L_0x03be:
            java.lang.String r3 = "video/x-unknown"
            goto L_0x0591
        L_0x03c2:
            r5 = r18
            r10 = r5
            r3 = r23
            goto L_0x05ae
        L_0x03c9:
            java.lang.String r3 = "video/x-vnd.on2.vp9"
            goto L_0x0591
        L_0x03cd:
            java.lang.String r3 = "video/x-vnd.on2.vp8"
            goto L_0x0591
        L_0x03d1:
            java.lang.String r3 = "video/av01"
            goto L_0x0591
        L_0x03d5:
            java.lang.String r3 = "audio/vnd.dts"
            goto L_0x0591
        L_0x03d9:
            java.lang.String r3 = "audio/ac3"
            goto L_0x0591
        L_0x03dd:
            byte[] r0 = r4.A00(r10)
            java.util.List r5 = java.util.Collections.singletonList(r0)
            byte[] r3 = r4.A0l
            int r2 = r3.length
            X.7oL r0 = new X.7oL
            r0.<init>(r3, r2)
            X.7JX r2 = X.C159817mV.A00(r0, r9)
            int r0 = r2.A01
            r4.A0U = r0
            int r0 = r2.A00
            r4.A0F = r0
            java.lang.String r10 = r2.A02
            java.lang.String r3 = "audio/mp4a-latm"
            goto L_0x05ae
        L_0x03ff:
            java.lang.String r3 = "audio/vnd.dts.hd"
            goto L_0x0591
        L_0x0403:
            byte[] r0 = r4.A00(r10)
            X.6aY r5 = X.C129586aY.of(r0)
            r3 = r22
            goto L_0x05ac
        L_0x040f:
            byte[] r2 = r4.A00(r10)
            X.7pi r0 = new X.7pi
            r0.<init>((byte[]) r2)
            X.7hH r2 = X.C156827hH.A00(r0)
            java.util.List r5 = r2.A05
            int r0 = r2.A02
            r4.A0R = r0
            java.lang.String r10 = r2.A04
            java.lang.String r3 = "video/avc"
        L_0x0426:
            r12 = -1
            r11 = -1
            goto L_0x05b0
        L_0x042a:
            byte[] r2 = new byte[r12]
            byte[] r0 = r4.A00(r10)
            java.lang.System.arraycopy(r0, r9, r2, r9, r12)
            X.6aY r5 = X.C129586aY.of(r2)
            r3 = r24
            goto L_0x05ac
        L_0x043b:
            byte[] r0 = r4.A00(r10)
            X.7pi r11 = new X.7pi
            r11.<init>((byte[]) r0)
            r11.A0T(r13)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1045 }
            long r12 = r11.A0G()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1045 }
            r2 = 1482049860(0x58564944, double:7.322299212E-315)
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x045b
            java.lang.String r2 = "video/divx"
            r0 = r18
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r2, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1045 }
            goto L_0x04b4
        L_0x045b:
            r2 = 859189832(0x33363248, double:4.244961792E-315)
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x046b
            java.lang.String r2 = "video/3gpp"
            r0 = r18
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r2, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1045 }
            goto L_0x04b4
        L_0x046b:
            r2 = 826496599(0x31435657, double:4.08343576E-315)
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x04a7
            int r0 = r11.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1045 }
            int r10 = r0 + 20
            byte[] r5 = r11.A02     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1045 }
        L_0x0478:
            int r3 = r5.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1045 }
            int r0 = r3 + -4
            if (r10 >= r0) goto L_0x103e
            byte r0 = r5[r10]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1045 }
            if (r0 != 0) goto L_0x04a4
            int r0 = r10 + 1
            byte r0 = r5[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1045 }
            if (r0 != 0) goto L_0x04a4
            int r0 = r10 + 2
            byte r0 = r5[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1045 }
            if (r0 != r8) goto L_0x04a4
            int r0 = r10 + 3
            byte r2 = r5[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1045 }
            r0 = 15
            if (r2 != r0) goto L_0x04a4
            byte[] r0 = java.util.Arrays.copyOfRange(r5, r10, r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1045 }
            java.lang.String r2 = "video/wvc1"
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1045 }
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r2, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1045 }
            goto L_0x04b4
        L_0x04a4:
            int r10 = r10 + 1
            goto L_0x0478
        L_0x04a7:
            java.lang.String r0 = "Unknown FourCC. Setting mimeType to video/x-unknown"
            android.util.Log.w(r5, r0)
            java.lang.String r2 = "video/x-unknown"
            r0 = r18
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r2, r0)
        L_0x04b4:
            java.lang.Object r3 = r0.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r0.second
            java.util.List r5 = (java.util.List) r5
            goto L_0x05ac
        L_0x04be:
            java.lang.String r3 = "audio/mpeg"
            goto L_0x04c3
        L_0x04c1:
            java.lang.String r3 = "audio/mpeg-L2"
        L_0x04c3:
            r5 = r18
            r10 = r5
            r12 = -1
            r11 = 4096(0x1000, float:5.74E-42)
            goto L_0x05b0
        L_0x04cb:
            byte[] r11 = r4.A00(r10)
            java.lang.String r15 = "Error parsing vorbis codec private"
            byte r0 = r11[r9]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1060 }
            r10 = 2
            if (r0 != r10) goto L_0x1056
            r3 = 1
            r13 = 0
        L_0x04d8:
            byte r2 = r11[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1060 }
            r0 = r2 & 255(0xff, float:3.57E-43)
            r14 = 255(0xff, float:3.57E-43)
            if (r0 != r14) goto L_0x04e5
            int r13 = r13 + 255
            int r3 = r3 + 1
            goto L_0x04d8
        L_0x04e5:
            int r3 = r3 + 1
            r2 = r2 & r14
            int r13 = r13 + r2
            r12 = 0
        L_0x04ea:
            byte r2 = r11[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1060 }
            r0 = r2 & 255(0xff, float:3.57E-43)
            if (r0 != r14) goto L_0x04f5
            int r12 = r12 + 255
            int r3 = r3 + 1
            goto L_0x04ea
        L_0x04f5:
            int r5 = r3 + 1
            r2 = r2 & r14
            int r12 = r12 + r2
            byte r0 = r11[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1060 }
            if (r0 != r8) goto L_0x1051
            byte[] r3 = new byte[r13]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1060 }
            java.lang.System.arraycopy(r11, r5, r3, r9, r13)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1060 }
            int r5 = r5 + r13
            byte r0 = r11[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1060 }
            if (r0 != r6) goto L_0x105b
            int r5 = r5 + r12
            byte r2 = r11[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1060 }
            r0 = 5
            if (r2 != r0) goto L_0x104c
            int r2 = r11.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1060 }
            int r2 = r2 - r5
            byte[] r0 = new byte[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1060 }
            java.lang.System.arraycopy(r11, r5, r0, r9, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1060 }
            java.util.ArrayList r5 = X.AnonymousClass002.A0I(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1060 }
            r5.add(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1060 }
            r5.add(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1060 }
            java.lang.String r3 = "audio/vorbis"
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0522:
            r10 = r18
            r12 = -1
            goto L_0x05b0
        L_0x0527:
            X.7UE r0 = new X.7UE
            r0.<init>()
            r4.A0d = r0
            java.lang.String r3 = "audio/true-hd"
            goto L_0x0591
        L_0x0531:
            byte[] r0 = r4.A00(r10)
            X.7pi r12 = new X.7pi
            r12.<init>((byte[]) r0)
            int r10 = r12.A0A()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1065 }
            if (r10 == r8) goto L_0x056f
            r0 = 65534(0xfffe, float:9.1833E-41)
            if (r10 != r0) goto L_0x0565
            r0 = 24
            r12.A0S(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1065 }
            long r16 = r12.A0H()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1065 }
            java.util.UUID r15 = A0s     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1065 }
            long r10 = r15.getMostSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1065 }
            int r0 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0565
            long r12 = r12.A0H()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1065 }
            long r10 = r15.getLeastSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1065 }
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0565
            goto L_0x056f
        L_0x0565:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
            r3.append(r0)
            goto L_0x058d
        L_0x056f:
            int r10 = r4.A0D
            int r12 = X.C162387ry.A01(r10)
            if (r12 != 0) goto L_0x0599
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unsupported PCM bit depth: "
            goto L_0x058a
        L_0x057e:
            int r10 = r4.A0D
            r0 = 32
            if (r10 == r0) goto L_0x0599
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unsupported floating point PCM bit depth: "
        L_0x058a:
            X.C18270x1.A19(r0, r14, r3, r10)
        L_0x058d:
            X.AnonymousClass000.A1F(r2, r5, r3)
            r3 = r2
        L_0x0591:
            r5 = r18
            r10 = r5
            goto L_0x05ae
        L_0x0595:
            if (r10 != r13) goto L_0x059d
            r12 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0599:
            r5 = r18
            r10 = r5
            goto L_0x05af
        L_0x059d:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unsupported big endian PCM bit depth: "
            goto L_0x058a
        L_0x05a4:
            byte[] r0 = r4.A0l
            if (r0 != 0) goto L_0x07ba
            r5 = r18
        L_0x05aa:
            java.lang.String r3 = "video/mp4v-es"
        L_0x05ac:
            r10 = r18
        L_0x05ae:
            r12 = -1
        L_0x05af:
            r11 = -1
        L_0x05b0:
            byte[] r2 = r4.A0m
            if (r2 == 0) goto L_0x05c3
            X.7pi r0 = new X.7pi
            r0.<init>((byte[]) r2)
            X.7fP r0 = X.C155727fP.A00(r0)
            if (r0 == 0) goto L_0x05c3
            java.lang.String r10 = r0.A00
            java.lang.String r3 = "video/dolby-vision"
        L_0x05c3:
            boolean r0 = r4.A0h
            r17 = r0
            boolean r0 = r4.A0i
            int r0 = X.C18310x6.A02(r0)
            r17 = r17 | r0
            X.7he r2 = X.C157057he.A00()
            boolean r0 = X.C162107rG.A03(r3)
            if (r0 == 0) goto L_0x0628
            int r0 = r4.A0F
            r2.A04 = r0
            int r0 = r4.A0U
            r2.A0D = r0
            r2.A09 = r12
            r6 = 1
        L_0x05e4:
            java.lang.String r7 = r4.A0g
            if (r7 == 0) goto L_0x05f4
            java.util.Map r0 = A0r
            boolean r0 = r0.containsKey(r7)
            if (r0 != 0) goto L_0x05f4
            java.lang.String r0 = r4.A0g
            r2.A0P = r0
        L_0x05f4:
            java.lang.String r0 = java.lang.Integer.toString(r25)
            r2.A0O = r0
            r2.A0R = r3
            r2.A08 = r11
            java.lang.String r0 = r4.A0f
            r2.A0Q = r0
            r0 = r17
            r2.A0E = r0
            r2.A0S = r5
            r2.A0M = r10
            X.7z2 r0 = r4.A0a
            r2.A0I = r0
            X.7yp r3 = X.C166527yp.A00(r2)
            int r2 = r4.A0S
            r0 = r26
            X.8tw r0 = r0.Br0(r2, r6)
            r4.A0c = r0
            r0.B3T(r3)
            android.util.SparseArray r2 = r1.A0d
            int r0 = r4.A0S
            r2.put(r0, r4)
            goto L_0x0167
        L_0x0628:
            boolean r0 = X.C162107rG.A05(r3)
            if (r0 == 0) goto L_0x078d
            int r0 = r4.A0L
            if (r0 != 0) goto L_0x078a
            int r0 = r4.A0M
            r7 = -1
            if (r0 != r7) goto L_0x0639
            int r0 = r4.A0X
        L_0x0639:
            r4.A0M = r0
            int r0 = r4.A0K
            if (r0 != r7) goto L_0x0641
            int r0 = r4.A0N
        L_0x0641:
            r4.A0K = r0
        L_0x0643:
            int r6 = r4.A0M
            if (r6 == r7) goto L_0x0786
            int r12 = r4.A0K
            if (r12 == r7) goto L_0x0786
            int r0 = r4.A0N
            int r0 = r0 * r6
            float r6 = (float) r0
            int r0 = r4.A0X
            int r0 = r0 * r12
            float r0 = (float) r0
            float r6 = r6 / r0
        L_0x0654:
            boolean r0 = r4.A0j
            if (r0 == 0) goto L_0x0708
            float r0 = r4.A06
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0782
            float r0 = r4.A07
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0782
            float r0 = r4.A04
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0782
            float r0 = r4.A05
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0782
            float r0 = r4.A02
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0782
            float r0 = r4.A03
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0782
            float r0 = r4.A0B
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0782
            float r0 = r4.A0C
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0782
            float r0 = r4.A00
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0782
            float r0 = r4.A01
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0782
            r0 = 25
            byte[] r0 = new byte[r0]
            r16 = r0
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.wrap(r16)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r12 = r12.order(r0)
            r12.put(r9)
            float r14 = r4.A06
            r0 = 1195593728(0x47435000, float:50000.0)
            float r14 = r14 * r0
            r13 = 1056964608(0x3f000000, float:0.5)
            float r14 = r14 + r13
            int r0 = (int) r14
            short r0 = (short) r0
            r12.putShort(r0)
            float r0 = r4.A07
            A01(r12, r0)
            float r0 = r4.A04
            A01(r12, r0)
            float r0 = r4.A05
            A01(r12, r0)
            float r0 = r4.A02
            A01(r12, r0)
            float r0 = r4.A03
            A01(r12, r0)
            float r0 = r4.A0B
            A01(r12, r0)
            float r0 = r4.A0C
            A01(r12, r0)
            float r0 = r4.A00
            float r0 = r0 + r13
            int r0 = (int) r0
            short r0 = (short) r0
            r12.putShort(r0)
            float r0 = r4.A01
            float r0 = r0 + r13
            int r0 = (int) r0
            short r0 = (short) r0
            r12.putShort(r0)
            int r0 = r4.A0P
            short r0 = (short) r0
            r12.putShort(r0)
            int r0 = r4.A0Q
            short r0 = (short) r0
            r12.putShort(r0)
        L_0x06f6:
            int r0 = r4.A0H
            r13 = r0
            int r0 = r4.A0G
            r12 = r0
            int r0 = r4.A0I
            X.7ym r20 = new X.7ym
            r15 = r13
            r14 = r20
            r13 = r16
            r14.<init>(r15, r13, r12, r0)
        L_0x0708:
            java.lang.String r0 = r4.A0g
            if (r0 == 0) goto L_0x071e
            java.util.Map r12 = A0r
            boolean r0 = r12.containsKey(r0)
            if (r0 == 0) goto L_0x071e
            java.lang.String r0 = r4.A0g
            java.lang.Object r0 = r12.get(r0)
            int r7 = X.AnonymousClass001.A0K(r0)
        L_0x071e:
            int r0 = r4.A0T
            if (r0 != 0) goto L_0x077c
            float r0 = r4.A0A
            r13 = 0
            int r0 = java.lang.Float.compare(r0, r13)
            if (r0 != 0) goto L_0x077c
            float r12 = r4.A08
            int r0 = java.lang.Float.compare(r12, r13)
            if (r0 != 0) goto L_0x077c
            float r0 = r4.A09
            int r0 = java.lang.Float.compare(r0, r13)
            if (r0 == 0) goto L_0x0745
            r0 = 1119092736(0x42b40000, float:90.0)
            int r0 = java.lang.Float.compare(r12, r0)
            if (r0 != 0) goto L_0x0762
            r19 = 90
        L_0x0745:
            int r0 = r4.A0X
            r2.A0G = r0
            int r0 = r4.A0N
            r2.A07 = r0
            r2.A01 = r6
            r0 = r19
            r2.A0C = r0
            byte[] r0 = r4.A0n
            r2.A0T = r0
            int r0 = r4.A0V
            r2.A0F = r0
            r0 = r20
            r2.A0K = r0
            r6 = 2
            goto L_0x05e4
        L_0x0762:
            r0 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r0 = java.lang.Float.compare(r12, r0)
            if (r0 == 0) goto L_0x077f
            r0 = 1127481344(0x43340000, float:180.0)
            int r0 = java.lang.Float.compare(r12, r0)
            if (r0 == 0) goto L_0x077f
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r0 = java.lang.Float.compare(r12, r0)
            r19 = 270(0x10e, float:3.78E-43)
            if (r0 == 0) goto L_0x0745
        L_0x077c:
            r19 = r7
            goto L_0x0745
        L_0x077f:
            r19 = 180(0xb4, float:2.52E-43)
            goto L_0x0745
        L_0x0782:
            r16 = 0
            goto L_0x06f6
        L_0x0786:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0654
        L_0x078a:
            r7 = -1
            goto L_0x0643
        L_0x078d:
            boolean r0 = r7.equals(r3)
            if (r0 != 0) goto L_0x05e4
            r0 = r21
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x05e4
            r0 = r22
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x05e4
            r0 = r23
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x05e4
            r0 = r24
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x05e4
            java.lang.String r0 = "Unexpected MIME type."
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x07ba:
            java.util.List r5 = java.util.Collections.singletonList(r0)
            goto L_0x05aa
        L_0x07c0:
            int r2 = r1.A05
            r0 = 2
            if (r2 != r0) goto L_0x0fc5
            r2 = 0
            r14 = 0
        L_0x07c7:
            int r0 = r1.A03
            if (r2 >= r0) goto L_0x07d3
            int[] r0 = r1.A0c
            r0 = r0[r2]
            int r14 = r14 + r0
            int r2 = r2 + 1
            goto L_0x07c7
        L_0x07d3:
            android.util.SparseArray r2 = r1.A0d
            int r0 = r1.A06
            java.lang.Object r7 = r2.get(r0)
            X.7Uh r7 = (X.C151327Uh) r7
            X.8tw r0 = r7.A0c
            r0.getClass()
            r6 = 0
        L_0x07e3:
            int r0 = r1.A03
            if (r6 >= r0) goto L_0x0809
            long r4 = r1.A0E
            int r0 = r7.A0J
            int r0 = r0 * r6
            int r0 = r0 / 1000
            long r2 = (long) r0
            long r2 = r2 + r4
            int r4 = r1.A02
            if (r6 != 0) goto L_0x07fa
            boolean r0 = r1.A0T
            if (r0 != 0) goto L_0x07fa
            r4 = r4 | 1
        L_0x07fa:
            int[] r0 = r1.A0c
            r13 = r0[r6]
            int r14 = r14 - r13
            r10 = r1
            r11 = r7
            r12 = r4
            r15 = r2
            r10.A08(r11, r12, r13, r14, r15)
            int r6 = r6 + 1
            goto L_0x07e3
        L_0x0809:
            r1.A05 = r9
            goto L_0x0fc5
        L_0x080d:
            int r0 = r10.A01
            r4 = 4
            if (r0 != 0) goto L_0x087b
            X.7iH r1 = r10.A04
            r0 = r29
            long r0 = r1.A00(r0, r4, r8, r9)
            r5 = -2
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x086f
            r29.Bjy()
        L_0x0823:
            byte[] r7 = r10.A06
            r0 = r29
            r0.Bgd(r7, r9, r4)
            byte r1 = r7[r9]
            r5 = 0
        L_0x082d:
            long[] r2 = X.C157427iH.A03
            int r0 = r2.length
            if (r5 >= r0) goto L_0x089f
            r14 = r2[r5]
            long r2 = (long) r1
            long r14 = r14 & r2
            r12 = 0
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            int r5 = r5 + 1
            if (r0 == 0) goto L_0x082d
            r0 = -1
            if (r5 == r0) goto L_0x089f
            if (r5 > r4) goto L_0x089f
            r12 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r12
            r6 = 1
        L_0x0847:
            if (r6 >= r5) goto L_0x0854
            r0 = 8
            long r2 = r2 << r0
            byte r0 = r7[r6]
            long r0 = (long) r0
            long r0 = r0 & r12
            long r2 = r2 | r0
            int r6 = r6 + 1
            goto L_0x0847
        L_0x0854:
            int r1 = (int) r2
            r0 = 357149030(0x1549a966, float:4.072526E-26)
            if (r1 == r0) goto L_0x0869
            r0 = 524531317(0x1f43b675, float:4.144378E-20)
            if (r1 == r0) goto L_0x0869
            r0 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r1 == r0) goto L_0x0869
            r0 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r1 != r0) goto L_0x089f
        L_0x0869:
            r0 = r29
            r0.BpP(r5)
            long r0 = (long) r1
        L_0x086f:
            r5 = -1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x10c3
            int r2 = (int) r0
            r10.A00 = r2
            r10.A01 = r8
            r0 = 1
        L_0x087b:
            r5 = 2
            if (r0 != r8) goto L_0x088c
            X.7iH r2 = r10.A04
            r1 = 8
            r0 = r29
            long r0 = r2.A00(r0, r1, r9, r8)
            r10.A02 = r0
            r10.A01 = r5
        L_0x088c:
            X.8gx r3 = r10.A03
            int r2 = r10.A00
            switch(r2) {
                case 131: goto L_0x0959;
                case 134: goto L_0x0c2c;
                case 136: goto L_0x0959;
                case 155: goto L_0x0959;
                case 159: goto L_0x0959;
                case 160: goto L_0x08a6;
                case 161: goto L_0x0997;
                case 163: goto L_0x0997;
                case 165: goto L_0x0997;
                case 166: goto L_0x08a6;
                case 174: goto L_0x08a6;
                case 176: goto L_0x0959;
                case 179: goto L_0x0959;
                case 181: goto L_0x0957;
                case 183: goto L_0x08a6;
                case 186: goto L_0x0959;
                case 187: goto L_0x08a6;
                case 215: goto L_0x0959;
                case 224: goto L_0x08a6;
                case 225: goto L_0x08a6;
                case 231: goto L_0x0959;
                case 238: goto L_0x0959;
                case 241: goto L_0x0959;
                case 251: goto L_0x0959;
                case 16868: goto L_0x08a6;
                case 16871: goto L_0x0959;
                case 16877: goto L_0x0997;
                case 16980: goto L_0x0959;
                case 16981: goto L_0x0997;
                case 17026: goto L_0x0c2c;
                case 17029: goto L_0x0959;
                case 17143: goto L_0x0959;
                case 17545: goto L_0x0957;
                case 18401: goto L_0x0959;
                case 18402: goto L_0x0997;
                case 18407: goto L_0x08a6;
                case 18408: goto L_0x0959;
                case 19899: goto L_0x08a6;
                case 20529: goto L_0x0959;
                case 20530: goto L_0x0959;
                case 20532: goto L_0x08a6;
                case 20533: goto L_0x08a6;
                case 21358: goto L_0x0c2c;
                case 21419: goto L_0x0997;
                case 21420: goto L_0x0959;
                case 21432: goto L_0x0959;
                case 21680: goto L_0x0959;
                case 21682: goto L_0x0959;
                case 21690: goto L_0x0959;
                case 21930: goto L_0x0959;
                case 21936: goto L_0x08a6;
                case 21945: goto L_0x0959;
                case 21946: goto L_0x0959;
                case 21947: goto L_0x0959;
                case 21948: goto L_0x0959;
                case 21949: goto L_0x0959;
                case 21968: goto L_0x08a6;
                case 21969: goto L_0x0957;
                case 21970: goto L_0x0957;
                case 21971: goto L_0x0957;
                case 21972: goto L_0x0957;
                case 21973: goto L_0x0957;
                case 21974: goto L_0x0957;
                case 21975: goto L_0x0957;
                case 21976: goto L_0x0957;
                case 21977: goto L_0x0957;
                case 21978: goto L_0x0957;
                case 21998: goto L_0x0959;
                case 22186: goto L_0x0959;
                case 22203: goto L_0x0959;
                case 25152: goto L_0x08a6;
                case 25188: goto L_0x0959;
                case 25506: goto L_0x0997;
                case 28032: goto L_0x08a6;
                case 30113: goto L_0x08a6;
                case 30320: goto L_0x08a6;
                case 30321: goto L_0x0959;
                case 30322: goto L_0x0997;
                case 30323: goto L_0x0957;
                case 30324: goto L_0x0957;
                case 30325: goto L_0x0957;
                case 2274716: goto L_0x0c2c;
                case 2352003: goto L_0x0959;
                case 2807729: goto L_0x0959;
                case 290298740: goto L_0x08a6;
                case 357149030: goto L_0x08a6;
                case 374648427: goto L_0x08a6;
                case 408125543: goto L_0x08a6;
                case 440786851: goto L_0x08a6;
                case 475249515: goto L_0x08a6;
                case 524531317: goto L_0x08a6;
                default: goto L_0x0893;
            }
        L_0x0893:
            long r2 = r10.A02
            int r1 = (int) r2
            r0 = r29
            r0.BpP(r1)
            r10.A01 = r9
            goto L_0x0019
        L_0x089f:
            r0 = r29
            r0.BpP(r8)
            goto L_0x0823
        L_0x08a6:
            long r6 = r29.BBW()
            long r0 = r10.A02
            long r0 = r0 + r6
            X.7Fy r3 = new X.7Fy
            r3.<init>(r2, r0)
            r11.push(r3)
            X.8gx r0 = r10.A03
            int r1 = r10.A00
            long r4 = r10.A02
            X.86u r0 = (X.C1687986u) r0
            X.86a r12 = r0.A00
            X.8wK r11 = r12.A0O
            X.C161487pm.A01(r11)
            r0 = 160(0xa0, float:2.24E-43)
            if (r1 == r0) goto L_0x0953
            r0 = 174(0xae, float:2.44E-43)
            if (r1 == r0) goto L_0x094a
            r0 = 187(0xbb, float:2.62E-43)
            if (r1 == r0) goto L_0x0946
            r0 = 19899(0x4dbb, float:2.7884E-41)
            r2 = -1
            if (r1 == r0) goto L_0x093f
            r0 = 20533(0x5035, float:2.8773E-41)
            if (r1 == r0) goto L_0x0937
            r0 = 21968(0x55d0, float:3.0784E-41)
            if (r1 == r0) goto L_0x092f
            r0 = 408125543(0x18538067, float:2.7335937E-24)
            if (r1 == r0) goto L_0x0918
            r0 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r1 == r0) goto L_0x0908
            r0 = 524531317(0x1f43b675, float:4.144378E-20)
            if (r1 != r0) goto L_0x0f02
            boolean r0 = r12.A0b
            if (r0 != 0) goto L_0x0f02
            boolean r0 = r12.A0q
            if (r0 == 0) goto L_0x08ff
            long r0 = r12.A0G
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x08ff
            r12.A0Z = r8
            goto L_0x0f02
        L_0x08ff:
            long r0 = r12.A0I
            X.C1686986k.A01(r11, r0)
            r12.A0b = r8
            goto L_0x0f02
        L_0x0908:
            X.7Vf r0 = new X.7Vf
            r0.<init>()
            r12.A0R = r0
            X.7Vf r0 = new X.7Vf
            r0.<init>()
            r12.A0Q = r0
            goto L_0x0f02
        L_0x0918:
            long r0 = r12.A0L
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 == 0) goto L_0x0929
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0929
            java.lang.String r0 = "Multiple Segment elements not supported"
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x0929:
            r12.A0L = r6
            r12.A0M = r4
            goto L_0x0f02
        L_0x092f:
            X.7Uh r0 = A00(r12, r0)
            r0.A0j = r8
            goto L_0x0f02
        L_0x0937:
            X.7Uh r0 = A00(r12, r0)
            r0.A0k = r8
            goto L_0x0f02
        L_0x093f:
            r0 = -1
            r12.A0C = r0
            r12.A0J = r2
            goto L_0x0f02
        L_0x0946:
            r12.A0a = r9
            goto L_0x0f02
        L_0x094a:
            X.7Uh r0 = new X.7Uh
            r0.<init>()
            r12.A0P = r0
            goto L_0x0f02
        L_0x0953:
            r12.A0T = r9
            goto L_0x0f02
        L_0x0957:
            r1 = 5
            goto L_0x095a
        L_0x0959:
            r1 = 2
        L_0x095a:
            r11 = 8
            if (r1 == r5) goto L_0x0ca5
            r0 = 3
            if (r1 == r0) goto L_0x0c2c
            if (r1 == r4) goto L_0x0997
            long r0 = r10.A02
            r5 = 4
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x097e
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x097e
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "Invalid float size: "
            java.lang.String r0 = X.AnonymousClass000.A0Z(r2, r3, r0)
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x097e:
            int r6 = (int) r0
            byte[] r11 = r10.A06
            r7 = 0
            r0 = r29
            r0.readFully(r11, r9, r6)
            r0 = 0
        L_0x0989:
            if (r7 >= r6) goto L_0x0ee7
            r4 = 8
            long r0 = r0 << r4
            byte r4 = r11[r7]
            r4 = r4 & 255(0xff, float:3.57E-43)
            long r4 = (long) r4
            long r0 = r0 | r4
            int r7 = r7 + 1
            goto L_0x0989
        L_0x0997:
            long r0 = r10.A02
            int r11 = (int) r0
            X.86u r3 = (X.C1687986u) r3
            X.86a r6 = r3.A00
            r1 = 161(0xa1, float:2.26E-43)
            r0 = 163(0xa3, float:2.28E-43)
            if (r2 == r1) goto L_0x0a53
            if (r2 == r0) goto L_0x0a53
            r0 = 165(0xa5, float:2.31E-43)
            if (r2 == r0) goto L_0x09f8
            r0 = 16877(0x41ed, float:2.365E-41)
            if (r2 == r0) goto L_0x09e3
            r0 = 16981(0x4255, float:2.3795E-41)
            if (r2 == r0) goto L_0x09da
            r1 = 18402(0x47e2, float:2.5787E-41)
            if (r2 == r1) goto L_0x0a38
            r0 = 21419(0x53ab, float:3.0014E-41)
            if (r2 == r0) goto L_0x0a1c
            r0 = 25506(0x63a2, float:3.5742E-41)
            if (r2 == r0) goto L_0x09d1
            r0 = 30322(0x7672, float:4.249E-41)
            if (r2 != r0) goto L_0x1073
            X.7Uh r0 = A00(r6, r2)
            byte[] r1 = new byte[r11]
            r0.A0n = r1
        L_0x09ca:
            r0 = r29
            r0.readFully(r1, r9, r11)
            goto L_0x0f02
        L_0x09d1:
            X.7Uh r0 = A00(r6, r2)
            byte[] r1 = new byte[r11]
            r0.A0l = r1
            goto L_0x09ca
        L_0x09da:
            X.7Uh r0 = A00(r6, r2)
            byte[] r1 = new byte[r11]
            r0.A0o = r1
            goto L_0x09ca
        L_0x09e3:
            X.7Uh r2 = A00(r6, r0)
            int r1 = r2.A0E
            r0 = 1685485123(0x64767643, float:1.8185683E22)
            if (r1 == r0) goto L_0x09f3
            r0 = 1685480259(0x64766343, float:1.8180206E22)
            if (r1 != r0) goto L_0x0a4c
        L_0x09f3:
            byte[] r1 = new byte[r11]
            r2.A0m = r1
            goto L_0x09ca
        L_0x09f8:
            int r0 = r6.A05
            if (r0 != r5) goto L_0x0f02
            android.util.SparseArray r1 = r6.A0d
            int r0 = r6.A06
            java.lang.Object r2 = r1.get(r0)
            X.7Uh r2 = (X.C151327Uh) r2
            int r0 = r6.A01
            if (r0 != r4) goto L_0x0a4c
            java.lang.String r1 = "V_VP9"
            java.lang.String r0 = r2.A0e
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a4c
            X.7pi r0 = r6.A0g
            r0.A0Q(r11)
            byte[] r1 = r0.A02
            goto L_0x09ca
        L_0x0a1c:
            X.7pi r3 = r6.A0n
            byte[] r0 = r3.A02
            java.util.Arrays.fill(r0, r9)
            byte[] r2 = r3.A02
            int r1 = 4 - r11
            r0 = r29
            r0.readFully(r2, r1, r11)
            r3.A0S(r9)
            long r1 = r3.A0I()
            int r0 = (int) r1
            r6.A0C = r0
            goto L_0x0f02
        L_0x0a38:
            byte[] r2 = new byte[r11]
            r0 = r29
            r0.readFully(r2, r9, r11)
            X.7Uh r1 = A00(r6, r1)
            X.7WZ r0 = new X.7WZ
            r0.<init>(r8, r2, r9, r9)
            r1.A0b = r0
            goto L_0x0f02
        L_0x0a4c:
            r0 = r29
            r0.BpP(r11)
            goto L_0x0f02
        L_0x0a53:
            int r0 = r6.A05
            r18 = 8
            if (r0 != 0) goto L_0x0a78
            X.7iH r7 = r6.A0f
            r1 = r29
            r0 = r18
            long r0 = r7.A00(r1, r0, r9, r8)
            int r3 = (int) r0
            r6.A06 = r3
            int r0 = r7.A00
            r6.A07 = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.A0D = r0
            r6.A05 = r8
            X.7pi r0 = r6.A0m
            r0.A0Q(r9)
        L_0x0a78:
            android.util.SparseArray r1 = r6.A0d
            int r0 = r6.A06
            java.lang.Object r7 = r1.get(r0)
            X.7Uh r7 = (X.C151327Uh) r7
            if (r7 != 0) goto L_0x0a90
            int r0 = r6.A07
            int r11 = r11 - r0
            r0 = r29
            r0.BpP(r11)
        L_0x0a8c:
            r6.A05 = r9
            goto L_0x0f02
        L_0x0a90:
            X.8tw r0 = r7.A0c
            r0.getClass()
            int r0 = r6.A05
            if (r0 != r8) goto L_0x0aea
            r16 = 3
            r1 = r29
            r0 = r16
            r6.A07(r1, r0)
            X.7pi r14 = r6.A0m
            byte[] r0 = r14.A02
            byte r0 = r0[r5]
            r12 = r0 & 6
            int r12 = r12 >> r8
            r0 = 255(0xff, float:3.57E-43)
            if (r12 != 0) goto L_0x0b27
            r6.A03 = r8
            int[] r3 = r6.A0c
            if (r3 != 0) goto L_0x0b1d
            int[] r3 = new int[r8]
        L_0x0ab7:
            r6.A0c = r3
            int r1 = r6.A07
            int r11 = r11 - r1
            int r11 = r11 - r16
            r3[r9] = r11
        L_0x0ac0:
            byte[] r11 = r14.A02
            byte r3 = r11[r9]
            int r3 = r3 << r18
            byte r1 = r11[r8]
            r1 = r1 & r0
            r3 = r3 | r1
            long r0 = r6.A0F
            long r3 = (long) r3
            long r3 = r6.A04(r3)
            long r0 = r0 + r3
            r6.A0E = r0
            int r0 = r7.A0W
            if (r0 == r5) goto L_0x0ae3
            r0 = 163(0xa3, float:2.28E-43)
            if (r2 != r0) goto L_0x0b1b
            byte r1 = r11[r5]
            r0 = 128(0x80, float:1.794E-43)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x0b1b
        L_0x0ae3:
            r0 = 1
        L_0x0ae4:
            r6.A02 = r0
            r6.A05 = r5
            r6.A04 = r9
        L_0x0aea:
            r0 = 163(0xa3, float:2.28E-43)
            if (r2 != r0) goto L_0x0c13
        L_0x0aee:
            int r1 = r6.A04
            int r0 = r6.A03
            if (r1 >= r0) goto L_0x0a8c
            int[] r0 = r6.A0c
            r1 = r0[r1]
            r0 = r29
            int r14 = r6.A03(r0, r7, r1)
            long r2 = r6.A0E
            int r1 = r6.A04
            int r0 = r7.A0J
            int r1 = r1 * r0
            int r0 = r1 / 1000
            long r0 = (long) r0
            long r0 = r0 + r2
            int r2 = r6.A02
            r11 = r6
            r12 = r7
            r13 = r2
            r15 = r9
            r16 = r0
            r11.A08(r12, r13, r14, r15, r16)
            int r0 = r6.A04
            int r0 = r0 + 1
            r6.A04 = r0
            goto L_0x0aee
        L_0x0b1b:
            r0 = 0
            goto L_0x0ae4
        L_0x0b1d:
            int r1 = r3.length
            if (r1 >= r8) goto L_0x0ab7
            int r1 = java.lang.Math.max(r9, r8)
            int[] r3 = new int[r1]
            goto L_0x0ab7
        L_0x0b27:
            r13 = 4
            r6.A07(r1, r4)
            byte[] r1 = r14.A02
            byte r1 = r1[r16]
            r1 = r1 & r0
            int r15 = r1 + 1
            r6.A03 = r15
            int[] r3 = r6.A0c
            if (r3 != 0) goto L_0x0b48
            int[] r3 = new int[r15]
        L_0x0b3a:
            r6.A0c = r3
            if (r12 != r5) goto L_0x0b54
            int r1 = r6.A07
            int r11 = r11 - r1
            int r11 = r11 - r4
            int r11 = r11 / r15
            java.util.Arrays.fill(r3, r9, r15, r11)
            goto L_0x0ac0
        L_0x0b48:
            int r1 = r3.length
            if (r1 >= r15) goto L_0x0b3a
            int r1 = r1 * 2
            int r1 = java.lang.Math.max(r1, r15)
            int[] r3 = new int[r1]
            goto L_0x0b3a
        L_0x0b54:
            if (r12 != r8) goto L_0x0b83
            r12 = 0
            r15 = 0
        L_0x0b58:
            int r4 = r6.A03
            int r1 = r4 + -1
            if (r12 >= r1) goto L_0x0b7b
            r3[r12] = r9
        L_0x0b60:
            int r13 = r13 + 1
            r1 = r29
            r6.A07(r1, r13)
            byte[] r3 = r14.A02
            int r1 = r13 + -1
            byte r4 = r3[r1]
            r4 = r4 & r0
            int[] r3 = r6.A0c
            r1 = r3[r12]
            int r1 = r1 + r4
            r3[r12] = r1
            if (r4 == r0) goto L_0x0b60
            int r15 = r15 + r1
            int r12 = r12 + 1
            goto L_0x0b58
        L_0x0b7b:
            int r4 = r4 - r8
            int r1 = r6.A07
            int r11 = r11 - r1
            int r11 = r11 - r13
            int r11 = r11 - r15
            goto L_0x0c0f
        L_0x0b83:
            r1 = r16
            if (r12 != r1) goto L_0x108c
            r15 = 0
            r20 = 0
        L_0x0b8a:
            int r4 = r6.A03
            int r1 = r4 + -1
            if (r15 >= r1) goto L_0x0c08
            r3[r15] = r9
            int r13 = r13 + 1
            r1 = r29
            r6.A07(r1, r13)
            byte[] r3 = r14.A02
            int r17 = r13 + -1
            byte r1 = r3[r17]
            if (r1 == 0) goto L_0x1085
            r12 = 0
        L_0x0ba2:
            int r1 = 7 - r12
            int r4 = r8 << r1
            byte r1 = r3[r17]
            r1 = r1 & r4
            if (r1 == 0) goto L_0x0bd1
            int r13 = r13 + r12
            r1 = r29
            r6.A07(r1, r13)
            byte[] r1 = r14.A02
            r19 = r1
            int r16 = r17 + 1
            byte r3 = r1[r17]
            r3 = r3 & r0
            int r1 = ~r4
            r1 = r1 & r3
            long r3 = (long) r1
        L_0x0bbd:
            r1 = r16
            if (r1 >= r13) goto L_0x0bda
            long r3 = r3 << r18
            int r18 = r16 + 1
            byte r1 = r19[r16]
            r1 = r1 & r0
            long r0 = (long) r1
            long r3 = r3 | r0
            r16 = r18
            r18 = 8
            r0 = 255(0xff, float:3.57E-43)
            goto L_0x0bbd
        L_0x0bd1:
            int r12 = r12 + 1
            r1 = r18
            if (r12 < r1) goto L_0x0ba2
            r3 = 0
            goto L_0x0bf5
        L_0x0bda:
            if (r15 <= 0) goto L_0x0be7
            int r0 = r12 * 7
            int r0 = r0 + 6
            r16 = 1
            long r0 = r16 << r0
            long r0 = r0 - r16
            long r3 = r3 - r0
        L_0x0be7:
            r16 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x107e
            r16 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x107e
        L_0x0bf5:
            int r1 = (int) r3
            int[] r3 = r6.A0c
            if (r15 == 0) goto L_0x0bff
            int r0 = r15 + -1
            r0 = r3[r0]
            int r1 = r1 + r0
        L_0x0bff:
            r3[r15] = r1
            int r20 = r20 + r1
            int r15 = r15 + 1
            r0 = 255(0xff, float:3.57E-43)
            goto L_0x0b8a
        L_0x0c08:
            int r4 = r4 - r8
            int r1 = r6.A07
            int r11 = r11 - r1
            int r11 = r11 - r13
            int r11 = r11 - r20
        L_0x0c0f:
            r3[r4] = r11
            goto L_0x0ac0
        L_0x0c13:
            int r3 = r6.A04
            int r0 = r6.A03
            if (r3 >= r0) goto L_0x0f02
            int[] r2 = r6.A0c
            r1 = r2[r3]
            r0 = r29
            int r0 = r6.A03(r0, r7, r1)
            r2[r3] = r0
            int r0 = r6.A04
            int r0 = r0 + 1
            r6.A04 = r0
            goto L_0x0c13
        L_0x0c2c:
            long r0 = r10.A02
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x1097
            int r6 = (int) r0
            if (r6 != 0) goto L_0x0c57
            java.lang.String r5 = ""
        L_0x0c3a:
            X.86u r3 = (X.C1687986u) r3
            X.86a r1 = r3.A00
            r0 = 134(0x86, float:1.88E-43)
            if (r2 == r0) goto L_0x0c9d
            r0 = 17026(0x4282, float:2.3859E-41)
            if (r2 == r0) goto L_0x0c76
            r0 = 21358(0x536e, float:2.9929E-41)
            if (r2 == r0) goto L_0x0c6e
            r0 = 2274716(0x22b59c, float:3.187556E-39)
            if (r2 != r0) goto L_0x0f02
            X.7Uh r0 = A00(r1, r0)
            r0.A0f = r5
            goto L_0x0f02
        L_0x0c57:
            byte[] r4 = new byte[r6]
            r0 = r29
            r0.readFully(r4, r9, r6)
        L_0x0c5e:
            if (r6 <= 0) goto L_0x0c68
            int r1 = r6 + -1
            byte r0 = r4[r1]
            if (r0 != 0) goto L_0x0c68
            r6 = r1
            goto L_0x0c5e
        L_0x0c68:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4, r9, r6)
            goto L_0x0c3a
        L_0x0c6e:
            X.7Uh r0 = A00(r1, r0)
            r0.A0g = r5
            goto L_0x0f02
        L_0x0c76:
            java.lang.String r0 = "webm"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0f02
            java.lang.String r0 = "matroska"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0f02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DocType "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " not supported"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x0c9d:
            X.7Uh r0 = A00(r1, r0)
            r0.A0e = r5
            goto L_0x0f02
        L_0x0ca5:
            long r0 = r10.A02
            int r6 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r6 > 0) goto L_0x10b4
            int r11 = (int) r0
            byte[] r13 = r10.A06
            r12 = 0
            r0 = r29
            r0.readFully(r13, r9, r11)
            r0 = 0
        L_0x0cb6:
            if (r12 >= r11) goto L_0x0cc4
            r6 = 8
            long r0 = r0 << r6
            byte r6 = r13[r12]
            r6 = r6 & 255(0xff, float:3.57E-43)
            long r6 = (long) r6
            long r0 = r0 | r6
            int r12 = r12 + 1
            goto L_0x0cb6
        L_0x0cc4:
            X.86u r3 = (X.C1687986u) r3
            X.86a r3 = r3.A00
            r7 = 20529(0x5031, float:2.8767E-41)
            java.lang.String r6 = " not supported"
            if (r2 == r7) goto L_0x0ed3
            r7 = 20530(0x5032, float:2.8769E-41)
            r12 = 1
            if (r2 == r7) goto L_0x0ec1
            r11 = 0
            r7 = 3
            switch(r2) {
                case 131: goto L_0x0d50;
                case 136: goto L_0x0d59;
                case 155: goto L_0x0de6;
                case 159: goto L_0x0d66;
                case 176: goto L_0x0d6f;
                case 179: goto L_0x0dee;
                case 186: goto L_0x0d78;
                case 215: goto L_0x0d81;
                case 231: goto L_0x0dfc;
                case 238: goto L_0x0e04;
                case 241: goto L_0x0e09;
                case 251: goto L_0x0e19;
                case 16871: goto L_0x0d8a;
                case 16980: goto L_0x0e1d;
                case 17029: goto L_0x0e31;
                case 17143: goto L_0x0e3d;
                case 18401: goto L_0x0e4f;
                case 18408: goto L_0x0e63;
                case 21420: goto L_0x0e75;
                case 21432: goto L_0x0e7c;
                case 21680: goto L_0x0d93;
                case 21682: goto L_0x0d9c;
                case 21690: goto L_0x0da5;
                case 21930: goto L_0x0dae;
                case 21998: goto L_0x0dbb;
                case 22186: goto L_0x0dc4;
                case 22203: goto L_0x0dcc;
                case 25188: goto L_0x0dd4;
                case 30321: goto L_0x0e9e;
                case 2352003: goto L_0x0ddd;
                case 2807729: goto L_0x0ebe;
                default: goto L_0x0cd9;
            }
        L_0x0cd9:
            r11 = 7
            r6 = 6
            switch(r2) {
                case 21945: goto L_0x0cf2;
                case 21946: goto L_0x0d06;
                case 21947: goto L_0x0d2c;
                case 21948: goto L_0x0ce0;
                case 21949: goto L_0x0ce9;
                default: goto L_0x0cde;
            }
        L_0x0cde:
            goto L_0x0f02
        L_0x0ce0:
            X.7Uh r3 = A00(r3, r2)
            int r2 = (int) r0
            r3.A0P = r2
            goto L_0x0f02
        L_0x0ce9:
            X.7Uh r3 = A00(r3, r2)
            int r2 = (int) r0
            r3.A0Q = r2
            goto L_0x0f02
        L_0x0cf2:
            r3.A06(r2)
            int r2 = (int) r0
            if (r2 == r8) goto L_0x0d00
            if (r2 != r5) goto L_0x0f02
            X.7Uh r0 = r3.A0P
            r0.A0G = r8
            goto L_0x0f02
        L_0x0d00:
            X.7Uh r0 = r3.A0P
            r0.A0G = r5
            goto L_0x0f02
        L_0x0d06:
            r3.A06(r2)
            int r2 = (int) r0
            if (r2 == r8) goto L_0x0d26
            r0 = 16
            if (r2 == r0) goto L_0x0d20
            r0 = 18
            if (r2 == r0) goto L_0x0d1a
            if (r2 == r6) goto L_0x0d26
            if (r2 == r11) goto L_0x0d26
            goto L_0x0f02
        L_0x0d1a:
            X.7Uh r0 = r3.A0P
            r0.A0I = r11
            goto L_0x0f02
        L_0x0d20:
            X.7Uh r0 = r3.A0P
            r0.A0I = r6
            goto L_0x0f02
        L_0x0d26:
            X.7Uh r0 = r3.A0P
            r0.A0I = r7
            goto L_0x0f02
        L_0x0d2c:
            X.7Uh r3 = A00(r3, r2)
            r3.A0j = r8
            int r2 = (int) r0
            if (r2 == r8) goto L_0x0d4c
            r0 = 9
            if (r2 == r0) goto L_0x0d48
            if (r2 == r4) goto L_0x0d44
            r0 = 5
            if (r2 == r0) goto L_0x0d44
            if (r2 == r6) goto L_0x0d44
            if (r2 == r11) goto L_0x0d44
            goto L_0x0f02
        L_0x0d44:
            r3.A0H = r5
            goto L_0x0f02
        L_0x0d48:
            r3.A0H = r6
            goto L_0x0f02
        L_0x0d4c:
            r3.A0H = r8
            goto L_0x0f02
        L_0x0d50:
            X.7Uh r3 = A00(r3, r2)
            int r2 = (int) r0
            r3.A0W = r2
            goto L_0x0f02
        L_0x0d59:
            X.7Uh r3 = A00(r3, r2)
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0d62
            r11 = 1
        L_0x0d62:
            r3.A0h = r11
            goto L_0x0f02
        L_0x0d66:
            X.7Uh r3 = A00(r3, r2)
            int r2 = (int) r0
            r3.A0F = r2
            goto L_0x0f02
        L_0x0d6f:
            X.7Uh r3 = A00(r3, r2)
            int r2 = (int) r0
            r3.A0X = r2
            goto L_0x0f02
        L_0x0d78:
            X.7Uh r3 = A00(r3, r2)
            int r2 = (int) r0
            r3.A0N = r2
            goto L_0x0f02
        L_0x0d81:
            X.7Uh r3 = A00(r3, r2)
            int r2 = (int) r0
            r3.A0S = r2
            goto L_0x0f02
        L_0x0d8a:
            X.7Uh r3 = A00(r3, r2)
            int r2 = (int) r0
            r3.A0E = r2
            goto L_0x0f02
        L_0x0d93:
            X.7Uh r3 = A00(r3, r2)
            int r2 = (int) r0
            r3.A0M = r2
            goto L_0x0f02
        L_0x0d9c:
            X.7Uh r3 = A00(r3, r2)
            int r2 = (int) r0
            r3.A0L = r2
            goto L_0x0f02
        L_0x0da5:
            X.7Uh r3 = A00(r3, r2)
            int r2 = (int) r0
            r3.A0K = r2
            goto L_0x0f02
        L_0x0dae:
            X.7Uh r3 = A00(r3, r2)
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0db7
            r11 = 1
        L_0x0db7:
            r3.A0i = r11
            goto L_0x0f02
        L_0x0dbb:
            X.7Uh r3 = A00(r3, r2)
            int r2 = (int) r0
            r3.A0O = r2
            goto L_0x0f02
        L_0x0dc4:
            X.7Uh r2 = A00(r3, r2)
            r2.A0Y = r0
            goto L_0x0f02
        L_0x0dcc:
            X.7Uh r2 = A00(r3, r2)
            r2.A0Z = r0
            goto L_0x0f02
        L_0x0dd4:
            X.7Uh r3 = A00(r3, r2)
            int r2 = (int) r0
            r3.A0D = r2
            goto L_0x0f02
        L_0x0ddd:
            X.7Uh r3 = A00(r3, r2)
            int r2 = (int) r0
            r3.A0J = r2
            goto L_0x0f02
        L_0x0de6:
            long r0 = r3.A04(r0)
            r3.A0D = r0
            goto L_0x0f02
        L_0x0dee:
            r3.A05(r2)
            X.7Vf r2 = r3.A0R
            long r0 = r3.A04(r0)
            r2.A00(r0)
            goto L_0x0f02
        L_0x0dfc:
            long r0 = r3.A04(r0)
            r3.A0F = r0
            goto L_0x0f02
        L_0x0e04:
            int r2 = (int) r0
            r3.A01 = r2
            goto L_0x0f02
        L_0x0e09:
            boolean r4 = r3.A0a
            if (r4 != 0) goto L_0x0f02
            r3.A05(r2)
            X.7Vf r2 = r3.A0Q
            r2.A00(r0)
            r3.A0a = r8
            goto L_0x0f02
        L_0x0e19:
            r3.A0T = r8
            goto L_0x0f02
        L_0x0e1d:
            r3 = 3
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0f02
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "ContentCompAlgo "
            X.C18310x6.A1N(r2, r6, r3, r0)
            X.6u7 r0 = X.AnonymousClass6u7.A00(r3)
            throw r0
        L_0x0e31:
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 < 0) goto L_0x10a6
            r3 = 2
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x10a6
            goto L_0x0f02
        L_0x0e3d:
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x0f02
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "EBMLReadVersion "
            X.C18310x6.A1N(r2, r6, r3, r0)
            X.6u7 r0 = X.AnonymousClass6u7.A00(r3)
            throw r0
        L_0x0e4f:
            r3 = 5
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0f02
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "ContentEncAlgo "
            X.C18310x6.A1N(r2, r6, r3, r0)
            X.6u7 r0 = X.AnonymousClass6u7.A00(r3)
            throw r0
        L_0x0e63:
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x0f02
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "AESSettingsCipherMode "
            X.C18310x6.A1N(r2, r6, r3, r0)
            X.6u7 r0 = X.AnonymousClass6u7.A00(r3)
            throw r0
        L_0x0e75:
            long r4 = r3.A0L
            long r0 = r0 + r4
            r3.A0J = r0
            goto L_0x0f02
        L_0x0e7c:
            int r4 = (int) r0
            r3.A06(r2)
            if (r4 == 0) goto L_0x0e99
            if (r4 == r8) goto L_0x0e94
            if (r4 == r7) goto L_0x0e8f
            r0 = 15
            if (r4 != r0) goto L_0x0f02
            X.7Uh r0 = r3.A0P
            r0.A0V = r7
            goto L_0x0f02
        L_0x0e8f:
            X.7Uh r0 = r3.A0P
            r0.A0V = r8
            goto L_0x0f02
        L_0x0e94:
            X.7Uh r0 = r3.A0P
            r0.A0V = r5
            goto L_0x0f02
        L_0x0e99:
            X.7Uh r0 = r3.A0P
            r0.A0V = r9
            goto L_0x0f02
        L_0x0e9e:
            r3.A06(r2)
            int r2 = (int) r0
            if (r2 == 0) goto L_0x0eb9
            if (r2 == r8) goto L_0x0eb4
            if (r2 == r5) goto L_0x0eaf
            if (r2 != r7) goto L_0x0f02
            X.7Uh r0 = r3.A0P
            r0.A0T = r7
            goto L_0x0f02
        L_0x0eaf:
            X.7Uh r0 = r3.A0P
            r0.A0T = r5
            goto L_0x0f02
        L_0x0eb4:
            X.7Uh r0 = r3.A0P
            r0.A0T = r8
            goto L_0x0f02
        L_0x0eb9:
            X.7Uh r0 = r3.A0P
            r0.A0T = r9
            goto L_0x0f02
        L_0x0ebe:
            r3.A0N = r0
            goto L_0x0f02
        L_0x0ec1:
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x0f02
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "ContentEncodingScope "
            X.C18310x6.A1N(r2, r6, r3, r0)
            X.6u7 r0 = X.AnonymousClass6u7.A00(r3)
            throw r0
        L_0x0ed3:
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0f02
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "ContentEncodingOrder "
            X.C18310x6.A1N(r2, r6, r3, r0)
            X.6u7 r0 = X.AnonymousClass6u7.A00(r3)
            throw r0
        L_0x0ee7:
            r4 = 4
            if (r6 != r4) goto L_0x0f7a
            int r4 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r4)
            double r0 = (double) r0
        L_0x0ef0:
            X.86u r3 = (X.C1687986u) r3
            X.86a r4 = r3.A00
            r3 = 181(0xb5, float:2.54E-43)
            if (r2 == r3) goto L_0x0f72
            r3 = 17545(0x4489, float:2.4586E-41)
            if (r2 == r3) goto L_0x0f6e
            switch(r2) {
                case 21969: goto L_0x0f1e;
                case 21970: goto L_0x0f26;
                case 21971: goto L_0x0f2e;
                case 21972: goto L_0x0f36;
                case 21973: goto L_0x0f3e;
                case 21974: goto L_0x0f46;
                case 21975: goto L_0x0f4e;
                case 21976: goto L_0x0f56;
                case 21977: goto L_0x0f5e;
                case 21978: goto L_0x0f66;
                default: goto L_0x0eff;
            }
        L_0x0eff:
            switch(r2) {
                case 30323: goto L_0x0f06;
                case 30324: goto L_0x0f0e;
                case 30325: goto L_0x0f16;
                default: goto L_0x0f02;
            }
        L_0x0f02:
            r10.A01 = r9
            goto L_0x0fc5
        L_0x0f06:
            X.7Uh r3 = A00(r4, r2)
            float r2 = (float) r0
            r3.A0A = r2
            goto L_0x0f02
        L_0x0f0e:
            X.7Uh r3 = A00(r4, r2)
            float r2 = (float) r0
            r3.A08 = r2
            goto L_0x0f02
        L_0x0f16:
            X.7Uh r3 = A00(r4, r2)
            float r2 = (float) r0
            r3.A09 = r2
            goto L_0x0f02
        L_0x0f1e:
            X.7Uh r3 = A00(r4, r2)
            float r2 = (float) r0
            r3.A06 = r2
            goto L_0x0f02
        L_0x0f26:
            X.7Uh r3 = A00(r4, r2)
            float r2 = (float) r0
            r3.A07 = r2
            goto L_0x0f02
        L_0x0f2e:
            X.7Uh r3 = A00(r4, r2)
            float r2 = (float) r0
            r3.A04 = r2
            goto L_0x0f02
        L_0x0f36:
            X.7Uh r3 = A00(r4, r2)
            float r2 = (float) r0
            r3.A05 = r2
            goto L_0x0f02
        L_0x0f3e:
            X.7Uh r3 = A00(r4, r2)
            float r2 = (float) r0
            r3.A02 = r2
            goto L_0x0f02
        L_0x0f46:
            X.7Uh r3 = A00(r4, r2)
            float r2 = (float) r0
            r3.A03 = r2
            goto L_0x0f02
        L_0x0f4e:
            X.7Uh r3 = A00(r4, r2)
            float r2 = (float) r0
            r3.A0B = r2
            goto L_0x0f02
        L_0x0f56:
            X.7Uh r3 = A00(r4, r2)
            float r2 = (float) r0
            r3.A0C = r2
            goto L_0x0f02
        L_0x0f5e:
            X.7Uh r3 = A00(r4, r2)
            float r2 = (float) r0
            r3.A00 = r2
            goto L_0x0f02
        L_0x0f66:
            X.7Uh r3 = A00(r4, r2)
            float r2 = (float) r0
            r3.A01 = r2
            goto L_0x0f02
        L_0x0f6e:
            long r2 = (long) r0
            r4.A0H = r2
            goto L_0x0f02
        L_0x0f72:
            X.7Uh r3 = A00(r4, r3)
            int r2 = (int) r0
            r3.A0U = r2
            goto L_0x0f02
        L_0x0f7a:
            double r0 = java.lang.Double.longBitsToDouble(r0)
            goto L_0x0ef0
        L_0x0f80:
            long r2 = r1.A0M
            long r6 = r6 + r2
            r2 = r12[r0]
            long r6 = r6 - r2
            int r2 = (int) r6
            r13[r0] = r2
            r2 = r10[r0]
            long r4 = r4 - r2
            r11[r0] = r4
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x0fb3
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "Discarding last cue point with unexpected duration: "
            java.lang.String r3 = X.AnonymousClass000.A0Z(r2, r3, r4)
            java.lang.String r2 = "MatroskaExtractor"
            android.util.Log.w(r2, r3)
            int[] r13 = java.util.Arrays.copyOf(r13, r0)
            long[] r12 = java.util.Arrays.copyOf(r12, r0)
            long[] r11 = java.util.Arrays.copyOf(r11, r0)
            long[] r10 = java.util.Arrays.copyOf(r10, r0)
        L_0x0fb3:
            X.86p r2 = new X.86p
            r2.<init>(r13, r12, r11, r10)
        L_0x0fb8:
            r0 = r26
            r0.Bl0(r2)
            r1.A0b = r8
        L_0x0fbf:
            r0 = r18
            r1.A0R = r0
            r1.A0Q = r0
        L_0x0fc5:
            long r1 = r29.BBW()
            r0 = r27
            boolean r0 = r0.A0Z
            r5 = r30
            if (r0 == 0) goto L_0x0fde
            r0 = r27
            r0.A0K = r1
            long r0 = r0.A0G
            r5.A00 = r0
            r0 = r27
            r0.A0Z = r9
            return r8
        L_0x0fde:
            r0 = r27
            boolean r0 = r0.A0b
            if (r0 == 0) goto L_0x0008
            r0 = r27
            long r3 = r0.A0K
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0008
            r5.A00 = r3
            r0 = r27
            r0.A0K = r1
            return r8
        L_0x0ff5:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid index "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", size is "
            r1.append(r0)
            r0 = r21
            int r0 = r0.A00
            java.lang.IndexOutOfBoundsException r0 = X.AnonymousClass6C7.A0Y(r1, r0)
            throw r0
        L_0x100f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid index "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", size is "
            r1.append(r0)
            r0 = r22
            int r0 = r0.A00
            java.lang.IndexOutOfBoundsException r0 = X.AnonymousClass6C7.A0Y(r1, r0)
            throw r0
        L_0x1029:
            java.lang.String r0 = "No valid tracks were found"
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x1030:
            java.lang.String r0 = "Encrypted Track found but ContentEncKeyID was not found"
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x1037:
            java.lang.String r0 = "Mandatory element SeekID or SeekPosition not found"
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x103e:
            java.lang.String r0 = "Failed to find FourCC VC1 initialization data"
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1045 }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1045 }
        L_0x1045:
            java.lang.String r0 = "Error parsing FourCC private data"
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x104c:
            X.6u7 r0 = X.AnonymousClass6u7.A01(r15)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1060 }
            goto L_0x105f
        L_0x1051:
            X.6u7 r0 = X.AnonymousClass6u7.A01(r15)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1060 }
            goto L_0x105f
        L_0x1056:
            X.6u7 r0 = X.AnonymousClass6u7.A01(r15)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1060 }
            goto L_0x105f
        L_0x105b:
            X.6u7 r0 = X.AnonymousClass6u7.A01(r15)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1060 }
        L_0x105f:
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1060 }
        L_0x1060:
            X.6u7 r0 = X.AnonymousClass6u7.A01(r15)
            throw r0
        L_0x1065:
            java.lang.String r0 = "Error parsing MS/ACM codec private"
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x106c:
            java.lang.String r0 = "CodecId is missing in TrackEntry element"
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x1073:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected id: "
            X.6u7 r0 = X.AnonymousClass6u7.A02(r0, r1, r2)
            throw r0
        L_0x107e:
            java.lang.String r0 = "EBML lacing sample size out of range."
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x1085:
            java.lang.String r0 = "No valid varint length mask found"
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x108c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected lacing value: "
            X.6u7 r0 = X.AnonymousClass6u7.A02(r0, r1, r12)
            throw r0
        L_0x1097:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "String element size: "
            java.lang.String r0 = X.AnonymousClass000.A0Z(r2, r3, r0)
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x10a6:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "DocTypeReadVersion "
            X.C18310x6.A1N(r2, r6, r3, r0)
            X.6u7 r0 = X.AnonymousClass6u7.A00(r3)
            throw r0
        L_0x10b4:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "Invalid integer size: "
            java.lang.String r0 = X.AnonymousClass000.A0Z(r2, r3, r0)
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x10c3:
            r0 = r27
            android.util.SparseArray r1 = r0.A0d
            int r0 = r1.size()
            if (r9 >= r0) goto L_0x10e2
            java.lang.Object r1 = r1.valueAt(r9)
            X.7Uh r1 = (X.C151327Uh) r1
            X.8tw r0 = r1.A0c
            r0.getClass()
            X.7UE r0 = r1.A0d
            if (r0 == 0) goto L_0x10df
            r0.A00(r1)
        L_0x10df:
            int r9 = r9 + 1
            goto L_0x10c3
        L_0x10e2:
            r0 = -1
            return r0
        L_0x10e4:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1685986a.BiD(X.8xa, X.7BG):int");
    }

    public C1685986a() {
        this(0);
    }
}
