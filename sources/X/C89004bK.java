package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import java.text.DateFormat;
import java.util.Date;

/* renamed from: X.4bK  reason: invalid class name and case insensitive filesystem */
public class C89004bK extends AnonymousClass4LB {
    public final /* synthetic */ C111095hX A00;
    public final /* synthetic */ AnonymousClass5XU A01;
    public final /* synthetic */ C50382i5 A02;
    public final /* synthetic */ C53602nM A03;
    public final /* synthetic */ AnonymousClass1VX A04;
    public final /* synthetic */ AnonymousClass4FV A05;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DateFormat dateInstance = DateFormat.getDateInstance(2, C620733j.A02(this.A04));
        Activity activity = this.A01;
        AnonymousClass5XU r12 = this.A01;
        ((TextView) findViewById(R.id.software_too_old)).setText(C107575bX.A00(activity, new Object[]{activity.getString(R.string.f11nameremoved), dateInstance.format(r12.A01())}, R.string.f11nameremoved));
        SpannableString valueOf = SpannableString.valueOf(C107575bX.A00(activity, new Object[]{dateInstance.format(new Date()), activity.getString(R.string.f11nameremoved)}, R.string.f11nameremoved));
        URLSpan[] uRLSpanArr = (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if ("date-settings".equals(uRLSpan.getURL())) {
                    int spanStart = valueOf.getSpanStart(uRLSpan);
                    int spanEnd = valueOf.getSpanEnd(uRLSpan);
                    int spanFlags = valueOf.getSpanFlags(uRLSpan);
                    valueOf.removeSpan(uRLSpan);
                    valueOf.setSpan(new AnonymousClass67S(this, 0), spanStart, spanEnd, spanFlags);
                }
            }
        }
        TextView textView = (TextView) findViewById(R.id.current_date);
        textView.setText(valueOf);
        textView.setMovementMethod(new LinkMovementMethod());
        findViewById(R.id.beta_optout_text).setVisibility(0);
        View findViewById = findViewById(R.id.beta_optout_button);
        findViewById.setVisibility(0);
        C18280x3.A0p(findViewById, this, 18);
        AnonymousClass1VX r10 = this.A04;
        AnonymousClass4FV r11 = this.A05;
        long time = r12.A01().getTime();
        if (r10.A0X(3299)) {
            C94674rj r1 = new C94674rj();
            r1.A02 = AnonymousClass001.A0f();
            r1.A00 = 0;
            r1.A03 = Long.valueOf(time);
            r11.BhA(r1);
        }
        C109585er r8 = new C109585er(this, r10, r11, r12, this.A02, this.A03, 0);
        findViewById(R.id.download).setOnClickListener(r8);
        findViewById(R.id.update_whatsapp).setOnClickListener(r8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89004bK(Activity activity, C111095hX r9, AnonymousClass5XU r10, C50382i5 r11, C53602nM r12, C620633i r13, C56612sH r14, C620733j r15, AnonymousClass1VX r16, AnonymousClass4FV r17) {
        super(activity, r13, r14, r15, R.layout.f8nameremoved);
        this.A01 = r10;
        this.A00 = r9;
        this.A04 = r16;
        this.A05 = r17;
        this.A02 = r11;
        this.A03 = r12;
    }
}
