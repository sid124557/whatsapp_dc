package X;

import android.content.Context;
import android.view.ActionProvider;

/* renamed from: X.04K  reason: invalid class name */
public class AnonymousClass04K extends AnonymousClass067 implements ActionProvider.VisibilityListener {
    public C14940qW A00;
    public final /* synthetic */ AnonymousClass04I A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass04K(Context context, ActionProvider actionProvider, AnonymousClass04I r3) {
        super(context, actionProvider, r3);
        this.A01 = r3;
    }

    public void onActionProviderVisibilityChanged(boolean z) {
        C14940qW r0 = this.A00;
        if (r0 != null) {
            C07890cz r1 = ((C08040dE) r0).A00.A0E;
            r1.A0F = true;
            r1.A0F(true);
        }
    }
}
