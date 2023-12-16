package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.5Ts  reason: invalid class name and case insensitive filesystem */
public final class C105135Ts {
    public final C69263Wi A00;
    public final C56972sr A01;
    public final C614930z A02;
    public final AnonymousClass5XC A03;
    public final AnonymousClass5UX A04;
    public final C613330g A05;
    public final C54292oU A06;
    public final AnonymousClass33p A07;
    public final C620733j A08;
    public final C69253Wh A09;
    public final AnonymousClass4FS A0A;

    public final void A02(C15910sA r18, AnonymousClass4GS r19) {
        Bitmap bitmap;
        C15910sA r6 = r18;
        C162457s7.A0J(r6, 0);
        AnonymousClass33p r2 = this.A07;
        if (AnonymousClass0x2.A0F(r2).getBoolean("show_account_switching_toast", false)) {
            C620733j r4 = this.A08;
            C56972sr r5 = this.A01;
            String A0m = C86654Ky.A0m(r4, C86634Kw.A0V(r5));
            Context context = this.A06.A00;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            AnonymousClass1RR A012 = C56972sr.A01(r5);
            if (A012 == null || (bitmap = this.A05.A03(context, A012, -1.0f, dimensionPixelSize, true)) == null) {
                bitmap = this.A04.A02(context, -1.0f, R.drawable.avatar_contact, dimensionPixelSize);
            }
            this.A00.A0S(new C71613cO(r6, r19, this, C86654Ky.A0E(context, bitmap), A0m, 1));
            C18270x1.A0v(r2, "show_account_switching_toast", false);
        }
    }

    public final void A03(AnonymousClass5UY r5) {
        C162457s7.A0J(r5, 0);
        if (r5.A03() == 0) {
            View A002 = AnonymousClass5UY.A00(r5, 8);
            AlphaAnimation A0C = AnonymousClass4L0.A0C(1.0f, 0.0f);
            A0C.setDuration(320);
            A002.startAnimation(A0C);
        }
    }

    public final void A00() {
        AnonymousClass5XC r6 = this.A03;
        AnonymousClass33p r3 = r6.A07;
        int A022 = C18280x3.A02(AnonymousClass0x2.A0F(r3), "add_account_source");
        if (A022 != 0) {
            C94594rb r1 = new C94594rb();
            r1.A01 = Integer.valueOf(A022);
            r1.A00 = C18290x4.A0b();
            C94594rb.A00(r6, r1);
            r6.A01(r1);
            C18260x0.A0L(r3, "add_account_source", 0);
            return;
        }
        int i = r6.A01;
        if (i == 12) {
            C94594rb r12 = new C94594rb();
            r12.A01 = Integer.valueOf(r6.A01);
            r12.A00 = 19;
            C94594rb.A00(r6, r12);
            r6.A01(r12);
        } else if (i != 0) {
            C94594rb r5 = new C94594rb();
            r5.A01 = Integer.valueOf(r6.A01);
            C94594rb.A00(r6, r5);
            if (r6.A04) {
                r5.A00 = AnonymousClass0x7.A0g();
                r5.A04 = Long.valueOf(r6.A02);
                long j = r6.A03;
                if (j != 0) {
                    r5.A02 = C18310x6.A0f(SystemClock.elapsedRealtime(), j);
                }
            } else {
                r5.A00 = Integer.valueOf(r6.A00);
            }
            r6.A01(r5);
        }
    }

    public C105135Ts(C69263Wi r2, C56972sr r3, C614930z r4, AnonymousClass5XC r5, AnonymousClass5UX r6, C613330g r7, C54292oU r8, AnonymousClass33p r9, C620733j r10, C69253Wh r11, AnonymousClass4FS r12) {
        C18260x0.A0f(r2, r3, r8, r12, r6);
        C18260x0.A0g(r10, r4, r11, r9, r5);
        C162457s7.A0J(r7, 11);
        this.A00 = r2;
        this.A01 = r3;
        this.A06 = r8;
        this.A0A = r12;
        this.A04 = r6;
        this.A08 = r10;
        this.A02 = r4;
        this.A09 = r11;
        this.A07 = r9;
        this.A03 = r5;
        this.A05 = r7;
    }

    public final void A01(Context context, TextEmojiLabel textEmojiLabel, int i) {
        boolean A1V = C18320x8.A1V(textEmojiLabel);
        int A022 = C1222663s.A02(AnonymousClass000.A0B(context), (float) i, A1V ? 1 : 0);
        if (C86604Kt.A02(context) == A1V) {
            textEmojiLabel.setPadding(A022, 0, A022, 0);
            return;
        }
        C620733j r2 = this.A08;
        int i2 = 0;
        if (C102805Ki.A00(r2)) {
            i2 = A022;
        }
        if (C102805Ki.A00(r2)) {
            A022 = 0;
        }
        textEmojiLabel.setPadding(i2, 0, A022, 0);
    }
}
