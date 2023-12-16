package X;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.327  reason: invalid class name */
public class AnonymousClass327 {
    public static boolean A00;
    public static final Set A01 = AnonymousClass002.A0K();

    public static synchronized void A00(Context context, C620633i r14) {
        synchronized (AnonymousClass327.class) {
            if (C107385bE.A04() && !A00) {
                NotificationManager A0A = r14.A0A();
                C626936e.A06(A0A);
                A0A.createNotificationChannelGroup(new NotificationChannelGroup("channel_group_chats", context.getString(R.string.f11nameremoved)));
                NotificationChannel notificationChannel = new NotificationChannel("critical_app_alerts@1", context.getString(R.string.f11nameremoved), 4);
                notificationChannel.setLockscreenVisibility(0);
                notificationChannel.setShowBadge(true);
                A0A.createNotificationChannel(notificationChannel);
                NotificationChannel notificationChannel2 = new NotificationChannel("chat_history_backup@1", context.getString(R.string.f11nameremoved), 2);
                notificationChannel2.setLockscreenVisibility(0);
                notificationChannel2.setShowBadge(false);
                A0A.createNotificationChannel(notificationChannel2);
                NotificationChannel notificationChannel3 = new NotificationChannel("failure_notifications@1", context.getString(R.string.f11nameremoved), 3);
                notificationChannel3.setLockscreenVisibility(0);
                notificationChannel3.setShowBadge(true);
                A0A.createNotificationChannel(notificationChannel3);
                NotificationChannel notificationChannel4 = new NotificationChannel("media_playback@1", context.getString(R.string.f11nameremoved), 2);
                notificationChannel4.setLockscreenVisibility(0);
                notificationChannel4.setShowBadge(false);
                A0A.createNotificationChannel(notificationChannel4);
                NotificationChannel notificationChannel5 = new NotificationChannel("other_notifications@1", context.getString(R.string.f11nameremoved), 2);
                notificationChannel5.setLockscreenVisibility(0);
                notificationChannel5.setShowBadge(false);
                A0A.createNotificationChannel(notificationChannel5);
                NotificationChannel notificationChannel6 = new NotificationChannel("sending_media@1", context.getString(R.string.f11nameremoved), 2);
                notificationChannel6.setLockscreenVisibility(0);
                notificationChannel6.setShowBadge(false);
                A0A.createNotificationChannel(notificationChannel6);
                Set set = A01;
                set.add("critical_app_alerts@1");
                set.add("chat_history_backup@1");
                set.add("failure_notifications@1");
                set.add("media_playback@1");
                set.add("other_notifications@1");
                set.add("sending_media@1");
                Log.d("StaticNotificationChannels/createStaticNotificationChannels created");
                A00 = true;
            }
        }
    }
}
