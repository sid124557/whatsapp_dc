package X;

import android.content.DialogInterface;
import com.whatsapp.R;

/* renamed from: X.9pI  reason: invalid class name and case insensitive filesystem */
public class C204399pI implements DialogInterface.OnClickListener {
    public Object A00;
    public String A01;
    public final int A02;

    public C204399pI(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A02 != 0) {
            String str = this.A01;
            C1899593h.A1E(((AnonymousClass9W1) this.A00).A0I, C18290x4.A0a(), "prompt_warn_setup_without_recover", str);
            return;
        }
        AnonymousClass9BI r5 = (AnonymousClass9BI) this.A00;
        String str2 = this.A01;
        AnonymousClass9C3 r3 = r5.A04;
        r3.Bp9(R.string.f11nameremoved);
        ((C191109By) r3).A7A(new AnonymousClass9DL(r5, r3, str2), r3.A08.A0A, str2);
    }
}
