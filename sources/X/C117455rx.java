package X;

import android.graphics.Bitmap;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.5rx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117455rx implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C117015rF A01;
    public final /* synthetic */ AnonymousClass7ID A02;
    public final /* synthetic */ AnonymousClass7IE A03;
    public final /* synthetic */ AnonymousClass4YV A04;
    public final /* synthetic */ C87974Wv A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public final void run() {
        C634539h r4;
        C87974Wv r7 = this.A05;
        AnonymousClass4YV r8 = this.A04;
        AnonymousClass7ID r12 = this.A02;
        AnonymousClass7IE r0 = this.A03;
        Bitmap bitmap = this.A00;
        String str = this.A06;
        boolean z = this.A07;
        C117015rF r6 = this.A01;
        String str2 = r12.A00;
        String str3 = r0.A01;
        int i = r0.A00;
        AnonymousClass4UX r9 = r7.A09;
        if (z || !r9.A09) {
            r4 = new C634539h(r7, r6, 2, z);
        } else {
            r4 = null;
        }
        String str4 = r12.A01;
        r8.A01.setText(str2);
        TextView textView = r8.A02;
        textView.setText(str3);
        if (i != 0) {
            AnonymousClass0x2.A0q(textView.getContext(), textView, i);
        }
        r8.A03.A0K((List) null, str);
        int i2 = 8;
        if (str3 != null) {
            i2 = 0;
        }
        textView.setVisibility(i2);
        r8.A00.setImageBitmap(bitmap);
        if (r4 != null) {
            r8.A0H.setOnClickListener(r4);
        }
        TypedValue A0B = AnonymousClass4L0.A0B();
        View view = r8.A0H;
        C86614Ku.A1C(A0B, view);
        view.setContentDescription(str4);
        if (r8 instanceof C137606oy) {
            C137606oy r82 = (C137606oy) r8;
            ImageView imageView = r82.A00;
            C624134x A002 = C55122pp.A00(r9.A04, r6.A00);
            AnonymousClass08M A012 = AnonymousClass08M.A01();
            r9.A05.A09(imageView, A002, new AnonymousClass5BL(imageView, A012, r9, 1));
            AnonymousClass6C6.A02(r7.A00, A012, r82, 281);
            AnonymousClass54E.A00(imageView, r6, r7, 21);
        }
    }

    public /* synthetic */ C117455rx(Bitmap bitmap, C117015rF r2, AnonymousClass7ID r3, AnonymousClass7IE r4, AnonymousClass4YV r5, C87974Wv r6, String str, boolean z) {
        this.A05 = r6;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = bitmap;
        this.A06 = str;
        this.A07 = z;
        this.A01 = r2;
    }
}
