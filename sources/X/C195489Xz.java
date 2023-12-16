package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.9Xz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C195489Xz implements View.OnLongClickListener {
    public final /* synthetic */ AnonymousClass99L A00;
    public final /* synthetic */ C191669Fv A01;

    public final boolean onLongClick(View view) {
        Object obj;
        C191669Fv r4 = this.A01;
        AnonymousClass99L r3 = this.A00;
        ClipboardManager A0C = r4.A0M.A0C();
        if (A0C == null) {
            r4.A0H.A0H(R.string.f11nameremoved, 0);
            return true;
        }
        try {
            C166557yt r0 = r3.A0G.A08;
            if (r0 == null) {
                obj = null;
            } else {
                obj = r0.A00;
            }
            CharSequence charSequence = (CharSequence) obj;
            A0C.setPrimaryClip(ClipData.newPlainText(charSequence, charSequence));
            r4.A0H.A0H(R.string.f11nameremoved, 0);
            return true;
        } catch (NullPointerException | SecurityException unused) {
            r4.A0H.A0H(R.string.f11nameremoved, 0);
            return true;
        }
    }

    public /* synthetic */ C195489Xz(AnonymousClass99L r1, C191669Fv r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
