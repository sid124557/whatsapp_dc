package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.74j  reason: invalid class name and case insensitive filesystem */
public final class C1451574j {
    public static final AnonymousClass33B A00(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject A1H = AnonymousClass0x9.A1H(str);
            return new AnonymousClass33B(A1H.optLong("numPhotoReceived"), A1H.optLong("numPhotoDownloaded"), A1H.optLong("numMidScan"), A1H.optLong("numPhotoFull"), A1H.optLong("numPhotoWifi"), A1H.optLong("numPhotoVoDownloaded"), A1H.optLong("numVideoReceived"), A1H.optLong("numVideoDownloaded"), A1H.optLong("numVideoDownloadedLte"), A1H.optLong("numVideoDownloadedWifi"), A1H.optLong("numVideoHdDownloaded"), A1H.optLong("numVideoVoDownloaded"), A1H.optLong("numDocsReceived"), A1H.optLong("numDocsDownloaded"), A1H.optLong("numLargeDocsReceived"), A1H.optLong("numDocsDownloadedLte"), A1H.optLong("numDocsDownloadedWifi"), A1H.optLong("numMediaAsDocsDownloaded"), A1H.optLong("numAudioReceived"), A1H.optLong("numAudioDownloaded"), A1H.optLong("numGifDownloaded"), A1H.optLong("numInlinePlayedVideo"), A1H.optLong("numUrlReceived"), A1H.optLong("numMediaChatDownloaded"), A1H.optLong("numMediaChatReceived"), A1H.optLong("numMediaCommunityDownloaded"), A1H.optLong("numMediaCommunityReceived"), A1H.optLong("numMediaGroupDownloaded"), A1H.optLong("numMediaGroupReceived"), A1H.optLong("numMediaStatusDownloaded"), A1H.optLong("numMediaStatusReceived"), A1H.optLong("numMediaDownloadFailed"));
        } catch (JSONException e) {
            Log.d(AnonymousClass000.A0a("MediaEngagementReceivedDailyStat/receiveDailyFromJsonString/", AnonymousClass001.A0o(), e));
            return null;
        }
    }
}
