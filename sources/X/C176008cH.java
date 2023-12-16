package X;

import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8cH  reason: invalid class name and case insensitive filesystem */
public class C176008cH extends UrlRequest.Callback {
    public long A00;
    public final ByteArrayOutputStream A01;
    public final WritableByteChannel A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ AnonymousClass7Vw A04;
    public final /* synthetic */ AnonymousClass8E7 A05;
    public final /* synthetic */ C59722xN A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.A04.A01(cronetException);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C176008cH(AnonymousClass7Vw r1, AnonymousClass8E7 r2, C59722xN r3, String str, String str2, int i) {
        this();
        this.A06 = r3;
        this.A04 = r1;
        this.A05 = r2;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = i;
    }

    public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        JSONObject jSONObject;
        byte[] byteArray = this.A01.toByteArray();
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        try {
            C59722xN r0 = this.A06;
            if (httpStatusCode / 100 == 2) {
                jSONObject = new JSONObject(new String(byteArray));
            } else {
                jSONObject = null;
            }
            this.A06.A00.A03(byteArray.length, this.A03);
            this.A04.A00(new C156437gc(jSONObject, httpStatusCode));
        } catch (JSONException e) {
            this.A04.A01(e);
        }
    }

    public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        String negotiatedProtocol = urlResponseInfo.getNegotiatedProtocol();
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        AnonymousClass8E7 r4 = this.A05;
        if (r4 != null) {
            String str = this.A07;
            Integer valueOf = Integer.valueOf(httpStatusCode);
            C56612sH r0 = this.A06.A02;
            r4.A0J(valueOf, Long.valueOf(System.currentTimeMillis() - this.A00), negotiatedProtocol, str, "Cronet", this.A08);
        }
        byteBuffer.flip();
        try {
            this.A02.write(byteBuffer);
        } catch (IOException unused) {
            Log.e("CronetNetworkRequestCallback/onReadCompleted error in reading response");
        }
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    public void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        String negotiatedProtocol = urlResponseInfo.getNegotiatedProtocol();
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        AnonymousClass8E7 r4 = this.A05;
        if (r4 != null) {
            String str = this.A07;
            Integer valueOf = Integer.valueOf(httpStatusCode);
            C56612sH r0 = this.A06.A02;
            r4.A0K(valueOf, Long.valueOf(System.currentTimeMillis() - this.A00), negotiatedProtocol, str, "Cronet", this.A08);
        }
        urlRequest.read(ByteBuffer.allocateDirect(65536));
    }

    public void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.followRedirect();
    }

    public C176008cH() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.A01 = byteArrayOutputStream;
        this.A02 = Channels.newChannel(byteArrayOutputStream);
    }
}
