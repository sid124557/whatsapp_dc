package X;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

/* renamed from: X.0nj  reason: invalid class name and case insensitive filesystem */
public class C13780nj implements HttpEntity {
    public final /* synthetic */ C13790nk A00;
    public final /* synthetic */ HttpEntity A01;

    public C13780nj(C13790nk r1, HttpEntity httpEntity) {
        this.A00 = r1;
        this.A01 = httpEntity;
    }

    public void consumeContent() {
        this.A01.consumeContent();
    }

    public InputStream getContent() {
        return new C36851zz(this.A00.A01, this.A01.getContent(), 3, 3);
    }

    public Header getContentEncoding() {
        return this.A01.getContentEncoding();
    }

    public long getContentLength() {
        return this.A01.getContentLength();
    }

    public Header getContentType() {
        return this.A01.getContentType();
    }

    public boolean isChunked() {
        return this.A01.isChunked();
    }

    public boolean isRepeatable() {
        return this.A01.isRepeatable();
    }

    public boolean isStreaming() {
        return this.A01.isStreaming();
    }

    public void writeTo(OutputStream outputStream) {
        this.A01.writeTo(new AnonymousClass203(this.A00.A01, outputStream, 3, 3));
    }
}
