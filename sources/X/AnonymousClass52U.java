package X;

import com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;

/* renamed from: X.52U  reason: invalid class name */
public class AnonymousClass52U extends C88554aA {
    public final /* synthetic */ CreationModeBottomBar A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass52U(CreationModeBottomBar creationModeBottomBar) {
        super(creationModeBottomBar, 2.0f, 0.0f);
        this.A00 = creationModeBottomBar;
    }

    public void Bbv(C153317b2 r8) {
        super.Bbv(r8);
        CreationModeBottomBar creationModeBottomBar = this.A00;
        creationModeBottomBar.A04.setAlpha((float) A00(r8, 0.0f, 1.0f));
        float A002 = (float) A00(r8, 1.0f, 0.0f);
        creationModeBottomBar.A05.setScaleX(A002);
        creationModeBottomBar.A05.setScaleY(A002);
        if (r8.A07.A00 >= ((double) this.A00)) {
            creationModeBottomBar.A04.setVisibility(4);
        }
    }
}
