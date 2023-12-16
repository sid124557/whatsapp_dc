package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.6kZ  reason: invalid class name and case insensitive filesystem */
public class C135376kZ extends AnonymousClass8HR {
    public void run() {
        File A0R = C107655bf.A0R(this.A01, this.A04);
        if (A0R.exists() && !A0R.delete()) {
            Log.w("MediaDeleteDoodleJob/failed-delete-doodle-file");
        }
    }

    public C135376kZ(Context context, C64393Dh r2, AnonymousClass5Y0 r3, AnonymousClass65N r4, String str) {
        super(context, r2, r3, r4, str);
    }
}
