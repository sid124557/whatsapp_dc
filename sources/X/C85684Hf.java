package X;

import com.whatsapp.util.Log;

/* renamed from: X.4Hf  reason: invalid class name and case insensitive filesystem */
public class C85684Hf implements C84854Dz {
    public Object A00;
    public final int A01;

    public C85684Hf(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Bd8(AnonymousClass36K r4) {
        if (this.A01 != 0) {
            ((C54142oF) this.A00).A02((String) null);
            return;
        }
        C162457s7.A0J(r4, 0);
        Log.i("success getting chat block status");
        C56962sq r2 = (C56962sq) this.A00;
        C18290x4.A1M(r2.A0c, r2, r4, 23);
    }
}
