package X;

import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NetworkUtils;
import com.facebook.msys.mci.UrlRequest;
import com.facebook.msys.mci.UrlResponse;
import com.whatsapp.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.2i4  reason: invalid class name and case insensitive filesystem */
public class C50372i4 {
    public long A00 = 0;
    public long A01;
    public final DataTask A02;
    public final NetworkSession A03;
    public final UrlRequest A04;
    public final AnonymousClass7IY A05;
    public final BufferedOutputStream A06;
    public final HttpURLConnection A07;
    public final /* synthetic */ C63773Ap A08;

    public C50372i4(DataTask dataTask, NetworkSession networkSession, AnonymousClass7IY r11, C63773Ap r12) {
        this.A08 = r12;
        this.A05 = r11;
        this.A02 = dataTask;
        this.A03 = networkSession;
        UrlRequest urlRequest = dataTask.mUrlRequest;
        this.A04 = urlRequest;
        try {
            HttpsURLConnection A012 = r12.A01(urlRequest, (FileInputStream) null, (byte[]) null);
            this.A07 = A012;
            A012.setDoOutput(true);
            A012.setChunkedStreamingMode(10240);
            long j = dataTask.mContentLength;
            if (Long.valueOf(j) == null || j <= 0) {
                throw AnonymousClass002.A0C("Content-Length cannot be empty for streaming upload");
            }
            this.A01 = j;
            this.A06 = new BufferedOutputStream(AnonymousClass203.A00(r12.A02, (Integer) null, 29, A012), 10240);
            Execution.executeAsync(new AnonymousClass6Mp(dataTask, networkSession, this, r12), 3);
        } catch (IOException | IllegalArgumentException | IndexOutOfBoundsException e) {
            Log.e("wa-msys/NetworkSession: Error while initializing StreamingUploadDataTask", e);
            IOException iOException = new IOException(e);
            A01(NetworkUtils.newErrorURLResponse(this.A04), iOException, (byte[]) null);
            throw iOException;
        }
    }

    public final void A00() {
        try {
            BufferedOutputStream bufferedOutputStream = this.A06;
            if (bufferedOutputStream != null) {
                this.A07.connect();
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
            }
        } catch (IOException | IllegalArgumentException | IndexOutOfBoundsException e) {
            Log.e("wa-msys/NetworkSession: Exception while attempting to close the active output stream.  This could mean that the output stream has been previously closed.", e);
        }
    }

    public final void A01(UrlResponse urlResponse, IOException iOException, byte[] bArr) {
        A00();
        this.A07.disconnect();
        AnonymousClass7IY r0 = this.A05;
        r0.A01.A09.remove(r0.A00.mTaskIdentifier);
        NetworkUtils.markDataTaskCompleted(this.A02, this.A03, urlResponse, "wa-msys/NetworkSession: ", bArr, (File) null, iOException);
    }
}
