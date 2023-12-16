package X;

import android.content.Intent;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.0yb  reason: invalid class name and case insensitive filesystem */
public class C19000yb extends ClickableSpan {
    public final Intent A00;

    public C19000yb(Intent intent) {
        this.A00 = intent;
    }

    public void onClick(View view) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("activity-intent-span/go intent=");
        Intent intent = this.A00;
        C18260x0.A0o(intent, A0o);
        view.getContext().startActivity(intent);
    }
}
