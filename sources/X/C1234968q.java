package X;

import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.status.playback.MyStatusesActivity;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.68q  reason: invalid class name and case insensitive filesystem */
public class C1234968q implements C15590rc {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1234968q(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        AnonymousClass58B r5;
        long j;
        if (this.A02 != 0) {
            C989753y r2 = (C989753y) this.A00;
            C624134x r6 = (C624134x) this.A01;
            int itemId = menuItem.getItemId();
            if (itemId == R.id.menuitem_forward) {
                MyStatusesActivity myStatusesActivity = (MyStatusesActivity) r2.A00;
                AnonymousClass0R2 r0 = myStatusesActivity.A01;
                if (r0 != null) {
                    r0.A05();
                }
                myStatusesActivity.A0P = r6;
                AnonymousClass5PH r4 = new AnonymousClass5PH(myStatusesActivity);
                r4.A09 = true;
                r4.A01 = r6.A1J.A00;
                byte b = r6.A1I;
                AnonymousClass5PH.A02(r4, b);
                if (b == 3) {
                    j = C18290x4.A0A(((C30471mV) r6).A0B);
                } else {
                    j = 0;
                }
                r4.A0R = Integer.valueOf(AnonymousClass5PH.A00(r4, r6, b, j));
                myStatusesActivity.startActivityForResult(AnonymousClass5PH.A01(r4), 2);
                return true;
            } else if (itemId == R.id.menuitem_delete) {
                MyStatusesActivity myStatusesActivity2 = (MyStatusesActivity) r2.A00;
                Map map = myStatusesActivity2.A11;
                map.clear();
                map.put(r6.A1J, r6);
                C621433s.A01(myStatusesActivity2, 13);
                map.clear();
                return true;
            } else {
                if (itemId == R.id.menuitem_share_status_facebook) {
                    r5 = AnonymousClass58B.FACEBOOK_SHARE;
                } else if (itemId == R.id.menuitem_share_status_third_party) {
                    r5 = AnonymousClass58B.THIRD_PARTY_SHARE;
                } else if (itemId == R.id.menuitem_share_status_instagram) {
                    r5 = AnonymousClass58B.INSTAGRAM_SHARE;
                } else if (itemId != R.id.menuitem_advertise_on_facebook) {
                    return true;
                } else {
                    MyStatusesActivity myStatusesActivity3 = (MyStatusesActivity) r2.A00;
                    C116985rC r1 = myStatusesActivity3.A04;
                    if (r1.A07()) {
                        r1.A04();
                        throw AnonymousClass001.A0g("logStatusEntryPointClicked");
                    }
                    myStatusesActivity3.A03.A04();
                    String str = r6.A1J.A01;
                    AnonymousClass59G r12 = AnonymousClass59G.A0d;
                    C162457s7.A0J(str, 0);
                    new C132006eX(r12, str, 4);
                    throw AnonymousClass001.A0g("launchAdsCreationExperience");
                }
                MyStatusesActivity myStatusesActivity4 = (MyStatusesActivity) r2.A00;
                Map map2 = myStatusesActivity4.A11;
                map2.clear();
                map2.put(r6.A1J, r6);
                myStatusesActivity4.A78(r5, C18290x4.A0c(), 4, Collections.singletonList(r6));
                return true;
            }
        } else {
            C92234mJ r3 = (C92234mJ) this.A00;
            C624134x r22 = (C624134x) this.A01;
            if (menuItem.getItemId() == 0) {
                r3.A04.A01(r3.A01.getActivity(), r22);
                return true;
            } else if (menuItem.getItemId() != 1) {
                return false;
            } else {
                r3.A01.Bkr(r22);
                return true;
            }
        }
    }
}
