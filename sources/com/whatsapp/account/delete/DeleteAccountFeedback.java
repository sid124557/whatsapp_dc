package com.whatsapp.account.delete;

import X.AnonymousClass002;
import X.AnonymousClass0x7;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3AC;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C05430Th;
import X.C08310eF;
import X.C107695bk;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C19340zH;
import X.C628436y;
import X.C64333Db;
import X.C70043Zq;
import X.C85784Hp;
import X.C85804Hr;
import X.C85874Hy;
import X.C89644eZ;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;

public class DeleteAccountFeedback extends C89644eZ {
    public static final int[] A09 = {R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved};
    public int A00;
    public int A01;
    public View A02;
    public EditText A03;
    public ScrollView A04;
    public C05430Th A05;
    public DialogFragment A06;
    public boolean A07;
    public boolean A08;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        AnonymousClass1Hf.A2E(this);
        setContentView((int) R.layout.f8nameremoved);
        this.A04 = (ScrollView) findViewById(R.id.scroll_view);
        this.A03 = (EditText) findViewById(R.id.delete_reason_additional_comments_edittext);
        this.A02 = findViewById(R.id.bottom_button_container);
        TextView A0L = C18310x6.A0L(this, R.id.select_delete_reason);
        A0L.setBackground(AnonymousClass0x7.A0J(this, this.A00, R.drawable.abc_spinner_textfield_background_material));
        this.A00 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        if (bundle != null) {
            this.A01 = bundle.getInt("delete_reason_selected", -1);
            this.A07 = bundle.getBoolean("delete_reason_showing", false);
            EditText editText = this.A03;
            int i = this.A01;
            int i2 = R.string.f11nameremoved;
            if (i == 2) {
                i2 = R.string.f11nameremoved;
            }
            editText.setHint(i2);
        }
        int i3 = this.A01;
        int[] iArr = A09;
        int length = iArr.length;
        if (i3 >= length || i3 < 0) {
            A0L.setText("");
        } else {
            A0L.setText(iArr[i3]);
        }
        this.A05 = new C05430Th(this, findViewById(R.id.delete_reason_prompt), 0, R.attr.f3nameremoved, 0);
        for (int i4 = 0; i4 < length; i4++) {
            this.A05.A04.add(0, i4, 0, iArr[i4]);
        }
        C05430Th r1 = this.A05;
        r1.A00 = new AnonymousClass3AC(this);
        r1.A01 = new C85784Hp(A0L, 0, this);
        C18280x3.A0p(A0L, this, 28);
        C18280x3.A0p(findViewById(R.id.delete_account_submit), this, 29);
        this.A00.post(new C70043Zq(this, 24));
        this.A00 = C18320x8.A00(this, R.dimen.f6nameremoved);
        this.A04.getViewTreeObserver().addOnScrollChangedListener(new C85874Hy(this, 1));
        AnonymousClass1Ha.A1y(this.A04.getViewTreeObserver(), this, 1);
    }

    public class ChangeNumberMessageDialogFragment extends Hilt_DeleteAccountFeedback_ChangeNumberMessageDialogFragment {
        public Dialog A1J(Bundle bundle) {
            int i = A0H().getInt("deleteReason", -1);
            String string = A0H().getString("additionalComments");
            C19340zH A0L = C18300x5.A0L(this);
            A0L.A0Q(AnonymousClass0x7.A0m(this, C08310eF.A09(this).getString(R.string.f11nameremoved), AnonymousClass002.A0L(), R.string.f11nameremoved));
            C85804Hr.A01(A0L, this, 19, R.string.f11nameremoved);
            A0L.setNegativeButton(R.string.f11nameremoved, new C628436y(this, string, i));
            return A0L.create();
        }
    }

    public void A5r() {
        if (!this.A08) {
            this.A08 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("delete_reason_selected", this.A01);
        bundle.putBoolean("delete_reason_showing", this.A07);
        super.onSaveInstanceState(bundle);
    }

    public DeleteAccountFeedback(int i) {
        this.A08 = false;
        AnonymousClass4HY.A00(this, 8);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass1Ha.A1y(this.A04.getViewTreeObserver(), this, 1);
    }

    public void onStop() {
        super.onStop();
        C05430Th r1 = this.A05;
        if (r1 != null) {
            r1.A00 = null;
            r1.A05.A01();
        }
    }

    public DeleteAccountFeedback() {
        this(0);
        this.A01 = -1;
        this.A07 = false;
    }
}
