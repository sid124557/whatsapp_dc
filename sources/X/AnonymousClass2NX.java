package X;

import android.os.Environment;
import com.whatsapp.util.Log;

/* renamed from: X.2NX  reason: invalid class name */
public class AnonymousClass2NX {
    public boolean A00;
    public boolean A01;
    public final C183538qC A02;

    public AnonymousClass2NX(AnonymousClass310 r8, AnonymousClass5ZR r9, C61072zf r10) {
        String A0V;
        this.A02 = C72333dY.A06(new AnonymousClass4KF(r8, this, r9, r10, 0));
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState)) {
            this.A00 = false;
            this.A01 = false;
            return;
        }
        if ("mounted_ro".equals(externalStorageState)) {
            this.A00 = false;
            this.A01 = true;
            A0V = "media-state-manager/main/media/read-only";
        } else {
            this.A00 = true;
            this.A01 = false;
            A0V = AnonymousClass000.A0V("media-state-manager/main/media/unavailable ", externalStorageState, AnonymousClass001.A0o());
        }
        Log.i(A0V);
    }
}
