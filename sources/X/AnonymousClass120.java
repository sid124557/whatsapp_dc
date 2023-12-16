package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import java.util.List;

/* renamed from: X.120  reason: invalid class name */
public final class AnonymousClass120 extends AnonymousClass0R6 {
    public int A00 = -1;
    public CharSequence A01 = "";
    public final C620633i A02;
    public final C620733j A03;
    public final AnonymousClass487 A04;
    public final AnonymousClass5Y0 A05;
    public final C60152y5 A06;
    public final List A07;
    public final AnonymousClass4GQ A08;

    public void A0J(C05570Ua r3) {
        C162457s7.A0J(r3, 0);
        if (r3 instanceof C197212h) {
            C197212h r32 = (C197212h) r3;
            C166677z5 r1 = r32.A01;
            if (r1 != null) {
                r32.A03.removeTextChangedListener(r1);
            }
            AnonymousClass52T r12 = r32.A00;
            if (r12 != null) {
                r32.A03.removeTextChangedListener(r12);
            }
            r32.A01 = null;
            r32.A00 = null;
        }
    }

    public void BNf(C05570Ua r15, int i) {
        C162457s7.A0J(r15, 0);
        int i2 = r15.A02;
        boolean z = false;
        int i3 = i;
        if (i2 == 0) {
            AnonymousClass12K r152 = (AnonymousClass12K) r15;
            String str = ((C52202l3) this.A07.get(i3)).A02;
            if (i3 == this.A00) {
                z = true;
            }
            C79933xQ r2 = new C79933xQ(this, i3);
            AppCompatRadioButton appCompatRadioButton = r152.A00;
            appCompatRadioButton.setText(str);
            appCompatRadioButton.setChecked(z);
            C18290x4.A1H(appCompatRadioButton, r2, 8);
        } else if (i2 == 1) {
            C197212h r153 = (C197212h) r15;
            String str2 = ((C52202l3) this.A07.get(i3)).A02;
            boolean A1U = AnonymousClass000.A1U(i3, this.A00);
            CharSequence charSequence = this.A01;
            C79943xR r4 = new C79943xR(this, i3);
            AnonymousClass41C r3 = new AnonymousClass41C(this);
            C162457s7.A0J(charSequence, 2);
            AppCompatRadioButton appCompatRadioButton2 = r153.A02;
            appCompatRadioButton2.setText(str2);
            appCompatRadioButton2.setChecked(A1U);
            C18290x4.A1H(appCompatRadioButton2, r4, 7);
            WaEditText waEditText = r153.A03;
            C166677z5 r0 = r153.A01;
            if (r0 != null) {
                waEditText.removeTextChangedListener(r0);
            }
            r153.A01 = new AnonymousClass4HQ(r3, 0);
            AnonymousClass52T r02 = r153.A00;
            if (r02 != null) {
                waEditText.removeTextChangedListener(r02);
            }
            AnonymousClass5Y0 r9 = r153.A08;
            C620633i r6 = r153.A05;
            C620733j r7 = r153.A06;
            C60152y5 r10 = r153.A09;
            r153.A00 = new AnonymousClass52T(waEditText, r153.A04, r6, r7, r153.A07, r9, r10, 30, 30, false);
            waEditText.setText(charSequence);
            waEditText.addTextChangedListener(r153.A00);
            waEditText.addTextChangedListener(r153.A01);
            if (charSequence.length() > 0) {
                waEditText.requestFocus();
                waEditText.setSelection(waEditText.length());
            }
        }
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        if (i == 0) {
            return new AnonymousClass12K(C18310x6.A0I(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved, false));
        }
        if (i == 1) {
            View A0I = C18310x6.A0I(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved, false);
            AnonymousClass5Y0 r6 = this.A05;
            return new C197212h(A0I, this.A02, this.A03, this.A04, r6, this.A06);
        }
        throw AnonymousClass001.A0e("Unsupported view type");
    }

    public int A0G() {
        return this.A07.size();
    }

    public int getItemViewType(int i) {
        if (!"other".equalsIgnoreCase(((C52202l3) this.A07.get(i)).A01) || this.A00 != i) {
            return 0;
        }
        return 1;
    }

    public AnonymousClass120(C620633i r2, C620733j r3, AnonymousClass487 r4, AnonymousClass5Y0 r5, C60152y5 r6, List list, AnonymousClass4GQ r8) {
        this.A05 = r5;
        this.A02 = r2;
        this.A03 = r3;
        this.A07 = list;
        this.A06 = r6;
        this.A04 = r4;
        this.A08 = r8;
    }
}
