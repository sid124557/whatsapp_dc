package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;

/* renamed from: X.4LE  reason: invalid class name */
public class AnonymousClass4LE extends Dialog implements C182688op {
    public int A00;
    public AnonymousClass4vO A01;
    public final C114835ng A02;

    public final void A00() {
        setContentView(this.A01);
        AnonymousClass6BG.A00(this.A01.getViewTreeObserver(), this, 25);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setFlags(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
            window.clearFlags(256);
            if (C107385bE.A06()) {
                window.getAttributes().layoutInDisplayCutoutMode = 1;
            }
            C107535bT.A00(this.A01, window, (C620633i) null);
            window.setSoftInputMode(5);
        }
        C114835ng r3 = this.A02;
        r3.A01 = this;
        r3.A00.A02(r3, r3.A04, r3.A05);
    }

    public AnonymousClass4LE(Activity activity, C114825nf r3, AnonymousClass4vO r4, C149797Nx r5, int[] iArr, int i) {
        super(activity, R.style.f12nameremoved);
        this.A01 = r4;
        this.A00 = i;
        this.A02 = new C114835ng(r3, r4, r5, iArr);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A00();
    }
}
