package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.4WN  reason: invalid class name */
public class AnonymousClass4WN extends AnonymousClass0R6 {
    public List A00;
    public final C101245Ea A01;

    public int A0G() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r14, int i) {
        AnonymousClass4YO r142 = (AnonymousClass4YO) r14;
        AnonymousClass7Vr r5 = (AnonymousClass7Vr) this.A00.get(i);
        WaTextView waTextView = r142.A01;
        C91824lC r7 = r5.A01;
        waTextView.setText(r7.A01);
        int parseColor = Color.parseColor(r7.A02);
        WaImageButton waImageButton = r142.A00;
        View view = r142.A0H;
        Context context = view.getContext();
        int A05 = C18300x5.A05(waImageButton, context, 1);
        int A03 = AnonymousClass0YI.A03(0.08f, parseColor, -16777216);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int[] iArr = new int[A05];
        iArr[0] = parseColor;
        iArr[1] = A03;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        gradientDrawable.setShape(1);
        gradientDrawable.setGradientType(A05);
        gradientDrawable.setGradientCenter(-1.0f, 0.5f);
        gradientDrawable.setSize(waImageButton.getWidth(), waImageButton.getHeight());
        waImageButton.setBackground(C107335b8.A06(context, gradientDrawable));
        r142.A02.A00(waImageButton, r7.A03);
        C107335b8.A0E(waImageButton, AnonymousClass0Y8.A04(view.getContext(), R.color.f5nameremoved));
        C18320x8.A16(view, r5, r142, 17);
        C989453v.A00(waImageButton, r142, 41);
        C989453v.A00(waTextView, r142, 42);
    }

    public AnonymousClass4WN(C101245Ea r1) {
        this.A01 = r1;
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        View A0R = AnonymousClass001.A0R(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved);
        Resources resources = viewGroup.getResources();
        if (resources.getConfiguration().orientation == 1) {
            float A03 = ((float) (resources.getDisplayMetrics().widthPixels - (AnonymousClass0YH.A03(viewGroup) + AnonymousClass0YH.A02(viewGroup)))) / 4.4f;
            if (C86664Kz.A01(resources, R.dimen.f6nameremoved) > A03) {
                View A02 = C06560Yg.A02(A0R, R.id.category_icon);
                int floor = (int) Math.floor(((double) A03) / 1.5d);
                A02.getLayoutParams().width = floor;
                C86624Kv.A0w(A02, floor);
            }
            A0R.getLayoutParams().width = (int) A03;
        }
        return new AnonymousClass4YO(A0R, (C44702Xd) this.A01.A00.A03.A00.A3a.get());
    }
}
