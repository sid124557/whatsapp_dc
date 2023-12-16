package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.00Q  reason: invalid class name */
public class AnonymousClass00Q extends Dialog implements C16440tP {
    public C06280Wy A00;
    public final C15820rz A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass00Q(android.content.Context r6, int r7) {
        /*
            r5 = this;
            r0 = r7
            if (r7 != 0) goto L_0x0015
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r6.getTheme()
            r1 = 2130969198(0x7f04026e, float:1.7547071E38)
            r0 = 1
            r2.resolveAttribute(r1, r3, r0)
            int r0 = r3.resourceId
        L_0x0015:
            r5.<init>(r6, r0)
            X.0dK r0 = new X.0dK
            r0.<init>(r5)
            r5.A01 = r0
            X.0Wy r4 = r5.A01()
            if (r7 != 0) goto L_0x0037
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r6.getTheme()
            r1 = 2130969198(0x7f04026e, float:1.7547071E38)
            r0 = 1
            r2.resolveAttribute(r1, r3, r0)
            int r7 = r3.resourceId
        L_0x0037:
            r0 = r4
            X.040 r0 = (X.AnonymousClass040) r0
            r0.A02 = r7
            r0 = 0
            r4.A0D(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass00Q.<init>(android.content.Context, int):void");
    }

    public C06280Wy A01() {
        C06280Wy r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass040 r02 = new AnonymousClass040(getContext(), getWindow(), this, this);
        this.A00 = r02;
        return r02;
    }

    public boolean A02(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A01().A0F(view, layoutParams);
    }

    public void dismiss() {
        super.dismiss();
        A01().A09();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AnonymousClass0K4.A00(keyEvent, getWindow().getDecorView(), this, this.A01);
    }

    public View findViewById(int i) {
        AnonymousClass040 r0 = (AnonymousClass040) A01();
        r0.A0N();
        return r0.A08.findViewById(i);
    }

    public void invalidateOptionsMenu() {
        A01().A08();
    }

    public void onCreate(Bundle bundle) {
        A01().A07();
        super.onCreate(bundle);
        A01().A0D(bundle);
    }

    public void onStop() {
        super.onStop();
        A01().A0A();
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A01().A0G(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        A01().A0I(getContext().getString(i));
    }

    public void Bdh(AnonymousClass0R2 r1) {
    }

    public void Bdi(AnonymousClass0R2 r1) {
    }

    public void setContentView(int i) {
        A01().A0B(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        A01().A0I(charSequence);
    }

    public void setContentView(View view) {
        A01().A0E(view);
    }
}
