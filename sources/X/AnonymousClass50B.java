package X;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.50B  reason: invalid class name */
public class AnonymousClass50B extends AnonymousClass6JE {
    public final C95814uZ A00;
    public final C58802vq A01;
    public final AnonymousClass7IM A02;
    public final AnonymousClass4FS A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final Map A07 = AnonymousClass001.A0t();
    public final boolean A08;

    public int A0C() {
        int size = this.A04.size();
        List list = this.A06;
        if (list != null) {
            return size + list.size();
        }
        return size;
    }

    public void A0E(ViewGroup viewGroup, Object obj, int i) {
        viewGroup.removeView((View) obj);
        C18290x4.A1L((AnonymousClass5ZM) this.A07.remove(Integer.valueOf(i)));
    }

    public Pair A0G(int i) {
        Context context;
        int i2;
        int i3;
        if (i == 0) {
            context = this.A00;
            i2 = R.string.f11nameremoved;
        } else {
            int A0C = A0C() - 1;
            context = this.A00;
            i2 = R.string.f11nameremoved;
            if (i < A0C) {
                i2 = R.string.f11nameremoved;
            }
        }
        String string = context.getString(i2);
        if (this.A00 == null) {
            boolean A0D = C107405bG.A0D(context);
            i3 = R.string.f11nameremoved;
            if (A0D) {
                i3 = R.string.f11nameremoved;
            }
        } else {
            boolean z = this.A08;
            i3 = R.string.f11nameremoved;
            if (z) {
                i3 = R.string.f11nameremoved;
            }
        }
        return Pair.create(string, context.getString(i3));
    }

    public void A0H(AnonymousClass509 r11, int i) {
        r11.setDownloadClickListener(new C109715f4(this, r11, i, 12));
        List list = this.A04;
        if (i < list.size()) {
            A0I(r11, i);
            return;
        }
        int size = i - list.size();
        int A09 = AnonymousClass000.A09(this.A06, size);
        int A092 = AnonymousClass000.A09(this.A05, size);
        AnonymousClass55U r3 = new AnonymousClass55U(r11.getContext(), r11.A00, r11.A06, r11.A04, A09, A092);
        r11.A02.setVisibility(8);
        DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity = this.A02.A01;
        Set set = downloadableWallpaperPreviewActivity.A08;
        Integer valueOf = Integer.valueOf(i);
        set.add(valueOf);
        if (downloadableWallpaperPreviewActivity.A01.getCurrentItem() == i) {
            downloadableWallpaperPreviewActivity.A00.setEnabled(true);
        }
        C18290x4.A1L((AnonymousClass5ZM) this.A07.put(valueOf, r3));
        C18270x1.A0w(r3, this.A03);
    }

    public final void A0I(AnonymousClass509 r6, int i) {
        r6.A02.setVisibility(0);
        r6.A03.setVisibility(0);
        r6.A01.setVisibility(8);
        C33791th r2 = new C33791th(r6.getContext(), (Uri) this.A04.get(i), this.A01, new C103455Na(r6, this, i));
        C18290x4.A1L((AnonymousClass5ZM) this.A07.put(Integer.valueOf(i), r2));
        C18270x1.A0w(r2, this.A03);
    }

    public AnonymousClass50B(Context context, Resources resources, C95814uZ r4, C58802vq r5, AnonymousClass7IM r6, AnonymousClass4FS r7, List list, List list2, List list3, boolean z) {
        super(context, resources);
        this.A03 = r7;
        this.A01 = r5;
        this.A02 = r6;
        this.A04 = list;
        this.A06 = list2;
        this.A05 = list3;
        this.A00 = r4;
        this.A08 = z;
    }

    public boolean A0F(View view, Object obj) {
        return AnonymousClass000.A1Y(view, obj);
    }
}
