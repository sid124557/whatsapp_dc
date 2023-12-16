package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.5UC  reason: invalid class name */
public class AnonymousClass5UC {
    public AnonymousClass4BE A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Context A09;
    public final C620733j A0A;
    public final AnonymousClass1VW A0B;
    public final ArrayList A0C;

    public void A01() {
        ArrayList arrayList = this.A0C;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C86634Kw.A1I((TextView) it.next());
        }
        ((View) arrayList.get(0)).requestFocus();
        ((WaEditText) arrayList.get(0)).A07(false);
    }

    public void A02(LinearLayout linearLayout, AnonymousClass4BE r19, int i) {
        int i2;
        WaEditText waEditText;
        TextView r6;
        this.A00 = r19;
        ArrayList arrayList = this.A0C;
        arrayList.clear();
        LinearLayout linearLayout2 = linearLayout;
        linearLayout2.removeAllViews();
        int i3 = 0;
        while (true) {
            i2 = i;
            if (i3 > i2) {
                break;
            }
            boolean A1U = AnonymousClass000.A1U(i3, i / 2);
            boolean A1U2 = AnonymousClass000.A1U(i3, i2);
            if (A1U) {
                r6 = new WaTextView(this.A09);
                r6.setBackgroundResource(R.drawable.sms_code_input_hyphen);
            } else {
                Context context = this.A09;
                r6 = new C131896eM(new ContextThemeWrapper(context, R.style.f12nameremoved));
                r6.setBackgroundResource(R.drawable.sms_code_input_box);
                r6.setWidth(this.A07);
                r6.setHeight(this.A02);
                r6.setGravity(17);
                r6.getContext();
                r6.setTypeface(C106905aM.A00());
                Resources resources = context.getResources();
                int i4 = this.A04;
                int i5 = R.plurals.f9nameremoved;
                if (i4 == 1) {
                    i5 = R.plurals.f9nameremoved;
                }
                Object[] A0M = AnonymousClass002.A0M();
                AnonymousClass000.A1P(A0M, i2, 0);
                AnonymousClass000.A1P(A0M, arrayList.size() + 1, 1);
                r6.setContentDescription(resources.getQuantityString(i5, i2, A0M));
                if (i4 == 1) {
                    r6.setInputType(ZipDecompressor.UNZIP_BUFFER_SIZE);
                }
                arrayList.add(r6);
            }
            r6.setPadding(0, 0, 0, 0);
            linearLayout2.addView(r6);
            boolean z = true ^ A1U2;
            boolean z2 = !A1U;
            LinearLayout.LayoutParams A0U = AnonymousClass001.A0U(r6);
            if (z) {
                A0U.setMargins(this.A05, 0, this.A06, 0);
            }
            if (z2) {
                A0U.weight = this.A01;
            }
            A0U.gravity = 17;
            r6.setLayoutParams(A0U);
            i3++;
        }
        if (arrayList.isEmpty()) {
            Log.i("CodeInputBoxManager/init/empty codeInputBoxes");
            return;
        }
        if (C102805Ki.A00(this.A0A)) {
            Collections.reverse(arrayList);
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            WaEditText waEditText2 = null;
            if (i6 == 0) {
                waEditText = null;
            } else {
                waEditText = (WaEditText) arrayList.get(i6 - 1);
            }
            WaEditText waEditText3 = (WaEditText) arrayList.get(i6);
            if (i6 != C86664Kz.A0M(arrayList)) {
                waEditText2 = (WaEditText) arrayList.get(i6 + 1);
            }
            waEditText3.addTextChangedListener(new C109175eC(waEditText, waEditText3, waEditText2, this.A00, this, arrayList, i6, i2, this.A04));
            waEditText3.setOnKeyListener(new AnonymousClass6BD(waEditText3, 2));
        }
        ((View) arrayList.get(0)).requestFocus();
        ((WaEditText) arrayList.get(0)).A07(false);
    }

    public void A03(boolean z) {
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            C86654Ky.A0H(it).setEnabled(z);
        }
    }

    public boolean A04() {
        return AnonymousClass000.A1S(this.A0B.A0X(1715) ? 1 : 0);
    }

    public AnonymousClass5UC(Context context, C620733j r5, AnonymousClass1VW r6, C385928h r7) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int i = 0;
        this.A09 = context;
        this.A0A = r5;
        this.A0B = r6;
        if (r7 != null) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        }
        this.A08 = dimensionPixelSize;
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        if (r7 != null) {
            dimensionPixelSize2 = 0;
        } else {
            dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        }
        this.A07 = dimensionPixelSize2;
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        if (C620733j.A04(r5)) {
            this.A06 = dimensionPixelSize3;
        } else {
            this.A05 = dimensionPixelSize3;
        }
        this.A01 = r7 != null ? 1.0f : 0.0f;
        this.A04 = r7 != null ? 1 : i;
        this.A0C = AnonymousClass001.A0s();
    }

    public String A00() {
        StringBuilder A0o = AnonymousClass001.A0o();
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            EditText editText = (EditText) it.next();
            if (!C86634Kw.A1X(editText)) {
                AnonymousClass000.A1B(editText.getText(), A0o);
            }
        }
        return A0o.toString();
    }
}
