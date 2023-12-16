package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Patterns;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.3Ls  reason: invalid class name and case insensitive filesystem */
public class C66513Ls implements AnonymousClass485 {
    public static final Set A0a = C18280x3.A0h(new String[]{"og:image", "og:image:type", "og:video", "og:video:type", "og:video:url", "og:video:secure_url", "og:video:width", "og:video:height", "image", "og:thumbnail", "thumbnail", "twitter:image", "og:title", "title", "twitter:title", "og:description", "description", "twitter:description", "og:url", "og:site_name", "twitter:url", "invite_link_type_v2", "parent_group_subject", "wa:artist", "wa:song", "wa:song:url", "wa:author:name", "wa:author:url", "wa:author:profile_image", "wa:post:caption", "wa:landing:page", "wa:landing:label", "og:is_fb_video", "og:should_overlay_share_button", "og:should_overlay_share_button_wa_preq_test"});
    public static final Pattern A0b = Pattern.compile("(?i)\\bcharset=\\s*\"?([^\\s;\"]*)", 34);
    public static final Pattern A0c = Pattern.compile("<head[^>]*>(.*)</head>", 34);
    public static final Pattern A0d = Pattern.compile("\\s*([^=]+)\\s*=\\s*(?:\"([^\"]+)\"|\\'([^\\']+)\\')", 34);
    public static final Pattern A0e = Pattern.compile("<link([^>]+?)/?>", 34);
    public static final Pattern A0f = Pattern.compile("<meta([^>]+?)/?>", 34);
    public static final Pattern A0g = Pattern.compile("<title[^>]*>(.*)</title>", 34);
    public static final Pattern A0h = Pattern.compile("https://(www\\.)?pbs\\.twimg\\.com/profile_images", 2);
    public static final Pattern A0i = Pattern.compile("https://(www\\.)?pbs\\.twimg\\.com", 2);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public Bitmap A07;
    public Bitmap A08;
    public C149027Kq A09;
    public C135286kQ A0A;
    public Integer A0B = null;
    public String A0C;
    public String A0D;
    public String A0E = null;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public URL A0K;
    public URL A0L;
    public URL A0M;
    public URL A0N;
    public LinkedHashSet A0O = AnonymousClass0x9.A17();
    public boolean A0P;
    public boolean A0Q = false;
    public boolean A0R;
    public boolean A0S = false;
    public boolean A0T = false;
    public byte[] A0U;
    public byte[] A0V;
    public byte[] A0W;
    public final C56492s4 A0X;
    public final C106685Zz A0Y;
    public final String A0Z;

    public static String A00(HashMap hashMap, String... strArr) {
        for (String A0e2 : strArr) {
            String A0e3 = C18320x8.A0e(A0e2, hashMap);
            if (A0e3 != null) {
                return A0e3.trim();
            }
        }
        return null;
    }

    public final C149027Kq A05(Map map, String... strArr) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        for (String A0o : strArr) {
            String A0o2 = C18310x6.A0o(A0o, map);
            if (A0o2 != null && C18280x3.A1X(A0o2, Patterns.WEB_URL)) {
                try {
                    httpURLConnection = A09((String) null, C18330xA.A0B(A0o2));
                    if (httpURLConnection != null) {
                        try {
                            C149027Kq A042 = A04(A0o2, httpURLConnection.getHeaderField("Content-Type"), httpURLConnection.getContentLength());
                            if (A042 != null) {
                                A0E(httpURLConnection);
                                return A042;
                            }
                        } catch (IOException e) {
                            e = e;
                            try {
                                Log.w("WebPageInfo/getGifOnPage Cannot connect.", e);
                                A0E(httpURLConnection);
                            } catch (Throwable th) {
                                th = th;
                                httpURLConnection2 = httpURLConnection;
                                A0E(httpURLConnection2);
                                throw th;
                            }
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    httpURLConnection = null;
                    Log.w("WebPageInfo/getGifOnPage Cannot connect.", e);
                    A0E(httpURLConnection);
                } catch (Throwable th2) {
                    th = th2;
                    A0E(httpURLConnection2);
                    throw th;
                }
                A0E(httpURLConnection);
            }
        }
        return null;
    }

    public final HttpURLConnection A09(String str, URL url) {
        String str2;
        URL url2 = null;
        try {
            URI uri = new URI(url.toString());
            if (!uri.getScheme().equals("https")) {
                uri = new URI("https", uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
            }
            url2 = C18330xA.A0B(uri.toASCIIString());
        } catch (MalformedURLException | URISyntaxException unused) {
        }
        if (url2 == null) {
            str2 = "WebPageInfo/createConnection Cannot sanitize URL";
        } else {
            URLConnection openConnection = url2.openConnection();
            if (!(openConnection instanceof HttpURLConnection)) {
                str2 = "WebPageInfo/createConnectionWithSanitizedUrl Not http";
            } else {
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setConnectTimeout(SearchActionVerificationClientService.NOTIFICATION_ID);
                httpURLConnection.setReadTimeout(SearchActionVerificationClientService.NOTIFICATION_ID);
                if (str != null) {
                    httpURLConnection.setRequestProperty("Accept-Language", str);
                }
                httpURLConnection.setRequestProperty("User-Agent", "WhatsApp/2.23.20.0");
                return httpURLConnection;
            }
        }
        Log.d(str2);
        return null;
    }

    public byte[] A0G(Bitmap bitmap) {
        int min = Math.min(140, Math.min(bitmap.getWidth(), bitmap.getHeight()));
        int min2 = Math.min(bitmap.getWidth(), bitmap.getHeight());
        return A0H(bitmap, new Rect((bitmap.getWidth() - min2) / 2, (bitmap.getHeight() - min2) / 2, (bitmap.getWidth() + min2) / 2, (bitmap.getHeight() + min2) / 2), min, min, 80);
    }

    public Bitmap A03() {
        if (this.A0W == null) {
            return null;
        }
        Bitmap bitmap = this.A08;
        if (bitmap != null) {
            return bitmap;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDither = true;
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            byte[] bArr = this.A0W;
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            this.A08 = decodeByteArray;
            return decodeByteArray;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public final C149027Kq A04(String str, String str2, int i) {
        if (!"image/gif".equals(str2) || i == -1) {
            return null;
        }
        if (str.endsWith("giphy.gif")) {
            try {
                if (new URI(str).getHost().contains("giphy.com")) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append(AnonymousClass0x7.A0r(str, str.length() - 9));
                    A0o.append("200.mp4");
                    str = A0o.toString();
                    HttpURLConnection httpURLConnection = null;
                    try {
                        httpURLConnection = A09((String) null, C18330xA.A0B(str));
                        if (httpURLConnection != null) {
                            String headerField = httpURLConnection.getHeaderField("Content-Type");
                            if (headerField.equals("video/mp4")) {
                                C149027Kq r3 = new C149027Kq(str, httpURLConnection.getContentLength(), headerField);
                                A0E(httpURLConnection);
                                return r3;
                            }
                        }
                    } catch (IOException e) {
                        Log.w("WebPageInfo/checkForMp4 Cannot connect.", e);
                    } catch (Throwable th) {
                        A0E((HttpURLConnection) null);
                        throw th;
                    }
                    A0E(httpURLConnection);
                }
            } catch (URISyntaxException e2) {
                Log.w("WebPageInfo/getGifInfo Cannot connect.", e2);
            }
        }
        return new C149027Kq(str, i, str2);
    }

    public String A07() {
        URL A0B2;
        if (TextUtils.isEmpty(this.A0D)) {
            A0B2 = C18330xA.A0B(this.A0Z);
        } else {
            try {
                A0B2 = C18330xA.A0B(this.A0D);
            } catch (MalformedURLException unused) {
                A0B2 = C18330xA.A0B(this.A0Z);
            }
        }
        return A0B2.getHost();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01e8, code lost:
        if (r1.equals("true") == false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0202, code lost:
        if (r0 != false) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x020a, code lost:
        if (r1 == false) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0216, code lost:
        if (r9.equals("true") == false) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0272, code lost:
        if ("video/mp4".equalsIgnoreCase(X.C18320x8.A0e("og:video:type", r3)) == false) goto L_0x0274;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A08(java.lang.String r22, java.lang.String r23, java.lang.String r24, java.net.URL r25, int r26) {
        /*
            r21 = this;
            r5 = r22
            java.util.regex.Pattern r0 = A0c
            java.util.regex.Matcher r1 = r0.matcher(r5)
            boolean r0 = r1.find()
            r4 = 1
            if (r0 == 0) goto L_0x0013
            java.lang.String r5 = r1.group(r4)
        L_0x0013:
            java.util.HashMap r3 = X.AnonymousClass001.A0t()
            java.util.regex.Pattern r0 = A0f
            java.util.regex.Matcher r1 = r0.matcher(r5)
            r12 = 0
        L_0x001e:
            boolean r0 = r1.find()
            r2 = r21
            if (r0 == 0) goto L_0x00df
            java.lang.String r0 = r1.group(r4)
            java.util.HashMap r7 = A02(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r23)
            java.lang.String r6 = "content"
            if (r0 == 0) goto L_0x009e
            java.lang.String r0 = "charset"
            java.lang.String r8 = X.C18320x8.A0e(r0, r7)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = "http-equiv"
            java.lang.String r8 = X.C18320x8.A0e(r0, r7)
            java.lang.String r0 = "Content-Type"
            boolean r0 = r0.equalsIgnoreCase(r8)
            if (r0 == 0) goto L_0x009e
            java.lang.String r8 = X.C18320x8.A0e(r6, r7)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x009e
            java.util.regex.Pattern r0 = A0b
            java.util.regex.Matcher r8 = r0.matcher(r8)
            boolean r0 = r8.find()
            if (r0 == 0) goto L_0x009e
            java.lang.String r0 = r8.group(r4)
            X.C626936e.A06(r0)
            java.lang.String r8 = r0.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r8 = r8.toUpperCase(r0)
        L_0x0077:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x009d
            java.lang.String r0 = X.C58152un.A0B
            boolean r0 = r0.equalsIgnoreCase(r8)
            if (r0 != 0) goto L_0x009d
            r0 = 0
            r2.A0J = r0
            r2.A0G = r0
            r2.A0D = r0
            java.util.LinkedHashSet r0 = r2.A0O
            r0.clear()
            r0 = 0
            r2.A0P = r0
            r2.A02 = r0
            r2.A0Q = r0
            r2.A0S = r0
            r2.A0T = r0
            return r8
        L_0x009d:
            r12 = r8
        L_0x009e:
            java.lang.String r0 = "property"
            java.lang.String r2 = X.C18320x8.A0e(r0, r7)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x00be
            java.lang.String r0 = "name"
            java.lang.String r2 = X.C18320x8.A0e(r0, r7)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x00be
            java.lang.String r0 = "itemprop"
            java.lang.String r2 = X.C18320x8.A0e(r0, r7)
        L_0x00be:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x001e
            java.util.Set r0 = A0a
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = X.C18320x8.A0e(r6, r7)
            if (r0 == 0) goto L_0x001e
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            java.lang.String r0 = r0.toString()
            r3.put(r2, r0)
            goto L_0x001e
        L_0x00df:
            java.lang.String r0 = r25.toString()
            r6 = r24
            r1 = r26
            X.7Kq r6 = r2.A04(r0, r6, r1)
            if (r6 != 0) goto L_0x011a
            java.lang.String r6 = "twitter:url"
            java.lang.String r1 = "og:video"
            java.lang.String r0 = "og:url"
            java.lang.String[] r0 = new java.lang.String[]{r0, r6, r1}
            X.7Kq r6 = r2.A05(r3, r0)
            if (r6 != 0) goto L_0x011a
            java.lang.String r0 = "og:image:type"
            java.lang.Object r1 = r3.get(r0)
            java.lang.String r0 = "image/gif"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x011a
            java.lang.String r0 = "og:image"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            X.7Kq r6 = r2.A05(r3, r0)
        L_0x011a:
            r2.A09 = r6
            java.lang.String r8 = "og:thumbnail"
            java.lang.String r7 = "thumbnail"
            java.lang.String r6 = "og:image"
            java.lang.String r1 = "twitter:image"
            java.lang.String r0 = "image"
            java.lang.String[] r8 = new java.lang.String[]{r6, r1, r0, r8, r7}
            java.util.LinkedHashSet r7 = X.AnonymousClass0x9.A17()
            int r6 = r8.length
            r1 = 0
        L_0x0134:
            if (r1 >= r6) goto L_0x0148
            r0 = r8[r1]
            java.lang.String r0 = X.C18320x8.A0e(r0, r3)
            if (r0 == 0) goto L_0x0145
            java.lang.String r0 = r0.trim()
            r7.add(r0)
        L_0x0145:
            int r1 = r1 + 1
            goto L_0x0134
        L_0x0148:
            r2.A0O = r7
            java.lang.String r0 = "wa:artist"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r0 = A00(r3, r0)
            r2.A0H = r0
            java.lang.String r0 = "wa:song"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r0 = A00(r3, r0)
            r2.A0I = r0
            java.lang.String r0 = "wa:song:url"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.net.URL r0 = A01(r3, r0)
            r2.A0N = r0
            java.lang.String r0 = "wa:author:name"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r0 = A00(r3, r0)
            r2.A0C = r0
            java.lang.String r0 = "wa:post:caption"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r0 = A00(r3, r0)
            r2.A0F = r0
            java.lang.String r0 = "wa:author:url"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.net.URL r0 = A01(r3, r0)
            r2.A0L = r0
            java.lang.String r0 = "wa:author:profile_image"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.net.URL r0 = A01(r3, r0)
            r2.A0K = r0
            java.lang.String r0 = "wa:landing:page"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.net.URL r0 = A01(r3, r0)
            r2.A0M = r0
            java.lang.String r0 = "wa:landing:label"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            A00(r3, r0)
            java.lang.String r0 = "og:is_fb_video"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r1 = A00(r3, r0)
            java.lang.String r0 = "og:should_overlay_share_button"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r9 = A00(r3, r0)
            java.lang.String r0 = "og:should_overlay_share_button_wa_preq_test"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r8 = A00(r3, r0)
            java.lang.String r7 = "true"
            r6 = 1
            if (r1 == 0) goto L_0x01ea
            boolean r1 = r1.equals(r7)
            r0 = 1
            if (r1 != 0) goto L_0x01eb
        L_0x01ea:
            r0 = 0
        L_0x01eb:
            r2.A0Q = r0
            if (r0 == 0) goto L_0x020f
            java.lang.String r1 = r25.getHost()
            java.lang.String r0 = "facebook.com"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0204
            java.lang.String r0 = "fb.watch"
            boolean r0 = r1.contains(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0205
        L_0x0204:
            r1 = 1
        L_0x0205:
            boolean r0 = r2.A0Q
            if (r0 == 0) goto L_0x020c
            r0 = 1
            if (r1 != 0) goto L_0x020d
        L_0x020c:
            r0 = 0
        L_0x020d:
            r2.A0Q = r0
        L_0x020f:
            if (r9 == 0) goto L_0x0218
            boolean r1 = r9.equals(r7)
            r0 = 1
            if (r1 != 0) goto L_0x0219
        L_0x0218:
            r0 = 0
        L_0x0219:
            r2.A0S = r0
            if (r8 == 0) goto L_0x03c0
            boolean r0 = r8.equals(r7)
            if (r0 == 0) goto L_0x03c0
        L_0x0223:
            r2.A0T = r6
            java.lang.String r6 = "twitter:title"
            java.lang.String r1 = "title"
            java.lang.String r0 = "og:title"
            java.lang.String[] r0 = new java.lang.String[]{r0, r6, r1}
            java.lang.String r0 = A00(r3, r0)
            r2.A0J = r0
            java.lang.String r6 = "twitter:description"
            java.lang.String r1 = "description"
            java.lang.String r0 = "og:description"
            java.lang.String[] r0 = new java.lang.String[]{r0, r6, r1}
            java.lang.String r0 = A00(r3, r0)
            r2.A0G = r0
            java.lang.String r1 = "og:url"
            java.lang.String r0 = "twitter:url"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.lang.String r0 = A00(r3, r0)
            r2.A0D = r0
            java.lang.String r8 = "og:video"
            boolean r0 = r3.containsKey(r8)
            java.lang.String r10 = "og:video:type"
            if (r0 == 0) goto L_0x0274
            java.lang.String r1 = X.C18320x8.A0e(r10, r3)
            java.lang.String r0 = "video/mp4"
            boolean r1 = r0.equalsIgnoreCase(r1)
            r0 = 1
            if (r1 != 0) goto L_0x0275
        L_0x0274:
            r0 = 0
        L_0x0275:
            r2.A0P = r0
            if (r0 == 0) goto L_0x02a8
            java.lang.String r0 = "og:site_name"
            java.lang.String r1 = X.C18320x8.A0e(r0, r3)
            java.lang.String r0 = "Facebook Watch"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x02a8
            java.lang.String r0 = r2.A0D
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02a8
            java.lang.String r0 = r2.A0D
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r6 = r0.buildUpon()
            java.lang.String r1 = "fw"
            java.lang.String r0 = "1"
            android.net.Uri r0 = X.C18290x4.A0H(r6, r1, r0)
            java.lang.String r0 = r0.toString()
            r2.A0D = r0
        L_0x02a8:
            X.5Zz r1 = r2.A0Y
            java.lang.String r0 = r2.A0D
            if (r0 != 0) goto L_0x02b2
            java.lang.String r0 = r25.toString()
        L_0x02b2:
            int r0 = X.AnonymousClass35G.A01(r1, r0)
            r2.A03 = r0
            java.lang.String r7 = "og:video:url"
            java.lang.String r6 = "og:video:secure_url"
            java.lang.String[] r0 = new java.lang.String[]{r8, r7, r6}
            java.lang.String r11 = A00(r3, r0)
            int r9 = r2.A03
            java.lang.String r1 = X.C18320x8.A0e(r10, r3)
            if (r9 == 0) goto L_0x03bd
            r0 = 4
            if (r9 == r0) goto L_0x03b8
            java.lang.String r0 = "video/mp4"
        L_0x02d4:
            boolean r10 = r0.equalsIgnoreCase(r1)
        L_0x02d8:
            int r9 = r2.A03
            r1 = 0
            if (r11 == 0) goto L_0x03a3
            if (r9 == 0) goto L_0x03a3
            java.lang.String r0 = r25.toString()
            boolean r0 = android.webkit.URLUtil.isHttpsUrl(r0)
            if (r0 == 0) goto L_0x03a3
            r0 = 4
            if (r9 != r0) goto L_0x02f4
            java.lang.String r0 = "embed"
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto L_0x03a3
        L_0x02f4:
            if (r10 == 0) goto L_0x03a3
            r2.A02 = r4
        L_0x02f8:
            boolean r0 = r2.A0P
            if (r0 == 0) goto L_0x0336
            int r1 = r2.A03
            if (r1 == 0) goto L_0x0336
            r0 = 4
            if (r1 == r0) goto L_0x0336
            java.lang.String[] r0 = new java.lang.String[]{r8, r7, r6}
            java.lang.String r7 = A00(r3, r0)
            if (r7 == 0) goto L_0x03a1
            java.lang.String r0 = "og:video:width"
            java.lang.String r6 = X.C18320x8.A0e(r0, r3)
            java.lang.String r0 = "og:video:height"
            java.lang.String r1 = X.C18320x8.A0e(r0, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x039e
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x039e
            int r6 = java.lang.Integer.parseInt(r6)
            int r1 = java.lang.Integer.parseInt(r1)
        L_0x032f:
            X.6kQ r0 = new X.6kQ
            r0.<init>(r7, r6, r1)
        L_0x0334:
            r2.A0A = r0
        L_0x0336:
            java.util.LinkedHashSet r0 = r2.A0O
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>(r0)
            java.util.LinkedHashSet r0 = r2.A0O
            r0.clear()
            java.util.Iterator r10 = r1.iterator()
        L_0x0346:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x03c3
            java.lang.String r9 = X.AnonymousClass001.A0m(r10)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0398
            java.util.regex.Pattern r1 = A0i
            java.lang.String r0 = X.C106685Zz.A01(r9)
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.find()
            if (r0 == 0) goto L_0x0398
            java.lang.String r8 = ":large"
            boolean r0 = r9.endsWith(r8)
            java.lang.String r7 = ":thumb"
            java.lang.String r6 = ":medium"
            java.lang.String r1 = ":small"
            if (r0 == 0) goto L_0x037c
            java.lang.String[] r0 = new java.lang.String[]{r6, r1, r7}
            r2.A0D(r9, r8, r0)
            goto L_0x0346
        L_0x037c:
            boolean r0 = r9.endsWith(r6)
            if (r0 == 0) goto L_0x038a
            java.lang.String[] r0 = new java.lang.String[]{r6, r1, r7}
            r2.A0D(r9, r6, r0)
            goto L_0x0346
        L_0x038a:
            boolean r0 = r9.endsWith(r1)
            if (r0 == 0) goto L_0x0398
            java.lang.String[] r0 = new java.lang.String[]{r1, r7}
            r2.A0D(r9, r1, r0)
            goto L_0x0346
        L_0x0398:
            java.util.LinkedHashSet r0 = r2.A0O
            r0.add(r9)
            goto L_0x0346
        L_0x039e:
            r6 = -1
            r1 = -1
            goto L_0x032f
        L_0x03a1:
            r0 = 0
            goto L_0x0334
        L_0x03a3:
            r2.A02 = r1
            boolean r0 = r2.A0Q
            if (r0 == 0) goto L_0x02f8
            boolean r0 = r2.A0S
            if (r0 == 0) goto L_0x03b2
            r0 = 2
        L_0x03ae:
            r2.A02 = r0
            goto L_0x02f8
        L_0x03b2:
            boolean r0 = r2.A0T
            if (r0 == 0) goto L_0x02f8
            r0 = 3
            goto L_0x03ae
        L_0x03b8:
            java.lang.String r0 = "text/html"
            goto L_0x02d4
        L_0x03bd:
            r10 = 0
            goto L_0x02d8
        L_0x03c0:
            r6 = 0
            goto L_0x0223
        L_0x03c3:
            java.util.LinkedHashSet r0 = r2.A0O
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0489
            java.util.regex.Pattern r0 = A0e
            java.util.regex.Matcher r7 = r0.matcher(r5)
            r6 = 0
        L_0x03d2:
            boolean r0 = r7.find()
            if (r0 == 0) goto L_0x0414
            java.lang.String r0 = r7.group(r4)
            java.util.HashMap r1 = A02(r0)
            java.lang.String r0 = "rel"
            java.lang.String r8 = X.C18320x8.A0e(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x03d2
            java.lang.String r0 = "icon"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x040d
            java.lang.String r0 = "image_src"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x040d
            java.lang.String r0 = "apple-touch-icon-precomposed"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x040d
            java.lang.String r0 = "apple-touch-icon"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x03d2
        L_0x040d:
            java.lang.String r0 = "href"
            java.lang.Object r6 = r1.get(r0)
            goto L_0x03d2
        L_0x0414:
            if (r6 == 0) goto L_0x041b
            java.util.LinkedHashSet r0 = r2.A0O
            r0.add(r6)
        L_0x041b:
            java.util.LinkedHashSet r0 = r2.A0O
            java.util.LinkedHashSet r7 = X.AnonymousClass0x9.A17()
            java.util.Iterator r8 = r0.iterator()
        L_0x0425:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0487
            java.lang.String r6 = X.AnonymousClass001.A0m(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0456
            java.lang.String r0 = "http"
            boolean r0 = r6.startsWith(r0)
            if (r0 != 0) goto L_0x0456
            java.lang.String r0 = "//"
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L_0x045c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r25.getProtocol()
            r1.append(r0)
            java.lang.String r0 = ":"
            java.lang.String r6 = X.AnonymousClass000.A0V(r0, r6, r1)
        L_0x0456:
            if (r6 == 0) goto L_0x0425
            r7.add(r6)
            goto L_0x0425
        L_0x045c:
            java.lang.String r14 = r25.getProtocol()     // Catch:{ MalformedURLException | URISyntaxException -> 0x0480 }
            java.lang.String r15 = r25.getUserInfo()     // Catch:{ MalformedURLException | URISyntaxException -> 0x0480 }
            java.lang.String r16 = r25.getHost()     // Catch:{ MalformedURLException | URISyntaxException -> 0x0480 }
            int r17 = r25.getPort()     // Catch:{ MalformedURLException | URISyntaxException -> 0x0480 }
            r19 = 0
            java.net.URI r13 = new java.net.URI     // Catch:{ MalformedURLException | URISyntaxException -> 0x0480 }
            r18 = r6
            r20 = r19
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ MalformedURLException | URISyntaxException -> 0x0480 }
            java.net.URL r0 = r13.toURL()     // Catch:{ MalformedURLException | URISyntaxException -> 0x0480 }
            java.lang.String r6 = r0.toString()     // Catch:{ MalformedURLException | URISyntaxException -> 0x0480 }
            goto L_0x0456
        L_0x0480:
            r1 = move-exception
            java.lang.String r0 = "WebPageInfo/ensureThumbUrl Bad URL"
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x0456
        L_0x0487:
            r2.A0O = r7
        L_0x0489:
            java.lang.String r0 = r2.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x04ab
            java.util.regex.Pattern r0 = A0g
            java.util.regex.Matcher r1 = r0.matcher(r5)
        L_0x0497:
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x04ab
            java.lang.String r0 = r1.group(r4)
            X.C626936e.A06(r0)
            java.lang.String r0 = r0.trim()
            r2.A0J = r0
            goto L_0x0497
        L_0x04ab:
            java.lang.String r0 = r2.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x04bf
            java.lang.String r0 = r2.A0J
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            java.lang.String r0 = r0.toString()
            r2.A0J = r0
        L_0x04bf:
            java.lang.String r0 = r2.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x04d3
            java.lang.String r0 = r2.A0G
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            java.lang.String r0 = r0.toString()
            r2.A0G = r0
        L_0x04d3:
            java.lang.String r0 = r25.toString()
            boolean r0 = X.AnonymousClass5VE.A01(r0)
            if (r0 == 0) goto L_0x04ff
            java.lang.String r0 = "invite_link_type_v2"
            java.lang.Object r1 = r3.get(r0)
            java.lang.String r0 = "PARENT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0500
            r1 = 1
        L_0x04ec:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A0B = r0
            java.lang.String r0 = "parent_group_subject"
            java.lang.String r0 = X.C18320x8.A0e(r0, r3)
            r2.A0E = r0
            if (r0 == 0) goto L_0x04ff
            r2.A0G = r0
        L_0x04ff:
            return r12
        L_0x0500:
            java.lang.String r0 = "SUB"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x050a
            r1 = 2
            goto L_0x04ec
        L_0x050a:
            java.lang.String r0 = "DEFAULT_SUB"
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L_0x04ec
            r1 = 3
            goto L_0x04ec
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66513Ls.A08(java.lang.String, java.lang.String, java.lang.String, java.net.URL, int):java.lang.String");
    }

    public void A0A(AnonymousClass1VX r6) {
        Iterator it = this.A0O.iterator();
        int i = 0;
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            if (i >= 2) {
                Locale locale = Locale.US;
                Object[] A0L2 = AnonymousClass002.A0L();
                AnonymousClass000.A1P(A0L2, AnonymousClass0x9.A03(this.A0O, i), 0);
                String.format(locale, "WebPageInfo/loadThumbRetrySmall Remaining %d thumbnails are not loaded.", A0L2);
                return;
            }
            i++;
            try {
                A0C(r6, A0m);
                return;
            } catch (AnonymousClass57Y unused) {
                Log.w("WebPageInfo/loadThumbRetrySmall Cannot fetch large thumbnail");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r15 = X.C18320x8.A0h(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0193, code lost:
        if (r0 != 2) goto L_0x0195;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x01e4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x0185 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x01ad */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0166 A[EDGE_INSN: B:126:0x0166->B:65:0x0166 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014c A[Catch:{ all -> 0x0171, all -> 0x0176, all -> 0x017b }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0192 A[Catch:{ all -> 0x0219 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.AnonymousClass1VX r21, java.lang.String r22) {
        /*
            r20 = this;
            r14 = r20
            java.lang.String r2 = r14.A0Z
            r0 = 0
            r14.A05 = r0
            long r11 = android.os.SystemClock.uptimeMillis()
            java.net.URL r1 = X.C18330xA.A0B(r2)
            java.lang.String r4 = r1.getHost()
            if (r4 == 0) goto L_0x0020
            java.lang.String r4 = java.net.IDN.toASCII(r4)     // Catch:{ IllegalArgumentException -> 0x001a }
        L_0x001a:
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r4 = r4.toLowerCase(r0)
        L_0x0020:
            java.lang.String r2 = r1.getProtocol()
            if (r2 == 0) goto L_0x002c
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toLowerCase(r0)
        L_0x002c:
            java.net.URI r0 = r1.toURI()
            java.lang.String r3 = r0.getUserInfo()
            int r5 = r0.getPort()
            java.lang.String r6 = r0.getPath()
            java.lang.String r7 = r0.getQuery()
            java.lang.String r8 = r1.getRef()
            java.net.URI r1 = new java.net.URI
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.net.URL r6 = r1.toURL()
            r0 = r22
            java.net.HttpURLConnection r3 = r14.A09(r0, r6)
            r8 = 0
            if (r3 == 0) goto L_0x021e
            r0 = 1
            r3.setInstanceFollowRedirects(r0)
            r3.connect()     // Catch:{ ProtocolException -> 0x0062 }
            int r0 = r3.getResponseCode()     // Catch:{ ProtocolException -> 0x0062 }
            goto L_0x0080
        L_0x0062:
            r2 = move-exception
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = X.AnonymousClass0x9.A0z(r0)
            java.lang.String r0 = "too many redirects"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x007e
            java.lang.String r0 = "too many follow-up requests"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x007e
            throw r2
        L_0x007e:
            r0 = 303(0x12f, float:4.25E-43)
        L_0x0080:
            int r0 = r0 / 100
            r7 = 2
            if (r0 == r7) goto L_0x00f9
            r5 = 3
            if (r0 != r5) goto L_0x0195
            r14.A0E(r3)
            java.net.HttpURLConnection r3 = r14.A09(r8, r6)
            if (r3 == 0) goto L_0x021e
            r4 = 0
            r3.setInstanceFollowRedirects(r4)
            r3.connect()
            int r0 = r3.getResponseCode()
            java.lang.String r10 = ""
            r2 = 0
        L_0x009f:
            int r0 = r0 / 100
            if (r0 != r5) goto L_0x0193
            r0 = 20
            if (r2 >= r0) goto L_0x0195
            java.lang.String r0 = "Location"
            java.lang.String r13 = r3.getHeaderField(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x0195
            java.lang.String r0 = "Set-Cookie"
            java.lang.String r9 = r3.getHeaderField(r0)
            if (r9 == 0) goto L_0x00c6
            java.lang.String r0 = ";"
            java.lang.String[] r1 = r9.split(r0)
            int r0 = r1.length
            if (r0 <= 0) goto L_0x00c6
            r9 = r1[r4]
        L_0x00c6:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x00d6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r10)
            java.lang.String r0 = "; "
            java.lang.String r10 = X.AnonymousClass000.A0X(r0, r1)
        L_0x00d6:
            java.lang.String r10 = X.AnonymousClass000.A0T(r10, r9)
            r14.A0E(r3)
            java.net.URL r0 = X.C18330xA.A0B(r13)
            java.net.HttpURLConnection r3 = r14.A09(r8, r0)
            if (r3 == 0) goto L_0x021e
            r3.setInstanceFollowRedirects(r4)
            java.lang.String r0 = "Cookie"
            r3.setRequestProperty(r0, r10)
            r3.connect()
            int r0 = r3.getResponseCode()
            int r2 = r2 + 1
            goto L_0x009f
        L_0x00f9:
            java.lang.String r0 = "Content-Type"
            java.lang.String r1 = r3.getHeaderField(r0)     // Catch:{ all -> 0x0219 }
            if (r1 == 0) goto L_0x0199
            java.util.regex.Pattern r0 = A0b     // Catch:{ all -> 0x0219 }
            java.util.regex.Matcher r1 = r0.matcher(r1)     // Catch:{ all -> 0x0219 }
            boolean r0 = r1.find()     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x0199
            r0 = 1
            java.lang.String r0 = r1.group(r0)     // Catch:{ all -> 0x0219 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x0219 }
            java.lang.String r1 = r0.trim()     // Catch:{ all -> 0x0219 }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x0219 }
            java.lang.String r16 = r1.toUpperCase(r0)     // Catch:{ all -> 0x0219 }
        L_0x011f:
            java.lang.String r17 = r3.getContentType()     // Catch:{ all -> 0x0219 }
            int r19 = r3.getContentLength()     // Catch:{ all -> 0x0219 }
            r1 = 3938(0xf62, float:5.518E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x0219 }
            r2 = r21
            int r0 = r2.A0O(r0, r1)     // Catch:{ all -> 0x0219 }
            r9 = 1024(0x400, float:1.435E-42)
            int r7 = r0 * 1024
            r5 = 0
            X.2s4 r1 = r14.A0X     // Catch:{ OutOfMemoryError -> 0x0185 }
            r0 = 23
            X.1zz r2 = X.C36851zz.A01(r1, r3, r0)     // Catch:{ OutOfMemoryError -> 0x0185 }
            java.io.ByteArrayOutputStream r8 = X.AnonymousClass0x9.A0e()     // Catch:{ all -> 0x017b }
            byte[] r4 = new byte[r9]     // Catch:{ all -> 0x0171 }
            r1 = 0
        L_0x0145:
            int r10 = r2.read(r4, r5, r9)     // Catch:{ all -> 0x0171 }
            r0 = -1
            if (r10 == r0) goto L_0x0166
            r8.write(r4, r5, r10)     // Catch:{ all -> 0x0171 }
            int r1 = r1 + r10
            if (r1 > r7) goto L_0x0166
            byte[] r0 = r8.toByteArray()     // Catch:{ all -> 0x0171 }
            java.lang.String r10 = X.C18320x8.A0h(r0)     // Catch:{ all -> 0x0171 }
            java.util.regex.Pattern r0 = A0c     // Catch:{ all -> 0x0171 }
            java.util.regex.Matcher r0 = r0.matcher(r10)     // Catch:{ all -> 0x0171 }
            boolean r0 = r0.find()     // Catch:{ all -> 0x0171 }
            if (r0 == 0) goto L_0x0145
        L_0x0166:
            byte[] r7 = r8.toByteArray()     // Catch:{ all -> 0x0171 }
            r8.close()     // Catch:{ all -> 0x017b }
            r2.close()     // Catch:{ OutOfMemoryError -> 0x0185 }
            goto L_0x018f
        L_0x0171:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0176 }
            goto L_0x017a
        L_0x0176:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x017b }
        L_0x017a:
            throw r1     // Catch:{ all -> 0x017b }
        L_0x017b:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0180 }
            goto L_0x0184
        L_0x0180:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ OutOfMemoryError -> 0x0185 }
        L_0x0184:
            throw r1     // Catch:{ OutOfMemoryError -> 0x0185 }
        L_0x0185:
            java.lang.System.gc()     // Catch:{ all -> 0x0219 }
            java.lang.String r0 = "WebPageInfo/readData OutOfMemoryError"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0219 }
            byte[] r7 = new byte[r5]     // Catch:{ all -> 0x0219 }
        L_0x018f:
            int r4 = r7.length     // Catch:{ all -> 0x0219 }
            if (r4 == 0) goto L_0x0195
            goto L_0x019c
        L_0x0193:
            if (r0 == r7) goto L_0x00f9
        L_0x0195:
            r14.A0E(r3)
            return
        L_0x0199:
            java.lang.String r16 = ""
            goto L_0x011f
        L_0x019c:
            boolean r0 = android.text.TextUtils.isEmpty(r16)     // Catch:{ UnsupportedEncodingException -> 0x01ad }
            if (r0 == 0) goto L_0x01aa
            java.lang.String r0 = X.C58152un.A0B     // Catch:{ UnsupportedEncodingException -> 0x01ad }
        L_0x01a4:
            java.lang.String r15 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x01ad }
            r15.<init>(r7, r0)     // Catch:{ UnsupportedEncodingException -> 0x01ad }
            goto L_0x01b1
        L_0x01aa:
            r0 = r16
            goto L_0x01a4
        L_0x01ad:
            java.lang.String r15 = X.C18320x8.A0h(r7)     // Catch:{ all -> 0x0219 }
        L_0x01b1:
            r18 = r6
            java.lang.String r2 = r14.A08(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0219 }
            boolean r0 = android.text.TextUtils.isEmpty(r16)     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x01e4
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0219 }
            if (r0 != 0) goto L_0x01e4
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            r1.<init>(r7, r2)     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            r0 = 0
            r14.A0J = r0     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            r14.A0G = r0     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            r14.A0D = r0     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            java.util.LinkedHashSet r0 = r14.A0O     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            r0.clear()     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            r14.A0P = r5     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            r14.A02 = r5     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            r14.A0Q = r5     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            r14.A0S = r5     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            r14.A0T = r5     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            r15 = r1
            r16 = r2
            r14.A08(r15, r16, r17, r18, r19)     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
        L_0x01e4:
            long r0 = (long) r4     // Catch:{ all -> 0x0219 }
            r14.A06 = r0     // Catch:{ all -> 0x0219 }
            r14.A0E(r3)
            java.lang.String r0 = r14.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01fe
            java.lang.String r0 = r14.A0J
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            java.lang.String r0 = r0.toString()
            r14.A0J = r0
        L_0x01fe:
            java.lang.String r0 = r14.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0212
            java.lang.String r0 = r14.A0G
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            java.lang.String r0 = r0.toString()
            r14.A0G = r0
        L_0x0212:
            long r0 = X.C18310x6.A0A(r11)
            r14.A05 = r0
            return
        L_0x0219:
            r0 = move-exception
            r14.A0E(r3)
            throw r0
        L_0x021e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66513Ls.A0B(X.1VX, java.lang.String):void");
    }

    public void A0C(AnonymousClass1VX r13, String str) {
        int min;
        int i;
        this.A04 = 0;
        long currentTimeMillis = System.currentTimeMillis();
        byte[] A0I2 = A0I(r13, str);
        if (A0I2 != null) {
            this.A0V = A0J(A0I2, 100, 100, 140, 140, false);
            if (TextUtils.isEmpty(str) || !A0h.matcher(C106685Zz.A01(str)).find() || this.A03 != 0) {
                int i2 = this.A01;
                int i3 = this.A00;
                if (i2 > i3) {
                    i = Math.min(i2, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
                    min = (i3 * i) / i2;
                } else {
                    min = Math.min(i3, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
                    i = (min * i2) / i3;
                    if (i < 300) {
                        min = (i3 * 300) / i2;
                        i = 300;
                    }
                }
                this.A0W = A0J(A0I2, 300, 75, i, min, true);
            }
            this.A04 = AnonymousClass0x9.A05(currentTimeMillis);
        }
    }

    public final void A0E(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                C624535b.A03(C36851zz.A00(this.A0X, (Integer) null, 23, httpURLConnection));
            } catch (IOException unused) {
            }
            httpURLConnection.disconnect();
        }
    }

    public boolean A0F() {
        boolean z;
        if (this instanceof AnonymousClass1Hk) {
            return true;
        }
        boolean z2 = !TextUtils.isEmpty(this.A0J);
        boolean A1U = C18320x8.A1U(this.A0G);
        C149027Kq r1 = this.A09;
        if (r1 != null) {
            String str = r1.A01;
            if ("image/gif".equals(str) || "video/mp4".equals(str)) {
                z = true;
                if (!z2 || A1U || z) {
                    return true;
                }
                return false;
            }
        }
        z = false;
        return !z2 ? true : true;
    }

    public final byte[] A0I(AnonymousClass1VX r16, String str) {
        ByteArrayOutputStream A0e2;
        int A0O2 = r16.A0O(C58422vE.A02, 3937) * EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        String str2 = str;
        if (!TextUtils.isEmpty(str2)) {
            URL A0B2 = C18330xA.A0B(str2);
            if (A0B2.equals(URLDecoder.decode(str2, C58152un.A0B))) {
                A0B2 = new URI(A0B2.getProtocol(), A0B2.getUserInfo(), A0B2.getHost(), A0B2.getPort(), A0B2.getPath(), A0B2.getQuery(), A0B2.getRef()).toURL();
            }
            HttpURLConnection A092 = A09((String) null, A0B2);
            if (A092 != null) {
                A092.setConnectTimeout(SearchActionVerificationClientService.NOTIFICATION_ID);
                A092.setReadTimeout(20000);
                C36851zz A012 = C36851zz.A01(this.A0X, A092, 23);
                try {
                    A0e2 = AnonymousClass0x9.A0e();
                    byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
                    int i = 0;
                    do {
                        int read = A012.read(bArr, 0, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
                        if (read == -1) {
                            byte[] byteArray = A0e2.toByteArray();
                            A0e2.close();
                            A012.close();
                            return byteArray;
                        }
                        A0e2.write(bArr, 0, read);
                        i += read;
                    } while (i <= A0O2);
                    throw new AnonymousClass57Y();
                } catch (Throwable th) {
                    try {
                        A012.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
        }
        return null;
        throw th;
    }

    public byte[] A0J(byte[] bArr, int i, int i2, int i3, int i4, boolean z) {
        byte[] A0G2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        byte[] bArr2 = bArr;
        BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length, options);
        int i5 = options.outWidth;
        this.A01 = i5;
        int i6 = options.outHeight;
        this.A00 = i6;
        if (i5 < i || i6 < i2) {
            return null;
        }
        options.inDither = true;
        options.inScaled = false;
        options.inPreferQualityOverSpeed = true;
        if (this.A0R) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        int i7 = i3;
        int i8 = i4;
        Bitmap bitmap = C107245ax.A05((AnonymousClass5QA) null, new AnonymousClass5WB(options, (Long) null, i7, i8, !z), bArr2, false).A02;
        if (bitmap == null) {
            return null;
        }
        if (z) {
            A0G2 = A0H(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), i7, i8, 50);
        } else {
            A0G2 = A0G(bitmap);
        }
        bitmap.recycle();
        return A0G2;
    }

    public C66513Ls(C56492s4 r2, C106685Zz r3, String str) {
        this.A0Y = r3;
        this.A0X = r2;
        this.A0Z = str;
    }

    public static final URL A01(HashMap hashMap, String... strArr) {
        try {
            String A002 = A00(hashMap, strArr);
            if (A002 != null) {
                return C18330xA.A0B(A002);
            }
            return null;
        } catch (MalformedURLException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("WebPageInfo/");
            A0o.append(strArr);
            C18260x0.A14("  Bad URL", A0o, e);
            return null;
        }
    }

    public static HashMap A02(String str) {
        HashMap A0t = AnonymousClass001.A0t();
        Matcher matcher = A0d.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group2 == null) {
                group2 = matcher.group(3);
            }
            A0t.put(group, group2);
        }
        return A0t;
    }

    public String A06() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(" hasOgVideo:");
        A0o.append(this.A0P);
        A0o.append(10);
        A0o.append("page loaded in ");
        A0o.append(this.A05);
        A0o.append(" ms, ");
        A0o.append(this.A06);
        A0o.append(" bytes");
        A0o.append(10);
        long j = this.A04;
        if (j > 0) {
            Locale locale = Locale.US;
            Object[] A1X = AnonymousClass0x9.A1X();
            A1X[0] = Long.valueOf(j);
            A1X[1] = Integer.valueOf(this.A01);
            AnonymousClass000.A1N(A1X, this.A00);
            A0o.append(String.format(locale, "image loaded in %dms, image dimension %dx%d", A1X));
            byte[] bArr = this.A0V;
            if (bArr != null) {
                Object[] objArr = new Object[1];
                AnonymousClass000.A1P(objArr, bArr.length, 0);
                A0o.append(String.format(locale, ", small thumbnail %dbytes", objArr));
            }
            byte[] bArr2 = this.A0W;
            if (bArr2 != null) {
                Object[] objArr2 = new Object[1];
                AnonymousClass000.A1P(objArr2, bArr2.length, 0);
                str = String.format(locale, ", large thumbnail %dbytes", objArr2);
            }
            return A0o.toString();
        }
        str = " image not loaded";
        A0o.append(str);
        return A0o.toString();
    }

    public final void A0D(String str, String str2, String... strArr) {
        String substring = str.substring(0, str.length() - str2.length());
        for (String A0T2 : strArr) {
            this.A0O.add(AnonymousClass000.A0T(substring, A0T2));
        }
    }

    public final byte[] A0H(Bitmap bitmap, Rect rect, int i, int i2, int i3) {
        ByteArrayOutputStream A0e2 = AnonymousClass0x9.A0e();
        try {
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            canvas.drawColor(-1);
            canvas.drawBitmap(bitmap, rect, new Rect(0, 0, i, i2), paint);
            if (createBitmap != null) {
                createBitmap.compress(Bitmap.CompressFormat.JPEG, i3, A0e2);
                byte[] byteArray = A0e2.toByteArray();
                if (!createBitmap.isRecycled()) {
                    createBitmap.recycle();
                }
                return byteArray;
            }
        } catch (OutOfMemoryError unused) {
            System.gc();
            Log.e("WebPageInfo/convertToByteArray OutOfMemoryError");
        }
        bitmap.compress(Bitmap.CompressFormat.JPEG, i3, A0e2);
        return A0e2.toByteArray();
    }
}
