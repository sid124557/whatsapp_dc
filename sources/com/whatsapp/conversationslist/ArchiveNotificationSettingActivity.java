package com.whatsapp.conversationslist;

import X.AnonymousClass0R8;
import X.AnonymousClass0x2;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass34K;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C005205m;
import X.C107695bk;
import X.C109355eU;
import X.C18260x0;
import X.C18280x3;
import X.C622334f;
import X.C64333Db;
import X.C85854Hw;
import X.C89644eZ;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.components.WaSwitchView;

public class ArchiveNotificationSettingActivity extends C89644eZ {
    public C622334f A00;
    public boolean A01;

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A00 = (C622334f) A002.A0v.get();
        }
    }

    public ArchiveNotificationSettingActivity(int i) {
        this.A01 = false;
        AnonymousClass4HY.A00(this, 53);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
        }
        setContentView((int) R.layout.f8nameremoved);
        setTitle(R.string.f11nameremoved);
        Toolbar toolbar = (Toolbar) C005205m.A00(this, R.id.toolbar);
        C18260x0.A0E(this, getResources(), toolbar, this.A00, R.drawable.ic_back);
        toolbar.setTitle((CharSequence) getString(R.string.f11nameremoved));
        toolbar.setBackgroundResource(AnonymousClass34K.A00(this));
        toolbar.A0J(this, R.style.f12nameremoved);
        toolbar.setNavigationOnClickListener(new C109355eU(this, 21));
        setSupportActionBar(toolbar);
        WaSwitchView waSwitchView = (WaSwitchView) C005205m.A00(this, R.id.notify_new_message_switch_view);
        waSwitchView.setChecked(true ^ C18280x3.A1W(AnonymousClass0x2.A0F(this.A09), "notify_new_message_for_archived_chats"));
        waSwitchView.setOnCheckedChangeListener(new C85854Hw(this, 1));
        waSwitchView.setOnClickListener(new C109355eU(waSwitchView, 22));
        WaSwitchView waSwitchView2 = (WaSwitchView) C005205m.A00(this, R.id.auto_hide_switch_view);
        waSwitchView2.setChecked(C18280x3.A1W(AnonymousClass1Hf.A27(this), "auto_archive_inactive_chats"));
        waSwitchView2.setOnCheckedChangeListener(new C85854Hw(this, 2));
        waSwitchView2.setOnClickListener(new C109355eU(waSwitchView2, 23));
        waSwitchView2.setVisibility(8);
    }

    public ArchiveNotificationSettingActivity() {
        this(0);
    }
}
