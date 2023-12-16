package X;

import android.content.ContentValues;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.MediaData;
import java.io.File;

/* renamed from: X.33C  reason: invalid class name */
public class AnonymousClass33C {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public File A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public byte[] A0S;
    public byte[] A0T;
    public byte[] A0U;
    public byte[] A0V;
    public byte[] A0W;
    public InteractiveAnnotation[] A0X;
    public transient boolean A0Y;
    public transient boolean A0Z;
    public transient boolean A0a;
    public transient boolean A0b;
    public transient boolean A0c;

    public static AnonymousClass33C A00(MediaData mediaData) {
        AnonymousClass33C r2 = new AnonymousClass33C();
        r2.A0c = false;
        r2.A0a = false;
        r2.A0Y = false;
        r2.A0b = false;
        r2.A0Z = false;
        r2.A0R = mediaData.transferred;
        r2.A0C = mediaData.progress;
        r2.A0F = mediaData.file;
        r2.A0A = mediaData.fileSize;
        r2.A0M = mediaData.autodownloadRetryEnabled;
        r2.A0Q = mediaData.transcoded;
        r2.A07 = mediaData.suspiciousContent;
        r2.A0D = mediaData.trimFrom;
        r2.A0E = mediaData.trimTo;
        r2.A02 = mediaData.faceX;
        r2.A03 = mediaData.faceY;
        r2.A0W = mediaData.mediaKey;
        r2.A0S = mediaData.cipherKey;
        r2.A0U = mediaData.hmacKey;
        r2.A0V = mediaData.iv;
        r2.A08 = mediaData.width;
        r2.A06 = mediaData.height;
        r2.A0H = mediaData.doodleId;
        r2.A0N = mediaData.hasStreamingSidecar;
        r2.A09 = mediaData.cachedDownloadedBytes;
        r2.A05 = mediaData.gifAttribution;
        r2.A00 = mediaData.thumbnailHeightWidthRatio;
        r2.A0I = mediaData.mediaJobUuid;
        r2.A0G = mediaData.directPath;
        r2.A0X = mediaData.interactiveAnnotations;
        r2.A0T = mediaData.firstScanSidecar;
        r2.A04 = mediaData.firstScanLength;
        r2.A0B = mediaData.mediaKeyTimestampMs;
        return r2;
    }

    public static void A01(ContentValues contentValues, AnonymousClass33C r3) {
        C621833x.A04(contentValues, "media_key", r3.A0W);
        contentValues.put("media_key_timestamp", Long.valueOf(r3.A0B));
        contentValues.put("width", Integer.valueOf(r3.A08));
        contentValues.put("height", Integer.valueOf(r3.A06));
    }

    public AnonymousClass33C A02() {
        AnonymousClass33C r2 = new AnonymousClass33C(this);
        r2.A0M = this.A0M;
        r2.A0C = this.A0C;
        r2.A0b = this.A0b;
        r2.A0Q = this.A0Q;
        r2.A0D = this.A0D;
        r2.A0E = this.A0E;
        r2.A0N = this.A0N;
        r2.A0P = this.A0P;
        r2.A0O = this.A0O;
        return r2;
    }

    public boolean A03() {
        File file = this.A0F;
        if (file != null) {
            return file.exists();
        }
        return false;
    }

    public AnonymousClass33C(AnonymousClass33C r3) {
        this.A0S = r3.A0S;
        this.A0G = r3.A0G;
        this.A0H = r3.A0H;
        this.A02 = r3.A02;
        this.A03 = r3.A03;
        this.A0F = r3.A0F;
        this.A0A = r3.A0A;
        this.A04 = r3.A04;
        this.A0T = r3.A0T;
        this.A0N = r3.A0N;
        this.A05 = r3.A05;
        this.A06 = r3.A06;
        this.A0U = r3.A0U;
        this.A0X = r3.A0X;
        this.A0V = r3.A0V;
        this.A0I = r3.A0I;
        this.A0W = r3.A0W;
        this.A0B = r3.A0B;
        this.A07 = r3.A07;
        this.A00 = r3.A00;
        this.A0R = r3.A0R;
        this.A08 = r3.A08;
        this.A0L = r3.A0L;
        this.A0K = r3.A0K;
        this.A0J = r3.A0J;
        this.A01 = r3.A01;
    }

    public boolean equals(Object obj) {
        return AnonymousClass000.A1Y(this, obj);
    }

    public AnonymousClass33C() {
    }
}
