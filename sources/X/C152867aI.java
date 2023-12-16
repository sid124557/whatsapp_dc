package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7aI  reason: invalid class name and case insensitive filesystem */
public final class C152867aI {
    public final C60152y5 A00;
    public final AnonymousClass66R A01 = AnonymousClass8P7.A00(new AnonymousClass8WQ(this));

    public C152867aI(C60152y5 r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final void A02(AnonymousClass33B r7) {
        C162457s7.A0J(r7, 0);
        try {
            SharedPreferences.Editor A04 = C18270x1.A04(this.A01);
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put("numPhotoReceived", r7.A0M);
            A1G.put("numPhotoDownloaded", r7.A0J);
            A1G.put("numMidScan", r7.A0L);
            A1G.put("numPhotoFull", r7.A0K);
            A1G.put("numPhotoWifi", r7.A0O);
            A1G.put("numPhotoVoDownloaded", r7.A0N);
            A1G.put("numVideoReceived", r7.A0U);
            A1G.put("numVideoDownloaded", r7.A0Q);
            A1G.put("numVideoDownloadedLte", r7.A0R);
            A1G.put("numVideoDownloadedWifi", r7.A0S);
            A1G.put("numVideoHdDownloaded", r7.A0T);
            A1G.put("numVideoVoDownloaded", r7.A0V);
            A1G.put("numDocsReceived", r7.A05);
            A1G.put("numDocsDownloaded", r7.A02);
            A1G.put("numLargeDocsReceived", r7.A08);
            A1G.put("numDocsDownloadedLte", r7.A03);
            A1G.put("numDocsDownloadedWifi", r7.A04);
            A1G.put("numMediaAsDocsDownloaded", r7.A09);
            A1G.put("numAudioReceived", r7.A01);
            A1G.put("numAudioDownloaded", r7.A00);
            A1G.put("numGifDownloaded", r7.A06);
            A1G.put("numInlinePlayedVideo", r7.A07);
            A1G.put("numUrlReceived", r7.A0P);
            A1G.put("numMediaChatDownloaded", r7.A0A);
            A1G.put("numMediaChatReceived", r7.A0B);
            A1G.put("numMediaCommunityDownloaded", r7.A0C);
            A1G.put("numMediaCommunityReceived", r7.A0D);
            A1G.put("numMediaGroupDownloaded", r7.A0F);
            A1G.put("numMediaGroupReceived", r7.A0G);
            A1G.put("numMediaStatusDownloaded", r7.A0H);
            A1G.put("numMediaStatusReceived", r7.A0I);
            A1G.put("numMediaDownloadFailed", r7.A0E);
            C18270x1.A0j(A04, "media_engagement_daily_received_key", C18290x4.A0o(A1G));
        } catch (JSONException e) {
            Log.d(AnonymousClass000.A0a("MediaEngagementSentDailyPreferences/setMediaDailyUsageStat/", AnonymousClass001.A0o(), e));
        }
    }

    public final AnonymousClass33B A00() {
        AnonymousClass33B A002;
        String A0Z = C18280x3.A0Z((SharedPreferences) this.A01.getValue(), "media_engagement_daily_received_key");
        if (A0Z == null || A0Z.length() == 0 || (A002 = C1451574j.A00(A0Z)) == null) {
            return new AnonymousClass33B(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        }
        return A002;
    }

    public final C61052zd A01() {
        C61052zd A002;
        String A0Z = C18280x3.A0Z((SharedPreferences) this.A01.getValue(), "media_engagement_daily_sent_key");
        if (A0Z == null || A0Z.length() == 0 || (A002 = AnonymousClass74k.A00(A0Z)) == null) {
            return new C61052zd(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        }
        return A002;
    }

    public final void A03(C61052zd r7) {
        try {
            SharedPreferences.Editor A04 = C18270x1.A04(this.A01);
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put("numPhotoSent", r7.A0F);
            A1G.put("numPhotoHdSent", r7.A0E);
            A1G.put("numPhotoVoSent", r7.A0I);
            A1G.put("numPhotoSentLte", r7.A0G);
            A1G.put("numPhotoSentWifi", r7.A0H);
            A1G.put("numVideoSent", r7.A0M);
            A1G.put("numVideoHdSent", r7.A0L);
            A1G.put("numVideoVoSent", r7.A0P);
            A1G.put("numVideoSentLte", r7.A0N);
            A1G.put("numVideoSentWifi", r7.A0O);
            A1G.put("numDocsSent", r7.A01);
            A1G.put("numDocsSentLte", r7.A02);
            A1G.put("numDocsSentWifi", r7.A03);
            A1G.put("numLargeDocsSent", r7.A07);
            A1G.put("numLargeDocsNonWifi", r7.A06);
            A1G.put("numMediaSentAsDocs", r7.A08);
            A1G.put("numAudioSent", r7.A00);
            A1G.put("numSticker", r7.A0J);
            A1G.put("numUrl", r7.A0K);
            A1G.put("numGifSent", r7.A05);
            A1G.put("numExternalShare", r7.A04);
            A1G.put("numMediaSentChat", r7.A09);
            A1G.put("numMediaSentGroup", r7.A0B);
            A1G.put("numMediaSentCommunity", r7.A0A);
            A1G.put("numMediaSentStatus", r7.A0C);
            A1G.put("numMediaUploadFailed", r7.A0D);
            C18270x1.A0j(A04, "media_engagement_daily_sent_key", C18290x4.A0o(A1G));
        } catch (JSONException e) {
            Log.d(AnonymousClass000.A0a("MediaEngagementSentDailyPreferences/setMediaDailyUsageStat/", AnonymousClass001.A0o(), e));
        }
    }
}
