package X;

import android.net.Uri;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: X.56B  reason: invalid class name */
public class AnonymousClass56B extends C110805h4 implements C84134Bd {
    public final AnonymousClass3QO A00;
    public final C103495Ne A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass56B(android.content.Context r2, X.AnonymousClass3QO r3, X.C103495Ne r4) {
        /*
            r1 = this;
            X.3XB r0 = r3.A09
            java.lang.Object r0 = r0.A01()
            X.2QG r0 = (X.AnonymousClass2QG) r0
            if (r0 == 0) goto L_0x0018
            java.io.File r0 = r0.A01
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
        L_0x0010:
            r1.<init>(r2, r0)
            r1.A00 = r3
            r1.A01 = r4
            return
        L_0x0018:
            r0 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass56B.<init>(android.content.Context, X.3QO, X.5Ne):void");
    }

    public /* bridge */ /* synthetic */ void AwB(Object obj) {
        File file = ((AnonymousClass2QG) obj).A01;
        Uri fromFile = Uri.fromFile(file);
        synchronized (this.A04) {
            if (!fromFile.equals(this.A01)) {
                C18260x0.A1P(AnonymousClass001.A0o(), "whatsappswappableuridatasource/swap uri to ", fromFile);
                this.A01 = fromFile;
                this.A02 = true;
            }
        }
        C103495Ne r5 = this.A01;
        if (r5 != null) {
            if (!(r5.A01 == null || r5.A00 == file.length())) {
                C117105rO.A00(r5.A02, r5, 7);
            }
            r5.A00 = file.length();
        }
    }

    public long Bfw(C161387pX r3) {
        this.A00.A09.A04(this, (Executor) null);
        return super.Bfw(r3);
    }

    public void close() {
        this.A00.A09.A03(this);
        super.close();
    }
}
