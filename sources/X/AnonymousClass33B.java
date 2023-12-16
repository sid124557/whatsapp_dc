package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.33B  reason: invalid class name */
public final class AnonymousClass33B {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final long A0E;
    public final long A0F;
    public final long A0G;
    public final long A0H;
    public final long A0I;
    public final long A0J;
    public final long A0K;
    public final long A0L;
    public final long A0M;
    public final long A0N;
    public final long A0O;
    public final long A0P;
    public final long A0Q;
    public final long A0R;
    public final long A0S;
    public final long A0T;
    public final long A0U;
    public final long A0V;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass33B) {
                AnonymousClass33B r8 = (AnonymousClass33B) obj;
                if (!(this.A0M == r8.A0M && this.A0J == r8.A0J && this.A0L == r8.A0L && this.A0K == r8.A0K && this.A0O == r8.A0O && this.A0N == r8.A0N && this.A0U == r8.A0U && this.A0Q == r8.A0Q && this.A0R == r8.A0R && this.A0S == r8.A0S && this.A0T == r8.A0T && this.A0V == r8.A0V && this.A05 == r8.A05 && this.A02 == r8.A02 && this.A08 == r8.A08 && this.A03 == r8.A03 && this.A04 == r8.A04 && this.A09 == r8.A09 && this.A01 == r8.A01 && this.A00 == r8.A00 && this.A06 == r8.A06 && this.A07 == r8.A07 && this.A0P == r8.A0P && this.A0A == r8.A0A && this.A0B == r8.A0B && this.A0C == r8.A0C && this.A0D == r8.A0D && this.A0F == r8.A0F && this.A0G == r8.A0G && this.A0H == r8.A0H && this.A0I == r8.A0I && this.A0E == r8.A0E)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass0x2.A02(this.A0M), this.A0J), this.A0L), this.A0K), this.A0O), this.A0N), this.A0U), this.A0Q), this.A0R), this.A0S), this.A0T), this.A0V), this.A05), this.A02), this.A08), this.A03), this.A04), this.A09), this.A01), this.A00), this.A06), this.A07), this.A0P), this.A0A), this.A0B), this.A0C), this.A0D), this.A0F), this.A0G), this.A0H), this.A0I), this.A0E);
    }

    public AnonymousClass33B(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32) {
        this.A0M = j;
        this.A0J = j2;
        this.A0L = j3;
        this.A0K = j4;
        this.A0O = j5;
        this.A0N = j6;
        this.A0U = j7;
        this.A0Q = j8;
        this.A0R = j9;
        this.A0S = j10;
        this.A0T = j11;
        this.A0V = j12;
        this.A05 = j13;
        this.A02 = j14;
        this.A08 = j15;
        this.A03 = j16;
        this.A04 = j17;
        this.A09 = j18;
        this.A01 = j19;
        this.A00 = j20;
        this.A06 = j21;
        this.A07 = j22;
        this.A0P = j23;
        this.A0A = j24;
        this.A0B = j25;
        this.A0C = j26;
        this.A0D = j27;
        this.A0F = j28;
        this.A0G = j29;
        this.A0H = j30;
        this.A0I = j31;
        this.A0E = j32;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MediaEngagementReceivedDailyStat(numPhotoReceived=");
        A0o.append(this.A0M);
        A0o.append(", numPhotoDownloaded=");
        A0o.append(this.A0J);
        A0o.append(", numPhotoMidScan=");
        A0o.append(this.A0L);
        A0o.append(", numPhotoFull=");
        A0o.append(this.A0K);
        A0o.append(", numPhotoWifi=");
        A0o.append(this.A0O);
        A0o.append(", numPhotoVoDownloaded=");
        A0o.append(this.A0N);
        A0o.append(", numVideoReceived=");
        A0o.append(this.A0U);
        A0o.append(", numVideoDownloaded=");
        A0o.append(this.A0Q);
        A0o.append(", numVideoDownloadedLte=");
        A0o.append(this.A0R);
        A0o.append(", numVideoDownloadedWifi=");
        A0o.append(this.A0S);
        A0o.append(", numVideoHdDownloaded=");
        A0o.append(this.A0T);
        A0o.append(", numVideoVoDownloaded=");
        A0o.append(this.A0V);
        A0o.append(", numDocsReceived=");
        A0o.append(this.A05);
        A0o.append(", numDocsDownloaded=");
        A0o.append(this.A02);
        A0o.append(", numLargeDocsReceived=");
        A0o.append(this.A08);
        A0o.append(", numDocsDownloadedLte=");
        A0o.append(this.A03);
        A0o.append(", numDocsDownloadedWifi=");
        A0o.append(this.A04);
        A0o.append(", numMediaAsDocsDownloaded=");
        A0o.append(this.A09);
        A0o.append(", numAudioReceived=");
        A0o.append(this.A01);
        A0o.append(", numAudioDownloaded=");
        A0o.append(this.A00);
        A0o.append(", numGifDownloaded=");
        A0o.append(this.A06);
        A0o.append(", numInlinePlayedVideo=");
        A0o.append(this.A07);
        A0o.append(", numUrlReceived=");
        A0o.append(this.A0P);
        A0o.append(", numMediaChatDownloaded=");
        A0o.append(this.A0A);
        A0o.append(", numMediaChatReceived=");
        A0o.append(this.A0B);
        A0o.append(", numMediaCommunityDownloaded=");
        A0o.append(this.A0C);
        A0o.append(", numMediaCommunityReceived=");
        A0o.append(this.A0D);
        A0o.append(", numMediaGroupDownloaded=");
        A0o.append(this.A0F);
        A0o.append(", numMediaGroupReceived=");
        A0o.append(this.A0G);
        A0o.append(", numMediaStatusDownloaded=");
        A0o.append(this.A0H);
        A0o.append(", numMediaStatusReceived=");
        A0o.append(this.A0I);
        A0o.append(", numMediaDownloadFailed=");
        return C18270x1.A0U(A0o, this.A0E);
    }

    public static /* synthetic */ AnonymousClass33B A00(AnonymousClass33B r81, int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32) {
        long j33 = j32;
        long j34 = j31;
        int i2 = i;
        long j35 = j30;
        long j36 = j13;
        long j37 = j12;
        long j38 = j11;
        long j39 = j10;
        long j40 = j9;
        long j41 = j8;
        long j42 = j7;
        long j43 = j6;
        long j44 = j5;
        long j45 = j4;
        long j46 = j3;
        long j47 = j2;
        long j48 = j;
        long j49 = j14;
        long j50 = j15;
        long j51 = j16;
        long j52 = j17;
        long j53 = j18;
        long j54 = j19;
        long j55 = j20;
        long j56 = j21;
        long j57 = j22;
        long j58 = j23;
        long j59 = j24;
        long j60 = j25;
        long j61 = j26;
        long j62 = j27;
        long j63 = j28;
        long j64 = j29;
        AnonymousClass33B r9 = r81;
        if ((i & 1) != 0) {
            j48 = r9.A0M;
        }
        if ((i & 2) != 0) {
            j47 = r9.A0J;
        }
        if ((i & 4) != 0) {
            j46 = r9.A0L;
        }
        if ((i & 8) != 0) {
            j45 = r9.A0K;
        }
        if ((i & 16) != 0) {
            j44 = r9.A0O;
        }
        if ((i & 32) != 0) {
            j43 = r9.A0N;
        }
        if ((i & 64) != 0) {
            j42 = r9.A0U;
        }
        if ((i2 & 128) != 0) {
            j41 = r9.A0Q;
        }
        if ((i2 & 256) != 0) {
            j40 = r9.A0R;
        }
        if ((i2 & 512) != 0) {
            j39 = r9.A0S;
        }
        if ((i2 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            j38 = r9.A0T;
        }
        if ((i2 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
            j37 = r9.A0V;
        }
        if ((i2 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
            j36 = r9.A05;
        }
        if ((i2 & DefaultCrypto.BUFFER_SIZE) != 0) {
            j49 = r9.A02;
        }
        if ((i2 & 16384) != 0) {
            j50 = r9.A08;
        }
        if ((i & 32768) != 0) {
            j51 = r9.A03;
        }
        if ((i & 65536) != 0) {
            j52 = r9.A04;
        }
        if ((i & AnonymousClass35S.A0F) != 0) {
            j53 = r9.A09;
        }
        if ((i & 262144) != 0) {
            j54 = r9.A01;
        }
        if ((i & 524288) != 0) {
            j55 = r9.A00;
        }
        if ((i & 1048576) != 0) {
            j56 = r9.A06;
        }
        if ((i & 2097152) != 0) {
            j57 = r9.A07;
        }
        if ((i & 4194304) != 0) {
            j58 = r9.A0P;
        }
        if ((i & 8388608) != 0) {
            j59 = r9.A0A;
        }
        if ((i & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) != 0) {
            j60 = r9.A0B;
        }
        if ((i & 33554432) != 0) {
            j61 = r9.A0C;
        }
        if ((i & 67108864) != 0) {
            j62 = r9.A0D;
        }
        if ((i & 134217728) != 0) {
            j63 = r9.A0F;
        }
        if ((i & 268435456) != 0) {
            j64 = r9.A0G;
        }
        if ((i & 536870912) != 0) {
            j35 = r9.A0H;
        }
        if ((i & 1073741824) != 0) {
            j34 = r9.A0I;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            j33 = r9.A0E;
        }
        return new AnonymousClass33B(j48, j47, j46, j45, j44, j43, j42, j41, j40, j39, j38, j37, j36, j49, j50, j51, j52, j53, j54, j55, j56, j57, j58, j59, j60, j61, j62, j63, j64, j35, j34, j33);
    }

    public AnonymousClass33B() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }
}
