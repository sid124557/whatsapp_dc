package X;

import android.widget.AutoCompleteTextView;

/* renamed from: X.805  reason: invalid class name */
public final /* synthetic */ class AnonymousClass805 implements C15850s3 {
    public final /* synthetic */ AnonymousClass6ZR A00;

    public final void onTouchExplorationStateChanged(boolean z) {
        AnonymousClass6ZR r1 = this.A00;
        AutoCompleteTextView autoCompleteTextView = r1.A04;
        if (autoCompleteTextView != null && autoCompleteTextView.getInputType() == 0) {
            AnonymousClass0YY.A06(r1.A01, C18280x3.A00(z ? 1 : 0));
        }
    }

    public /* synthetic */ AnonymousClass805(AnonymousClass6ZR r1) {
        this.A00 = r1;
    }
}
