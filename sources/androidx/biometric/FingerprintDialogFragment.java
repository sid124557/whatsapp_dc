package androidx.biometric;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass043;
import X.AnonymousClass08M;
import X.AnonymousClass08S;
import X.AnonymousClass0MY;
import X.AnonymousClass0Uj;
import X.AnonymousClass0XL;
import X.AnonymousClass0Y8;
import X.C003203q;
import X.C02610Gx;
import X.C06270Wx;
import X.C08310eF;
import X.C10890ig;
import X.C17750wB;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;

public class FingerprintDialogFragment extends DialogFragment {
    public int A00;
    public int A01;
    public ImageView A02;
    public TextView A03;
    public AnonymousClass08S A04;
    public final Handler A05 = AnonymousClass000.A0A();
    public final Runnable A06 = new C10890ig(this);

    public void A0e() {
        this.A0X = true;
        this.A05.removeCallbacksAndMessages((Object) null);
    }

    public void A0f() {
        this.A0X = true;
        AnonymousClass08S r1 = this.A04;
        r1.A01 = 0;
        r1.A0E(1);
        this.A04.A0F(C08310eF.A09(this).getString(R.string.f11nameremoved));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1S(int r6) {
        /*
            r5 = this;
            android.widget.ImageView r0 = r5.A02
            if (r0 == 0) goto L_0x001b
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x001b
            X.08S r0 = r5.A04
            int r4 = r0.A01
            android.content.Context r3 = r5.A1D()
            if (r3 != 0) goto L_0x001c
            java.lang.String r1 = "FingerprintFragment"
            java.lang.String r0 = "Unable to get asset. Context is null."
            android.util.Log.w(r1, r0)
        L_0x001b:
            return
        L_0x001c:
            r2 = 1
            if (r4 == 0) goto L_0x0052
            r0 = 2
            if (r4 != r2) goto L_0x0050
            r1 = 2131231587(0x7f080363, float:1.807926E38)
            if (r6 == r0) goto L_0x002d
            r0 = 3
            if (r6 != r0) goto L_0x001b
        L_0x002a:
            r1 = 2131231588(0x7f080364, float:1.8079261E38)
        L_0x002d:
            android.graphics.drawable.Drawable r1 = X.AnonymousClass0RP.A00(r3, r1)
            if (r1 == 0) goto L_0x001b
            android.widget.ImageView r0 = r5.A02
            r0.setImageDrawable(r1)
            if (r4 == 0) goto L_0x0048
            r0 = 2
            if (r4 != r2) goto L_0x004d
            if (r6 != r0) goto L_0x0048
        L_0x003f:
            boolean r0 = r1 instanceof android.graphics.drawable.AnimatedVectorDrawable
            if (r0 == 0) goto L_0x0048
            android.graphics.drawable.AnimatedVectorDrawable r1 = (android.graphics.drawable.AnimatedVectorDrawable) r1
            r1.start()
        L_0x0048:
            X.08S r0 = r5.A04
            r0.A01 = r6
            return
        L_0x004d:
            if (r6 != r2) goto L_0x0048
            goto L_0x003f
        L_0x0050:
            if (r4 != r0) goto L_0x001b
        L_0x0052:
            if (r6 != r2) goto L_0x001b
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.FingerprintDialogFragment.A1S(int):void");
    }

    public void A0p(Bundle bundle) {
        int i;
        super.A0p(bundle);
        C003203q A0Q = A0Q();
        if (A0Q != null) {
            AnonymousClass08S r0 = (AnonymousClass08S) new AnonymousClass0XL(A0Q).A01(AnonymousClass08S.class);
            this.A04 = r0;
            AnonymousClass08M r1 = r0.A0C;
            if (r1 == null) {
                r1 = AnonymousClass08M.A01();
                r0.A0C = r1;
            }
            C06270Wx.A02(this, r1, 6);
            AnonymousClass08S r02 = this.A04;
            AnonymousClass08M r12 = r02.A0B;
            if (r12 == null) {
                r12 = AnonymousClass08M.A01();
                r02.A0B = r12;
            }
            C06270Wx.A02(this, r12, 7);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            i = A1R(C02610Gx.A00());
        } else {
            Context A1D = A1D();
            i = 0;
            if (A1D != null) {
                i = AnonymousClass0Y8.A04(A1D, R.color.f5nameremoved);
            }
        }
        this.A00 = i;
        this.A01 = A1R(16842808);
    }

    public Dialog A1J(Bundle bundle) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        AnonymousClass0Uj r5 = new AnonymousClass0Uj(A0G());
        AnonymousClass0MY r0 = this.A04.A06;
        if (r0 != null) {
            charSequence = r0.A03;
        } else {
            charSequence = null;
        }
        r5.setTitle(charSequence);
        View inflate = LayoutInflater.from(r5.getContext()).inflate(R.layout.f8nameremoved, (ViewGroup) null);
        TextView A09 = AnonymousClass002.A09(inflate, R.id.fingerprint_subtitle);
        if (A09 != null) {
            AnonymousClass0MY r02 = this.A04.A06;
            if (r02 != null) {
                charSequence3 = r02.A02;
            } else {
                charSequence3 = null;
            }
            if (TextUtils.isEmpty(charSequence3)) {
                A09.setVisibility(8);
            } else {
                A09.setVisibility(0);
                A09.setText(charSequence3);
            }
        }
        TextView A092 = AnonymousClass002.A09(inflate, R.id.fingerprint_description);
        if (A092 != null) {
            if (TextUtils.isEmpty((CharSequence) null)) {
                A092.setVisibility(8);
            } else {
                A092.setVisibility(0);
                A092.setText((CharSequence) null);
            }
        }
        this.A02 = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.A03 = AnonymousClass002.A09(inflate, R.id.fingerprint_error);
        AnonymousClass08S r2 = this.A04;
        if ((r2.A0D() & 32768) != 0) {
            charSequence2 = C08310eF.A09(this).getString(R.string.f11nameremoved);
        } else {
            charSequence2 = r2.A0G;
            if (charSequence2 == null) {
                AnonymousClass0MY r03 = r2.A06;
                if (r03 != null) {
                    charSequence2 = r03.A01;
                    if (charSequence2 == null) {
                        charSequence2 = "";
                    }
                } else {
                    charSequence2 = null;
                }
            }
        }
        r5.A0G(new C17750wB(this, 0), charSequence2);
        r5.setView(inflate);
        AnonymousClass043 create = r5.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    public final int A1R(int i) {
        Context A1D = A1D();
        C003203q A0Q = A0Q();
        if (A1D == null || A0Q == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        A1D.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray obtainStyledAttributes = A0Q.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        AnonymousClass08S r2 = this.A04;
        AnonymousClass08M r1 = r2.A0E;
        if (r1 == null) {
            r1 = AnonymousClass08M.A01();
            r2.A0E = r1;
        }
        AnonymousClass08S.A00(r1, true);
    }
}
