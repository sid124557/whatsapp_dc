package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.chatlock.ChatLockConfirmSecretCodeActivity;
import com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4d8  reason: invalid class name and case insensitive filesystem */
public abstract class C89524d8 extends C89644eZ {
    public TextInputEditText A00;
    public TextInputLayout A01;
    public C105095To A02;
    public WDSButton A03;
    public WDSButton A04;
    public String A05;

    public final TextInputLayout A74() {
        TextInputLayout textInputLayout = this.A01;
        if (textInputLayout != null) {
            return textInputLayout;
        }
        throw C18270x1.A0S("secretCodeInputLayout");
    }

    public final C105095To A75() {
        C105095To r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("passcodeManager");
    }

    public final WDSButton A76() {
        WDSButton wDSButton = this.A03;
        if (wDSButton != null) {
            return wDSButton;
        }
        throw C18270x1.A0S("primaryButton");
    }

    public final String A77() {
        String str = this.A05;
        if (str != null) {
            return str;
        }
        throw C18270x1.A0S("secretCodeString");
    }

    public final void A79(int i) {
        C88694ab A002 = C88694ab.A00(this.A00, i, 0);
        AnonymousClass6FH r4 = A002.A0J;
        ViewGroup.MarginLayoutParams A0O = C86634Kw.A0O(r4);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        A0O.setMargins(dimensionPixelSize, A0O.topMargin, dimensionPixelSize, getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        r4.setLayoutParams(A0O);
        A002.A0E(new C109325eR(A002, 11), R.string.f11nameremoved);
        A002.A05();
    }

    public boolean A7A() {
        Object A77;
        Object obj;
        if (this instanceof ChatLockCreateSecretCodeActivity) {
            A77 = A75().A00(A77());
            obj = C91634kb.A00;
        } else {
            ChatLockConfirmSecretCodeActivity chatLockConfirmSecretCodeActivity = (ChatLockConfirmSecretCodeActivity) this;
            A77 = chatLockConfirmSecretCodeActivity.A77();
            obj = chatLockConfirmSecretCodeActivity.A03;
            if (obj == null) {
                throw C18270x1.A0S("correctSecretCode");
            }
        }
        return C162457s7.A0P(A77, obj);
    }

    public void A78() {
        CharSequence error = A74().getError();
        if (error != null && error.length() > 0 && A7A()) {
            A74().setError((CharSequence) null);
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        WDSButton wDSButton;
        super.onCreate(bundle);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        boolean z = true;
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
        }
        setContentView((int) R.layout.f8nameremoved);
        TextInputLayout textInputLayout = (TextInputLayout) C18290x4.A0N(this, R.id.secret_code_input_layout);
        C162457s7.A0J(textInputLayout, 0);
        this.A01 = textInputLayout;
        A74().setHint((int) R.string.f11nameremoved);
        A74().setEndIconMode(2);
        A74().setEndIconContentDescription((CharSequence) getString(R.string.f11nameremoved));
        A74().setEndIconTintList(C86664Kz.A0V(this, R.color.f5nameremoved));
        A74().setErrorEnabled(true);
        A74().setHelperTextEnabled(true);
        View findViewById = findViewById(R.id.textinput_helper_text);
        if (findViewById != null) {
            findViewById.setAccessibilityLiveRegion(1);
        }
        View findViewById2 = findViewById(R.id.text_input_end_icon);
        if (findViewById2 != null) {
            findViewById2.setImportantForAccessibility(1);
        }
        int[][] iArr = {new int[]{16842910, 16842908}, new int[]{16842910}, new int[0]};
        int A002 = C06400Xn.A00((Resources.Theme) null, getResources(), R.color.f5nameremoved);
        int A003 = C06400Xn.A00((Resources.Theme) null, getResources(), R.color.f5nameremoved);
        int[] iArr2 = new int[3];
        iArr2[0] = A002;
        iArr2[1] = A003;
        ColorStateList A0W = C86664Kz.A0W(iArr2, iArr, A003, 2);
        TextInputLayout A74 = A74();
        A74.setBoxStrokeColorStateList(A0W);
        A74.setHintTextColor(A0W);
        this.A05 = "";
        TextInputEditText textInputEditText = (TextInputEditText) C18290x4.A0N(this, R.id.secret_code_edit_text);
        this.A00 = textInputEditText;
        if (textInputEditText == null) {
            throw C18270x1.A0S("secretCodeEditText");
        }
        AnonymousClass68H.A00(textInputEditText, this, 0);
        boolean z2 = this instanceof ChatLockCreateSecretCodeActivity;
        if (z2) {
            i = 5;
        } else {
            i = 6;
        }
        textInputEditText.setImeOptions(i);
        textInputEditText.setOnEditorActionListener(new AnonymousClass68Y(this, 0));
        WDSButton wDSButton2 = (WDSButton) C18290x4.A0N(this, R.id.chat_lock_primary_button);
        C162457s7.A0J(wDSButton2, 0);
        this.A03 = wDSButton2;
        WDSButton A76 = A76();
        if (A77().length() <= 0) {
            z = false;
        }
        A76.setEnabled(z);
        WDSButton wDSButton3 = (WDSButton) C18290x4.A0N(this, R.id.chat_lock_secondary_button);
        C162457s7.A0J(wDSButton3, 0);
        this.A04 = wDSButton3;
        WDSButton A762 = A76();
        if (z2) {
            A762.setText(R.string.f11nameremoved);
            AnonymousClass0x2.A0z(A76(), this, 6);
            if (z2) {
                ChatLockCreateSecretCodeActivity chatLockCreateSecretCodeActivity = (ChatLockCreateSecretCodeActivity) this;
                if (!chatLockCreateSecretCodeActivity.A75().A03() || chatLockCreateSecretCodeActivity.A00 != 1) {
                    wDSButton = chatLockCreateSecretCodeActivity.A04;
                    if (wDSButton == null) {
                        throw C18270x1.A0S("secondaryButton");
                    }
                    wDSButton.setVisibility(8);
                }
                WDSButton wDSButton4 = chatLockCreateSecretCodeActivity.A04;
                if (wDSButton4 != null) {
                    wDSButton4.setVisibility(0);
                    WDSButton wDSButton5 = chatLockCreateSecretCodeActivity.A04;
                    if (wDSButton5 != null) {
                        wDSButton5.setText(R.string.f11nameremoved);
                        WDSButton wDSButton6 = chatLockCreateSecretCodeActivity.A04;
                        if (wDSButton6 != null) {
                            AnonymousClass0x2.A0z(wDSButton6, chatLockCreateSecretCodeActivity, 7);
                            return;
                        }
                        throw C18270x1.A0S("secondaryButton");
                    }
                    throw C18270x1.A0S("secondaryButton");
                }
                throw C18270x1.A0S("secondaryButton");
            }
        } else {
            A762.setText(R.string.f11nameremoved);
            AnonymousClass0x2.A0z(A76(), this, 5);
        }
        wDSButton = this.A04;
        if (wDSButton == null) {
            throw C18270x1.A0S("secondaryButton");
        }
        wDSButton.setVisibility(8);
    }
}
