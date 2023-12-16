package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7n9  reason: invalid class name and case insensitive filesystem */
public class C160167n9 {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final long A0C;
    public final boolean A0D;

    public C160167n9(int i, int i2, int i3, long j, boolean z) {
        this.A0C = j;
        this.A0A = i;
        this.A0B = i2;
        this.A09 = i3;
        this.A0D = z;
    }

    public static C160167n9 A00(String str) {
        try {
            JSONObject A1H = AnonymousClass0x9.A1H(str);
            return new C160167n9(A1H.optInt("mediaType"), A1H.optInt("transferRadio"), A1H.optInt("mediaTransferOrigin"), A1H.optLong("bytesSent"), A1H.optLong("bytesReceived"), A1H.optLong("countMessageSent"), A1H.optLong("countMessageReceived"), A1H.optLong("countUploaded"), A1H.optLong("countDownloaded"), A1H.optLong("countForward"), A1H.optLong("countShared"), A1H.optLong("countViewed"), A1H.optLong("transferDate"), A1H.optBoolean("isAutoDownload"));
        } catch (JSONException e) {
            Log.d(AnonymousClass000.A0a("MediaDailyUsageStat/fromJsonString/", AnonymousClass001.A0o(), e));
            return null;
        }
    }

    public C160167n9(int i, int i2, int i3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z) {
        this.A01 = j;
        this.A00 = j2;
        this.A05 = j3;
        this.A04 = j4;
        this.A07 = j5;
        this.A02 = j6;
        this.A03 = j7;
        this.A06 = j8;
        this.A08 = j9;
        this.A0C = j10;
        this.A0A = i;
        this.A0B = i2;
        this.A09 = i3;
        this.A0D = z;
    }
}
