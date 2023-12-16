package X;

import android.media.AudioManager;

/* renamed from: X.5cX  reason: invalid class name and case insensitive filesystem */
public class C108155cX implements AudioManager.OnAudioFocusChangeListener {
    public final C113895mA A00;

    public void onAudioFocusChange(int i) {
        C116095pj A002 = this.A00.A00();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("messageaudioplayer/onaudiofocuschanged ");
        A0o.append(i);
        A0o.append(" current player:");
        C18260x0.A1V(A0o, AnonymousClass000.A1W(A002));
        if (C615631i.A02() && A002 != null) {
            if (i == -2 || i == -1) {
                if (A002.A0I()) {
                    A002.A0D(false);
                }
            } else if (i == 1 && A002.A0V) {
                A002.A09(C116095pj.A12, true, false);
            }
        }
    }

    public C108155cX(C113895mA r1) {
        this.A00 = r1;
    }
}
