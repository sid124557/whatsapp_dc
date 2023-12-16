package X;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.69G  reason: invalid class name */
public class AnonymousClass69G implements MenuItem.OnMenuItemClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass69G(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        AnonymousClass5XA r7;
        C89644eZ r6;
        UserJid userJid;
        boolean z;
        switch (this.A03) {
            case 0:
                r7 = (AnonymousClass5XA) this.A00;
                r6 = (C89644eZ) this.A01;
                userJid = (UserJid) this.A02;
                z = true;
                break;
            case 1:
                r7 = (AnonymousClass5XA) this.A00;
                r6 = (C89644eZ) this.A01;
                userJid = (UserJid) this.A02;
                z = false;
                break;
            default:
                Intent intent = (Intent) this.A00;
                ActivityInfo activityInfo = ((ResolveInfo) this.A01).activityInfo;
                C18320x8.A10(intent, activityInfo.packageName, activityInfo.name);
                ((C89704el) this.A02).startActivityForResult(intent, 91);
                return false;
        }
        C162457s7.A0J(userJid, 2);
        try {
            r6.startActivityForResult(r7.A06.A02(r7.A02.A0A(userJid), userJid, z), 10);
            r7.A05.A03(z, 8);
            return true;
        } catch (ActivityNotFoundException e) {
            Log.e("BaseMemberContextMenuHelper/startAddOrEditContact Exception while launching add to contacts", e);
            r7.A00.A0H(R.string.f11nameremoved, 0);
            return true;
        }
    }
}
