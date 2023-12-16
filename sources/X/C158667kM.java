package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7kM  reason: invalid class name and case insensitive filesystem */
public class C158667kM {
    public int A00 = 0;
    public long A01 = -1;
    public long A02 = -1;
    public long A03 = -1;
    public long A04 = -1;
    public long A05 = -1;
    public long A06 = -1;
    public long A07 = -1;
    public long A08 = 0;
    public long A09 = -1;
    public long A0A = -1;
    public long A0B = 0;
    public AnonymousClass7B5 A0C;
    public String A0D = null;
    public String A0E = null;
    public String A0F = null;
    public String A0G;
    public String A0H;
    public String A0I;
    public boolean A0J = false;
    public boolean A0K = false;
    public boolean A0L = false;
    public boolean A0M = false;
    public boolean A0N = false;
    public boolean A0O = false;
    public boolean A0P = false;
    public boolean A0Q = false;
    public boolean A0R = false;
    public boolean A0S = false;
    public boolean A0T;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C158667kM r7 = (C158667kM) obj;
            if (!(this.A0N == r7.A0N && this.A0P == r7.A0P && this.A0J == r7.A0J && this.A0K == r7.A0K && this.A0L == r7.A0L && this.A0M == r7.A0M && this.A0Q == r7.A0Q && this.A0R == r7.A0R && this.A02 == r7.A02 && this.A04 == r7.A04 && this.A0A == r7.A0A && this.A07 == r7.A07 && this.A06 == r7.A06 && this.A05 == r7.A05 && this.A09 == r7.A09 && this.A0O == r7.A0O && this.A01 == r7.A01 && this.A00 == r7.A00 && this.A0S == r7.A0S && this.A0B == r7.A0B && this.A0T == r7.A0T && A00(this.A0E, r7.A0E) && A00(this.A0D, r7.A0D) && A00(this.A0F, r7.A0F) && A00(this.A0G, r7.A0G) && A00(this.A0I, r7.A0I) && A00(this.A0H, r7.A0H) && this.A08 == r7.A08)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A00(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        } else if (obj2 != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[36];
        AnonymousClass001.A1R(objArr, this.A0N);
        AnonymousClass000.A1R(objArr, this.A0P);
        AnonymousClass001.A1S(objArr, this.A0J);
        objArr[3] = Boolean.valueOf(this.A0K);
        objArr[4] = Boolean.valueOf(this.A0L);
        objArr[5] = Boolean.valueOf(this.A0M);
        objArr[6] = false;
        objArr[7] = Boolean.valueOf(this.A0Q);
        objArr[8] = Boolean.valueOf(this.A0R);
        objArr[9] = -1L;
        objArr[10] = -1L;
        objArr[11] = -1L;
        objArr[12] = -1L;
        objArr[13] = -1L;
        objArr[14] = -1L;
        objArr[15] = Long.valueOf(this.A02);
        objArr[16] = Long.valueOf(this.A04);
        objArr[17] = Long.valueOf(this.A0A);
        objArr[18] = Long.valueOf(this.A07);
        objArr[19] = Long.valueOf(this.A06);
        objArr[20] = Long.valueOf(this.A05);
        objArr[21] = Long.valueOf(this.A09);
        objArr[22] = Boolean.valueOf(this.A0O);
        objArr[23] = Long.valueOf(this.A01);
        objArr[24] = this.A0E;
        objArr[25] = this.A0D;
        objArr[26] = this.A0F;
        objArr[27] = Integer.valueOf(this.A00);
        objArr[28] = Boolean.valueOf(this.A0S);
        objArr[29] = Long.valueOf(this.A0B);
        objArr[30] = this.A0G;
        objArr[31] = this.A0I;
        objArr[32] = this.A0H;
        objArr[33] = Boolean.valueOf(this.A0T);
        objArr[34] = -1L;
        return C18310x6.A08(Long.valueOf(this.A08), objArr, 35);
    }

    public String toString() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        try {
            A1G.put("isAudioTrackPresent", this.A0N);
            A1G.put("isInitComplete", this.A0P);
            A1G.put("codecMuxerAudioTrackIndexIsSet", this.A0J);
            A1G.put("codecMuxerVideoTrackIndexIsSet", this.A0K);
            A1G.put("gotAudioDataBuffer", this.A0L);
            A1G.put("gotVideoDataBuffer", this.A0M);
            A1G.put("isAudioVideoTrackReset", false);
            A1G.put("startTimeUs", -1);
            A1G.put("endTimeUs", -1);
            A1G.put("adjustedEndTimeUs", -1);
            A1G.put("syncStartTimeUs", -1);
            A1G.put("firstVideoSampleTimeUs", -1);
            A1G.put("lastVideoSampleTimeUs", -1);
            A1G.put("firstAudioSampleTimeUs", this.A02);
            A1G.put("lastAudioSampleTimeUs", this.A04);
            A1G.put("numVideoSamplesMuxed", this.A0A);
            A1G.put("numAudioSamplesMuxed", this.A07);
            A1G.put("numAudioSamplesErrored", this.A06);
            A1G.put("lastVideoSampleMuxedUs", this.A05);
            A1G.put("lastAudioSampleMuxedUs", this.A03);
            A1G.put("numVideoSamplesErrored", this.A09);
            A1G.put("isEncoderCompleted", this.A0O);
            A1G.put("bytesInTranscodeFile", this.A01);
            A1G.putOpt("encoderName", this.A0E);
            A1G.putOpt("decoderName", this.A0D);
            A1G.putOpt("profileName", this.A0F);
            A1G.put("targetBitRate", this.A00);
            A1G.put("isNonIncrementalTimestamp", this.A0S);
            A1G.put("timestampDifference", this.A0B);
            A1G.putOpt("videoTranscodeInnerException", this.A0G);
            A1G.putOpt("videoTranscodeInnerExceptionCause", this.A0I);
            A1G.putOpt("videoTranscodeInnerExceptionCallStack", this.A0H);
            A1G.put("isPassThroughTranscoderUsed", this.A0T);
            A1G.put("isMediaCompositionInput", this.A0Q);
            A1G.put("framePtsUs", -1);
            A1G.put("numOfRetriesToSucceedEncoder", this.A08);
        } catch (JSONException unused) {
        }
        return A1G.toString();
    }
}
