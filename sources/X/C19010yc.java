package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.whatsapp.support.faq.FaqItemActivity;

/* renamed from: X.0yc  reason: invalid class name and case insensitive filesystem */
public class C19010yc extends ClickableSpan {
    public final /* synthetic */ FaqItemActivity A00;
    public final /* synthetic */ Runnable A01;

    public C19010yc(FaqItemActivity faqItemActivity, Runnable runnable) {
        this.A00 = faqItemActivity;
        this.A01 = runnable;
    }

    public void onClick(View view) {
        this.A01.run();
    }
}
