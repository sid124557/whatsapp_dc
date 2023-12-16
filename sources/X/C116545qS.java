package X;

import com.whatsapp.R;
import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.5qS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C116545qS implements C183328pr {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ AnonymousClass1nB A01;
    public final /* synthetic */ AnonymousClass5YG A02;

    public final void BSK(String str, boolean z, String str2) {
        MediaViewFragment mediaViewFragment = this.A00;
        AnonymousClass1nB r3 = this.A01;
        AnonymousClass5YG r2 = this.A02;
        if (str == null) {
            str = C08310eF.A09(mediaViewFragment).getString(R.string.f11nameremoved);
        }
        if (!z) {
            C30471mV.A00(r3).A0b = false;
            r2.A0G();
            C003203q A0Q = mediaViewFragment.A0Q();
            if (A0Q != null && !A0Q.isFinishing()) {
                C19340zH A0K = C18280x3.A0K(mediaViewFragment);
                A0K.A0Q(str);
                A0K.A0B(R.string.f11nameremoved);
                C1235268t.A02(A0K, mediaViewFragment, 72, R.string.f11nameremoved);
                C18280x3.A0q(A0K);
            }
        }
    }

    public /* synthetic */ C116545qS(MediaViewFragment mediaViewFragment, AnonymousClass1nB r2, AnonymousClass5YG r3) {
        this.A00 = mediaViewFragment;
        this.A01 = r2;
        this.A02 = r3;
    }
}
