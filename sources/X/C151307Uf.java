package X;

import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7Uf  reason: invalid class name and case insensitive filesystem */
public class C151307Uf {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final C165967xv A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final HashMap A0J;
    public final boolean A0K;

    public C151307Uf(C165967xv r3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, HashMap hashMap, int i, int i2, int i3, int i4, int i5, int i6, long j, long j2, long j3, boolean z) {
        this.A07 = j;
        this.A05 = i;
        this.A03 = i2;
        this.A04 = i3;
        this.A02 = i4;
        this.A01 = i5;
        this.A06 = j2;
        this.A08 = j3;
        this.A00 = i6;
        this.A09 = r3;
        this.A0E = str;
        this.A0I = str2;
        this.A0C = str3;
        this.A0G = str4;
        this.A0F = str5;
        this.A0B = str6;
        this.A0A = str7;
        this.A0K = z;
        this.A0D = str8;
        this.A0J = hashMap;
        this.A0H = str9;
    }

    public String toString() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        try {
            A1G.put("colorTransfer", this.A02);
            A1G.put("colorSpace", this.A01);
            A1G.put("durationMs", this.A07);
            A1G.put("widthPx", this.A05);
            A1G.put("heightPx", this.A03);
            A1G.put("rotationAngle", this.A04);
            A1G.put("bitrate", this.A06);
            A1G.put("fileSizeBytes", this.A08);
            A1G.put("audioTrackBitRate", this.A00);
            A1G.putOpt("sphericalMetadata", this.A09);
            A1G.putOpt("comment", this.A0C);
            A1G.putOpt("copyright", this.A0E);
            A1G.putOpt("model", this.A0I);
            A1G.putOpt("date", this.A0F);
            A1G.putOpt("codecType", this.A0B);
            A1G.putOpt("audioCodecType", this.A0A);
            A1G.put("hasAudioTrack", this.A0K);
            A1G.putOpt("composer", this.A0D);
            A1G.putOpt("typeToMediaMetadataMap", this.A0J);
            A1G.putOpt("mediaType", this.A0H);
        } catch (JSONException unused) {
        }
        return A1G.toString();
    }
}
