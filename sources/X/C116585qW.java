package X;

import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.5qW  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C116585qW implements C183388px {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ AnonymousClass5YG A01;

    public final void BfZ(int i) {
        MediaViewFragment mediaViewFragment = this.A00;
        if (this.A01.A0e() && mediaViewFragment.A0Q() != null) {
            boolean A1T = AnonymousClass000.A1T(AnonymousClass001.A0Q(mediaViewFragment.A0R()).getSystemUiVisibility() & 4);
            if (i == 0) {
                if (!A1T) {
                    mediaViewFragment.A1W(true, true);
                }
            } else if (i == 4 && A1T) {
                mediaViewFragment.A1W(false, true);
            }
        }
    }

    public /* synthetic */ C116585qW(MediaViewFragment mediaViewFragment, AnonymousClass5YG r2) {
        this.A00 = mediaViewFragment;
        this.A01 = r2;
    }
}
