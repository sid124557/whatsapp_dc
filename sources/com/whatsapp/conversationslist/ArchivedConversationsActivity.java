package com.whatsapp.conversationslist;

import X.AnonymousClass0R2;
import X.AnonymousClass0x2;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass33p;
import X.AnonymousClass34K;
import X.AnonymousClass3DZ;
import X.AnonymousClass4FS;
import X.AnonymousClass4HY;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZC;
import X.C08240dc;
import X.C107405bG;
import X.C107695bk;
import X.C117155rT;
import X.C18280x3;
import X.C56382rt;
import X.C58152un;
import X.C64333Db;
import X.C89644eZ;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;

public class ArchivedConversationsActivity extends C89644eZ {
    public C56382rt A00;
    public boolean A01;

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A00 = (C56382rt) A002.AU4.get();
        }
    }

    public ArchivedConversationsActivity(int i) {
        this.A01 = false;
        AnonymousClass4HY.A00(this, 54);
    }

    public AnonymousClass5ZC BCP() {
        return C58152un.A02;
    }

    public void Bdh(AnonymousClass0R2 r2) {
        super.Bdh(r2);
        C107405bG.A07(this, AnonymousClass34K.A00(this));
    }

    public void Bdi(AnonymousClass0R2 r3) {
        super.Bdi(r3);
        C107405bG.A07(this, AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean A28 = this.A09.A28();
        int i = R.string.f11nameremoved;
        if (A28) {
            i = R.string.f11nameremoved;
        }
        AnonymousClass1Ha.A1l(this, i).A0N(true);
        setContentView((int) R.layout.f8nameremoved);
        if (bundle == null) {
            C08240dc A0J = AnonymousClass0x2.A0J(this);
            A0J.A09(new ArchivedConversationsFragment(), R.id.container);
            A0J.A01();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        AnonymousClass4FS r4 = this.A04;
        C56382rt r3 = this.A00;
        AnonymousClass33p r2 = this.A09;
        if (r2.A28() && !C18280x3.A1W(AnonymousClass0x2.A0F(r2), "notify_new_message_for_archived_chats")) {
            r4.BkM(new C117155rT(r2, 19, r3));
        }
    }

    public ArchivedConversationsActivity() {
        this(0);
    }
}
