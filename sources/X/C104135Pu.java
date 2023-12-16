package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.5Pu  reason: invalid class name and case insensitive filesystem */
public class C104135Pu {
    public final Set A00 = AnonymousClass002.A0K();
    public final Set A01 = AnonymousClass002.A0K();
    public final Set A02 = AnonymousClass002.A0K();

    public void A00(Activity activity, Menu menu, AnonymousClass1VX r11) {
        int A04;
        boolean z;
        boolean z2;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < menu.size(); i4++) {
            MenuItem item = menu.getItem(i4);
            if (item.isVisible()) {
                if (C18300x5.A1X(this.A01, item.getItemId())) {
                    i2++;
                    item.setShowAsAction(0);
                } else {
                    i3++;
                    item.setShowAsAction(2);
                }
            }
        }
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        int min = (Math.min(AnonymousClass001.A0Q(activity).getWidth(), AnonymousClass001.A0Q(activity).getHeight()) - (dimensionPixelSize * 2)) - (activity.getResources().getDimensionPixelSize(R.dimen.f6nameremoved) * 2);
        if (i2 > 0) {
            i = activity.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        }
        int i5 = min - i;
        if (i5 < i3 * dimensionPixelSize) {
            if (i2 == 0) {
                i5 = C86664Kz.A09(activity.getResources(), R.dimen.f6nameremoved, i5);
            }
            int i6 = i3 - (i5 / dimensionPixelSize);
            if (i6 > 1 || i2 > 0) {
                for (int size = menu.size() - 1; size >= 0 && i6 > 0; size--) {
                    MenuItem item2 = menu.getItem(size);
                    if (item2.isVisible() && !C18300x5.A1X(this.A01, item2.getItemId()) && !C18300x5.A1X(this.A02, item2.getItemId())) {
                        item2.setShowAsAction(1);
                        i6--;
                    }
                }
            }
        }
        if (menu instanceof C07890cz) {
            C07890cz r1 = (C07890cz) menu;
            r1.A06();
            if (C106545Zk.A00(r11)) {
                boolean A03 = C106545Zk.A03(r11);
                HashSet A0K = AnonymousClass002.A0K();
                r1.A06();
                Iterator it = r1.A06.iterator();
                while (it.hasNext()) {
                    C18270x1.A1K(A0K, ((C07910d1) it.next()).getItemId());
                }
                for (int i7 = 0; i7 < menu.size(); i7++) {
                    MenuItem item3 = menu.getItem(i7);
                    Drawable icon = item3.getIcon();
                    if (icon != null) {
                        if (C86624Kv.A1a(A0K, item3.getItemId())) {
                            A04 = AnonymousClass0Y8.A04(activity, R.color.f5nameremoved);
                            z = false;
                        } else {
                            A04 = AnonymousClass0Y8.A04(activity, R.color.f5nameremoved);
                            z = true;
                        }
                        Drawable A0G = C86634Kw.A0G(icon);
                        AnonymousClass0YG.A06(A0G, A04);
                        if (A03) {
                            Set set = this.A00;
                            boolean A1X = C18300x5.A1X(set, item3.getItemId());
                            if (z) {
                                if (!A1X) {
                                    C86654Ky.A1R(set, item3.getItemId());
                                    z2 = false;
                                }
                                icon = A0G;
                            } else {
                                if (A1X) {
                                    set.remove(Integer.valueOf(item3.getItemId()));
                                    z2 = true;
                                }
                                icon = A0G;
                            }
                            icon = C107335b8.A08(activity, A0G, z2);
                        }
                        item3.setIcon(icon);
                    }
                }
            }
        }
    }
}
