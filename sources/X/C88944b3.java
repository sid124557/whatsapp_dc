package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: X.4b3  reason: invalid class name and case insensitive filesystem */
public class C88944b3 extends C86994Mr {
    public int A00;
    public int A01;
    public C181588n0 A02;
    public Runnable A03;
    public boolean A04;
    public boolean A05;
    public final C184988ss A06;
    public final C69263Wi A07;
    public final C620633i A08;
    public final C624134x A09;
    public final String A0A;

    public C88944b3(Context context, C184988ss r9, C69263Wi r10, C620633i r11, String str) {
        this(context, r9, r10, r11, (C624134x) null, str);
    }

    public void BeF(MotionEvent motionEvent, View view) {
        View view2 = view;
        super.BeF(motionEvent, view);
        if (this.A04) {
            Uri parse = Uri.parse(this.A0A);
            String scheme = parse.getScheme();
            if ("http".equals(scheme) || "https".equals(scheme) || "rtsp".equals(scheme) || "ftp".equals(scheme) || "tel".equals(scheme) || "wapay".equals(scheme) || "upi".equals(scheme)) {
                Runnable runnable = this.A03;
                if (runnable == null) {
                    runnable = new C71603cN(this, parse, view2, scheme, 1);
                    this.A03 = runnable;
                }
                this.A07.A0T(runnable, (long) ViewConfiguration.getLongPressTimeout());
                return;
            }
            return;
        }
        Runnable runnable2 = this.A03;
        if (runnable2 != null) {
            this.A07.A0R(runnable2);
        }
    }

    public void A00() {
        if (this instanceof C89274cC) {
            C89274cC r1 = (C89274cC) this;
            r1.A01.A05.A00(Boolean.valueOf(r1.A02.A1J.A02), (Boolean) null, 2);
        }
    }

    public void onClick(View view) {
        int i = this.A00;
        if (i == 1 || i == 2 || i == 3 || i == 6) {
            this.A06.BkY(view.getContext(), Uri.parse(this.A0A), this.A09, this.A01, this.A00);
        } else {
            boolean z = this.A04;
            C184988ss r4 = this.A06;
            Context context = view.getContext();
            Uri parse = Uri.parse(this.A0A);
            C624134x r1 = this.A09;
            if (z) {
                r4.BkX(context, parse, r1, this.A01);
            } else {
                r4.BkW(context, parse, r1);
            }
        }
        C181588n0 r0 = this.A02;
        if (r0 != null) {
            r0.Ayv();
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(this.A05);
    }

    public C88944b3(Context context, C184988ss r3, C69263Wi r4, C620633i r5, C624134x r6, String str) {
        super(context);
        this.A01 = 0;
        this.A00 = 4;
        this.A07 = r4;
        this.A08 = r5;
        this.A06 = r3;
        this.A0A = str;
        this.A09 = r6;
    }

    public C88944b3(Context context, C184988ss r4, C69263Wi r5, C620633i r6, String str, int i) {
        super(context, i);
        this.A01 = 0;
        this.A00 = 4;
        this.A07 = r5;
        this.A08 = r6;
        this.A06 = r4;
        this.A0A = str;
        this.A09 = null;
    }
}
