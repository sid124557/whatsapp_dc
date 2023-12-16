package X;

import com.whatsapp.util.Log;

/* renamed from: X.3Sa  reason: invalid class name and case insensitive filesystem */
public class C68143Sa implements AnonymousClass4EZ {
    public final C84854Dz A00;
    public final AnonymousClass31C A01;

    public void BQs(String str) {
        Log.e("error delivering blocking chat psa");
        C85684Hf r1 = (C85684Hf) this.A00;
        if (r1.A01 != 0) {
            ((C54142oF) r1.A00).A00();
        }
    }

    public C68143Sa(C84854Dz r1, AnonymousClass31C r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BSN(AnonymousClass36K r4, String str) {
        int A012 = C57492tj.A01(r4);
        C18260x0.A0x("error blocking chat psa ", AnonymousClass001.A0o(), A012);
        C85684Hf r1 = (C85684Hf) this.A00;
        if (r1.A01 != 0) {
            ((C54142oF) r1.A00).A01(A012);
        } else {
            C18260x0.A0x("error getting chat block status ", AnonymousClass001.A0o(), A012);
        }
    }

    public void BdM(AnonymousClass36K r2, String str) {
        Log.i("success setting block status for chat psa");
        this.A00.Bd8(r2);
    }
}
