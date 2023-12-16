package X;

import android.util.Log;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7qK  reason: invalid class name and case insensitive filesystem */
public final class C161727qK {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final long A09;
    public final C147827Fw A0A;
    public final C166547ys A0B;

    public C166527yp A03(C166547ys r4, byte[] bArr) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.A04;
        if (i <= 0) {
            i = -1;
        }
        C166547ys r0 = this.A0B;
        if (r0 != null) {
            r4 = r0.A00(r4);
        }
        C157057he A002 = C157057he.A00();
        A002.A0R = "audio/flac";
        A002.A08 = i;
        A002.A04 = this.A02;
        A002.A0D = this.A07;
        A002.A0S = Collections.singletonList(bArr);
        A002.A0J = r4;
        return C166527yp.A00(A002);
    }

    public long A02() {
        long j = this.A09;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * SearchActionVerificationClientService.MS_TO_NS) / ((long) this.A07);
    }

    public C161727qK A04(C147827Fw r13) {
        return new C161727qK(r13, this.A0B, this.A05, this.A03, this.A06, this.A04, this.A07, this.A02, this.A00, this.A09);
    }

    public C161727qK(byte[] bArr, int i) {
        C160807oL r3 = new C160807oL(bArr, bArr.length);
        r3.A08(i * 8);
        this.A05 = r3.A04(16);
        this.A03 = r3.A04(16);
        this.A06 = r3.A04(24);
        this.A04 = r3.A04(24);
        int A042 = r3.A04(20);
        this.A07 = A042;
        this.A08 = A00(A042);
        this.A02 = r3.A04(3) + 1;
        int A043 = r3.A04(5) + 1;
        this.A00 = A043;
        int i2 = 1;
        if (A043 != 8) {
            i2 = 2;
            if (A043 != 12) {
                i2 = 4;
                if (A043 != 16) {
                    i2 = 5;
                    if (A043 != 20) {
                        i2 = 6;
                        if (A043 != 24) {
                            i2 = -1;
                        }
                    }
                }
            }
        }
        this.A01 = i2;
        this.A09 = AnonymousClass6C8.A0N(r3.A04(4), r3.A04(32));
        this.A0A = null;
        this.A0B = null;
    }

    public static int A00(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public static C166547ys A01(List list, List list2) {
        if (!list.isEmpty() || !list2.isEmpty()) {
            ArrayList A0s = AnonymousClass001.A0s();
            for (int i = 0; i < list.size(); i++) {
                String A0n = AnonymousClass001.A0n(list, i);
                String[] split = A0n.split("=", 2);
                if (split.length != 2) {
                    Log.w("FlacStreamMetadata", AnonymousClass000.A0V("Failed to parse Vorbis comment: ", A0n, AnonymousClass001.A0o()));
                } else {
                    A0s.add(new AnonymousClass87Z(split[0], split[1]));
                }
            }
            A0s.addAll(list2);
            if (!A0s.isEmpty()) {
                return new C166547ys((List) A0s);
            }
        }
        return null;
    }

    public C161727qK(C147827Fw r3, C166547ys r4, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        this.A05 = i;
        this.A03 = i2;
        this.A06 = i3;
        this.A04 = i4;
        this.A07 = i5;
        this.A08 = A00(i5);
        this.A02 = i6;
        this.A00 = i7;
        int i8 = 1;
        if (i7 != 8) {
            i8 = 2;
            if (i7 != 12) {
                i8 = 4;
                if (i7 != 16) {
                    i8 = 5;
                    if (i7 != 20) {
                        i8 = 6;
                        if (i7 != 24) {
                            i8 = -1;
                        }
                    }
                }
            }
        }
        this.A01 = i8;
        this.A09 = j;
        this.A0A = r3;
        this.A0B = r4;
    }
}
