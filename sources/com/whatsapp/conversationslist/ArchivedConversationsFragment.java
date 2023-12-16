package com.whatsapp.conversationslist;

import X.AnonymousClass0x2;
import X.C003203q;
import X.C18280x3;
import X.C18290x4;
import X.C18320x8;
import X.C86604Kt;
import X.C86614Ku;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

public class ArchivedConversationsFragment extends Hilt_ArchivedConversationsFragment {
    public View A00;

    public void A0y(Menu menu, MenuInflater menuInflater) {
        if (!this.A1k.A28() || this.A0j.A0Y()) {
            super.A0y(menu, menuInflater);
        } else {
            menu.add(1, R.id.menuitem_archive_chat_notifications, 0, R.string.f11nameremoved);
        }
    }

    public boolean A1B(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_archive_chat_notifications) {
            return super.A1B(menuItem);
        }
        C003203q A0Q = A0Q();
        if (A0Q == null) {
            return true;
        }
        A0m(C18320x8.A07().setClassName(A0Q.getPackageName(), "com.whatsapp.conversationslist.ArchiveNotificationSettingActivity"));
        return true;
    }

    public void A1S() {
        super.A1S();
        if (this.A1K.A01() == 0) {
            A0R().finish();
        }
    }

    public void A1V() {
        super.A1V();
        C86604Kt.A1A(this.A00);
        if (this.A1k.A28() && !this.A0j.A0Y()) {
            if (this.A00 == null) {
                View A1t = A1t(R.layout.f8nameremoved);
                this.A00 = A1t;
                C18290x4.A1G(A1t, this, 24);
            }
            TextView A0I = C86614Ku.A0I(this.A00);
            boolean A1W = C18280x3.A1W(AnonymousClass0x2.A0F(this.A1k), "notify_new_message_for_archived_chats");
            int i = R.string.f11nameremoved;
            if (A1W) {
                i = R.string.f11nameremoved;
            }
            A0I.setText(i);
            this.A00.setVisibility(0);
        }
    }
}
