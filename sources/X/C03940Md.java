package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.0Md  reason: invalid class name and case insensitive filesystem */
public class C03940Md {
    public final Context A00;
    public final Rect A01 = AnonymousClass001.A0N();
    public final View A02;
    public final WindowManager.LayoutParams A03;
    public final TextView A04;
    public final int[] A05 = new int[2];
    public final int[] A06 = new int[2];

    public C03940Md(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.A03 = layoutParams;
        this.A00 = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.f8nameremoved, (ViewGroup) null);
        this.A02 = inflate;
        this.A04 = AnonymousClass002.A09(inflate, R.id.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.f12nameremoved;
        layoutParams.flags = 24;
    }
}
