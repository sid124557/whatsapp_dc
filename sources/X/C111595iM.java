package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.5iM  reason: invalid class name and case insensitive filesystem */
public final class C111595iM implements AnonymousClass66U {
    public final C97154xi A00;

    public C111595iM(C97154xi r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public String BDW() {
        return "SplitWindowAsyncInit";
    }

    public void BMd() {
        C97154xi r4 = this.A00;
        if (r4.A0E()) {
            Context context = r4.A03;
            String packageName = context.getPackageName();
            C162457s7.A0D(packageName);
            Set A05 = C73833g9.A05("com.whatsapp.HomeActivity", "com.whatsapp.Conversation", "com.whatsapp.home.ui.HomePlaceholderActivity");
            if (C18270x1.A1V(r4.A07)) {
                A05.add("com.whatsapp.chatinfo.ContactInfoActivity");
                A05.add("com.whatsapp.group.GroupChatInfoActivity");
                A05.add("com.whatsapp.chatinfo.ListChatInfoActivity");
                A05.add("com.whatsapp.newsletter.NewsletterInfoActivity");
                A05.add("com.whatsapp.gallery.MediaGalleryActivity");
            }
            if (C18270x1.A1V(r4.A09)) {
                A05.add("com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity");
                A05.add("com.whatsapp.home.ui.StarredMessagesPlaceholderActivity");
            }
            A05.add("com.whatsapp.conversation.selection.SingleSelectedMessageActivity");
            A05.add("com.whatsapp.conversation.selection.SelectedImageAndVideoAlbumActivity");
            HashSet A0K = AnonymousClass002.A0K();
            try {
                ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(packageName, 1).activities;
                if (activityInfoArr != null) {
                    for (ActivityInfo activityInfo : activityInfoArr) {
                        if (!A05.contains(activityInfo.name)) {
                            A0K.add(new ComponentName(packageName, activityInfo.name));
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("SplitWindowManager/getActivitiesToExpand/ failed to get activities from the packagemanager", e);
            }
            ArrayList A0c = C73783g4.A0c(A0K);
            Iterator it = A0K.iterator();
            while (it.hasNext()) {
                A0c.add(new AnonymousClass0P7((ComponentName) it.next()));
            }
            ((C05850Vf) r4.A0A.getValue()).A01.Bii(new C01350Ag(new C03430Kc(C73723fy.A0P(A0c)).A00));
        }
    }

    public /* synthetic */ void BMe() {
    }
}
