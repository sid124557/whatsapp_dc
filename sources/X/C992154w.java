package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

/* renamed from: X.54w  reason: invalid class name and case insensitive filesystem */
public class C992154w extends AnonymousClass5ZM {
    public Exception A00;
    public final C64393Dh A01;
    public final C184388ri A02;
    public final String A03;
    public final String A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String str;
        FileOutputStream fileOutputStream;
        try {
            URL url = new URL(this.A04);
            url.openConnection().connect();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
            try {
                C64393Dh r3 = this.A01;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(C107655bf.A0U());
                String str2 = this.A03;
                if (str2.equals("image/gif")) {
                    str = ".gif";
                } else if (str2.equals("video/mp4")) {
                    str = ".mp4";
                } else {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("Unexpected info type (");
                    A0o2.append(str2);
                    throw AnonymousClass000.A0I(")", A0o2);
                }
                File A002 = C64393Dh.A00(r3, AnonymousClass000.A0X(str, A0o));
                fileOutputStream = new FileOutputStream(A002.getAbsolutePath());
                byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
                for (int read = bufferedInputStream.read(bArr); read != -1; read = bufferedInputStream.read(bArr)) {
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.flush();
                fileOutputStream.close();
                bufferedInputStream.close();
                return A002;
            } catch (Throwable th) {
                bufferedInputStream.close();
                throw th;
            }
            throw th;
        } catch (IOException e) {
            this.A00 = e;
            Log.e((Throwable) e);
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        File file = (File) obj;
        if (file != null) {
            this.A02.BTT(file, this.A04, (byte[]) null);
            return;
        }
        Exception exc = this.A00;
        if (exc != null) {
            this.A02.onFailure(exc);
        }
    }

    public C992154w(C64393Dh r1, C184388ri r2, String str, String str2) {
        this.A01 = r1;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = r2;
    }
}
