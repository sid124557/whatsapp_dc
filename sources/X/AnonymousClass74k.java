package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.74k  reason: invalid class name */
public final class AnonymousClass74k {
    public static final C61052zd A00(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject A1H = AnonymousClass0x9.A1H(str);
            long optLong = A1H.optLong("numPhotoSent");
            long optLong2 = A1H.optLong("numPhotoHdSent");
            return new C61052zd(optLong, A1H.optLong("numPhotoVoSent"), optLong2, A1H.optLong("numPhotoSentLte"), A1H.optLong("numPhotoSentWifi"), A1H.optLong("numVideoSent"), A1H.optLong("numVideoVoSent"), A1H.optLong("numVideoHdSent"), A1H.optLong("numVideoSentLte"), A1H.optLong("numVideoSentWifi"), A1H.optLong("numDocsSent"), A1H.optLong("numDocsSentLte"), A1H.optLong("numDocsSentWifi"), A1H.optLong("numLargeDocsSent"), A1H.optLong("numLargeDocsNonWifi"), A1H.optLong("numMediaSentAsDocs"), A1H.optLong("numAudioSent"), A1H.optLong("numSticker"), A1H.optLong("numUrl"), A1H.optLong("numGifSent"), A1H.optLong("numExternalShare"), A1H.optLong("numMediaSentChat"), A1H.optLong("numMediaSentGroup"), A1H.optLong("numMediaSentCommunity"), A1H.optLong("numMediaSentStatus"), A1H.optLong("numMediaUploadFailed"));
        } catch (JSONException e) {
            Log.d(AnonymousClass000.A0a("MediaEngagementSentDailyStat/sentDailyFromJsonString/", AnonymousClass001.A0o(), e));
            return null;
        }
    }
}
