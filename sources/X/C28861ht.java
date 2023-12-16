package X;

import com.whatsapp.util.Log;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.1ht  reason: invalid class name and case insensitive filesystem */
public class C28861ht extends C61102zi {
    public boolean A00;
    public final C54292oU A01;

    public void A08(boolean z) {
        DataOutputStream dataOutputStream;
        if (this.A00 != z) {
            this.A00 = z;
            try {
                dataOutputStream = new DataOutputStream(this.A01.A00.openFileOutput("login_failed", 0));
                dataOutputStream.writeBoolean(this.A00);
                dataOutputStream.close();
            } catch (IOException e) {
                Log.w("loginmanager/failed/save login_failed", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            Iterator A03 = C61102zi.A03(this);
            while (A03.hasNext()) {
                ((AnonymousClass4BF) A03.next()).BVu(z);
            }
            return;
        }
        return;
        throw th;
    }

    public C28861ht(C54292oU r1, C183538qC r2) {
        super(r2);
        this.A01 = r1;
    }

    public boolean A09() {
        return this.A00;
    }
}
