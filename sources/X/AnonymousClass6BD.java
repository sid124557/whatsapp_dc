package X;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.search.views.TokenizedSearchInput;

/* renamed from: X.6BD  reason: invalid class name */
public class AnonymousClass6BD implements View.OnKeyListener {
    public Object A00;
    public final int A01;

    public AnonymousClass6BD(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        switch (this.A01) {
            case 0:
                C92324mU r2 = (C92324mU) this.A00;
                if (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0) {
                    return false;
                }
                if (!C86664Kz.A1W(r2.A00) || !C86654Ky.A1T(AnonymousClass0x2.A0F(r2.A02), "input_enter_send")) {
                    if (C86664Kz.A1W(r2.A00)) {
                        return false;
                    }
                    if ((keyEvent.getFlags() & 2) == 2 && C105895Wv.A00(r2)) {
                        return false;
                    }
                }
                if (keyEvent.isCtrlPressed()) {
                    C86624Kv.A1A(r2);
                    return true;
                }
                Runnable runnable = r2.A04;
                if (runnable == null) {
                    return true;
                }
                runnable.run();
                return true;
            case 1:
                C93314oJ r5 = (C93314oJ) this.A00;
                if (i != 23) {
                    return false;
                }
                if (keyEvent.isLongPress()) {
                    r5.A1F();
                    return true;
                }
                AnonymousClass677 r0 = r5.A0m;
                if (r0 == null || !r0.BFW() || keyEvent.getAction() != 1 || keyEvent.getEventTime() - keyEvent.getDownTime() > 500) {
                    return false;
                }
                r5.A1m(r5.getFMessage());
                return true;
            case 2:
                TextView textView = (TextView) this.A00;
                if (i != 67 || keyEvent.getAction() != 0) {
                    return false;
                }
                C86634Kw.A1I(textView);
                return true;
            default:
                TokenizedSearchInput tokenizedSearchInput = (TokenizedSearchInput) this.A00;
                if (tokenizedSearchInput.A0F == null || keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getKeyCode() != 66 && keyEvent.getKeyCode() != 160) || keyEvent.getAction() != 1) {
                    return false;
                }
                tokenizedSearchInput.A0F.A0h(false);
                return true;
        }
    }
}
