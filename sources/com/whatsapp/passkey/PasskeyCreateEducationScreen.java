package com.whatsapp.passkey;

import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass36l;
import X.AnonymousClass4BG;
import X.AnonymousClass4BH;
import X.AnonymousClass4HY;
import X.AnonymousClass5OE;
import X.C107635bd;
import X.C107695bk;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C633939b;
import X.C64333Db;
import X.C69263Wi;
import X.C85474Gj;
import X.C88834as;
import X.C89644eZ;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class PasskeyCreateEducationScreen extends C89644eZ {
    public AnonymousClass4BG A00;
    public AnonymousClass5OE A01;
    public AnonymousClass4BH A02;
    public C85474Gj A03;
    public boolean A04;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        TextView A0L = C18310x6.A0L(this, R.id.passkey_create_screen_title);
        A0L.setText(R.string.f11nameremoved);
        A0L.setGravity(1);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.passkey_create_screen_info_text);
        C162457s7.A0H(textEmojiLabel);
        AnonymousClass1VX r9 = this.A0D;
        C69263Wi r6 = this.A05;
        C107635bd.A0E(this, Uri.parse("https://faq.whatsapp.com/5064231857013976"), this.A00, r6, textEmojiLabel, this.A08, r9, getString(R.string.f11nameremoved), "passkeys_learn_more_uri");
        textEmojiLabel.setGravity(1);
        C633939b.A00(C18290x4.A0L(this, R.id.passkey_create_screen_create_button), this, 0);
        AnonymousClass1Ha.A1p(this, R.id.passkey_create_screen_skip_button_view_stub).A06(0);
        C633939b.A00(C18290x4.A0L(this, R.id.skip_passkey_create_button), this, 1);
        AnonymousClass4BH r0 = this.A02;
        if (r0 != null) {
            AnonymousClass5OE B06 = r0.B06(1);
            this.A01 = B06;
            B06.A00((Throwable) null, 20);
            return;
        }
        throw C18270x1.A0S("passkeyLoggerFactory");
    }

    public Dialog onCreateDialog(int i) {
        if (i == 1) {
            ProgressDialog A06 = AnonymousClass36l.A06(this, getString(R.string.f11nameremoved));
            C162457s7.A0H(A06);
            return A06;
        }
        Dialog onCreateDialog = super.onCreateDialog(i);
        C162457s7.A0D(onCreateDialog);
        return onCreateDialog;
    }

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r1 = A0I.A4Z;
            AnonymousClass1Hf.A2G(r1, this);
            C107695bk r0 = r1.A00;
            AnonymousClass1Ha.A23(r1, r0, r0, this);
            AnonymousClass1Ha.A24(r1, this);
            this.A00 = (AnonymousClass4BG) A0I.A43.get();
            this.A02 = (AnonymousClass4BH) A0I.A44.get();
        }
    }

    public PasskeyCreateEducationScreen(int i) {
        this.A04 = false;
        AnonymousClass4HY.A00(this, 85);
    }

    public PasskeyCreateEducationScreen() {
        this(0);
    }
}
