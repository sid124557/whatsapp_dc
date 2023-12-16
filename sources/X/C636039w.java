package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.39w  reason: invalid class name and case insensitive filesystem */
public class C636039w implements View.OnLongClickListener {
    public final C69263Wi A00;
    public final C620633i A01;
    public final String A02;

    public boolean onLongClick(View view) {
        ClipboardManager A0C = this.A01.A0C();
        if (A0C == null) {
            return true;
        }
        try {
            String str = this.A02;
            A0C.setPrimaryClip(ClipData.newPlainText(str, str));
            this.A00.A0H(R.string.f11nameremoved, 0);
            return true;
        } catch (NullPointerException | SecurityException e) {
            Log.e("contactinfo/copy", e);
            this.A00.A0H(R.string.f11nameremoved, 0);
            return true;
        }
    }

    public C636039w(C69263Wi r1, C620633i r2, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }
}
