package X;

import android.text.TextUtils;
import android.view.MenuItem;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.gallery.MediaGalleryActivity;

/* renamed from: X.5hV  reason: invalid class name and case insensitive filesystem */
public class C111075hV implements C187908y0 {
    public String A00 = "";
    public boolean A01 = true;
    public final /* synthetic */ ViewPager A02;
    public final /* synthetic */ MediaGalleryActivity A03;

    public C111075hV(ViewPager viewPager, MediaGalleryActivity mediaGalleryActivity) {
        this.A03 = mediaGalleryActivity;
        this.A02 = viewPager;
    }

    public void Bdv(AnonymousClass5T2 r7) {
        this.A02.setCurrentItem(r7.A00);
        MediaGalleryActivity mediaGalleryActivity = this.A03;
        int i = r7.A00;
        mediaGalleryActivity.A00 = i;
        if (i != mediaGalleryActivity.A02) {
            RequestPermissionActivity.A0q(mediaGalleryActivity, mediaGalleryActivity.A0K, mediaGalleryActivity.A0D);
        }
        int i2 = mediaGalleryActivity.A00;
        int i3 = mediaGalleryActivity.A03;
        MenuItem menuItem = mediaGalleryActivity.A04;
        if (i2 == i3) {
            if (menuItem != null) {
                if (menuItem.isActionViewExpanded()) {
                    this.A00 = mediaGalleryActivity.A0i;
                    mediaGalleryActivity.A04.collapseActionView();
                }
                mediaGalleryActivity.A04.setVisible(false);
            }
            this.A01 = true;
            return;
        }
        if (menuItem != null) {
            menuItem.setVisible(true);
            if (!TextUtils.isEmpty(mediaGalleryActivity.A0i) || TextUtils.isEmpty(this.A00) || !this.A01) {
                AnonymousClass665 A0C = MediaGalleryActivity.A0C(mediaGalleryActivity);
                if (A0C != null) {
                    C56532s8 r1 = mediaGalleryActivity.A0b;
                    r1.A05(mediaGalleryActivity.A0i);
                    r1.A06(mediaGalleryActivity.A0j);
                    A0C.Bay(r1);
                }
            } else {
                mediaGalleryActivity.A0i = this.A00;
                mediaGalleryActivity.A04.expandActionView();
                AnonymousClass002.A09(mediaGalleryActivity.A04.getActionView(), R.id.search_src_text).setText(mediaGalleryActivity.A0i);
            }
        }
        this.A01 = false;
    }

    public void Bdu(AnonymousClass5T2 r1) {
    }
}
