package X;

import android.content.Context;
import com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager;
import com.facebook.avatar.autogen.presenter.AECapturePresenter$1;

/* renamed from: X.82E  reason: invalid class name */
public final class AnonymousClass82E implements C203389nc, C180338ks {
    public boolean A00 = true;
    public boolean A01;
    public final AEFaceTrackerManager A02;
    public final C166367yZ A03;
    public final C159147lC A04;
    public final C73853gB A05;
    public final C85524Gp A06 = new C832246p(AnonymousClass2C3.A01);

    public /* synthetic */ AnonymousClass82E(Context context, C166367yZ r7, C159147lC r8) {
        C73853gB r4 = AnonymousClass34M.A00;
        this.A03 = r7;
        this.A04 = r8;
        this.A05 = r4;
        this.A02 = new AEFaceTrackerManager(context, this, r7);
        C616131n.A02((C85494Gl) null, new AECapturePresenter$1(this, (C84814Du) null), AnonymousClass349.A02(r4), (AnonymousClass20D) null, 3);
    }

    public void BOG(Exception exc) {
    }

    public void BOK() {
    }

    public void BON() {
    }

    public void BOL(String str, String str2) {
    }
}
