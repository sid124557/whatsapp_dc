package com.whatsapp.migration.transfer.ui;

import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass0x7;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass2HG;
import X.AnonymousClass2T5;
import X.AnonymousClass3R8;
import X.AnonymousClass3R9;
import X.AnonymousClass48J;
import X.AnonymousClass4FS;
import X.AnonymousClass4HY;
import X.C06270Wx;
import X.C107695bk;
import X.C18260x0;
import X.C18280x3;
import X.C183538qC;
import X.C28341gh;
import X.C50132hg;
import X.C50152hi;
import X.C50382i5;
import X.C50592iR;
import X.C51852kU;
import X.C54292oU;
import X.C55092pm;
import X.C55112po;
import X.C58422vE;
import X.C64333Db;
import X.C70023Zo;
import X.C70113Zy;
import X.C72343dZ;
import X.C835848z;
import X.C85664Hd;
import X.C88834as;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class ChatTransferActivity extends C28341gh implements C835848z, AnonymousClass48J {
    public C50382i5 A00;
    public C54292oU A01;
    public C55112po A02;
    public ChatTransferViewModel A03;
    public C51852kU A04;
    public C50152hi A05;
    public C55092pm A06;
    public C183538qC A07;
    public boolean A08;

    public void A5r() {
        if (!this.A08) {
            this.A08 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r2 = A0I.A4Z;
            AnonymousClass1Hf.A2G(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass1Ha.A23(r2, r1, r1, this);
            AnonymousClass1Ha.A24(r2, this);
            this.A0B = C18280x3.A0Q(r1);
            this.A08 = C64333Db.A2r(r2);
            this.A07 = C18280x3.A0L(r1);
            this.A00 = (C50382i5) r2.AZG.get();
            this.A01 = C64333Db.A2q(r2);
            this.A02 = (C55112po) r1.A75.get();
            this.A05 = A0I.AD3();
            this.A04 = (C51852kU) r1.A7u.get();
            this.A06 = (C55092pm) r2.AZm.get();
            this.A07 = C72343dZ.A00(r1.A7v);
        }
    }

    public final void A7C() {
        int A082 = this.A07.A08(true);
        ChatTransferViewModel chatTransferViewModel = this.A03;
        if (A082 == 0) {
            C06270Wx.A03(chatTransferViewModel.A0C, 10);
            return;
        }
        AnonymousClass0x7.A18(chatTransferViewModel.A0E);
        if (!chatTransferViewModel.A06) {
            C70023Zo.A00(chatTransferViewModel.A0Z, chatTransferViewModel, 24);
        }
        if (!chatTransferViewModel.A06) {
            return;
        }
        if (chatTransferViewModel.A08) {
            String str = chatTransferViewModel.A05;
            if (str != null) {
                chatTransferViewModel.A0M(str);
            } else {
                chatTransferViewModel.A0F();
            }
        } else {
            C50592iR r5 = chatTransferViewModel.A0T;
            AnonymousClass2HG r7 = new AnonymousClass2HG(chatTransferViewModel);
            if (r5.A06.A2P("chat_transfer_intent_to_migrate_last_set_timestamp", 86400000)) {
                C70113Zy r4 = new C70113Zy(r5, 23, r7);
                C70023Zo r0 = new C70023Zo(r5, 13);
                AnonymousClass4FS r3 = r5.A0M;
                new AnonymousClass3R9(new AnonymousClass3R8(r5, r4, r0, true), r5.A0K, r3, true).A00();
                return;
            }
            Log.i("fpm/ExportHelper/prepareForAuthentication()/skipping bc intent to migrate flag set in last 24 hours");
            r5.A0L.A0G();
            r5.A0B.A03(false);
            Log.i("fpm/ExportHelper/disconnectFromServer()/success");
            r7.A00.A0F();
            Log.i("fpm/ExportHelper/prepareForAuthentication()/success");
        }
    }

    public boolean BbZ() {
        Log.i("fpm/ChatTransferActivity/logout received from the server");
        return false;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A0D.A0Y(C58422vE.A02, 3808)) {
            menu.add(0, 0, 0, R.string.f11nameremoved);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!this.A0D.A0Y(C58422vE.A02, 3808) || menuItem.getItemId() != 0) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.A06.A02("chat-transfer");
        this.A05.A01(this, this.A06, "chat-transfer");
        return true;
    }

    public ChatTransferActivity(int i) {
        this.A08 = false;
        AnonymousClass4HY.A00(this, 80);
    }

    public void A78(int i) {
        AnonymousClass2T5 r1;
        super.A78(i);
        if (i != 2) {
            switch (i) {
                case 8:
                    this.A02.A02(0, 0, 0);
                    return;
                case 9:
                    A7C();
                    return;
                case 10:
                    r1 = ChatTransferViewModel.A00();
                    break;
                default:
                    return;
            }
        } else {
            r1 = new AnonymousClass2T5(new C85664Hd(this.A03, 0), R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, true, true);
        }
        A7A(r1);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Toolbar toolbar = (Toolbar) findViewById(R.id.title_toolbar);
        if (!ViewConfiguration.get(this).hasPermanentMenuKey()) {
            setSupportActionBar(toolbar);
            AnonymousClass0R8 supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A0N(false);
                supportActionBar.A0Q(false);
            }
        }
        int A002 = this.A04.A00("chat_transfer_android_to_android_lottie_animation");
        if (A002 == 3 || A002 == 2) {
            this.A04.BkQ(new C70023Zo(this, 21), "fpm/ChatTransferActivity/lottie");
            return;
        }
        C18260x0.A0w("fpm/ChatTransferActivity/downloading-lottie-on-demand/", AnonymousClass001.A0o(), A002);
        ((C50132hg) this.A07.get()).A00(this, "chat_transfer_android_to_android_lottie_animation");
    }

    public void onResume() {
        super.onResume();
        Number number = (Number) this.A09.A0C.A07();
        if (number != null && number.intValue() == 10) {
            A7C();
        }
    }

    public ChatTransferActivity() {
        this(0);
    }
}
