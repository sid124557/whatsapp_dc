package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.6Et  reason: invalid class name and case insensitive filesystem */
public class C124996Et extends ViewOutlineProvider {
    public final /* synthetic */ AnonymousClass4NZ A00;

    public C124996Et(AnonymousClass4NZ r1) {
        this.A00 = r1;
    }

    public void getOutline(View view, Outline outline) {
        AnonymousClass4NZ r2 = this.A00;
        outline.setAlpha(((float) r2.A0K) / 255.0f);
        Rect A0N = AnonymousClass001.A0N();
        r2.A0Z.roundOut(A0N);
        outline.setRoundRect(A0N, (float) r2.A0J);
    }
}
