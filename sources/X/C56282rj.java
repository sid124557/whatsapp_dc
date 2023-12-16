package X;

import android.os.Bundle;
import com.whatsapp.dialogs.PromptDialogFragment;

/* renamed from: X.2rj  reason: invalid class name and case insensitive filesystem */
public class C56282rj {
    public final Bundle A00;

    public void A01() {
        this.A00.putBoolean("is_message_clickable", true);
    }

    public PromptDialogFragment A00() {
        PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
        promptDialogFragment.A0u(this.A00);
        return promptDialogFragment;
    }

    public void A02(CharSequence charSequence) {
        this.A00.putCharSequence("message", charSequence);
    }

    public void A03(String str) {
        this.A00.putString("negative_button", str);
    }

    public void A04(String str) {
        this.A00.putString("neutral_button", str);
    }

    public void A05(String str) {
        this.A00.putString("positive_button", str);
    }

    public void A06(String str) {
        this.A00.putString("title", str);
    }

    public void A07(boolean z) {
        this.A00.putBoolean("cancelable", z);
    }

    public C56282rj(int i) {
        Bundle A08 = AnonymousClass002.A08();
        this.A00 = A08;
        A08.putInt("dialog_id", i);
    }
}
