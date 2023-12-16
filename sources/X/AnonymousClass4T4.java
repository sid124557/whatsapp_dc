package X;

import android.view.View;
import android.widget.ListView;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4T4  reason: invalid class name */
public class AnonymousClass4T4 extends AnonymousClass0P4 {
    public final /* synthetic */ MediaAlbumActivity A00;

    public AnonymousClass4T4(MediaAlbumActivity mediaAlbumActivity) {
        this.A00 = mediaAlbumActivity;
    }

    public void A01(List list, List list2, List list3) {
        MediaAlbumActivity mediaAlbumActivity = this.A00;
        if (mediaAlbumActivity.A0L.A0I()) {
            Map map = mediaAlbumActivity.A00.A0Q.A0D;
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                ((AnonymousClass679) A0w.getKey()).BmM(AnonymousClass0x2.A08(A0w));
            }
            map.clear();
        }
    }

    public void A03(List list, Map map) {
        View A06;
        View A062;
        MediaAlbumActivity mediaAlbumActivity = this.A00;
        List list2 = mediaAlbumActivity.A0B.A00;
        if (list2 != null) {
            Iterator it = list2.iterator();
            int i = 0;
            boolean z = false;
            while (it.hasNext()) {
                C624134x A0T = C18300x5.A0T(it);
                i++;
                if (i <= 3) {
                    ListView listView = mediaAlbumActivity.getListView();
                    AnonymousClass2z0 r5 = A0T.A1J;
                    View findViewWithTag = listView.findViewWithTag(r5);
                    if (findViewWithTag == null || z || (findViewWithTag.getTop() < 0 && (findViewWithTag.getTop() >= 0 || findViewWithTag.getBottom() < mediaAlbumActivity.getListView().getHeight()))) {
                        map.remove(C107315b6.A05(r5));
                        map.remove(C107315b6.A04(A0T));
                    } else {
                        String A05 = C107315b6.A05(r5);
                        if (!map.containsKey(A05) && (A062 = C107275b2.A06(mediaAlbumActivity.getListView(), A05)) != null) {
                            list.add(A05);
                            map.put(A05, A062);
                        }
                        String A04 = C107315b6.A04(A0T);
                        if (!map.containsKey(A04) && (A06 = C107275b2.A06(mediaAlbumActivity.getListView(), A04)) != null) {
                            list.add(A04);
                            map.put(A04, A06);
                        }
                        z = true;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
