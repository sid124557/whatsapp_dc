package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.6Ew  reason: invalid class name and case insensitive filesystem */
public class C125026Ew extends ViewOutlineProvider {
    public final /* synthetic */ AnonymousClass7XE A00;
    public final /* synthetic */ AnonymousClass6EJ A01;

    public C125026Ew(AnonymousClass7XE r1, AnonymousClass6EJ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void getOutline(View view, Outline outline) {
        AnonymousClass7XE r0 = this.A00;
        outline.setOval(0, 0, r0.A07, r0.A04);
    }
}
