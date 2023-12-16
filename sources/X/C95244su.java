package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.gallery.LinksGalleryFragment;
import java.util.Calendar;

/* renamed from: X.4su  reason: invalid class name and case insensitive filesystem */
public class C95244su extends AnonymousClass4X2 implements C185858uM {
    public final /* synthetic */ LinksGalleryFragment A00;

    public C95244su(LinksGalleryFragment linksGalleryFragment) {
        this.A00 = linksGalleryFragment;
    }

    public int B62(int i) {
        return ((C118305tK) this.A00.A0K.get(i)).count;
    }

    public int B83() {
        return this.A00.A0K.size();
    }

    public long B84(int i) {
        return -((Calendar) this.A00.A0K.get(i)).getTimeInMillis();
    }

    public /* bridge */ /* synthetic */ void BNd(C05570Ua r3, int i) {
        ((AnonymousClass6IF) r3).A00.setText(this.A00.A0K.get(i).toString());
    }

    public /* bridge */ /* synthetic */ C05570Ua BQN(ViewGroup viewGroup) {
        LinksGalleryFragment linksGalleryFragment = this.A00;
        View inflate = linksGalleryFragment.A0Q().getLayoutInflater().inflate(R.layout.f8nameremoved, viewGroup, false);
        inflate.setClickable(false);
        C86604Kt.A0z(linksGalleryFragment.A1D(), inflate, AnonymousClass5Yj.A02(linksGalleryFragment.A1D(), R.attr.f3nameremoved, R.color.f5nameremoved));
        return new AnonymousClass6IF(inflate);
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        LinksGalleryFragment linksGalleryFragment = this.A00;
        View A0R = AnonymousClass001.A0R(linksGalleryFragment.A0Q().getLayoutInflater(), viewGroup, R.layout.f8nameremoved);
        C86664Kz.A0s(A0R, R.id.link_preview_frame).setForeground(AnonymousClass0RP.A00(linksGalleryFragment.A1D(), R.drawable.selector_orange_gradient));
        C18270x1.A0d(linksGalleryFragment.A1D(), AnonymousClass0x9.A0F(A0R, R.id.chevron), linksGalleryFragment.A05, R.drawable.chevron);
        return new AnonymousClass4Z3(A0R, linksGalleryFragment);
    }

    public /* bridge */ /* synthetic */ boolean Bck(MotionEvent motionEvent, C05570Ua r3, int i) {
        return false;
    }
}
