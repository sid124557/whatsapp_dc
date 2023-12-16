package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.YoutubePlayerTouchOverlay;
import java.io.InputStream;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: X.1uR  reason: invalid class name and case insensitive filesystem */
public class C34231uR extends AnonymousClass5YG {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 1;
    public int A03 = -1;
    public long A04 = -9223372036854775807L;
    public AnonymousClass3XA A05;
    public JSONObject A06;
    public boolean A07 = false;
    public boolean A08 = false;
    public Bitmap[] A09;
    public final Context A0A;
    public final ViewGroup A0B;
    public final WebView A0C;
    public final C69263Wi A0D;
    public final C106685Zz A0E;
    public final AnonymousClass563 A0F;
    public final YoutubePlayerTouchOverlay A0G;
    public final String A0H;

    public int A06() {
        long j = this.A04;
        if (j == -9223372036854775807L) {
            return 0;
        }
        return (int) j;
    }

    public void A0C() {
        if (this.A08) {
            Log.i("InlineYoutubeVideoPlayer/pause");
            this.A0C.loadUrl("javascript:(function() { player.pauseVideo(); })()");
            this.A02 = 2;
            this.A00 = 2;
            AnonymousClass563 r1 = this.A0F;
            r1.A00();
            r1.A0K = true;
        }
    }

    public void A0F() {
        if (!this.A07) {
            Log.i("InlineYoutubeVideoPlayer/start");
            this.A07 = true;
            AnonymousClass3XA r3 = this.A05;
            if (r3 != null) {
                C86234Ji r1 = new C86234Ji(this, 26);
                Executor executor = this.A0D.A08;
                r3.A04(r1, executor);
                r3.A00.A04(new C86234Ji(this, 27), executor);
                return;
            }
            A0f();
            return;
        }
        this.A0C.loadUrl("javascript:(function() { player.playVideo(); })()");
        this.A02 = 1;
        this.A00 = 1;
        AnonymousClass563 r0 = this.A0F;
        r0.A08();
        r0.A0K = true;
    }

    public void A0G() {
        Log.i("InlineYoutubeVideoPlayer/stop");
        YoutubePlayerTouchOverlay youtubePlayerTouchOverlay = this.A0G;
        if (youtubePlayerTouchOverlay.getChildCount() > 0) {
            youtubePlayerTouchOverlay.removeAllViews();
        }
        WebView webView = this.A0C;
        webView.removeJavascriptInterface("YoutubeJsInterface");
        webView.stopLoading();
        webView.destroy();
        this.A01 = 0;
        this.A03 = -1;
        this.A00 = 0;
        this.A02 = 1;
        this.A08 = false;
        this.A07 = false;
        this.A04 = -9223372036854775807L;
        AnonymousClass3XA r0 = this.A05;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void A0P(int i) {
        if (this.A08) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("InlineYoutubeVideoPlayer/seekTo: ");
            int i2 = i / 1000;
            C18260x0.A1G(A0o, i2);
            WebView webView = this.A0C;
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("javascript:(function() { player.seekTo(");
            A0o2.append(i2);
            webView.loadUrl(AnonymousClass000.A0X(", true); })()", A0o2));
            this.A01 = i;
        }
    }

    public void A0Z(boolean z) {
    }

    public boolean A0a() {
        return AnonymousClass001.A1T(this.A02);
    }

    public final void A0f() {
        WebView webView = this.A0C;
        Locale locale = Locale.US;
        String str = this.A0H;
        C626936e.A05(str);
        Object[] A0L = AnonymousClass002.A0L();
        JSONObject jSONObject = this.A06;
        C626936e.A06(jSONObject);
        A0L[0] = jSONObject.toString();
        webView.loadDataWithBaseURL("https://whatsapp.com", String.format(locale, str, A0L), "text/html", C58152un.A0B, "https://youtube.com");
    }

    public int A05() {
        return this.A01;
    }

    public Bitmap A08() {
        return null;
    }

    public View A09() {
        return this.A0B;
    }

    public boolean A0b() {
        return false;
    }

    public boolean A0c() {
        return false;
    }

    public final void A0g(String str, boolean z, String str2) {
        A0Y(AnonymousClass000.A0V("InlineYoutubeVideoPlayer: ", str, AnonymousClass001.A0o()), z, str2);
    }

    public C34231uR(Context context, Bitmap bitmap, C111095hX r14, C69263Wi r15, C106685Zz r16, AnonymousClass2WW r17, C60102y0 r18, C624134x r19, AnonymousClass563 r20, String str, int i) {
        String str2;
        JSONObject jSONObject;
        int i2;
        InputStream openRawResource;
        this.A0A = context;
        this.A0D = r15;
        C106685Zz r5 = r16;
        this.A0E = r5;
        AnonymousClass563 r6 = r20;
        this.A0F = r6;
        C624134x r9 = r19;
        if (r17.A00(r9)) {
            AnonymousClass3XA r8 = new AnonymousClass3XA();
            C60102y0 r10 = r18;
            if (!r9.A1n()) {
                AnonymousClass4FS r7 = r10.A02;
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass2z0.A0A(r9.A1J, A0o);
                r7.BkQ(new C70343aL(r10, r9, r8, 43), AnonymousClass000.A0X("counterAbuseTokenUtils", A0o));
            } else {
                C51782kN A002 = r10.A00(r9);
                if (A002 != null) {
                    r8.A05(A002);
                } else {
                    r8.A06(new AnonymousClass24K());
                }
            }
            this.A05 = r8;
        }
        try {
            openRawResource = this.A0A.getResources().openRawResource(R.raw.youtube_player_iframe);
            str2 = new String(C624535b.A05(openRawResource));
            if (openRawResource != null) {
                openRawResource.close();
            }
        } catch (Exception e) {
            Log.e((Throwable) e);
            A0g("Unable to load youtube html frame.", false, "youtube_html_frame_load_failed");
            str2 = null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        this.A0H = str2;
        ViewGroup viewGroup = (ViewGroup) C18310x6.A0H(LayoutInflater.from(context), R.layout.f8nameremoved);
        this.A0B = viewGroup;
        WebView webView = (WebView) C06560Yg.A02(viewGroup, R.id.youtubeWebView);
        this.A0C = webView;
        YoutubePlayerTouchOverlay youtubePlayerTouchOverlay = (YoutubePlayerTouchOverlay) C06560Yg.A02(viewGroup, R.id.youtubePlayerTouchOverlay);
        this.A0G = youtubePlayerTouchOverlay;
        youtubePlayerTouchOverlay.A01 = r6;
        int i3 = i;
        youtubePlayerTouchOverlay.A00 = i3;
        ViewGroup.LayoutParams layoutParams = youtubePlayerTouchOverlay.getLayoutParams();
        layoutParams.height = i3;
        youtubePlayerTouchOverlay.setLayoutParams(layoutParams);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        webView.getSettings().setUserAgentString(WebSettings.getDefaultUserAgent(context));
        webView.getSettings().setAllowFileAccess(false);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
        webView.addJavascriptInterface(new AnonymousClass2X7(this), "YoutubeJsInterface");
        C162457s7.A0J(r5, 0);
        String A022 = AnonymousClass35G.A02(Uri.parse(C106685Zz.A01(str)));
        int i4 = 0;
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("t");
            if (queryParameter != null) {
                if (queryParameter.contains("h")) {
                    String[] split = queryParameter.split("h");
                    i2 = Integer.parseInt(split[0]) * 3600;
                    queryParameter = split[1];
                } else {
                    i2 = 0;
                }
                if (queryParameter.contains("m")) {
                    String[] split2 = queryParameter.split("m");
                    i2 += Integer.parseInt(split2[0]) * 60;
                    queryParameter = split2[1];
                }
                i4 = i2 + Integer.parseInt(queryParameter.contains("s") ? queryParameter.split("s")[0] : queryParameter);
            }
        } catch (Exception unused) {
        }
        if (A022 == null) {
            A0g("Unable to parse youtube id.", false, "youtube_id_parse_failed");
            return;
        }
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            JSONObject A1G2 = AnonymousClass0x9.A1G();
            A1G2.put("onReady", "onPlayerReady").put("onError", "onPlayerError").put("onStateChange", "onPlayerStateChange");
            A1G.put("start", i4).put("rel", 0).put("modestbranding", 0).put("iv_load_policy", 3).put("autohide", 1).put("autoplay", 1).put("cc_load_policy", 1).put("playsinline", 1).put("controls", 0);
            jSONObject = AnonymousClass0x9.A1G().put("videoId", A022).put("events", A1G2).put("height", "100%").put("width", "100%").put("playerVars", A1G);
        } catch (Exception e2) {
            Log.e((Throwable) e2);
            jSONObject = null;
        }
        this.A06 = jSONObject;
        if (jSONObject == null) {
            A0g("Invalid player params.", true, "invalid_player_params");
            return;
        }
        webView.setWebViewClient(new C19130yo(r14, this));
        this.A09 = new Bitmap[]{bitmap};
        webView.setWebChromeClient(new C19060yh(this));
        return;
        throw th;
    }
}
