package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;

/* renamed from: X.5cQ  reason: invalid class name and case insensitive filesystem */
public class C108105cQ implements ServiceConnection {
    public final /* synthetic */ ConversationsFragment A00;

    public C108105cQ(ConversationsFragment conversationsFragment) {
        this.A00 = conversationsFragment;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ConversationsFragment conversationsFragment = this.A00;
        conversationsFragment.A1W = new AnonymousClass1IL(conversationsFragment);
        conversationsFragment.A2u.BkM(C117625sE.A00(this, 35));
        Log.i("conversations/gdrive-service-connected");
    }

    public void onServiceDisconnected(ComponentName componentName) {
        ConversationsFragment conversationsFragment = this.A00;
        conversationsFragment.A0q.A02(conversationsFragment.A1W);
        Log.i("conversations/gdrive-service-disconnected");
    }
}
