package X;

import android.net.Uri;
import com.whatsapp.R;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: X.55V  reason: invalid class name */
public class AnonymousClass55V extends AnonymousClass5ZM {
    public final Uri A00;
    public final C69263Wi A01;
    public final C620733j A02;
    public final C1227065k A03;
    public final C989053r A04;
    public final WeakReference A05;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        try {
            return this.A04.A0E(this.A00);
        } catch (IOException e) {
            return e;
        }
    }

    public void A0C(Object obj) {
        AnonymousClass4FU r3 = (AnonymousClass4FU) this.A05.get();
        if (r3 != null) {
            r3.BjL();
        }
        if (obj instanceof File) {
            this.A03.BTS((File) obj);
            return;
        }
        if (obj instanceof IOException) {
            Throwable th = (Throwable) obj;
            C18260x0.A1Q(AnonymousClass001.A0o(), "mediafileutils/getfilefrommediastoreasync/ioerror ", th);
            if (th.getMessage() != null && C86624Kv.A1Z(th)) {
                this.A01.A0N(r3, R.string.f11nameremoved);
                return;
            }
        }
        this.A01.A0H(R.string.f11nameremoved, 0);
    }

    public AnonymousClass55V(Uri uri, AnonymousClass4FU r3, C69263Wi r4, C620733j r5, C1227065k r6, C989053r r7) {
        this.A01 = r4;
        this.A04 = r7;
        this.A02 = r5;
        this.A05 = AnonymousClass0x9.A14(r3);
        this.A00 = uri;
        this.A03 = r6;
    }
}
