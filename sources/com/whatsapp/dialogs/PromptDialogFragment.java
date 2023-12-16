package com.whatsapp.dialogs;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass4EE;
import X.C620633i;
import android.content.Context;

public class PromptDialogFragment extends Hilt_PromptDialogFragment {
    public C620633i A00;
    public AnonymousClass4EE A01;

    public void A1G(Context context) {
        super.A1G(context);
        try {
            this.A01 = (AnonymousClass4EE) context;
        } catch (ClassCastException unused) {
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass000.A1B(context, A0o);
            throw new ClassCastException(AnonymousClass000.A0X(" must implement PromptDialogClickListener", A0o));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0083, code lost:
        if (r3.getBoolean("cancelable") != false) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1J(android.os.Bundle r7) {
        /*
            r6 = this;
            android.os.Bundle r3 = r6.A0H()
            java.lang.String r1 = "dialog_id"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x00aa
            int r5 = r3.getInt(r1)
            X.0zH r4 = X.C18300x5.A0L(r6)
            java.lang.String r1 = "title"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = r3.getString(r1)
            r4.setTitle(r0)
        L_0x0024:
            java.lang.String r1 = "message"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0033
            java.lang.CharSequence r0 = r3.getCharSequence(r1)
            r4.A0Q(r0)
        L_0x0033:
            java.lang.String r1 = "neutral_button"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0049
            java.lang.String r2 = r3.getString(r1)
            r1 = 6
            X.4I4 r0 = new X.4I4
            r0.<init>(r6, r5, r1)
            r4.A0H(r0, r2)
        L_0x0049:
            java.lang.String r1 = "positive_button"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x005f
            java.lang.String r2 = r3.getString(r1)
            r1 = 7
            X.4I4 r0 = new X.4I4
            r0.<init>(r6, r5, r1)
            r4.A0I(r0, r2)
        L_0x005f:
            java.lang.String r1 = "negative_button"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0076
            java.lang.String r2 = r3.getString(r1)
            r1 = 8
            X.4I4 r0 = new X.4I4
            r0.<init>(r6, r5, r1)
            r4.A0G(r0, r2)
        L_0x0076:
            java.lang.String r1 = "cancelable"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0085
            boolean r1 = r3.getBoolean(r1)
            r0 = 0
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r0 = 1
        L_0x0086:
            r4.A0R(r0)
            r6.A1P(r0)
            X.043 r2 = r4.create()
            r2.setCanceledOnTouchOutside(r0)
            java.lang.String r1 = "is_message_clickable"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x00a9
            boolean r0 = r3.getBoolean(r1)
            if (r0 == 0) goto L_0x00a9
            X.37E r0 = new X.37E
            r0.<init>(r2, r6)
            r2.setOnShowListener(r0)
        L_0x00a9:
            return r2
        L_0x00aa:
            java.lang.String r0 = "dialog_id should be provided."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dialogs.PromptDialogFragment.A1J(android.os.Bundle):android.app.Dialog");
    }
}
