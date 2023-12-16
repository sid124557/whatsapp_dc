package X;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.0dM  reason: invalid class name and case insensitive filesystem */
public class C08120dM implements C15830s0 {
    public final Rect A00 = AnonymousClass001.A0N();
    public final /* synthetic */ ViewPager A01;

    public C08120dM(ViewPager viewPager) {
        this.A01 = viewPager;
    }

    public AnonymousClass0XY BMX(View view, AnonymousClass0XY r10) {
        AnonymousClass0XY A08 = C06560Yg.A08(view, r10);
        if (A08.A00.A0A()) {
            return A08;
        }
        Rect rect = this.A00;
        rect.left = A08.A03();
        rect.top = A08.A05();
        rect.right = A08.A04();
        rect.bottom = A08.A02();
        ViewPager viewPager = this.A01;
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            AnonymousClass0XY A07 = C06560Yg.A07(viewPager.getChildAt(i), A08);
            rect.left = Math.min(A07.A03(), rect.left);
            rect.top = Math.min(A07.A05(), rect.top);
            rect.right = Math.min(A07.A04(), rect.right);
            rect.bottom = Math.min(A07.A02(), rect.bottom);
        }
        return A08.A07(rect.left, rect.top, rect.right, rect.bottom);
    }
}
