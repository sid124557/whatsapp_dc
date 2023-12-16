package X;

import com.whatsapp.util.Log;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.protocol.HttpContext;

/* renamed from: X.0nk  reason: invalid class name and case insensitive filesystem */
public class C13790nk implements HttpRequestInterceptor {
    public int A00;
    public final C56492s4 A01;

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        StringBuilder sb;
        this.A00++;
        if (httpRequest instanceof EntityEnclosingRequestWrapper) {
            EntityEnclosingRequestWrapper entityEnclosingRequestWrapper = (EntityEnclosingRequestWrapper) httpRequest;
            HttpEntity entity = entityEnclosingRequestWrapper.getEntity();
            if (entity == null) {
                httpRequest.getRequestLine();
                return;
            }
            long contentLength = entity.getContentLength();
            if (contentLength <= 0) {
                sb = AnonymousClass001.A0o();
                sb.append("gdrive-api/request-interceptor/process/length/");
                sb.append(contentLength);
            } else {
                entityEnclosingRequestWrapper.setEntity(new C13780nj(this, entity));
                return;
            }
        } else if (!(httpRequest instanceof RequestWrapper)) {
            sb = AnonymousClass001.A0o();
            sb.append("gdrive-request-interceptor/process/request-is-not-a-wrapper ");
            sb.append(httpRequest);
        } else {
            return;
        }
        Log.e(sb.toString());
    }

    public C13790nk(C56492s4 r1) {
        this.A01 = r1;
    }
}
