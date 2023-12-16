package X;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.settings.SettingsSetupUserProxyActivity;

/* renamed from: X.43I  reason: invalid class name */
public final class AnonymousClass43I extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ SettingsSetupUserProxyActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass43I(SettingsSetupUserProxyActivity settingsSetupUserProxyActivity) {
        super(1);
        this.this$0 = settingsSetupUserProxyActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String valueOf;
        String valueOf2;
        AnonymousClass3Z6 r6 = (AnonymousClass3Z6) obj;
        C18260x0.A1P(AnonymousClass001.A0o(), "SettingsSetupUserProxyActivity/proxyStateLiveData Button state, proxy setting pair: ", r6);
        SettingsSetupUserProxyActivity settingsSetupUserProxyActivity = this.this$0;
        C60962zS r4 = (C60962zS) r6.second;
        TextInputLayout textInputLayout = settingsSetupUserProxyActivity.A01;
        if (textInputLayout == null) {
            throw C18270x1.A0S("proxyInputEditText");
        }
        EditText editText = textInputLayout.A0b;
        if (editText != null) {
            String str = r4.A02;
            if (str == null && (str = r4.A05) == null) {
                str = "";
            }
            Editable text = editText.getText();
            C162457s7.A0D(text);
            if (!C162457s7.A0P(AnonymousClass2AB.A00(text), str) && str.length() > 0) {
                editText.setText("");
                editText.append(str);
            }
        }
        int i = r4.A00;
        if (i == 443) {
            valueOf = settingsSetupUserProxyActivity.getString(R.string.f11nameremoved);
        } else {
            valueOf = String.valueOf(i);
        }
        C162457s7.A0H(valueOf);
        int i2 = r4.A01;
        if (i2 == 587) {
            valueOf2 = settingsSetupUserProxyActivity.getString(R.string.f11nameremoved);
        } else {
            valueOf2 = String.valueOf(i2);
        }
        C162457s7.A0H(valueOf2);
        WaTextView waTextView = settingsSetupUserProxyActivity.A02;
        if (waTextView == null) {
            throw C18270x1.A0S("chatPortTextView");
        }
        waTextView.setText(valueOf);
        WaTextView waTextView2 = settingsSetupUserProxyActivity.A03;
        if (waTextView2 == null) {
            throw C18270x1.A0S("mediaPortTextView");
        }
        waTextView2.setText(valueOf2);
        int A00 = AnonymousClass3Z6.A00(r6);
        if (A00 == 0) {
            View view = this.this$0.A00;
            if (view == null) {
                throw C18270x1.A0S("saveProxyButton");
            }
            view.setEnabled(true);
            SettingsSetupUserProxyActivity settingsSetupUserProxyActivity2 = this.this$0;
            View view2 = settingsSetupUserProxyActivity2.A00;
            if (view2 == null) {
                throw C18270x1.A0S("saveProxyButton");
            }
            C634339f.A00(view2, settingsSetupUserProxyActivity2, r6, 47);
        } else if (A00 == 1 || A00 == 2) {
            View view3 = this.this$0.A00;
            if (view3 == null) {
                throw C18270x1.A0S("saveProxyButton");
            }
            view3.setEnabled(false);
        }
        return C59022wD.A00;
    }
}
