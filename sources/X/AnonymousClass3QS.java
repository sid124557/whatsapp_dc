package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: X.3QS  reason: invalid class name */
public class AnonymousClass3QS implements C185098t5 {
    public long A00 = 0;
    public final C61072zf A01;
    public final AnonymousClass1VX A02;
    public final File A03;

    public OutputStream BgO(AnonymousClass4GL r6) {
        if (((long) ((AnonymousClass3PZ) r6).A01.getContentLength()) <= this.A01.A02()) {
            try {
                if (C56952sp.A0I(this.A02)) {
                    Brp();
                    return new FileOutputStream(this.A03, true);
                }
                File file = this.A03;
                C627536m.A0O(file);
                return new FileOutputStream(file, false);
            } catch (FileNotFoundException e) {
                Log.e("plainfiledownload/FileNotFoundException", e);
                throw new C1000559g(9);
            }
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("plainfiledownload/not enough space to store the file: ");
            C18270x1.A17(this.A03, A0o);
            throw new C1000559g(4);
        }
    }

    public void Brp() {
        long j;
        if (C56952sp.A0I(this.A02)) {
            j = this.A03.length();
        } else {
            j = 0;
        }
        this.A00 = j;
    }

    public AnonymousClass3QS(C61072zf r3, AnonymousClass1VX r4, File file) {
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = file;
    }

    public long BA7() {
        return this.A00;
    }
}
