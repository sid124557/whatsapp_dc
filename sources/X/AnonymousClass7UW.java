package X;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;
import org.json.JSONObject;

/* renamed from: X.7UW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7UW {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass7Vw A02;
    public final /* synthetic */ AnonymousClass8E7 A03;
    public final /* synthetic */ C59722xN A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ JSONObject A08;

    public final void A00(CronetEngine cronetEngine) {
        CronetEngine cronetEngine2 = cronetEngine;
        C59722xN r8 = this.A04;
        String str = this.A05;
        String str2 = this.A06;
        JSONObject jSONObject = this.A08;
        String str3 = this.A07;
        int i = this.A00;
        AnonymousClass7Vw r6 = this.A02;
        AnonymousClass8E7 r7 = this.A03;
        int i2 = this.A01;
        if (cronetEngine != null) {
            try {
                C176008cH r15 = new C176008cH(r6, r7, r8, cronetEngine2.getVersionString(), str3, i);
                ExperimentalUrlRequest.Builder newUrlRequestBuilder = ((ExperimentalCronetEngine) cronetEngine2).newUrlRequestBuilder(C59722xN.A00(str, str2, str3).toString(), (UrlRequest.Callback) r15, (Executor) Executors.newCachedThreadPool());
                newUrlRequestBuilder.addHeader("Content-Type", "application/json");
                newUrlRequestBuilder.addHeader("Accept-Encoding", "gzip");
                newUrlRequestBuilder.addHeader("User-Agent", r8.A05.A02());
                newUrlRequestBuilder.setHttpMethod("POST");
                newUrlRequestBuilder.disableCache();
                byte[] bytes = jSONObject.toString().getBytes(C58152un.A0B);
                int length = bytes.length;
                newUrlRequestBuilder.setUploadDataProvider(UploadDataProviders.create(bytes, 0, length), (Executor) Executors.newCachedThreadPool());
                newUrlRequestBuilder.build().start();
                r15.A00 = System.currentTimeMillis();
                r8.A00.A05.A01(length, i);
            } catch (Exception e) {
                r6.A01(e);
            }
        } else {
            r8.A06.BkM(new C71503cD(r6, r7, r8, str3, str, str2, jSONObject, i2, i));
        }
    }

    public /* synthetic */ AnonymousClass7UW(AnonymousClass7Vw r1, AnonymousClass8E7 r2, C59722xN r3, String str, String str2, String str3, JSONObject jSONObject, int i, int i2) {
        this.A04 = r3;
        this.A05 = str;
        this.A06 = str2;
        this.A08 = jSONObject;
        this.A07 = str3;
        this.A00 = i;
        this.A02 = r1;
        this.A03 = r2;
        this.A01 = i2;
    }
}
