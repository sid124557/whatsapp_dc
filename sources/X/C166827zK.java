package X;

import android.view.View;
import android.widget.EditText;

/* renamed from: X.7zK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C166827zK implements View.OnFocusChangeListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ AnonymousClass5XZ A01;

    public final void onFocusChange(View view, boolean z) {
        AnonymousClass5XZ r2 = this.A01;
        EditText editText = this.A00;
        C162457s7.A0J(editText, 1);
        r2.A08.A00();
        editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
    }

    public /* synthetic */ C166827zK(EditText editText, AnonymousClass5XZ r2) {
        this.A01 = r2;
        this.A00 = editText;
    }
}
