package X;

import android.view.View;
import com.whatsapp.mediaview.MediaViewFragment;
import java.util.Iterator;

/* renamed from: X.5fH  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C109845fH implements View.OnSystemUiVisibilityChangeListener {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ AnonymousClass5YG A01;

    public final void onSystemUiVisibilityChange(int i) {
        AnonymousClass561 A0A;
        AnonymousClass561 A0A2;
        MediaViewFragment mediaViewFragment = this.A00;
        AnonymousClass5YG r2 = this.A01;
        if (!r2.A0e()) {
            return;
        }
        if ((i & 4) == 0) {
            mediaViewFragment.A1W(true, false);
            Iterator A0v = AnonymousClass001.A0v(mediaViewFragment.A29);
            while (A0v.hasNext()) {
                AnonymousClass5YG r0 = (AnonymousClass5YG) A0v.next();
                if (!(r0 == r2 || (A0A2 = r0.A0A()) == null)) {
                    A0A2.A07();
                }
            }
            return;
        }
        mediaViewFragment.A1W(false, false);
        Iterator A0v2 = AnonymousClass001.A0v(mediaViewFragment.A29);
        while (A0v2.hasNext()) {
            AnonymousClass5YG r02 = (AnonymousClass5YG) A0v2.next();
            if (!(r02 == r2 || (A0A = r02.A0A()) == null)) {
                A0A.A06();
            }
        }
    }

    public /* synthetic */ C109845fH(MediaViewFragment mediaViewFragment, AnonymousClass5YG r2) {
        this.A00 = mediaViewFragment;
        this.A01 = r2;
    }
}
