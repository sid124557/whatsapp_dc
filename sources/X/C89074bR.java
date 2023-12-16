package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.4bR  reason: invalid class name and case insensitive filesystem */
public class C89074bR extends AnonymousClass6JG {
    public final C185718u8 A00;
    public final /* synthetic */ MediaViewBaseFragment A01;

    public C89074bR(C185718u8 r1, MediaViewBaseFragment mediaViewBaseFragment) {
        this.A01 = mediaViewBaseFragment;
        this.A00 = r1;
    }

    public void A09(ViewGroup viewGroup) {
        this.A00.BTY();
    }

    public int A0C() {
        return this.A00.getCount();
    }

    public /* bridge */ /* synthetic */ int A0G(Object obj) {
        Object obj2;
        AnonymousClass0PJ r3 = (AnonymousClass0PJ) obj;
        if (r3.A00 == null || (obj2 = r3.A01) == null) {
            return -2;
        }
        return this.A00.BBY(obj2);
    }

    public /* bridge */ /* synthetic */ Object A0H(ViewGroup viewGroup, int i) {
        AnonymousClass0PJ B1A = this.A00.B1A(i);
        Object obj = B1A.A00;
        if (obj != null) {
            View view = (View) obj;
            Object obj2 = B1A.A01;
            this.A01.A1T(view);
            view.setTag(obj2);
            viewGroup.addView(view, 0);
        }
        return B1A;
    }

    public /* bridge */ /* synthetic */ void A0I(ViewGroup viewGroup, Object obj, int i) {
        Object obj2 = ((AnonymousClass0PJ) obj).A00;
        if (obj2 != null) {
            View view = (View) obj2;
            viewGroup.removeView(view);
            PhotoView.A01(view);
        }
        this.A00.B1b(i);
    }

    public /* bridge */ /* synthetic */ boolean A0K(View view, Object obj) {
        return AnonymousClass000.A1Y(view, ((AnonymousClass0PJ) obj).A00);
    }

    public CharSequence A04(int i) {
        return "";
    }
}
