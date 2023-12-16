package com.whatsapp.payments.ui;

import X.AnonymousClass002;
import X.AnonymousClass1VX;
import X.AnonymousClass97g;
import X.AnonymousClass9W1;
import X.C107635bd;
import X.C111095hX;
import X.C18270x1;
import X.C18310x6;
import X.C197219cl;
import X.C203139nB;
import X.C203499no;
import X.C204249p3;
import X.C204659pi;
import X.C620633i;
import X.C626936e;
import X.C69263Wi;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

public class BrazilAccountRecoveryPinActivity extends AnonymousClass97g {
    public TextView A00;
    public CodeInputField A01;
    public C203499no A02;
    public C203139nB A03;
    public AnonymousClass9W1 A04;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass1VX r12 = this.A0D;
        C69263Wi r9 = this.A05;
        C111095hX r8 = this.A00;
        C620633i r11 = this.A08;
        String A0F = AnonymousClass002.A0F(this, "learn-more", new Object[1], 0, R.string.f11nameremoved);
        C107635bd.A0E(this, Uri.parse("https://faq.whatsapp.com/general/payments/about-payments-data"), r8, r9, (TextEmojiLabel) findViewById(R.id.subtitle), r11, r12, A0F, "learn-more");
        this.A00 = C18310x6.A0L(this, R.id.pin_error_text);
        CodeInputField codeInputField = (CodeInputField) findViewById(R.id.code);
        this.A01 = codeInputField;
        codeInputField.A0B(new C204659pi(this, 1), 6, getResources().getColor(R.color.f5nameremoved));
        ((NumberEntryKeyboard) findViewById(R.id.number_entry_keyboard)).A06 = this.A01;
        C204249p3.A02(findViewById(R.id.account_recovery_skip), this, 15);
        this.A03 = new C197219cl(this, (PinBottomSheetDialogFragment) null, this.A04, true, false);
        C18270x1.A0l(this.A09.A0U(), "payments_account_recovery_screen_shown", true);
        C203499no r1 = this.A02;
        C626936e.A06(r1);
        r1.BKB(0, (Integer) null, "recover_payments_registration", "wa_registration");
    }
}
