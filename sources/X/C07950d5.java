package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0d5  reason: invalid class name and case insensitive filesystem */
public class C07950d5 implements C15760rt {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ C009407h A02;
    public final /* synthetic */ C010107z A03;
    public final /* synthetic */ AnonymousClass0QW A04;

    public C07950d5(View view, ViewGroup viewGroup, C009407h r3, C010107z r4, AnonymousClass0QW r5) {
        this.A03 = r4;
        this.A00 = view;
        this.A01 = viewGroup;
        this.A02 = r3;
        this.A04 = r5;
    }

    public void BOO() {
        View view = this.A00;
        view.clearAnimation();
        this.A01.endViewTransition(view);
        this.A02.A00();
        if (C08270df.A04()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Animation from operation ");
            A0o.append(this.A04);
            AnonymousClass000.A1I(A0o, " has been cancelled.");
        }
    }
}
