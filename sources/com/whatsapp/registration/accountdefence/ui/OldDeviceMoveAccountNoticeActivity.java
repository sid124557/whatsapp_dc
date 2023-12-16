package com.whatsapp.registration.accountdefence.ui;

import X.AnonymousClass0x2;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass31C;
import X.AnonymousClass33T;
import X.AnonymousClass3DZ;
import X.AnonymousClass47t;
import X.AnonymousClass4HY;
import X.C005205m;
import X.C10240hc;
import X.C106715a2;
import X.C107695bk;
import X.C18280x3;
import X.C28861ht;
import X.C58422vE;
import X.C614930z;
import X.C621533t;
import X.C626936e;
import X.C64333Db;
import X.C71543cH;
import X.C835848z;
import X.C89644eZ;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

public class OldDeviceMoveAccountNoticeActivity extends C89644eZ implements C835848z, AnonymousClass47t {
    public TextEmojiLabel A00;
    public WaImageButton A01;
    public C614930z A02;
    public C10240hc A03;
    public AnonymousClass33T A04;
    public AnonymousClass31C A05;
    public C28861ht A06;
    public C106715a2 A07;
    public WDSButton A08;
    public WDSButton A09;
    public String A0A;
    public boolean A0B;

    public void A5r() {
        if (!this.A0B) {
            this.A0B = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A07 = C18280x3.A0Q(r0);
            this.A06 = (C28861ht) A002.AJH.get();
            this.A05 = C64333Db.A5u(A002);
            this.A04 = (AnonymousClass33T) A002.Aaf.get();
            this.A03 = (C10240hc) A002.AG8.get();
            this.A02 = C64333Db.A0E(A002);
        }
    }

    public OldDeviceMoveAccountNoticeActivity(int i) {
        this.A0B = false;
        AnonymousClass4HY.A00(this, 105);
    }

    public boolean BbZ() {
        BjL();
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("server_token");
        C626936e.A06(stringExtra);
        this.A0A = stringExtra;
        setContentView((int) R.layout.f8nameremoved);
        if (this.A0D.A0Y(C58422vE.A02, 3159)) {
            C005205m.A01(this, R.id.move_button).setText(R.string.f11nameremoved);
        }
        WDSButton wDSButton = (WDSButton) C005205m.A00(this, R.id.stay_button);
        this.A09 = wDSButton;
        AnonymousClass0x2.A10(wDSButton, this, 3);
        WaImageButton waImageButton = (WaImageButton) C005205m.A00(this, R.id.close_button);
        this.A01 = waImageButton;
        AnonymousClass0x2.A10(waImageButton, this, 4);
        WDSButton wDSButton2 = (WDSButton) C005205m.A00(this, R.id.move_button);
        this.A08 = wDSButton2;
        AnonymousClass0x2.A10(wDSButton2, this, 5);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C005205m.A00(this, R.id.backup_description);
        this.A00 = textEmojiLabel;
        SpannableStringBuilder A052 = this.A07.A05(textEmojiLabel.getContext(), new C71543cH((Object) this, 34), getString(R.string.f11nameremoved), "create-backup");
        AnonymousClass0x2.A14(this.A0D, this.A00);
        AnonymousClass0x2.A12(this.A00, this.A08);
        this.A00.setText(A052);
    }

    public void onResume() {
        super.onResume();
        if (this.A06.A00 || C18280x3.A1W(AnonymousClass1Hf.A27(this), "show_post_reg_logged_out_dialog")) {
            Log.i("OldDeviceMoveAccountNoticeActivity/show-login-failed");
            this.A09.A20(false);
            this.A04.A05(20, "OldDeviceMoveAccountNoticeLoginFailed");
            C621533t.A01(this, this.A02, this.A0D);
        }
    }

    public OldDeviceMoveAccountNoticeActivity() {
        this(0);
    }
}
