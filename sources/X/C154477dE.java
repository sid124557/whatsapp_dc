package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.StickyHeadersRecyclerView;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.7dE  reason: invalid class name and case insensitive filesystem */
public class C154477dE implements AnonymousClass0u9 {
    public Object A00;
    public final int A01;

    public C154477dE(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean BUh(MotionEvent motionEvent, RecyclerView recyclerView) {
        if (this.A01 != 0) {
            return AnonymousClass000.A1W(((ConversationsFragment) this.A00).A0J);
        }
        StickyHeadersRecyclerView stickyHeadersRecyclerView = (StickyHeadersRecyclerView) this.A00;
        C05570Ua r0 = stickyHeadersRecyclerView.A08;
        if (r0 == null || r0.A0H == null) {
            return false;
        }
        float y = motionEvent.getY();
        int height = stickyHeadersRecyclerView.A08.A0H.getHeight();
        int i = stickyHeadersRecyclerView.A04;
        if (i >= 0) {
            i = 0;
        }
        if (y > ((float) (height + i))) {
            return false;
        }
        stickyHeadersRecyclerView.A07.A00(motionEvent);
        return true;
    }

    public void Ba3(boolean z) {
    }

    public void BeG(MotionEvent motionEvent, RecyclerView recyclerView) {
        if (this.A01 == 0) {
            ((StickyHeadersRecyclerView) this.A00).A07.A00(motionEvent);
        }
    }
}
