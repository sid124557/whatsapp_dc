package com.whatsapp.payments.ui.compliance;

import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass26D;
import X.AnonymousClass4HQ;
import X.AnonymousClass4I9;
import X.AnonymousClass4TJ;
import X.AnonymousClass5X8;
import X.AnonymousClass94W;
import X.C08310eF;
import X.C106715a2;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18310x6;
import X.C58422vE;
import X.C617932g;
import X.C620633i;
import X.C620733j;
import X.C626936e;
import X.C633939b;
import X.C69923Ze;
import X.C85814Hs;
import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.base.WaFragment;
import com.whatsapp.payments.ui.P2mLiteConfirmDateOfBirthBottomSheetFragment;
import com.whatsapp.wds.components.button.WDSButton;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class ConfirmDateOfBirthBottomSheetFragment extends WaFragment {
    public ProgressBar A00;
    public TextEmojiLabel A01;
    public WaEditText A02;
    public AnonymousClass5X8 A03;
    public C620633i A04;
    public C620733j A05;
    public AnonymousClass1VX A06;
    public C617932g A07;
    public C106715a2 A08;
    public WDSButton A09;
    public Calendar A0A;
    public final DatePickerDialog.OnDateSetListener A0B = new AnonymousClass26D(this, 1);

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LayoutInflater layoutInflater2 = layoutInflater;
        C162457s7.A0J(layoutInflater2, 0);
        View A0I = C18310x6.A0I(layoutInflater2, viewGroup, R.layout.f8nameremoved, false);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C18280x3.A0E(A0I, R.id.confirm_dob_desc_view);
        C162457s7.A0J(textEmojiLabel, 0);
        this.A01 = textEmojiLabel;
        ProgressBar progressBar = (ProgressBar) C18280x3.A0E(A0I, R.id.loading_progress);
        C162457s7.A0J(progressBar, 0);
        this.A00 = progressBar;
        WaEditText waEditText = (WaEditText) C18280x3.A0E(A0I, R.id.dob_edit_view);
        C162457s7.A0J(waEditText, 0);
        this.A02 = waEditText;
        WDSButton wDSButton = (WDSButton) C18280x3.A0E(A0I, R.id.continue_btn);
        C162457s7.A0J(wDSButton, 0);
        this.A09 = wDSButton;
        A1I().setInputType(0);
        A1I().setFocusable(false);
        TextEmojiLabel textEmojiLabel2 = this.A01;
        if (textEmojiLabel2 != null) {
            C620633i r1 = this.A04;
            if (r1 != null) {
                textEmojiLabel2.setAccessibilityHelper(new AnonymousClass4TJ(textEmojiLabel2, r1));
                TextEmojiLabel textEmojiLabel3 = this.A01;
                if (textEmojiLabel3 != null) {
                    AnonymousClass1VX r0 = this.A06;
                    if (r0 != null) {
                        AnonymousClass0x2.A14(r0, textEmojiLabel3);
                        TextEmojiLabel textEmojiLabel4 = this.A01;
                        if (textEmojiLabel4 != null) {
                            P2mLiteConfirmDateOfBirthBottomSheetFragment p2mLiteConfirmDateOfBirthBottomSheetFragment = (P2mLiteConfirmDateOfBirthBottomSheetFragment) this;
                            C106715a2 r8 = p2mLiteConfirmDateOfBirthBottomSheetFragment.A08;
                            if (r8 != null) {
                                Context A1D = p2mLiteConfirmDateOfBirthBottomSheetFragment.A1D();
                                String string = C08310eF.A09(p2mLiteConfirmDateOfBirthBottomSheetFragment).getString(R.string.f11nameremoved);
                                String[] strArr = {"p2m-lite-desc-link"};
                                String[] strArr2 = new String[1];
                                AnonymousClass5X8 r7 = p2mLiteConfirmDateOfBirthBottomSheetFragment.A03;
                                if (r7 != null) {
                                    AnonymousClass1VX r6 = p2mLiteConfirmDateOfBirthBottomSheetFragment.A06;
                                    if (r6 != null) {
                                        String A0R = r6.A0R(C58422vE.A02, 2701);
                                        C626936e.A06(A0R);
                                        strArr2[0] = r7.A00(A0R).toString();
                                        textEmojiLabel4.setText(r8.A04(A1D, string, new Runnable[]{new C69923Ze(p2mLiteConfirmDateOfBirthBottomSheetFragment)}, strArr, strArr2));
                                        C08310eF r4 = this.A0E;
                                        Calendar calendar = this.A0A;
                                        calendar.set(1, calendar.get(1) - 18);
                                        AnonymousClass94W r62 = new AnonymousClass94W(this.A0B, A0G(), calendar.get(1), calendar.get(2), calendar.get(5));
                                        r62.A04().setMaxDate(calendar.getTimeInMillis());
                                        C85814Hs.A00(A1I(), r62, 6);
                                        A1I().addTextChangedListener(new AnonymousClass4HQ(this, 5));
                                        A1K(A1L(String.valueOf(A1I().getText())));
                                        WDSButton wDSButton2 = this.A09;
                                        if (wDSButton2 != null) {
                                            C633939b.A00(wDSButton2, this, 6);
                                            C18280x3.A0E(A0I, R.id.close_btn).setOnClickListener(new AnonymousClass4I9(r4, 1, this));
                                            return A0I;
                                        }
                                        throw C18270x1.A0S("continueButton");
                                    }
                                    throw C18270x1.A0R();
                                }
                                throw C18270x1.A0S("waLinkFactory");
                            }
                            throw C18270x1.A0S("linkifier");
                        }
                        throw C18270x1.A0S("descText");
                    }
                    throw C18270x1.A0R();
                }
                throw C18270x1.A0S("descText");
            }
            throw C18270x1.A0S("systemServices");
        }
        throw C18270x1.A0S("descText");
    }

    public abstract void A1J(Integer num, String str, String str2, int i);

    public final WaEditText A1I() {
        WaEditText waEditText = this.A02;
        if (waEditText != null) {
            return waEditText;
        }
        throw C18270x1.A0S("dobEditText");
    }

    public final void A1K(boolean z) {
        WDSButton wDSButton = this.A09;
        if (wDSButton != null) {
            wDSButton.setEnabled(z);
            return;
        }
        throw C18270x1.A0S("continueButton");
    }

    public ConfirmDateOfBirthBottomSheetFragment() {
        Calendar instance = Calendar.getInstance();
        C162457s7.A0D(instance);
        this.A0A = instance;
    }

    public final boolean A1L(String str) {
        int length = str.length();
        if (length != 0) {
            if (length <= 0) {
                return true;
            }
            C620733j r0 = this.A05;
            if (r0 != null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", C620733j.A02(r0));
                simpleDateFormat.setLenient(false);
                try {
                    simpleDateFormat.parse(str);
                    return true;
                } catch (ParseException unused) {
                }
            } else {
                throw C18270x1.A0S("whatsAppLocale");
            }
        }
        return false;
    }
}
