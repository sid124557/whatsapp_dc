package X;

import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.05w  reason: invalid class name and case insensitive filesystem */
public class C006005w extends AnonymousClass0Q3 {
    public final /* synthetic */ AnonymousClass0NM A00;

    public C006005w(AnonymousClass0NM r1) {
        this.A00 = r1;
    }

    public void A00() {
        this.A00.A02.A00();
    }

    public void A01(int i, CharSequence charSequence) {
        this.A00.A02.A01(i, charSequence);
    }

    public void A02(int i, CharSequence charSequence) {
        WeakReference weakReference = ((C004404l) this.A00.A02).A00;
        if (weakReference.get() != null) {
            AnonymousClass08S r1 = (AnonymousClass08S) weakReference.get();
            AnonymousClass08M r0 = r1.A09;
            if (r0 == null) {
                r0 = AnonymousClass08M.A01();
                r1.A09 = r0;
            }
            AnonymousClass08S.A00(r0, charSequence);
        }
    }

    public void A03(AnonymousClass0KL r4) {
        C05860Vg r1 = r4.A00;
        C06190Wp r2 = null;
        if (r1 != null) {
            Cipher cipher = r1.A01;
            if (cipher != null) {
                r2 = new C06190Wp(cipher);
            } else {
                Signature signature = r1.A00;
                if (signature != null) {
                    r2 = new C06190Wp(signature);
                } else {
                    Mac mac = r1.A02;
                    if (mac != null) {
                        r2 = new C06190Wp(mac);
                    }
                }
            }
        }
        this.A00.A02.A02(new AnonymousClass0L0(r2, 2));
    }
}
