package X;

import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* renamed from: X.0fn  reason: invalid class name and case insensitive filesystem */
public class C09190fn implements C16200sd {
    public /* bridge */ /* synthetic */ void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        if ((th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException)) {
            AnonymousClass0S3.A01("Unable to load composition.", th);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th);
    }
}
