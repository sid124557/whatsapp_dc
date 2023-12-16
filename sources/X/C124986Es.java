package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.6Es  reason: invalid class name and case insensitive filesystem */
public class C124986Es extends ViewOutlineProvider {
    public final /* synthetic */ float A00;

    public void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.A00);
    }

    public C124986Es(float f) {
        this.A00 = f;
    }
}
