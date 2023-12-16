package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: X.9j5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9j5 implements Runnable {
    public final /* synthetic */ C196109aJ A00;
    public final /* synthetic */ C184128rI A01;
    public final /* synthetic */ String A02;

    public final void run() {
        FileInputStream fileInputStream;
        C196109aJ r4 = this.A00;
        String str = this.A02;
        C184128rI r3 = this.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(File.separator);
        A0o.append(str);
        try {
            fileInputStream = new FileInputStream(new File(r4.A01.A00.getFilesDir(), AnonymousClass000.A0V(AnonymousClass99P.A0H, AnonymousClass000.A0X(".json", A0o), AnonymousClass001.A0o())));
            C159437lp.A01(r3, (C48412er) null, C624535b.A00(fileInputStream));
            fileInputStream.close();
            return;
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public /* synthetic */ AnonymousClass9j5(C196109aJ r1, C184128rI r2, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }
}
