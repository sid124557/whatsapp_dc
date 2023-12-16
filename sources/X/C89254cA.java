package X;

import android.view.View;
import android.widget.EditText;

/* renamed from: X.4cA  reason: invalid class name and case insensitive filesystem */
public final class C89254cA extends C88944b3 {
    public final /* synthetic */ AnonymousClass677 A00;
    public final /* synthetic */ String A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C89254cA(android.content.Context r7, X.C69263Wi r8, X.C85244Fm r9, X.AnonymousClass677 r10, X.C620633i r11, java.lang.String r12) {
        /*
            r6 = this;
            r0 = r6
            r5 = r12
            r6.A01 = r12
            r6.A00 = r10
            r1 = r7
            r3 = r8
            r2 = r9
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89254cA.<init>(android.content.Context, X.3Wi, X.4Fm, X.677, X.33i, java.lang.String):void");
    }

    public void onClick(View view) {
        AnonymousClass677 r4 = this.A00;
        if (r4 != null) {
            String A0U = C175738Zn.A0U(this.A01, "commands", "", false);
            EditText textEntryField = r4.getTextEntryField();
            if (textEntryField != null) {
                textEntryField.getText().append(A0U);
            }
        }
    }
}
