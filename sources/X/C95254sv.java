package X;

import android.database.ContentObserver;
import android.database.Cursor;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.gallery.DocumentsGalleryFragment;
import java.util.Calendar;

/* renamed from: X.4sv  reason: invalid class name and case insensitive filesystem */
public class C95254sv extends AnonymousClass4X2 implements C185858uM {
    public int A00;
    public final ContentObserver A01 = new AnonymousClass67O(AnonymousClass000.A0A(), this, 0);
    public final /* synthetic */ DocumentsGalleryFragment A02;

    public C95254sv(DocumentsGalleryFragment documentsGalleryFragment) {
        this.A02 = documentsGalleryFragment;
    }

    public int A0G() {
        return this.A00;
    }

    public Cursor A0K(Cursor cursor) {
        int i;
        Cursor cursor2 = this.A01;
        if (cursor2 != null) {
            cursor2.unregisterContentObserver(this.A01);
        }
        if (cursor != null) {
            cursor.registerContentObserver(this.A01);
            i = cursor.getCount();
        } else {
            i = 0;
        }
        this.A00 = i;
        return super.A0K(cursor);
    }

    public int B62(int i) {
        return ((C118305tK) this.A02.A0K.get(i)).count;
    }

    public int B83() {
        return this.A02.A0K.size();
    }

    public long B84(int i) {
        return -((Calendar) this.A02.A0K.get(i)).getTimeInMillis();
    }

    public /* bridge */ /* synthetic */ void BNd(C05570Ua r3, int i) {
        ((AnonymousClass6IE) r3).A00.setText(this.A02.A0K.get(i).toString());
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r2, int i) {
        Cursor cursor = this.A01;
        if (cursor != null && i < cursor.getCount()) {
            super.BNf(r2, i);
        }
    }

    public /* bridge */ /* synthetic */ C05570Ua BQN(ViewGroup viewGroup) {
        DocumentsGalleryFragment documentsGalleryFragment = this.A02;
        View inflate = C86634Kw.A0K(documentsGalleryFragment).inflate(R.layout.f8nameremoved, viewGroup, false);
        inflate.setClickable(false);
        C86604Kt.A0z(documentsGalleryFragment.A0G(), inflate, AnonymousClass5Yj.A02(documentsGalleryFragment.A1D(), R.attr.f3nameremoved, R.color.f5nameremoved));
        return new AnonymousClass6IE(inflate);
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        DocumentsGalleryFragment documentsGalleryFragment = this.A02;
        return new C88444Yt(AnonymousClass001.A0R(C86634Kw.A0K(documentsGalleryFragment), viewGroup, R.layout.f8nameremoved), documentsGalleryFragment);
    }

    public /* bridge */ /* synthetic */ boolean Bck(MotionEvent motionEvent, C05570Ua r3, int i) {
        return false;
    }
}
