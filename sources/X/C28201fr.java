package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.1fr  reason: invalid class name and case insensitive filesystem */
public class C28201fr extends C172738Mn {
    public final C620633i A00;
    public final C135426ke A01;

    public AnonymousClass7N0 A03() {
        InputStream A06;
        C135426ke r1 = this.A01;
        Uri parse = Uri.parse(r1.A00);
        if (parse == null) {
            return new C135516kn((File) null, false);
        }
        File file = r1.A06;
        try {
            A06 = C620633i.A02(this.A00).A06(parse);
            if (A06 != null) {
                C627536m.A0R(file, A06);
                C135516kn r3 = new C135516kn(file, true);
                A06.close();
                return r3;
            }
            Log.e("ProcessCopyTask/processMedia failed to open input stream");
            return new C135516kn((File) null, false);
        } catch (IOException e) {
            Log.e("ProcessCopyTask/processMedia exception ", e);
            return new C135516kn((File) null, false);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public C28201fr(C620633i r1, C135426ke r2) {
        super(r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
