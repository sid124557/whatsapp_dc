package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass001;
import X.AnonymousClass0Y8;
import X.AnonymousClass0w7;
import X.AnonymousClass34K;
import X.C06560Yg;
import X.C06870Zr;
import X.C06880Zy;
import X.C07070aH;
import X.C08310eF;
import X.C107385bE;
import X.C18150wp;
import X.C620633i;
import X.C620733j;
import X.C626936e;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;

public class EncryptionKeyFragment extends Hilt_EncryptionKeyFragment {
    public int A00;
    public EncBackupViewModel A01;
    public C620633i A02;
    public C620733j A03;
    public CodeInputField[] A04;

    public final void A1K(CodeInputField codeInputField, int i) {
        codeInputField.setEnabled(true);
        codeInputField.setClickable(true);
        codeInputField.setLongClickable(true);
        codeInputField.setOnFocusChangeListener(new C07070aH(this, i));
        codeInputField.addTextChangedListener(new C06870Zr(codeInputField, this));
        codeInputField.setOnKeyListener(new C18150wp(this, 2));
        if (C107385bE.A02()) {
            codeInputField.setCustomInsertionActionModeCallback(new C06880Zy(this));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A02(int i, boolean z) {
        if (z) {
            this.A00 = i;
            if (i > 0) {
                Editable text = this.A04[i - 1].getText();
                C626936e.A06(text);
                if (text.length() < 4) {
                    this.A04[this.A00 - 1].requestFocus();
                }
            }
        }
    }

    public static /* synthetic */ boolean A07(EncryptionKeyFragment encryptionKeyFragment, int i) {
        if (i != 0) {
            return false;
        }
        encryptionKeyFragment.A01.A0N();
        return false;
    }

    public final void A1J(int i) {
        InputMethodManager A0Q = this.A02.A0Q();
        if (A0Q != null) {
            this.A04[i].requestFocus();
            A0Q.toggleSoftInput(1, 1);
        }
    }

    public void A1L(String str) {
        String str2;
        if (str != null) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                int i3 = i2 * 4;
                int length = str.length();
                String substring = str.substring(i * 4, Math.min(i3, length));
                if (this.A04[i].getText() != null) {
                    str2 = this.A04[i].getText().toString();
                } else {
                    str2 = "";
                }
                if (!substring.equals(str2)) {
                    this.A04[i].setText(substring);
                    this.A04[i].setSelection(substring.length());
                }
                if (length >= i3 && i2 < 16) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    public void A1M(boolean z) {
        AnonymousClass0w7 r0;
        int i;
        CodeInputField[] codeInputFieldArr = this.A04;
        if (codeInputFieldArr != null) {
            CodeInputField codeInputField = codeInputFieldArr[codeInputFieldArr.length - 1];
            if (z) {
                r0 = new AnonymousClass0w7(this, 1);
            } else {
                r0 = null;
            }
            codeInputField.setOnEditorActionListener(r0);
            Context A1D = A1D();
            if (A1D != null) {
                if (z) {
                    i = AnonymousClass34K.A02(A1D(), R.attr.f3nameremoved, R.color.f5nameremoved);
                } else {
                    i = R.color.f5nameremoved;
                }
                for (CodeInputField textColor : this.A04) {
                    textColor.setTextColor(AnonymousClass0Y8.A04(A1D, i));
                }
            }
        }
    }

    public static /* synthetic */ void A03(EncryptionKeyFragment encryptionKeyFragment) {
        StringBuilder A0o = AnonymousClass001.A0o();
        int i = 0;
        do {
            Editable text = encryptionKeyFragment.A04[i].getText();
            if (text == null) {
                break;
            }
            A0o.append(text);
            i++;
        } while (i < 16);
        EncBackupViewModel encBackupViewModel = encryptionKeyFragment.A01;
        encBackupViewModel.A02.A0H(A0o.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean A05(int i, KeyEvent keyEvent) {
        int i2;
        if (keyEvent.getAction() != 0 || i != 67 || (i2 = this.A00) <= 0 || this.A04[i2].getText() == null || this.A04[this.A00].getText().length() != 0) {
            return false;
        }
        CodeInputField codeInputField = this.A04[this.A00 - 1];
        Editable text = codeInputField.getText();
        C626936e.A06(text);
        text.delete(codeInputField.length() - 1, codeInputField.length());
        codeInputField.requestFocus();
        return true;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0w(Bundle bundle, View view) {
        super.A0p(bundle);
        this.A01 = (EncBackupViewModel) C08310eF.A0B(this);
        ViewGroup viewGroup = (ViewGroup) C06560Yg.A02(view, R.id.encryption_key_vertical_layout);
        this.A04 = new CodeInputField[16];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(i2);
            int i3 = 0;
            do {
                int i4 = (i2 * 4) + i3;
                this.A04[i4] = viewGroup2.getChildAt(i3);
                this.A04[i4].setLetterSpacing(0.15f);
                if (this.A01.A0E() != 1) {
                    A1K(this.A04[i4], i4);
                }
                i3++;
            } while (i3 < 4);
        }
        String str = (String) this.A01.A02.A07();
        if (str != null) {
            A1L(str);
            i = str.length() / 4;
        }
        if (this.A01.A0E() != 1) {
            A1J(i);
        }
    }
}
