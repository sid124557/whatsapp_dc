package X;

import java.security.cert.CertificateException;
import org.spongycastle.jcajce.provider.asymmetric.x509.CertificateFactory;

/* renamed from: X.8Sg  reason: invalid class name and case insensitive filesystem */
public class C173928Sg extends CertificateException {
    public Throwable cause;
    public final /* synthetic */ CertificateFactory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C173928Sg(String str, Throwable th, CertificateFactory certificateFactory) {
        super(str);
        this.this$0 = certificateFactory;
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
