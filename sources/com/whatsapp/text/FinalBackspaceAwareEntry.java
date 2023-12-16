package com.whatsapp.text;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass68H;
import X.AnonymousClass7ET;
import X.C86624Kv;
import X.C86634Kw;
import X.C86654Ky;
import X.C89124bb;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.search.SearchViewModel;
import java.util.List;

public class FinalBackspaceAwareEntry extends C89124bb {
    public static final char A04 = "​".charAt(0);
    public TextView.BufferType A00;
    public List A01;
    public boolean A02;
    public boolean A03;

    public final Editable A0A(Editable editable) {
        Editable editable2 = editable;
        if (!A03(editable)) {
            return editable2;
        }
        Editable newEditable = Editable.Factory.getInstance().newEditable(editable);
        newEditable.replace(0, A03(newEditable) ? 1 : 0, "", 0, 0);
        return newEditable;
    }

    public final void A0C(Editable editable) {
        Editable editable2;
        this.A02 = true;
        if (editable != null) {
            editable2 = Editable.Factory.getInstance().newEditable(editable);
            editable2.replace(0, 0, "​", 0, 1);
        } else {
            editable2 = null;
        }
        setText(editable2, this.A00);
        this.A02 = false;
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        SearchViewModel searchViewModel;
        List<AnonymousClass7ET> list = this.A01;
        if (list != null) {
            for (AnonymousClass7ET r2 : list) {
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (searchViewModel = r2.A00.A0F) != null) {
                    searchViewModel.A0h(false);
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public FinalBackspaceAwareEntry(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A04();
        this.A02 = false;
        this.A00 = TextView.BufferType.EDITABLE;
        A0B();
    }

    public static /* synthetic */ void A02(FinalBackspaceAwareEntry finalBackspaceAwareEntry, String str) {
        Editable A0A = finalBackspaceAwareEntry.A0A(finalBackspaceAwareEntry.getText());
        if (str != null && A0A != null && !str.equals(A0A.toString())) {
            finalBackspaceAwareEntry.setTextWithBsPrefix(str);
            C86654Ky.A1D(finalBackspaceAwareEntry, str);
        }
    }

    public static final boolean A03(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence) || charSequence.charAt(0) != A04) {
            return false;
        }
        return true;
    }

    private void setTextWithBsPrefix(String str) {
        setText(AnonymousClass000.A0V("​", str, AnonymousClass001.A0o()));
    }

    public final void A0B() {
        if (!A03(getText())) {
            A0C(getText());
        }
        addTextChangedListener(new AnonymousClass68H(this, 14));
    }

    public int getSelectionEnd() {
        Editable text = getText();
        if (TextUtils.isEmpty(A0A(text))) {
            return A03(text) ? 1 : 0;
        }
        return super.getSelectionEnd();
    }

    public int getSelectionStart() {
        return Math.max(super.getSelectionStart(), A03(getText()) ? 1 : 0);
    }

    public void onSelectionChanged(int i, int i2) {
        int A032;
        int A033;
        super.onSelectionChanged(i, i2);
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        int A034 = A03(getText());
        if (min < A034) {
            int max2 = Math.max(min, A034);
            if (C86634Kw.A1X(this)) {
                A032 = 0;
            } else {
                A032 = C86624Kv.A03(this);
            }
            int A0D = AnonymousClass001.A0D(max2, A032, 0);
            if (C86634Kw.A1X(this)) {
                A033 = 0;
            } else {
                A033 = C86624Kv.A03(this);
            }
            setSelection(A0D, AnonymousClass001.A0D(max, A033, 0));
        }
    }

    public void setSelection(int i) {
        int A032;
        int i2 = i + (A03(getText()) ? 1 : 0);
        if (C86634Kw.A1X(this)) {
            A032 = 0;
        } else {
            A032 = C86624Kv.A03(this);
        }
        super.setSelection(AnonymousClass001.A0D(i2, A032, 0));
    }

    public FinalBackspaceAwareEntry(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A04();
        this.A02 = false;
        this.A00 = TextView.BufferType.EDITABLE;
        A0B();
    }

    public FinalBackspaceAwareEntry(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A04();
    }

    public FinalBackspaceAwareEntry(Context context) {
        super(context);
        A04();
        this.A02 = false;
        this.A00 = TextView.BufferType.EDITABLE;
        A0B();
    }
}
