package X;

import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import java.util.List;

/* renamed from: X.6AV  reason: invalid class name */
public class AnonymousClass6AV implements C1227865s {
    public Object A00;
    public final int A01;

    public AnonymousClass6AV(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BcN(List list) {
        if (this.A01 != 0) {
            ((StatusPlaybackContactFragment) this.A00).A1T();
        } else {
            ((MyStatusesActivity) this.A00).A0Z.notifyDataSetChanged();
        }
    }
}
