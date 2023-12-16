package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.AbstractList;
import java.util.ArrayList;
import org.npci.upi.security.pinactivitycomponent.s;

/* renamed from: X.6FX  reason: invalid class name */
public class AnonymousClass6FX extends FrameLayout implements C1230466w {
    public int A00;
    public int A01;
    public Object A02;
    public ArrayList A03;

    public static View A00(AbstractList abstractList, AnonymousClass6FX r5, int i) {
        TextView textView = (TextView) ((View) abstractList.get(i)).findViewById(R.id.form_item_button);
        textView.setEnabled(false);
        textView.setCompoundDrawablesWithIntrinsicBounds(r5.getResources().getDrawable(R.drawable.ic_visibility_blue_24px), (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setText(R.string.f11nameremoved);
        ArrayList arrayList = r5.A03;
        int i2 = r5.A00;
        ((C125126Fq) arrayList.get(i2)).A0J = false;
        return (View) arrayList.get(i2);
    }

    public void Avx(Drawable drawable, View.OnClickListener onClickListener, String str, int i, boolean z, boolean z2) {
        String str2;
        Drawable drawable2;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A03;
            if (i2 < arrayList.size()) {
                boolean equals = AnonymousClass6C9.A0p(arrayList, i2).A0F.equals("CARDDETAILS");
                C125126Fq r7 = (C125126Fq) arrayList.get(i2);
                if (equals) {
                    r7.A0I = true;
                    if (i2 == 0) {
                        r7 = AnonymousClass6C9.A0p(arrayList, i2);
                        str2 = getContext().getString(R.string.f11nameremoved);
                    } else if (i2 == 1) {
                        drawable2 = AnonymousClass0RP.A00(getContext(), R.drawable.ic_edit_icon);
                        AnonymousClass6C9.A0p(this.A03, i2).setTitle(AnonymousClass002.A0F(getContext(), AnonymousClass6C9.A0p(this.A03, 0).getInputValue(), new Object[1], 0, R.string.f11nameremoved));
                        r7 = AnonymousClass6C9.A0p(this.A03, i2);
                        str2 = getContext().getString(R.string.f11nameremoved);
                        r7.Avx(drawable2, onClickListener, str2, 0, z, z2);
                        i2++;
                    } else {
                        i2++;
                    }
                } else {
                    str2 = str;
                }
                drawable2 = drawable;
                r7.Avx(drawable2, onClickListener, str2, 0, z, z2);
                i2++;
            } else {
                return;
            }
        }
    }

    public void setText(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A03;
            if (i < arrayList.size()) {
                AnonymousClass6C9.A0p(arrayList, i).setText(str);
                i++;
            } else {
                return;
            }
        }
    }

    public void A01(ArrayList arrayList, C180068kR r5) {
        this.A03 = arrayList;
        addView(AnonymousClass001.A0S(arrayList, 0));
        AnonymousClass6C9.A0p(this.A03, 0).A0H = r5;
        this.A00 = 0;
        this.A01 = getResources().getDisplayMetrics().widthPixels;
        int i = 1;
        while (true) {
            ArrayList arrayList2 = this.A03;
            if (i < arrayList2.size()) {
                C125126Fq A0p = AnonymousClass6C9.A0p(arrayList2, i);
                A0p.A0H = r5;
                A0p.setX((float) this.A01);
                addView(A0p);
                i++;
            } else {
                return;
            }
        }
    }

    public void Avv(String str) {
        ((s) ((C125126Fq) AnonymousClass0x9.A0t(this.A03)).A0H).A1I(str);
    }

    public boolean Avw() {
        C180068kR r3;
        Context context;
        int i;
        String inputValue = AnonymousClass6C9.A0p(this.A03, this.A00).getInputValue();
        ArrayList arrayList = this.A03;
        int i2 = this.A00;
        if (AnonymousClass6C9.A0p(arrayList, i2).A00 == inputValue.length()) {
            if (i2 == arrayList.size() - 1) {
                AnonymousClass001.A0S(arrayList, i2).requestFocus();
                int i3 = 0;
                while (true) {
                    ArrayList arrayList2 = this.A03;
                    if (i3 >= arrayList2.size()) {
                        break;
                    } else if (AnonymousClass6C9.A0p(arrayList2, 0).A0F.equals("CARDDETAILS")) {
                        AnonymousClass6C9.A0p(arrayList2, this.A00).A0L = true;
                        break;
                    } else if (!AnonymousClass6C9.A0p(arrayList2, i3).getInputValue().equals(inputValue)) {
                        int i4 = 0;
                        while (true) {
                            ArrayList arrayList3 = this.A03;
                            if (i4 >= arrayList3.size()) {
                                break;
                            }
                            AnonymousClass6C9.A0p(arrayList3, i4).setText("");
                            i4++;
                        }
                        int i5 = this.A00;
                        if (i5 != 0) {
                            A00(this.A03, this, i5 - 1).animate().x((float) this.A01);
                            AnonymousClass001.A0S(this.A03, this.A00 - 1).animate().x(0.0f);
                            int i6 = this.A00 - 1;
                            this.A00 = i6;
                            AnonymousClass001.A0S(this.A03, i6).requestFocus();
                        }
                        r3 = AnonymousClass6C9.A0p(this.A03, i3).A0H;
                        context = getContext();
                        i = R.string.f11nameremoved;
                    } else {
                        i3++;
                    }
                }
            } else if (!AnonymousClass6C9.A0p(arrayList, i2).A0K) {
                AnonymousClass6C9.A0p(arrayList, i2).A0L = true;
                int i7 = this.A00;
                ArrayList arrayList4 = this.A03;
                boolean z = false;
                if (i7 < arrayList4.size() - 1) {
                    A00(arrayList4, this, i7 + 1).animate().x((float) (-this.A01));
                    AnonymousClass001.A0S(this.A03, this.A00 + 1).animate().x(0.0f);
                    int i8 = this.A00 + 1;
                    this.A00 = i8;
                    AnonymousClass001.A0S(this.A03, i8).requestFocus();
                    z = true;
                }
                return !z;
            }
            return true;
        }
        boolean equals = AnonymousClass6C9.A0p(arrayList, 0).A0F.equals("CARDDETAILS");
        r3 = AnonymousClass6C9.A0p(arrayList, 0).A0H;
        context = getContext();
        if (equals) {
            i = R.string.f11nameremoved;
            if (i2 == 0) {
                i = R.string.f11nameremoved;
            }
        } else {
            ((s) r3).A1I(context.getString(R.string.f11nameremoved));
            AnonymousClass001.A0S(this.A03, this.A00).requestFocus();
            return false;
        }
        ((s) r3).A1I(context.getString(i));
        return false;
    }

    public void Axb() {
        int i = this.A00;
        if (i != 0) {
            AnonymousClass001.A0S(this.A03, i).animate().x((float) this.A01);
            AnonymousClass001.A0S(this.A03, this.A00 - 1).animate().x(0.0f);
            int i2 = this.A00 - 1;
            this.A00 = i2;
            AnonymousClass001.A0S(this.A03, i2).requestFocus();
        }
    }

    public boolean AyF() {
        return AnonymousClass6C9.A0p(this.A03, this.A00).AyF();
    }

    public boolean B1E() {
        return AnonymousClass6C9.A0p(this.A03, this.A00).B1E();
    }

    public Object getFormDataTag() {
        Object obj = this.A02;
        if (obj == null) {
            return ((C125126Fq) AnonymousClass0x9.A0t(this.A03)).A0C;
        }
        return obj;
    }

    public String getInputValue() {
        StringBuilder A0l;
        String inputValue;
        ArrayList arrayList = this.A03;
        if (!AnonymousClass6C9.A0p(arrayList, 0).A0F.equals("CARDDETAILS")) {
            return AnonymousClass6C9.A0p(arrayList, 0).getInputValue();
        }
        String str = "";
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.A03;
            if (i >= arrayList2.size()) {
                return str;
            }
            if (i != 1 || !AnonymousClass6C9.A0p(arrayList2, 0).A0K) {
                A0l = AnonymousClass000.A0l(str);
                inputValue = AnonymousClass6C9.A0p(arrayList2, i).getInputValue();
            } else {
                A0l = AnonymousClass000.A0l(str);
                inputValue = "0149";
            }
            str = AnonymousClass000.A0X(inputValue, A0l);
            i++;
        }
    }

    public boolean getTextEntered() {
        return AnonymousClass6C9.A0p(this.A03, this.A00).A0L;
    }

    public boolean getToggleCheckBox() {
        return AnonymousClass6C9.A0p(this.A03, this.A00).A0K;
    }

    public void setFormDataTag(Object obj) {
        this.A02 = obj;
    }

    public void setTextEntered(boolean z) {
        AnonymousClass6C9.A0p(this.A03, this.A00).A0L = z;
    }

    public void setToggleCheckBox(boolean z) {
        AnonymousClass6C9.A0p(this.A03, this.A00).A0K = z;
    }

    public int B2E() {
        return getInputValue().length();
    }

    public AnonymousClass6FX(Context context) {
        super(context);
    }
}
