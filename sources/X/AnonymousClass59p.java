package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.jid.Jid;
import com.whatsapp.mentions.MentionableEntry;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.59p  reason: invalid class name */
public class AnonymousClass59p {
    public static Intent A00(Activity activity, C48682fI r6, MentionableEntry mentionableEntry, C624134x r8, File file, List list) {
        Uri fromFile = Uri.fromFile(AnonymousClass002.A0B(file.getAbsolutePath()));
        ArrayList A0s = C18300x5.A0s(fromFile);
        String stringText = mentionableEntry.getStringText();
        AnonymousClass5YF r2 = new AnonymousClass5YF(fromFile);
        r2.A0G(stringText);
        r6.A01(r2.A0C(), mentionableEntry.getMentions());
        r2.A0I(r2.A0C());
        C106105Xq r3 = new C106105Xq(r2);
        AnonymousClass5PE r22 = new AnonymousClass5PE(activity);
        r22.A0G = A0s;
        r22.A02 = 9;
        r22.A0K = true;
        AnonymousClass5PE.A00(r3, r22);
        if (list.size() == 1) {
            r22.A0C = C627336j.A07((Jid) C18290x4.A0k(list));
        } else {
            r22.A0F = C627336j.A0A(list);
        }
        if (r8 != null) {
            r22.A06 = r8.A1L;
            r22.A0D = C627336j.A07(C627636p.A05(r8));
        }
        return r22.A01();
    }
}
