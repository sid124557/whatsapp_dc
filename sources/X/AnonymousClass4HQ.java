package X;

import android.text.Editable;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageButton;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.group.ui.GroupJoinRequestReasonBottomSheetFragment;
import com.whatsapp.payments.ui.compliance.ConfirmDateOfBirthBottomSheetFragment;
import com.whatsapp.payments.ui.compliance.ConfirmLegalNameBottomSheetFragment;
import com.whatsapp.settings.SettingsSetupUserProxyActivity;
import com.whatsapp.settings.SettingsSetupUserProxyViewModel;
import com.whatsapp.twofactor.SetEmailFragment;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4HQ  reason: invalid class name */
public class AnonymousClass4HQ extends C166677z5 {
    public Object A00;
    public final int A01;

    public AnonymousClass4HQ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void afterTextChanged(Editable editable) {
        Editable text;
        String obj;
        String string;
        switch (this.A01) {
            case 1:
                AnonymousClass1Np r3 = (AnonymousClass1Np) this.A00;
                C107345b9.A07(r3.A08.getContext(), r3.A08.getPaint(), editable, r3.A0C);
                r3.A75((String) null);
                return;
            case 3:
                if (editable != null) {
                    SearchFunStickersBottomSheet searchFunStickersBottomSheet = (SearchFunStickersBottomSheet) this.A00;
                    String obj2 = editable.toString();
                    WaEditText waEditText = searchFunStickersBottomSheet.A08;
                    if (waEditText != null) {
                        if (obj2.length() > 0) {
                            string = "";
                        } else {
                            string = C08310eF.A09(searchFunStickersBottomSheet).getString(R.string.f11nameremoved);
                        }
                        waEditText.setHint(string);
                    }
                    WaImageButton waImageButton = searchFunStickersBottomSheet.A09;
                    if (waImageButton != null) {
                        int i = 0;
                        if (obj2 == null || obj2.length() == 0) {
                            i = 8;
                        }
                        waImageButton.setVisibility(i);
                    }
                    if (SearchFunStickersBottomSheet.A02(obj2)) {
                        String str = searchFunStickersBottomSheet.A0R;
                        if (str != null) {
                            String str2 = null;
                            String A002 = AnonymousClass2AB.A00(str);
                            WaEditText waEditText2 = searchFunStickersBottomSheet.A08;
                            if (!(waEditText2 == null || (text = waEditText2.getText()) == null || (obj = text.toString()) == null)) {
                                str2 = AnonymousClass2AB.A00(obj);
                            }
                            if (C162457s7.A0P(A002, str2)) {
                                return;
                            }
                        }
                        searchFunStickersBottomSheet.A1e(true);
                        return;
                    }
                    C18300x5.A0O(searchFunStickersBottomSheet).A0I(false);
                    return;
                }
                return;
            case 4:
                C162457s7.A0J(editable, 0);
                GroupJoinRequestReasonBottomSheetFragment groupJoinRequestReasonBottomSheetFragment = (GroupJoinRequestReasonBottomSheetFragment) this.A00;
                String A0B = C107635bd.A0B(editable.toString(), false);
                C162457s7.A0D(A0B);
                groupJoinRequestReasonBottomSheetFragment.A09 = A0B;
                WDSButton wDSButton = groupJoinRequestReasonBottomSheetFragment.A08;
                if (wDSButton != null) {
                    C620633i r1 = groupJoinRequestReasonBottomSheetFragment.A03;
                    if (r1 != null) {
                        C60152y5 r0 = groupJoinRequestReasonBottomSheetFragment.A07;
                        if (r0 != null) {
                            wDSButton.setEnabled(C107635bd.A0P(r1, r0, A0B));
                            return;
                        }
                        throw C18270x1.A0S("sharedPreferencesFactory");
                    }
                    throw C18270x1.A0S("systemServices");
                }
                return;
            case 7:
                C162457s7.A0J(editable, 0);
                String A003 = AnonymousClass2AB.A00(editable.toString());
                SettingsSetupUserProxyViewModel settingsSetupUserProxyViewModel = (SettingsSetupUserProxyViewModel) ((SettingsSetupUserProxyActivity) this.A00).A05.getValue();
                C162457s7.A0J(A003, 0);
                if (!A003.equals(settingsSetupUserProxyViewModel.A0D().A03)) {
                    settingsSetupUserProxyViewModel.A0E(C385528d.A01(A003, settingsSetupUserProxyViewModel.A0D().A00, settingsSetupUserProxyViewModel.A0D().A01, settingsSetupUserProxyViewModel.A0D().A06));
                    return;
                }
                return;
            case 8:
                String trim = editable.toString().trim();
                SetEmailFragment setEmailFragment = (SetEmailFragment) this.A00;
                int i2 = setEmailFragment.A00;
                if (i2 == 1) {
                    setEmailFragment.A07.A04 = trim;
                } else if (i2 == 2) {
                    setEmailFragment.A04.setText("");
                    setEmailFragment.A07.A05 = trim;
                }
                setEmailFragment.A1J();
                return;
            default:
                super.afterTextChanged(editable);
                return;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.A01) {
            case 0:
                C162457s7.A0J(charSequence, 0);
                ((AnonymousClass4GQ) this.A00).invoke(charSequence);
                return;
            case 2:
                C18320x8.A0L((ExpressionsKeyboardSearchBottomSheet) this.A00).A0E(String.valueOf(charSequence));
                return;
            case 5:
                C162457s7.A0J(charSequence, 0);
                ConfirmDateOfBirthBottomSheetFragment confirmDateOfBirthBottomSheetFragment = (ConfirmDateOfBirthBottomSheetFragment) this.A00;
                confirmDateOfBirthBottomSheetFragment.A1K(confirmDateOfBirthBottomSheetFragment.A1L(charSequence.toString()));
                return;
            case 6:
                C162457s7.A0J(charSequence, 0);
                ((ConfirmLegalNameBottomSheetFragment) this.A00).A1L(AnonymousClass001.A1W(charSequence.length()));
                return;
            default:
                super.onTextChanged(charSequence, i, i2, i3);
                return;
        }
    }
}
