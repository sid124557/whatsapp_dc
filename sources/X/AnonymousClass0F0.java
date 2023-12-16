package X;

import com.whatsapp.util.Log;

/* renamed from: X.0F0  reason: invalid class name */
public class AnonymousClass0F0 extends C67743Qm {
    public final AnonymousClass33p A00;

    public AnonymousClass0F0(C55682qk r8, AnonymousClass33p r9, AnonymousClass31C r10, C55892r5 r11, AnonymousClass4FS r12) {
        super(r8, r10, r11, r12, new int[]{228}, false);
        this.A00 = r9;
    }

    public void A05(AnonymousClass36K r4, int i) {
        if (i == 228) {
            AnonymousClass36K A0l = r4.A0l("migrate");
            if (A0l != null) {
                this.A00.A1B(A0l.A0b("urgency", 0));
                return;
            }
            Log.e("encb/EncBackupNotificationHandler/migrate child node missing");
        }
    }
}
