package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.0Dz  reason: invalid class name */
public class AnonymousClass0Dz extends AnonymousClass0E0 {
    public int A00 = 0;
    public final /* synthetic */ AnonymousClass0F1 A01;
    public final /* synthetic */ AnonymousClass0UI A02;
    public final /* synthetic */ AnonymousClass0UV A03;
    public final /* synthetic */ File A04;

    public AnonymousClass0Dz(AnonymousClass0F1 r2, AnonymousClass0UI r3, AnonymousClass0UV r4, File file) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = file;
    }

    public Boolean A02() {
        C10190hX r5 = new C10190hX(this);
        try {
            Log.i("restore>RestoreAction/restore-messages/stage: save message store to device");
            AnonymousClass0UV r0 = this.A03;
            AnonymousClass0Y7 r3 = r0.A08;
            File file = this.A04;
            if (r3.A0J(r5, r0.A07, this.A02, file)) {
                return Boolean.TRUE;
            }
        } catch (AnonymousClass0ER | AnonymousClass0ES e) {
            int i = this.A00;
            if (i <= 5) {
                this.A00 = i + 1;
            } else {
                throw new AnonymousClass0EY("Having problems with local storage during restore", e);
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ Object A01(int i) {
        return A02();
    }
}
