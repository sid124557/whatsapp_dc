package X;

import android.view.MenuItem;
import android.view.SubMenu;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.gallery.GalleryTabHostFragment;
import java.util.Collection;

/* renamed from: X.62z  reason: invalid class name and case insensitive filesystem */
public final class C1220762z extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ SubMenu $overflowSubMenu;
    public final /* synthetic */ GalleryTabHostFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1220762z(SubMenu subMenu, GalleryTabHostFragment galleryTabHostFragment) {
        super(1);
        this.this$0 = galleryTabHostFragment;
        this.$overflowSubMenu = subMenu;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        Collection<C102245Ia> collection = (Collection) obj;
        C162457s7.A0J(collection, 0);
        this.this$0.A0G = C18310x6.A1X(collection);
        SubMenu subMenu = this.$overflowSubMenu;
        GalleryTabHostFragment galleryTabHostFragment = this.this$0;
        for (C102245Ia r3 : collection) {
            MenuItem add = subMenu.add(r3.A02);
            C162457s7.A0D(add);
            add.setIcon(r3.A01);
            add.setOnMenuItemClickListener(new C1237369o((Object) galleryTabHostFragment, 5, (Object) r3));
        }
        GalleryTabHostFragment galleryTabHostFragment2 = this.this$0;
        ViewPager viewPager = galleryTabHostFragment2.A05;
        if (viewPager != null) {
            i = viewPager.getCurrentItem();
        } else {
            i = 0;
        }
        galleryTabHostFragment2.A1P(i);
        return C59022wD.A00;
    }
}
