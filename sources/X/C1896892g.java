package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextWatcher;
import android.widget.Button;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.biz.cart.view.fragment.PromotionApplicationFragment;
import java.util.ArrayList;
import org.npci.upi.security.pinactivitycomponent.w;
import org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText;

/* renamed from: X.92g  reason: invalid class name and case insensitive filesystem */
public class C1896892g implements NoCopySpan, TextWatcher {
    public Object A00;
    public final int A01;

    public C1896892g(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void afterTextChanged(Editable editable) {
        String substring;
        Button button;
        Resources resources;
        int i;
        switch (this.A01) {
            case 0:
                TextInputLayout textInputLayout = (TextInputLayout) this.A00;
                textInputLayout.A0H(!textInputLayout.A10, false);
                if (textInputLayout.A0r) {
                    textInputLayout.A0D(editable);
                }
                if (textInputLayout.A0z) {
                    textInputLayout.A0E(editable);
                    return;
                }
                return;
            case 1:
                TextInputLayout textInputLayout2 = ((PromotionApplicationFragment) this.A00).A00;
                if (textInputLayout2 != null) {
                    textInputLayout2.setError((CharSequence) null);
                    return;
                }
                return;
            case 2:
                ((AnonymousClass4GQ) this.A00).invoke(editable);
                return;
            default:
                C125126Fq r3 = (C125126Fq) this.A00;
                r3.A02 = editable.length();
                if (r3.A0I) {
                    if (editable.length() != 0) {
                        button = r3.A04;
                        button.setEnabled(true);
                        resources = r3.getResources();
                        i = R.color.f5nameremoved;
                    }
                    substring = editable.toString();
                    r3.A0E = substring;
                    return;
                }
                boolean z = r3.A0J;
                int length = editable.length();
                if (z) {
                    boolean z2 = r3.A0O;
                    if (length == 0) {
                        if (z2) {
                            r3.A04.setCompoundDrawablesWithIntrinsicBounds(r3.getResources().getDrawable(R.drawable.ic_visibility_off_blue_24px), (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                        button = r3.A04;
                        button.setEnabled(false);
                        resources = r3.getResources();
                        i = R.color.f5nameremoved;
                    } else {
                        if (z2) {
                            r3.A04.setCompoundDrawablesWithIntrinsicBounds(r3.getResources().getDrawable(R.drawable.ic_visibility_off), (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                        Button button2 = r3.A04;
                        C18320x8.A11(r3.getResources(), button2, R.color.f5nameremoved);
                        button2.setEnabled(true);
                        substring = editable.toString();
                        r3.A0E = substring;
                        return;
                    }
                } else {
                    boolean z3 = r3.A0O;
                    if (length == 0) {
                        if (z3) {
                            r3.A04.setCompoundDrawablesWithIntrinsicBounds(r3.getResources().getDrawable(R.drawable.ic_visibility_blue_24px), (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                        Button button3 = r3.A04;
                        button3.setEnabled(false);
                        C18320x8.A11(r3.getResources(), button3, R.color.f5nameremoved);
                        r3.A0E = "";
                        return;
                    }
                    if (z3) {
                        r3.A04.setCompoundDrawablesWithIntrinsicBounds(r3.getResources().getDrawable(R.drawable.ic_visibility_on), (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                    Button button4 = r3.A04;
                    C18320x8.A11(r3.getResources(), button4, R.color.f5nameremoved);
                    button4.setEnabled(true);
                    if (r3.A0E.length() > editable.length()) {
                        String str = r3.A0E;
                        substring = str.substring(0, str.length() - 1);
                        r3.A0E = substring;
                        return;
                    }
                    char charAt = editable.toString().charAt(editable.length() - 1);
                    if (charAt != 9679) {
                        String concat = r3.A0E.concat(AnonymousClass001.A0j(AnonymousClass000.A0l(""), charAt));
                        r3.A0E = concat;
                        r3.A0G.setText(concat.replaceAll(".", "●"));
                        return;
                    }
                    r3.A0G.setSelection(editable.length());
                    return;
                }
                C18320x8.A11(resources, button, i);
                substring = editable.toString();
                r3.A0E = substring;
                return;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        if (3 - this.A01 == 0) {
            if (charSequence.length() > 0) {
                C125126Fq r2 = (C125126Fq) this.A00;
                if (!r2.A0F.equals("CARDDETAILS")) {
                    r2.A04.setVisibility(0);
                }
            }
            C125126Fq r22 = (C125126Fq) this.A00;
            if (r22.A0H != null) {
                FormItemEditText formItemEditText = r22.A0G;
                if (formItemEditText.getText() != null && C86624Kv.A03(formItemEditText) >= r22.A00) {
                    C180068kR r4 = r22.A0H;
                    int i5 = r22.A01;
                    formItemEditText.getText().toString();
                    w wVar = (w) r4;
                    int i6 = wVar.A00;
                    if ((i6 != -1 && i6 == i5) || wVar.A0A) {
                        ArrayList arrayList = wVar.A06;
                        if (wVar.A0A) {
                            i6--;
                        }
                        if (AnonymousClass001.A0S(arrayList, i6).isShown()) {
                            boolean z = wVar.A0A;
                            i4 = wVar.A00;
                            if (z) {
                                i4--;
                            }
                        } else {
                            i4 = wVar.A00;
                        }
                        C125126Fq A0p = AnonymousClass6C9.A0p(arrayList, i4);
                        CountDownTimer countDownTimer = wVar.A03;
                        if (countDownTimer != null) {
                            try {
                                countDownTimer.cancel();
                            } catch (Exception unused) {
                            }
                        }
                        A0p.A01();
                        A0p.A02("", false);
                        Drawable A002 = AnonymousClass0RP.A00(wVar.A0Q(), R.drawable.ic_tick_ok);
                        if (A002 != null) {
                            A0p.A05.setImageDrawable(A002);
                        }
                        A0p.A00(A0p.A05, true);
                        wVar.A0B = Boolean.TRUE;
                    }
                }
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
