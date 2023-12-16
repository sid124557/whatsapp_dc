package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.PhotoView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.67Z  reason: invalid class name */
public class AnonymousClass67Z extends AnonymousClass0P4 {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass67Z(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass67Z r4, List list, Map map) {
        ArrayList<String> stringArrayList;
        PhotoView A1J;
        MediaViewBaseFragment mediaViewBaseFragment = ((C96024vV) r4.A00).A01;
        Object A1M = mediaViewBaseFragment.A1M(mediaViewBaseFragment.A09.getCurrentItem());
        if (A1M != null && (stringArrayList = ((Bundle) r4.A01).getStringArrayList("visible_shared_elements")) != null && stringArrayList.contains(C107315b6.A05(A1M)) && (A1J = mediaViewBaseFragment.A1J(A1M)) != null) {
            Object A1L = mediaViewBaseFragment.A1L();
            C626936e.A06(A1L);
            list.remove(C107315b6.A05(A1L));
            list.add(C107315b6.A05(A1M));
            map.put(C107315b6.A05(A1M), A1J);
        }
    }

    public void A02(List list, List list2, List list3) {
        if (this.A02 != 0) {
            super.A02(list, list2, list3);
            return;
        }
        ((C003203q) this.A01).A5c((AnonymousClass0P4) null);
        AnonymousClass5XD r1 = (AnonymousClass5XD) this.A00;
        AnonymousClass0YZ.A0F(r1.A06, (String) null);
        AnonymousClass0YZ.A0F(r1.A08, (String) null);
        ImageView imageView = r1.A07;
        if (imageView != null) {
            AnonymousClass0YZ.A0F(imageView, (String) null);
        }
    }

    public void A03(List list, Map map) {
        View A06;
        if (this.A02 != 0) {
            A00(this, list, map);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            if (!map.containsKey(A0m) && (A06 = C107275b2.A06(AnonymousClass001.A0Q((Activity) this.A01), A0m)) != null) {
                map.put(A0m, A06);
            }
        }
    }
}
