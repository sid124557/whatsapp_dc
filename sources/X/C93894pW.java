package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.4pW  reason: invalid class name and case insensitive filesystem */
public final class C93894pW extends C113155ky {
    public final C116985rC A00;
    public final C111095hX A01;
    public final C56972sr A02;
    public final C64773Ex A03;
    public final C56422rx A04;
    public final C48952fk A05;
    public final C56612sH A06;
    public final C56982ss A07;
    public final C56892sj A08;
    public final AnonymousClass1VX A09;
    public final AnonymousClass3LP A0A;
    public final AnonymousClass5UP A0B;
    public final C69183Wa A0C;
    public final C56072rN A0D;

    public final boolean A01(C113245l7 r7, C624134x r8) {
        C162457s7.A0J(r8, 0);
        r7.A0e();
        r7.A4P.clearFocus();
        r7.A0d();
        C89644eZ A092 = C113245l7.A09(r7);
        C111095hX r3 = this.A01;
        Intent className = C18320x8.A07().setClassName(A092.getPackageName(), "com.whatsapp.conversation.EditMessageActivity");
        C107395bF.A00(className, r8.A1J);
        r3.A0D(A092, className, 905);
        return true;
    }

    public Drawable B8D(Context context, C620733j r3) {
        C162457s7.A0J(context, 0);
        return AnonymousClass0RP.A00(context, R.drawable.ic_action_edit);
    }

    public boolean B7f() {
        return true;
    }

    public int getId() {
        return 9;
    }

    public C93894pW(C116985rC r2, C111095hX r3, C56972sr r4, C64773Ex r5, C56422rx r6, C48952fk r7, C56612sH r8, C56982ss r9, C56892sj r10, AnonymousClass1VX r11, AnonymousClass3LP r12, AnonymousClass5UP r13, C69183Wa r14, C56072rN r15) {
        C18260x0.A0f(r8, r11, r4, r9, r12);
        C18260x0.A0g(r3, r5, r15, r13, r7);
        C18270x1.A15(r14, r6, r10, 12);
        this.A06 = r8;
        this.A09 = r11;
        this.A02 = r4;
        this.A07 = r9;
        this.A0A = r12;
        this.A01 = r3;
        this.A03 = r5;
        this.A0D = r15;
        this.A0B = r13;
        this.A05 = r7;
        this.A00 = r2;
        this.A0C = r14;
        this.A04 = r6;
        this.A08 = r10;
    }

    public String BDk(AnonymousClass66W r3) {
        return C18290x4.A0l(C86604Kt.A07(r3), R.string.f11nameremoved);
    }
}
